package p153l;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes7.dex */
public final class fuc0 {

    /* JADX INFO: renamed from: a */
    public final zlj f100900a;

    public fuc0(zlj zljVar) {
        this.f100900a = zljVar;
    }

    /* JADX INFO: renamed from: a */
    public void m127454a(int[] iArr, int i) throws ReedSolomonException {
        amj amjVar = new amj(this.f100900a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            zlj zljVar = this.f100900a;
            int iM98836c = amjVar.m98836c(zljVar.m220219c(zljVar.m220220d() + i2));
            iArr2[(i - 1) - i2] = iM98836c;
            if (iM98836c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        amj[] amjVarArrM127457d = m127457d(this.f100900a.m220218b(i, 1), new amj(this.f100900a, iArr2), i);
        amj amjVar2 = amjVarArrM127457d[0];
        amj amjVar3 = amjVarArrM127457d[1];
        int[] iArrM127455b = m127455b(amjVar2);
        int[] iArrM127456c = m127456c(amjVar3, iArrM127455b);
        for (int i3 = 0; i3 < iArrM127455b.length; i3++) {
            int length = (iArr.length - 1) - this.f100900a.m220225i(iArrM127455b[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = zlj.m220217a(iArr[length], iArrM127456c[i3]);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m127455b(amj amjVar) throws ReedSolomonException {
        int iM98839f = amjVar.m98839f();
        if (iM98839f == 1) {
            return new int[]{amjVar.m98837d(1)};
        }
        int[] iArr = new int[iM98839f];
        int i = 0;
        for (int i2 = 1; i2 < this.f100900a.m220222f() && i < iM98839f; i2++) {
            if (amjVar.m98836c(i2) == 0) {
                iArr[i] = this.f100900a.m220224h(i2);
                i++;
            }
        }
        if (i == iM98839f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* JADX INFO: renamed from: c */
    public final int[] m127456c(amj amjVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iM220224h = this.f100900a.m220224h(iArr[i]);
            int iM220226j = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iM220226j2 = this.f100900a.m220226j(iArr[i2], iM220224h);
                    iM220226j = this.f100900a.m220226j(iM220226j, (iM220226j2 & 1) == 0 ? iM220226j2 | 1 : iM220226j2 & (-2));
                }
            }
            iArr2[i] = this.f100900a.m220226j(amjVar.m98836c(iM220224h), this.f100900a.m220224h(iM220226j));
            if (this.f100900a.m220220d() != 0) {
                iArr2[i] = this.f100900a.m220226j(iArr2[i], iM220224h);
            }
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public final amj[] m127457d(amj amjVar, amj amjVar2, int i) throws ReedSolomonException {
        if (amjVar.m98839f() < amjVar2.m98839f()) {
            amjVar2 = amjVar;
            amjVar = amjVar2;
        }
        amj amjVarM220223g = this.f100900a.m220223g();
        amj amjVarM220221e = this.f100900a.m220221e();
        do {
            amj amjVar3 = amjVar2;
            amjVar2 = amjVar;
            amjVar = amjVar3;
            amj amjVar4 = amjVarM220221e;
            amj amjVar5 = amjVarM220223g;
            amjVarM220223g = amjVar4;
            if (amjVar.m98839f() < i / 2) {
                int iM98837d = amjVarM220223g.m98837d(0);
                if (iM98837d == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int iM220224h = this.f100900a.m220224h(iM98837d);
                return new amj[]{amjVarM220223g.m98841h(iM220224h), amjVar.m98841h(iM220224h)};
            }
            if (amjVar.m98840g()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            amj amjVarM220223g2 = this.f100900a.m220223g();
            int iM220224h2 = this.f100900a.m220224h(amjVar.m98837d(amjVar.m98839f()));
            while (amjVar2.m98839f() >= amjVar.m98839f() && !amjVar2.m98840g()) {
                int iM98839f = amjVar2.m98839f() - amjVar.m98839f();
                int iM220226j = this.f100900a.m220226j(amjVar2.m98837d(amjVar2.m98839f()), iM220224h2);
                amjVarM220223g2 = amjVarM220223g2.m98834a(this.f100900a.m220218b(iM98839f, iM220226j));
                amjVar2 = amjVar2.m98834a(amjVar.m98843j(iM98839f, iM220226j));
            }
            amjVarM220221e = amjVarM220223g2.m98842i(amjVarM220223g).m98834a(amjVar5);
        } while (amjVar2.m98839f() < amjVar.m98839f());
        wtq0.m207906a("Division algorithm failed to reduce polynomial?");
        return null;
    }
}
