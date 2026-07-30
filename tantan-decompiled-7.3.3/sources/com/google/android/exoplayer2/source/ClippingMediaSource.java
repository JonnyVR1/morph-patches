package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import java.io.IOException;
import java.util.ArrayList;
import p153l.bmk0;
import p153l.c3j;
import p153l.oj0;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ClippingMediaSource extends AbstractC2025u {

    /* JADX INFO: renamed from: f */
    public final long f8291f;

    /* JADX INFO: renamed from: g */
    public final long f8292g;

    /* JADX INFO: renamed from: h */
    public final boolean f8293h;

    /* JADX INFO: renamed from: i */
    public final boolean f8294i;

    /* JADX INFO: renamed from: j */
    public final boolean f8295j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<C1958b> f8296k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1857c0.d f8297l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C1955a f8298m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public IllegalClippingException f8299n;

    /* JADX INFO: renamed from: o */
    public long f8300o;

    /* JADX INFO: renamed from: p */
    public long f8301p;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        public IllegalClippingException(int i) {
            super("Illegal clipping: " + getReasonDescription(i));
            this.reason = i;
        }

        private static String getReasonDescription(int i) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i != 1) {
                return i != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ClippingMediaSource$a */
    public static final class C1955a extends c3j {

        /* JADX INFO: renamed from: g */
        public final long f8302g;

        /* JADX INFO: renamed from: h */
        public final long f8303h;

        /* JADX INFO: renamed from: i */
        public final long f8304i;

        /* JADX INFO: renamed from: j */
        public final boolean f8305j;

        public C1955a(AbstractC1857c0 abstractC1857c0, long j, long j2) throws IllegalClippingException {
            super(abstractC1857c0);
            boolean z = false;
            if (abstractC1857c0.mo9771m() != 1) {
                throw new IllegalClippingException(0);
            }
            AbstractC1857c0.d dVarM9774r = abstractC1857c0.m9774r(0, new AbstractC1857c0.d());
            long jMax = Math.max(0L, j);
            if (!dVarM9774r.f7376l && jMax != 0 && !dVarM9774r.f7372h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? dVarM9774r.f7378n : Math.max(0L, j2);
            long j3 = dVarM9774r.f7378n;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f8302g = jMax;
            this.f8303h = jMax2;
            this.f8304i = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarM9774r.f7373i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f8305j = z;
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: k */
        public AbstractC1857c0.b mo9453k(int i, AbstractC1857c0.b bVar, boolean z) {
            this.f79626f.mo9453k(0, bVar, z);
            long jM9794q = bVar.m9794q() - this.f8302g;
            long j = this.f8304i;
            return bVar.m9799v(bVar.f7337a, bVar.f7338b, 0, j != -9223372036854775807L ? j - jM9794q : -9223372036854775807L, jM9794q);
        }

        @Override // p153l.c3j, com.google.android.exoplayer2.AbstractC1857c0
        /* JADX INFO: renamed from: s */
        public AbstractC1857c0.d mo9457s(int i, AbstractC1857c0.d dVar, long j) {
            this.f79626f.mo9457s(0, dVar, 0L);
            long j2 = dVar.f7381q;
            long j3 = this.f8302g;
            dVar.f7381q = j2 + j3;
            dVar.f7378n = this.f8304i;
            dVar.f7373i = this.f8305j;
            long j4 = dVar.f7377m;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                dVar.f7377m = jMax;
                long j5 = this.f8303h;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                dVar.f7377m = jMax - this.f8302g;
            }
            long jM105152l1 = bmk0.m105152l1(this.f8302g);
            long j6 = dVar.f7369e;
            if (j6 != -9223372036854775807L) {
                dVar.f7369e = j6 + jM105152l1;
            }
            long j7 = dVar.f7370f;
            if (j7 != -9223372036854775807L) {
                dVar.f7370f = j7 + jM105152l1;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(InterfaceC1988i interfaceC1988i, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((InterfaceC1988i) w11.m204369e(interfaceC1988i));
        w11.m204365a(j >= 0);
        this.f8291f = j;
        this.f8292g = j2;
        this.f8293h = z;
        this.f8294i = z2;
        this.f8295j = z3;
        this.f8296k = new ArrayList<>();
        this.f8297l = new AbstractC1857c0.d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public InterfaceC1976h createPeriod(InterfaceC1988i.b bVar, oj0 oj0Var, long j) {
        C1958b c1958b = new C1958b(this.f9127d.createPeriod(bVar, oj0Var, j), this.f8293h, this.f8300o, this.f8301p);
        this.f8296k.add(c1958b);
        return c1958b;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.InterfaceC1988i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.f8299n;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2025u
    /* JADX INFO: renamed from: p */
    public void mo10967p(AbstractC1857c0 abstractC1857c0) {
        if (this.f8299n != null) {
            return;
        }
        m10968u(abstractC1857c0);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1988i
    public void releasePeriod(InterfaceC1976h interfaceC1976h) {
        w11.m204371g(this.f8296k.remove(interfaceC1976h));
        this.f9127d.releasePeriod(((C1958b) interfaceC1976h).f8320a);
        if (!this.f8296k.isEmpty() || this.f8294i) {
            return;
        }
        m10968u(((C1955a) w11.m204369e(this.f8298m)).f79626f);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1959c, com.google.android.exoplayer2.source.AbstractC1957a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f8299n = null;
        this.f8298m = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m10968u(AbstractC1857c0 abstractC1857c0) {
        long j;
        abstractC1857c0.m9774r(0, this.f8297l);
        long jM9807g = this.f8297l.m9807g();
        long j2 = Long.MIN_VALUE;
        if (this.f8298m == null || this.f8296k.isEmpty() || this.f8294i) {
            j = this.f8291f;
            long j3 = this.f8292g;
            if (this.f8295j) {
                long jM9805e = this.f8297l.m9805e();
                j += jM9805e;
                j3 += jM9805e;
            }
            this.f8300o = jM9807g + j;
            this.f8301p = this.f8292g != Long.MIN_VALUE ? jM9807g + j3 : Long.MIN_VALUE;
            int size = this.f8296k.size();
            for (int i = 0; i < size; i++) {
                this.f8296k.get(i).m10992v(this.f8300o, this.f8301p);
            }
            j2 = j3;
        } else {
            j = this.f8300o - jM9807g;
            if (this.f8292g != Long.MIN_VALUE) {
                j2 = this.f8301p - jM9807g;
            }
        }
        try {
            C1955a c1955a = new C1955a(abstractC1857c0, j, j2);
            this.f8298m = c1955a;
            refreshSourceInfo(c1955a);
        } catch (IllegalClippingException e) {
            this.f8299n = e;
            for (int i2 = 0; i2 < this.f8296k.size(); i2++) {
                this.f8296k.get(i2).m10988q(this.f8299n);
            }
        }
    }
}
