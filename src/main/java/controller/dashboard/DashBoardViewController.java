package controller.dashboard;

import controller.LoginViewController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lombok.Data;
import service.imlp.dashboard.DashBoardService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Data
public class DashBoardViewController implements Initializable {

    @FXML
    private AnchorPane DashBoard_innerChild;

    @FXML
    private DashBoardService dashBoardService;

    // Calling Home page when log in
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dashBoardService = new DashBoardService(DashBoard_innerChild);
        try {
            dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Home-view.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Home button Click Event
    @FXML
    void loadHomePage(MouseEvent event) throws IOException {
        dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Home-view.fxml"));
    }

    // Supplier button Click Event
    @FXML
    void loadSupplierPage(MouseEvent event) throws IOException{
        dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Supplier-view.fxml"));
    }
    // Item Butoon Click Event
    @FXML
    void LoadItemView(MouseEvent event) throws IOException {
        dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Item-View.fxml"));
    }

    // Oder Button Click Event
    @FXML
    void loadOderView(MouseEvent event) throws IOException {
        dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Oder-View.fxml"));
    }

    // Log out button
    @FXML
    void logout(MouseEvent event) throws IOException {
        new LoginViewController().getBackground().setCenter(FXMLLoader.load(getClass().getResource("/view/Login-view.fxml")));
    }


    public void showCustomerView(MouseEvent mouseEvent) throws IOException {
        dashBoardService.showScreeen(getClass().getResource("/view/Dashboard/Category/Customer-view.fxml"));

    }
}
