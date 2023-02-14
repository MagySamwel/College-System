package com.company;

public abstract class Person implements Print
{
    private String name;
    private int age;
    private int id;
    private String mobilePhone;

    //Composition
    protected Address ObjectA;


    public Person()
    {}

    public Person(int id,String name,int age,String mobilePhone,String street,String city)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.ObjectA = new Address(city , street);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAddress(String City , String Street)
    {
        this.ObjectA = new Address(City , Street);
    }

    public void setAddress(String Street)
    {
        this.ObjectA = new Address(Street);
    }

    public String getAddress()
    {
        return "\n[ " +"City name : " + ObjectA.getCity()
                + "\nStreet name : " + ObjectA.getStreet() + " ]";
    }

    public String getMobilePhone()
    {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object newObject)
    {
        //Polymorphism (DownCasting)
        Person ObjectP = (Person) newObject;

        if (ObjectP.id == id)
        {
            return true;
        }
        else
            return false;
    }

}

