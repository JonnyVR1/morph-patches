package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class vn80 {
    /* JADX INFO: renamed from: a */
    public static void m201941a(boolean z, @NonNull String str) {
        if (z) {
            return;
        }
        wg3.m206174a(str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m201942b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        wg3.m206174a("Must not be null or empty");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T extends Collection<Y>, Y> T m201943c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        wg3.m206174a("Must not be empty.");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> T m201944d(@Nullable T t) {
        return (T) m201945e(t, "Argument must not be null");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> T m201945e(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }
}
