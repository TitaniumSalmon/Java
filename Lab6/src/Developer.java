
public class Developer extends Employee {
    private String position;
    private String department;

    public Developer(String name){
        super(name);
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
        this.department = department;
    }
    public double calculateBonus(){
        return 2*getSalary();
    }
}