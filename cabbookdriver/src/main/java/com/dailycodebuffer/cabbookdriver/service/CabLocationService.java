package com.dailycodebuffer.cabbookdriver.service;


import com.dailycodebuffer.cabbookdriver.constant.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String,Object> KafkaTemplate;
    public boolean updateLocation(String location){
        KafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }

}



