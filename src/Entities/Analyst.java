package Entities;

import Model.EmployeeModel;

public class Analyst extends EmployeeModel {

    private boolean specialization;
    private String nivel;
    private String bestSkill;
    private int amountProjects;

    public Analyst() {}
    public Analyst(String name,
                   int age,
                   String cpf,
                   double baseSalary,
                   int workedHours,
                   boolean specialization,
                   String nivel,
                   String bestSkill,
                   int amountProjects) {
        super(name, age, cpf, baseSalary, workedHours);
        this.specialization = specialization;
        this.nivel = nivel;
        this.bestSkill = bestSkill;
        this.amountProjects = amountProjects;
    }

    public boolean getSpecialization() {
        return specialization;
    }

    public void setSpecialization(boolean specialization) {
        this.specialization = specialization;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getBestSkill() {
        return bestSkill;
    }

    public void setBestSkill(String bestSkill) {
        this.bestSkill = bestSkill;
    }

    public int getAmountProjects() {
        return amountProjects;
    }

    public void setAmountProjects(int amountProjects) {
        this.amountProjects = amountProjects;
    }

    @Override
    public String toString() {
        return "Analyst{\n" +
                "Name= '" + getName() + '\'' +
                ", \nAge= '" + getAge() + '\'' +
                ", \nspecialization= '" + specialization + '\'' +
                ", \nnivel= '" + nivel + '\'' +
                ", \nsalary= " + String.format("%.2f", getBaseSalary()) +
                ", \nbestSkill= '" + bestSkill + '\'' +
                ", \namountProjects= " + amountProjects +
                ", \nmodCount= " + modCount +
                "}\n";
    }
}
