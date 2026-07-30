package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p149l.ig3;
import p149l.ohg0;
import p149l.pf80;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS NOT the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        qkq0.m175383a(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", "checkNotMainThread: current thread " + String.valueOf(Thread.currentThread()) + " IS the main thread " + String.valueOf(Looper.getMainLooper().getThread()) + "!");
        qkq0.m175383a(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        ig3.m135964a("null reference");
    }

    @KeepForSdk
    public static void checkNull(Object obj) {
        if (obj == null) {
            return;
        }
        ig3.m135964a("non-null reference");
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(Object obj, @NonNull Object obj2) {
        if (obj != null) {
            return;
        }
        pf80.m168601a(obj2);
    }

    @KeepForSdk
    public static void checkNull(Object obj, @NonNull Object obj2) {
        if (obj == null) {
            return;
        }
        pf80.m168601a(obj2);
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }
}
