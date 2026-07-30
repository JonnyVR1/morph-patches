package com.google.android.exoplayer2;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import org.aspectj.lang.JoinPoint;
import p149l.erc0;
import p149l.hix;
import p149l.p11;
import p149l.uyi;
import p149l.v680;
import p149l.vod0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1837d implements InterfaceC2066x, InterfaceC2067y {

    /* JADX INFO: renamed from: b */
    public final int f7346b;

    /* JADX INFO: renamed from: d */
    @Nullable
    public erc0 f7348d;

    /* JADX INFO: renamed from: e */
    public int f7349e;

    /* JADX INFO: renamed from: f */
    public v680 f7350f;

    /* JADX INFO: renamed from: g */
    public int f7351g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public vod0 f7352h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C1871k[] f7353i;

    /* JADX INFO: renamed from: j */
    public long f7354j;

    /* JADX INFO: renamed from: k */
    public long f7355k;

    /* JADX INFO: renamed from: m */
    public boolean f7357m;

    /* JADX INFO: renamed from: n */
    public boolean f7358n;

    /* JADX INFO: renamed from: o */
    @Nullable
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public InterfaceC2067y.a f7359o;

    /* JADX INFO: renamed from: a */
    public final Object f7345a = new Object();

    /* JADX INFO: renamed from: c */
    public final uyi f7347c = new uyi();

    /* JADX INFO: renamed from: l */
    public long f7356l = Long.MIN_VALUE;

    public AbstractC1837d(int i) {
        this.f7346b = i;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: B */
    public final void mo9760B(erc0 erc0Var, C1871k[] c1871kArr, vod0 vod0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        p11.m167013g(this.f7351g == 0);
        this.f7348d = erc0Var;
        this.f7351g = 1;
        mo9637M(z, z2);
        mo9780o(c1871kArr, vod0Var, j2, j3);
        m9773V(j, z);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: C */
    public int mo9761C() throws ExoPlaybackException {
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public final ExoPlaybackException m9762D(Throwable th, @Nullable C1871k c1871k, int i) {
        return m9763E(th, c1871k, false, i);
    }

    /* JADX INFO: renamed from: E */
    public final ExoPlaybackException m9763E(Throwable th, @Nullable C1871k c1871k, boolean z, int i) {
        int iM12208p;
        if (c1871k == null || this.f7358n) {
            iM12208p = 4;
        } else {
            this.f7358n = true;
            try {
                iM12208p = InterfaceC2067y.m12208p(mo10384a(c1871k));
                this.f7358n = false;
            } catch (ExoPlaybackException unused) {
                this.f7358n = false;
                iM12208p = 4;
            } catch (Throwable th2) {
                this.f7358n = false;
                throw th2;
            }
        }
        return ExoPlaybackException.createForRenderer(th, getName(), m9766H(), c1871k, iM12208p, z, i);
    }

    /* JADX INFO: renamed from: F */
    public final erc0 m9764F() {
        return (erc0) p11.m167011e(this.f7348d);
    }

    /* JADX INFO: renamed from: G */
    public final uyi m9765G() {
        this.f7347c.m196291a();
        return this.f7347c;
    }

    /* JADX INFO: renamed from: H */
    public final int m9766H() {
        return this.f7349e;
    }

    /* JADX INFO: renamed from: I */
    public final v680 m9767I() {
        return (v680) p11.m167011e(this.f7350f);
    }

    /* JADX INFO: renamed from: J */
    public final C1871k[] m9768J() {
        return (C1871k[]) p11.m167011e(this.f7353i);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9769K() {
        return mo9775d() ? this.f7357m : ((vod0) p11.m167011e(this.f7352h)).mo10940b();
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo9636L();

    /* JADX INFO: renamed from: M */
    public void mo9637M(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: N */
    public abstract void mo9638N(long j, boolean z) throws ExoPlaybackException;

    /* JADX INFO: renamed from: O */
    public void mo9639O() {
    }

    /* JADX INFO: renamed from: P */
    public final void m9770P() {
        InterfaceC2067y.a aVar;
        synchronized (this.f7345a) {
            aVar = this.f7359o;
        }
        if (aVar != null) {
            aVar.mo12213b(this);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo9641Q() {
    }

    /* JADX INFO: renamed from: R */
    public void mo9643R() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: S */
    public void mo9645S() {
    }

    /* JADX INFO: renamed from: T */
    public abstract void mo9771T(C1871k[] c1871kArr, long j, long j2) throws ExoPlaybackException;

    /* JADX INFO: renamed from: U */
    public final int m9772U(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iMo10943l = ((vod0) p11.m167011e(this.f7352h)).mo10943l(uyiVar, decoderInputBuffer, i);
        if (iMo10943l != -4) {
            if (iMo10943l == -5) {
                C1871k c1871k = (C1871k) p11.m167011e(uyiVar.f178866b);
                if (c1871k.f7752p != Long.MAX_VALUE) {
                    uyiVar.f178866b = c1871k.m10282b().m10350k0(c1871k.f7752p + this.f7354j).m10320G();
                }
            }
            return iMo10943l;
        }
        if (decoderInputBuffer.m154495p()) {
            this.f7356l = Long.MIN_VALUE;
            return this.f7357m ? -4 : -3;
        }
        long j = decoderInputBuffer.f7377e + this.f7354j;
        decoderInputBuffer.f7377e = j;
        this.f7356l = Math.max(this.f7356l, j);
        return iMo10943l;
    }

    /* JADX INFO: renamed from: V */
    public final void m9773V(long j, boolean z) throws ExoPlaybackException {
        this.f7357m = false;
        this.f7355k = j;
        this.f7356l = j;
        mo9638N(j, z);
    }

    /* JADX INFO: renamed from: W */
    public int m9774W(long j) {
        return ((vod0) p11.m167011e(this.f7352h)).mo10942k(j - this.f7354j);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: d */
    public final boolean mo9775d() {
        return this.f7356l == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final void disable() {
        p11.m167013g(this.f7351g == 1);
        this.f7347c.m196291a();
        this.f7351g = 0;
        this.f7352h = null;
        this.f7353i = null;
        this.f7357m = false;
        mo9636L();
    }

    @Override // com.google.android.exoplayer2.C2004u.b
    /* JADX INFO: renamed from: f */
    public void mo9655f(int i, @Nullable Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: g */
    public final boolean mo9776g() {
        return this.f7357m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final int getState() {
        return this.f7351g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    @Nullable
    public final vod0 getStream() {
        return this.f7352h;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x, com.google.android.exoplayer2.InterfaceC2067y
    public final int getTrackType() {
        return this.f7346b;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: k */
    public final long mo9777k() {
        return this.f7356l;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: l */
    public final void mo9778l(long j) throws ExoPlaybackException {
        m9773V(j, false);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    @Nullable
    /* JADX INFO: renamed from: m */
    public hix mo9657m() {
        return null;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: n */
    public final void mo9779n(InterfaceC2067y.a aVar) {
        synchronized (this.f7345a) {
            this.f7359o = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: o */
    public final void mo9780o(C1871k[] c1871kArr, vod0 vod0Var, long j, long j2) throws ExoPlaybackException {
        p11.m167013g(!this.f7357m);
        this.f7352h = vod0Var;
        if (this.f7356l == Long.MIN_VALUE) {
            this.f7356l = j;
        }
        this.f7353i = c1871kArr;
        this.f7354j = j2;
        mo9771T(c1871kArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2067y
    /* JADX INFO: renamed from: q */
    public final void mo9781q() {
        synchronized (this.f7345a) {
            this.f7359o = null;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final void release() {
        p11.m167013g(this.f7351g == 0);
        mo9639O();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final void reset() {
        p11.m167013g(this.f7351g == 0);
        this.f7347c.m196291a();
        mo9641Q();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: s */
    public final void mo9782s() {
        this.f7357m = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final void start() throws ExoPlaybackException {
        p11.m167013g(this.f7351g == 1);
        this.f7351g = 2;
        mo9643R();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    public final void stop() {
        p11.m167013g(this.f7351g == 2);
        this.f7351g = 1;
        mo9645S();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: w */
    public final void mo9783w() throws IOException {
        ((vod0) p11.m167011e(this.f7352h)).mo10939a();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: x */
    public final void mo9784x(int i, v680 v680Var) {
        this.f7349e = i;
        this.f7350f = v680Var;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2066x
    /* JADX INFO: renamed from: y */
    public final InterfaceC2067y mo9785y() {
        return this;
    }
}
