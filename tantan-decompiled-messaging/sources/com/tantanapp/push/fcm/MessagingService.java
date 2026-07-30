package com.tantanapp.push.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p149l.ckg;
import p149l.edk0;

/* JADX INFO: loaded from: classes13.dex */
public class MessagingService extends FirebaseMessagingService {
    private static final String TAG = "fcm";

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (edk0.f90613c) {
            remoteMessage.getFrom();
            remoteMessage.getTo();
            remoteMessage.getCollapseKey();
            remoteMessage.getMessageId();
            remoteMessage.getMessageType();
            remoteMessage.getSentTime();
            remoteMessage.getTtl();
            if (NullChecker.m81303a(remoteMessage.getData())) {
                for (Map.Entry<String, String> entry : remoteMessage.getData().entrySet()) {
                    entry.getKey();
                    entry.getValue();
                }
            }
            if (NullChecker.m81303a(remoteMessage.getNotification())) {
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
        ckg.m107410m().m107411n(remoteMessage.getData().get("custom"));
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        ckg.m107410m().m107412o(str);
        String str2 = edk0.f90611a;
    }
}
