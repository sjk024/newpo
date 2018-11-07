package edu.ucsd.cs110.temperature;

public abstract class Temperature {


    public float value;

    public Temperature (float v) {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}