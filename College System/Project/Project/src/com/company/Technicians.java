    package com.company;

    public class Technicians extends Person
    {
    private double Salary;

    public Technicians(){}

    public Technicians(double Salary, String name, int age, int id, String street,String city, String MobilePhone)
    {
        super(id, name, age, MobilePhone, street,city);
        this.Salary = Salary;
    }

    public double getSalaryOfTechnicians()
    {
        return this.Salary;
    }

    public void setSalaryOfTechnicians(double Salary)
    {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "ID of Technicians : " + getId()
                + "\nName of Technicians : " + getName()
                + "\nAge of Technicians : " + getAge()
                + "\nAddress of Technicians : " + getAddress()
                + "\nMobile Phone of Technicians : " + getMobilePhone()
                + "\nSalary of Technicians : " + getSalaryOfTechnicians();
    }

    @Override
    public void PrintDetails()
    {
        toString();
    }
}
