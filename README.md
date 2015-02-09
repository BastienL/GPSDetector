GPSDetector
===========

Features
--------

- PhoneGap plugin used to detect if the GPS if enabled or disabled on the device

Setup
-----

- `cordova plugin add https://github.com/vsych/GPSDetector.git`

Usage
-----

Use the plugin like so:

    <script type="text/javascript" charset="utf-8" src="./js/gpsDetectionPlugin.js"></script>
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
