//Raghad almatrodi #437201332 SerNo.1 
//Raghad alnassar #437202065 SerNo.9
//Section No. 41989

import java.util.*;
import static java.lang.Character.*;
public class RestaurantApp {
static Scanner read = new Scanner (System.in);
private static Order[] orders=new Order [200];
public static void main (String[] args){
String customername,time,date;
int totaldishes,num;
for (int i=0; i<orders.length;i++)
orders[i]=new Order();
do {
System.out.println("1.	Add a new customer order.");
System.out.println("2.	Find the information about an order given its code.");
System.out.println("3.	Display all orders.");
System.out.println("4.  Display the total number of orders.");
System.out.println("5.	Exit.");
System.out.println("choose a number");
num=read.nextInt();
if (num<0||num>5)
System.out.println("invalid input please choose a number");
switch (num) {
case 1: 
System.out.println("Enter full name in one line in the format (firstNamelastName)");
read.nextLine();
customername=read.nextLine();
System.out.println("Enter time in the format HH:MM ");
time=read.nextLine();
System.out.println("Enter date in the format DD/MM/YYYY ");
date=read.nextLine();
System.out.println("Enter number of dishes");
totaldishes=read.nextInt();
orders[Order.totalOrders]=new Order(customername,date,time,totaldishes);
orders[Order.totalOrders].addDishes(totaldishes);
System.out.print("Total price is ");
orders[Order.totalOrders].calculateTotalPrice();
boolean orderadded=addOrder(customername,date,time,totaldishes);
if (orderadded)
{Order.totalOrders++;
orders[Order.totalOrders-1].setOrderCode("000"+Order.totalOrders);
System.out.println("The order is added to the system .");
}
else System.out.println("The order is not added to the system .");
break;
case 2:
System.out.println("Enter order code");
String oc=read.next();
int orderCO=findOrder(oc);
if (orderCO>=0){
orders[orderCO].printOrderInfo();}
else System.out.println("order not found");
break;
case 3:
printAll();
break;
case 4:
System.out.println("The total number of orders is "+allOrders());
break;
case 5:
break;}}
while (num!=5);

}
public static boolean addOrder (String customername,String date,String time,int totaldishes){
if (time.length()==5&&time.charAt(2)==':'&&date.length()==10&&date.charAt(2)=='/'&&date.charAt(5)=='/')
{for (int i=0;i<2;i++)
if (isDigit(time.charAt(i)))
continue;
else {System.out.println("Invalid date or time please Try again!");
return false;}
for (int i=3;i<5;i++)
if (isDigit(time.charAt(i)))
continue;
else {System.out.println("invalid date or time please Try again!");
return false;}
for (int i=0;i<2;i++)
if (isDigit(date.charAt(i)))
continue;
else {System.out.println("invalid date or time please Try again!");
return false;}
for (int i=3;i<5;i++)
if (isDigit(date.charAt(i)))
continue;
else {System.out.println("invalid date or time please Try again!");
return false;}
for (int i=6;i<10;i++)
if (isDigit(date.charAt(i)))
continue;
else {System.out.println("invalid date or time please Try again!");
return false;}
return true;}
else 
System.out.println("invalid date or time please Try again!");
return false;
}

public static int findOrder (String orderCode){
for (int i=0;i<Order.totalOrders;i++){
if (orders[i].getOrderCode()!=null&&orders[i].getOrderCode().equals(orderCode))
return i;}
return -1;
}
public static void printAll(){
if (Order.totalOrders>0){
for (int i=0;i<Order.totalOrders;i++)
orders[i].printOrderInfo();}
else System.out.println("no orders");}

public static int allOrders(){
return Order.totalOrders;}
}

