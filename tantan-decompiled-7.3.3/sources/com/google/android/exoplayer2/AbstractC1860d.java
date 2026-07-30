package com.google.android.exoplayer2;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;
import p153l.bf80;
import p153l.erx;
import p153l.jzc0;
import p153l.p1j;
import p153l.w11;
import p153l.xwd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1860d implements InterfaceC2089x, InterfaceC2090y {

    /* JADX INFO: renamed from: b */
    public final int f7383b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public jzc0 f7385d;

    /* JADX INFO: renamed from: e */
    public int f7386e;

    /* JADX INFO: renamed from: f */
    public bf80 f7387f;

    /* JADX INFO: renamed from: g */
    public int f7388g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public xwd0 f7389h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C1894k[] f7390i;

    /* JADX INFO: renamed from: j */
    public long f7391j;

    /* JADX INFO: renamed from: k */
    public long f7392k;

    /* JADX INFO: renamed from: m */
    public boolean f7394m;

    /* JADX INFO: renamed from: n */
    public boolean f7395n;

    /* JADX INFO: renamed from: o */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public InterfaceC2090y.a f7396o;

    /* JADX INFO: renamed from: a */
    public final Object f7382a = new Object();

    /* JADX INFO: renamed from: c */
    public final p1j f7384c = new p1j();

    /* JADX INFO: renamed from: l */
    public long f7393l = Long.MIN_VALUE;

    public AbstractC1860d(int i) {
        this.f7383b = i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: B */
    public final void mo9814B(jzc0 jzc0Var, C1894k[] c1894kArr, xwd0 xwd0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        w11.m204371g(this.f7388g == 0);
        this.f7385d = jzc0Var;
        this.f7388g = 1;
        mo9691M(z, z2);
        mo9834o(c1894kArr, xwd0Var, j2, j3);
        m9827V(j, z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: C */
    public int mo9815C() throws ExoPlaybackException {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final ExoPlaybackException m9816D(Throwable th, @Nullable C1894k c1894k, int i) {
        return m9817E(th, c1894k, false, i);
    }

    /* JADX INFO: renamed from: E */
    public final ExoPlaybackException m9817E(Throwable th, @Nullable C1894k c1894k, boolean z, int i) {
        int iM12262p;
        if (c1894k == null || this.f7395n) {
            iM12262p = 4;
        } else {
            this.f7395n = true;
            try {
                iM12262p = InterfaceC2090y.m12262p(mo10438a(c1894k));
                this.f7395n = false;
            } catch (ExoPlaybackException unused) {
                this.f7395n = false;
                iM12262p = 4;
            } catch (Throwable th2) {
                this.f7395n = false;
                throw th2;
            }
        }
        return ExoPlaybackException.createForRenderer(th, getName(), m9820H(), c1894k, iM12262p, z, i);
    }

    /* JADX INFO: renamed from: F */
    public final jzc0 m9818F() {
        return (jzc0) w11.m204369e(this.f7385d);
    }

    /* JADX INFO: renamed from: G */
    public final p1j m9819G() {
        this.f7384c.m170208a();
        return this.f7384c;
    }

    /* JADX INFO: renamed from: H */
    public final int m9820H() {
        return this.f7386e;
    }

    /* JADX INFO: renamed from: I */
    public final bf80 m9821I() {
        return (bf80) w11.m204369e(this.f7387f);
    }

    /* JADX INFO: renamed from: J */
    public final C1894k[] m9822J() {
        return (C1894k[]) w11.m204369e(this.f7390i);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9823K() {
        return mo9829d() ? this.f7394m : ((xwd0) w11.m204369e(this.f7389h)).mo10994b();
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo9690L();

    /* JADX INFO: renamed from: M */
    public void mo9691M(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo9692N(long j, boolean z) throws ExoPlaybackException;

    /* JADX INFO: renamed from: O */
    public void mo9693O() {
    }

    /* JADX INFO: renamed from: P */
    public final void m9824P() {
        InterfaceC2090y.a aVar;
        synchronized (this.f7382a) {
            aVar = this.f7396o;
        }
        if (aVar != null) {
            aVar.mo12267b(this);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo9695Q() {
    }

    /* JADX INFO: renamed from: R */
    public void mo9697R() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: S */
    public void mo9699S() {
    }

    /* JADX INFO: renamed from: T */
    public abstract void mo9825T(C1894k[] c1894kArr, long j, long j2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: U */
    public final int m9826U(p1j p1jVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iMo10997l = ((xwd0) w11.m204369e(this.f7389h)).mo10997l(p1jVar, decoderInputBuffer, i);
        if (iMo10997l != -4) {
            if (iMo10997l == -5) {
                C1894k c1894k = (C1894k) w11.m204369e(p1jVar.f150174b);
                if (c1894k.f7789p != Long.MAX_VALUE) {
                    p1jVar.f150174b = c1894k.m10336b().m10404k0(c1894k.f7789p + this.f7391j).m10374G();
                }
            }
            return iMo10997l;
        }
        if (decoderInputBuffer.m97779p()) {
            this.f7393l = Long.MIN_VALUE;
            return this.f7394m ? -4 : -3;
        }
        long j = decoderInputBuffer.f7414e + this.f7391j;
        decoderInputBuffer.f7414e = j;
        this.f7393l = Math.max(this.f7393l, j);
        return iMo10997l;
    }

    /* JADX INFO: renamed from: V */
    public final void m9827V(long j, boolean z) throws ExoPlaybackException {
        this.f7394m = false;
        this.f7392k = j;
        this.f7393l = j;
        mo9692N(j, z);
    }

    /* JADX INFO: renamed from: W */
    public int m9828W(long j) {
        return ((xwd0) w11.m204369e(this.f7389h)).mo10996k(j - this.f7391j);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: d */
    public final boolean mo9829d() {
        return this.f7393l == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final void disable() {
        w11.m204371g(this.f7388g == 1);
        this.f7384c.m170208a();
        this.f7388g = 0;
        this.f7389h = null;
        this.f7390i = null;
        this.f7394m = false;
        mo9690L();
    }

    @Override // com.google.android.exoplayer2.C2027u.b
    /* JADX INFO: renamed from: f */
    public void mo9709f(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: g */
    public final boolean mo9830g() {
        return this.f7394m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final int getState() {
        return this.f7388g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    @Nullable
    public final xwd0 getStream() {
        return this.f7389h;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x, com.google.android.exoplayer2.InterfaceC2090y
    public final int getTrackType() {
        return this.f7383b;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: k */
    public final long mo9831k() {
        return this.f7393l;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: l */
    public final void mo9832l(long j) throws ExoPlaybackException {
        m9827V(j, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    @Nullable
    /* JADX INFO: renamed from: m */
    public erx mo9711m() {
        return null;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: n */
    public final void mo9833n(InterfaceC2090y.a aVar) {
        synchronized (this.f7382a) {
            this.f7396o = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: o */
    public final void mo9834o(C1894k[] c1894kArr, xwd0 xwd0Var, long j, long j2) throws ExoPlaybackException {
        w11.m204371g(!this.f7394m);
        this.f7389h = xwd0Var;
        if (this.f7393l == Long.MIN_VALUE) {
            this.f7393l = j;
        }
        this.f7390i = c1894kArr;
        this.f7391j = j2;
        mo9825T(c1894kArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2090y
    /* JADX INFO: renamed from: q */
    public final void mo9835q() {
        synchronized (this.f7382a) {
            this.f7396o = null;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final void release() {
        w11.m204371g(this.f7388g == 0);
        mo9693O();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final void reset() {
        w11.m204371g(this.f7388g == 0);
        this.f7384c.m170208a();
        mo9695Q();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: s */
    public final void mo9836s() {
        this.f7394m = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final void start() throws ExoPlaybackException {
        w11.m204371g(this.f7388g == 1);
        this.f7388g = 2;
        mo9697R();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    public final void stop() {
        w11.m204371g(this.f7388g == 2);
        this.f7388g = 1;
        mo9699S();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: w */
    public final void mo9837w() throws IOException {
        ((xwd0) w11.m204369e(this.f7389h)).mo10993a();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: x */
    public final void mo9838x(int i, bf80 bf80Var) {
        this.f7386e = i;
        this.f7387f = bf80Var;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2089x
    /* JADX INFO: renamed from: y */
    public final InterfaceC2090y mo9839y() {
        return this;
    }
}
