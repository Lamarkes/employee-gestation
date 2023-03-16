package Model;

import java.util.ArrayList;
import java.util.UUID;

public abstract class EmployeeModel extends ArrayList<EmployeeModel> {

    private String name;
    private int age;
    private final UUID id = GenerateID.generateID();
    private String cpf;
    private double baseSalary;

    private int workedHours;
    public EmployeeModel(){}
    public EmployeeModel(String name,
                         int age,
                         String cpf,
                         double baseSalary,
                         int workedHours) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.baseSalary = baseSalary;
        this.workedHours = workedHours;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void setSalary(double salary) {
        this.baseSalary = salary;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public UUID getId(){
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    @Override
    public String toString() {
        return "\nEmployee= "
                +"\n[Name: "+name+
                "\ncpf: "+ cpf+
                "\nid: "+ id+
                "\nage: "+ age+
                "\nWorked Hours: "+ workedHours+
                "\nsalary: "+ String.format("%.2f",baseSalary)+"]";
    }

}
