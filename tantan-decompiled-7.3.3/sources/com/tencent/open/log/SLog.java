package com.tencent.open.log;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.open.utils.C14553h;

/* JADX INFO: loaded from: classes2.dex */
public class SLog implements TraceLevel {
    public static final String TAG = "openSDK_LOG";

    /* JADX INFO: renamed from: c */
    private static boolean f61107c = false;
    public static SLog instance;

    /* JADX INFO: renamed from: a */
    protected C14537a f61108a;

    /* JADX INFO: renamed from: b */
    private Tracer f61109b;

    private SLog() {
    }

    /* JADX INFO: renamed from: c */
    private void m85487c() {
        this.f61108a = new C14537a(new C14538b(C14539c.f61145m, C14539c.f61139g, C14539c.f61140h, C14539c.f61135c, C14539c.f61141i, 10, C14539c.f61137e, C14539c.f61146n));
    }

    /* JADX INFO: renamed from: d */
    public static final void m85488d(String str, String str2) {
        getInstance().m85501a(2, str, str2, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m85490e(String str, String str2) {
        getInstance().m85501a(16, str, str2, null);
    }

    public static void flushLogs() {
        getInstance().m85502b();
    }

    public static SLog getInstance() {
        if (instance == null) {
            synchronized (SLog.class) {
                try {
                    if (instance == null) {
                        SLog sLog = new SLog();
                        instance = sLog;
                        sLog.m85487c();
                        f61107c = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    /* JADX INFO: renamed from: i */
    public static final void m85492i(String str, String str2) {
        getInstance().m85501a(4, str, str2, null);
    }

    public static void release() {
        synchronized (SLog.class) {
            try {
                getInstance().m85500a();
                if (instance != null) {
                    instance = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m85494u(String str, String str2) {
        getInstance().m85501a(32, str, str2, null);
    }

    /* JADX INFO: renamed from: v */
    public static final void m85496v(String str, String str2) {
        getInstance().m85501a(1, str, str2, null);
    }

    /* JADX INFO: renamed from: w */
    public static final void m85498w(String str, String str2) {
        getInstance().m85501a(8, str, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public void m85501a(int i, String str, String str2, Throwable th) {
        if (f61107c) {
            String strM85590b = C14553h.m85590b();
            if (!TextUtils.isEmpty(strM85590b)) {
                String str3 = strM85590b + " SDK_VERSION:3.5.16.lite";
                if (this.f61108a == null) {
                    return;
                }
                C14541e.f61148a.m85504a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                this.f61108a.m85504a(32, Thread.currentThread(), System.currentTimeMillis(), TAG, str3, null);
                f61107c = false;
            }
        }
        C14541e.f61148a.m85504a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
        if (C14540d.a.m85538a(C14539c.f61134b, i)) {
            C14537a c14537a = this.f61108a;
            if (c14537a == null) {
                return;
            } else {
                c14537a.m85504a(i, Thread.currentThread(), System.currentTimeMillis(), str, str2, th);
            }
        }
        Tracer tracer = this.f61109b;
        if (tracer != null) {
            try {
                tracer.m85504a(i, Thread.currentThread(), System.currentTimeMillis(), str, m85486a(str2), th);
            } catch (Exception e) {
                Log.e(str, "Exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m85502b() {
        C14537a c14537a = this.f61108a;
        if (c14537a != null) {
            c14537a.m85516a();
        }
    }

    public void setCustomLogger(Tracer tracer) {
        this.f61109b = tracer;
    }

    /* JADX INFO: renamed from: d */
    public static final void m85489d(String str, String str2, Throwable th) {
        getInstance().m85501a(2, str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static final void m85493i(String str, String str2, Throwable th) {
        getInstance().m85501a(4, str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static final void m85497v(String str, String str2, Throwable th) {
        getInstance().m85501a(1, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static final void m85491e(String str, String str2, Throwable th) {
        getInstance().m85501a(16, str, str2, th);
    }

    /* JADX INFO: renamed from: u */
    public static final void m85495u(String str, String str2, Throwable th) {
        getInstance().m85501a(32, str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static final void m85499w(String str, String str2, Throwable th) {
        getInstance().m85501a(8, str, str2, th);
    }

    /* JADX INFO: renamed from: a */
    private String m85486a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C14540d.m85536a(str) ? "xxxxxx" : str;
    }

    /* JADX INFO: renamed from: a */
    public void m85500a() {
        C14537a c14537a = this.f61108a;
        if (c14537a != null) {
            c14537a.m85516a();
            this.f61108a.m85518b();
            this.f61108a = null;
        }
    }
}
