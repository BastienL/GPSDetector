package com.butterflyeffect.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;

import android.location.LocationManager;
import android.provider.Settings;
import android.content.Intent;

public class GPSDetectionPlugin extends CordovaPlugin {

	@Override
    public boolean execute(String action, final JSONArray args, CallbackContext callbackContext) {

    	PluginResult result = null;
        boolean gpsEnabled = false;
        String GPSDetectionAction = "gpsDetection";
        String GPSActivation = "gpsActivation";

        if (action.equals(GPSDetectionAction)) {
        	android.content.ContentResolver contentResolver = cordova.getActivity().getApplicationContext().getContentResolver();
        	gpsEnabled = Settings.Secure.isLocationProviderEnabled(contentResolver, LocationManager.GPS_PROVIDER);
        	result = new PluginResult(Status.OK, gpsEnabled);
        }
        else if(action.equals(GPSActivation)) {
            Intent settingsIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            cordova.getActivity().startActivity(settingsIntent);
        }
        else {
            result = new PluginResult(Status.INVALID_ACTION);
        }

        callbackContext.sendPluginResult(result);

        return true;
    }
}