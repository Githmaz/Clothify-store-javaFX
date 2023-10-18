package service.imlp.dashboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.net.URL;

@AllArgsConstructor
public class DashBoardService {

    private  AnchorPane DashBoard_innerChild;
    public void showScreeen(URL resource) throws IOException {
        if (resource != null){
            DashBoard_innerChild.getChildren().clear();
            DashBoard_innerChild.getChildren().add(FXMLLoader.load(resource));
        }else {
            System.out.println("fxml file not found");
        }
    }
}
