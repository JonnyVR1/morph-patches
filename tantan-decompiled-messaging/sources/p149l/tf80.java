package p149l;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class tf80 {
    /* JADX INFO: renamed from: a */
    public static void m188654a(boolean z) {
        if (z) {
            return;
        }
        x9g0.m207497a();
    }

    /* JADX INFO: renamed from: b */
    public static void m188655b(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        pf80.m168601a(obj);
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: c */
    public static int m188656c(int i) {
        if (i >= 0) {
            return i;
        }
        x9g0.m207497a();
        return 0;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: d */
    public static int m188657d(int i, @Nullable String str) {
        if (i >= 0) {
            return i;
        }
        ig3.m135964a(str);
        return 0;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> T m188658e(@Nullable T t) {
        t.getClass();
        return t;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> T m188659f(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: g */
    public static void m188660g(boolean z, @Nullable String str) {
        if (z) {
            return;
        }
        qkq0.m175383a(str);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static <T extends CharSequence> T m188661h(@Nullable T t, @NonNull Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        pf80.m168601a(obj);
        return null;
    }
}
