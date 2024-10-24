package q1;

public class Worker {
    private String name;
    private double wage;

    public Worker(String name,double wage) {
        this.name =name;
        this.wage = wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
            return name;
        }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
            return wage;
        }
    public String toString()
        {
             return "Worker Name: " + name + ", Wage: " + wage;
    }

    }





