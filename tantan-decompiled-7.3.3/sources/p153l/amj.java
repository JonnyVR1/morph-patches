package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class amj {

    /* JADX INFO: renamed from: a */
    public final zlj f72227a;

    /* JADX INFO: renamed from: b */
    public final int[] f72228b;

    public amj(zlj zljVar, int[] iArr) {
        if (iArr.length == 0) {
            fig0.m125680a();
            throw null;
        }
        this.f72227a = zljVar;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f72228b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f72228b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f72228b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public amj m98834a(amj amjVar) {
        if (!this.f72227a.equals(amjVar.f72227a)) {
            wg3.m206174a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (m98840g()) {
            return amjVar;
        }
        if (amjVar.m98840g()) {
            return this;
        }
        int[] iArr = this.f72228b;
        int[] iArr2 = amjVar.f72228b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = zlj.m220217a(iArr2[i - length], iArr[i]);
        }
        return new amj(this.f72227a, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public amj[] m98835b(amj amjVar) {
        if (!this.f72227a.equals(amjVar.f72227a)) {
            wg3.m206174a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (amjVar.m98840g()) {
            wg3.m206174a("Divide by 0");
            return null;
        }
        amj amjVarM220223g = this.f72227a.m220223g();
        int iM220224h = this.f72227a.m220224h(amjVar.m98837d(amjVar.m98839f()));
        amj amjVarM98834a = this;
        while (amjVarM98834a.m98839f() >= amjVar.m98839f() && !amjVarM98834a.m98840g()) {
            int iM98839f = amjVarM98834a.m98839f() - amjVar.m98839f();
            int iM220226j = this.f72227a.m220226j(amjVarM98834a.m98837d(amjVarM98834a.m98839f()), iM220224h);
            amj amjVarM98843j = amjVar.m98843j(iM98839f, iM220226j);
            amjVarM220223g = amjVarM220223g.m98834a(this.f72227a.m220218b(iM98839f, iM220226j));
            amjVarM98834a = amjVarM98834a.m98834a(amjVarM98843j);
        }
        return new amj[]{amjVarM220223g, amjVarM98834a};
    }

    /* JADX INFO: renamed from: c */
    public int m98836c(int i) {
        if (i == 0) {
            return m98837d(0);
        }
        int[] iArr = this.f72228b;
        if (i == 1) {
            int iM220217a = 0;
            for (int i2 : iArr) {
                iM220217a = zlj.m220217a(iM220217a, i2);
            }
            return iM220217a;
        }
        int iM220217a2 = iArr[0];
        int length = iArr.length;
        for (int i3 = 1; i3 < length; i3++) {
            iM220217a2 = zlj.m220217a(this.f72227a.m220226j(i, iM220217a2), this.f72228b[i3]);
        }
        return iM220217a2;
    }

    /* JADX INFO: renamed from: d */
    public int m98837d(int i) {
        int[] iArr = this.f72228b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: renamed from: e */
    public int[] m98838e() {
        return this.f72228b;
    }

    /* JADX INFO: renamed from: f */
    public int m98839f() {
        return this.f72228b.length - 1;
    }

    /* JADX INFO: renamed from: g */
    public boolean m98840g() {
        return this.f72228b[0] == 0;
    }

    /* JADX INFO: renamed from: h */
    public amj m98841h(int i) {
        if (i == 0) {
            return this.f72227a.m220223g();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f72228b.length;
        int[] iArr = new int[length];
        int i2 = 0;
        while (true) {
            zlj zljVar = this.f72227a;
            if (i2 >= length) {
                return new amj(zljVar, iArr);
            }
            iArr[i2] = zljVar.m220226j(this.f72228b[i2], i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public amj m98842i(amj amjVar) {
        if (!this.f72227a.equals(amjVar.f72227a)) {
            wg3.m206174a("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (m98840g() || amjVar.m98840g()) {
            return this.f72227a.m220223g();
        }
        int[] iArr = this.f72228b;
        int length = iArr.length;
        int[] iArr2 = amjVar.f72228b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = zlj.m220217a(iArr3[i4], this.f72227a.m220226j(i2, iArr2[i3]));
            }
        }
        return new amj(this.f72227a, iArr3);
    }

    /* JADX INFO: renamed from: j */
    public amj m98843j(int i, int i2) {
        if (i < 0) {
            fig0.m125680a();
            return null;
        }
        if (i2 == 0) {
            return this.f72227a.m220223g();
        }
        int length = this.f72228b.length;
        int[] iArr = new int[i + length];
        int i3 = 0;
        while (true) {
            zlj zljVar = this.f72227a;
            if (i3 >= length) {
                return new amj(zljVar, iArr);
            }
            iArr[i3] = zljVar.m220226j(this.f72228b[i3], i2);
            i3++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m98839f() * 8);
        for (int iM98839f = m98839f(); iM98839f >= 0; iM98839f--) {
            int iM98837d = m98837d(iM98839f);
            if (iM98837d != 0) {
                if (iM98837d < 0) {
                    sb.append(" - ");
                    iM98837d = -iM98837d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM98839f == 0 || iM98837d != 1) {
                    int iM220225i = this.f72227a.m220225i(iM98837d);
                    if (iM220225i == 0) {
                        sb.append('1');
                    } else if (iM220225i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM220225i);
                    }
                }
                if (iM98839f != 0) {
                    if (iM98839f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM98839f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
