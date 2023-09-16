package org.example.models;

import lombok.*;

@Getter
//@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EntranceSubjects {
    private int Id;
    private double englishScore;
    private double mathematicsScore;
    private double biologyScore;
    private double totalEntranceScore;
}
