package com.clevertap.android.sdk.pushnotification.fcm;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.pushnotification.PushNotificationHandler;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import p149l.akg;
import p149l.ceb0;
import p149l.crl;
import p149l.iyl;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.fcm.a */
/* JADX INFO: loaded from: classes.dex */
public class C1309a implements crl {

    /* JADX INFO: renamed from: a */
    private final iyl<RemoteMessage> f5455a;

    public C1309a() {
        this(new C1310b());
    }

    @Override // p149l.crl
    /* JADX INFO: renamed from: a */
    public boolean mo6933a(Context context, RemoteMessage remoteMessage) {
        Bundle bundleMo6935a = this.f5455a.mo6935a(remoteMessage);
        if (bundleMo6935a == null) {
            return false;
        }
        return PushNotificationHandler.m6923d().mo6925a(context, new akg(bundleMo6935a).m97146a(remoteMessage).getMessageBundle(), FirebaseMessaging.INSTANCE_ID_SCOPE);
    }

    @Override // p149l.crl
    /* JADX INFO: renamed from: b */
    public boolean mo6934b(Context context, String str) {
        try {
            PushNotificationHandler.m6923d().mo6926b(context, str, ceb0.f80450a);
            Logger.m5866d("PushProvider", "FCMNew token received from FCM - " + str);
            return true;
        } catch (Throwable th) {
            Logger.m5867d("PushProvider", "FCMError onNewToken", th);
            return false;
        }
    }

    public C1309a(iyl<RemoteMessage> iylVar) {
        this.f5455a = iylVar;
    }
}
