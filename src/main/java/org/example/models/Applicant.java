package org.example.models;

import lombok.*;
import org.example.enums.GENDER;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Applicant extends BaseClass{
    private List<EntranceSubjects> entranceSubjectsList;
    private Double averageEntranceScore;
    private char grade;
    private ReportSheet entranceExamsResult;
}
