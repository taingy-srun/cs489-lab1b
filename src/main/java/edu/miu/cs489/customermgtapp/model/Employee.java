package edu.miu.cs489.customermgtapp.model;

import java.time.LocalDate;

public record Employee(
        Long employeeId,
        String firstName,
        String lastName,
        LocalDate employmentDate,
        Double yearlySalary,
        PensionPlan pensionPlan) {
    public boolean isHasPensionPlan() {
        return pensionPlan != null;
    }

    public boolean isUpcomingEnroll() {
        var nextMonth = LocalDate.now().plusMonths(1);
        var nextQualify = employmentDate.plusYears(5);
        return pensionPlan == null &&  nextQualify.getYear() == nextMonth.getYear() && nextQualify.getMonth().equals(nextMonth.getMonth()) ;//&& nextQualify.isBefore(nextMonth);
    }

    public String toJSON() {
        return String.format("{\"employeeId\":%s, \"firstName\":\"%s\", \"lastName\":\"%s\", \"employmentDate\":\"%s\", \"yearlySalary\":%s}", employeeId, firstName, lastName, employmentDate, yearlySalary);
    }
}
