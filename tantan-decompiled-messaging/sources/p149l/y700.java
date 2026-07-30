package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class y700 {

    /* JADX INFO: renamed from: a */
    public final x700 f196657a;

    /* JADX INFO: renamed from: b */
    public final int[] f196658b;

    public y700(x700 x700Var, int[] iArr) {
        if (iArr.length == 0) {
            x9g0.m207497a();
            throw null;
        }
        this.f196657a = x700Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f196658b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f196658b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f196658b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public y700 m213273a(y700 y700Var) {
        if (!this.f196657a.equals(y700Var.f196657a)) {
            ig3.m135964a("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (m213277e()) {
            return y700Var;
        }
        if (y700Var.m213277e()) {
            return this;
        }
        int[] iArr = this.f196658b;
        int[] iArr2 = y700Var.f196658b;
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
            x700 x700Var = this.f196657a;
            if (i >= length2) {
                return new y700(x700Var, iArr3);
            }
            iArr3[i] = x700Var.m207230a(iArr2[i - length], iArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m213274b(int i) {
        if (i == 0) {
            return m213275c(0);
        }
        int[] iArr = this.f196658b;
        if (i == 1) {
            int iM207230a = 0;
            for (int i2 : iArr) {
                iM207230a = this.f196657a.m207230a(iM207230a, i2);
            }
            return iM207230a;
        }
        int iM207230a2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            x700 x700Var = this.f196657a;
            iM207230a2 = x700Var.m207230a(x700Var.m207238i(i, iM207230a2), this.f196658b[i3]);
        }
        return iM207230a2;
    }

    /* JADX INFO: renamed from: c */
    public int m213275c(int i) {
        int[] iArr = this.f196658b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: renamed from: d */
    public int m213276d() {
        return this.f196658b.length - 1;
    }

    /* JADX INFO: renamed from: e */
    public boolean m213277e() {
        return this.f196658b[0] == 0;
    }

    /* JADX INFO: renamed from: f */
    public y700 m213278f(int i) {
        if (i == 0) {
            return this.f196657a.m207235f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f196658b.length;
        int[] iArr = new int[length];
        int i2 = 0;
        while (true) {
            x700 x700Var = this.f196657a;
            if (i2 >= length) {
                return new y700(x700Var, iArr);
            }
            iArr[i2] = x700Var.m207238i(this.f196658b[i2], i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public y700 m213279g(y700 y700Var) {
        if (!this.f196657a.equals(y700Var.f196657a)) {
            ig3.m135964a("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (m213277e() || y700Var.m213277e()) {
            return this.f196657a.m207235f();
        }
        int[] iArr = this.f196658b;
        int length = iArr.length;
        int[] iArr2 = y700Var.f196658b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                x700 x700Var = this.f196657a;
                iArr3[i4] = x700Var.m207230a(iArr3[i4], x700Var.m207238i(i2, iArr2[i3]));
            }
        }
        return new y700(this.f196657a, iArr3);
    }

    /* JADX INFO: renamed from: h */
    public y700 m213280h(int i, int i2) {
        if (i < 0) {
            x9g0.m207497a();
            return null;
        }
        if (i2 == 0) {
            return this.f196657a.m207235f();
        }
        int length = this.f196658b.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            x700 x700Var = this.f196657a;
            if (i3 >= length) {
                return new y700(x700Var, iArr);
            }
            iArr[i3] = x700Var.m207238i(this.f196658b[i3], i2);
            i3++;
        }
    }

    /* JADX INFO: renamed from: i */
    public y700 m213281i() {
        int length = this.f196658b.length;
        int[] iArr = new int[length];
        int i = 0;
        while (true) {
            x700 x700Var = this.f196657a;
            if (i >= length) {
                return new y700(x700Var, iArr);
            }
            iArr[i] = x700Var.m207239j(0, this.f196658b[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public y700 m213282j(y700 y700Var) {
        if (this.f196657a.equals(y700Var.f196657a)) {
            return y700Var.m213277e() ? this : m213273a(y700Var.m213281i());
        }
        ig3.m135964a("ModulusPolys do not have same ModulusGF field");
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m213276d() * 8);
        for (int iM213276d = m213276d(); iM213276d >= 0; iM213276d--) {
            int iM213275c = m213275c(iM213276d);
            if (iM213275c != 0) {
                if (iM213275c < 0) {
                    sb.append(" - ");
                    iM213275c = -iM213275c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM213276d == 0 || iM213275c != 1) {
                    sb.append(iM213275c);
                }
                if (iM213276d != 0) {
                    if (iM213276d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM213276d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
