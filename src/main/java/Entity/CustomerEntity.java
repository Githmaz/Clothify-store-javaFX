package Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

@Data
@AllArgsConstructor
public class CustomerEntity {
    @Id
    private String customer_ID;
    private String customer_name;
    private String customer_PN;
    private String Customer_Email;
    private String register_DateandTime;
}
