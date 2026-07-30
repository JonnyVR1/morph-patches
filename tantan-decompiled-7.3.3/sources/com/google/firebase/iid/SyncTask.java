package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p153l.jj5;

/* JADX INFO: loaded from: classes7.dex */
class SyncTask implements Runnable {
    private final FirebaseInstanceId iid;
    private final long nextDelaySeconds;

    @VisibleForTesting
    ExecutorService processorExecutor = FirebaseIidExecutors.newCachedSingleThreadExecutor();
    private final PowerManager.WakeLock syncWakeLock;

    @VisibleForTesting
    public static class ConnectivityChangeReceiver extends BroadcastReceiver {
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask) {
            this.task = syncTask;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SyncTask syncTask = this.task;
            if (syncTask != null && syncTask.isDeviceConnected()) {
                FirebaseInstanceId.isDebugLogEnabled();
                this.task.iid.enqueueTaskWithDelaySeconds(this.task, 0L);
                this.task.getContext().unregisterReceiver(this);
                this.task = null;
            }
        }

        public void registerReceiver() {
            FirebaseInstanceId.isDebugLogEnabled();
            jj5.m145018l(this.task.getContext(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    @VisibleForTesting
    public SyncTask(FirebaseInstanceId firebaseInstanceId, long j) {
        this.iid = firebaseInstanceId;
        this.nextDelaySeconds = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public Context getContext() {
        return this.iid.getApp().getApplicationContext();
    }

    public boolean isDeviceConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public boolean maybeRefreshToken() throws IOException {
        if (!this.iid.tokenNeedsRefresh(this.iid.getTokenWithoutTriggeringSync())) {
            return true;
        }
        try {
            if (this.iid.blockingGetMasterToken() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseInstanceId", 3);
            return true;
        } catch (IOException e) {
            if (GmsRpc.isErrorMessageForRetryableError(e.getMessage())) {
                new StringBuilder(String.valueOf(e.getMessage()).length() + 52);
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
    @SuppressLint({"Wakelock"})
    public void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.iid.setSyncScheduledOrRunning(true);
            if (!this.iid.isGmsCorePresent()) {
                this.iid.setSyncScheduledOrRunning(false);
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(getContext()) || isDeviceConnected()) {
                boolean zMaybeRefreshToken = maybeRefreshToken();
                FirebaseInstanceId firebaseInstanceId = this.iid;
                if (zMaybeRefreshToken) {
                    firebaseInstanceId.setSyncScheduledOrRunning(false);
                } else {
                    firebaseInstanceId.syncWithDelaySecondsInternal(this.nextDelaySeconds);
                }
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            } else {
                new ConnectivityChangeReceiver(this).registerReceiver();
                if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.iid.setSyncScheduledOrRunning(false);
            if (!ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
            }
        } finally {
            if (ServiceStarter.getInstance().hasWakeLockPermission(getContext())) {
                this.syncWakeLock.release();
            }
        }
    }
}
