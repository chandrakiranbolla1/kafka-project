package com.dailycodebuffer.cabbookuser.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "Cab-location", groupId = "user-group")
    public void cabLoaction(String location){
        System.out.println(location);
    }
}
