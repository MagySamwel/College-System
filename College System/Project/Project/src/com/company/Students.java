package com.company;

public class Students extends Person {
    private String gpa;
    private int level;
    private String Department;

    public Students()
    {
        gpa = "0";
    }

    public Students(int id, String name, int age, String MobilePhone, int level, String department, String street, String city, String gpa) {
        super(id, name, age, MobilePhone, street, city);
        this.gpa = gpa;
        this.level = level;
        this.Department = department;
    }

    public String getGpaOfStudents() {
        return this.gpa;
    }

    public void setGpaOfStudents(String gpa) {
        try {
            double g = Double.parseDouble(gpa);

            if (g >= 0.0 && g <= 4.0)
                this.gpa = gpa;

        }
        catch (Exception e)
        {
            System.out.println("Sorry , Invalid input..");
            System.out.println("The message Of your error : "+e.getMessage());
            System.out.println("---------------------------------------");
        }
    }


    public int getLevelOfStudents() {
        return this.level;
    }

    public void setLevelOfStudents(int level) {
        this.level = level;
    }

    public String getDepartmentOfStudents() {
        return this.Department;
    }

    public void setDepartmentOfStudents(String department) {
        this.Department = department;
    }

    @Override
    public String toString() {
        return "ID : " + getId()
                + "\nName of Students : " + getName()
                + "\nAge of Students : " + getAge()
                + "\nAddress of Students:- " + getAddress()
                + "\nMobile Phone of Students: " + getMobilePhone()
                + "\nGPA of Students : " + getGpaOfStudents()
                + "\nLevel of Students : " + getLevelOfStudents()
                + "\nDepartment of Students : " + getDepartmentOfStudents();
    }

    @Override
    public void PrintDetails() {
        System.out.println(toString());
    }
}
