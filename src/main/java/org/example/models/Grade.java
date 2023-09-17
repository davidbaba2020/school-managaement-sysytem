package org.example.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private int id;
    private String name;
    private String formTeacherName;
    private String session;
    private List<Student> classMembers;
}
