package Entities;

import Model.EmployeeModel;

public class Manager extends EmployeeModel {

    private String sector;

    private int employeeNumbers;

    public Manager(String name, int age, String cpf, double baseSalary, int workedHours, String sector, int employeeNumbers) {
        super(name, age, cpf, baseSalary, workedHours);
        this.sector = sector;
        this.employeeNumbers = employeeNumbers;
    }

    public String getSector() {
        return sector;
    }

    public int getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(int employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "\nName= '" + getName() + '\'' +
                ",\nsector= '" + sector + '\'' +
                ", \nemployeeNumbers= " + employeeNumbers +
                ", \nsalary= " + String.format("%.2f", getBaseSalary()) +
                ", \nmodCount= " + modCount +
                "}\n";
    }
}
