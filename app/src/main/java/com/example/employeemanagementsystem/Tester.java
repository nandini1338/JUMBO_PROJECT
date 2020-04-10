package com.example.employeemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.LineNumberReader;

import androidx.appcompat.app.AppCompatActivity;

public class Tester extends Employee {

    Car car = new Car();
    MotorCycle motorcycle = new MotorCycle();
    private int nbBugs;

    Tester() {
        nbBugs = 0;
    }

}