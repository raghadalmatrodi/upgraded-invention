//Raghad almatrodi #437201332 SerNo.1 
//Raghad alnassar #437202065 SerNo.9
//Section No. 41989

import java.util.*;
public class Order {
static Scanner read=new Scanner (System.in);
private String customerName;
private String time;
private String date;
private int totalDishes;
private String[] dishes;
private double totalPrice;
private String orderCode;
public static int totalOrders=0;
public Order() {
customerName="";
time="";
date="";
totalDishes=0;
totalPrice=0;
orderCode="";
dishes=new String[getTotalDishes()];
for (int i=0;i<dishes.length;i++)
dishes[i]="";}
public Order (String cust,String d,String t,int tDishes){
customerName=cust;
date=d;
time=t;
totalDishes=tDishes;
dishes=new String[tDishes];
orderCode="000"+totalOrders;}
public void addDishes(int TotalNumOfDishes){
int i=0;
do {
System.out.println("please choose from the menue");
System.out.println("Dish# 1: Ceasar Salad =32 SR.");
System.out.println("Dish# 2: French Fries=10 SR.");
System.out.println("Dish# 3: Pizza=45  SR.");
System.out.println("Dish# 4: Pasta=50  SR.");
System.out.println("Dish# 5: Rice =25  SR.");
System.out.println("Dish# 6: Grilled Chicken= 49  SR.");
System.out.println("Dish# 7: Fried Shrimp=95  SR.");
System.out.println("Dish# 8: Grilled Fish=89  SR.");
int num=read.nextInt();
if (num>0&&num<9){
switch (num){
case 1: dishes[i]=": Ceasar Salad=32SR.";
break;
case 2: dishes[i]=": French Fries=10SR";
break;
case 3: dishes[i]=": Pizza=45SR";
break;
case 4: dishes[i]=": Pasta=50SR";
break;
case 5: dishes[i]=": Rice=25SR";
break;
case 6: dishes[i]=": Grilled Chicken=49SR";
break;
case 7: dishes[i]=": Fried Shrimp=95SR";
break;
case 8: dishes[i]=": Grilled Fish=89SR";
break;
default: dishes[i]=" ";}
i++;}
else System.out.println("Invalid Input Please select from the menue");
}
while (i<TotalNumOfDishes);
}
public void setCustomerName(String name){customerName=name;}
public void setDate(String d){date=d;}
public void setTime(String t){time=t;}
public void setDishes(String[] Sdishes){dishes=Sdishes;}
public void setOrderCode(String code){orderCode=code;}
public void setTotalDishes(int total){totalDishes=total;}
public String getCustomerName(){return customerName;}
public String getDate(){return date;}
public String getTime(){return time;}
public String[] getDishes(){return dishes;}
public String getOrderCode(){return orderCode;}
public int getTotalDishes(){return totalDishes;}

public void calculateTotalPrice(){
for (int i=0; i<dishes.length;i++){
int pos1=dishes[i].indexOf('=');
int pos2=dishes[i].indexOf('S',pos1);
double price=Double.parseDouble(dishes[i].substring(pos1+1,pos2));
totalPrice+=price;}
if (totalDishes>3)
totalPrice=totalPrice-(totalPrice*0.10);
System.out.println(totalPrice + " SR");
}

public void printOrderInfo(){
for (int i=0;i<customerName.length();i++){
char ch=' ';
if (customerName.charAt(i)==' '){
ch=Character.toUpperCase(customerName.charAt(i+1));
customerName=customerName.substring(0,i)+ch+customerName.substring(i+2);}}
System.out.println("Customer Name: "+customerName);
System.out.println("Date: "+date+"\t Time: "+time);
System.out.println("Dishes: ");
for (int i=0;i<getTotalDishes();i++){
System.out.println("Dish# "+(i+1)+" "+dishes[i]);}
System.out.println("Total number of Dishes: "+totalDishes);
System.out.println("Total Price: "+totalPrice);
System.out.println("Order Code: "+orderCode);
System.out.println("");}
}


