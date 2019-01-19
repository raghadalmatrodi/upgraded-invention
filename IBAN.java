//This is my program to print the International Bank Account Number IBAN information in Saudi Arabia
//input statement 
import java.util.*;
public class IBAN
{
static Scanner read= new Scanner (System.in);
public static void main (String [] args)
{
//declaration section:to declare needed variables
//variables declaration
String iban,isoCode,checkDigits,bankId,accountNum;
//iban for International Bank Account Number, isoCode for ISO Country Code, checkDigit for IBAN Check Digits, bankId for Bank Identifier, accountNum for Account Number
System.out.println("Enter your IBAN such that every four digits separated by one space:");//prompts the user to enter the IBAN string in special formats
iban= read.nextLine();//input statement
isoCode=iban.substring(0,2);//string method:Extraction
isoCode=isoCode.toUpperCase();//string method:manipulation
checkDigits=iban.substring(2,4);//string method:Extraction
bankId=iban.substring(5,7);//string method:Extraction
accountNum=iban.substring(7);//string method:Extraction
//output statement:printf with 10 columns width and right justified
System.out.printf("IBAN: %10s%n",iban);
System.out.printf("ISO Country Code:  %10s (Saudi Arabia)%n",isoCode);
System.out.printf("IBAN Check Digits: %10s%n",checkDigits);
System.out.printf("Bank Identifier: %10s%n",bankId);
System.out.printf("Account Number: %10s%n",accountNum);
}//end main
}//end class