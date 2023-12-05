package com.ufma.pds.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ufma.pds.resource.MQTTGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MqttService {
    private final MQTTGateway mqttGateway;

    public MqttService(MQTTGateway mqttGateway) {
        this.mqttGateway = mqttGateway;
    }

    public String sendMessage(String message){
        try {
            JsonObject convertObject = new Gson().fromJson(message, JsonObject.class);
            mqttGateway.sendToMqtt(convertObject.get("message").toString(), convertObject.get("topic").toString());
            return "Sucesso ao enviar mensagem!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Falha ao Enviar Mensagem";
        }
    }
}
