package com.example.employeemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Manager extends Employee {
    private int nbClients;
    Car car = new Car();
    MotorCycle motorcycle = new MotorCycle();

    Manager()
    {
        nbClients = 0;
    }

