package Model;

public class CalculatorSalary {

    private final int standard_hours_per_month = 40;
    private final double additional_overtime = 1.5;

    public double calculatorSalaryFinal(EmployeeModel employee){
        if (employee.getWorkedHours() > standard_hours_per_month){
            int extraHours = employee.getWorkedHours() - standard_hours_per_month;
            double valueExtraHours = employee.getBaseSalary() / standard_hours_per_month * additional_overtime;
            valueExtraHours = valueExtraHours * extraHours;

            return employee.getBaseSalary() + valueExtraHours;
        }
        return employee.getBaseSalary();
    }
}
