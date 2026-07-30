package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class axd extends zwd {

    /* JADX INFO: renamed from: c */
    public final boolean f72146c;

    public axd(ne3 ne3Var, boolean z) {
        super(ne3Var);
        this.f72146c = z;
    }

    /* JADX INFO: renamed from: g */
    public void m99398g(ce2 ce2Var) {
        wb5[] wb5VarArrM220585d = m220585d();
        m99404m();
        m99403l(wb5VarArrM220585d, ce2Var);
        ne3 ne3VarM220582a = m220582a();
        pxc0 pxc0VarM159098h = this.f72146c ? ne3VarM220582a.m159098h() : ne3VarM220582a.m159099i();
        pxc0 pxc0VarM159092b = this.f72146c ? ne3VarM220582a.m159092b() : ne3VarM220582a.m159093c();
        int iM220586e = m220586e((int) pxc0VarM159098h.m171832d());
        int iM220586e2 = m220586e((int) pxc0VarM159092b.m171832d());
        int iM202515c = -1;
        int i = 0;
        int iMax = 1;
        while (iM220586e < iM220586e2) {
            wb5 wb5Var = wb5VarArrM220585d[iM220586e];
            if (wb5Var != null) {
                int iM202515c2 = wb5Var.m202515c() - iM202515c;
                if (iM202515c2 == 0) {
                    i++;
                } else {
                    if (iM202515c2 == 1) {
                        iMax = Math.max(iMax, i);
                        iM202515c = wb5Var.m202515c();
                    } else if (iM202515c2 < 0 || wb5Var.m202515c() >= ce2Var.m106306c() || iM202515c2 > iM220586e) {
                        wb5VarArrM220585d[iM220586e] = null;
                    } else {
                        if (iMax > 2) {
                            iM202515c2 *= iMax - 2;
                        }
                        boolean z = iM202515c2 >= iM220586e;
                        for (int i2 = 1; i2 <= iM202515c2 && !z; i2++) {
                            z = wb5VarArrM220585d[iM220586e - i2] != null;
                        }
                        if (z) {
                            wb5VarArrM220585d[iM220586e] = null;
                        } else {
                            iM202515c = wb5Var.m202515c();
                        }
                    }
                    i = 1;
                }
            }
            iM220586e++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m99399h(ce2 ce2Var) {
        ne3 ne3VarM220582a = m220582a();
        pxc0 pxc0VarM159098h = this.f72146c ? ne3VarM220582a.m159098h() : ne3VarM220582a.m159099i();
        pxc0 pxc0VarM159092b = this.f72146c ? ne3VarM220582a.m159092b() : ne3VarM220582a.m159093c();
        int iM220586e = m220586e((int) pxc0VarM159092b.m171832d());
        wb5[] wb5VarArrM220585d = m220585d();
        int iM202515c = -1;
        int i = 0;
        int iMax = 1;
        for (int iM220586e2 = m220586e((int) pxc0VarM159098h.m171832d()); iM220586e2 < iM220586e; iM220586e2++) {
            wb5 wb5Var = wb5VarArrM220585d[iM220586e2];
            if (wb5Var != null) {
                wb5Var.m202522j();
                int iM202515c2 = wb5Var.m202515c() - iM202515c;
                if (iM202515c2 == 0) {
                    i++;
                } else {
                    if (iM202515c2 == 1) {
                        iMax = Math.max(iMax, i);
                        iM202515c = wb5Var.m202515c();
                    } else if (wb5Var.m202515c() >= ce2Var.m106306c()) {
                        wb5VarArrM220585d[iM220586e2] = null;
                    } else {
                        iM202515c = wb5Var.m202515c();
                    }
                    i = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public ce2 m99400i() {
        wb5[] wb5VarArrM220585d = m220585d();
        ee2 ee2Var = new ee2();
        ee2 ee2Var2 = new ee2();
        ee2 ee2Var3 = new ee2();
        ee2 ee2Var4 = new ee2();
        for (wb5 wb5Var : wb5VarArrM220585d) {
            if (wb5Var != null) {
                wb5Var.m202522j();
                int iM202517e = wb5Var.m202517e() % 30;
                int iM202515c = wb5Var.m202515c();
                if (!this.f72146c) {
                    iM202515c += 2;
                }
                int i = iM202515c % 3;
                if (i == 0) {
                    ee2Var2.m115843b((iM202517e * 3) + 1);
                } else if (i == 1) {
                    ee2Var4.m115843b(iM202517e / 3);
                    ee2Var3.m115843b(iM202517e % 3);
                } else if (i == 2) {
                    ee2Var.m115843b(iM202517e + 1);
                }
            }
        }
        if (ee2Var.m115842a().length == 0 || ee2Var2.m115842a().length == 0 || ee2Var3.m115842a().length == 0 || ee2Var4.m115842a().length == 0 || ee2Var.m115842a()[0] <= 0 || ee2Var2.m115842a()[0] + ee2Var3.m115842a()[0] < 3 || ee2Var2.m115842a()[0] + ee2Var3.m115842a()[0] > 90) {
            return null;
        }
        ce2 ce2Var = new ce2(ee2Var.m115842a()[0], ee2Var2.m115842a()[0], ee2Var3.m115842a()[0], ee2Var4.m115842a()[0]);
        m99403l(wb5VarArrM220585d, ce2Var);
        return ce2Var;
    }

    /* JADX INFO: renamed from: j */
    public int[] m99401j() {
        int iM202515c;
        ce2 ce2VarM99400i = m99400i();
        if (ce2VarM99400i == null) {
            return null;
        }
        m99399h(ce2VarM99400i);
        int iM106306c = ce2VarM99400i.m106306c();
        int[] iArr = new int[iM106306c];
        for (wb5 wb5Var : m220585d()) {
            if (wb5Var != null && (iM202515c = wb5Var.m202515c()) < iM106306c) {
                iArr[iM202515c] = iArr[iM202515c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    public boolean m99402k() {
        return this.f72146c;
    }

    /* JADX INFO: renamed from: l */
    public final void m99403l(wb5[] wb5VarArr, ce2 ce2Var) {
        for (int i = 0; i < wb5VarArr.length; i++) {
            wb5 wb5Var = wb5VarArr[i];
            if (wb5Var != null) {
                int iM202517e = wb5Var.m202517e() % 30;
                int iM202515c = wb5Var.m202515c();
                if (iM202515c > ce2Var.m106306c()) {
                    wb5VarArr[i] = null;
                } else {
                    if (!this.f72146c) {
                        iM202515c += 2;
                    }
                    int i2 = iM202515c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && iM202517e + 1 != ce2Var.m106304a()) {
                                wb5VarArr[i] = null;
                            }
                        } else if (iM202517e / 3 != ce2Var.m106305b() || iM202517e % 3 != ce2Var.m106307d()) {
                            wb5VarArr[i] = null;
                        }
                    } else if ((iM202517e * 3) + 1 != ce2Var.m106308e()) {
                        wb5VarArr[i] = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m99404m() {
        for (wb5 wb5Var : m220585d()) {
            if (wb5Var != null) {
                wb5Var.m202522j();
            }
        }
    }

    @Override // p149l.zwd
    public String toString() {
        return "IsLeft: " + this.f72146c + '\n' + super.toString();
    }
}
