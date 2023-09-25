package org.example.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.enums.GENDER;

import java.util.List;

@Getter
@Setter
@SuperBuilder
//@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Applicant extends BaseClass{
    private List<EntranceSubjects> entranceSubjectsList;
    private Double averageEntranceScore;
    private String levelAppliedFor;
    private char grade;
    private ReportSheet entranceExamsResult;


    @Override
    public String toString() {
        return "Applicant{" +
                "entranceSubjectsList=" + entranceSubjectsList +
                ", averageEntranceScore=" + averageEntranceScore +
                ", grade=" + grade +
                ", entranceExamsResult=" + entranceExamsResult +
                "} " + super.toString();
    }
}
