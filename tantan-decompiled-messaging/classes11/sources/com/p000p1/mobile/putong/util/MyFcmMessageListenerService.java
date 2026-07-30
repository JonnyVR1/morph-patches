package com.p000p1.mobile.putong.util;

import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.fcm.a;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p009l.w85;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/p1/mobile/putong/util/MyFcmMessageListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "getBundleFromRemoteMessage", "Landroid/os/Bundle;", "remoteMessage", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class MyFcmMessageListenerService extends FirebaseMessagingService {
    private final Bundle getBundleFromRemoteMessage(RemoteMessage remoteMessage) {
        Bundle bundle = null;
        try {
            Field declaredField = RemoteMessage.class.getDeclaredField("bundle");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(remoteMessage);
            if (obj instanceof Bundle) {
                bundle = (Bundle) obj;
            }
        } catch (Exception unused) {
        }
        if (bundle == null) {
            bundle = new Bundle();
            Map data = remoteMessage.getData();
            data.getClass();
            for (Map.Entry entry : data.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(@NotNull RemoteMessage message) {
        message.getClass();
        super.onMessageReceived(message);
        new a().a(getApplicationContext(), message);
        Bundle bundleFromRemoteMessage = getBundleFromRemoteMessage(message);
        if (bundleFromRemoteMessage != null) {
            w85.INSTANCE.m24001o(bundleFromRemoteMessage);
        }
    }
}
