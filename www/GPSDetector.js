var exec = require('cordova/exec');
var GPSDetector = {
  checkGPS: function(successCallback, failureCallback){
    exec(successCallback, failureCallback, 'GPSDetectionPlugin', 'gpsDetection', []);
  }  
};
module.exports = GPSDetector;
