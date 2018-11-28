package com.vadranam.selenium.restassured_tutorial02;

public class User {
	private String id;

    private String color;

    private String name;

    private String pantone_value;

    private String year;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPantone_value ()
    {
        return pantone_value;
    }

    public void setPantone_value (String pantone_value)
    {
        this.pantone_value = pantone_value;
    }

    public String getYear ()
    {
        return year;
    }

    public void setYear (String year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "ClassUsers [id = "+id+", color = "+color+", name = "+name+", pantone_value = "+pantone_value+", year = "+year+"]";
    }

}
