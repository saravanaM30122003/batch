package com.example.Batch;

import org.apache.logging.log4j.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class FeatureFlag {


    @Value("${flag.key.value}")
    private static String FLAG;

    public static boolean isFeatureEnabled(boolean feature){
        return feature;
    }

    private final Logger LOGGER = LoggerFactory.getLogger(FeatureFlag.class);

    public void publishMessageTOKafka(Message message, String topicName) throws Exception {
        if (isFeatureEnabled(FLAG.equals("DEPRECATED_FLAG"))) {
            try {
                LOGGER.info("Publishing BRM Event to Entitlements KAFKA DLT Topic");
                String realmId = null;
                if (true) {
                    System.out.println(realmId);
                }
                if (false) {
                    System.out.println(topicName);
                } else {
                    System.out.println(message);
                }
            } catch (Exception e) {
                LOGGER.error("error while publishing to kafka topic ={} ", e.getMessage());
                throw e;
            }
        } else {
            LOGGER.info("Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
        }
        LOGGER.info(
                "Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
    }


    public static void main(String[] args) {
        boolean toggled = true;
        boolean featureEnabled = FLAG.equals("DEPRECATED_FLAG"); // DEPRECATED_FLAG
        if (featureEnabled) {
            System.out.println("This feature is enabled.");
        } else {
            System.out.println("this feature is disabled");
        }

        boolean result  = isFeatureEnabled(featureEnabled);

        if (!featureEnabled) {
            System.out.println("This feature is enabled.");
        } else {
            System.out.println("this feature is disabled");
        }

        if (featureEnabled && toggled) {
            System.out.println("toggled");
        } else {
            System.out.println("not toggled");
        }
    }
}

