package p153l;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class si0 {

    /* JADX INFO: renamed from: a */
    public final d13 f168774a;

    /* JADX INFO: renamed from: c */
    public final int f168776c;

    /* JADX INFO: renamed from: d */
    public final int f168777d;

    /* JADX INFO: renamed from: e */
    public final int f168778e;

    /* JADX INFO: renamed from: f */
    public final int f168779f;

    /* JADX INFO: renamed from: g */
    public final float f168780g;

    /* JADX INFO: renamed from: i */
    public final t5d0 f168782i;

    /* JADX INFO: renamed from: b */
    public final List<ri0> f168775b = new ArrayList(5);

    /* JADX INFO: renamed from: h */
    public final int[] f168781h = new int[3];

    public si0(d13 d13Var, int i, int i2, int i3, int i4, float f, t5d0 t5d0Var) {
        this.f168774a = d13Var;
        this.f168776c = i;
        this.f168777d = i2;
        this.f168778e = i3;
        this.f168779f = i4;
        this.f168780g = f;
        this.f168782i = t5d0Var;
    }

    /* JADX INFO: renamed from: a */
    public static float m185994a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final float m185995b(int i, int i2, int i3, int i4) {
        d13 d13Var = this.f168774a;
        int iM113483j = d13Var.m113483j();
        int[] iArr = this.f168781h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && d13Var.m113480d(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !d13Var.m113480d(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < iM113483j && d13Var.m113480d(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != iM113483j && iArr[1] <= i3) {
                while (i8 < iM113483j && !d13Var.m113480d(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m185997d(iArr)) {
                    return m185994a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: c */
    public ri0 m185996c() throws NotFoundException {
        ri0 ri0VarM185998e;
        ri0 ri0VarM185998e2;
        int i = this.f168776c;
        int i2 = this.f168779f;
        int i3 = this.f168778e + i;
        int i4 = this.f168777d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f168774a.m113480d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f168774a.m113480d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else {
                    if (m185997d(iArr) && (ri0VarM185998e2 = m185998e(iArr, i6, i7)) != null) {
                        return ri0VarM185998e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m185997d(iArr) && (ri0VarM185998e = m185998e(iArr, i6, i3)) != null) {
                return ri0VarM185998e;
            }
        }
        if (this.f168775b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.f168775b.get(0);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m185997d(int[] iArr) {
        float f = this.f168780g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final ri0 m185998e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float fM185994a = m185994a(iArr, i2);
        float fM185995b = m185995b(i, (int) fM185994a, iArr[1] * 2, i3);
        if (Float.isNaN(fM185995b)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (ri0 ri0Var : this.f168775b) {
            if (ri0Var.m181569f(f, fM185995b, fM185994a)) {
                return ri0Var.m181570g(fM185995b, fM185994a, f);
            }
        }
        ri0 ri0Var2 = new ri0(fM185994a, fM185995b, f);
        this.f168775b.add(ri0Var2);
        t5d0 t5d0Var = this.f168782i;
        if (t5d0Var == null) {
            return null;
        }
        t5d0Var.mo189379a(ri0Var2);
        return null;
    }
}
