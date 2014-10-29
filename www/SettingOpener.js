function SettingOpener() {
}

SettingOpener.prototype = {
  OpenLocation: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "SettingOpener", "OpenLocation", []);
  }
};

SettingOpener.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.SettingOpener = new SettingOpener();
  return window.plugins.SettingOpener;
};

cordova.addConstructor(SettingOpener.install);