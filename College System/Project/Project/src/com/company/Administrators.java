package com.company;

public class Administrators extends Person
{
    private double Salary;
    private String Department;

    public Administrators(){}

    public Administrators(double salary, String department, String name, int age, int id, String street,String city, String MobilePhone)
    {
        super(id, name, age, MobilePhone,street, city);
        this.Salary = salary;
        this.Department = department;
    }

    public double getSalaryOfAdministrators()
    {
        return this.Salary;
    }

    public void setSalaryOfAdministrators(double salary)
    {
        this.Salary = salary;
    }

    public String getDepartmentOfAdministrators()
    {
        return this.Department;
    }

    public void setDepartmentOfAdministrators(String department)
    {
        this.Department = department;
    }

    @Override
    public String toString()
    {
        return "ID of Administrators : " + getId()
                + "\nName of Administrators : " + getName()
                + "\nAge of Administrators : " + getAge()
                + "\nAddress of Administrators : " + getAddress()
                + "\nMobile Phone of Administrators : " + getMobilePhone()
                + "\nDepartment of Administrators: " + getDepartmentOfAdministrators()
                + "\nSalary of Administrators: " + getSalaryOfAdministrators() ;
    }

    @Override
    public void PrintDetails()
    {
        toString();
    }
}
