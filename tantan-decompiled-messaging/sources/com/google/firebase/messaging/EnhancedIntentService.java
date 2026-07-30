package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.ExecutorService;
import p149l.rfx;
import p149l.sei0;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;

    @VisibleForTesting
    final ExecutorService executor = FcmExecutors.newIntentHandleExecutor();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16800a(EnhancedIntentService enhancedIntentService, Intent intent, sei0 sei0Var) {
        enhancedIntentService.getClass();
        try {
            enhancedIntentService.handleIntent(intent);
        } finally {
            sei0Var.m183659c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTask(Intent intent) {
        if (intent != null) {
            WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return tfi0.m188734f(null);
        }
        final sei0 sei0Var = new sei0();
        this.executor.execute(new Runnable() { // from class: l.a1f
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.m16800a(this.f67179a, intent, sei0Var);
            }
        });
        return sei0Var.m183657a();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable(TAG, 3);
            if (this.binder == null) {
                this.binder = new WithinAppServiceBinder(new WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                    @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                    @KeepForSdk
                    public Task<Void> handle(Intent intent2) {
                        return EnhancedIntentService.this.processIntent(intent2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.mo15376o()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.mo15363b(new rfx(), new OnCompleteListener() { // from class: l.z0f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f200987a.finishTask(intent);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
