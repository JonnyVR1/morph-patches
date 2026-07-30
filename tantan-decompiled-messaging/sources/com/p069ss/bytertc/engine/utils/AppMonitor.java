package com.p069ss.bytertc.engine.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class AppMonitor implements Application.ActivityLifecycleCallbacks {
    public static final int BACKGROUND = 0;
    public static final int FOREGROUND = 1;
    private static volatile AppMonitor INSTANCE;
    private List<Callback> mCallbacks = new CopyOnWriteArrayList();

    public interface Callback {
        void callback(int i);
    }

    private AppMonitor(Context context) {
        registerLifecycle(context);
    }

    public static AppMonitor get(Context context) {
        if (INSTANCE == null) {
            synchronized (AppMonitor.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new AppMonitor(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return INSTANCE;
    }

    private void registerLifecycle(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public void notifyCallback(int i) {
        Iterator<Callback> it = this.mCallbacks.iterator();
        while (it.hasNext()) {
            it.next().callback(i);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        notifyCallback(0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        notifyCallback(1);
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

    public AppMonitor register(Context context, Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            this.mCallbacks.add(callback);
        }
        notifyCallback(CommonUtils.isInForeground(context) ? 1 : 0);
        return this;
    }

    public boolean release(Context context) {
        if (context == null) {
            return false;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        this.mCallbacks.clear();
        INSTANCE = null;
        return true;
    }

    public AppMonitor unRegister(Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            return this;
        }
        this.mCallbacks.remove(callback);
        return this;
    }
}
