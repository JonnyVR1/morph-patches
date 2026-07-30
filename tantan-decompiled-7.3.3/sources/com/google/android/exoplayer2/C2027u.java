package com.google.android.exoplayer2;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;
import p153l.qa5;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.u */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2027u {

    /* JADX INFO: renamed from: a */
    public final b f9153a;

    /* JADX INFO: renamed from: b */
    public final a f9154b;

    /* JADX INFO: renamed from: c */
    public final qa5 f9155c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1857c0 f9156d;

    /* JADX INFO: renamed from: e */
    public int f9157e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Object f9158f;

    /* JADX INFO: renamed from: g */
    public Looper f9159g;

    /* JADX INFO: renamed from: h */
    public int f9160h;

    /* JADX INFO: renamed from: i */
    public long f9161i = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public boolean f9162j = true;

    /* JADX INFO: renamed from: k */
    public boolean f9163k;

    /* JADX INFO: renamed from: l */
    public boolean f9164l;

    /* JADX INFO: renamed from: m */
    public boolean f9165m;

    /* JADX INFO: renamed from: n */
    public boolean f9166n;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.u$a */
    public interface a {
        /* JADX INFO: renamed from: e */
        void mo10259e(C2027u c2027u);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.u$b */
    public interface b {
        /* JADX INFO: renamed from: f */
        void mo9709f(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public C2027u(a aVar, b bVar, AbstractC1857c0 abstractC1857c0, int i, qa5 qa5Var, Looper looper) {
        this.f9154b = aVar;
        this.f9153a = bVar;
        this.f9156d = abstractC1857c0;
        this.f9159g = looper;
        this.f9155c = qa5Var;
        this.f9160h = i;
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m11844a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            w11.m204371g(this.f9163k);
            w11.m204371g(this.f9159g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f9155c.elapsedRealtime() + j;
            while (true) {
                z = this.f9165m;
                if (z || j <= 0) {
                    break;
                }
                this.f9155c.mo111760b();
                wait(j);
                j = jElapsedRealtime - this.f9155c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9164l;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11845b() {
        return this.f9162j;
    }

    /* JADX INFO: renamed from: c */
    public Looper m11846c() {
        return this.f9159g;
    }

    /* JADX INFO: renamed from: d */
    public int m11847d() {
        return this.f9160h;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Object m11848e() {
        return this.f9158f;
    }

    /* JADX INFO: renamed from: f */
    public long m11849f() {
        return this.f9161i;
    }

    /* JADX INFO: renamed from: g */
    public b m11850g() {
        return this.f9153a;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC1857c0 m11851h() {
        return this.f9156d;
    }

    /* JADX INFO: renamed from: i */
    public int m11852i() {
        return this.f9157e;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m11853j() {
        return this.f9166n;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m11854k(boolean z) {
        this.f9164l = z | this.f9164l;
        this.f9165m = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: l */
    public C2027u m11855l() {
        w11.m204371g(!this.f9163k);
        if (this.f9161i == -9223372036854775807L) {
            w11.m204365a(this.f9162j);
        }
        this.f9163k = true;
        this.f9154b.mo10259e(this);
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C2027u m11856m(@Nullable Object obj) {
        w11.m204371g(!this.f9163k);
        this.f9158f = obj;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C2027u m11857n(int i) {
        w11.m204371g(!this.f9163k);
        this.f9157e = i;
        return this;
    }
}
