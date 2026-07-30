package p149l;

import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wi0 {

    /* JADX INFO: renamed from: a */
    public final o03 f186485a;

    /* JADX INFO: renamed from: c */
    public final int f186487c;

    /* JADX INFO: renamed from: d */
    public final int f186488d;

    /* JADX INFO: renamed from: e */
    public final int f186489e;

    /* JADX INFO: renamed from: f */
    public final int f186490f;

    /* JADX INFO: renamed from: g */
    public final float f186491g;

    /* JADX INFO: renamed from: i */
    public final qxc0 f186493i;

    /* JADX INFO: renamed from: b */
    public final List<vi0> f186486b = new ArrayList(5);

    /* JADX INFO: renamed from: h */
    public final int[] f186492h = new int[3];

    public wi0(o03 o03Var, int i, int i2, int i3, int i4, float f, qxc0 qxc0Var) {
        this.f186485a = o03Var;
        this.f186487c = i;
        this.f186488d = i2;
        this.f186489e = i3;
        this.f186490f = i4;
        this.f186491g = f;
        this.f186493i = qxc0Var;
    }

    /* JADX INFO: renamed from: a */
    public static float m203265a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final float m203266b(int i, int i2, int i3, int i4) {
        o03 o03Var = this.f186485a;
        int iM162113j = o03Var.m162113j();
        int[] iArr = this.f186492h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && o03Var.m162110d(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !o03Var.m162110d(i2, i5)) {
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
            while (i8 < iM162113j && o03Var.m162110d(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != iM162113j && iArr[1] <= i3) {
                while (i8 < iM162113j && !o03Var.m162110d(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m203268d(iArr)) {
                    return m203265a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: c */
    public vi0 m203267c() throws NotFoundException {
        vi0 vi0VarM203269e;
        vi0 vi0VarM203269e2;
        int i = this.f186487c;
        int i2 = this.f186490f;
        int i3 = this.f186489e + i;
        int i4 = this.f186488d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f186485a.m162110d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f186485a.m162110d(i7, i6)) {
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
                    if (m203268d(iArr) && (vi0VarM203269e2 = m203269e(iArr, i6, i7)) != null) {
                        return vi0VarM203269e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m203268d(iArr) && (vi0VarM203269e = m203269e(iArr, i6, i3)) != null) {
                return vi0VarM203269e;
            }
        }
        if (this.f186486b.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return this.f186486b.get(0);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m203268d(int[] iArr) {
        float f = this.f186491g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final vi0 m203269e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float fM203265a = m203265a(iArr, i2);
        float fM203266b = m203266b(i, (int) fM203265a, iArr[1] * 2, i3);
        if (Float.isNaN(fM203266b)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (vi0 vi0Var : this.f186486b) {
            if (vi0Var.m198487f(f, fM203266b, fM203265a)) {
                return vi0Var.m198488g(fM203266b, fM203265a, f);
            }
        }
        vi0 vi0Var2 = new vi0(fM203265a, fM203266b, f);
        this.f186486b.add(vi0Var2);
        qxc0 qxc0Var = this.f186493i;
        if (qxc0Var == null) {
            return null;
        }
        qxc0Var.mo176992a(vi0Var2);
        return null;
    }
}
