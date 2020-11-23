package staff;

public abstract class Employee {
    private String name;
    private String nINumber;
    private double salary;




    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        if(name ==""){
            return this.name;
        }else
         return this.name = name;
    }

    public String getNINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(Double raise) {
        if(raise < 0){
            return this.salary;
        } else{
        return this.salary += raise;}
    };

    public double payBonus(){
        return this.salary/100;

    };

}
