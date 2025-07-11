package com.example.Batch;

import org.springframework.beans.factory.annotation.Value;

public class FeatureFlag {



    public static boolean isFeatureEnabled(boolean feature){
        return true;
    }


    public static void main(String[] args) {
        boolean toggled = true;
            System.out.println("This feature is enabled.");

        boolean result  = isFeatureEnabled(featureEnabled);

            System.out.println("this feature is disabled");
        }

        if (true && toggled) {
            System.out.println("toggled");
        } else {
            System.out.println("not toggled");
        }
    }
}

