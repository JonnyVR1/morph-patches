package com.clevertap.android.sdk.pushnotification.fcm;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Logger;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import p153l.b1m;

/* JADX INFO: renamed from: com.clevertap.android.sdk.pushnotification.fcm.b */
/* JADX INFO: loaded from: classes.dex */
class C1333b implements b1m<RemoteMessage> {
    @Override // p153l.b1m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bundle mo6989a(@NonNull RemoteMessage remoteMessage) {
        try {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : remoteMessage.getData().entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            Logger.m5920d("PushProvider", "FCMFound Valid Notification Message ");
            return bundle;
        } catch (Throwable th) {
            Logger.m5921d("PushProvider", "FCMInvalid Notification Message ", th);
            return null;
        }
    }
}
