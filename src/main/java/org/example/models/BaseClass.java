package org.example.models;

import lombok.*;
import org.example.enums.GENDER;
import org.example.enums.ROLE;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseClass {
    private int id;
    private String name;
    private String age;
    private GENDER gender;
    private String email;
    private ROLE role;
    private Date dateCreated = new Date();
}
