package org.example;

import org.example.enums.ROLE;
import org.example.models.Applicant;
import org.example.models.School;
import org.example.models.Staff;

public class Main {
    public static void main(String[] args) {
        Applicant applicant = new Applicant();
        applicant.setName("Moses");
        applicant.setRole(ROLE.APPLICANT);
        applicant.setAverageEntranceScore(20.0);


        Staff admin = new Staff();
        admin.setRole(ROLE.ADMIN_OFFICER);

        System.out.println(admin.admissionProcessing(applicant, 30));
        School s = new School();
    }
}
