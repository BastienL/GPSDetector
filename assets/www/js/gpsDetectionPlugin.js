cordova.define('cordova/plugin/gpsDetectionPlugin', function(require, exports, module) {
    var exec = require('cordova/exec');

    var gpsDetect = function() {};

    gpsDetect.prototype.checkGPS = function(successCallback, failureCallback) {
    	exec(successCallback, failureCallback, 'GpsDetectionPlugin', 'gpsDetection', []);
    };
    
    var gpsDetect = new gpsDetect();
    module.exports = gpsDetect;
});