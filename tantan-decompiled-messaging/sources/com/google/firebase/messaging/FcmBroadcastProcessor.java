package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.aspectj.lang.JoinPoint;
import p149l.n16;
import p149l.rfx;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class FcmBroadcastProcessor {
    private static final String EXTRA_BINARY_DATA = "rawData";
    private static final String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor;

    public FcmBroadcastProcessor(Context context) {
        this.context = context;
        this.executor = new rfx();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m16802a(Context context, Intent intent, boolean z, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.mo15373l()).intValue() == 402) ? bindToMessagingService(context, intent, z).mo15368g(new rfx(), new n16() { // from class: l.wjg
            @Override // p149l.n16
            public final Object then(Task task2) {
                return FcmBroadcastProcessor.m16805d(task2);
            }
        }) : task;
    }

    private static Task<Integer> bindToMessagingService(Context context, Intent intent, boolean z) {
        Log.isLoggable(Constants.TAG, 3);
        WithinAppServiceConnection serviceConnection = getServiceConnection(context, com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        if (!z) {
            return serviceConnection.sendIntent(intent).mo15368g(new rfx(), new n16() { // from class: l.zjg
                @Override // p149l.n16
                public final Object then(Task task) {
                    return FcmBroadcastProcessor.m16804c(task);
                }
            });
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context)) {
            WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return tfi0.m188734f(-1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m16804c(Task task) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m16805d(Task task) {
        return 403;
    }

    private static WithinAppServiceConnection getServiceConnection(Context context, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            try {
                if (fcmServiceConn == null) {
                    fcmServiceConn = new WithinAppServiceConnection(context, str);
                }
                withinAppServiceConnection = fcmServiceConn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return withinAppServiceConnection;
    }

    @VisibleForTesting
    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    @VisibleForTesting
    public static void setServiceConnection(WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }

    @KeepForSdk
    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> startMessagingService(final Context context, final Intent intent) {
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? tfi0.m188731c(this.executor, new Callable() { // from class: l.xjg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(ServiceStarter.getInstance().startMessagingService(context, intent));
            }
        }).mo15370i(this.executor, new n16() { // from class: l.yjg
            @Override // p149l.n16
            public final Object then(Task task) {
                return FcmBroadcastProcessor.m16802a(context, intent, z2, task);
            }
        }) : bindToMessagingService(context, intent, z2);
    }

    public FcmBroadcastProcessor(Context context, ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }
}
