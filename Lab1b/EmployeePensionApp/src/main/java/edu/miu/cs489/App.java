package edu.miu.cs489;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.miu.cs489.model.Employee;
import edu.miu.cs489.model.PensionPlan;

public class Main {
    public static void main(String[] args) {
       List<Employee> employee = new ArrayList<>();

       employee.add(new Employee(
            "Daniel","Agar", 105945.50,
                      LocalDate.of(2018,01,17),
                      new PensionPlan("EX1089", LocalDate.of(2023,01,17), 100.00)
       ));

        employee.add(new Employee(
                "Benard", "Shaw", 197750.00,
                LocalDate.of(2019, 4, 3),
                new PensionPlan("EX1090", LocalDate.of(2023, 1, 17), null)
        ));

        employee.add(new Employee(
                "Carly", "Agar", 842000.75,
                LocalDate.of(2014, 5, 16),
                new PensionPlan("SM2307", LocalDate.of(2019, 11, 4), 1555.50)
        ));

        employee.add(new Employee(
                "Wesley", "Schneider", 74500.00,
                LocalDate.of(2019, 10, 2),
                null
        ));

        employee.sort(Employee.getEmployeeComparator());
        String jsonOutput = JsonConverter.convertToJson(employee);

    }
    public static String convertToJson(List<Employee> employees) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            return mapper.writeValueAsString(employees);
        } catch (IOException e) {
            e.printStackTrace();
            return "{}";
        }

}