package p149l;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class jxd {

    /* JADX INFO: renamed from: a */
    public final o03 f120217a;

    /* JADX INFO: renamed from: b */
    public qxc0 f120218b;

    public jxd(o03 o03Var) {
        this.f120217a = o03Var;
    }

    /* JADX INFO: renamed from: c */
    public static int m143773c(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, float f) throws NotFoundException {
        int iM141164c = (jex.m141164c(pxc0.m171829b(pxc0Var, pxc0Var2) / f) + jex.m141164c(pxc0.m171829b(pxc0Var, pxc0Var3) / f)) / 2;
        int i = iM141164c + 7;
        int i2 = i & 3;
        if (i2 == 0) {
            return iM141164c + 8;
        }
        if (i2 == 2) {
            return iM141164c + 6;
        }
        if (i2 != 3) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public static ro60 m143774d(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3, pxc0 pxc0Var4, int i) {
        float fM171831c;
        float fM171832d;
        float f;
        float f2 = i - 3.5f;
        if (pxc0Var4 != null) {
            fM171831c = pxc0Var4.m171831c();
            fM171832d = pxc0Var4.m171832d();
            f = f2 - 3.0f;
        } else {
            fM171831c = (pxc0Var2.m171831c() - pxc0Var.m171831c()) + pxc0Var3.m171831c();
            fM171832d = (pxc0Var2.m171832d() - pxc0Var.m171832d()) + pxc0Var3.m171832d();
            f = f2;
        }
        return ro60.m180234b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, pxc0Var.m171831c(), pxc0Var.m171832d(), pxc0Var2.m171831c(), pxc0Var2.m171832d(), fM171831c, fM171832d, pxc0Var3.m171831c(), pxc0Var3.m171832d());
    }

    /* JADX INFO: renamed from: h */
    public static o03 m143775h(o03 o03Var, ro60 ro60Var, int i) throws NotFoundException {
        return bbk.m100979b().mo100981d(o03Var, i, i, ro60Var);
    }

    /* JADX INFO: renamed from: a */
    public final float m143776a(pxc0 pxc0Var, pxc0 pxc0Var2, pxc0 pxc0Var3) {
        return (m143777b(pxc0Var, pxc0Var2) + m143777b(pxc0Var, pxc0Var3)) / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m143777b(pxc0 pxc0Var, pxc0 pxc0Var2) {
        float fM143782j = m143782j((int) pxc0Var.m171831c(), (int) pxc0Var.m171832d(), (int) pxc0Var2.m171831c(), (int) pxc0Var2.m171832d());
        float fM143782j2 = m143782j((int) pxc0Var2.m171831c(), (int) pxc0Var2.m171832d(), (int) pxc0Var.m171831c(), (int) pxc0Var.m171832d());
        if (Float.isNaN(fM143782j)) {
            return fM143782j2 / 7.0f;
        }
        return Float.isNaN(fM143782j2) ? fM143782j / 7.0f : (fM143782j + fM143782j2) / 14.0f;
    }

    /* JADX INFO: renamed from: e */
    public final pxd m143778e(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        qxc0 qxc0Var = map == null ? null : (qxc0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f120218b = qxc0Var;
        return m143780g(new FinderPatternFinder(this.f120217a, qxc0Var).m17377f(map));
    }

    /* JADX INFO: renamed from: f */
    public final vi0 m143779f(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.f120217a.m162116m() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(this.f120217a.m162113j() - 1, i2 + i3) - iMax2;
        if (iMin2 >= f3) {
            return new wi0(this.f120217a, iMax, iMax2, iMin, iMin2, f, this.f120218b).m203267c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: g */
    public final pxd m143780g(oli oliVar) throws NotFoundException, FormatException {
        vi0 vi0VarM143779f;
        mli mliVarM164932b = oliVar.m164932b();
        mli mliVarM164933c = oliVar.m164933c();
        mli mliVarM164931a = oliVar.m164931a();
        float fM143776a = m143776a(mliVarM164932b, mliVarM164933c, mliVarM164931a);
        if (fM143776a < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iM143773c = m143773c(mliVarM164932b, mliVarM164933c, mliVarM164931a, fM143776a);
        j0l0 j0l0VarM139168g = j0l0.m139168g(iM143773c);
        int iM139172e = j0l0VarM139168g.m139172e() - 7;
        if (j0l0VarM139168g.m139171d().length <= 0) {
            vi0VarM143779f = null;
            break;
        }
        float fM171831c = (mliVarM164933c.m171831c() - mliVarM164932b.m171831c()) + mliVarM164931a.m171831c();
        float fM171832d = (mliVarM164933c.m171832d() - mliVarM164932b.m171832d()) + mliVarM164931a.m171832d();
        float f = 1.0f - (3.0f / iM139172e);
        int iM171831c = (int) (mliVarM164932b.m171831c() + ((fM171831c - mliVarM164932b.m171831c()) * f));
        int iM171832d = (int) (mliVarM164932b.m171832d() + (f * (fM171832d - mliVarM164932b.m171832d())));
        int i = 4;
        while (true) {
            if (i > 16) {
                vi0VarM143779f = null;
                break;
            }
            try {
                vi0VarM143779f = m143779f(fM143776a, iM171831c, iM171832d, i);
                break;
            } catch (NotFoundException unused) {
                i <<= 1;
            }
        }
        return new pxd(m143775h(this.f120217a, m143774d(mliVarM164932b, mliVarM164933c, mliVarM164931a, vi0VarM143779f, iM143773c), iM143773c), vi0VarM143779f == null ? new pxc0[]{mliVarM164931a, mliVarM164932b, mliVarM164933c} : new pxc0[]{mliVarM164931a, mliVarM164932b, mliVarM164933c, vi0VarM143779f});
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final float m143781i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-iAbs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (i16 != i15) {
            boolean z2 = z;
            if ((i18 == i10 ? i10 : 0) == this.f120217a.m162110d(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return jex.m141163b(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return jex.m141163b(i15, i8, i5, i6);
                    }
                    return Float.NaN;
                }
                i17 += i14;
                i12 -= iAbs;
            }
            i16 += i13;
            iAbs = iAbs;
            z = z2;
            i10 = 1;
            i11 = 2;
        }
        i9 = i11;
        if (i18 == i9) {
            return jex.m141163b(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: j */
    public final float m143782j(int i, int i2, int i3, int i4) {
        float fM162116m;
        float fM162113j;
        float fM143781i = m143781i(i, i2, i3, i4);
        int iM162116m = i - (i3 - i);
        int iM162113j = 0;
        if (iM162116m < 0) {
            fM162116m = i / (i - iM162116m);
            iM162116m = 0;
        } else if (iM162116m >= this.f120217a.m162116m()) {
            fM162116m = ((this.f120217a.m162116m() - 1) - i) / (iM162116m - i);
            iM162116m = this.f120217a.m162116m() - 1;
        } else {
            fM162116m = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * fM162116m));
        if (i5 < 0) {
            fM162113j = f / (i2 - i5);
        } else if (i5 >= this.f120217a.m162113j()) {
            fM162113j = ((this.f120217a.m162113j() - 1) - i2) / (i5 - i2);
            iM162113j = this.f120217a.m162113j() - 1;
        } else {
            iM162113j = i5;
            fM162113j = 1.0f;
        }
        return (fM143781i + m143781i(i, i2, (int) (i + ((iM162116m - i) * fM162113j)), iM162113j)) - 1.0f;
    }
}
