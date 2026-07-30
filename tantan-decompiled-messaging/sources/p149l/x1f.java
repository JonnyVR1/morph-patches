package p149l;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes7.dex */
public final class x1f {

    /* JADX INFO: renamed from: a */
    public final x700 f189069a = x700.f191305f;

    /* JADX INFO: renamed from: a */
    public int m206705a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        y700 y700Var = new y700(this.f189069a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int iM213274b = y700Var.m213274b(this.f189069a.m207232c(i2));
            iArr3[i - i2] = iM213274b;
            if (iM213274b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        y700 y700VarM207233d = this.f189069a.m207233d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int iM207232c = this.f189069a.m207232c((iArr.length - 1) - i3);
                x700 x700Var = this.f189069a;
                y700VarM207233d = y700VarM207233d.m213279g(new y700(x700Var, new int[]{x700Var.m207239j(0, iM207232c), 1}));
            }
        }
        y700[] y700VarArrM206708d = m206708d(this.f189069a.m207231b(i, 1), new y700(this.f189069a, iArr3), i);
        y700 y700Var2 = y700VarArrM206708d[0];
        y700 y700Var3 = y700VarArrM206708d[1];
        int[] iArrM206706b = m206706b(y700Var2);
        int[] iArrM206707c = m206707c(y700Var3, y700Var2, iArrM206706b);
        for (int i4 = 0; i4 < iArrM206706b.length; i4++) {
            int length = (iArr.length - 1) - this.f189069a.m207237h(iArrM206706b[i4]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.f189069a.m207239j(iArr[length], iArrM206707c[i4]);
        }
        return iArrM206706b.length;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m206706b(y700 y700Var) throws ChecksumException {
        int iM213276d = y700Var.m213276d();
        int[] iArr = new int[iM213276d];
        int i = 0;
        for (int i2 = 1; i2 < this.f189069a.m207234e() && i < iM213276d; i2++) {
            if (y700Var.m213274b(i2) == 0) {
                iArr[i] = this.f189069a.m207236g(i2);
                i++;
            }
        }
        if (i == iM213276d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* JADX INFO: renamed from: c */
    public final int[] m206707c(y700 y700Var, y700 y700Var2, int[] iArr) {
        x700 x700Var;
        int iM213276d = y700Var2.m213276d();
        int[] iArr2 = new int[iM213276d];
        int i = 1;
        while (true) {
            x700Var = this.f189069a;
            if (i > iM213276d) {
                break;
            }
            iArr2[iM213276d - i] = x700Var.m207238i(i, y700Var2.m213275c(i));
            i++;
        }
        y700 y700Var3 = new y700(x700Var, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int iM207236g = this.f189069a.m207236g(iArr[i2]);
            iArr3[i2] = this.f189069a.m207238i(this.f189069a.m207239j(0, y700Var.m213274b(iM207236g)), this.f189069a.m207236g(y700Var3.m213274b(iM207236g)));
        }
        return iArr3;
    }

    /* JADX INFO: renamed from: d */
    public final y700[] m206708d(y700 y700Var, y700 y700Var2, int i) throws ChecksumException {
        if (y700Var.m213276d() < y700Var2.m213276d()) {
            y700Var2 = y700Var;
            y700Var = y700Var2;
        }
        y700 y700VarM207235f = this.f189069a.m207235f();
        y700 y700VarM207233d = this.f189069a.m207233d();
        while (true) {
            y700 y700Var3 = y700Var2;
            y700Var2 = y700Var;
            y700Var = y700Var3;
            y700 y700Var4 = y700VarM207233d;
            y700 y700Var5 = y700VarM207235f;
            y700VarM207235f = y700Var4;
            if (y700Var.m213276d() < i / 2) {
                int iM213275c = y700VarM207235f.m213275c(0);
                if (iM213275c == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iM207236g = this.f189069a.m207236g(iM213275c);
                return new y700[]{y700VarM207235f.m213278f(iM207236g), y700Var.m213278f(iM207236g)};
            }
            if (y700Var.m213277e()) {
                throw ChecksumException.getChecksumInstance();
            }
            y700 y700VarM207235f2 = this.f189069a.m207235f();
            int iM207236g2 = this.f189069a.m207236g(y700Var.m213275c(y700Var.m213276d()));
            while (y700Var2.m213276d() >= y700Var.m213276d() && !y700Var2.m213277e()) {
                int iM213276d = y700Var2.m213276d() - y700Var.m213276d();
                int iM207238i = this.f189069a.m207238i(y700Var2.m213275c(y700Var2.m213276d()), iM207236g2);
                y700VarM207235f2 = y700VarM207235f2.m213273a(this.f189069a.m207231b(iM213276d, iM207238i));
                y700Var2 = y700Var2.m213282j(y700Var.m213280h(iM213276d, iM207238i));
            }
            y700VarM207233d = y700VarM207235f2.m213279g(y700VarM207235f).m213282j(y700Var5).m213281i();
        }
    }
}
