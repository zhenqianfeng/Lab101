package com.concordia.cejv669.lab10_1;
import java.util.HashMap;

public class PasswordManager {

    public PasswordManager() {
        // Populate password data.
        String loginEmail1 = "bob@gmail.com";
        UserPass userPass1 = new UserPass("bob", "b0b");
        loginMap.put(loginEmail1, userPass1);

        int pin1 = 1234;
        String userName1 = "alice";

        pinLoginMap.put(pin1, userName1);

    }

    public class UserPass {
        public UserPass(String userName, String passWord) {
            this.passWord = passWord;
            this.userName = userName;
        }

        String userName;
        String passWord;
    }

    HashMap<String, UserPass> loginMap = new HashMap<>();
    HashMap<Integer, String> pinLoginMap = new HashMap<>();

    public String verifyPassword(String email, String password) {
        // Return true if password matches.
        if (loginMap.containsKey(email)) {
            UserPass up = loginMap.get(email);

            if (up.passWord.equals(password)) {
                return up.userName;
            }
        }

        return null;
    }

    public String verifyPin(int pin) {
        if (pinLoginMap.containsKey(pin)) {
            String username = pinLoginMap.get(pin);
            return username;
        }

        return null;
    }
}