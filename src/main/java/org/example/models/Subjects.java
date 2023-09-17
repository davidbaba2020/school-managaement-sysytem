package org.example.models;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Subjects {
    private int id;
    private String courseTittle;
    private String courseCode;
    private double testScore;
    private double examsScore;
    private double totalScore;
    private String teacherInCharge;
}
