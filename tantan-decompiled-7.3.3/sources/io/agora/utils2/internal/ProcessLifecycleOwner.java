package io.agora.utils2.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class ProcessLifecycleOwner implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "ProcessLifecycleOwner";
    private static final long TIMEOUT_MS = 1000;
    private boolean isForeground;
    private final WeakReference<CommonUtility> mCommonUtility;
    private final Runnable mDelayedPauseRunnable = new Runnable() { // from class: io.agora.utils2.internal.ProcessLifecycleOwner.1
        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.setForeground(false);
        }
    };
    private final Runnable mDelayedResumeRunnable = new Runnable() { // from class: io.agora.utils2.internal.ProcessLifecycleOwner.2
        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.setForeground(true);
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());

    public ProcessLifecycleOwner(boolean z, CommonUtility commonUtility) {
        this.isForeground = z;
        this.mCommonUtility = new WeakReference<>(commonUtility);
        Logging.m88105d(TAG, "ProcessLifecycleOwner, isForeground : " + this.isForeground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForeground(boolean z) {
        if (this.isForeground == z) {
            return;
        }
        this.isForeground = z;
        CommonUtility commonUtility = this.mCommonUtility.get();
        if (commonUtility == null) {
            return;
        }
        commonUtility.onForegroundChanged(this.isForeground);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Logging.m88105d(TAG, "onActivityPaused()");
        this.handler.removeCallbacks(this.mDelayedResumeRunnable);
        this.handler.postDelayed(this.mDelayedPauseRunnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Logging.m88105d(TAG, "onActivityResumed()");
        this.handler.removeCallbacks(this.mDelayedPauseRunnable);
        this.handler.postDelayed(this.mDelayedResumeRunnable, 1000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
