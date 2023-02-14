package com.company;


public class Address
{
    private String City;
    private String Street;

    public Address()
    {}

    public Address(String street)
    {
        this.Street = street;
    }

    public Address(String City , String Street)
    {
        this.City = City;
        this.Street= Street;
    }

    public String getCity()
    {
        return this.City;
    }

    public void setCity(String City)
    {
        this.City = City;
    }

    public String getStreet()
    {
        return this.Street;
    }

    public void setStreet(String Street)
    {
        this.Street = Street;
    }

    @Override
    public String toString()
    {
        return "\n[ " +"City : " + getCity()
                + "\nStreet : " + getStreet() + " ]";
    }
}
