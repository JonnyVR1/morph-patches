package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class hg00 {

    /* JADX INFO: renamed from: a */
    public final gg00 f109362a;

    /* JADX INFO: renamed from: b */
    public final int[] f109363b;

    public hg00(gg00 gg00Var, int[] iArr) {
        if (iArr.length == 0) {
            fig0.m125680a();
            throw null;
        }
        this.f109362a = gg00Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f109363b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f109363b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f109363b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public hg00 m134888a(hg00 hg00Var) {
        if (!this.f109362a.equals(hg00Var.f109362a)) {
            wg3.m206174a("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (m134892e()) {
            return hg00Var;
        }
        if (hg00Var.m134892e()) {
            return this;
        }
        int[] iArr = this.f109363b;
        int[] iArr2 = hg00Var.f109363b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        int i = length;
        while (true) {
            int length2 = iArr.length;
            gg00 gg00Var = this.f109362a;
            if (i >= length2) {
                return new hg00(gg00Var, iArr3);
            }
            iArr3[i] = gg00Var.m130128a(iArr2[i - length], iArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m134889b(int i) {
        if (i == 0) {
            return m134890c(0);
        }
        int[] iArr = this.f109363b;
        if (i == 1) {
            int iM130128a = 0;
            for (int i2 : iArr) {
                iM130128a = this.f109362a.m130128a(iM130128a, i2);
            }
            return iM130128a;
        }
        int iM130128a2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            gg00 gg00Var = this.f109362a;
            iM130128a2 = gg00Var.m130128a(gg00Var.m130136i(i, iM130128a2), this.f109363b[i3]);
        }
        return iM130128a2;
    }

    /* JADX INFO: renamed from: c */
    public int m134890c(int i) {
        int[] iArr = this.f109363b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: renamed from: d */
    public int m134891d() {
        return this.f109363b.length - 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m134892e() {
        return this.f109363b[0] == 0;
    }

    /* JADX INFO: renamed from: f */
    public hg00 m134893f(int i) {
        if (i == 0) {
            return this.f109362a.m130133f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f109363b.length;
        int[] iArr = new int[length];
        int i2 = 0;
        while (true) {
            gg00 gg00Var = this.f109362a;
            if (i2 >= length) {
                return new hg00(gg00Var, iArr);
            }
            iArr[i2] = gg00Var.m130136i(this.f109363b[i2], i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public hg00 m134894g(hg00 hg00Var) {
        if (!this.f109362a.equals(hg00Var.f109362a)) {
            wg3.m206174a("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (m134892e() || hg00Var.m134892e()) {
            return this.f109362a.m130133f();
        }
        int[] iArr = this.f109363b;
        int length = iArr.length;
        int[] iArr2 = hg00Var.f109363b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                gg00 gg00Var = this.f109362a;
                iArr3[i4] = gg00Var.m130128a(iArr3[i4], gg00Var.m130136i(i2, iArr2[i3]));
            }
        }
        return new hg00(this.f109362a, iArr3);
    }

    /* JADX INFO: renamed from: h */
    public hg00 m134895h(int i, int i2) {
        if (i < 0) {
            fig0.m125680a();
            return null;
        }
        if (i2 == 0) {
            return this.f109362a.m130133f();
        }
        int length = this.f109363b.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            gg00 gg00Var = this.f109362a;
            if (i3 >= length) {
                return new hg00(gg00Var, iArr);
            }
            iArr[i3] = gg00Var.m130136i(this.f109363b[i3], i2);
            i3++;
        }
    }

    /* JADX INFO: renamed from: i */
    public hg00 m134896i() {
        int length = this.f109363b.length;
        int[] iArr = new int[length];
        int i = 0;
        while (true) {
            gg00 gg00Var = this.f109362a;
            if (i >= length) {
                return new hg00(gg00Var, iArr);
            }
            iArr[i] = gg00Var.m130137j(0, this.f109363b[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public hg00 m134897j(hg00 hg00Var) {
        if (this.f109362a.equals(hg00Var.f109362a)) {
            return hg00Var.m134892e() ? this : m134888a(hg00Var.m134896i());
        }
        wg3.m206174a("ModulusPolys do not have same ModulusGF field");
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m134891d() * 8);
        for (int iM134891d = m134891d(); iM134891d >= 0; iM134891d--) {
            int iM134890c = m134890c(iM134891d);
            if (iM134890c != 0) {
                if (iM134890c < 0) {
                    sb.append(" - ");
                    iM134890c = -iM134890c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM134891d == 0 || iM134890c != 1) {
                    sb.append(iM134890c);
                }
                if (iM134891d != 0) {
                    if (iM134891d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM134891d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
