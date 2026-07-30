package com.p046mm.mmfile;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
class AppFrontBackHelper {
    private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.mm.mmfile.AppFrontBackHelper.1
        private int activityStartCount = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i = this.activityStartCount + 1;
            this.activityStartCount = i;
            if (i != 1 || AppFrontBackHelper.this.mOnAppStatusListener == null) {
                return;
            }
            AppFrontBackHelper.this.mOnAppStatusListener.onFront();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i = this.activityStartCount - 1;
            this.activityStartCount = i;
            if (i != 0 || AppFrontBackHelper.this.mOnAppStatusListener == null) {
                return;
            }
            AppFrontBackHelper.this.mOnAppStatusListener.onBack();
        }
    };
    private OnAppStatusListener mOnAppStatusListener;

    public interface OnAppStatusListener {
        void onBack();

        void onFront();
    }

    public void register(Application application, OnAppStatusListener onAppStatusListener) {
        this.mOnAppStatusListener = onAppStatusListener;
        application.registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }

    public void unRegister(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
    }
}
