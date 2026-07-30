package com.tencent.open.log;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.open.utils.C14390h;

/* JADX INFO: loaded from: classes2.dex */
public class SLog implements TraceLevel {
    public static final String TAG = "openSDK_LOG";

    /* JADX INFO: renamed from: c */
    private static boolean f60259c = false;
    public static SLog instance;

    /* JADX INFO: renamed from: a */
    protected C14374a f60260a;

    /* JADX INFO: renamed from: b */
    private Tracer f60261b;

    private SLog() {
    }

    /* JADX INFO: renamed from: c */
    private void m84304c() {
        this.f60260a = new C14374a(new C14375b(C14376c.f60297m, C14376c.f60291g, C14376c.f60292h, C14376c.f60287c, C14376c.f60293i, 10, C14376c.f60289e, C14376c.f60298n));
    }

    /* JADX INFO: renamed from: d */
    public static final void m84305d(String str, String str2) {
        getInstance().m84318a(2, str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m84307e(String str, String str2) {
        getInstance().m84318a(16, str, str2, null);
    }

    public static void flushLogs() {
        getInstance().m84319b();
    }

    public static SLog getInstance() {
        if (instance == null) {
            synchronized (SLog.class) {
                try {
                    if (instance == null) {
                        SLog sLog = new SLog();
                        instance = sLog;
                        sLog.m84304c();
                        f60259c = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX INFO: renamed from: i */
    public static final void m84309i(String str, String str2) {
        getInstance().m84318a(4, str, str2, null);
    }

    public static void release() {
        synchronized (SLog.class) {
            try {
                getInstance().m84317a();
                if (instance != null) {
                    instance = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m84311u(String str, String str2) {
        getInstance().m84318a(32, str, str2, null);
    }

    /* JADX INFO: renamed from: v */
    public static final void m84313v(String str, String str2) {
        getInstance().m84318a(1, str, str2, null);
    }

    /* JADX INFO: renamed from: w */
    public static final void m84315w(String str, String str2) {
        getInstance().m84318a(8, str, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public void m84318a(int i, String str, String str2, Throwable th) {
        if (f60259c) {
            String strM84407b = C14390h.m84407b();
            if (!TextUtils.isEmpty(strM84407b)) {
                String str3 = strM84407b + " SDK_VERSION:3.5.16.lite";
                if (this.f60260a == null) {
                    return;
                }
                C14378e.f60300a.m84321a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.f60260a.m84321a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                f60259c = false;
            }
        }
        C14378e.f60300a.m84321a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (C14377d.a.m84355a(C14376c.f60286b, i)) {
            C14374a c14374a = this.f60260a;
            if (c14374a == null) {
                return;
            } else {
                c14374a.m84321a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
            }
        }
        Tracer tracer = this.f60261b;
        if (tracer != null) {
            try {
                tracer.m84321a(i, Thread.currentThread(), System.currentTimeMillis(), str, m84303a(str2), th);
            } catch (Exception e) {
                Log.e(str, "Exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84319b() {
        C14374a c14374a = this.f60260a;
        if (c14374a != null) {
            c14374a.m84333a();
        }
    }

    public void setCustomLogger(Tracer tracer) {
        this.f60261b = tracer;
    }

    /* JADX INFO: renamed from: d */
    public static final void m84306d(String str, String str2, Throwable th) {
        getInstance().m84318a(2, str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static final void m84310i(String str, String str2, Throwable th) {
        getInstance().m84318a(4, str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static final void m84314v(String str, String str2, Throwable th) {
        getInstance().m84318a(1, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static final void m84308e(String str, String str2, Throwable th) {
        getInstance().m84318a(16, str, str2, th);
    }

    /* JADX INFO: renamed from: u */
    public static final void m84312u(String str, String str2, Throwable th) {
        getInstance().m84318a(32, str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static final void m84316w(String str, String str2, Throwable th) {
        getInstance().m84318a(8, str, str2, th);
    }

    /* JADX INFO: renamed from: a */
    private String m84303a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C14377d.m84353a(str) ? "xxxxxx" : str;
    }

    /* JADX INFO: renamed from: a */
    public void m84317a() {
        C14374a c14374a = this.f60260a;
        if (c14374a != null) {
            c14374a.m84333a();
            this.f60260a.m84335b();
            this.f60260a = null;
        }
    }
}
