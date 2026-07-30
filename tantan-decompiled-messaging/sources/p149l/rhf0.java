package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class rhf0 extends usi0 {

    /* JADX INFO: renamed from: c */
    public final short f159360c;

    /* JADX INFO: renamed from: d */
    public final short f159361d;

    public rhf0(usi0 usi0Var, int i, int i2) {
        super(usi0Var);
        this.f159360c = (short) i;
        this.f159361d = (short) i2;
    }

    @Override // p149l.usi0
    /* JADX INFO: renamed from: c */
    public void mo176936c(m03 m03Var, byte[] bArr) {
        m03Var.m152487c(this.f159360c, this.f159361d);
    }

    public String toString() {
        short s = this.f159360c;
        short s2 = this.f159361d;
        return "<" + Integer.toBinaryString((1 << this.f159361d) | (s & ((1 << s2) - 1)) | (1 << s2)).substring(1) + '>';
    }
}
