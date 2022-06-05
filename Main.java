package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivanov Ivan", "CEO", "ivanov@gmail.com", "+79991231212", 100000, 50);
        Employee emp2 = new Employee("Petrov Petr", "Engineer", "petrov@gmail.com", "+79994444412", 80000, 35);
        Employee emp3 = new Employee("Sidorova Maria", "Administator","sidorova@gmail.com", "+79996562311", 50000, 40);
        Employee emp4 = new Employee("Bogdanova Maria", "Cleaner", "bogdanova@gmail.com", "+79123654475", 35000, 60);
        Employee emp5 = new Employee("Gorshkov Dmitriy", "HR", "gorshkov@gmail.com", "+79113214433", 45000, 27);



        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};
        for (int i = 0; i < employees.length; i++) {
            employees[i].print();
        }


      }

}
