package com.example.springPractice.domain;

import lombok.Data;

@Data
public class Director {
    private String directorId;
    private String directorName;

    public Director(){
    }

    public Director(String directorId, String directorName){
        this.directorId = directorId;
        this.directorName = directorName;
    }
}
