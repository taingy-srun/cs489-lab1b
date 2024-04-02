package edu.miu.cs489.customermgtapp;

import edu.miu.cs489.customermgtapp.model.Employee;
import edu.miu.cs489.customermgtapp.model.PensionPlan;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var pensionPlan = new PensionPlan("EX1089", LocalDate.parse("2023-01-17"), 100.0);
        var daniel = new Employee(12345678L, "Daniel", "Agar", LocalDate.parse("2018-01-17"), 105945.50, pensionPlan);

        var benard = new Employee(3214223L, "Benard", "Shaw", LocalDate.parse("2019-04-03"), 197750.00, null);

        var carlyPensionPlan = new PensionPlan("SM2307", LocalDate.parse("2019-11-04"), 1555.50);
        var carly = new Employee(12345238L, "Carly", "Agar", LocalDate.parse("2014-05-16"), 842000.75, carlyPensionPlan);

        var wesley = new Employee(3214229L, "Wesley", "Schneider", LocalDate.parse("2019-05-02"), 74500.00, null);

        var employees = new ArrayList<Employee>();
        employees.add(daniel);
        employees.add(benard);
        employees.add(carly);
        employees.add(wesley);

        CustomerMgtApp customerMgtApp = new CustomerMgtApp();
        customerMgtApp.printAllEmployeeWithPensionPlan(employees);
    }

}