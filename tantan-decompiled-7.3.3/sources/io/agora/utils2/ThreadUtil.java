package io.agora.utils2;

import android.os.Looper;
import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadUtil {
    private ThreadUtil() {
        throw new IllegalStateException("Utility class");
    }

    @CalledByNative
    public static boolean isOnMainThread() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
