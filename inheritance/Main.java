package inheritance;
// class Teacher{
//      String name;
//     int age;
//     String dept;
//     private Double salary;
//     Teacher(){
//         this.name=name;
//         this.age=age;
//         this.dept=dept;
//     }
//     public String changedept(String dept){
//         this.dept=dept;
//         return dept;
//     }
//     public void setter(Double salary){
//         this.salary=salary;
//     }
//     public Double getter(){
//         return salary;
//     }
// }
// class Student{
//     String marks;
//     int cgpa;
//     Student(Teacher t1){
//         this.marks="95%";
//         this.cgpa=9;
//     }
//     public void printinfo(){
//         System.out.println(marks);
//         // System.out.println(name);
//         // System.out.println(age);
//         // System.out.println(dept);
//     }
// }

// class hod extends Teacher{
//     int rollno;
//     void printinfo(){
//         this.name=name;
//         System.out.println(this.name);
//         System.out.println(this.age);
//         System.out.println(this.dept);
//         System.out.println(this.rollno);
        
        
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Teacher t1=new Teacher();
//         t1.name="priya";
//         t1.age=20;
//         t1.dept="cse";
//         Student s1=new Student(t1);
//         hod h1=new hod();
//         h1.printinfo();
        
//         // System.out.println(s1.marks);
//         // System.out.println("final salary is:"+ t1.name);
//         // System.out.println(t1.age);
//         // t1.setter(25000.0);
//         // t1.changedept("electrical");
//         // System.out.println("final salary is:"+ t1.getter());
//         // System.out.println("final salary is:"+ t1.changedept("ece"));
//     }
// }



// class Teacher{
//     String name;
//     int age;
//     String sub;
//     void teach(){
//         System.out.println("she teaches:"+ sub);
//     }
// }
// class Student extends Teacher{
//     int rollno;
    
//     void learns(){
//         System.out.println("maths, science, bio, physics, chemistry and "+ sub);
//     }
//     void printinfo(){
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(sub);

//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Student s1=new Student();
        
//         s1.name="riya";
//         s1.age=20;
//         s1.sub="computer";
//         s1.teach();
//         s1.learns();
//         s1.printinfo();
//     }
// }




// class Employee{
//     String name;
//     int id;
//     float salary;
//     void insertdata(String name, int id, float s){
//         this.name=name;
//         this.id=id;
//         salary=s;
//     }
//     void printinfo(){
//         System.out.println("employee name is :"+ name);
//         System.out.println("employee name is :"+ id);
//         System.out.println("employee name is :"+ salary);
//     }
// }
// class techdev extends Employee{
//     int PcN0;
//     techdev(String name, int id, float salary, int pcno){
//         this.name=name;
//         this.id=id;
//         this.salary=salary;
//         this.PcN0=pcno;
//     }
//     void printinfo(){
//         System.out.println("techdev is"+ name);
//         System.out.println("techdev is"+ id);
//         System.out.println("techdev is"+ salary);
//         System.out.println("techdev is"+ PcN0);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Employee e1=new Employee();
//         e1.insertdata("Riya", 40, 40000);
//         e1.printinfo();
//         techdev t1=new techdev("priya", 50, 60000, 7);
//         t1.printinfo();
//     }
// }


// class Employee {
//     String name;
//     int id;
//     float salary;
//     void insertinfo(String name, int id, float s){
//         this.name=name;
//         this.id=id;
//         salary=s;
//     }
//     void printinfo(){
//         System.out.println(name);
//         System.out.println(id);
//         System.out.println(salary);
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Employee e1=new Employee();
//         Employee e2=new Employee();
//         e1.insertinfo("Riya", 20, 30000);
//         e2.insertinfo("raju", 90, 50000);
//         e1.printinfo();
//         e2.printinfo();     
//     }
// }

// class Account{
//     String name;
//     int accNo;
//     double amount;

//     void insert(String name, int accNo, double A){
//         this.name=name;
//         this.accNo= accNo;
//         this.amount=A;
//     }
//     void deposit(int amt){
//         amount=amount+amt;
//     }
//     void withdraw(int amtt){
//         if(amount>amtt){
//             amount=amount-amtt;
//         }
//         else{
//             System.out.println("Not enough amount!!");
//         }
//     }
//     void checkbalance(){
//         System.out.println(amount);
//     }
//     void display(){
//         System.out.println(name+" "+accNo+" "+ amount);
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Account a1=new Account();
//         a1.insert("Riya", 456, 70000.0);
//         a1.deposit(10000);
//         a1.withdraw(20000);
//         a1.display();
//         a1.checkbalance();
//     }
// }

// class Student{
//     String name;
//     int age;
//     int rollno;
//     String classname;
//     Student(){
//         System.out.println("constructor has been created but no values filled");
//     }
//     void print(){
//         System.out.println(name+""+rollno);
//     }
//     void insertinandprintinfo(String n, int a, int r, String c){
//         name=n;
//         age=a;
//         rollno=r;
//         classname=c;
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(rollno);
//         System.out.println(classname);
//     }
// }
// class Harrryputter extends Student{
//     int magicNo;

//     Harrryputter() {
//         System.out.println("child constructor");
//     }
    
//      void insertinfo(String name, int age, int rollno, int magicNo){
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//         this.magicNo=magicNo;
//         System.out.println(name);
//      }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Harrryputter h1=new Harrryputter();
//         h1.insertinfo("harry", 20, 4560, 1);
        
//         // s1.name="Riya";
//         // s1.age=20;
//         // s1.rollno=5678;h
//         // s1.classname="3rd";
//         s1.insertinandprintinfo("Riya", 20, 5677, "4th");
//         // System.out.println(s1.name);
//     }
// } 

// class Student{
//     String name;
//     int age;
//     int rollno;
//     void printdata(){
//         System.out.println(name);
//     }
//     Student(){
//         System.out.println("s1 constructor");
//     }
//     Student(Student s1){
//         this.name=s1.name;
//         System.out.println("s2 constructor");
//         System.out.println(name);
//     }

// }
// class techpub{
//     int tech;
//     void setvalue(int tech){
//         this.tech=tech;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s1 =new Student();
//         Student s2=new Student(s1);
//         s1.name="ROUYA";
//         s1.age=30;
//         s1.rollno=456;
        
        
//     }
// }



// class Student{
//     String name;
//     int age;
//     int rollno;
//     Student(String name, int age, int rollno){
//         System.out.println("constructor 1");
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
        
//     }
    
//     Student(Student s1){
//         System.out.println("constructor 2");
//         this.name=s1.name;
//         this.age=s1.age;
//         this.rollno=s1.rollno;
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(rollno);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s1=new Student("riya", 20, 78);
//         Student s2= new Student(s1);

//     }
// }

// class Student{
//     String name;
//     int age;
//     int rollno;
//     void setinfo(){
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//     }
// }
// class Person extends Student{
//     String sub;
//     void setinfo(String name, int age, int rollno, String sub){
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//         this.sub=sub;
//         System.out.println(name);
//     }

// }
// public class Main{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         Person p1=new Person();
//         // p1.name="riya";
//         // p1.age=20;
//         // p1.rollno=5;
//         // p1.sub="maths";
//         p1.setinfo("riya", 20, 56, "maths");
//     }
// }

// class Person {
//     String name;
//     int age;

//     Person() {
//         // this.name = p.name;
//         // this.age = p.age;
//     }
// }

// class Student extends Person {
//     int rollno;

//     Student(Person p) {
//         super();   // copying parent part
//         this.rollno =rollno;
//         this.name=p1.name;
//         this.age=p1.age;
//     }
//     void printinfo(){
//         System.out.println(name);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Person p1 = new Person();
//         p1.name = "Riya";
//         p1.age = 20;

//         Student s1 = new Student(p1);   // ✔ allowed
//         s1.printinfo();
//     }
// }


// class Student{
//     String name;
//     int age;
//     int rollno;
//     Student(){
        
//     }
//     void insert(String name, int age, int rollno){
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//     }
//     // Student(Student s1){
//     //     this.name=s1.name;
//     //     this.age=s1.age;
//     //     this.rollno=s1.rollno;
//     // }
//     void printinfo(){
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(rollno);
//     }

// }
// class employee extends Student{
//     int classname;
//     employee(Student s1){
//         super();
//         this.name=s1.name;
//         this.age=s1.age;
//         this.rollno=s1.rollno;
        
//     }
//     void prininfo(){
//         System.out.println(name);
//         System.out.println(classname);

//     }

// }
// public class Main{
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.insert("riya", 20, 67);
//         // s1.name="riya";
//         // s1.age=20;
//         // s1.rollno=67;
//         // Student s2=new Student(s1);
//         // s2.printinfo();
//         employee e1=new employee(s1);
//         e1.classname=5;
//         e1.prininfo();

//     }
// }

// class Student {
//     String name;
//     int age;
//     int rollno;
//     Student(){

//     }
// }
// class Person extends Student{
//     int adhar;
//     Person(String name, int age, int rollno, int adhar){
        
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//         this.adhar=adhar;
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="roya";
//         s1.age=20;
//         s1.rollno=345;
//         Person p1=new Person("lakshya",18, 56, 45670);

//     }
// }

// class Student{
//     String name;
//     int age;
//     int rollno;
//     Student(String name, int age, int rollno){
//         this.name=name;
//         this.age=age;
//         this.rollno=rollno;
//     }
// }
// class person extends Student{
//     person(Student s){
//         super(s.name, s.age, s.rollno);
//         this.name=s.name;
//         this.age=s.age;
//         this.rollno=s.rollno;
//     }
//     void printinfo(){
//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(rollno);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s =new Student("riya", 20, 45);
//         // s.name="riya";
//         // s.age=20;
//         // s.rollno=23;
//         person p=new person(s);
//         p.printinfo();
//     }
// }

// class Animal{
//     void makesound(){
//         System.out.println("animal sounds ....");
//     }
// }
// class Cat extends Animal{
//     void makesound(){
//         System.out.println("cat sound meow");
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Cat c =new Cat();
//         c.makesound();
//     }
// }

// class Vehicle{
//     void drive(){

//     }
// }
// class Car extends Vehicle{
//     void drive(){
//         System.out.println("driving a car");
//     }
// }
// public class Main{
//     public static void main(String args[]){
//         Car c =new Car();
//         Vehicle v =new Vehicle();
//         v.drive();
        
//     }
// }

// class Employee{
//     String name;
//     int age;
//     int salary;
//     void work(){

//     }
//     Employee(int s){
//         this.salary=s;
//     }
//     int getsalary(){
//         return salary;
//     }
// }
// class HR extends Employee{
//     void work(){

//     }
//     HR(int s){
//         super(s);
//         // this.salary=s;
//     }
//     void addemployee(){
//         System.out.println("hey new employee");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Employee e =new Employee(50000);
        
//         HR hr =new HR(40000);
        
//         System.out.println("salary of e is:"+ e.getsalary());
//         e.work();
//         System.out.println("salary of hr is:"+ hr.getsalary());
//         hr.work();
//         hr.addemployee();
//     }
// }
// class bankaccount{
//     int amount;
//     int id;
//     String ownername;

//     public bankaccount(int amt) {
//         this.amount=amt;
//     }
    
//     void deposit(int amt){
//         amount=amount+amt;
//     }
//     void withdraw(int amt){
//         if(amt<amount){
//             amount=amount-amt;
//                         System.out.println(amount);

//         }
//         else{
//             System.out.println("not enough balance");
//         }
//     }
// }
// class savingaccount extends bankaccount{
//     public savingaccount(int amt) {
//         super(amt);
//     }
//     void withdraw(int amt){
//         if(amt<amount){
//             amount=amount-amt;
//                         System.out.println(amount);

//         }
//         else{
//             System.out.println("not enough balance");
//         }
//     }
// }
// class Person{
//     String firstname;
//     String lastname;

//     Person(String fname, String lname) {
//         this.firstname=fname;
//         this.lastname=lname;
//     }
    
//     String getfirstname(){
//         return firstname;
//     }
    
//     String getlastname(){
//         return lastname;
//     }
// }
// class Employee extends Person{
//     String jobtitle;

//     public Employee(String fname, String lname) {
//         super(fname, lname);
        
//     }
    
//     void getemployeeid(){
//         System.out.println("id is 123");
//     }
//     @Override
//     String getlastname(){
//         return lastname;
//     }
// }

// class  shape{
//     int len;
//     int wid;
//     int per;
//     int area;
//     shape(int l, int w){
//         this.len=l;
//         this.wid=w;

//     }
//     int getperimeter(){
//         per =2*(len+wid);
//         return per;
//     }
//     int getarea(){
//         area= len*wid;
//         return area;
//     }
// }
// class circle extends shape{
//     int rad;

//     circle(int r) {
//         super(0, 0);
//         this.rad=r;
//     }
    
//     int getperimeter(){
//         per =(3)*(rad);
//         return per;
//     }
//     int getarea(){
//         area= 3*rad*rad;
//         return area;
//     }
// }
// class Employee{
//     String name;
//     String address;
//     int salary;
//     String jobtitle;
//     Employee(String name, String address, int salary, String jobtitle){
//             this.name=name;
//             this.address=address;
//             this.salary=salary;
//             this.jobtitle=jobtitle;
//         }
//     void calculatingbonus(){
        
//     }
//     void report(){
//         System.out.println("great perfomance report");
//     }
//     void projects(){
//         System.out.println("great prooject management");
//     }
// }
// class Manager extends Employee{

// }
// class Developer extends Employee{

// }
// class Programmer extends Employee{

// }
// public class Main{
//     public static void main(String[] args) {
//         Employee e = new Employee("riya", "sector 21c", 40000, "engineer");


//     }
// }


class Animal{    
    void eat(){System.out.println("eating...");}    
}    
class Dog extends Animal{    
    void eat(){System.out.println("eating bread...");}    
}    
class Cat extends Animal{    
    void eat(){System.out.println("eating rat...");}    
}    
class Lion extends Animal{    
    void eat(){System.out.println("eating meat...");}    
}    
public class Main{    
    public static void main(String[] args){    
        Animal a;    
        a=new Dog();    
        b.eat();    
        a=new Cat();    
        a.eat();    
        a=new Lion();    
        a.eat();    
    }  
}    