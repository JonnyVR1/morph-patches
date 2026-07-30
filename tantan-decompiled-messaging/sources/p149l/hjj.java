package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class hjj {

    /* JADX INFO: renamed from: a */
    public final gjj f108086a;

    /* JADX INFO: renamed from: b */
    public final int[] f108087b;

    public hjj(gjj gjjVar, int[] iArr) {
        if (iArr.length == 0) {
            x9g0.m207497a();
            throw null;
        }
        this.f108086a = gjjVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f108087b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f108087b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f108087b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public hjj m131376a(hjj hjjVar) {
        if (!this.f108086a.equals(hjjVar.f108086a)) {
            ig3.m135964a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (m131382g()) {
            return hjjVar;
        }
        if (hjjVar.m131382g()) {
            return this;
        }
        int[] iArr = this.f108087b;
        int[] iArr2 = hjjVar.f108087b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = gjj.m126537a(iArr2[i - length], iArr[i]);
        }
        return new hjj(this.f108086a, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public hjj[] m131377b(hjj hjjVar) {
        if (!this.f108086a.equals(hjjVar.f108086a)) {
            ig3.m135964a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (hjjVar.m131382g()) {
            ig3.m135964a("Divide by 0");
            return null;
        }
        hjj hjjVarM126543g = this.f108086a.m126543g();
        int iM126544h = this.f108086a.m126544h(hjjVar.m131379d(hjjVar.m131381f()));
        hjj hjjVarM131376a = this;
        while (hjjVarM131376a.m131381f() >= hjjVar.m131381f() && !hjjVarM131376a.m131382g()) {
            int iM131381f = hjjVarM131376a.m131381f() - hjjVar.m131381f();
            int iM126546j = this.f108086a.m126546j(hjjVarM131376a.m131379d(hjjVarM131376a.m131381f()), iM126544h);
            hjj hjjVarM131385j = hjjVar.m131385j(iM131381f, iM126546j);
            hjjVarM126543g = hjjVarM126543g.m131376a(this.f108086a.m126538b(iM131381f, iM126546j));
            hjjVarM131376a = hjjVarM131376a.m131376a(hjjVarM131385j);
        }
        return new hjj[]{hjjVarM126543g, hjjVarM131376a};
    }

    /* JADX INFO: renamed from: c */
    public int m131378c(int i) {
        if (i == 0) {
            return m131379d(0);
        }
        int[] iArr = this.f108087b;
        if (i == 1) {
            int iM126537a = 0;
            for (int i2 : iArr) {
                iM126537a = gjj.m126537a(iM126537a, i2);
            }
            return iM126537a;
        }
        int iM126537a2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iM126537a2 = gjj.m126537a(this.f108086a.m126546j(i, iM126537a2), this.f108087b[i3]);
        }
        return iM126537a2;
    }

    /* JADX INFO: renamed from: d */
    public int m131379d(int i) {
        int[] iArr = this.f108087b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: renamed from: e */
    public int[] m131380e() {
        return this.f108087b;
    }

    /* JADX INFO: renamed from: f */
    public int m131381f() {
        return this.f108087b.length - 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m131382g() {
        return this.f108087b[0] == 0;
    }

    /* JADX INFO: renamed from: h */
    public hjj m131383h(int i) {
        if (i == 0) {
            return this.f108086a.m126543g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f108087b.length;
        int[] iArr = new int[length];
        int i2 = 0;
        while (true) {
            gjj gjjVar = this.f108086a;
            if (i2 >= length) {
                return new hjj(gjjVar, iArr);
            }
            iArr[i2] = gjjVar.m126546j(this.f108087b[i2], i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public hjj m131384i(hjj hjjVar) {
        if (!this.f108086a.equals(hjjVar.f108086a)) {
            ig3.m135964a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (m131382g() || hjjVar.m131382g()) {
            return this.f108086a.m126543g();
        }
        int[] iArr = this.f108087b;
        int length = iArr.length;
        int[] iArr2 = hjjVar.f108087b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = gjj.m126537a(iArr3[i4], this.f108086a.m126546j(i2, iArr2[i3]));
            }
        }
        return new hjj(this.f108086a, iArr3);
    }

    /* JADX INFO: renamed from: j */
    public hjj m131385j(int i, int i2) {
        if (i < 0) {
            x9g0.m207497a();
            return null;
        }
        if (i2 == 0) {
            return this.f108086a.m126543g();
        }
        int length = this.f108087b.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            gjj gjjVar = this.f108086a;
            if (i3 >= length) {
                return new hjj(gjjVar, iArr);
            }
            iArr[i3] = gjjVar.m126546j(this.f108087b[i3], i2);
            i3++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m131381f() * 8);
        for (int iM131381f = m131381f(); iM131381f >= 0; iM131381f--) {
            int iM131379d = m131379d(iM131381f);
            if (iM131379d != 0) {
                if (iM131379d < 0) {
                    sb.append(" - ");
                    iM131379d = -iM131379d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM131381f == 0 || iM131379d != 1) {
                    int iM126545i = this.f108086a.m126545i(iM131379d);
                    if (iM126545i == 0) {
                        sb.append('1');
                    } else if (iM126545i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM126545i);
                    }
                }
                if (iM131381f != 0) {
                    if (iM131381f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM131381f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
