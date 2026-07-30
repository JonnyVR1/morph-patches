package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class vwd0 {

    /* JADX INFO: renamed from: a */
    private byte f186123a;

    /* JADX INFO: renamed from: b */
    private byte f186124b;

    /* JADX INFO: renamed from: c */
    private byte f186125c;

    /* JADX INFO: renamed from: d */
    private byte f186126d;

    /* JADX INFO: renamed from: e */
    private byte f186127e;

    /* JADX INFO: renamed from: f */
    private byte f186128f;

    /* JADX INFO: renamed from: g */
    private boolean f186129g;

    /* JADX INFO: renamed from: h */
    private int f186130h;

    public vwd0(ByteBuffer byteBuffer) {
        long jM213895k = y0q.m213895k(byteBuffer);
        this.f186123a = (byte) (((-268435456) & jM213895k) >> 28);
        this.f186124b = (byte) ((201326592 & jM213895k) >> 26);
        this.f186125c = (byte) ((50331648 & jM213895k) >> 24);
        this.f186126d = (byte) ((12582912 & jM213895k) >> 22);
        this.f186127e = (byte) ((3145728 & jM213895k) >> 20);
        this.f186128f = (byte) ((917504 & jM213895k) >> 17);
        this.f186129g = ((65536 & jM213895k) >> 16) > 0;
        this.f186130h = (int) (jM213895k & 65535);
    }

    /* JADX INFO: renamed from: a */
    public void m203148a(ByteBuffer byteBuffer) {
        b1q.m101495g(byteBuffer, ((long) (this.f186123a << 28)) | ((long) (this.f186124b << 26)) | ((long) (this.f186125c << 24)) | ((long) (this.f186126d << 22)) | ((long) (this.f186127e << 20)) | ((long) (this.f186128f << 17)) | ((long) ((this.f186129g ? 1 : 0) << 16)) | ((long) this.f186130h));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vwd0 vwd0Var = (vwd0) obj;
        return this.f186124b == vwd0Var.f186124b && this.f186123a == vwd0Var.f186123a && this.f186130h == vwd0Var.f186130h && this.f186125c == vwd0Var.f186125c && this.f186127e == vwd0Var.f186127e && this.f186126d == vwd0Var.f186126d && this.f186129g == vwd0Var.f186129g && this.f186128f == vwd0Var.f186128f;
    }

    public int hashCode() {
        return (((((((((((((this.f186123a * 31) + this.f186124b) * 31) + this.f186125c) * 31) + this.f186126d) * 31) + this.f186127e) * 31) + this.f186128f) * 31) + (this.f186129g ? 1 : 0)) * 31) + this.f186130h;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f186123a) + ", isLeading=" + ((int) this.f186124b) + ", depOn=" + ((int) this.f186125c) + ", isDepOn=" + ((int) this.f186126d) + ", hasRedundancy=" + ((int) this.f186127e) + ", padValue=" + ((int) this.f186128f) + ", isDiffSample=" + this.f186129g + ", degradPrio=" + this.f186130h + '}';
    }

    public vwd0() {
    }
}
