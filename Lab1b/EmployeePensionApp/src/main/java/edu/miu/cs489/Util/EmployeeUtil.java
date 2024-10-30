package edu.miu.cs489.Util;

import edu.miu.cs489.model.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUtil {
    public static List<Employee> sortForTask1(List<Employee> employees) {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getLastName)
                        .thenComparing(Comparator.comparing(Employee::getYearlySalary)
                                .reversed()))
                .collect(Collectors.toList());
    }
    public static List<Employee> filterForTask2(List<Employee> employees) {
        return employees
                .stream()
                .filter(x->x.getPensionPlan()==null)
                .filter(x->x.getEmploymentDate().isBefore(LocalDate.now().minusYears(5).minusMonths(1)))
                .collect(Collectors.toList());
    }
    public static String byJsonFormat(List<Employee> employees){
        return employees.stream()
                .map(e ->String.format("  {\n    \"employeeId\": \"%s\",\n    \"firstName\": \"%s\",\n    \"lastName\": \"%s\",\n    \"employmentDate\": %s,\n    \"yearlySalary\": %.2f,\n    \"PlanReferenceNumber\": %s,\n    \"EnrollmentDate\": %s,\n    \"MonthlyContribution\": %.2f\n }",
                        e.getEmployeeId(),
                        e.getFirstName(),
                        e.getLastName(),
                        e.getEmploymentDate(),
                        e.getYearlySalary(),
                        (e.getPensionPlan()!=null)?e.getPensionPlan().getPlanReferenceNumber():"\"\"",
                        (e.getPensionPlan()!=null)?e.getPensionPlan().getEnrollmentDate():"\"\"",
                        (e.getPensionPlan()!=null)?e.getPensionPlan().getMonthlyContribution():0))
                .collect(Collectors.joining(",\n", "[\n", "\n]"));
    }
}
