package p153l;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes7.dex */
public final class c3f {

    /* JADX INFO: renamed from: a */
    public final gg00 f79600a = gg00.f103980f;

    /* JADX INFO: renamed from: a */
    public int m107784a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        hg00 hg00Var = new hg00(this.f79600a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int iM134889b = hg00Var.m134889b(this.f79600a.m130130c(i2));
            iArr3[i - i2] = iM134889b;
            if (iM134889b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        hg00 hg00VarM130131d = this.f79600a.m130131d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int iM130130c = this.f79600a.m130130c((iArr.length - 1) - i3);
                gg00 gg00Var = this.f79600a;
                hg00VarM130131d = hg00VarM130131d.m134894g(new hg00(gg00Var, new int[]{gg00Var.m130137j(0, iM130130c), 1}));
            }
        }
        hg00[] hg00VarArrM107787d = m107787d(this.f79600a.m130129b(i, 1), new hg00(this.f79600a, iArr3), i);
        hg00 hg00Var2 = hg00VarArrM107787d[0];
        hg00 hg00Var3 = hg00VarArrM107787d[1];
        int[] iArrM107785b = m107785b(hg00Var2);
        int[] iArrM107786c = m107786c(hg00Var3, hg00Var2, iArrM107785b);
        for (int i4 = 0; i4 < iArrM107785b.length; i4++) {
            int length = (iArr.length - 1) - this.f79600a.m130135h(iArrM107785b[i4]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.f79600a.m130137j(iArr[length], iArrM107786c[i4]);
        }
        return iArrM107785b.length;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m107785b(hg00 hg00Var) throws ChecksumException {
        int iM134891d = hg00Var.m134891d();
        int[] iArr = new int[iM134891d];
        int i = 0;
        for (int i2 = 1; i2 < this.f79600a.m130132e() && i < iM134891d; i2++) {
            if (hg00Var.m134889b(i2) == 0) {
                iArr[i] = this.f79600a.m130134g(i2);
                i++;
            }
        }
        if (i == iM134891d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* JADX INFO: renamed from: c */
    public final int[] m107786c(hg00 hg00Var, hg00 hg00Var2, int[] iArr) {
        gg00 gg00Var;
        int iM134891d = hg00Var2.m134891d();
        int[] iArr2 = new int[iM134891d];
        int i = 1;
        while (true) {
            gg00Var = this.f79600a;
            if (i > iM134891d) {
                break;
            }
            iArr2[iM134891d - i] = gg00Var.m130136i(i, hg00Var2.m134890c(i));
            i++;
        }
        hg00 hg00Var3 = new hg00(gg00Var, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int iM130134g = this.f79600a.m130134g(iArr[i2]);
            iArr3[i2] = this.f79600a.m130136i(this.f79600a.m130137j(0, hg00Var.m134889b(iM130134g)), this.f79600a.m130134g(hg00Var3.m134889b(iM130134g)));
        }
        return iArr3;
    }

    /* JADX INFO: renamed from: d */
    public final hg00[] m107787d(hg00 hg00Var, hg00 hg00Var2, int i) throws ChecksumException {
        if (hg00Var.m134891d() < hg00Var2.m134891d()) {
            hg00Var2 = hg00Var;
            hg00Var = hg00Var2;
        }
        hg00 hg00VarM130133f = this.f79600a.m130133f();
        hg00 hg00VarM130131d = this.f79600a.m130131d();
        while (true) {
            hg00 hg00Var3 = hg00Var2;
            hg00Var2 = hg00Var;
            hg00Var = hg00Var3;
            hg00 hg00Var4 = hg00VarM130131d;
            hg00 hg00Var5 = hg00VarM130133f;
            hg00VarM130133f = hg00Var4;
            if (hg00Var.m134891d() < i / 2) {
                int iM134890c = hg00VarM130133f.m134890c(0);
                if (iM134890c == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iM130134g = this.f79600a.m130134g(iM134890c);
                return new hg00[]{hg00VarM130133f.m134893f(iM130134g), hg00Var.m134893f(iM130134g)};
            }
            if (hg00Var.m134892e()) {
                throw ChecksumException.getChecksumInstance();
            }
            hg00 hg00VarM130133f2 = this.f79600a.m130133f();
            int iM130134g2 = this.f79600a.m130134g(hg00Var.m134890c(hg00Var.m134891d()));
            while (hg00Var2.m134891d() >= hg00Var.m134891d() && !hg00Var2.m134892e()) {
                int iM134891d = hg00Var2.m134891d() - hg00Var.m134891d();
                int iM130136i = this.f79600a.m130136i(hg00Var2.m134890c(hg00Var2.m134891d()), iM130134g2);
                hg00VarM130133f2 = hg00VarM130133f2.m134888a(this.f79600a.m130129b(iM134891d, iM130136i));
                hg00Var2 = hg00Var2.m134897j(hg00Var.m134895h(iM134891d, iM130136i));
            }
            hg00VarM130131d = hg00VarM130133f2.m134894g(hg00VarM130133f).m134897j(hg00Var5).m134896i();
        }
    }
}
