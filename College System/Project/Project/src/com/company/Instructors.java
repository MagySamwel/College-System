package com.company;

public class Instructors extends Person
{
    private String Department;
    private double Salary;


    public Instructors()
    {}

    public Instructors(String department, double salary, String name, int age, int id,String street,String city, String MobilePhone)
    {
        super(id, name, age,MobilePhone,street, city);
        this.Department = department;
        this.Salary = salary;
    }

    public String getDepartmentOfInstructors()
    {
        return this.Department;
    }

    public void setDepartmentOfInstructors(String department)
    {
        this.Department = department;
    }

    public double getSalaryOfInstructors()
    {
        return this.Salary;
    }

    public void setSalaryOfInstructors(double salary)
    {
        this.Salary = salary;
    }

    @Override
    public String toString()
    {
        return "ID of Instructors: " + getId()
                + "\nName of Instructors : " + getName()
                + "\nAge of Instructors : " + getAge()
                + "\nAddress of Instructors : " + getAddress()
                + "\nMobile Phone of Instructors : " + getMobilePhone()
                + "\nDepartment of Instructors : " + getDepartmentOfInstructors()
                + "\nSalary of Instructors : "+ getSalaryOfInstructors();
    }

    @Override
    public void PrintDetails()
    {
        toString();
    }
}
