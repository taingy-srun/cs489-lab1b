package edu.miu.cs489.customermgtapp;

import edu.miu.cs489.customermgtapp.model.Employee;

import java.util.Comparator;
import java.util.List;

public class CustomerMgtApp {

    public void printAllEmployeeWithPensionPlan(List<Employee> employees) {
        var emps = employees.stream().filter(employee -> employee.pensionPlan() != null);
        emps.sorted(Comparator.comparing(Employee::lastName)
                        .thenComparing(Employee::yearlySalary, Comparator.reverseOrder()))
                .forEach(employee -> {
                    System.out.println(employee.toJSON());
                });
    }
}
