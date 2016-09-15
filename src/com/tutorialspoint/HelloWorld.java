package com.tutorialspoint;

/**
 * Created by cpt2pes on 15.9.2016 г..
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("My message is: " + this.message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
