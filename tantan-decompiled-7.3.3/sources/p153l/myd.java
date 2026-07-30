package p153l;

import java.util.Formatter;

/* JADX INFO: loaded from: classes7.dex */
public final class myd {

    /* JADX INFO: renamed from: a */
    public final je2 f139405a;

    /* JADX INFO: renamed from: b */
    public final nyd[] f139406b;

    /* JADX INFO: renamed from: c */
    public cf3 f139407c;

    /* JADX INFO: renamed from: d */
    public final int f139408d;

    public myd(je2 je2Var, cf3 cf3Var) {
        this.f139405a = je2Var;
        int iM144509a = je2Var.m144509a();
        this.f139408d = iM144509a;
        this.f139407c = cf3Var;
        this.f139406b = new nyd[iM144509a + 2];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m160773b(wc5 wc5Var, wc5 wc5Var2) {
        if (wc5Var2 == null || !wc5Var2.m205789g() || wc5Var2.m205783a() != wc5Var.m205783a()) {
            return false;
        }
        wc5Var.m205791i(wc5Var2.m205785c());
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m160774c(int i, int i2, wc5 wc5Var) {
        if (wc5Var == null || wc5Var.m205789g()) {
            return i2;
        }
        if (!wc5Var.m205790h(i)) {
            return i2 + 1;
        }
        wc5Var.m205791i(i);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m160775a(nyd nydVar) {
        if (nydVar != null) {
            ((oyd) nydVar).m169837g(this.f139405a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m160776d() {
        int iM160778f = m160778f();
        if (iM160778f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f139408d + 1; i++) {
            wc5[] wc5VarArrM165321d = this.f139406b[i].m165321d();
            for (int i2 = 0; i2 < wc5VarArrM165321d.length; i2++) {
                wc5 wc5Var = wc5VarArrM165321d[i2];
                if (wc5Var != null && !wc5Var.m205789g()) {
                    m160777e(i, i2, wc5VarArrM165321d);
                }
            }
        }
        return iM160778f;
    }

    /* JADX INFO: renamed from: e */
    public final void m160777e(int i, int i2, wc5[] wc5VarArr) {
        wc5 wc5Var = wc5VarArr[i2];
        wc5[] wc5VarArrM165321d = this.f139406b[i - 1].m165321d();
        nyd nydVar = this.f139406b[i + 1];
        wc5[] wc5VarArrM165321d2 = nydVar != null ? nydVar.m165321d() : wc5VarArrM165321d;
        wc5[] wc5VarArr2 = new wc5[14];
        wc5VarArr2[2] = wc5VarArrM165321d[i2];
        wc5VarArr2[3] = wc5VarArrM165321d2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            wc5VarArr2[0] = wc5VarArr[i3];
            wc5VarArr2[4] = wc5VarArrM165321d[i3];
            wc5VarArr2[5] = wc5VarArrM165321d2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            wc5VarArr2[8] = wc5VarArr[i4];
            wc5VarArr2[10] = wc5VarArrM165321d[i4];
            wc5VarArr2[11] = wc5VarArrM165321d2[i4];
        }
        if (i2 < wc5VarArr.length - 1) {
            int i5 = i2 + 1;
            wc5VarArr2[1] = wc5VarArr[i5];
            wc5VarArr2[6] = wc5VarArrM165321d[i5];
            wc5VarArr2[7] = wc5VarArrM165321d2[i5];
        }
        if (i2 < wc5VarArr.length - 2) {
            int i6 = i2 + 2;
            wc5VarArr2[9] = wc5VarArr[i6];
            wc5VarArr2[12] = wc5VarArrM165321d[i6];
            wc5VarArr2[13] = wc5VarArrM165321d2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m160773b(wc5Var, wc5VarArr2[i7]); i7++) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m160778f() {
        m160779g();
        return m160780h() + m160781i();
    }

    /* JADX INFO: renamed from: g */
    public final void m160779g() {
        nyd[] nydVarArr = this.f139406b;
        nyd nydVar = nydVarArr[0];
        if (nydVar == null || nydVarArr[this.f139408d + 1] == null) {
            return;
        }
        wc5[] wc5VarArrM165321d = nydVar.m165321d();
        wc5[] wc5VarArrM165321d2 = this.f139406b[this.f139408d + 1].m165321d();
        for (int i = 0; i < wc5VarArrM165321d.length; i++) {
            wc5 wc5Var = wc5VarArrM165321d[i];
            if (wc5Var != null && wc5VarArrM165321d2[i] != null && wc5Var.m205785c() == wc5VarArrM165321d2[i].m205785c()) {
                for (int i2 = 1; i2 <= this.f139408d; i2++) {
                    wc5 wc5Var2 = this.f139406b[i2].m165321d()[i];
                    if (wc5Var2 != null) {
                        wc5Var2.m205791i(wc5VarArrM165321d[i].m205785c());
                        if (!wc5Var2.m205789g()) {
                            this.f139406b[i2].m165321d()[i] = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m160780h() {
        nyd nydVar = this.f139406b[0];
        if (nydVar == null) {
            return 0;
        }
        wc5[] wc5VarArrM165321d = nydVar.m165321d();
        int i = 0;
        for (int i2 = 0; i2 < wc5VarArrM165321d.length; i2++) {
            wc5 wc5Var = wc5VarArrM165321d[i2];
            if (wc5Var != null) {
                int iM205785c = wc5Var.m205785c();
                int iM160774c = 0;
                for (int i3 = 1; i3 < this.f139408d + 1 && iM160774c < 2; i3++) {
                    wc5 wc5Var2 = this.f139406b[i3].m165321d()[i2];
                    if (wc5Var2 != null) {
                        iM160774c = m160774c(iM205785c, iM160774c, wc5Var2);
                        if (!wc5Var2.m205789g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m160781i() {
        nyd[] nydVarArr = this.f139406b;
        int i = this.f139408d;
        if (nydVarArr[i + 1] == null) {
            return 0;
        }
        wc5[] wc5VarArrM165321d = nydVarArr[i + 1].m165321d();
        int i2 = 0;
        for (int i3 = 0; i3 < wc5VarArrM165321d.length; i3++) {
            wc5 wc5Var = wc5VarArrM165321d[i3];
            if (wc5Var != null) {
                int iM205785c = wc5Var.m205785c();
                int iM160774c = 0;
                for (int i4 = this.f139408d + 1; i4 > 0 && iM160774c < 2; i4--) {
                    wc5 wc5Var2 = this.f139406b[i4].m165321d()[i3];
                    if (wc5Var2 != null) {
                        iM160774c = m160774c(iM205785c, iM160774c, wc5Var2);
                        if (!wc5Var2.m205789g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public int m160782j() {
        return this.f139408d;
    }

    /* JADX INFO: renamed from: k */
    public int m160783k() {
        return this.f139405a.m144510b();
    }

    /* JADX INFO: renamed from: l */
    public int m160784l() {
        return this.f139405a.m144511c();
    }

    /* JADX INFO: renamed from: m */
    public cf3 m160785m() {
        return this.f139407c;
    }

    /* JADX INFO: renamed from: n */
    public nyd m160786n(int i) {
        return this.f139406b[i];
    }

    /* JADX INFO: renamed from: o */
    public nyd[] m160787o() {
        m160775a(this.f139406b[0]);
        m160775a(this.f139406b[this.f139408d + 1]);
        int i = 928;
        while (true) {
            int iM160776d = m160776d();
            if (iM160776d <= 0 || iM160776d >= i) {
                break;
            }
            i = iM160776d;
        }
        return this.f139406b;
    }

    /* JADX INFO: renamed from: p */
    public void m160788p(cf3 cf3Var) {
        this.f139407c = cf3Var;
    }

    /* JADX INFO: renamed from: q */
    public void m160789q(int i, nyd nydVar) {
        this.f139406b[i] = nydVar;
    }

    public String toString() {
        nyd[] nydVarArr = this.f139406b;
        nyd nydVar = nydVarArr[0];
        if (nydVar == null) {
            nydVar = nydVarArr[this.f139408d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < nydVar.m165321d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f139408d + 2; i2++) {
                    nyd nydVar2 = this.f139406b[i2];
                    if (nydVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        wc5 wc5Var = nydVar2.m165321d()[i];
                        if (wc5Var == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(wc5Var.m205785c()), Integer.valueOf(wc5Var.m205787e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }
}
