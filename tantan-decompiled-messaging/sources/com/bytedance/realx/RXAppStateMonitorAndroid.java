package com.bytedance.realx;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.RXLogging;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class RXAppStateMonitorAndroid implements Application.ActivityLifecycleCallbacks {
    private Context mContext;
    private boolean mIsBackground;
    private long nativeMonitor;
    private final String TAG = "ASMonitorAndroid";
    private final Set<Integer> mStartedActivitySet = new HashSet();
    private final Set<Integer> mPausedActivitySet = new HashSet();

    @CalledByNative
    public RXAppStateMonitorAndroid(long j) {
        this.mIsBackground = false;
        this.nativeMonitor = 0L;
        Context applicationContext = ContextUtils.getApplicationContext();
        this.mContext = applicationContext;
        if (applicationContext == null) {
            RXLogging.m5688e("ASMonitorAndroid", "context is null.");
            return;
        }
        Context applicationContext2 = applicationContext.getApplicationContext();
        this.mContext = applicationContext2;
        this.nativeMonitor = j;
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(this);
        } else {
            RXLogging.m5688e("ASMonitorAndroid", "context not a Application obj.");
        }
        this.mIsBackground = checkBackground(this.mContext);
    }

    private boolean checkBackground(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                RXLogging.m5688e("ASMonitorAndroid", "activityManager is null.");
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                RXLogging.m5688e("ASMonitorAndroid", "processInfoList is null.");
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            RXLogging.m5688e("ASMonitorAndroid", "Get App background state failed. " + e);
            return false;
        }
    }

    @CalledByNative
    private synchronized boolean getState() {
        return this.mIsBackground;
    }

    private native void nativeOnStateChange(long j, boolean z);

    private synchronized void onStateChange(boolean z) {
        if (z == this.mIsBackground) {
            return;
        }
        this.mIsBackground = z;
        long j = this.nativeMonitor;
        if (j != 0) {
            nativeOnStateChange(j, z);
        }
    }

    @CalledByNative
    private synchronized void reset() {
        this.nativeMonitor = 0L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.mPausedActivitySet.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        onStateChange(false);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        int iHashCode = activity.hashCode();
        boolean z = this.mIsBackground;
        boolean zContains = this.mStartedActivitySet.contains(Integer.valueOf(iHashCode));
        Set<Integer> set = this.mStartedActivitySet;
        if (zContains) {
            set.remove(Integer.valueOf(iHashCode));
            if (this.mStartedActivitySet.size() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (set.size() != 0) {
            z = false;
        } else if (this.mPausedActivitySet.contains(Integer.valueOf(iHashCode))) {
            z = true;
        } else {
            RXLogging.m5692w("ASMonitorAndroid", "started set not contain activity" + activity);
        }
        onStateChange(z);
        this.mPausedActivitySet.remove(Integer.valueOf(iHashCode));
    }
}
