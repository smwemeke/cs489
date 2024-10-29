package edu.miu.cs489;

import java.time.LocalDate;

public class PensionPlan {
    int planReferenceNumber;
    LocalDate enrollmentDate;
    double monthlyContribution;

    public PensionPlan(int planReferenceNumber, LocalDate enrollmentDate, double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    public int getPlanReferenceNumber() {
        return planReferenceNumber;
    }
    public void setPlanReferenceNumber(int planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }
}
