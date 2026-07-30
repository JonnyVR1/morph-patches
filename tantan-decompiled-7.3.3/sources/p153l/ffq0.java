package p153l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class ffq0 {

    /* JADX INFO: renamed from: a */
    public final d13 f98820a;

    /* JADX INFO: renamed from: b */
    public final int f98821b;

    /* JADX INFO: renamed from: c */
    public final int f98822c;

    /* JADX INFO: renamed from: d */
    public final int f98823d;

    /* JADX INFO: renamed from: e */
    public final int f98824e;

    /* JADX INFO: renamed from: f */
    public final int f98825f;

    /* JADX INFO: renamed from: g */
    public final int f98826g;

    public ffq0(d13 d13Var, int i, int i2, int i3) throws NotFoundException {
        this.f98820a = d13Var;
        int iM113483j = d13Var.m113483j();
        this.f98821b = iM113483j;
        int iM113486m = d13Var.m113486m();
        this.f98822c = iM113486m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f98823d = i5;
        int i6 = i2 + i4;
        this.f98824e = i6;
        int i7 = i3 - i4;
        this.f98826g = i7;
        int i8 = i3 + i4;
        this.f98825f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= iM113483j || i6 >= iM113486m) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* JADX INFO: renamed from: a */
    public final s5d0[] m125410a(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4) {
        float fM184657c = s5d0Var.m184657c();
        float fM184658d = s5d0Var.m184658d();
        float fM184657c2 = s5d0Var2.m184657c();
        float fM184658d2 = s5d0Var2.m184658d();
        float fM184657c3 = s5d0Var3.m184657c();
        float fM184658d3 = s5d0Var3.m184658d();
        float fM184657c4 = s5d0Var4.m184657c();
        float fM184658d4 = s5d0Var4.m184658d();
        return fM184657c < ((float) this.f98822c) / 2.0f ? new s5d0[]{new s5d0(fM184657c4 - 1.0f, fM184658d4 + 1.0f), new s5d0(fM184657c2 + 1.0f, fM184658d2 + 1.0f), new s5d0(fM184657c3 - 1.0f, fM184658d3 - 1.0f), new s5d0(fM184657c + 1.0f, fM184658d - 1.0f)} : new s5d0[]{new s5d0(fM184657c4 + 1.0f, fM184658d4 + 1.0f), new s5d0(fM184657c2 + 1.0f, fM184658d2 - 1.0f), new s5d0(fM184657c3 - 1.0f, fM184658d3 + 1.0f), new s5d0(fM184657c - 1.0f, fM184658d - 1.0f)};
    }

    /* JADX INFO: renamed from: b */
    public final boolean m125411b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f98820a.m113480d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f98820a.m113480d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public s5d0[] m125412c() throws NotFoundException {
        int i = this.f98823d;
        int i2 = this.f98824e;
        int i3 = this.f98826g;
        int i4 = this.f98825f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean zM125411b = true;
            while (true) {
                if ((!zM125411b && z2) || i2 >= this.f98822c) {
                    break;
                }
                zM125411b = m125411b(i3, i4, i2, false);
                if (zM125411b) {
                    i2++;
                    z2 = true;
                    z8 = true;
                } else if (!z2) {
                    i2++;
                }
            }
            if (i2 < this.f98822c) {
                boolean zM125411b2 = true;
                while (true) {
                    if ((!zM125411b2 && z3) || i4 >= this.f98821b) {
                        break;
                    }
                    zM125411b2 = m125411b(i, i2, i4, true);
                    if (zM125411b2) {
                        i4++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i4++;
                    }
                }
                if (i4 < this.f98821b) {
                    boolean zM125411b3 = true;
                    while (true) {
                        if ((!zM125411b3 && z4) || i < 0) {
                            break;
                        }
                        zM125411b3 = m125411b(i3, i4, i, false);
                        if (zM125411b3) {
                            i--;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i--;
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean zM125411b4 = true;
                        while (true) {
                            if ((!zM125411b4 && z6) || i3 < 0) {
                                break;
                            }
                            zM125411b4 = m125411b(i, i2, i3, true);
                            if (zM125411b4) {
                                i3--;
                                z7 = true;
                                z6 = true;
                            } else if (!z6) {
                                i3--;
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z5 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        s5d0 s5d0VarM125413d = null;
        s5d0 s5d0VarM125413d2 = null;
        for (int i6 = 1; s5d0VarM125413d2 == null && i6 < i5; i6++) {
            s5d0VarM125413d2 = m125413d(i, i4 - i6, i + i6, i4);
        }
        if (s5d0VarM125413d2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        s5d0 s5d0VarM125413d3 = null;
        for (int i7 = 1; s5d0VarM125413d3 == null && i7 < i5; i7++) {
            s5d0VarM125413d3 = m125413d(i, i3 + i7, i + i7, i3);
        }
        if (s5d0VarM125413d3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        s5d0 s5d0VarM125413d4 = null;
        for (int i8 = 1; s5d0VarM125413d4 == null && i8 < i5; i8++) {
            s5d0VarM125413d4 = m125413d(i2, i3 + i8, i2 - i8, i3);
        }
        if (s5d0VarM125413d4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i9 = 1; s5d0VarM125413d == null && i9 < i5; i9++) {
            s5d0VarM125413d = m125413d(i2, i4 - i9, i2 - i9, i4);
        }
        if (s5d0VarM125413d != null) {
            return m125410a(s5d0VarM125413d, s5d0VarM125413d2, s5d0VarM125413d4, s5d0VarM125413d3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public final s5d0 m125413d(float f, float f2, float f3, float f4) {
        int iM140045c = ihx.m140045c(ihx.m140043a(f, f2, f3, f4));
        float f5 = iM140045c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iM140045c; i++) {
            float f8 = i;
            int iM140045c2 = ihx.m140045c((f8 * f6) + f);
            int iM140045c3 = ihx.m140045c((f8 * f7) + f2);
            if (this.f98820a.m113480d(iM140045c2, iM140045c3)) {
                return new s5d0(iM140045c2, iM140045c3);
            }
        }
        return null;
    }

    public ffq0(d13 d13Var) throws NotFoundException {
        this(d13Var, 10, d13Var.m113486m() / 2, d13Var.m113483j() / 2);
    }
}
