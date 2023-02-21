import java.util.Scanner;

public class MainOperations {
    
    //*This method will show the menu
    static void MENU(){
        System.out.println("\n1/Binary\n2/Octal\n3/Decimal\n4/Hexadecimal");
    }
    
    //*This method will show an error message
    static void ERROR(){
        System.out.println("\nERROR! , Please enter a valid number");

    }
    //*This method will check user choices input
    static void Checker(Scanner CheckerInput){
        while ((choice<=0)||(choice>4)) {
            /*If the user enters a number less than or equal to 0 or number that is more than 4
            the app will show an error by ERROR method*/
            ERROR();
            //then , The app will call SetChoice method again 
            SetChoice(CheckerInput);
             }
    }

    //Choice number
    public static int choice;
    
    //*This method will make user choose between choices
    public static void SetChoice(Scanner ChoiceInput){
        System.out.print("\nChoice:");
        choice =ChoiceInput.nextInt();


        if (choice==1) {
            operations.FromBin(ChoiceInput);
        }
        else if (choice ==2) {
            operations.FromOct(ChoiceInput);
        }
        else if (choice ==3) {
            operations.FromDec(ChoiceInput); 
        }
        else if (choice ==4) {
            operations.FromHex(ChoiceInput);
        }
    }
    
    //*This method will ask the user
    static void InputAsk(int ask){
        if (ask == 2) {
        System.out.println("\nEnter binary number:");   
        }
        if (ask == 8) {
        System.out.println("\nEnter octal number:");  
        }
        if (ask == 10) {
        System.out.println("\nEnter Decimal number:");   
        }
        if (ask == 16) {
        System.out.println("\nEnter hexadecimal number:");  
        }
    
    }
    //*Answer : will use Special methods for each Base
    static void Answer(String num , int Base){
        if (Base == 2) {
            operations.ToOct(num, Base);
            operations.ToDec(num, Base);
            operations.ToHex(num, Base);
        }
        if (Base == 8) {
            operations.ToBin(num, Base);
            operations.ToDec(num, Base);
            operations.ToHex(num, Base);
        }
        if (Base == 10) {
            operations.ToBin(num, Base);
            operations.ToOct(num, Base);
            operations.ToHex(num, Base);
        }
        if (Base == 16) {
            operations.ToBin(num, Base);
            operations.ToOct(num, Base);
            operations.ToDec(num, Base);
        }
        
    }
    
    
    static int DECIMAL(String num , int Base){
        //DECIMAL will take number and the base and will convert to decimal
        int DECIMAL = Integer.parseInt(num,Base);
        return DECIMAL;
    }
}
