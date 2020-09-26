/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/
package org.apache.cordova.device;

import java.util.TimeZone;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.provider.Settings;

public class FirstCordovaPluginByHarshit extends CordovaPlugin {
    public static final String TAG = "FirstCordovaPluginByHarshit";

    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.d(TAG, 'Initializing the Cordova plugin');
    }

    public boolean execute (String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if(action.equals("sayMyName")) {
            String phrase = args.getString(0);
            // Echoing the args passed by user
            Log.d(TAG, phrase)
        } else if (action.equals("sayTheDate")){
            // Returing the date back to the web player
            final pluginResult result = new PluginResult(PluginResult.Status.OK, (new Date()).toSting());
            callbackContext.sendPluginResult(result)
        }
        return true;
    }
}
