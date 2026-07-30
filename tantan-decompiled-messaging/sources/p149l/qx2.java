package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class qx2 extends usi0 {

    /* JADX INFO: renamed from: c */
    public final short f156802c;

    /* JADX INFO: renamed from: d */
    public final short f156803d;

    public qx2(usi0 usi0Var, int i, int i2) {
        super(usi0Var);
        this.f156802c = (short) i;
        this.f156803d = (short) i2;
    }

    @Override // p149l.usi0
    /* JADX INFO: renamed from: c */
    public void mo176936c(m03 m03Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f156803d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                m03Var.m152487c(31, 5);
                short s2 = this.f156803d;
                if (s2 > 62) {
                    m03Var.m152487c(s2 - 31, 16);
                } else if (i == 0) {
                    m03Var.m152487c(Math.min((int) s2, 31), 5);
                } else {
                    m03Var.m152487c(s2 - 31, 5);
                }
            }
            m03Var.m152487c(bArr[this.f156802c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f156802c);
        sb.append("::");
        sb.append((this.f156802c + this.f156803d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
