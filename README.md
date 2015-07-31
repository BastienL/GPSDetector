GPSDetector
===========

Features
--------

- PhoneGap plugin used to detect if the GPS if enabled or disabled on the device, and able to open Location Settings and activate them manually
- Compatible with Cordova 2.2.0 to 3.1.0 (older and newer versions not tested)
- Tested (and working) on Android 4.4 KitKat (Nexus 5)


Setup
-----

- Create a package called `com.butterflyeffect.plugins` within your project's src folder and copy `GPSDetectionPlugin.java` file into that new package.

- Copy `gpsDetectionPlugin.js` from `assets/www/js` to the appropriate location in your project (e.g. `assets/www/js`)
  and include it in your HTML file after the Cordova script
  
- Add the following permissions to your `AndroidManifest.xml` file :

	`<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />`
	`<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />`
	`<uses-permission android:name="android.permission.ACCESS_LOCATION_EXTRA_COMMANDS" />`
	
- Refresh your Android project



**For Phonegap >= 3.0 :**

- Add a feature line to `res/xml/config.xml` :

    `<feature name="GpsDetectionPlugin">`
		`<param name="android-package" value="com.butterflyeffect.plugins.GPSDetectionPlugin" />`
    `</feature>`

**For Phonegap < 3.0 :**

- Add a plugin line to `res/xml/config.xml` :

    `<plugin name="GpsDetectionPlugin" value="com.butterflyeffect.plugins.GPSDetectionPlugin"/>`
    

Usage
-----

Use the plugin like so:

    <script type="text/javascript" charset="utf-8" src="./js/gpsDetectionPlugin.js"></script>
    <script type="text/javascript">
		document.addEventListener("deviceready", onDeviceReady, false);
		
		function onDeviceReady() {
		
			gpsDetect = cordova.require('cordova/plugin/gpsDetectionPlugin');
		
			var checkButton = document.getElementById("check");
			
			checkButton.onclick = function() {
				gpsDetect.checkGPS(onGPSSuccess, onGPSError);
			} 
			
			function onGPSSuccess(on) {
				if (on) alert("GPS is enabled");
				else alert("GPS is disabled");
			}
			
			function onGPSError(e) {
				alert("Error : "+e);
			}
			
			var openSettingsButton = document.getElementById("openSettings");

			openSettingsButton.onclick = function() {
				gpsDetect.switchToLocationSettings(onSwitchToLocationSettingsSuccess, onSwitchToLocationSettingsError);
			}

			function onSwitchToLocationSettingsSuccess() {

			}

			function onSwitchToLocationSettingsError(e) {
				alert("Error : "+e);
			}
		}
	</script>

See also the sample project (PhoneGap 3.1) in the repository.
