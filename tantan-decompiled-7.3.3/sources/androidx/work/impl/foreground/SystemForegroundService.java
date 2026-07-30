package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import p153l.jj5;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements C0794a.b {
    private static final String TAG = qzv.m178831i("SystemFgService");

    @Nullable
    private static SystemForegroundService sForegroundService = null;
    C0794a mDispatcher;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    @RequiresApi(29)
    public static class C0792a {
        /* JADX INFO: renamed from: a */
        public static void m4595a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    @RequiresApi(31)
    public static class C0793b {
        /* JADX INFO: renamed from: a */
        public static void m4596a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                qzv.m178829e().mo178840l(SystemForegroundService.TAG, "Unable to start foreground service", e);
            } catch (SecurityException e2) {
                qzv.m178829e().mo178840l(SystemForegroundService.TAG, "Unable to start foreground service", e2);
            }
        }
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    @MainThread
    private void initializeDispatcher() {
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        C0794a c0794a = new C0794a(getApplicationContext());
        this.mDispatcher = c0794a;
        c0794a.m4609n(this);
    }

    @Override // androidx.work.impl.foreground.C0794a.b
    @MainThread
    public void cancelNotification(int i) {
        this.mNotificationManager.cancel(i);
    }

    @Override // androidx.work.impl.foreground.C0794a.b
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    @MainThread
    public void notify(int i, @NonNull Notification notification) {
        jj5.m145013g(this.mNotificationManager, i, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.m4606k();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            qzv.m178829e().mo178836f(TAG, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.mDispatcher.m4606k();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.m4607l(intent);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.mDispatcher.m4608m(i, 2048);
    }

    @Override // androidx.work.impl.foreground.C0794a.b
    @MainThread
    public void startForeground(int i, int i2, @NonNull Notification notification) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            C0793b.m4596a(this, i, notification, i2);
        } else if (i3 >= 29) {
            C0792a.m4595a(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // androidx.work.impl.foreground.C0794a.b
    @MainThread
    public void stop() {
        this.mIsShutdown = true;
        qzv.m178829e().mo178832a(TAG, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }

    public void onTimeout(int i, int i2) {
        this.mDispatcher.m4608m(i, i2);
    }
}
