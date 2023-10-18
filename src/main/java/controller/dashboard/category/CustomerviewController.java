package controller.dashboard.category;

import com.jfoenix.controls.JFXTextField;
import dao.customer.CustomerDao;
import dao.customer.impl.CustomerDaoImpl;
import dto.CustomerDto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lombok.Data;
import lombok.Getter;
import javafx.scene.input.MouseEvent;
import service.imlp.dashboard.Category.CustomerSerivce;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

@Data
public class CustomerviewController implements Initializable {

    @FXML
    private Label lblCustomerID;

    @FXML
    private Label lblDandT;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtcontact;

    private CustomerSerivce customerSerivce;


    @FXML
    void addCustomer(MouseEvent event) throws SQLException, ClassNotFoundException {
        customerSerivce.saveCustomer(new CustomerDto(lblCustomerID.getText(),txtName.getText(),txtEmail.getText(),txtcontact.getText(),lblDandT.getText()));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        customerSerivce = new CustomerSerivce();
    }
}