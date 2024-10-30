package edu.miu.cs489;

import edu.miu.cs489.Util.EmployeeUtil;
import edu.miu.cs489.model.Employee;
import edu.miu.cs489.model.PensionPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,"Daniel","Agar", LocalDate.of(2018,1,17),105945.50,new PensionPlan("EX1089",LocalDate.of(2023,1,17),100.0)));
        employees.add(new Employee(2L,"Benard","Shaw", LocalDate.of(2019,4,3),197750.00,null));
        employees.add(new Employee(3L,"Carly","Agar", LocalDate.of(2014,5,16),842000.75,new PensionPlan("EX1089",LocalDate.of(2023,1,17),100.0)));
        employees.add(new Employee(4L,"Wesley","Schneider", LocalDate.of(2019,10,2),74500.00,null));

        System.out.println("Task 1");
        System.out.println(EmployeeUtil.byJsonFormat(EmployeeUtil.sortForTask1(employees)));

        System.out.println("Task 2");
        System.out.println(EmployeeUtil.byJsonFormat(EmployeeUtil.filterForTask2(employees)));
    }
}