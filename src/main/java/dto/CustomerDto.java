package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerDto {
    private String customer_ID;
    private String customer_name;
    private String customer_PN;
    private String Customer_Email;
    private String register_DateandTime;

}
