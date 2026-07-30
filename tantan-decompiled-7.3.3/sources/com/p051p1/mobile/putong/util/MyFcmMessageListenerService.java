package com.p051p1.mobile.putong.util;

import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.fcm.C1332a;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.x95;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, m88121d2 = {"Lcom/p1/mobile/putong/util/MyFcmMessageListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "getBundleFromRemoteMessage", "Landroid/os/Bundle;", "remoteMessage", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MyFcmMessageListenerService extends FirebaseMessagingService {
    private final Bundle getBundleFromRemoteMessage(RemoteMessage remoteMessage) {
        Bundle bundle = null;
        try {
            Field declaredField = RemoteMessage.class.getDeclaredField(StickerBundle.TYPE);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(remoteMessage);
            if (obj instanceof Bundle) {
                bundle = (Bundle) obj;
            }
        } catch (Exception unused) {
        }
        if (bundle == null) {
            bundle = new Bundle();
            Map<String, String> data = remoteMessage.getData();
            data.getClass();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@NotNull RemoteMessage message) {
        message.getClass();
        super.onMessageReceived(message);
        new C1332a().mo6987a(getApplicationContext(), message);
        Bundle bundleFromRemoteMessage = getBundleFromRemoteMessage(message);
        if (bundleFromRemoteMessage != null) {
            x95.INSTANCE.m209794o(bundleFromRemoteMessage);
        }
    }
}
