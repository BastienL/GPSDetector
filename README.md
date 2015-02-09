GPSDetector
===========

Features
--------

- PhoneGap plugin used to detect if the GPS if enabled or disabled on the device
- Compatible with Cordova 2.2.0 to 3.1.0 (older and newer versions not tested)
- Tested (and working) on Android 4.4 KitKat (Nexus 5)


Setup
-----

- `cordova plugin add https://github.com/vsych/GPSDetector.git`

Usage
-----

Use the plugin like so:

    <script type="text/javascript">
		document.addEventListener("deviceready", onDeviceReady, false);
		
		function onDeviceReady() {
		
			var checkButton = document.getElementById("check");
			
			checkButton.onclick = function() {
				GPSDetector.checkGPS(onGPSSuccess, onGPSError);
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
