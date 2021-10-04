package com.example.covidtracker.Services;

import com.example.covidtracker.RiskCalculator;
import com.example.covidtracker.database.UserDatabase;
import com.example.covidtracker.models.Assessment;
import com.example.covidtracker.models.ExtendedUser;
import com.example.covidtracker.models.Risk;
import com.example.covidtracker.models.UpdatedResult;
import com.example.covidtracker.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserDatabase userDatabase = new UserDatabase();

    @Autowired
    private RiskCalculator riskCalculator; //factory design pattern can be used here to decide which riskCalculator to use.

    public ExtendedUser addUser(User user, boolean isAdmin){

        if(isAdmin){
            userDatabase.markAsAdmin(user);
        }
        User currentUser = userDatabase.addUser(user);
        return ExtendedUser.builder()
            .id(currentUser.getId())
            .build();
    }

    public Risk getRiskPercentage(Assessment assessment){

        return Risk.builder()
            .riskPercentage(riskCalculator.calculateRisk(assessment))
            .build();
    }
}
