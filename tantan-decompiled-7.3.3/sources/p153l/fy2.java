package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class fy2 extends x1j0 {

    /* JADX INFO: renamed from: c */
    public final short f101335c;

    /* JADX INFO: renamed from: d */
    public final short f101336d;

    public fy2(x1j0 x1j0Var, int i, int i2) {
        super(x1j0Var);
        this.f101335c = (short) i;
        this.f101336d = (short) i2;
    }

    @Override // p153l.x1j0
    /* JADX INFO: renamed from: c */
    public void mo99476c(b13 b13Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f101336d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                b13Var.m101395c(31, 5);
                short s2 = this.f101336d;
                if (s2 > 62) {
                    b13Var.m101395c(s2 - 31, 16);
                } else if (i == 0) {
                    b13Var.m101395c(Math.min((int) s2, 31), 5);
                } else {
                    b13Var.m101395c(s2 - 31, 5);
                }
            }
            b13Var.m101395c(bArr[this.f101335c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f101335c);
        sb.append("::");
        sb.append((this.f101335c + this.f101336d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
