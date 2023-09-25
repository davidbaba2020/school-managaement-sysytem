package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.enums.GENDER;

import javax.security.auth.Subject;
import java.util.List;

@Getter
@Setter
//@ToString
@Builder
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseClass{
    private String regNumber;
    private String level;
    private List<Subjects> subjectsOffering;
    private int strike;


    @Override
    public String toString() {
        return "Student{" +
                "regNumber='" + regNumber + '\'' +
                ", level='" + level + '\'' +
                ", subjectsOffering=" + subjectsOffering +
                ", strike=" + strike +
                "} " + super.toString();
    }
}
