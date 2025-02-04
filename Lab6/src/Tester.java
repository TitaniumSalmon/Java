public class Tester extends Employee{
    private String position;
    private String department;
    private boolean testCerificated;

    public Tester(String name , boolean cert){
        super(name);
        this.testCerificated = cert;
    }
    public String getPosition(){
        return this.position;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setDepartment(String dept){
        this.department = dept;
    }
    public void displayInfo(){
        System.out.println("Position: "+this.position);
        System.out.println("Name: "+getName());
        System.out.println("Department: "+this.department);
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Bonus: "+calculateBonus()+" Baht");
        System.out.println("Cerificated: "+testCerificated);
    }
    public double calculateBonus(){
        return 1.5*getSalary();
    }
}
