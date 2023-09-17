package org.example.models;

import lombok.*;
import org.example.enums.GENDER;

import javax.security.auth.Subject;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseClass{
    private String regNumber;
    private String level;
    private List<Subjects> subjectsOffering;
    private int strike;
}
