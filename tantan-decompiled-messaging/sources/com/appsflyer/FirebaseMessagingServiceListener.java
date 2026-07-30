package com.appsflyer;

import com.google.firebase.messaging.FirebaseMessagingService;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }
}
