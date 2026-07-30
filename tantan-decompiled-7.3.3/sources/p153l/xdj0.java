package p153l;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class xdj0 {

    /* JADX INFO: renamed from: a */
    public static long f193601a;

    /* JADX INFO: renamed from: b */
    public static Method f193602b;

    /* JADX INFO: renamed from: c */
    public static Method f193603c;

    /* JADX INFO: renamed from: d */
    public static Method f193604d;

    /* JADX INFO: renamed from: a */
    public static void m210462a(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            zdj0.m219300a(m210471j(str), i);
        } else {
            m210463b(m210471j(str), i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m210463b(@NonNull String str, int i) {
        try {
            if (f193603c == null) {
                f193603c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f193603c.invoke(null, Long.valueOf(f193601a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m210468g("asyncTraceBegin", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m210464c(@NonNull String str) {
        ydj0.m215245a(m210471j(str));
    }

    /* JADX INFO: renamed from: d */
    public static void m210465d(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            zdj0.m219301b(m210471j(str), i);
        } else {
            m210466e(m210471j(str), i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m210466e(@NonNull String str, int i) {
        try {
            if (f193604d == null) {
                f193604d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f193604d.invoke(null, Long.valueOf(f193601a), str, Integer.valueOf(i));
        } catch (Exception e) {
            m210468g("asyncTraceEnd", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m210467f() {
        ydj0.m215246b();
    }

    /* JADX INFO: renamed from: g */
    public static void m210468g(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            iig0.m140070a(cause);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m210469h() {
        return Build.VERSION.SDK_INT >= 29 ? zdj0.m219302c() : m210470i();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m210470i() {
        try {
            if (f193602b == null) {
                f193601a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f193602b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f193602b.invoke(null, Long.valueOf(f193601a))).booleanValue();
        } catch (Exception e) {
            m210468g("isTagEnabled", e);
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m210471j(@NonNull String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
