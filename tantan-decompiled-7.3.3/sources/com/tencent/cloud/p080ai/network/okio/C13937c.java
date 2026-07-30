package com.tencent.cloud.p080ai.network.okio;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.c */
/* JADX INFO: loaded from: classes12.dex */
public class C13937c extends C13958x {

    /* JADX INFO: renamed from: h */
    public static final long f57808h = Constants.ONE_MIN_IN_MILLIS;

    /* JADX INFO: renamed from: i */
    public static final long f57809i = TimeUnit.MILLISECONDS.toNanos(Constants.ONE_MIN_IN_MILLIS);

    /* JADX INFO: renamed from: j */
    public static C13937c f57810j;

    /* JADX INFO: renamed from: e */
    public boolean f57811e;

    /* JADX INFO: renamed from: f */
    public C13937c f57812f;

    /* JADX INFO: renamed from: g */
    public long f57813g;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.c$a */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r0.mo82868j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                try {
                    synchronized (C13937c.class) {
                        try {
                            C13937c c13937cM83074g = C13937c.m83074g();
                            if (c13937cM83074g != null) {
                                if (c13937cM83074g == C13937c.f57810j) {
                                    C13937c.f57810j = null;
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static C13937c m83074g() throws InterruptedException {
        C13937c c13937c = f57810j.f57812f;
        if (c13937c == null) {
            long jNanoTime = System.nanoTime();
            C13937c.class.wait(f57808h);
            if (f57810j.f57812f != null || System.nanoTime() - jNanoTime < f57809i) {
                return null;
            }
            return f57810j;
        }
        long jNanoTime2 = c13937c.f57813g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C13937c.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f57810j.f57812f = c13937c.f57812f;
        c13937c.f57812f = null;
        return c13937c;
    }

    /* JADX INFO: renamed from: a */
    public final void m83075a(boolean z) throws IOException {
        if (m83077i() && z) {
            throw mo82951a((IOException) null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m83076h() {
        C13937c c13937c;
        if (this.f57811e) {
            wtq0.m207906a("Unbalanced enter/exit");
            return;
        }
        long j = this.f57867c;
        boolean z = this.f57865a;
        if (j != 0 || z) {
            this.f57811e = true;
            synchronized (C13937c.class) {
                try {
                    if (f57810j == null) {
                        f57810j = new C13937c();
                        new a().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j != 0 && z) {
                        this.f57813g = Math.min(j, mo83136c() - jNanoTime) + jNanoTime;
                    } else if (j != 0) {
                        this.f57813g = j + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.f57813g = mo83136c();
                    }
                    long j2 = this.f57813g - jNanoTime;
                    C13937c c13937c2 = f57810j;
                    while (true) {
                        c13937c = c13937c2.f57812f;
                        if (c13937c == null || j2 < c13937c.f57813g - jNanoTime) {
                            break;
                            break;
                        }
                        c13937c2 = c13937c;
                    }
                    this.f57812f = c13937c;
                    c13937c2.f57812f = this;
                    if (c13937c2 == f57810j) {
                        C13937c.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m83077i() {
        if (!this.f57811e) {
            return false;
        }
        this.f57811e = false;
        synchronized (C13937c.class) {
            C13937c c13937c = f57810j;
            while (c13937c != null) {
                C13937c c13937c2 = c13937c.f57812f;
                if (c13937c2 == this) {
                    c13937c.f57812f = this.f57812f;
                    this.f57812f = null;
                    return false;
                }
                c13937c = c13937c2;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo82868j() {
    }

    /* JADX INFO: renamed from: a */
    public IOException mo82951a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
