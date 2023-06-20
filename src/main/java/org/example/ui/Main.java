package org.example.ui;

import org.example.model.Doctor;
import org.example.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new Doctor("Duvan Leal", "DuvanLeal");
        user.showDataUser();

        User user1 = new User("Duvan Leal", "duvanleal02@gmail.com") {
            @Override
            public void showDataUser() {
                
            }
        }

    }
}
