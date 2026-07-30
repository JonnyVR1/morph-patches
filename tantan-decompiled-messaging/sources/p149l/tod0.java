package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class tod0 {

    /* JADX INFO: renamed from: a */
    private byte f171348a;

    /* JADX INFO: renamed from: b */
    private byte f171349b;

    /* JADX INFO: renamed from: c */
    private byte f171350c;

    /* JADX INFO: renamed from: d */
    private byte f171351d;

    /* JADX INFO: renamed from: e */
    private byte f171352e;

    /* JADX INFO: renamed from: f */
    private byte f171353f;

    /* JADX INFO: renamed from: g */
    private boolean f171354g;

    /* JADX INFO: renamed from: h */
    private int f171355h;

    public tod0(ByteBuffer byteBuffer) {
        long jM216558k = yyp.m216558k(byteBuffer);
        this.f171348a = (byte) (((-268435456) & jM216558k) >> 28);
        this.f171349b = (byte) ((201326592 & jM216558k) >> 26);
        this.f171350c = (byte) ((50331648 & jM216558k) >> 24);
        this.f171351d = (byte) ((12582912 & jM216558k) >> 22);
        this.f171352e = (byte) ((3145728 & jM216558k) >> 20);
        this.f171353f = (byte) ((917504 & jM216558k) >> 17);
        this.f171354g = ((65536 & jM216558k) >> 16) > 0;
        this.f171355h = (int) (jM216558k & 65535);
    }

    /* JADX INFO: renamed from: a */
    public void m189875a(ByteBuffer byteBuffer) {
        bzp.m104635g(byteBuffer, ((long) (this.f171348a << 28)) | ((long) (this.f171349b << 26)) | ((long) (this.f171350c << 24)) | ((long) (this.f171351d << 22)) | ((long) (this.f171352e << 20)) | ((long) (this.f171353f << 17)) | ((long) ((this.f171354g ? 1 : 0) << 16)) | ((long) this.f171355h));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tod0 tod0Var = (tod0) obj;
        return this.f171349b == tod0Var.f171349b && this.f171348a == tod0Var.f171348a && this.f171355h == tod0Var.f171355h && this.f171350c == tod0Var.f171350c && this.f171352e == tod0Var.f171352e && this.f171351d == tod0Var.f171351d && this.f171354g == tod0Var.f171354g && this.f171353f == tod0Var.f171353f;
    }

    public int hashCode() {
        return (((((((((((((this.f171348a * 31) + this.f171349b) * 31) + this.f171350c) * 31) + this.f171351d) * 31) + this.f171352e) * 31) + this.f171353f) * 31) + (this.f171354g ? 1 : 0)) * 31) + this.f171355h;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f171348a) + ", isLeading=" + ((int) this.f171349b) + ", depOn=" + ((int) this.f171350c) + ", isDepOn=" + ((int) this.f171351d) + ", hasRedundancy=" + ((int) this.f171352e) + ", padValue=" + ((int) this.f171353f) + ", isDiffSample=" + this.f171354g + ", degradPrio=" + this.f171355h + '}';
    }

    public tod0() {
    }
}
