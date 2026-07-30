package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class qf80 {
    /* JADX INFO: renamed from: a */
    public static void m174273a(boolean z, @NonNull String str) {
        if (z) {
            return;
        }
        ig3.m135964a(str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m174274b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        ig3.m135964a("Must not be null or empty");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T extends Collection<Y>, Y> T m174275c(@NonNull T t) {
        if (!t.isEmpty()) {
            return t;
        }
        ig3.m135964a("Must not be empty.");
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> T m174276d(@Nullable T t) {
        return (T) m174277e(t, "Argument must not be null");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> T m174277e(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        jfd0.m141176a(str);
        return null;
    }
}
