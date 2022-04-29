package com.learn;

class Employee{
    int id ;
    String name;
    float salary;
    void salaryHike(){}
}
class Permanent extends Employee{
    int bonus=10000;
    void salaryHike(){System.out.println("salary hike is"+5000);}}
class PartTime extends Employee{
    float bonus=2000;
    void salaryHike(){System.out.println("no salary hike");}}
class Contract extends Employee{
    int bonus=1000;
    void salaryHike(){System.out.println("salary hike is"+1000);}}
    class Check{
    public static void main(String args[]){
        Permanent pe=new Permanent();
        pe.id=1234;
        pe.name="Aiswarya";
        pe.salary=50000;
        System.out.println("Permanent employee's details:\n"+"id:"+pe.id+"\n"+"name:"+pe.name+"\n"+"Salary:"+pe.salary+"\n"+"Bonus:"+pe.bonus);
        pe.salaryHike();

        PartTime pa=new PartTime();
        pa.id=1235;
        pa.name="Abhaya";
        pa.salary=20000;
        System.out.println("Part time employee's details:\n"+"id:"+pa.id+"\n"+"name:"+pa.name+"\n"+"Salary:"+pa.salary+"\n"+"Bonus:"+pa.bonus);
        pa.salaryHike();

        Contract co=new Contract();
        co.id=1236;
        co.name="Vismaya";
        co.salary=30000;
        System.out.println("Contract employee's details:\n"+"id:"+co.id+"\n"+"name:"+co.name+"\n"+"Salary:"+co.salary+"\n"+"Bonus:"+co.bonus);
        co.salaryHike();
    }
}

