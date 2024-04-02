package edu.miu.cs489.customermgtapp.model;

import java.time.LocalDate;

public record Employee(
        Long employeeId,
        String firstName,
        String lastName,
        LocalDate employmentDate,
        Double yearlySalary,
        PensionPlan pensionPlan)
    {

    public boolean isUpcomingEnroll() {
        var nextMonth = LocalDate.now().plusMonths(1);
        var nextQualify = employmentDate.plusYears(5);
        return true;
    }

    public String toJSON() {
        return String.format("{\"employeeId\":%s, \"firstName\":\"%s\", \"lastName\":\"%s\", \"employmentDate\":\"%s\", \"yearlySalary\":%s}", employeeId, firstName, lastName, employmentDate, yearlySalary);
    }
}
