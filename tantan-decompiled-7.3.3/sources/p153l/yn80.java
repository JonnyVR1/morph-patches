package p153l;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class yn80 {
    /* JADX INFO: renamed from: a */
    public static void m216771a(boolean z) {
        if (z) {
            return;
        }
        fig0.m125680a();
    }

    /* JADX INFO: renamed from: b */
    public static void m216772b(boolean z, @NonNull Object obj) {
        if (z) {
            return;
        }
        un80.m196830a(obj);
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: c */
    public static int m216773c(int i) {
        if (i >= 0) {
            return i;
        }
        fig0.m125680a();
        return 0;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: d */
    public static int m216774d(int i, @Nullable String str) {
        if (i >= 0) {
            return i;
        }
        wg3.m206174a(str);
        return 0;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> T m216775e(@Nullable T t) {
        t.getClass();
        return t;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> T m216776f(@Nullable T t, @NonNull Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: g */
    public static void m216777g(boolean z, @Nullable String str) {
        if (z) {
            return;
        }
        wtq0.m207906a(str);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static <T extends CharSequence> T m216778h(@Nullable T t, @NonNull Object obj) {
        if (!TextUtils.isEmpty(t)) {
            return t;
        }
        un80.m196830a(obj);
        return null;
    }
}
