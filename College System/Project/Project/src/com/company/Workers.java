package com.company;

public class Workers extends Person
{
    private double Salary;
    private double WorkingHour;

    public Workers(){}

    public Workers(double Salary, double WorkingHour, String name, int age, int id, String street,String city, String mobilephone)
    {
        super(id, name, age, mobilephone,street, city);
        this.Salary = Salary;
        this.WorkingHour = WorkingHour;
    }

    public double getSalaryOfWorkers()
    {
        return this.Salary;
    }

    public void setSalaryOfWorkers(double Salary)
    {
        this.Salary = Salary;
    }

    public double getWorkingHourOfWorkers ()
    {
        return this.WorkingHour;
    }

    public void setWorkingHourOfWorkers(double WorkingHour) {
        this.WorkingHour = WorkingHour;
    }

    @Override
    public String toString()
    {
        return "ID of Workers : " + getId()
                + "\nName of Workers : " + getName()
                + "\nAge of Workers : " + getAge()
                + "\nAddress of Workers : " + getAddress()
                + "\nMobile Phone of Workers : " + getMobilePhone()
                + "\nSalary of Workers : " + getSalaryOfWorkers()
                + "\nWorking Hours of Workers : " + getWorkingHourOfWorkers();
    }

    @Override
    public void PrintDetails()
    {
        toString();
    }
}
