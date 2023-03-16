package Entities;

import Model.EmployeeModel;

public class Programmer extends EmployeeModel {

    private String programmingLanguage;
    private String softSkills;
    private String nivel;
    private boolean hasCertificates;
    private String frameworks;

    public Programmer() {}

    public Programmer(String name, int age, String cpf, double baseSalary, int workedHours, String programmingLanguage, String softSkills, String nivel, boolean hasCertificates, String frameworks) {
        super(name, age, cpf, baseSalary, workedHours);
        this.programmingLanguage = programmingLanguage;
        this.softSkills = softSkills;
        this.nivel = nivel;
        this.hasCertificates = hasCertificates;
        this.frameworks = frameworks;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isHasCertificates() {
        return hasCertificates;
    }

    public void setHasCertificates(boolean hasCertificates) {
        this.hasCertificates = hasCertificates;
    }

    public String getFrameworks() {
        return frameworks;
    }

    public void setFrameworks(String frameworks) {
        this.frameworks = frameworks;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "Name= '" + getName() + '\'' +
                ", \nAge= '" + getAge() + '\'' +
                "\nprogrammingLanguage='" + programmingLanguage + '\'' +
                ", \nsoftSkills='" + softSkills + '\'' +
                ", \nnivel='" + nivel + '\'' +
                ", \nhasCertificates=" + hasCertificates +
                ", \nsalary= " + String.format("%.2f", getBaseSalary()) +
                ", \nframeworks='" + frameworks + '\'' +
                ", \nmodCount=" + modCount +
                "}\n";
    }
}
