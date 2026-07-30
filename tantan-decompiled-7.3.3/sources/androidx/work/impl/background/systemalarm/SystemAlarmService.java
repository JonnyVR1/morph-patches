package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import p153l.qzv;
import p153l.xop0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements C0781d.c {
    private static final String TAG = qzv.m178831i("SystemAlarmService");
    private C0781d mDispatcher;
    private boolean mIsShutdown;

    @MainThread
    private void initializeDispatcher() {
        C0781d c0781d = new C0781d(this);
        this.mDispatcher = c0781d;
        c0781d.m4566l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.C0781d.c
    @MainThread
    public void onAllCommandsCompleted() {
        this.mIsShutdown = true;
        qzv.m178829e().mo178832a(TAG, "All commands completed in dispatcher");
        xop0.m212477a();
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
        this.mDispatcher.m4564j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            qzv.m178829e().mo178836f(TAG, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.mDispatcher.m4564j();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.m4555a(intent, i2);
        return 3;
    }
}
