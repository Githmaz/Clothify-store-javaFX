package dao.customer.impl;

import Entity.CustomerEntity;
import dto.CustomerDto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.util.List;

public class CustomerDaoImpl implements dao.customer.CustomerDao {


    @Override
    public boolean save(CustomerDto dto) throws SQLException, ClassNotFoundException {
        CustomerEntity customerEntity = new CustomerEntity(dto.getCustomer_ID(),dto.getCustomer_name(),dto.getCustomer_PN(),dto.getCustomer_Email(),dto.getRegister_DateandTime());
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(CustomerEntity.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customerEntity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean update(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public List<CustomerDto> findAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String findLastId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public CustomerDto find(String s) throws SQLException, ClassNotFoundException {
        return null;
    }
}
