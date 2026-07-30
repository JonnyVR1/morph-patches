package com.p000p1.mobile.threadhook;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HookManager {
    public static final HookManager INSTANCE = new HookManager();
    private static final String TAG = "Matrix.HookManager";
    private volatile boolean mHasNativeInitialized = false;
    private byte[] mInitializeGuard = new byte[0];
    private final Set<AbsHook> mPendingHooks = new HashSet();
    private volatile boolean mEnableDebug = true;
    private NativeLibraryLoader mNativeLibLoader = null;

    public static class HookFailedException extends Exception {
        public HookFailedException(String str) {
            super(str);
        }
    }

    public interface NativeLibraryLoader {
        void loadLibrary(@NonNull String str);
    }

    private HookManager() {
    }

    private void commitHooksLocked() throws HookFailedException {
        synchronized (this.mPendingHooks) {
            try {
                for (AbsHook absHook : this.mPendingHooks) {
                    String nativeLibraryName = absHook.getNativeLibraryName();
                    if (!TextUtils.isEmpty(nativeLibraryName)) {
                        try {
                            NativeLibraryLoader nativeLibraryLoader = this.mNativeLibLoader;
                            if (nativeLibraryLoader != null) {
                                nativeLibraryLoader.loadLibrary(nativeLibraryName);
                            } else {
                                System.loadLibrary(nativeLibraryName);
                            }
                        } catch (Throwable unused) {
                            Log.e(TAG, "Fail to load native library for %s, skip next steps." + absHook.getClass().getName());
                            absHook.setStatus(AbsHook.Status.COMMIT_FAIL_ON_LOAD_LIB);
                        }
                    }
                }
                for (AbsHook absHook2 : this.mPendingHooks) {
                    if (absHook2.getStatus() != AbsHook.Status.UNCOMMIT) {
                        Log.e(TAG, "%s has failed steps before, skip calling onConfigure on it." + absHook2.getClass().getName());
                    } else if (!absHook2.onConfigure()) {
                        Log.e(TAG, "Fail to configure %s, skip next steps" + absHook2.getClass().getName());
                        absHook2.setStatus(AbsHook.Status.COMMIT_FAIL_ON_CONFIGURE);
                    }
                }
                for (AbsHook absHook3 : this.mPendingHooks) {
                    if (absHook3.getStatus() != AbsHook.Status.UNCOMMIT) {
                        Log.e(TAG, "%s has failed steps before, skip calling onHook on it." + absHook3.getClass().getName());
                    } else if (absHook3.onHook(this.mEnableDebug)) {
                        absHook3.setStatus(AbsHook.Status.COMMIT_SUCCESS);
                    } else {
                        Log.e(TAG, "Fail to do hook in %s." + absHook3.getClass().getName());
                        absHook3.setStatus(AbsHook.Status.COMMIT_FAIL_ON_HOOK);
                    }
                }
                this.mPendingHooks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private native void doFinalInitializeNative(boolean z);

    private native boolean doPreHookInitializeNative(boolean z);

    @Keep
    public static String getStack() {
        return stackTraceToString(Thread.currentThread().getStackTrace());
    }

    private static String stackTraceToString(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (!stackTraceElement.getClassName().contains("java.lang.Thread")) {
                sb.append(stackTraceElement);
                sb.append(';');
            }
        }
        return sb.toString();
    }

    public HookManager addHook(@Nullable AbsHook absHook) {
        if (absHook == null || absHook.getStatus() == AbsHook.Status.COMMIT_SUCCESS) {
            return this;
        }
        synchronized (this.mPendingHooks) {
            this.mPendingHooks.add(absHook);
        }
        return this;
    }

    public HookManager clearHooks() {
        synchronized (this.mPendingHooks) {
            this.mPendingHooks.clear();
        }
        return this;
    }

    public void commitHooks() throws HookFailedException {
        synchronized (this.mInitializeGuard) {
            synchronized (this.mPendingHooks) {
                if (this.mPendingHooks.isEmpty()) {
                    return;
                }
                if (this.mHasNativeInitialized) {
                    commitHooksLocked();
                } else {
                    try {
                        NativeLibraryLoader nativeLibraryLoader = this.mNativeLibLoader;
                        if (nativeLibraryLoader != null) {
                            nativeLibraryLoader.loadLibrary("matrix-hookcommon");
                        } else {
                            System.loadLibrary("matrix-hookcommon");
                        }
                        if (!doPreHookInitializeNative(this.mEnableDebug)) {
                            throw new HookFailedException("Fail to do hook common pre-hook initialize.");
                        }
                        commitHooksLocked();
                        doFinalInitializeNative(this.mEnableDebug);
                        this.mHasNativeInitialized = true;
                    } catch (Throwable th) {
                        Log.e(TAG, th.toString());
                    }
                }
            }
        }
    }

    public HookManager setEnableDebug(boolean z) {
        this.mEnableDebug = z;
        return this;
    }

    public HookManager setNativeLibraryLoader(@Nullable NativeLibraryLoader nativeLibraryLoader) {
        this.mNativeLibLoader = nativeLibraryLoader;
        return this;
    }
}
