package com.example.Restaurant.Model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer resId;
    private  String resName;
    private String resAddress;
    private  String resContact;
    private  String resSpeciality;
    private  Integer resStaff;
    private String resChefsSpecial;
    private String resTimings;
    private String resDeliveryType;

}
