package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import java.io.IOException;
import java.util.ArrayList;
import p149l.h0j;
import p149l.p11;
import p149l.sj0;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ClippingMediaSource extends AbstractC2002u {

    /* JADX INFO: renamed from: f */
    public final long f8254f;

    /* JADX INFO: renamed from: g */
    public final long f8255g;

    /* JADX INFO: renamed from: h */
    public final boolean f8256h;

    /* JADX INFO: renamed from: i */
    public final boolean f8257i;

    /* JADX INFO: renamed from: j */
    public final boolean f8258j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<C1935b> f8259k;

    /* JADX INFO: renamed from: l */
    public final AbstractC1834c0.d f8260l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public C1932a f8261m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public IllegalClippingException f8262n;

    /* JADX INFO: renamed from: o */
    public long f8263o;

    /* JADX INFO: renamed from: p */
    public long f8264p;

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
    public static final class C1932a extends h0j {

        /* JADX INFO: renamed from: g */
        public final long f8265g;

        /* JADX INFO: renamed from: h */
        public final long f8266h;

        /* JADX INFO: renamed from: i */
        public final long f8267i;

        /* JADX INFO: renamed from: j */
        public final boolean f8268j;

        public C1932a(AbstractC1834c0 abstractC1834c0, long j, long j2) throws IllegalClippingException {
            super(abstractC1834c0);
            boolean z = false;
            if (abstractC1834c0.mo9717m() != 1) {
                throw new IllegalClippingException(0);
            }
            AbstractC1834c0.d dVarM9720r = abstractC1834c0.m9720r(0, new AbstractC1834c0.d());
            long jMax = Math.max(0L, j);
            if (!dVarM9720r.f7339l && jMax != 0 && !dVarM9720r.f7335h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? dVarM9720r.f7341n : Math.max(0L, j2);
            long j3 = dVarM9720r.f7341n;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f8265g = jMax;
            this.f8266h = jMax2;
            this.f8267i = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (dVarM9720r.f7336i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f8268j = z;
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: k */
        public AbstractC1834c0.b mo9399k(int i, AbstractC1834c0.b bVar, boolean z) {
            this.f105222f.mo9399k(0, bVar, z);
            long jM9740q = bVar.m9740q() - this.f8265g;
            long j = this.f8267i;
            return bVar.m9745v(bVar.f7300a, bVar.f7301b, 0, j != -9223372036854775807L ? j - jM9740q : -9223372036854775807L, jM9740q);
        }

        @Override // p149l.h0j, com.google.android.exoplayer2.AbstractC1834c0
        /* JADX INFO: renamed from: s */
        public AbstractC1834c0.d mo9403s(int i, AbstractC1834c0.d dVar, long j) {
            this.f105222f.mo9403s(0, dVar, 0L);
            long j2 = dVar.f7344q;
            long j3 = this.f8265g;
            dVar.f7344q = j2 + j3;
            dVar.f7341n = this.f8267i;
            dVar.f7336i = this.f8268j;
            long j4 = dVar.f7340m;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                dVar.f7340m = jMax;
                long j5 = this.f8266h;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                dVar.f7340m = jMax - this.f8265g;
            }
            long jM197874l1 = vck0.m197874l1(this.f8265g);
            long j6 = dVar.f7332e;
            if (j6 != -9223372036854775807L) {
                dVar.f7332e = j6 + jM197874l1;
            }
            long j7 = dVar.f7333f;
            if (j7 != -9223372036854775807L) {
                dVar.f7333f = j7 + jM197874l1;
            }
            return dVar;
        }
    }

    public ClippingMediaSource(InterfaceC1965i interfaceC1965i, long j, long j2, boolean z, boolean z2, boolean z3) {
        super((InterfaceC1965i) p11.m167011e(interfaceC1965i));
        p11.m167007a(j >= 0);
        this.f8254f = j;
        this.f8255g = j2;
        this.f8256h = z;
        this.f8257i = z2;
        this.f8258j = z3;
        this.f8259k = new ArrayList<>();
        this.f8260l = new AbstractC1834c0.d();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public InterfaceC1953h createPeriod(InterfaceC1965i.b bVar, sj0 sj0Var, long j) {
        C1935b c1935b = new C1935b(this.f9090d.createPeriod(bVar, sj0Var, j), this.f8256h, this.f8263o, this.f8264p);
        this.f8259k.add(c1935b);
        return c1935b;
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.InterfaceC1965i
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.f8262n;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2002u
    /* JADX INFO: renamed from: p */
    public void mo10913p(AbstractC1834c0 abstractC1834c0) {
        if (this.f8262n != null) {
            return;
        }
        m10914u(abstractC1834c0);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1965i
    public void releasePeriod(InterfaceC1953h interfaceC1953h) {
        p11.m167013g(this.f8259k.remove(interfaceC1953h));
        this.f9090d.releasePeriod(((C1935b) interfaceC1953h).f8283a);
        if (!this.f8259k.isEmpty() || this.f8257i) {
            return;
        }
        m10914u(((C1932a) p11.m167011e(this.f8261m)).f105222f);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC1936c, com.google.android.exoplayer2.source.AbstractC1934a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f8262n = null;
        this.f8261m = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m10914u(AbstractC1834c0 abstractC1834c0) {
        long j;
        abstractC1834c0.m9720r(0, this.f8260l);
        long jM9753g = this.f8260l.m9753g();
        long j2 = Long.MIN_VALUE;
        if (this.f8261m == null || this.f8259k.isEmpty() || this.f8257i) {
            j = this.f8254f;
            long j3 = this.f8255g;
            if (this.f8258j) {
                long jM9751e = this.f8260l.m9751e();
                j += jM9751e;
                j3 += jM9751e;
            }
            this.f8263o = jM9753g + j;
            this.f8264p = this.f8255g != Long.MIN_VALUE ? jM9753g + j3 : Long.MIN_VALUE;
            int size = this.f8259k.size();
            for (int i = 0; i < size; i++) {
                this.f8259k.get(i).m10938v(this.f8263o, this.f8264p);
            }
            j2 = j3;
        } else {
            j = this.f8263o - jM9753g;
            if (this.f8255g != Long.MIN_VALUE) {
                j2 = this.f8264p - jM9753g;
            }
        }
        try {
            C1932a c1932a = new C1932a(abstractC1834c0, j, j2);
            this.f8261m = c1932a;
            refreshSourceInfo(c1932a);
        } catch (IllegalClippingException e) {
            this.f8262n = e;
            for (int i2 = 0; i2 < this.f8259k.size(); i2++) {
                this.f8259k.get(i2).m10934q(this.f8262n);
            }
        }
    }
}
