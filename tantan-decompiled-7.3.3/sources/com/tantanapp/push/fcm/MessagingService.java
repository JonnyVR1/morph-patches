package com.tantanapp.push.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p153l.kmk0;
import p153l.qlg;

/* JADX INFO: loaded from: classes12.dex */
public class MessagingService extends FirebaseMessagingService {
    private static final String TAG = "fcm";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (kmk0.f127510c) {
            remoteMessage.getFrom();
            remoteMessage.getTo();
            remoteMessage.getCollapseKey();
            remoteMessage.getMessageId();
            remoteMessage.getMessageType();
            remoteMessage.getSentTime();
            remoteMessage.getTtl();
            if (NullChecker.m82486a(remoteMessage.getData())) {
                for (Map.Entry<String, String> entry : remoteMessage.getData().entrySet()) {
                    entry.getKey();
                    entry.getValue();
                }
            }
            if (NullChecker.m82486a(remoteMessage.getNotification())) {
                RemoteMessage.Notification notification = remoteMessage.getNotification();
                Objects.toString(notification);
                notification.getTitle();
                notification.getTitleLocalizationKey();
                Arrays.toString(notification.getTitleLocalizationArgs());
                notification.getBody();
                notification.getBodyLocalizationKey();
                Arrays.toString(notification.getBodyLocalizationArgs());
                notification.getIcon();
                notification.getSound();
                notification.getTag();
                notification.getColor();
                notification.getClickAction();
                Objects.toString(notification.getLink());
            }
        }
        qlg.m177000m().m177001n(remoteMessage.getData().get("custom"));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        qlg.m177000m().m177002o(str);
        String str2 = kmk0.f127508a;
    }
}
