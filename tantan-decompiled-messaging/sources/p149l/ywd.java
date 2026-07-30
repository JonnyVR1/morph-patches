package p149l;

import java.util.Formatter;

/* JADX INFO: loaded from: classes7.dex */
public final class ywd {

    /* JADX INFO: renamed from: a */
    public final ce2 f200476a;

    /* JADX INFO: renamed from: b */
    public final zwd[] f200477b;

    /* JADX INFO: renamed from: c */
    public ne3 f200478c;

    /* JADX INFO: renamed from: d */
    public final int f200479d;

    public ywd(ce2 ce2Var, ne3 ne3Var) {
        this.f200476a = ce2Var;
        int iM106304a = ce2Var.m106304a();
        this.f200479d = iM106304a;
        this.f200478c = ne3Var;
        this.f200477b = new zwd[iM106304a + 2];
    }

    /* JADX INFO: renamed from: b */
    public static boolean m216348b(wb5 wb5Var, wb5 wb5Var2) {
        if (wb5Var2 == null || !wb5Var2.m202519g() || wb5Var2.m202513a() != wb5Var.m202513a()) {
            return false;
        }
        wb5Var.m202521i(wb5Var2.m202515c());
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m216349c(int i, int i2, wb5 wb5Var) {
        if (wb5Var == null || wb5Var.m202519g()) {
            return i2;
        }
        if (!wb5Var.m202520h(i)) {
            return i2 + 1;
        }
        wb5Var.m202521i(i);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m216350a(zwd zwdVar) {
        if (zwdVar != null) {
            ((axd) zwdVar).m99398g(this.f200476a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m216351d() {
        int iM216353f = m216353f();
        if (iM216353f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f200479d + 1; i++) {
            wb5[] wb5VarArrM220585d = this.f200477b[i].m220585d();
            for (int i2 = 0; i2 < wb5VarArrM220585d.length; i2++) {
                wb5 wb5Var = wb5VarArrM220585d[i2];
                if (wb5Var != null && !wb5Var.m202519g()) {
                    m216352e(i, i2, wb5VarArrM220585d);
                }
            }
        }
        return iM216353f;
    }

    /* JADX INFO: renamed from: e */
    public final void m216352e(int i, int i2, wb5[] wb5VarArr) {
        wb5 wb5Var = wb5VarArr[i2];
        wb5[] wb5VarArrM220585d = this.f200477b[i - 1].m220585d();
        zwd zwdVar = this.f200477b[i + 1];
        wb5[] wb5VarArrM220585d2 = zwdVar != null ? zwdVar.m220585d() : wb5VarArrM220585d;
        wb5[] wb5VarArr2 = new wb5[14];
        wb5VarArr2[2] = wb5VarArrM220585d[i2];
        wb5VarArr2[3] = wb5VarArrM220585d2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            wb5VarArr2[0] = wb5VarArr[i3];
            wb5VarArr2[4] = wb5VarArrM220585d[i3];
            wb5VarArr2[5] = wb5VarArrM220585d2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            wb5VarArr2[8] = wb5VarArr[i4];
            wb5VarArr2[10] = wb5VarArrM220585d[i4];
            wb5VarArr2[11] = wb5VarArrM220585d2[i4];
        }
        if (i2 < wb5VarArr.length - 1) {
            int i5 = i2 + 1;
            wb5VarArr2[1] = wb5VarArr[i5];
            wb5VarArr2[6] = wb5VarArrM220585d[i5];
            wb5VarArr2[7] = wb5VarArrM220585d2[i5];
        }
        if (i2 < wb5VarArr.length - 2) {
            int i6 = i2 + 2;
            wb5VarArr2[9] = wb5VarArr[i6];
            wb5VarArr2[12] = wb5VarArrM220585d[i6];
            wb5VarArr2[13] = wb5VarArrM220585d2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m216348b(wb5Var, wb5VarArr2[i7]); i7++) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m216353f() {
        m216354g();
        return m216355h() + m216356i();
    }

    /* JADX INFO: renamed from: g */
    public final void m216354g() {
        zwd[] zwdVarArr = this.f200477b;
        zwd zwdVar = zwdVarArr[0];
        if (zwdVar == null || zwdVarArr[this.f200479d + 1] == null) {
            return;
        }
        wb5[] wb5VarArrM220585d = zwdVar.m220585d();
        wb5[] wb5VarArrM220585d2 = this.f200477b[this.f200479d + 1].m220585d();
        for (int i = 0; i < wb5VarArrM220585d.length; i++) {
            wb5 wb5Var = wb5VarArrM220585d[i];
            if (wb5Var != null && wb5VarArrM220585d2[i] != null && wb5Var.m202515c() == wb5VarArrM220585d2[i].m202515c()) {
                for (int i2 = 1; i2 <= this.f200479d; i2++) {
                    wb5 wb5Var2 = this.f200477b[i2].m220585d()[i];
                    if (wb5Var2 != null) {
                        wb5Var2.m202521i(wb5VarArrM220585d[i].m202515c());
                        if (!wb5Var2.m202519g()) {
                            this.f200477b[i2].m220585d()[i] = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m216355h() {
        zwd zwdVar = this.f200477b[0];
        if (zwdVar == null) {
            return 0;
        }
        wb5[] wb5VarArrM220585d = zwdVar.m220585d();
        int i = 0;
        for (int i2 = 0; i2 < wb5VarArrM220585d.length; i2++) {
            wb5 wb5Var = wb5VarArrM220585d[i2];
            if (wb5Var != null) {
                int iM202515c = wb5Var.m202515c();
                int iM216349c = 0;
                for (int i3 = 1; i3 < this.f200479d + 1 && iM216349c < 2; i3++) {
                    wb5 wb5Var2 = this.f200477b[i3].m220585d()[i2];
                    if (wb5Var2 != null) {
                        iM216349c = m216349c(iM202515c, iM216349c, wb5Var2);
                        if (!wb5Var2.m202519g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m216356i() {
        zwd[] zwdVarArr = this.f200477b;
        int i = this.f200479d;
        if (zwdVarArr[i + 1] == null) {
            return 0;
        }
        wb5[] wb5VarArrM220585d = zwdVarArr[i + 1].m220585d();
        int i2 = 0;
        for (int i3 = 0; i3 < wb5VarArrM220585d.length; i3++) {
            wb5 wb5Var = wb5VarArrM220585d[i3];
            if (wb5Var != null) {
                int iM202515c = wb5Var.m202515c();
                int iM216349c = 0;
                for (int i4 = this.f200479d + 1; i4 > 0 && iM216349c < 2; i4--) {
                    wb5 wb5Var2 = this.f200477b[i4].m220585d()[i3];
                    if (wb5Var2 != null) {
                        iM216349c = m216349c(iM202515c, iM216349c, wb5Var2);
                        if (!wb5Var2.m202519g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public int m216357j() {
        return this.f200479d;
    }

    /* JADX INFO: renamed from: k */
    public int m216358k() {
        return this.f200476a.m106305b();
    }

    /* JADX INFO: renamed from: l */
    public int m216359l() {
        return this.f200476a.m106306c();
    }

    /* JADX INFO: renamed from: m */
    public ne3 m216360m() {
        return this.f200478c;
    }

    /* JADX INFO: renamed from: n */
    public zwd m216361n(int i) {
        return this.f200477b[i];
    }

    /* JADX INFO: renamed from: o */
    public zwd[] m216362o() {
        m216350a(this.f200477b[0]);
        m216350a(this.f200477b[this.f200479d + 1]);
        int i = 928;
        while (true) {
            int iM216351d = m216351d();
            if (iM216351d <= 0 || iM216351d >= i) {
                break;
            }
            i = iM216351d;
        }
        return this.f200477b;
    }

    /* JADX INFO: renamed from: p */
    public void m216363p(ne3 ne3Var) {
        this.f200478c = ne3Var;
    }

    /* JADX INFO: renamed from: q */
    public void m216364q(int i, zwd zwdVar) {
        this.f200477b[i] = zwdVar;
    }

    public String toString() {
        zwd[] zwdVarArr = this.f200477b;
        zwd zwdVar = zwdVarArr[0];
        if (zwdVar == null) {
            zwdVar = zwdVarArr[this.f200479d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < zwdVar.m220585d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.f200479d + 2; i2++) {
                    zwd zwdVar2 = this.f200477b[i2];
                    if (zwdVar2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        wb5 wb5Var = zwdVar2.m220585d()[i];
                        if (wb5Var == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(wb5Var.m202515c()), Integer.valueOf(wb5Var.m202517e()));
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
