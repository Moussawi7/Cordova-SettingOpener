function SettingOpener() {
}

SettingOpener.prototype = {
  Open: function (action,successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "SettingOpener", action, []);
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