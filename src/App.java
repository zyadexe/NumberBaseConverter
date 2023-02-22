import java.util.Scanner;

public class App extends MainOperations {
    
    //*Main method 
    public static void main(String[] args) throws Exception {
        
        //show the menu choices in terminal
        System.out.println("Welcome to NumberBaseConvertor");
       
        //take input from the user
       Scanner MainInput = new Scanner(System.in);
       
       //SetChoice: will run conversion methods
       SetChoice(MainInput);
        
       //Checker: will check if choice input correct or not
       Checker(MainInput);
        
    }   
}
