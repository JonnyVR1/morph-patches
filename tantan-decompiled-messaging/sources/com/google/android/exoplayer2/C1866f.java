package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.common.primitives.Longs;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1866f implements InterfaceC1873m {

    /* JADX INFO: renamed from: a */
    public final float f7494a;

    /* JADX INFO: renamed from: b */
    public final float f7495b;

    /* JADX INFO: renamed from: c */
    public final long f7496c;

    /* JADX INFO: renamed from: d */
    public final float f7497d;

    /* JADX INFO: renamed from: e */
    public final long f7498e;

    /* JADX INFO: renamed from: f */
    public final long f7499f;

    /* JADX INFO: renamed from: g */
    public final float f7500g;

    /* JADX INFO: renamed from: h */
    public long f7501h;

    /* JADX INFO: renamed from: i */
    public long f7502i;

    /* JADX INFO: renamed from: j */
    public long f7503j;

    /* JADX INFO: renamed from: k */
    public long f7504k;

    /* JADX INFO: renamed from: l */
    public long f7505l;

    /* JADX INFO: renamed from: m */
    public long f7506m;

    /* JADX INFO: renamed from: n */
    public float f7507n;

    /* JADX INFO: renamed from: o */
    public float f7508o;

    /* JADX INFO: renamed from: p */
    public float f7509p;

    /* JADX INFO: renamed from: q */
    public long f7510q;

    /* JADX INFO: renamed from: r */
    public long f7511r;

    /* JADX INFO: renamed from: s */
    public long f7512s;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public float f7513a = 0.97f;

        /* JADX INFO: renamed from: b */
        public float f7514b = 1.03f;

        /* JADX INFO: renamed from: c */
        public long f7515c = 1000;

        /* JADX INFO: renamed from: d */
        public float f7516d = 1.0E-7f;

        /* JADX INFO: renamed from: e */
        public long f7517e = vck0.m197806J0(20);

        /* JADX INFO: renamed from: f */
        public long f7518f = vck0.m197806J0(500);

        /* JADX INFO: renamed from: g */
        public float f7519g = 0.999f;

        /* JADX INFO: renamed from: a */
        public C1866f m9993a() {
            return new C1866f(this.f7513a, this.f7514b, this.f7515c, this.f7516d, this.f7517e, this.f7518f, this.f7519g);
        }
    }

    public C1866f(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f7494a = f;
        this.f7495b = f2;
        this.f7496c = j;
        this.f7497d = f3;
        this.f7498e = j2;
        this.f7499f = j3;
        this.f7500g = f4;
        this.f7501h = -9223372036854775807L;
        this.f7502i = -9223372036854775807L;
        this.f7504k = -9223372036854775807L;
        this.f7505l = -9223372036854775807L;
        this.f7508o = f;
        this.f7507n = f2;
        this.f7509p = 1.0f;
        this.f7510q = -9223372036854775807L;
        this.f7503j = -9223372036854775807L;
        this.f7506m = -9223372036854775807L;
        this.f7511r = -9223372036854775807L;
        this.f7512s = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public static long m9984h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1873m
    /* JADX INFO: renamed from: a */
    public void mo9985a(C1921n.g gVar) {
        this.f7501h = vck0.m197806J0(gVar.f8039a);
        this.f7504k = vck0.m197806J0(gVar.f8040b);
        this.f7505l = vck0.m197806J0(gVar.f8041c);
        float f = gVar.f8042d;
        if (f == -3.4028235E38f) {
            f = this.f7494a;
        }
        this.f7508o = f;
        float f2 = gVar.f8043e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f7495b;
        }
        this.f7507n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f7501h = -9223372036854775807L;
        }
        m9991g();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1873m
    /* JADX INFO: renamed from: b */
    public float mo9986b(long j, long j2) {
        if (this.f7501h == -9223372036854775807L) {
            return 1.0f;
        }
        m9992i(j, j2);
        if (this.f7510q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7510q < this.f7496c) {
            return this.f7509p;
        }
        this.f7510q = SystemClock.elapsedRealtime();
        m9990f(j);
        long j3 = j - this.f7506m;
        if (Math.abs(j3) < this.f7498e) {
            this.f7509p = 1.0f;
        } else {
            this.f7509p = vck0.m197882p((this.f7497d * j3) + 1.0f, this.f7508o, this.f7507n);
        }
        return this.f7509p;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1873m
    /* JADX INFO: renamed from: c */
    public long mo9987c() {
        return this.f7506m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1873m
    /* JADX INFO: renamed from: d */
    public void mo9988d() {
        long j = this.f7506m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f7499f;
        this.f7506m = j2;
        long j3 = this.f7505l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f7506m = j3;
        }
        this.f7510q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1873m
    /* JADX INFO: renamed from: e */
    public void mo9989e(long j) {
        this.f7502i = j;
        m9991g();
    }

    /* JADX INFO: renamed from: f */
    public final void m9990f(long j) {
        long j2 = this.f7511r + (this.f7512s * 3);
        if (this.f7506m > j2) {
            float fM197806J0 = vck0.m197806J0(this.f7496c);
            this.f7506m = Longs.m16477h(j2, this.f7503j, this.f7506m - (((long) ((this.f7509p - 1.0f) * fM197806J0)) + ((long) ((this.f7507n - 1.0f) * fM197806J0))));
            return;
        }
        long jM197886r = vck0.m197886r(j - ((long) (Math.max(0.0f, this.f7509p - 1.0f) / this.f7497d)), this.f7506m, j2);
        this.f7506m = jM197886r;
        long j3 = this.f7505l;
        if (j3 == -9223372036854775807L || jM197886r <= j3) {
            return;
        }
        this.f7506m = j3;
    }

    /* JADX INFO: renamed from: g */
    public final void m9991g() {
        long j = this.f7501h;
        if (j != -9223372036854775807L) {
            long j2 = this.f7502i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f7504k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f7505l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f7503j == j) {
            return;
        }
        this.f7503j = j;
        this.f7506m = j;
        this.f7511r = -9223372036854775807L;
        this.f7512s = -9223372036854775807L;
        this.f7510q = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: i */
    public final void m9992i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f7511r;
        if (j4 == -9223372036854775807L) {
            this.f7511r = j3;
            this.f7512s = 0L;
        } else {
            long jMax = Math.max(j3, m9984h(j4, j3, this.f7500g));
            this.f7511r = jMax;
            this.f7512s = m9984h(this.f7512s, Math.abs(j3 - jMax), this.f7500g);
        }
    }
}
