package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.common.primitives.Longs;
import p153l.bmk0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.f */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1889f implements InterfaceC1896m {

    /* JADX INFO: renamed from: a */
    public final float f7531a;

    /* JADX INFO: renamed from: b */
    public final float f7532b;

    /* JADX INFO: renamed from: c */
    public final long f7533c;

    /* JADX INFO: renamed from: d */
    public final float f7534d;

    /* JADX INFO: renamed from: e */
    public final long f7535e;

    /* JADX INFO: renamed from: f */
    public final long f7536f;

    /* JADX INFO: renamed from: g */
    public final float f7537g;

    /* JADX INFO: renamed from: h */
    public long f7538h;

    /* JADX INFO: renamed from: i */
    public long f7539i;

    /* JADX INFO: renamed from: j */
    public long f7540j;

    /* JADX INFO: renamed from: k */
    public long f7541k;

    /* JADX INFO: renamed from: l */
    public long f7542l;

    /* JADX INFO: renamed from: m */
    public long f7543m;

    /* JADX INFO: renamed from: n */
    public float f7544n;

    /* JADX INFO: renamed from: o */
    public float f7545o;

    /* JADX INFO: renamed from: p */
    public float f7546p;

    /* JADX INFO: renamed from: q */
    public long f7547q;

    /* JADX INFO: renamed from: r */
    public long f7548r;

    /* JADX INFO: renamed from: s */
    public long f7549s;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.f$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public float f7550a = 0.97f;

        /* JADX INFO: renamed from: b */
        public float f7551b = 1.03f;

        /* JADX INFO: renamed from: c */
        public long f7552c = 1000;

        /* JADX INFO: renamed from: d */
        public float f7553d = 1.0E-7f;

        /* JADX INFO: renamed from: e */
        public long f7554e = bmk0.m105084J0(20);

        /* JADX INFO: renamed from: f */
        public long f7555f = bmk0.m105084J0(500);

        /* JADX INFO: renamed from: g */
        public float f7556g = 0.999f;

        /* JADX INFO: renamed from: a */
        public C1889f m10047a() {
            return new C1889f(this.f7550a, this.f7551b, this.f7552c, this.f7553d, this.f7554e, this.f7555f, this.f7556g);
        }
    }

    public C1889f(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f7531a = f;
        this.f7532b = f2;
        this.f7533c = j;
        this.f7534d = f3;
        this.f7535e = j2;
        this.f7536f = j3;
        this.f7537g = f4;
        this.f7538h = -9223372036854775807L;
        this.f7539i = -9223372036854775807L;
        this.f7541k = -9223372036854775807L;
        this.f7542l = -9223372036854775807L;
        this.f7545o = f;
        this.f7544n = f2;
        this.f7546p = 1.0f;
        this.f7547q = -9223372036854775807L;
        this.f7540j = -9223372036854775807L;
        this.f7543m = -9223372036854775807L;
        this.f7548r = -9223372036854775807L;
        this.f7549s = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: h */
    public static long m10038h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    @Override // com.google.android.exoplayer2.InterfaceC1896m
    /* JADX INFO: renamed from: a */
    public void mo10039a(C1944n.g gVar) {
        this.f7538h = bmk0.m105084J0(gVar.f8076a);
        this.f7541k = bmk0.m105084J0(gVar.f8077b);
        this.f7542l = bmk0.m105084J0(gVar.f8078c);
        float f = gVar.f8079d;
        if (f == -3.4028235E38f) {
            f = this.f7531a;
        }
        this.f7545o = f;
        float f2 = gVar.f8080e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f7532b;
        }
        this.f7544n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f7538h = -9223372036854775807L;
        }
        m10045g();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1896m
    /* JADX INFO: renamed from: b */
    public float mo10040b(long j, long j2) {
        if (this.f7538h == -9223372036854775807L) {
            return 1.0f;
        }
        m10046i(j, j2);
        if (this.f7547q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f7547q < this.f7533c) {
            return this.f7546p;
        }
        this.f7547q = SystemClock.elapsedRealtime();
        m10044f(j);
        long j3 = j - this.f7543m;
        if (Math.abs(j3) < this.f7535e) {
            this.f7546p = 1.0f;
        } else {
            this.f7546p = bmk0.m105160p((this.f7534d * j3) + 1.0f, this.f7545o, this.f7544n);
        }
        return this.f7546p;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1896m
    /* JADX INFO: renamed from: c */
    public long mo10041c() {
        return this.f7543m;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1896m
    /* JADX INFO: renamed from: d */
    public void mo10042d() {
        long j = this.f7543m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f7536f;
        this.f7543m = j2;
        long j3 = this.f7542l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f7543m = j3;
        }
        this.f7547q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1896m
    /* JADX INFO: renamed from: e */
    public void mo10043e(long j) {
        this.f7539i = j;
        m10045g();
    }

    /* JADX INFO: renamed from: f */
    public final void m10044f(long j) {
        long j2 = this.f7548r + (this.f7549s * 3);
        if (this.f7543m > j2) {
            float fM105084J0 = bmk0.m105084J0(this.f7533c);
            this.f7543m = Longs.m16532h(j2, this.f7540j, this.f7543m - (((long) ((this.f7546p - 1.0f) * fM105084J0)) + ((long) ((this.f7544n - 1.0f) * fM105084J0))));
            return;
        }
        long jM105164r = bmk0.m105164r(j - ((long) (Math.max(0.0f, this.f7546p - 1.0f) / this.f7534d)), this.f7543m, j2);
        this.f7543m = jM105164r;
        long j3 = this.f7542l;
        if (j3 == -9223372036854775807L || jM105164r <= j3) {
            return;
        }
        this.f7543m = j3;
    }

    /* JADX INFO: renamed from: g */
    public final void m10045g() {
        long j = this.f7538h;
        if (j != -9223372036854775807L) {
            long j2 = this.f7539i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f7541k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f7542l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f7540j == j) {
            return;
        }
        this.f7540j = j;
        this.f7543m = j;
        this.f7548r = -9223372036854775807L;
        this.f7549s = -9223372036854775807L;
        this.f7547q = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: i */
    public final void m10046i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f7548r;
        if (j4 == -9223372036854775807L) {
            this.f7548r = j3;
            this.f7549s = 0L;
        } else {
            long jMax = Math.max(j3, m10038h(j4, j3, this.f7537g));
            this.f7548r = jMax;
            this.f7549s = m10038h(this.f7549s, Math.abs(j3 - jMax), this.f7537g);
        }
    }
}
