package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class dqi0 extends kgk {

    /* JADX INFO: renamed from: a */
    int f90244a;

    /* JADX INFO: renamed from: b */
    int f90245b;

    /* JADX INFO: renamed from: c */
    boolean f90246c;

    /* JADX INFO: renamed from: d */
    int f90247d;

    /* JADX INFO: renamed from: e */
    long f90248e;

    /* JADX INFO: renamed from: f */
    long f90249f;

    /* JADX INFO: renamed from: g */
    int f90250g;

    /* JADX INFO: renamed from: h */
    int f90251h;

    /* JADX INFO: renamed from: i */
    int f90252i;

    /* JADX INFO: renamed from: j */
    int f90253j;

    /* JADX INFO: renamed from: k */
    int f90254k;

    @Override // p153l.kgk
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo117528a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        b1q.m101498j(byteBufferAllocate, this.f90244a);
        b1q.m101498j(byteBufferAllocate, (this.f90245b << 6) + (this.f90246c ? 32 : 0) + this.f90247d);
        b1q.m101495g(byteBufferAllocate, this.f90248e);
        b1q.m101496h(byteBufferAllocate, this.f90249f);
        b1q.m101498j(byteBufferAllocate, this.f90250g);
        b1q.m101493e(byteBufferAllocate, this.f90251h);
        b1q.m101493e(byteBufferAllocate, this.f90252i);
        b1q.m101498j(byteBufferAllocate, this.f90253j);
        b1q.m101493e(byteBufferAllocate, this.f90254k);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: b */
    public String mo117529b() {
        return "tscl";
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: c */
    public void mo117530c(ByteBuffer byteBuffer) {
        this.f90244a = y0q.m213898n(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        this.f90245b = (iM213898n & 192) >> 6;
        this.f90246c = (iM213898n & 32) > 0;
        this.f90247d = iM213898n & 31;
        this.f90248e = y0q.m213895k(byteBuffer);
        this.f90249f = y0q.m213896l(byteBuffer);
        this.f90250g = y0q.m213898n(byteBuffer);
        this.f90251h = y0q.m213893i(byteBuffer);
        this.f90252i = y0q.m213893i(byteBuffer);
        this.f90253j = y0q.m213898n(byteBuffer);
        this.f90254k = y0q.m213893i(byteBuffer);
    }

    @Override // p153l.kgk
    /* JADX INFO: renamed from: d */
    public int mo117531d() {
        return 20;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dqi0 dqi0Var = (dqi0) obj;
        return this.f90244a == dqi0Var.f90244a && this.f90252i == dqi0Var.f90252i && this.f90254k == dqi0Var.f90254k && this.f90253j == dqi0Var.f90253j && this.f90251h == dqi0Var.f90251h && this.f90249f == dqi0Var.f90249f && this.f90250g == dqi0Var.f90250g && this.f90248e == dqi0Var.f90248e && this.f90247d == dqi0Var.f90247d && this.f90245b == dqi0Var.f90245b && this.f90246c == dqi0Var.f90246c;
    }

    public int hashCode() {
        int i = ((((((this.f90244a * 31) + this.f90245b) * 31) + (this.f90246c ? 1 : 0)) * 31) + this.f90247d) * 31;
        long j = this.f90248e;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f90249f;
        return ((((((((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f90250g) * 31) + this.f90251h) * 31) + this.f90252i) * 31) + this.f90253j) * 31) + this.f90254k;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f90244a + ", tlprofile_space=" + this.f90245b + ", tltier_flag=" + this.f90246c + ", tlprofile_idc=" + this.f90247d + ", tlprofile_compatibility_flags=" + this.f90248e + ", tlconstraint_indicator_flags=" + this.f90249f + ", tllevel_idc=" + this.f90250g + ", tlMaxBitRate=" + this.f90251h + ", tlAvgBitRate=" + this.f90252i + ", tlConstantFrameRate=" + this.f90253j + ", tlAvgFrameRate=" + this.f90254k + '}';
    }
}
