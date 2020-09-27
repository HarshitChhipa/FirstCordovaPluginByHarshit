package org.apache.cordova.FirstCordovaPluginByHarshit;

import android.util.Log;

import java.util.*;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.*;


public class FirstCordovaPluginByHarshit extends CordovaPlugin {
    String TAG = "FirstCordovaPluginByHarshit";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.d(TAG, "Initializing the Cordova plugin");
    }

    public boolean execute (String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if(action.equals("sayMyName")) {
            String phrase = args.getString(0);
            // Echoing the args passed by user
            Log.d(TAG, phrase);
        } else if (action.equals("sayTheDate")){
            // Returning the date back to the web player
            final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toString());
            callbackContext.sendPluginResult(result);
        }
        return true;
    }
}
