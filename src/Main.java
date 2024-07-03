public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = createEmploye("Петров Петр Петрович", 1, 0);
        employees[1] = createEmploye("Петров Петр Петрович", 2, 0);
        employees[2] = createEmploye("Петров Петр Петрович", 3, 0);
        employees[3] = createEmploye("Петров Петр Петрович", 4, 0);
        employees[4] = createEmploye("Петров Петр Петрович", 5, 0);
        employees[5] = createEmploye("Петров Петр Петрович", 1, 1000);
        employees[6] = createEmploye("Петров Петр Петрович", 1, 0);
        employees[7] = createEmploye("Петров Петр Петрович", 2, 0);
        employees[8] = createEmploye("Петров Петр Петрович", 2, 1000);
        employees[9] = createEmploye("Петров Петр Петрович", 5, 0);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toStringFullNameDepartmentSalary());
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toStringFullName());
        }
        int result = calculateSalary(employees);
        System.out.println("Суммф зарплат равна:" + result);
        int maxSalary = calculateMaxSalary(employees);
        System.out.println("Наибольшая зарплата:"+ maxSalary);
        long minSalary = calculateMINSalary(employees);
        System.out.println("Наименьшая зарплата:"+ minSalary);
        float averageSalary = calculateAverageSalary(employees);
        System.out.println("средняя заработная плата 10 сотрудников:"+ averageSalary);
    }
    public static Employee createEmploye(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary);
        return employee;
    }
    public static float calculateAverageSalary(Employee[] employees) {
        float summaSalary = 0;
        float averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employeeSalary = employees[i];// вызов зарплаты одного сотрудника (в int)

            if (employeeSalary != null) {
             summaSalary = (summaSalary + employeeSalary.getSalary());
                averageSalary = summaSalary /employees.length;
            }
        }
    return  averageSalary ;
    }
    public static int calculateSalary(Employee[] employees) {
        int resultSummaSalarysEmployees= 0;
        for (int i = 0; i < employees.length; i++) {
            Employee SalaryEmployee = employees[i];
            if (SalaryEmployee != null) {
                resultSummaSalarysEmployees =  resultSummaSalarysEmployees + SalaryEmployee.getSalary();
            }
        }
        return  resultSummaSalarysEmployees;
    }
public static int calculateMaxSalary(Employee[] employees1) {
    int maxSalary = -1;
    for (int i = 0; i < employees1.length; i++) {
        int salaryEmployee = employees1[i].getSalary();//вызов зарплаты 0 сотрудника (в int)
        if (salaryEmployee > maxSalary) {
            maxSalary = salaryEmployee;
        }
    }
    return maxSalary;
    }
    public static long calculateMINSalary(Employee[] employees2) {
        long minSalary = Long.MAX_VALUE;
        for (int i = 0; i < employees2.length; i++) {
            long salaryEmployee12345 = employees2[i].getSalary();//вызов зарплаты 0 сотрудника (в long)
            if (salaryEmployee12345 < minSalary) {
                minSalary = salaryEmployee12345;
            }
        }
        return minSalary;
    }
    }
