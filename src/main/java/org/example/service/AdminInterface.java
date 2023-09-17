package org.example.service;

import org.example.models.Applicant;
import org.example.models.ReportSheet;

public interface AdminInterface {
    ReportSheet admissionProcessing(Applicant applicant, double cutOffMark);
}
