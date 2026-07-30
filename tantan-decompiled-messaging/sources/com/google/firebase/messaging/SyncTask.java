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
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.ii5;

/* JADX INFO: loaded from: classes7.dex */
class SyncTask implements Runnable {
    private final FirebaseMessaging firebaseMessaging;
    private final long nextDelaySeconds;

    @SuppressLint({"ThreadPoolCreation"})
    @VisibleForTesting
    ExecutorService processorExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
    private final PowerManager.WakeLock syncWakeLock;

    @VisibleForTesting
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {

        @Nullable
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                SyncTask.isDebugLogEnabled();
                this.task.firebaseMessaging.enqueueTaskWithDelaySeconds(this.task, 0L);
                this.task.getContext().unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            SyncTask.isDebugLogEnabled();
            ii5.m136342l(this.task.getContext(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    @VisibleForTesting
    public SyncTask(FirebaseMessaging firebaseMessaging, long j) {
        this.firebaseMessaging = firebaseMessaging;
        this.nextDelaySeconds = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean isDebugLogEnabled() {
        return Log.isLoggable(Constants.TAG, 3);
    }

    public Context getContext() {
        return this.firebaseMessaging.getApplicationContext();
    }

    public boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public boolean maybeRefreshToken() throws IOException {
        try {
            if (this.firebaseMessaging.blockingGetToken() == null) {
                Log.e(Constants.TAG, "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable(Constants.TAG, 3);
            return true;
        } catch (IOException e) {
            if (GmsRpc.isErrorMessageForRetryableError(e.getMessage())) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!this.firebaseMessaging.isGmsCorePresent()) {
                this.firebaseMessaging.setSyncScheduledOrRunning(false);
            } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                boolean zMaybeRefreshToken = maybeRefreshToken();
                FirebaseMessaging firebaseMessaging = this.firebaseMessaging;
                if (zMaybeRefreshToken) {
                    firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    firebaseMessaging.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
            } else {
                new ConnectivityChangeReceiver(this).registerReceiver();
            }
        } catch (IOException e) {
            Log.e(Constants.TAG, "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }
}
