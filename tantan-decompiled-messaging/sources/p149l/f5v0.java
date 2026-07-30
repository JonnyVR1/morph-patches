package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class f5v0 {
    @Pure
    /* JADX INFO: renamed from: a */
    public static int m119530a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        zkl.m219192a();
        return 0;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: b */
    public static Object m119531b(@Nullable Object obj) {
        if (obj != null) {
            return obj;
        }
        ohg0.m164364a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: c */
    public static String m119532c(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        x9g0.m207497a();
        return null;
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m119533d(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m119534e(boolean z, Object obj) {
        if (z) {
            return;
        }
        ig3.m135964a((String) obj);
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m119535f(boolean z) {
        if (z) {
            return;
        }
        ohg0.m164364a();
    }
}
