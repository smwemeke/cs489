package edu.miu.cs489;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Optional;

public class Employee {
    private long employeeId;
    private String firstName, lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    private Optional<PensionPlan> pensionPlan;

    public Employee( String firstName, String lastName,  double yearlySalary, LocalDate employmentDate,PensionPlan pensionPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = Optional.ofNullable(pensionPlan);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
    public Optional<PensionPlan> getPensionPlan() {
        return pensionPlan;
    }

    public static Comparator<Employee> getEmployeeComparator(){
        return Comparator.comparing(Employee::getLastName)
                .thenComparing(Comparator.comparing(Employee::getYearlySalary).reversed());
    }
}