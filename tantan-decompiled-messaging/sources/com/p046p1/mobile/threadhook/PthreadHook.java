package com.p046p1.mobile.threadhook;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class PthreadHook extends AbsHook {
    public static final PthreadHook INSTANCE = new PthreadHook();
    private static final String TAG = "Matrix.Pthread";
    private Set<String> mHookThreadName = new HashSet();
    private boolean mEnableQuicken = false;
    private boolean mEnableLog = false;
    private boolean mConfigured = false;
    private boolean mThreadTraceEnabled = false;
    private ThreadStackShrinkConfig mThreadStackShrinkConfig = null;
    private boolean mHookInstalled = false;
    private boolean mEnableTracePthreadRelease = false;

    public static class ThreadStackShrinkConfig {
        public boolean enabled = false;
        public final Set<String> ignoreCreatorSoPatterns = new HashSet(5);

        public ThreadStackShrinkConfig addIgnoreCreatorSoPatterns(@NonNull String str) {
            this.ignoreCreatorSoPatterns.add(str);
            return this;
        }

        public ThreadStackShrinkConfig setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        public ThreadStackShrinkConfig setIgnoreCreatorSoPatterns(@Nullable String... strArr) {
            if (strArr == null || strArr.length == 0) {
                this.ignoreCreatorSoPatterns.clear();
                return this;
            }
            this.ignoreCreatorSoPatterns.addAll(Arrays.asList(strArr));
            return this;
        }
    }

    private PthreadHook() {
    }

    @Keep
    private native void addHookThreadNameNative(String[] strArr);

    @Keep
    private native void dumpNative(String str);

    @Keep
    private native void enableLoggerNative(boolean z);

    @Keep
    private native void enableQuickenNative(boolean z);

    @Keep
    private native void enableTracePthreadReleaseNative(boolean z);

    @Keep
    private native void installHooksNative(boolean z);

    @Keep
    private native void setThreadStackShrinkEnabledNative(boolean z);

    @Keep
    private native boolean setThreadStackShrinkIgnoredCreatorSoPatternsNative(String[] strArr);

    @Keep
    private native void setThreadTraceEnabledNative(boolean z);

    public PthreadHook addHookThread(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "thread regex is empty!!!");
            return this;
        }
        this.mHookThreadName.add(str);
        return this;
    }

    public void dump(String str) {
        if (getStatus() == AbsHook.Status.COMMIT_SUCCESS) {
            dumpNative(str);
        }
    }

    public void enableLogger(boolean z) {
        this.mEnableLog = z;
        if (this.mConfigured) {
            enableLoggerNative(z);
        }
    }

    public void enableQuicken(boolean z) {
        this.mEnableQuicken = z;
        if (this.mConfigured) {
            enableQuickenNative(z);
        }
    }

    public PthreadHook enableTracePthreadRelease(boolean z) {
        this.mEnableTracePthreadRelease = z;
        return this;
    }

    @Override // com.p046p1.mobile.threadhook.AbsHook
    @Nullable
    public String getNativeLibraryName() {
        return "matrix-pthreadhook";
    }

    public void hook() throws HookManager.HookFailedException {
        HookManager.INSTANCE.clearHooks().addHook(this).commitHooks();
    }

    @Override // com.p046p1.mobile.threadhook.AbsHook
    public boolean onConfigure() {
        addHookThreadNameNative((String[]) this.mHookThreadName.toArray(new String[0]));
        enableQuickenNative(this.mEnableQuicken);
        enableLoggerNative(this.mEnableLog);
        enableTracePthreadReleaseNative(this.mEnableTracePthreadRelease);
        ThreadStackShrinkConfig threadStackShrinkConfig = this.mThreadStackShrinkConfig;
        if (threadStackShrinkConfig != null) {
            if (setThreadStackShrinkIgnoredCreatorSoPatternsNative((String[]) this.mThreadStackShrinkConfig.ignoreCreatorSoPatterns.toArray(new String[threadStackShrinkConfig.ignoreCreatorSoPatterns.size()]))) {
                setThreadStackShrinkEnabledNative(this.mThreadStackShrinkConfig.enabled);
            } else {
                Log.e(TAG, "setThreadStackShrinkIgnoredCreatorSoPatternsNative return false, do not enable ThreadStackShrinker.");
                setThreadStackShrinkEnabledNative(false);
            }
        } else {
            setThreadStackShrinkIgnoredCreatorSoPatternsNative(null);
            setThreadStackShrinkEnabledNative(false);
        }
        setThreadTraceEnabledNative(this.mThreadTraceEnabled);
        this.mConfigured = true;
        return true;
    }

    @Override // com.p046p1.mobile.threadhook.AbsHook
    public boolean onHook(boolean z) {
        ThreadStackShrinkConfig threadStackShrinkConfig;
        if ((this.mThreadTraceEnabled || ((threadStackShrinkConfig = this.mThreadStackShrinkConfig) != null && threadStackShrinkConfig.enabled)) && !this.mHookInstalled) {
            installHooksNative(z);
            this.mHookInstalled = true;
        }
        return true;
    }

    public PthreadHook setThreadStackShrinkConfig(@Nullable ThreadStackShrinkConfig threadStackShrinkConfig) {
        this.mThreadStackShrinkConfig = threadStackShrinkConfig;
        return this;
    }

    public PthreadHook setThreadTraceEnabled(boolean z) {
        this.mThreadTraceEnabled = z;
        return this;
    }

    public PthreadHook addHookThread(String... strArr) {
        for (String str : strArr) {
            addHookThread(str);
        }
        return this;
    }
}
