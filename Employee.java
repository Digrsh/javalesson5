package Lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;


    public Employee(String nameForEmployee, String positionForEmployee, String emailForEmployee, String telephoneForEmployee, int salaryForEmployee, int ageForEmployee){
        name = nameForEmployee;
        position = positionForEmployee;
        email = emailForEmployee;
        telephone = telephoneForEmployee;
        salary = salaryForEmployee;
        age = ageForEmployee;
}
public int getAge(){
        return age;
}

public void print() {
        System.out.println("[" + name + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", "
        + age + "]");
}

}


