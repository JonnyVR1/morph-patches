package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class dhi0 extends udk {

    /* JADX INFO: renamed from: a */
    int f86293a;

    /* JADX INFO: renamed from: b */
    int f86294b;

    /* JADX INFO: renamed from: c */
    boolean f86295c;

    /* JADX INFO: renamed from: d */
    int f86296d;

    /* JADX INFO: renamed from: e */
    long f86297e;

    /* JADX INFO: renamed from: f */
    long f86298f;

    /* JADX INFO: renamed from: g */
    int f86299g;

    /* JADX INFO: renamed from: h */
    int f86300h;

    /* JADX INFO: renamed from: i */
    int f86301i;

    /* JADX INFO: renamed from: j */
    int f86302j;

    /* JADX INFO: renamed from: k */
    int f86303k;

    @Override // p149l.udk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo98138a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        bzp.m104638j(byteBufferAllocate, this.f86293a);
        bzp.m104638j(byteBufferAllocate, (this.f86294b << 6) + (this.f86295c ? 32 : 0) + this.f86296d);
        bzp.m104635g(byteBufferAllocate, this.f86297e);
        bzp.m104636h(byteBufferAllocate, this.f86298f);
        bzp.m104638j(byteBufferAllocate, this.f86299g);
        bzp.m104633e(byteBufferAllocate, this.f86300h);
        bzp.m104633e(byteBufferAllocate, this.f86301i);
        bzp.m104638j(byteBufferAllocate, this.f86302j);
        bzp.m104633e(byteBufferAllocate, this.f86303k);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: b */
    public String mo98139b() {
        return "tscl";
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: c */
    public void mo98140c(ByteBuffer byteBuffer) {
        this.f86293a = yyp.m216561n(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        this.f86294b = (iM216561n & 192) >> 6;
        this.f86295c = (iM216561n & 32) > 0;
        this.f86296d = iM216561n & 31;
        this.f86297e = yyp.m216558k(byteBuffer);
        this.f86298f = yyp.m216559l(byteBuffer);
        this.f86299g = yyp.m216561n(byteBuffer);
        this.f86300h = yyp.m216556i(byteBuffer);
        this.f86301i = yyp.m216556i(byteBuffer);
        this.f86302j = yyp.m216561n(byteBuffer);
        this.f86303k = yyp.m216556i(byteBuffer);
    }

    @Override // p149l.udk
    /* JADX INFO: renamed from: d */
    public int mo111825d() {
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
        return this.f86293a == dhi0Var.f86293a && this.f86301i == dhi0Var.f86301i && this.f86303k == dhi0Var.f86303k && this.f86302j == dhi0Var.f86302j && this.f86300h == dhi0Var.f86300h && this.f86298f == dhi0Var.f86298f && this.f86299g == dhi0Var.f86299g && this.f86297e == dhi0Var.f86297e && this.f86296d == dhi0Var.f86296d && this.f86294b == dhi0Var.f86294b && this.f86295c == dhi0Var.f86295c;
    }

    public int hashCode() {
        int i = ((((((this.f86293a * 31) + this.f86294b) * 31) + (this.f86295c ? 1 : 0)) * 31) + this.f86296d) * 31;
        long j = this.f86297e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f86298f;
        return ((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f86299g) * 31) + this.f86300h) * 31) + this.f86301i) * 31) + this.f86302j) * 31) + this.f86303k;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f86293a + ", tlprofile_space=" + this.f86294b + ", tltier_flag=" + this.f86295c + ", tlprofile_idc=" + this.f86296d + ", tlprofile_compatibility_flags=" + this.f86297e + ", tlconstraint_indicator_flags=" + this.f86298f + ", tllevel_idc=" + this.f86299g + ", tlMaxBitRate=" + this.f86300h + ", tlAvgBitRate=" + this.f86301i + ", tlConstantFrameRate=" + this.f86302j + ", tlAvgFrameRate=" + this.f86303k + '}';
    }
}
