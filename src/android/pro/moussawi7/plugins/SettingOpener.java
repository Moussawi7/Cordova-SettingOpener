package pro.moussawi7.plugins;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class SettingOpener extends CordovaPlugin {

	private String get_operation(String action){
		String operation;
	    if(action.equals("ACTION_ADD_ACCOUNT")){
	    	operation=android.provider.Settings.ACTION_ADD_ACCOUNT;
	        }
	        else if(action.equals("ACTION_BLUETOOTH_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_BLUETOOTH_SETTINGS;
	        }
	        else if(action.equals("ACTION_DATA_ROAMING_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS;
	        }
	        else if(action.equals("ACTION_DATE_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_DATE_SETTINGS;
	        }
	        else if(action.equals("ACTION_DISPLAY_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_DISPLAY_SETTINGS;
	        }
	        else if(action.equals("ACTION_LOCATION_SOURCE_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS;
	        }
	        else if(action.equals("ACTION_MANAGE_APPLICATIONS_SETTINGS")){
	         	operation=android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS;
	        }
	        else if(action.equals("ACTION_MEMORY_CARD_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS;
	        }
	        else if(action.equals("ACTION_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_SETTINGS;
	        }
	        else if(action.equals("ACTION_WIRELESS_SETTINGS")){
	        	operation=android.provider.Settings.ACTION_WIRELESS_SETTINGS;
	        }
	        else{
	        	operation= "INVALID_ACTION";
	        }
	    return operation;
	}
  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    try {
      String operation=this.get_operation(action);
      if(operation.equals("INVALID_ACTION")){
    	  callbackContext.error(operation);
    	  return false;
      }
    	Context context=this.cordova.getActivity().getApplicationContext();
        Intent dialogIntent = new Intent(operation);
               dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(dialogIntent);
        callbackContext.success();
       return true;
    } catch (Exception e) {
      callbackContext.error(e.getMessage());
      return false;
    }
  }

}
