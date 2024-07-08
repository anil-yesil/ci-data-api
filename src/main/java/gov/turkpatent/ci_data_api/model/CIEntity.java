package gov.turkpatent.ci_data_api.model;

import jakarta.persistence.*;
import lombok.Value;

@Entity
@Value
public class CIEntity {

    @Id
    Long id;
    String name;
    String CItype;
    String applicationDate;
    int applicationNumber;
    String productType;
    String province;
    String applicant;
    String status;
    String address;
    String photoURL;

}
