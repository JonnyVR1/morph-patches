package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import p149l.sfd0;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private sfd0 rpc;

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            Log.isLoggable(Constants.TAG, 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (NotificationParams.isNotification(extras)) {
            NotificationParams notificationParams = new NotificationParams(extras);
            ExecutorService executorServiceNewNetworkIOExecutor = FcmExecutors.newNetworkIOExecutor();
            try {
                if (new DisplayNotification(this, notificationParams, executorServiceNewNetworkIOExecutor).handleNotification()) {
                    executorServiceNewNetworkIOExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewNetworkIOExecutor.shutdown();
                    if (MessagingAnalytics.shouldUploadScionMetrics(intent)) {
                        MessagingAnalytics.logNotificationForeground(intent);
                    }
                }
            } catch (Throwable th) {
                executorServiceNewNetworkIOExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        return stringExtra == null ? intent.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER) : stringExtra;
    }

    private sfd0 getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new sfd0(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID))) {
            passMessageIntentToSdk(intent);
        }
        getRpc(this).m183916b(new CloudMessage(intent));
    }

    private void passMessageIntentToSdk(Intent intent) {
        String stringExtra = intent.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        if (stringExtra == null) {
            stringExtra = Constants.MessageTypes.MESSAGE;
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                MessagingAnalytics.logNotificationReceived(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new SendException(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra(Constants.MessagePayloadKeys.MSGID));
                break;
        }
    }

    @VisibleForTesting
    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public Intent getStartCommandIntent(Intent intent) {
        return ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra("token"));
        } else {
            intent.getAction();
        }
    }

    @WorkerThread
    public void onDeletedMessages() {
    }

    @WorkerThread
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @WorkerThread
    public void onMessageSent(@NonNull String str) {
    }

    @WorkerThread
    public void onNewToken(@NonNull String str) {
    }

    @WorkerThread
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    @VisibleForTesting
    public void setRpcForTesting(sfd0 sfd0Var) {
        this.rpc = sfd0Var;
    }
}
