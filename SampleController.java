package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.InputMethodEvent;

public class SampleController {
    public Label login;
    public Label username;
    public PasswordField password;


    public void saysuccessfulllyloggedin(ActionEvent actionEvent) {
        login.setText("successfullyloggedin");
    }

    public void sayentercoorectusername(ActionEvent actionEvent) {username.setText("enter correct username"); }

    public void sayentercoorectpassword(ActionEvent actionEvent) {password.setText("enter correct password");

    }
}
