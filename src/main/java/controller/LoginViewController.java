package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import lombok.Data;
import service.imlp.LoginService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
@Data
public class LoginViewController implements Initializable {

    @FXML
    private JFXButton btn_LogIN;

    @FXML
    private Text btn_forgetPassword;

    @FXML
    private JFXTextField txt_password;

    @FXML
    private JFXTextField txt_username;

    @FXML
    private BorderPane Background;

    private LoginService loginService;

    @FXML
    void Login(MouseEvent event) throws IOException {
        loginService.setCenter(getClass().getResource("/view/Dashboard/DashBoard.fxml"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginService = new LoginService(Background);
    }
}
