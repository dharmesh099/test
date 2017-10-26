package com.gcm.demo;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Dharmesh on 9/5/2016.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService {
    //If the token is changed registering the device again
    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GCMRegistrationIntentService.class);
        startService(intent);
    }
}
