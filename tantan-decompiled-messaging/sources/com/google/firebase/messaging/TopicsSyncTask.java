package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
class TopicsSyncTask implements Runnable {
    private static final Object TOPIC_SYNC_TASK_LOCK = new Object();

    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    private static Boolean hasAccessNetworkStatePermission;

    @GuardedBy("TOPIC_SYNC_TASK_LOCK")
    private static Boolean hasWakeLockPermission;
    private final Context context;
    private final Metadata metadata;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;
    private final TopicsSubscriber topicsSubscriber;

    @VisibleForTesting
    public class ConnectivityChangeReceiver extends BroadcastReceiver {

        @Nullable
        @GuardedBy("this")
        private TopicsSyncTask task;

        public ConnectivityChangeReceiver(TopicsSyncTask topicsSyncTask) {
            this.task = topicsSyncTask;
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            TopicsSyncTask topicsSyncTask = this.task;
            if (topicsSyncTask == null) {
                return;
            }
            if (topicsSyncTask.isDeviceConnected()) {
                TopicsSyncTask.isLoggable();
                this.task.topicsSubscriber.scheduleSyncTaskWithDelaySeconds(this.task, 0L);
                context.unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            TopicsSyncTask.isLoggable();
            ii5.m136342l(TopicsSyncTask.this.context, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public TopicsSyncTask(TopicsSubscriber topicsSubscriber, Context context, Metadata metadata, long j) {
        this.topicsSubscriber = topicsSubscriber;
        this.context = context;
        this.nextDelaySeconds = j;
        this.metadata = metadata;
        this.syncWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    private static String createPermissionMissingLog(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean hasAccessNetworkStatePermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasAccessNetworkStatePermission;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                hasAccessNetworkStatePermission = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    private static boolean hasPermission(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable(Constants.TAG, 3)) {
            createPermissionMissingLog(str);
        }
        return z;
    }

    private static boolean hasWakeLockPermission(Context context) {
        boolean zBooleanValue;
        synchronized (TOPIC_SYNC_TASK_LOCK) {
            try {
                Boolean bool = hasWakeLockPermission;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? hasPermission(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                hasWakeLockPermission = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean isDeviceConnected() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLoggable() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (hasWakeLockPermission(this.context)) {
            this.syncWakeLock.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                try {
                    this.topicsSubscriber.setSyncScheduledOrRunning(true);
                    if (!this.metadata.isGmscorePresent()) {
                        this.topicsSubscriber.setSyncScheduledOrRunning(false);
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (hasAccessNetworkStatePermission(this.context) && !isDeviceConnected()) {
                        new ConnectivityChangeReceiver(this).registerReceiver();
                        if (hasWakeLockPermission(this.context)) {
                            try {
                                this.syncWakeLock.release();
                                return;
                            } catch (RuntimeException unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    boolean zSyncTopics = this.topicsSubscriber.syncTopics();
                    TopicsSubscriber topicsSubscriber = this.topicsSubscriber;
                    if (zSyncTopics) {
                        topicsSubscriber.setSyncScheduledOrRunning(false);
                    } else {
                        topicsSubscriber.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                    }
                    if (hasWakeLockPermission(this.context)) {
                        this.syncWakeLock.release();
                    }
                } catch (Throwable th) {
                    if (hasWakeLockPermission(this.context)) {
                        try {
                            this.syncWakeLock.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e(Constants.TAG, "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.topicsSubscriber.setSyncScheduledOrRunning(false);
                if (hasWakeLockPermission(this.context)) {
                    this.syncWakeLock.release();
                }
            }
        } catch (RuntimeException unused4) {
        }
    }
}
