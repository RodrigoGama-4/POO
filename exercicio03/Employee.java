package exercicio03;

public class Employee {
    String name;
    double grossSalary, tax, increaseSalary;
    

    public void Nome(String n) {
        this.name = n;
    }

    public void SalBt(double s) {
        this.grossSalary = s;
    }

    public void Tax(double t) {
        this.tax = t;
    }

    public void IncreaseSalary(double p) {
        this.increaseSalary =(this.grossSalary*(p/100));
    }
     
    public String toString() {
        double a = (this.grossSalary - this.tax)+this.increaseSalary;
        return "Nome: "+this.name+"\nSalário: "+a;
    }

}
