package p149l;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class t4j0 {

    /* JADX INFO: renamed from: a */
    public static long f167728a;

    /* JADX INFO: renamed from: b */
    public static Method f167729b;

    /* JADX INFO: renamed from: c */
    public static Method f167730c;

    /* JADX INFO: renamed from: d */
    public static Method f167731d;

    /* JADX INFO: renamed from: a */
    public static void m187206a(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            v4j0.m196993a(m187215j(str), i);
        } else {
            m187207b(m187215j(str), i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m187207b(@NonNull String str, int i) {
        try {
            if (f167730c == null) {
                f167730c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f167730c.invoke(null, Long.valueOf(f167728a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m187212g("asyncTraceBegin", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m187208c(@NonNull String str) {
        u4j0.m191736a(m187215j(str));
    }

    /* JADX INFO: renamed from: d */
    public static void m187209d(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            v4j0.m196994b(m187215j(str), i);
        } else {
            m187210e(m187215j(str), i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m187210e(@NonNull String str, int i) {
        try {
            if (f167731d == null) {
                f167731d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f167731d.invoke(null, Long.valueOf(f167728a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m187212g("asyncTraceEnd", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m187211f() {
        u4j0.m191737b();
    }

    /* JADX INFO: renamed from: g */
    public static void m187212g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            aag0.m95543a(cause);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m187213h() {
        return Build.VERSION.SDK_INT >= 29 ? v4j0.m196995c() : m187214i();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m187214i() {
        try {
            if (f167729b == null) {
                f167728a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f167729b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f167729b.invoke(null, Long.valueOf(f167728a))).booleanValue();
        } catch (Exception e) {
            m187212g("isTagEnabled", e);
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m187215j(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
