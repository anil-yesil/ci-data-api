package gov.turkpatent.ci_data_api.model;

import lombok.Value;

@Value
public class CIEntity {

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
