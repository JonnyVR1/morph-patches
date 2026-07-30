package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.ProductData;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;
import p149l.aag0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
public class MessagingAnalytics {
    private static final int DEFAULT_PRODUCT_ID = 111881503;
    private static final String DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF = "export_to_big_query";
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";
    private static final String MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED = "delivery_metrics_exported_to_big_query_enabled";
    private static final String REENGAGEMENT_MEDIUM = "notification";
    private static final String REENGAGEMENT_SOURCE = "Firebase";

    public static boolean deliveryMetricsExportToBigQueryEnabled() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            FirebaseApp.getInstance();
            Context applicationContext = FirebaseApp.getInstance().getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF)) {
                return sharedPreferences.getBoolean(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF, false);
            }
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED)) {
                return applicationInfo.metaData.getBoolean(MANIFEST_DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_ENABLED, false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    public static MessagingClientEvent eventToProto(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder priority = MessagingClientEvent.newBuilder().setTtl(getTtl(extras)).setEvent(event).setInstanceId(getInstanceId(extras)).setPackageName(getPackageName()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(getMessageTypeForFirelog(extras)).setPriority(getMessagePriorityForFirelog(extras));
        String messageId = getMessageId(extras);
        if (messageId != null) {
            priority.setMessageId(messageId);
        }
        String topic = getTopic(extras);
        if (topic != null) {
            priority.setTopic(topic);
        }
        String collapseKey = getCollapseKey(extras);
        if (collapseKey != null) {
            priority.setCollapseKey(collapseKey);
        }
        String messageLabel = getMessageLabel(extras);
        if (messageLabel != null) {
            priority.setAnalyticsLabel(messageLabel);
        }
        String composerLabel = getComposerLabel(extras);
        if (composerLabel != null) {
            priority.setComposerLabel(composerLabel);
        }
        long projectNumber = getProjectNumber(extras);
        if (projectNumber > 0) {
            priority.setProjectNumber(projectNumber);
        }
        return priority.build();
    }

    @Nullable
    public static String getCollapseKey(Bundle bundle) {
        return bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @Nullable
    public static String getComposerId(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
    }

    @Nullable
    public static String getComposerLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.COMPOSER_LABEL);
    }

    @NonNull
    public static String getInstanceId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.f11465TO);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) tfi0.m188729a(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    @Nullable
    public static String getMessageChannel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_CHANNEL);
    }

    @Nullable
    public static String getMessageId(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.MSGID);
        return string == null ? bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    @Nullable
    public static String getMessageLabel(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_LABEL);
    }

    @NonNull
    private static int getMessagePriority(String str) {
        if (com.clevertap.android.sdk.Constants.PRIORITY_HIGH.equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static int getMessagePriorityForFirelog(Bundle bundle) {
        int priority = getPriority(bundle);
        if (priority == 2) {
            return 5;
        }
        return priority == 1 ? 10 : 0;
    }

    @Nullable
    public static String getMessageTime(Bundle bundle) {
        return bundle.getString(Constants.AnalyticsKeys.MESSAGE_TIMESTAMP);
    }

    @NonNull
    public static MessagingClientEvent.MessageType getMessageTypeForFirelog(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? MessagingClientEvent.MessageType.DATA_MESSAGE : MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    @NonNull
    public static String getMessageTypeForScion(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? "data" : Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION;
    }

    @NonNull
    public static String getPackageName() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    @NonNull
    public static int getPriority(Bundle bundle) {
        String string = bundle.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(bundle.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    @Nullable
    public static long getProjectNumber(Bundle bundle) {
        if (bundle.containsKey(Constants.MessagePayloadKeys.SENDER_ID)) {
            try {
                return Long.parseLong(bundle.getString(Constants.MessagePayloadKeys.SENDER_ID));
            } catch (NumberFormatException unused) {
            }
        }
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException unused2) {
            }
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        try {
            if (!applicationId.startsWith("1:")) {
                return Long.parseLong(applicationId);
            }
            String[] strArrSplit = applicationId.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    @Nullable
    public static String getTopic(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @NonNull
    public static int getTtl(Bundle bundle) {
        Object obj = bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Nullable
    public static String getUseDeviceTime(Bundle bundle) {
        if (bundle.containsKey(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME)) {
            return bundle.getString(Constants.AnalyticsKeys.MESSAGE_USE_DEVICE_TIME);
        }
        return null;
    }

    private static boolean isDirectBootMessage(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void logNotificationDismiss(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_DISMISS, intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND, intent.getExtras());
    }

    public static void logNotificationOpen(Bundle bundle) {
        setUserPropertyIfRequired(bundle);
        logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_OPEN, bundle);
    }

    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion(Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE, intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            logToFirelog(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    private static void logToFirelog(MessagingClientEvent.Event event, Intent intent, @Nullable TransportFactory transportFactory) {
        if (transportFactory == null) {
            Log.e(Constants.TAG, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent messagingClientEventEventToProto = eventToProto(event, intent);
        if (messagingClientEventEventToProto == null) {
            return;
        }
        try {
            transportFactory.getTransport(Constants.FirelogAnalytics.FCM_LOG_SOURCE, MessagingClientEventExtension.class, Encoding.m9292of("proto"), new Transformer() { // from class: l.w000
                @Override // com.google.android.datatransport.Transformer
                public final Object apply(Object obj) {
                    return ((MessagingClientEventExtension) obj).toByteArray();
                }
            }).send(Event.ofData(MessagingClientEventExtension.newBuilder().setMessagingClientEvent(messagingClientEventEventToProto).build(), ProductData.withProductId(Integer.valueOf(intent.getIntExtra(Constants.MessagePayloadKeys.PRODUCT_ID, DEFAULT_PRODUCT_ID)))));
        } catch (RuntimeException unused) {
        }
    }

    @VisibleForTesting
    public static void logToScion(String str, Bundle bundle) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String composerId = getComposerId(bundle);
            if (composerId != null) {
                bundle2.putString("_nmid", composerId);
            }
            String composerLabel = getComposerLabel(bundle);
            if (composerLabel != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_NAME, composerLabel);
            }
            String messageLabel = getMessageLabel(bundle);
            if (!TextUtils.isEmpty(messageLabel)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_LABEL, messageLabel);
            }
            String messageChannel = getMessageChannel(bundle);
            if (!TextUtils.isEmpty(messageChannel)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_CHANNEL, messageChannel);
            }
            String topic = getTopic(bundle);
            if (topic != null) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_TOPIC, topic);
            }
            String messageTime = getMessageTime(bundle);
            if (messageTime != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_TIME, Integer.parseInt(messageTime));
                } catch (NumberFormatException unused) {
                }
            }
            String useDeviceTime = getUseDeviceTime(bundle);
            if (useDeviceTime != null) {
                try {
                    bundle2.putInt(Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, Integer.parseInt(useDeviceTime));
                } catch (NumberFormatException unused2) {
                }
            }
            String messageTypeForScion = getMessageTypeForScion(bundle);
            if (Constants.ScionAnalytics.EVENT_NOTIFICATION_RECEIVE.equals(str) || Constants.ScionAnalytics.EVENT_NOTIFICATION_FOREGROUND.equals(str)) {
                bundle2.putString(Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, messageTypeForScion);
            }
            if (Log.isLoggable(Constants.TAG, 3)) {
                bundle2.toString();
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
            Log.e(Constants.TAG, "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(DELIVERY_METRICS_EXPORT_TO_BIG_QUERY_PREF, z).apply();
    }

    private static void setUserPropertyIfRequired(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString(Constants.AnalyticsKeys.TRACK_CONVERSIONS))) {
            Log.isLoggable(Constants.TAG, 3);
            return;
        }
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
        Log.isLoggable(Constants.TAG, 3);
        if (analyticsConnector != null) {
            String string = bundle.getString(Constants.AnalyticsKeys.COMPOSER_ID);
            analyticsConnector.setUserProperty(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", REENGAGEMENT_SOURCE);
            bundle2.putString("medium", REENGAGEMENT_MEDIUM);
            bundle2.putString("campaign", string);
            analyticsConnector.logEvent(Constants.ScionAnalytics.ORIGIN_FCM, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle2);
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(Constants.AnalyticsKeys.ENABLED));
    }
}
