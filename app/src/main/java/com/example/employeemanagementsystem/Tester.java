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

    public void get(EditText txtfname,EditText txtlname,EditText txtbyer,EditText txtmsalary,EditText txtorate,EditText txtbno, EditText txtcartype,EditText txtvmodel,EditText txtplateno,String txtsidecar)
    {
        super.get(txtfname,txtlname,txtbyer,txtmsalary,txtorate);
        if(Vehicle.category.equals("Car"))
        {
            car.get(txtcartype,txtvmodel,txtplateno);
        }
        else if(Vehicle.category.equals("Motor Cycle"))
        {
            motorcycle.get(txtvmodel,txtplateno,txtsidecar);
        }
        nbBugs = Integer.parseInt(txtbno.getText().toString());
    }


    public void activity_store(Intent intent)
    {
        super.activity_store(intent);
        car.activity_store(intent);
        motorcycle.activity_store(intent);
        intent.putExtra("Performance","He/She has corrected "+nbBugs+" bugs");
    }

}