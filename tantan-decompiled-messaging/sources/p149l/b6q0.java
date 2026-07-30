package p149l;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class b6q0 {

    /* JADX INFO: renamed from: a */
    public final o03 f73868a;

    /* JADX INFO: renamed from: b */
    public final int f73869b;

    /* JADX INFO: renamed from: c */
    public final int f73870c;

    /* JADX INFO: renamed from: d */
    public final int f73871d;

    /* JADX INFO: renamed from: e */
    public final int f73872e;

    /* JADX INFO: renamed from: f */
    public final int f73873f;

    /* JADX INFO: renamed from: g */
    public final int f73874g;

    public b6q0(o03 o03Var, int i, int i2, int i3) throws NotFoundException {
        this.f73868a = o03Var;
        int iM162113j = o03Var.m162113j();
        this.f73869b = iM162113j;
        int iM162116m = o03Var.m162116m();
        this.f73870c = iM162116m;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f73871d = i5;
        int i6 = i2 + i4;
        this.f73872e = i6;
        int i7 = i3 - i4;
        this.f73874g = i7;
        int i8 = i3 + i4;
        this.f73873f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= iM162113j || i6 >= iM162116m) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* JADX INFO: renamed from: a */
    public final pxc0[] m100469a(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4) {
        float fM171831c = pxc0Var.m171831c();
        float fM171832d = pxc0Var.m171832d();
        float fM171831c2 = pxc0Var2.m171831c();
        float fM171832d2 = pxc0Var2.m171832d();
        float fM171831c3 = pxc0Var3.m171831c();
        float fM171832d3 = pxc0Var3.m171832d();
        float fM171831c4 = pxc0Var4.m171831c();
        float fM171832d4 = pxc0Var4.m171832d();
        return fM171831c < ((float) this.f73870c) / 2.0f ? new pxc0[]{new pxc0(fM171831c4 - 1.0f, fM171832d4 + 1.0f), new pxc0(fM171831c2 + 1.0f, fM171832d2 + 1.0f), new pxc0(fM171831c3 - 1.0f, fM171832d3 - 1.0f), new pxc0(fM171831c + 1.0f, fM171832d - 1.0f)} : new pxc0[]{new pxc0(fM171831c4 + 1.0f, fM171832d4 + 1.0f), new pxc0(fM171831c2 + 1.0f, fM171832d2 - 1.0f), new pxc0(fM171831c3 - 1.0f, fM171832d3 + 1.0f), new pxc0(fM171831c - 1.0f, fM171832d - 1.0f)};
    }

    /* JADX INFO: renamed from: b */
    public final boolean m100470b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f73868a.m162110d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f73868a.m162110d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public pxc0[] m100471c() throws NotFoundException {
        int i = this.f73871d;
        int i2 = this.f73872e;
        int i3 = this.f73874g;
        int i4 = this.f73873f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean zM100470b = true;
            while (true) {
                if ((!zM100470b && z2) || i2 >= this.f73870c) {
                    break;
                }
                zM100470b = m100470b(i3, i4, i2, false);
                if (zM100470b) {
                    i2++;
                    z2 = true;
                    z8 = true;
                } else if (!z2) {
                    i2++;
                }
            }
            if (i2 < this.f73870c) {
                boolean zM100470b2 = true;
                while (true) {
                    if ((!zM100470b2 && z3) || i4 >= this.f73869b) {
                        break;
                    }
                    zM100470b2 = m100470b(i, i2, i4, true);
                    if (zM100470b2) {
                        i4++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i4++;
                    }
                }
                if (i4 < this.f73869b) {
                    boolean zM100470b3 = true;
                    while (true) {
                        if ((!zM100470b3 && z4) || i < 0) {
                            break;
                        }
                        zM100470b3 = m100470b(i3, i4, i, false);
                        if (zM100470b3) {
                            i--;
                            z4 = true;
                            z8 = true;
                        } else if (!z4) {
                            i--;
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean zM100470b4 = true;
                        while (true) {
                            if ((!zM100470b4 && z6) || i3 < 0) {
                                break;
                            }
                            zM100470b4 = m100470b(i, i2, i3, true);
                            if (zM100470b4) {
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
        pxc0 pxc0VarM100472d = null;
        pxc0 pxc0VarM100472d2 = null;
        for (int i6 = 1; pxc0VarM100472d2 == null && i6 < i5; i6++) {
            pxc0VarM100472d2 = m100472d(i, i4 - i6, i + i6, i4);
        }
        if (pxc0VarM100472d2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        pxc0 pxc0VarM100472d3 = null;
        for (int i7 = 1; pxc0VarM100472d3 == null && i7 < i5; i7++) {
            pxc0VarM100472d3 = m100472d(i, i3 + i7, i + i7, i3);
        }
        if (pxc0VarM100472d3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        pxc0 pxc0VarM100472d4 = null;
        for (int i8 = 1; pxc0VarM100472d4 == null && i8 < i5; i8++) {
            pxc0VarM100472d4 = m100472d(i2, i3 + i8, i2 - i8, i3);
        }
        if (pxc0VarM100472d4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i9 = 1; pxc0VarM100472d == null && i9 < i5; i9++) {
            pxc0VarM100472d = m100472d(i2, i4 - i9, i2 - i9, i4);
        }
        if (pxc0VarM100472d != null) {
            return m100469a(pxc0VarM100472d, pxc0VarM100472d2, pxc0VarM100472d4, pxc0VarM100472d3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public final pxc0 m100472d(float f, float f2, float f3, float f4) {
        int iM141164c = jex.m141164c(jex.m141162a(f, f2, f3, f4));
        float f5 = iM141164c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < iM141164c; i++) {
            float f8 = i;
            int iM141164c2 = jex.m141164c((f8 * f6) + f);
            int iM141164c3 = jex.m141164c((f8 * f7) + f2);
            if (this.f73868a.m162110d(iM141164c2, iM141164c3)) {
                return new pxc0(iM141164c2, iM141164c3);
            }
        }
        return null;
    }

    public b6q0(o03 o03Var) throws NotFoundException {
        this(o03Var, 10, o03Var.m162116m() / 2, o03Var.m162113j() / 2);
    }
}
