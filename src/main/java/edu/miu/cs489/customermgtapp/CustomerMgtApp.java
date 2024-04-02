package edu.miu.cs489.customermgtapp;

import edu.miu.cs489.customermgtapp.model.Employee;

import java.util.Comparator;
import java.util.List;

public class CustomerMgtApp {

    public void printAllEmployeeWithPensionPlan(List<Employee> employees) {
        System.out.println("Printed All Employee With Pension Plan");
        employees.stream()
                .filter(Employee::isHasPensionPlan)
                .sorted(Comparator.comparing(Employee::lastName)
                        .thenComparing(Employee::yearlySalary, Comparator.reverseOrder()))
                .forEach(employee -> System.out.println(employee.toJSON()));
        System.out.println("---------------------------------------");
    }

    public void printUpcomingEnroll(List<Employee> employees) {
        System.out.println("Printed Upcoming Enrolls");
        employees.stream()
                .filter(Employee::isUpcomingEnroll)
                .sorted(Comparator.comparing(Employee::employmentDate))
                .forEach(employee -> System.out.println(employee.toJSON()));
        System.out.println("---------------------------------------");
    }
}
