package com.example.Batch;

import org.apache.logging.log4j.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class FeatureFlag {






    public static void main(String[] args) {
        boolean toggled = true;
            System.out.println("This feature is enabled.");

        boolean result  = isFlag(featureEnabled);

            try {
                String realmId = null;
                if (toggled) {
                    System.out.println(realmId);
                }
                if (toggled) {
                    System.out.println("topicName");
            } catch (Exception e) {
                throw e;
            }
        } else {
            System.out.println("Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
        }
        System.out.println(
                "Skipping publishing BRM Event to KAFKA Topic as toggle AMO_KAFKA_ENABLED is disabled");
    }
    public static boolean isFlag(boolean feature){
        return true;
    }

}


