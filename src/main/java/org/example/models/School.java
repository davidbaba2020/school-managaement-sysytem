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
    private List<Student> studentInThisSchool;
    private List<Staff> staffInThisSchool;
    private List<Subjects> subjectsThisSchool;
}
