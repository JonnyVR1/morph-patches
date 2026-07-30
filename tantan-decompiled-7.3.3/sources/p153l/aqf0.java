package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class aqf0 extends x1j0 {

    /* JADX INFO: renamed from: c */
    public final short f72812c;

    /* JADX INFO: renamed from: d */
    public final short f72813d;

    public aqf0(x1j0 x1j0Var, int i, int i2) {
        super(x1j0Var);
        this.f72812c = (short) i;
        this.f72813d = (short) i2;
    }

    @Override // p153l.x1j0
    /* JADX INFO: renamed from: c */
    public void mo99476c(b13 b13Var, byte[] bArr) {
        b13Var.m101395c(this.f72812c, this.f72813d);
    }

    public String toString() {
        short s = this.f72812c;
        short s2 = this.f72813d;
        return "<" + Integer.toBinaryString((1 << this.f72813d) | (s & ((1 << s2) - 1)) | (1 << s2)).substring(1) + '>';
    }
}
