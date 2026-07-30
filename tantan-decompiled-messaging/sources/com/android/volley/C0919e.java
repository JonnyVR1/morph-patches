package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.android.volley.e */
/* JADX INFO: loaded from: classes.dex */
public class C0919e {

    /* JADX INFO: renamed from: a */
    public static String f4170a = "Volley";

    /* JADX INFO: renamed from: b */
    public static boolean f4171b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c */
    private static final String f4172c = C0919e.class.getName();

    /* JADX INFO: renamed from: com.android.volley.e$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final boolean f4173c = C0919e.f4171b;

        /* JADX INFO: renamed from: a */
        private final List<C22659a> f4174a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private boolean f4175b = false;

        /* JADX INFO: renamed from: com.android.volley.e$a$a, reason: collision with other inner class name */
        public static class C22659a {

            /* JADX INFO: renamed from: a */
            public final String f4176a;

            /* JADX INFO: renamed from: b */
            public final long f4177b;

            /* JADX INFO: renamed from: c */
            public final long f4178c;

            public C22659a(String str, long j, long j2) {
                this.f4176a = str;
                this.f4177b = j;
                this.f4178c = j2;
            }
        }

        /* JADX INFO: renamed from: c */
        private long m5104c() {
            if (this.f4174a.size() == 0) {
                return 0L;
            }
            long j = this.f4174a.get(0).f4178c;
            List<C22659a> list = this.f4174a;
            return list.get(list.size() - 1).f4178c - j;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m5105a(String str, long j) {
            if (this.f4175b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f4174a.add(new C22659a(str, j, SystemClock.elapsedRealtime()));
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m5106b(String str) {
            this.f4175b = true;
            long jM5104c = m5104c();
            if (jM5104c <= 0) {
                return;
            }
            long j = this.f4174a.get(0).f4178c;
            C0919e.m5099b("(%-4d ms) %s", Long.valueOf(jM5104c), str);
            for (C22659a c22659a : this.f4174a) {
                long j2 = c22659a.f4178c;
                C0919e.m5099b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c22659a.f4177b), c22659a.f4176a);
                j = j2;
            }
        }

        public void finalize() throws Throwable {
            if (this.f4175b) {
                return;
            }
            m5106b("Request on the loose");
            C0919e.m5100c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5098a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(f4172c)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
            }
        }
        str2 = "<unknown>";
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* JADX INFO: renamed from: b */
    public static void m5099b(String str, Object... objArr) {
        m5098a(str, objArr);
    }

    /* JADX INFO: renamed from: c */
    public static void m5100c(String str, Object... objArr) {
        Log.e(f4170a, m5098a(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m5101d(Throwable th, String str, Object... objArr) {
        Log.e(f4170a, m5098a(str, objArr), th);
    }

    /* JADX INFO: renamed from: e */
    public static void m5102e(String str, Object... objArr) {
        if (f4171b) {
            m5098a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5103f(String str, Object... objArr) {
        Log.wtf(f4170a, m5098a(str, objArr));
    }
}
