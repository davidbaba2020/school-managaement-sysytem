package org.example.models;

import lombok.*;

import javax.security.auth.Subject;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Getter
@Setter
//@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportSheet {
    private String name;
    private Date date = new Date();
    private String studentLevel;
    private Map<String , Double> subjectsSatFor;
    private double averageScore;
    private String teachersRemark;
    private char grade;

    @Override
    public String toString() {
        return "                   ReportSheet" +'\n'+
                "*******************  " + name + "  *******************"+'\'' +'\n'+
                "Date issued:       " + date +'\n'+
                "Class allocated:   " + studentLevel + '\''+'\n' +
                "Subjects taken:    " + subjectsSatFor +'\n'+
                "Average Score obtained: " + averageScore +'\n'+
                "Teacher's Remark:  " + teachersRemark + '\'' +'\n'+
                "Grade obtained:    " + grade+ '\n'
                +"****************************************************";
    }
}
