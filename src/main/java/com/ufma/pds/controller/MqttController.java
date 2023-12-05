package com.ufma.pds.controller;

import com.ufma.pds.service.MqttService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqtt")
public class MqttController {

    private final MqttService mqttService;
    public MqttController(MqttService mqttService) {
        this.mqttService = mqttService;
    }
    //teste commit
    @PostMapping("/sendMessage")
    public ResponseEntity<?> publish(@RequestBody String mqttMessage){
        return ResponseEntity.ok(mqttService.sendMessage(mqttMessage));
    }
}
