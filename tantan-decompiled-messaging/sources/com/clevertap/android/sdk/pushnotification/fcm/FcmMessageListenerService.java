package com.clevertap.android.sdk.pushnotification.fcm;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import p149l.crl;

/* JADX INFO: loaded from: classes.dex */
public class FcmMessageListenerService extends FirebaseMessagingService {
    private crl mHandler = new C1309a();

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        this.mHandler.mo6933a(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@NonNull String str) {
        super.onNewToken(str);
        this.mHandler.mo6934b(getApplicationContext(), str);
    }
}
