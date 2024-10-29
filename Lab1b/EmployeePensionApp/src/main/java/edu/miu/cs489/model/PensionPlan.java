package edu.miu.cs489;

import java.time.LocalDate;
import java.util.Optional;

public class PensionPlan {
   private  String planReferenceNumber;
   private  LocalDate enrollmentDate;
    private Optional<Double> monthlyContribution;

    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = Optional.ofNullable(monthlyContribution);
    }

    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }
    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Optional<Double> getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(Optional<Double> monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }
}
