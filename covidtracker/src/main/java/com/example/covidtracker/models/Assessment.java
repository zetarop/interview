package com.example.covidtracker.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Assessment {

    private List<String> symptoms;
    private boolean travelHistory;
    private boolean contactWithCovidPatient;
}
