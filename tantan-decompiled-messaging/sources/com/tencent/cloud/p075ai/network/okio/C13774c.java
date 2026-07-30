package com.tencent.cloud.p075ai.network.okio;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p149l.qkq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.c */
/* JADX INFO: loaded from: classes13.dex */
public class C13774c extends C13795x {

    /* JADX INFO: renamed from: h */
    public static final long f56960h = Constants.ONE_MIN_IN_MILLIS;

    /* JADX INFO: renamed from: i */
    public static final long f56961i = TimeUnit.MILLISECONDS.toNanos(Constants.ONE_MIN_IN_MILLIS);

    /* JADX INFO: renamed from: j */
    public static C13774c f56962j;

    /* JADX INFO: renamed from: e */
    public boolean f56963e;

    /* JADX INFO: renamed from: f */
    public C13774c f56964f;

    /* JADX INFO: renamed from: g */
    public long f56965g;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.c$a */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r0.mo81685j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r2 = this;
            L0:
                java.lang.Class<com.tencent.cloud.ai.network.okio.c> r2 = com.tencent.cloud.p075ai.network.okio.C13774c.class
                monitor-enter(r2)     // Catch: java.lang.InterruptedException -> L0
                com.tencent.cloud.ai.network.okio.c r0 = com.tencent.cloud.p075ai.network.okio.C13774c.m81891g()     // Catch: java.lang.Throwable -> Lb
                if (r0 != 0) goto Ld
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r0 = move-exception
                goto L1b
            Ld:
                com.tencent.cloud.ai.network.okio.c r1 = com.tencent.cloud.p075ai.network.okio.C13774c.f56962j     // Catch: java.lang.Throwable -> Lb
                if (r0 != r1) goto L16
                r0 = 0
                com.tencent.cloud.p075ai.network.okio.C13774c.f56962j = r0     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                r0.mo81685j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
                throw r0     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.cloud.p075ai.network.okio.C13774c.a.run():void");
        }
    }

    /* JADX INFO: renamed from: g */
    public static C13774c m81891g() throws InterruptedException {
        C13774c c13774c = f56962j.f56964f;
        if (c13774c == null) {
            long jNanoTime = System.nanoTime();
            C13774c.class.wait(f56960h);
            if (f56962j.f56964f != null || System.nanoTime() - jNanoTime < f56961i) {
                return null;
            }
            return f56962j;
        }
        long jNanoTime2 = c13774c.f56965g - System.nanoTime();
        if (jNanoTime2 > 0) {
            long j = jNanoTime2 / 1000000;
            C13774c.class.wait(j, (int) (jNanoTime2 - (1000000 * j)));
            return null;
        }
        f56962j.f56964f = c13774c.f56964f;
        c13774c.f56964f = null;
        return c13774c;
    }

    /* JADX INFO: renamed from: a */
    public final void m81892a(boolean z) throws IOException {
        if (m81894i() && z) {
            throw mo81768a((IOException) null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m81893h() {
        C13774c c13774c;
        if (this.f56963e) {
            qkq0.m175383a("Unbalanced enter/exit");
            return;
        }
        long j = this.f57019c;
        boolean z = this.f57017a;
        if (j != 0 || z) {
            this.f56963e = true;
            synchronized (C13774c.class) {
                try {
                    if (f56962j == null) {
                        f56962j = new C13774c();
                        new a().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j != 0 && z) {
                        this.f56965g = Math.min(j, mo81953c() - jNanoTime) + jNanoTime;
                    } else if (j != 0) {
                        this.f56965g = j + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.f56965g = mo81953c();
                    }
                    long j2 = this.f56965g - jNanoTime;
                    C13774c c13774c2 = f56962j;
                    while (true) {
                        c13774c = c13774c2.f56964f;
                        if (c13774c == null || j2 < c13774c.f56965g - jNanoTime) {
                            break;
                            break;
                        }
                        c13774c2 = c13774c;
                    }
                    this.f56964f = c13774c;
                    c13774c2.f56964f = this;
                    if (c13774c2 == f56962j) {
                        C13774c.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m81894i() {
        if (!this.f56963e) {
            return false;
        }
        this.f56963e = false;
        synchronized (C13774c.class) {
            C13774c c13774c = f56962j;
            while (c13774c != null) {
                C13774c c13774c2 = c13774c.f56964f;
                if (c13774c2 == this) {
                    c13774c.f56964f = this.f56964f;
                    this.f56964f = null;
                    return false;
                }
                c13774c = c13774c2;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo81685j() {
    }

    /* JADX INFO: renamed from: a */
    public IOException mo81768a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
