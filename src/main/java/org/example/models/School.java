package org.example.models;

import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private String name;
    private  static List<Student> studentInThisSchool;
    private  static List<Staff> staffInThisSchool;
    private static List<Subjects> subjectsThisSchool;
}
