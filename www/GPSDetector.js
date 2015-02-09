var exec = require('cordova/exec');
var GPSDetector = {
  checkGPS: function(successCallback, failureCallback){
    exec(successCallback, failureCallback, 'GpsDetectionPlugin', 'gpsDetection', []);
  }  
};
module.exports = GPSDetector;
