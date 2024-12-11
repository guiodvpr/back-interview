package com.paractic.test.models;

public class ResponsePerson {
    private String message;
    private Person person;

    public ResponsePerson(String message, Person person) {
        this.message = message;
        this.person = person;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
