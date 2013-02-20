GPSDetector
===========

Features
--------

- Plugin used to detect if the GPS if enabled or disabled on the device
- Compatible with Cordova 2.2.0 (older versions not tested)

Setup
-----

- Create a package called `com.butterflyeffect.plugins` within your project's src folder and copy `GPSDetectionPlugin.java` file into that new package.

- Add a plugin line to `res/xml/config.xml` :

    `<plugin name="GpsDetectionPlugin" value="com.butterflyeffect.plugins.GPSDetectionPlugin"/>`
    
- Copy `gpsDetectionPlugin.js` from `assets/www/js` to the appropriate location in your project (e.g. `assets/www/js`)
  and include it in your HTML file after the Cordova script
  
- Add the following permissions to your `AndroidManifest.xml` file :

	`<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />`
	`<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />`
	`<uses-permission android:name="android.permission.ACCESS_LOCATION_EXTRA_COMMANDS" />`
	
- Refresh your Android project

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
		}
	</script>

See also the sample project in the repository.