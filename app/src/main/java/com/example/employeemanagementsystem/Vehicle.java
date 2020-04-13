package com.example.employeemanagementsystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Vehicle extends Employee {
    public static String make;
    public static String plate;
    public static String color;
    public static String category;

    Vehicle()
    {
        make = "";
        plate = "";
        color = "";
        category = "";
    }
