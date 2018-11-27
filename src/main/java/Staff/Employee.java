package Staff;

public abstract class Employee {

 private String name;
 private String NInumber;
 private double salary;

 public Employee(String name, String NInumber, double salary){

     this.name = name;
     this.NInumber = NInumber;
     this.salary = salary;
 }

 public String getName(){
     return this.name;
 }


    public String getNInumber(){
        return this.NInumber;
    }


    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double salaryIncrease){
     this.salary = this.salary + salaryIncrease;
    }

public void giveBonus(double calc){
     double bonus = this.salary/calc;
     raiseSalary(bonus);
}



}
