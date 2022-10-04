package com.educandoweb.course.services.exceptions;

public class ResouceNotFoundException extends RuntimeException{

    public ResouceNotFoundException(Object id){
        super("Resource not found. id " + id);
    }
}
