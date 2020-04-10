package com.example.employeemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Programmer extends Employee {

    private int nbProjects;
    Car car = new Car();
    MotorCycle motorcycle = new MotorCycle();


    Programmer() {
        nbProjects = 0;
    }

    public void get(EditText txtfname, EditText txtlname, EditText txtbyer, EditText txtmsalary, EditText txtorate, EditText txtpno, EditText txtcartype, EditText txtvmodel, EditText txtplateno, String txtsidecar) {
        super.get(txtfname, txtlname, txtbyer, txtmsalary, txtorate);
        if (Vehicle.category == "Car") {
            car.get(txtcartype, txtvmodel, txtplateno);
        } else if (Vehicle.category == "Motor Cycle") {
            motorcycle.get(txtvmodel, txtplateno, txtsidecar);
        }
        nbProjects = Integer.parseInt(txtpno.getText().toString());
    }


    public void activity_store(Intent intent) {
        super.activity_store(intent);
        if (Vehicle.category.equals("Car")) {
            car.activity_store(intent);
        }
        motorcycle.activity_store(intent);
        intent.putExtra("Performance", "He/She has completed " + nbProjects + " projects");
    }
    
}