package com.ixico.application;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskOrganizerApplication {

    public static void main(String[] args) {
        Application.launch(UserInterfaceApplication.class, args);
    }

}
