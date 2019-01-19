import java.util.*;
public class date
{
public static void main(String[]args)
{
Scanner read=new Scanner (System.in);
System.out.println("Please enter three integers representing a date as: day month year");
String date=read.nextLine();

int seperator1=date.indexOf(' ');
int seperator2=date.indexOf(' ',seperator1+1);
int dayf,monthf,yearf;
String day=date.substring(0,seperator1);
String month=date.substring(seperator1+1,seperator2);
String year=date.substring(seperator2+1);
if (Integer.parseInt(day.substring(0,1))==0)
dayf=Integer.parseInt(day.substring(1));
else dayf=Integer.parseInt(day);
if (Integer.parseInt(month.substring(0,1))==0)
monthf=Integer.parseInt(month.substring(1));
else monthf=Integer.parseInt(month);
yearf=Integer.parseInt(year);
if (monthf<1||monthf>12)
System.out.println("The month is invalid");
{switch (monthf)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
if (dayf<31)
System.out.printf("Date following: %s:%d:%s is %d:%d:%d",day,monthf,year,(dayf+1),monthf,yearf);
else 
if (dayf==31&&monthf !=12)
System.out.printf("Date following: %s:%d:%s is 1:%d:%d",day,monthf,year,(monthf+1),yearf);
else 
if(dayf==31&&monthf ==12)
System.out.printf("Date following: %s:%d:%s is 1:1:%d",day,monthf,year,yearf+1);
break;
default:}

switch (monthf){
case 4:
case 6:
case 9:
case 11:
if (dayf<30)
{
System.out.printf("Date following: %s:%d:%s is %d:%d:%d",day,monthf,year,(dayf+1),monthf,yearf);}
else 
if (dayf==30)
{
System.out.printf("Date following: %s:%d:%s is 1:%d:%d",day,monthf,year,(monthf+1),yearf);}
break;
default:}
if (monthf==2)
{if (yearf%4==0&&yearf%100!=0||yearf%400==0)
{if (dayf<29)
{
System.out.printf("Date following: %s:%d:%s is %d:%d:%d",day,monthf,year,(dayf+1),monthf,yearf);}
else 
if (dayf==29)
{System.out.printf("Date following: %s:%d:%s is 1:%d:%d",day,monthf,year,(monthf+1),yearf);}
}
else 
if (!(yearf%4==0&&yearf%100!=0||yearf%400==0))
if (dayf<28)
System.out.printf("Date following: %s:%d:%s is %d:%d:%d",day,monthf,year,(dayf+1),monthf,yearf);
else 
if (dayf==28)
System.out.printf("Date following: %s:%d:%s is 1:%d:%d",day,monthf,year,(monthf+1),yearf);}}

}}