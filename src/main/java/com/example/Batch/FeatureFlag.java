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



    public static void main(String[] args) {
        boolean toggled = true;
        boolean featureEnabled = FLAG.equals("DEPRECATED_FLAG"); // DEPRECATED_FLAG
        if (featureEnabled) {
            System.out.println("This feature is enabled.");
        } else {
            System.out.println("this feature is disabled");
        }

        boolean result  = isFeatureEnabled(featureEnabled);

        if (featureEnabled) {
            try {
                String realmId = null;
                if (toggled) {
                    System.out.println(realmId);
                }
                if (toggled) {
                    System.out.println("topicName");
                } else {
                    System.out.println("message");
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            System.out.println("Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
        }
        System.out.println(
                "Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
    }
    }


