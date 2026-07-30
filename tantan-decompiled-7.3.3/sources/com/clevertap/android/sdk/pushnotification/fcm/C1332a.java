package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.pushnotification.PushNotificationHandler;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import p153l.b1m;
import p153l.gmb0;
import p153l.olg;
import p153l.ptl;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.fcm.a */
/* JADX INFO: loaded from: classes.dex */
public class C1332a implements ptl {

    /* JADX INFO: renamed from: a */
    private final b1m<RemoteMessage> f5492a;

    public C1332a() {
        this(new C1333b());
    }

    @Override // p153l.ptl
    /* JADX INFO: renamed from: a */
    public boolean mo6987a(Context context, RemoteMessage remoteMessage) {
        Bundle bundleMo6989a = this.f5492a.mo6989a(remoteMessage);
        if (bundleMo6989a == null) {
            return false;
        }
        return PushNotificationHandler.m6977d().mo6979a(context, new olg(bundleMo6989a).m168108a(remoteMessage).getMessageBundle(), FirebaseMessaging.INSTANCE_ID_SCOPE);
    }

    @Override // p153l.ptl
    /* JADX INFO: renamed from: b */
    public boolean mo6988b(Context context, String str) {
        try {
            PushNotificationHandler.m6977d().mo6980b(context, str, gmb0.f104964a);
            Logger.m5920d("PushProvider", "FCMNew token received from FCM - " + str);
            return true;
        } catch (Throwable th) {
            Logger.m5921d("PushProvider", "FCMError onNewToken", th);
            return false;
        }
    }

    public C1332a(b1m<RemoteMessage> b1mVar) {
        this.f5492a = b1mVar;
    }
}
