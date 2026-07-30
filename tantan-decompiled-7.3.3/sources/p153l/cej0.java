package p153l;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class cej0 {

    /* JADX INFO: renamed from: a */
    public static long f81360a;

    /* JADX INFO: renamed from: b */
    public static Method f81361b;

    /* JADX INFO: renamed from: c */
    public static Method f81362c;

    /* JADX INFO: renamed from: d */
    public static Method f81363d;

    /* JADX INFO: renamed from: e */
    public static Method f81364e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f81360a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f81361b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f81362c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f81363d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f81364e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m109373a(@NonNull String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m109374b() {
        Trace.endSection();
    }
}
