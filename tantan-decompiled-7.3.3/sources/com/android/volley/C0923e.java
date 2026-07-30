package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.android.volley.e */
/* JADX INFO: loaded from: classes.dex */
public class C0923e {

    /* JADX INFO: renamed from: a */
    public static String f4170a = "Volley";

    /* JADX INFO: renamed from: b */
    public static boolean f4171b = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: c */
    private static final String f4172c = C0923e.class.getName();

    /* JADX INFO: renamed from: com.android.volley.e$a */
    public static class a {

        /* JADX INFO: renamed from: c */
        public static final boolean f4173c = C0923e.f4171b;

        /* JADX INFO: renamed from: a */
        private final List<C22774a> f4174a = new ArrayList();

        /* JADX INFO: renamed from: b */
        private boolean f4175b = false;

        /* JADX INFO: renamed from: com.android.volley.e$a$a, reason: collision with other inner class name */
        public static class C22774a {

            /* JADX INFO: renamed from: a */
            public final String f4176a;

            /* JADX INFO: renamed from: b */
            public final long f4177b;

            /* JADX INFO: renamed from: c */
            public final long f4178c;

            public C22774a(String str, long j, long j2) {
                this.f4176a = str;
                this.f4177b = j;
                this.f4178c = j2;
            }
        }

        /* JADX INFO: renamed from: c */
        private long m5114c() {
            if (this.f4174a.size() == 0) {
                return 0L;
            }
            long j = this.f4174a.get(0).f4178c;
            List<C22774a> list = this.f4174a;
            return list.get(list.size() - 1).f4178c - j;
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m5115a(String str, long j) {
            if (this.f4175b) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f4174a.add(new C22774a(str, j, SystemClock.elapsedRealtime()));
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m5116b(String str) {
            this.f4175b = true;
            long jM5114c = m5114c();
            if (jM5114c <= 0) {
                return;
            }
            long j = this.f4174a.get(0).f4178c;
            C0923e.m5109b("(%-4d ms) %s", Long.valueOf(jM5114c), str);
            for (C22774a c22774a : this.f4174a) {
                long j2 = c22774a.f4178c;
                C0923e.m5109b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c22774a.f4177b), c22774a.f4176a);
                j = j2;
            }
        }

        public void finalize() throws Throwable {
            if (this.f4175b) {
                return;
            }
            m5116b("Request on the loose");
            C0923e.m5110c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m5108a(String str, Object... objArr) {
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
    public static void m5109b(String str, Object... objArr) {
        m5108a(str, objArr);
    }

    /* JADX INFO: renamed from: c */
    public static void m5110c(String str, Object... objArr) {
        Log.e(f4170a, m5108a(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m5111d(Throwable th, String str, Object... objArr) {
        Log.e(f4170a, m5108a(str, objArr), th);
    }

    /* JADX INFO: renamed from: e */
    public static void m5112e(String str, Object... objArr) {
        if (f4171b) {
            m5108a(str, objArr);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m5113f(String str, Object... objArr) {
        Log.wtf(f4170a, m5108a(str, objArr));
    }
}
