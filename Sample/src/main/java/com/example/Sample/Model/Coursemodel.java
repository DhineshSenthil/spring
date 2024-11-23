package com.example.Sample.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data //for getter &setter we can use data
@Entity //to identify this class is modelclass
public class Coursemodel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Id  //for below type is primary key
    private int id;
    private String coursename;
    private String courseduration;
    private String courselesson;
    private String coursedescrption;
    private double coursefee;





}
