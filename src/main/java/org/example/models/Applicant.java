package org.example.models;

import lombok.*;
import org.example.enums.GENDER;
import org.example.models.EntranceSubjects;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {
    private int id;
    private String name;
    private String age;
    private GENDER gender;
    private List<EntranceSubjects> entranceSubjectsList;
    private Double averageEntranceScore;
}
