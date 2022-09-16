package com.example.myapplication;

public class Calculater {
    private float number1;
    private float number2;

    public Calculater(float number1,float number2)
    {
        this.number1 = number1;
        this.number2 = number2;
    }
    public float add()
    {
        return (number1+number2);
    }
    public float mul()
    {
        return (number1*number2);
    }
    public float div()
    {
        return (number1/number2);
    }
    public float sub()
    {
        return (number1-number2);
    }
}
