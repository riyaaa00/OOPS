// class Animal{
//     void sound(){
//         System.out.println("Animal makes a sound");
//     }
// }
// class bird extends Animal{
//     void sound(){
//         System.out.println("Animal makes a chuchu");
//     }
// }
// class cat extends Animal{
//     void sound(){
//         System.out.println("Animal makes a meow meow");
//     }
// }
// class Vehicle{
//      void speedup(){
//         System.out.println("vehicle speed up");
//      }
// }
// class Car extends Vehicle{
//     void speedup(){
//         System.out.println("vehicle speed up 10");
//      }
// }
// class bicycle extends  Vehicle{
//     void speedup(){
//         System.out.println("vehicle speed up 20");
//      }
// }
// public class Mainn {
//     public static void main(String[] args) {
//         Animal myAnimal;
//         myAnimal= new Animal();
//         myAnimal.sound();
//         myAnimal= new bird();
//         myAnimal.sound();
//         myAnimal= new cat();
        

//         myAnimal.sound();
        
//     }
    
// }

// class Animal{
//     void sound(){

//     }
// }
// class Bird extends Animal{
//     void sound(){
//         System.out.println("chirp chirp");
//     }
// }
// class cat extends Animal{
//     void sound(){
//         System.out.println("meow meow");
//     }
//     void loop(){
//         System.out.println("yohoooo");
//     }
// }
// class Vehicle{
//     int speed;
//     void speedup(int sp){
//         speed=sp+10;
        
//     }
//     int getspeed(){
//         return speed;
//     }
// }
// class Car extends Vehicle{
//     void speedup(int sp){
//         super.speedup(sp);
        
//     }
//     int getspeed(){
//         return speed;
//     }
    
// }
// class bicycle extends Vehicle{
//     void speedup(int sp){
//         super.speedup(sp);
        
//     }
//     int getspeed(){
//         return speed;
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Vehicle a=new Vehicle();
//         Car c =new Car();
//         bicycle b =new bicycle();
//         c.speedup(30);
//         System.out.println(c.getspeed());
//     }
// }

// class shape{
//     int area;
//     int calcarea(int unused, int unused2){
//         System.out.println("area calculation function");
//         return 0;
//     }
// }
// class circle extends shape{
//     int calcarea(int radius, int unused2){
//         System.out.println("circle area calculation function");
//         area= 3*radius*radius;
//         return area;
//     }
// }
// class rectangle extends shape{
//     int calcarea(int length, int width){
//         System.out.println("rectangle area calculation function");
//         area= length*width;
//         return area;
//     }
// }
// class traingle extends shape {
//     int calcarea(int length, int height){
//         System.out.println("traingle area calculation function");
//         area= 2*(length+height);
//         return area;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         shape s;
//         s =new shape();
//         System.out.println(s.calcarea(4, 5));
//         s =new circle();
//         System.out.println(s.calcarea(4, 4));
//         s =new rectangle();
//         System.out.println(s.calcarea(9, 8));
//         s =new traingle();
//         System.out.println(s.calcarea(1, 6));
        
//     }
// }
// class employee{
//     String roles;
//     int salary;
//     int calcsalary(String roles, int salary){
//         return salary;
//     }
// }
// class manager extends employee{
//     int calcsalary(String roles, int salary){
//         return salary;
//     }
// }
// class programmer extends employee{
//     int calcsalary(String roles, int salary){
//         return salary;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         employee e =new employee();
//         programmer p=new programmer();
//         manager m =new manager();
//         System.out.println("salalry of empliyee is: "+" "+ e.calcsalary("employee", 20000));
//         System.out.println("salalry of empliyee is: "+" "+ p.calcsalary("programmer", 50000));
//         System.out.println("salalry of empliyee is: "+" "+ m.calcsalary("manager", 60000));

//     }
// }
// class shape{
//     int area;
//     int par;
//     int getarea(int p, int q){
//         return area;
//     }
//     int getpar(int p, int q){
//         return par;
//     }
// }
// class circle extends shape{
    
//     int getarea(int p, int q){
//         area =3*p*p;
//         return area;
//     }
//     int getpar(int p, int q){
//         par =2*3*p;
//         return par;
//     }
// }
// class rectangle extends shape{
    
//     int getarea(int p, int q){
//         area =p*q;
//         return area;
//     }
//     int getpar(int p, int q){
//         par =2*(p+q);
//         return par;
//     }
// }
// class triangle extends shape{
    
//     int getarea(int p, int q){
//         area =(p+q)/2;
//         return area;
//     }
//     int getpar(int p, int q){
//         par =(p+q)*4;
//         return par;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         shape s;
//         s= new circle();
//         System.out.println("shape area: "+ s.getarea(4, 5));
//         System.out.println("shape par:"+ s.getpar(4, 5));
//         s = new rectangle();
//         System.out.println("shape area: "+ s.getarea(1, 2));
//         System.out.println("shape par:"+ s.getpar(1, 2));
        
//         s= new triangle();
//         System.out.println("shape area: "+ s.getarea(6, 1));
//         System.out.println("shape par:"+ s.getpar(6, 1));
        
//     }
    
// }
// abstract class shape{
//     int area;
//     int radius;
//     int p;
//     int q;
//     int z;
//     abstract int getarea();
        
    
//     abstract void draw();
        
    
// }
// class circle extends shape{
    
//     circle(int rad){
//         this.radius =rad;
//     }
//     int getarea(){
//         area =3*radius*radius;
//         return area;
//     }
//     public void draw(){
//         System.out.println("circle drawn");
//     }
// }
// class rectangle extends shape{
//     rectangle(int p, int q){
//         this.p=p;
//         this.q=q;
//     }
//     int getarea(){
//         area =p*q;
//         return area;
//     }
//     void draw(){
//         System.out.println("rectangle drawn");
//     }
// }
// class triangle extends shape{
//     triangle(int p, int q, int z){
//         this.p=p;
//         this.q=q;
//         this.z =z;
//     }
//     int getarea(){
//         area =(p+q+z)/2;
//         return area;
//     }
//     public void draw(){
//         System.out.println("triangle drawn");
//     }
// }

// class shape{
//     int l;
//     int w;
//     shape(int l, int w){
//         this.l=l;
//         this.w=w;
        
//     }
//     void print(){
//         System.out.println(l+" "+w);
//     }
// }
// class circle extends shape{
//     circle(int p, int q){
//         super(p, q);
//     }
//     void print(){
        
//         System.out.println(l+" "+w);

//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         shape s;
        
//         s= new shape(1, 2);
//         s.print();
//         // System.out.println("shape par:"+ s.getpar(4, 5));
//         s = new circle(2, 3);
//         s.print();
        
        
//     }
    
// }

// class bankaccount{
//     int amount;
//     int limit;

//     bankaccount(int amount, int limit) {
//         this.amount=amount;
//         this.limit=limit;
//     }
    
//     void deposit(int enter){
//         amount=amount+enter;
//         System.out.println("now, the amount after deposit is: "+" "+ amount);
//     }
//     void withdraw(int wd){
//         if(wd<limit){
//             amount=amount-wd;
//             System.out.println("amount after withdraw is :"+" "+amount);
//         }
        
//         else{
//             System.out.println("amount asked in beyond or equal to the limit, only withdraw within limit");
//         }
//     }
// }
// class savingsaccount extends bankaccount{
//     savingsaccount(int amount, int limit){
//         super(amount, limit);
        
//     }
//     void withdraw(int wd){
//         if(wd<limit){
//             amount=amount-wd;
//             System.out.println("amount after withdraw is :"+" "+amount);
//         }
        
//         else{
//             System.out.println("amount asked in beyond or equal to the limit, only withdraw within limit");
//         }
//     }
// }
// class checkingaccount extends bankaccount{

//     checkingaccount(int amount, int limit) {
//         super(amount, limit);
//     }
    
//     void withdraw(int wd){
//         if(wd<limit){
//             amount=amount-wd;
//             System.out.println("amount after withdraw is :"+" "+amount);
//         }
        
//         else{
//             System.out.println("amount asked in beyond or equal to the limit, only withdraw within limit");
//         }
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         bankaccount bk ;
//         bk=new bankaccount(50000, 30000);
//         bk.deposit(10000);
//         bk.withdraw(29000);
//         bk= new savingsaccount(60000, 40000) ;
//         // bk.deposit(10000);
//         bk.withdraw(40000);
//         bk= new checkingaccount(20000, 10000);
//         // bk.deposit(10000);
//         bk.withdraw(9000);

//     }
// }

// class shape{
//     void draw(){

//     }
//     void calcarea(){

//     }
// }
// class circle extends shape{
//     @Override
//     void draw(){

//     }
// }
// class cylinder extends shape{
//     @Override
//     void draw(){

//     }
//     void calcarea(){

//     }
// }
// public class Main{
//     public static void main(String[] args) {
        
//     }
// }

// abstract class shape{

// }
// class rectangle extends shape{

// }
// class circle extends shape{

// }
// public class Main{
//     public static void main(String[] args) {
        
//     }
// }

// abstract class Bike{    
//    Bike(){System.out.println("bike is created");}    
//    abstract void run();    
//    void changeGear(){System.out.println("gear changed");}    
// }    
// //Creating a Child class which inherits Abstract class    
// class Honda extends Bike{    
//     Honda(){System.out.println("honda is created");} 
//     void run(){System.out.println("running safely..");}    
// }    
// //Creating a Main class which calls abstract and non-abstract methods    
// public class Main{    
//  public static void main(String args[]){    
//   Bike obj = new Honda();    
//   obj.run();    
//   obj.changeGear();    
//  }    
// }    
// abstract class Vehicle {  
//     abstract void start();  
//     abstract void print();
// }  
  
// // Subclass not implementing abstract method must be abstract  
// abstract class Car extends Vehicle {  
// }  
  
// // Subclass implementing abstract method can be instantiated  
// class Honda extends Vehicle {  
//     void start() {  
//         System.out.println("Honda started");  
//     }  
// }  
  
// public class Main {  
//     public static void main(String[] args) {  
//         Vehicle v = new Honda();  
//         v.start();  // Output: Honda started  
//     }  
// }  

// class counter1{
//     int count=0;
//     counter1(){
//         count++;
//         System.out.println("count now is: "+ count);
//     }
// }
// class counter2{
//     final int count=0;
//     counter2(){
//         // count++;
//         System.out.println("counter2: "+ count);

//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         // counter1 c1 =new counter1();
//         // counter1 c2 =new counter1();
//         // counter1 c3 =new counter1();

//         counter2 f1=new counter2();
//         counter2 f2=new counter2();
//         f2.count=8;
//         counter2 f3=new counter2();
//     }
// }
class student{
    int data=50;    
 void change(int data) {
 this.data=data+100;  //changes will be in the local variable only    
}
}
public class Main {       
 public static void main(String args[]) {    
   student s =new student();  
   System.out.println("before change "+s.data);    
   s.change(500);    
   System.out.println("after change "+s.data);    
 }    
}    