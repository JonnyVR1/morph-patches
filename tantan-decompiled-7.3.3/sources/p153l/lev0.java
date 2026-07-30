package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class lev0 {
    @Pure
    /* JADX INFO: renamed from: a */
    public static int m153953a(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        onl.m168333a();
        return 0;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: b */
    public static Object m153954b(@Nullable Object obj) {
        if (obj != null) {
            return obj;
        }
        wpg0.m207458a();
        return null;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: c */
    public static String m153955c(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        fig0.m125680a();
        return null;
    }

    @Pure
    /* JADX INFO: renamed from: d */
    public static void m153956d(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    @Pure
    /* JADX INFO: renamed from: e */
    public static void m153957e(boolean z, Object obj) {
        if (z) {
            return;
        }
        wg3.m206174a((String) obj);
    }

    @Pure
    /* JADX INFO: renamed from: f */
    public static void m153958f(boolean z) {
        if (z) {
            return;
        }
        wpg0.m207458a();
    }
}
