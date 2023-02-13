public class Main {
    private static Employee[] employee = new Employee[10];
    public static void main(String[] args) {

        employee[0] = new Employee("Иван", "Иванович", "Иванов", 30000, 5);
        employee[1] = new Employee("Пётр", "Петрович", "Петров", 35000, 4);
        employee[2] = new Employee("Петр", "Алексеевич", "Романов", 120000, 3);
        employee[3] = new Employee("Александр", "Александрович", "Романов", 100000, 1);
        employee[4] = new Employee("Иван", "Алексеевич", "Рюрикович", 150000, 2);
        employee[5] = new Employee("Александр", "Сергеевич", "Пушкин", 150000, 1);
        employee[6] = new Employee("Михаил", "Юрьевич", "Лермантов", 140000, 4);
        employee[7] = new Employee("Александр", "Васильевич", "Суворов", 34000, 2);
        employee[8] = new Employee("Михаил", "Иларионович", "Кутозов", 32000, 3);
        employee[9] = new Employee("Фёдор", "Фёдорорович", "Ушаков", 30000, 5);
        printFullInfo();
        System.out.println("сумма зарплат сотрудников за месяц " + totalSalaries());
        System.out.println("минимальная ЗП у  " + minSalaries());
        System.out.println("максимальная ЗП у  " + maxSalaries());
        System.out.println("средняя ЗП " + middleSalaries());
        fullName();
    }
       private static void printFullInfo() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
       }
        private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : employee){
            sum += employee.getSalary();
        }
        return sum;
        }
        private static Employee minSalaries () {
        int min = Integer.MAX_VALUE;
        Employee employee0 = null;
        for (Employee employee1 : employee){
            if (employee1.getSalary()<min){
                min=employee1.getSalary();
                employee0 = employee1;
            }
        }
        return employee0;
        }
    private static Employee maxSalaries () {
        int max = Integer.MIN_VALUE;
        Employee employee0 = null;
        for (Employee employee1 : employee){
            if (employee1.getSalary()>max){
                max=employee1.getSalary();
                employee0 = employee1;
            }
        }
        return employee0;
    }
    private static double middleSalaries() {
        return totalSalaries()/(double)employee.length;
    }
    private static void fullName () {
        for (Employee employee : employee) {
            System.out.println(employee.getName() + " " + employee.getMiddleName() + " " + employee.getSurname());
        }
    }
}
