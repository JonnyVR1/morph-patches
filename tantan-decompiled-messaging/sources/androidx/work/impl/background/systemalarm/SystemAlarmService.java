package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import p149l.tfp0;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements C0779d.c {
    private static final String TAG = txv.m190978i("SystemAlarmService");
    private C0779d mDispatcher;
    private boolean mIsShutdown;

    @MainThread
    private void initializeDispatcher() {
        C0779d c0779d = new C0779d(this);
        this.mDispatcher = c0779d;
        c0779d.m4564l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C0779d.c
    @MainThread
    public void onAllCommandsCompleted() {
        this.mIsShutdown = true;
        txv.m190976e().mo190979a(TAG, "All commands completed in dispatcher");
        tfp0.m188750a();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        initializeDispatcher();
        this.mIsShutdown = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mIsShutdown = true;
        this.mDispatcher.m4562j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            txv.m190976e().mo190983f(TAG, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.mDispatcher.m4562j();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.m4553a(intent, i2);
        return 3;
    }
}
