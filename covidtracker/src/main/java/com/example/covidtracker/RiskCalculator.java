package com.example.covidtracker;

import com.example.covidtracker.models.Assessment;

public class RiskCalculator { //this can be a interface and as the class with this contract will implement this interface.

    public int calculateRisk(Assessment assessment) {

        if (assessment == null) {
            return 5;
        }

        if (assessment.getSymptoms().size() == 1 && (assessment.isTravelHistory())
            || assessment.isContactWithCovidPatient()) {
            return 50;
        }

        if (assessment.getSymptoms().size() == 2 && (assessment.isTravelHistory())
            || assessment.isContactWithCovidPatient()) {
            return 75;
        }

        if (assessment.getSymptoms().size() > 2 && (assessment.isTravelHistory())
            || assessment.isContactWithCovidPatient()) {
            return 95;
        }
        return -1;
    }
}
