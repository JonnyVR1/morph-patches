package p007l;

import java.nio.ByteBuffer;
import l.bzp;
import l.udk;
import l.yyp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class dhi0 extends udk {

    /* JADX INFO: renamed from: a */
    int f2571a;

    /* JADX INFO: renamed from: b */
    int f2572b;

    /* JADX INFO: renamed from: c */
    boolean f2573c;

    /* JADX INFO: renamed from: d */
    int f2574d;

    /* JADX INFO: renamed from: e */
    long f2575e;

    /* JADX INFO: renamed from: f */
    long f2576f;

    /* JADX INFO: renamed from: g */
    int f2577g;

    /* JADX INFO: renamed from: h */
    int f2578h;

    /* JADX INFO: renamed from: i */
    int f2579i;

    /* JADX INFO: renamed from: j */
    int f2580j;

    /* JADX INFO: renamed from: k */
    int f2581k;

    /* JADX INFO: renamed from: a */
    public ByteBuffer m8990a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        bzp.j(byteBufferAllocate, this.f2571a);
        bzp.j(byteBufferAllocate, (this.f2572b << 6) + (this.f2573c ? 32 : 0) + this.f2574d);
        bzp.g(byteBufferAllocate, this.f2575e);
        bzp.h(byteBufferAllocate, this.f2576f);
        bzp.j(byteBufferAllocate, this.f2577g);
        bzp.e(byteBufferAllocate, this.f2578h);
        bzp.e(byteBufferAllocate, this.f2579i);
        bzp.j(byteBufferAllocate, this.f2580j);
        bzp.e(byteBufferAllocate, this.f2581k);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    /* JADX INFO: renamed from: b */
    public String m8991b() {
        return "tscl";
    }

    /* JADX INFO: renamed from: c */
    public void m8992c(ByteBuffer byteBuffer) {
        this.f2571a = yyp.n(byteBuffer);
        int iN = yyp.n(byteBuffer);
        this.f2572b = (iN & 192) >> 6;
        this.f2573c = (iN & 32) > 0;
        this.f2574d = iN & 31;
        this.f2575e = yyp.k(byteBuffer);
        this.f2576f = yyp.l(byteBuffer);
        this.f2577g = yyp.n(byteBuffer);
        this.f2578h = yyp.i(byteBuffer);
        this.f2579i = yyp.i(byteBuffer);
        this.f2580j = yyp.n(byteBuffer);
        this.f2581k = yyp.i(byteBuffer);
    }

    /* JADX INFO: renamed from: d */
    public int m8993d() {
        return 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dhi0 dhi0Var = (dhi0) obj;
        return this.f2571a == dhi0Var.f2571a && this.f2579i == dhi0Var.f2579i && this.f2581k == dhi0Var.f2581k && this.f2580j == dhi0Var.f2580j && this.f2578h == dhi0Var.f2578h && this.f2576f == dhi0Var.f2576f && this.f2577g == dhi0Var.f2577g && this.f2575e == dhi0Var.f2575e && this.f2574d == dhi0Var.f2574d && this.f2572b == dhi0Var.f2572b && this.f2573c == dhi0Var.f2573c;
    }

    public int hashCode() {
        int i = ((((((this.f2571a * 31) + this.f2572b) * 31) + (this.f2573c ? 1 : 0)) * 31) + this.f2574d) * 31;
        long j = this.f2575e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f2576f;
        return ((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f2577g) * 31) + this.f2578h) * 31) + this.f2579i) * 31) + this.f2580j) * 31) + this.f2581k;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f2571a + ", tlprofile_space=" + this.f2572b + ", tltier_flag=" + this.f2573c + ", tlprofile_idc=" + this.f2574d + ", tlprofile_compatibility_flags=" + this.f2575e + ", tlconstraint_indicator_flags=" + this.f2576f + ", tllevel_idc=" + this.f2577g + ", tlMaxBitRate=" + this.f2578h + ", tlAvgBitRate=" + this.f2579i + ", tlConstantFrameRate=" + this.f2580j + ", tlAvgFrameRate=" + this.f2581k + '}';
    }
}
