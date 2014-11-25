# SettingOpener

> Setting Opener plugin for Android. This allows you to Open Settings Pages Programmatically.

## Installation:

    npm install -g cordova # if you don't have cordova
    cordova create MyProjectFolder com.my.project MyProject && cd MyProjectFolder # if you are just starting
    cordova plugin add https://github.com/Moussawi7/Cordova-SettingOpener
	
## Usage
The plugin creates the object window.plugins.SettingOpener

After onDeviceReady, create a local var and startup the plugin like so;

	function onDeviceReady() {
    window.plugins.SettingOpener.Open("ACTION_ADD_ACCOUNT",function(){
	  //Operation Success
	},function(e){
	  //Operation Fail with error message e
	});
	}
####Arguments:
Based on Android Setting Provider http://developer.android.com/reference/android/provider/Settings.html.
User can pass one of the Following arguments.

	1)	ACTION_ADD_ACCOUNT:  Show add account screen for creating a new account. 
	2)	ACTION_BLUETOOTH_SETTINGS : Show settings to allow configuration of Bluetooth. 
	3)  ACTION_DATA_ROAMING_SETTINGS: Show settings for selection of 2G/3G. 
	4)  ACTION_DATE_SETTINGS : Show settings to allow configuration of date and time. 
	5)  ACTION_DISPLAY_SETTINGS : Show settings to allow configuration of display. 
	6)  ACTION_LOCATION_SOURCE_SETTINGS : Show settings to allow configuration of current location sources. 
	7)  ACTION_MANAGE_APPLICATIONS_SETTINGS : Show settings to manage installed applications. 
	8)  ACTION_MEMORY_CARD_SETTINGS : Show settings for memory card storage. 
	9)  ACTION_SETTINGS : Show system settings. 
	10) ACTION_WIRELESS_SETTINGS : Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks. 


> Note that using non-listed action will cause the plugin to fail with error message INVALID_ACTION .

## License ##

The MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.