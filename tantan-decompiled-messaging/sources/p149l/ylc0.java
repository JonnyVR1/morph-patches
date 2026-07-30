package p149l;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes7.dex */
public final class ylc0 {

    /* JADX INFO: renamed from: a */
    public final gjj f198874a;

    public ylc0(gjj gjjVar) {
        this.f198874a = gjjVar;
    }

    /* JADX INFO: renamed from: a */
    public void m215261a(int[] iArr, int i) throws ReedSolomonException {
        hjj hjjVar = new hjj(this.f198874a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            gjj gjjVar = this.f198874a;
            int iM131378c = hjjVar.m131378c(gjjVar.m126539c(gjjVar.m126540d() + i2));
            iArr2[(i - 1) - i2] = iM131378c;
            if (iM131378c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        hjj[] hjjVarArrM215264d = m215264d(this.f198874a.m126538b(i, 1), new hjj(this.f198874a, iArr2), i);
        hjj hjjVar2 = hjjVarArrM215264d[0];
        hjj hjjVar3 = hjjVarArrM215264d[1];
        int[] iArrM215262b = m215262b(hjjVar2);
        int[] iArrM215263c = m215263c(hjjVar3, iArrM215262b);
        for (int i3 = 0; i3 < iArrM215262b.length; i3++) {
            int length = (iArr.length - 1) - this.f198874a.m126545i(iArrM215262b[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = gjj.m126537a(iArr[length], iArrM215263c[i3]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m215262b(hjj hjjVar) throws ReedSolomonException {
        int iM131381f = hjjVar.m131381f();
        if (iM131381f == 1) {
            return new int[]{hjjVar.m131379d(1)};
        }
        int[] iArr = new int[iM131381f];
        int i = 0;
        for (int i2 = 1; i2 < this.f198874a.m126542f() && i < iM131381f; i2++) {
            if (hjjVar.m131378c(i2) == 0) {
                iArr[i] = this.f198874a.m126544h(i2);
                i++;
            }
        }
        if (i == iM131381f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* JADX INFO: renamed from: c */
    public final int[] m215263c(hjj hjjVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iM126544h = this.f198874a.m126544h(iArr[i]);
            int iM126546j = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iM126546j2 = this.f198874a.m126546j(iArr[i2], iM126544h);
                    iM126546j = this.f198874a.m126546j(iM126546j, (iM126546j2 & 1) == 0 ? iM126546j2 | 1 : iM126546j2 & (-2));
                }
            }
            iArr2[i] = this.f198874a.m126546j(hjjVar.m131378c(iM126544h), this.f198874a.m126544h(iM126546j));
            if (this.f198874a.m126540d() != 0) {
                iArr2[i] = this.f198874a.m126546j(iArr2[i], iM126544h);
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public final hjj[] m215264d(hjj hjjVar, hjj hjjVar2, int i) throws ReedSolomonException {
        if (hjjVar.m131381f() < hjjVar2.m131381f()) {
            hjjVar2 = hjjVar;
            hjjVar = hjjVar2;
        }
        hjj hjjVarM126543g = this.f198874a.m126543g();
        hjj hjjVarM126541e = this.f198874a.m126541e();
        do {
            hjj hjjVar3 = hjjVar2;
            hjjVar2 = hjjVar;
            hjjVar = hjjVar3;
            hjj hjjVar4 = hjjVarM126541e;
            hjj hjjVar5 = hjjVarM126543g;
            hjjVarM126543g = hjjVar4;
            if (hjjVar.m131381f() < i / 2) {
                int iM131379d = hjjVarM126543g.m131379d(0);
                if (iM131379d == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int iM126544h = this.f198874a.m126544h(iM131379d);
                return new hjj[]{hjjVarM126543g.m131383h(iM126544h), hjjVar.m131383h(iM126544h)};
            }
            if (hjjVar.m131382g()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            hjj hjjVarM126543g2 = this.f198874a.m126543g();
            int iM126544h2 = this.f198874a.m126544h(hjjVar.m131379d(hjjVar.m131381f()));
            while (hjjVar2.m131381f() >= hjjVar.m131381f() && !hjjVar2.m131382g()) {
                int iM131381f = hjjVar2.m131381f() - hjjVar.m131381f();
                int iM126546j = this.f198874a.m126546j(hjjVar2.m131379d(hjjVar2.m131381f()), iM126544h2);
                hjjVarM126543g2 = hjjVarM126543g2.m131376a(this.f198874a.m126538b(iM131381f, iM126546j));
                hjjVar2 = hjjVar2.m131376a(hjjVar.m131385j(iM131381f, iM126546j));
            }
            hjjVarM126541e = hjjVarM126543g2.m131384i(hjjVarM126543g).m131376a(hjjVar5);
        } while (hjjVar2.m131381f() < hjjVar.m131381f());
        qkq0.m175383a("Division algorithm failed to reduce polynomial?");
        return null;
    }
}
