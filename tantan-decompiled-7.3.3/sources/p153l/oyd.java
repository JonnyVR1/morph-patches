package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class oyd extends nyd {

    /* JADX INFO: renamed from: c */
    public final boolean f149785c;

    public oyd(cf3 cf3Var, boolean z) {
        super(cf3Var);
        this.f149785c = z;
    }

    /* JADX INFO: renamed from: g */
    public void m169837g(je2 je2Var) {
        wc5[] wc5VarArrM165321d = m165321d();
        m169843m();
        m169842l(wc5VarArrM165321d, je2Var);
        cf3 cf3VarM165318a = m165318a();
        s5d0 s5d0VarM109521h = this.f149785c ? cf3VarM165318a.m109521h() : cf3VarM165318a.m109522i();
        s5d0 s5d0VarM109515b = this.f149785c ? cf3VarM165318a.m109515b() : cf3VarM165318a.m109516c();
        int iM165322e = m165322e((int) s5d0VarM109521h.m184658d());
        int iM165322e2 = m165322e((int) s5d0VarM109515b.m184658d());
        int iM205785c = -1;
        int i = 0;
        int iMax = 1;
        while (iM165322e < iM165322e2) {
            wc5 wc5Var = wc5VarArrM165321d[iM165322e];
            if (wc5Var != null) {
                int iM205785c2 = wc5Var.m205785c() - iM205785c;
                if (iM205785c2 == 0) {
                    i++;
                } else {
                    if (iM205785c2 == 1) {
                        iMax = Math.max(iMax, i);
                        iM205785c = wc5Var.m205785c();
                    } else if (iM205785c2 < 0 || wc5Var.m205785c() >= je2Var.m144511c() || iM205785c2 > iM165322e) {
                        wc5VarArrM165321d[iM165322e] = null;
                    } else {
                        if (iMax > 2) {
                            iM205785c2 *= iMax - 2;
                        }
                        boolean z = iM205785c2 >= iM165322e;
                        for (int i2 = 1; i2 <= iM205785c2 && !z; i2++) {
                            z = wc5VarArrM165321d[iM165322e - i2] != null;
                        }
                        if (z) {
                            wc5VarArrM165321d[iM165322e] = null;
                        } else {
                            iM205785c = wc5Var.m205785c();
                        }
                    }
                    i = 1;
                }
            }
            iM165322e++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m169838h(je2 je2Var) {
        cf3 cf3VarM165318a = m165318a();
        s5d0 s5d0VarM109521h = this.f149785c ? cf3VarM165318a.m109521h() : cf3VarM165318a.m109522i();
        s5d0 s5d0VarM109515b = this.f149785c ? cf3VarM165318a.m109515b() : cf3VarM165318a.m109516c();
        int iM165322e = m165322e((int) s5d0VarM109515b.m184658d());
        wc5[] wc5VarArrM165321d = m165321d();
        int iM205785c = -1;
        int i = 0;
        int iMax = 1;
        for (int iM165322e2 = m165322e((int) s5d0VarM109521h.m184658d()); iM165322e2 < iM165322e; iM165322e2++) {
            wc5 wc5Var = wc5VarArrM165321d[iM165322e2];
            if (wc5Var != null) {
                wc5Var.m205792j();
                int iM205785c2 = wc5Var.m205785c() - iM205785c;
                if (iM205785c2 == 0) {
                    i++;
                } else {
                    if (iM205785c2 == 1) {
                        iMax = Math.max(iMax, i);
                        iM205785c = wc5Var.m205785c();
                    } else if (wc5Var.m205785c() >= je2Var.m144511c()) {
                        wc5VarArrM165321d[iM165322e2] = null;
                    } else {
                        iM205785c = wc5Var.m205785c();
                    }
                    i = 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public je2 m169839i() {
        wc5[] wc5VarArrM165321d = m165321d();
        le2 le2Var = new le2();
        le2 le2Var2 = new le2();
        le2 le2Var3 = new le2();
        le2 le2Var4 = new le2();
        for (wc5 wc5Var : wc5VarArrM165321d) {
            if (wc5Var != null) {
                wc5Var.m205792j();
                int iM205787e = wc5Var.m205787e() % 30;
                int iM205785c = wc5Var.m205785c();
                if (!this.f149785c) {
                    iM205785c += 2;
                }
                int i = iM205785c % 3;
                if (i == 0) {
                    le2Var2.m153865b((iM205787e * 3) + 1);
                } else if (i == 1) {
                    le2Var4.m153865b(iM205787e / 3);
                    le2Var3.m153865b(iM205787e % 3);
                } else if (i == 2) {
                    le2Var.m153865b(iM205787e + 1);
                }
            }
        }
        if (le2Var.m153864a().length == 0 || le2Var2.m153864a().length == 0 || le2Var3.m153864a().length == 0 || le2Var4.m153864a().length == 0 || le2Var.m153864a()[0] <= 0 || le2Var2.m153864a()[0] + le2Var3.m153864a()[0] < 3 || le2Var2.m153864a()[0] + le2Var3.m153864a()[0] > 90) {
            return null;
        }
        je2 je2Var = new je2(le2Var.m153864a()[0], le2Var2.m153864a()[0], le2Var3.m153864a()[0], le2Var4.m153864a()[0]);
        m169842l(wc5VarArrM165321d, je2Var);
        return je2Var;
    }

    /* JADX INFO: renamed from: j */
    public int[] m169840j() {
        int iM205785c;
        je2 je2VarM169839i = m169839i();
        if (je2VarM169839i == null) {
            return null;
        }
        m169838h(je2VarM169839i);
        int iM144511c = je2VarM169839i.m144511c();
        int[] iArr = new int[iM144511c];
        for (wc5 wc5Var : m165321d()) {
            if (wc5Var != null && (iM205785c = wc5Var.m205785c()) < iM144511c) {
                iArr[iM205785c] = iArr[iM205785c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    public boolean m169841k() {
        return this.f149785c;
    }

    /* JADX INFO: renamed from: l */
    public final void m169842l(wc5[] wc5VarArr, je2 je2Var) {
        for (int i = 0; i < wc5VarArr.length; i++) {
            wc5 wc5Var = wc5VarArr[i];
            if (wc5Var != null) {
                int iM205787e = wc5Var.m205787e() % 30;
                int iM205785c = wc5Var.m205785c();
                if (iM205785c > je2Var.m144511c()) {
                    wc5VarArr[i] = null;
                } else {
                    if (!this.f149785c) {
                        iM205785c += 2;
                    }
                    int i2 = iM205785c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && iM205787e + 1 != je2Var.m144509a()) {
                                wc5VarArr[i] = null;
                            }
                        } else if (iM205787e / 3 != je2Var.m144510b() || iM205787e % 3 != je2Var.m144512d()) {
                            wc5VarArr[i] = null;
                        }
                    } else if ((iM205787e * 3) + 1 != je2Var.m144513e()) {
                        wc5VarArr[i] = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m169843m() {
        for (wc5 wc5Var : m165321d()) {
            if (wc5Var != null) {
                wc5Var.m205792j();
            }
        }
    }

    @Override // p153l.nyd
    public String toString() {
        return "IsLeft: " + this.f149785c + '\n' + super.toString();
    }
}
