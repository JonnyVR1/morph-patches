package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class p11 {
    @Pure
    /* JADX INFO: renamed from: a */
    public static void m167007a(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m167008b(boolean z, Object obj) {
        if (z) {
            return;
        }
        pf80.m168601a(obj);
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static int m167009c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        zkl.m219192a();
        return 0;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: d */
    public static String m167010d(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        x9g0.m207497a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: e */
    public static <T> T m167011e(@Nullable T t) {
        t.getClass();
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: f */
    public static <T> T m167012f(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m167013g(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static void m167014h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: i */
    public static <T> T m167015i(@Nullable T t) {
        if (t != null) {
            return t;
        }
        ohg0.m164364a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: j */
    public static <T> T m167016j(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
