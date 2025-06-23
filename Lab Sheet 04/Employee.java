public class Employee 
{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() 
    {
        this.firstName = "";
        this.lastName = "";
        this.monthlySalary = 0.0;
    }

    public Employee(String firstName) 
    {
        this.firstName = firstName;
        this.lastName = "";
        this.monthlySalary = 0.0;
    }

    public Employee(String firstName, String lastName) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = 0.0;
    }

    public Employee(String firstName, String lastName, double monthlySalary) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public Employee(Employee Emp2)
    {
        this.firstName = Emp2.firstName;
        this.lastName = Emp2.lastName;
        this.monthlySalary = Emp2.monthlySalary;    
    }
}
