package com.clevertap.android.sdk.pushnotification.fcm;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import p153l.ptl;

/* JADX INFO: loaded from: classes.dex */
public class FcmMessageListenerService extends FirebaseMessagingService {
    private ptl mHandler = new C1332a();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        this.mHandler.mo6987a(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        super.onNewToken(str);
        this.mHandler.mo6988b(getApplicationContext(), str);
    }
}
