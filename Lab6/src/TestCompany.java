public class TestCompany {
    public static void main(String[] args) {
        Tester test = new Tester("Robin",true);
        test.setPosition("Junior Test");
        test.setDepartment("Computer Audit");
        test.setSalary(25000);

        test.displayInfo();
    }
}
