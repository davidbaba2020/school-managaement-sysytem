package org.example.service;

import org.example.models.Applicant;
import org.example.models.ReportSheet;
import org.example.models.School;

public interface AdminInterface {
    ReportSheet admissionProcessing(Applicant applicant, double cutOffMark, School school);
}
