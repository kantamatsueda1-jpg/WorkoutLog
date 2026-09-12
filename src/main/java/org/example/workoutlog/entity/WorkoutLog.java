package org.example.workoutlog.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class WorkoutLog {

private int id;
private Date workout_date;
private String exercise_name;
private double weght;
private int reps;
private int sets;
private String memo;
}
