package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class w11 {
    @Pure
    /* JADX INFO: renamed from: a */
    public static void m204365a(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public static void m204366b(boolean z, Object obj) {
        if (z) {
            return;
        }
        un80.m196830a(obj);
    }

    @Pure
    /* JADX INFO: renamed from: c */
    public static int m204367c(int i, int i2, int i3) {
        if (i >= i2 && i < i3) {
            return i;
        }
        onl.m168333a();
        return 0;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: d */
    public static String m204368d(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        fig0.m125680a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: e */
    public static <T> T m204369e(@Nullable T t) {
        t.getClass();
        return t;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: f */
    public static <T> T m204370f(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    /* JADX INFO: renamed from: g */
    public static void m204371g(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }

    @Pure
    /* JADX INFO: renamed from: h */
    public static void m204372h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: i */
    public static <T> T m204373i(@Nullable T t) {
        if (t != null) {
            return t;
        }
        wpg0.m207458a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: j */
    public static <T> T m204374j(@Nullable T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
