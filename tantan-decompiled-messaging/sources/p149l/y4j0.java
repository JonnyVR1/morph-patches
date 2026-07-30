package p149l;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class y4j0 {

    /* JADX INFO: renamed from: a */
    public static long f196297a;

    /* JADX INFO: renamed from: b */
    public static Method f196298b;

    /* JADX INFO: renamed from: c */
    public static Method f196299c;

    /* JADX INFO: renamed from: d */
    public static Method f196300d;

    /* JADX INFO: renamed from: e */
    public static Method f196301e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f196297a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f196298b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f196299c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f196300d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f196301e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m212916a(@NonNull String str) {
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m212917b() {
        Trace.endSection();
    }
}
