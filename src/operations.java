import java.util.Scanner;

public class operations extends MainOperations{
    

//Input operations


    //*Method convert from binary
    static void FromBin(Scanner BinaryInput){
       
     InputAsk(2);

    try {
        
        String BinNum = BinaryInput.next();
        Answer(BinNum, 2);

    } catch (Exception e) {
        ERROR();
        FromBin(BinaryInput);
       }
    }

    //*method convert from octal
    static void FromOct(Scanner OctalInput){
        InputAsk(8);
    
    try {
        
        String OctNum = OctalInput.next();  
        Answer(OctNum, 8);
    
    } catch (Exception e) {
        ERROR();
        FromOct(OctalInput); 
        }
    }

    //*method convert from decimal
    static void FromDec(Scanner DecimalInput){

        InputAsk(10);

        try {

        
        String DecNum = DecimalInput.next();
        Answer(DecNum, 10);

        } catch (Exception e) {

        ERROR();
            FromDec(DecimalInput);
        }
        
    }

    //*method convert from hexadecimal
    static void FromHex(Scanner HexadecimalInput){
        
        InputAsk(16);
        try {
            String HexNum = HexadecimalInput.next();
            Answer(HexNum, 16);

        } catch (Exception e) {
        ERROR();
        FromHex(HexadecimalInput);  
        }
  
    }





//Output operations


    //?from any base to Binary
    static void ToBin(String Num , int Base){

    //ToBin will convert Decimal number to binary
    String ToBin = Integer.toBinaryString(DECIMAL(Num, Base));
    //sout will print Binary number
    System.out.println("\nBinary: "+ToBin);
    }


    //?from any base to octal 
    static void ToOct(String Num , int Base){
    
    //ToOct will convert Decimal number to octal
    String ToOct = Integer.toOctalString(DECIMAL(Num, Base));
    //sout will print Octal number
    System.out.println("\nOctal: "+ToOct);
    }

    //?from any base to decimal
    static void ToDec(String Num , int Base){
    int ToDec = DECIMAL(Num, Base);
    //sout will print decimal number
    System.out.println("\nDecimal: "+ToDec);
    }

    //?from any base to hexadecimal
    static void ToHex(String Num , int Base){

    //ToHex will convert decimal numbers to hexadecimal
    String ToHex = Integer.toHexString(DECIMAL(Num, Base));
    //sout will print hexadecimal number
    System.out.println("\nHexadecimal: "+ToHex);
    }


}
