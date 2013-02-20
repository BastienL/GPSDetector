cordova.define('cordova/plugin/gpsDetectionPlugin', function(require, exports, module) {
    var exec = require('cordova/exec')

    var GpsDetect = function() {}

    GpsDetect.prototype.checkGPS = function(successCallback, failureCallback) {
    	exec(successCallback, failureCallback, 'GpsDetectionPlugin', 'gpsDetection', []);
    };
    
    module.exports = new GpsDetect();
});