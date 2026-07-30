package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l950 {
    /* JADX INFO: renamed from: a */
    public static boolean m153327a(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m153328b(@Nullable Object... objArr) {
        return Objects.hash(objArr);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T> T m153329c(@Nullable T t) {
        t.getClass();
        return t;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> T m153330d(@Nullable T t, @NonNull String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m153331e(@Nullable Object obj, @Nullable String str) {
        return obj != null ? obj.toString() : str;
    }
}
