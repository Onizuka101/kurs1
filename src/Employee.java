public class Employee {

    private int  id;
    private static int counterId = 1;
    private String name;
    private String surname;
    private String middleName;
    private int salary;
    private int department;



    public Employee (String name, String middleName, String surname, int salary,int department)
    {
        this.name= name;
        this.surname=surname;
        this.middleName=middleName;
        this.salary=salary;
        this.department=department;
        this.id = counterId ++;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getDepartment () {
        return this.department;
    }
    public int getId () {return this.id;}
    public void setSalary (int salary){
        this.salary=salary;
    }
    public void setDepartment (int department ){
        this.department=department;
    }

    @Override
    public String toString () {
        return "номер сотрудника " + id + " ФИО " + this.getName() + " " + this.getMiddleName()+ " "+ this.getSurname() + " зарплата " +
                this.getSalary() + " отдел " + this.getDepartment();
     }
}
