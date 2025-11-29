package com.epam.mjc;

public class StudentException extends IllegalArgumentException{

    public StudentException(long id) {
        super("Could not find student with ID " + id);
    }
}
