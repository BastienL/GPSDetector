package com.butterflyeffect.gpsdetector;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;
import android.os.Bundle;

public class MainActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        super.init();
        super.loadUrl(Config.getStartUrl());
    }
    
}