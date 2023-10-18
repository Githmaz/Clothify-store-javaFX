package service.imlp;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.net.URL;

@AllArgsConstructor
public class LoginService {

    private BorderPane background;
    public void setCenter(URL resource) throws IOException {
        if (resource != null){
            background.setCenter(FXMLLoader.load(resource));
        }else {
            System.out.println("FXML file not found: overview.fxml");
        }
    }

}
