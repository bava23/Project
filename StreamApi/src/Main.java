import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 55000),
                new Employee(2, "Bob", "IT", 70000),
                new Employee(3, "Charlie", "IT", 65000),
                new Employee(4, "David", "Finance", 60000),
                new Employee(5, "Eve", "HR", 52000),
                new Employee(6, "Frank", "Finance", 75000),
                new Employee(7, "Grace", "IT", 72000)
        );

        // 1. Filter employees with salary > 60000
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 60000)
                .collect(Collectors.toList());
        System.out.println("Employees earning more than 60,000:");
        highEarners.forEach(System.out::println);

        // 2. Map: Get list of employee names
        List<String> employeeNames = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("\nAll employee names:");
        employeeNames.forEach(System.out::println);

        // 3. Group employees by department
        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("\nEmployees grouped by department:");
        byDepartment.forEach((dept, emps) -> {
            System.out.println(dept + ":");
            emps.forEach(e -> System.out.println("  " + e));
        });

        // 4. Calculate average salary by department
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println("\nAverage salary by department:");
        avgSalaryByDept.forEach((dept, avg) ->
                System.out.println(dept + ": $" + String.format("%.2f", avg))
        );

        // 5. Sort employees by salary descending
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("\nEmployees sorted by salary (descending):");
        sortedBySalary.forEach(System.out::println);

        // 6. Find employee with highest salary
        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaid.ifPresent(e ->
                System.out.println("\nHighest paid employee: " + e)
        );

        // 7. Sum of all salaries
        double totalSalaries = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("\nTotal of all salaries: $" + totalSalaries);

    }
}