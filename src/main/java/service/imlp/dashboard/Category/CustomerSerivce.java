package service.imlp.dashboard.Category;

import com.jfoenix.controls.JFXTextField;
import dao.customer.CustomerDao;
import dao.customer.impl.CustomerDaoImpl;
import dto.CustomerDto;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class CustomerSerivce {
    CustomerDao customerDao = new CustomerDaoImpl();
    public void saveCustomer(CustomerDto tempCustomer) throws SQLException, ClassNotFoundException {
        customerDao.save(tempCustomer);
    }
}
