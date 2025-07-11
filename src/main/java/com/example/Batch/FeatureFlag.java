package com.example.Batch;

import org.springframework.beans.factory.annotation.Value;

public class FeatureFlag {


    @Value("${flag.key.value}")
    private static String FLAG;


    public static void main(String[] args) {
        boolean toggled = true;
        boolean featureEnabled = FLAG.equals("DEPRECATED_FLAG"); // DEPRECATED_FLAG


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

