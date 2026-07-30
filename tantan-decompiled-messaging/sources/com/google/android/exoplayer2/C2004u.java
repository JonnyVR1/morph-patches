package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;
import p149l.p11;
import p149l.p95;

/* JADX INFO: renamed from: com.google.android.exoplayer2.u */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2004u {

    /* JADX INFO: renamed from: a */
    public final b f9116a;

    /* JADX INFO: renamed from: b */
    public final a f9117b;

    /* JADX INFO: renamed from: c */
    public final p95 f9118c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1834c0 f9119d;

    /* JADX INFO: renamed from: e */
    public int f9120e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Object f9121f;

    /* JADX INFO: renamed from: g */
    public Looper f9122g;

    /* JADX INFO: renamed from: h */
    public int f9123h;

    /* JADX INFO: renamed from: i */
    public long f9124i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f9125j = true;

    /* JADX INFO: renamed from: k */
    public boolean f9126k;

    /* JADX INFO: renamed from: l */
    public boolean f9127l;

    /* JADX INFO: renamed from: m */
    public boolean f9128m;

    /* JADX INFO: renamed from: n */
    public boolean f9129n;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.u$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        void mo10205e(C2004u c2004u);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.u$b */
    public interface b {
        /* JADX INFO: renamed from: f */
        void mo9655f(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public C2004u(a aVar, b bVar, AbstractC1834c0 abstractC1834c0, int i, p95 p95Var, Looper looper) {
        this.f9117b = aVar;
        this.f9116a = bVar;
        this.f9119d = abstractC1834c0;
        this.f9122g = looper;
        this.f9118c = p95Var;
        this.f9123h = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m11790a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            p11.m167013g(this.f9126k);
            p11.m167013g(this.f9122g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f9118c.elapsedRealtime() + j;
            while (true) {
                z = this.f9128m;
                if (z || j <= 0) {
                    break;
                }
                this.f9118c.mo167856b();
                wait(j);
                j = jElapsedRealtime - this.f9118c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9127l;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11791b() {
        return this.f9125j;
    }

    /* JADX INFO: renamed from: c */
    public Looper m11792c() {
        return this.f9122g;
    }

    /* JADX INFO: renamed from: d */
    public int m11793d() {
        return this.f9123h;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Object m11794e() {
        return this.f9121f;
    }

    /* JADX INFO: renamed from: f */
    public long m11795f() {
        return this.f9124i;
    }

    /* JADX INFO: renamed from: g */
    public b m11796g() {
        return this.f9116a;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC1834c0 m11797h() {
        return this.f9119d;
    }

    /* JADX INFO: renamed from: i */
    public int m11798i() {
        return this.f9120e;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m11799j() {
        return this.f9129n;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m11800k(boolean z) {
        this.f9127l = z | this.f9127l;
        this.f9128m = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: l */
    public C2004u m11801l() {
        p11.m167013g(!this.f9126k);
        if (this.f9124i == -9223372036854775807L) {
            p11.m167007a(this.f9125j);
        }
        this.f9126k = true;
        this.f9117b.mo10205e(this);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C2004u m11802m(@Nullable Object obj) {
        p11.m167013g(!this.f9126k);
        this.f9121f = obj;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C2004u m11803n(int i) {
        p11.m167013g(!this.f9126k);
        this.f9120e = i;
        return this;
    }
}
