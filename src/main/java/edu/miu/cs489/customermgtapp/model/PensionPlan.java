package edu.miu.cs489.customermgtapp.model;

import java.time.LocalDate;

public record PensionPlan(
        String planReferenceNumber,
        LocalDate enrollmentDate,
        Double monthlyContribution) {
}
