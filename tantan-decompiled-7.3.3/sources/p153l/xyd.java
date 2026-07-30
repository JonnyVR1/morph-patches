package p153l;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class xyd {

    /* JADX INFO: renamed from: a */
    public final d13 f196739a;

    /* JADX INFO: renamed from: b */
    public t5d0 f196740b;

    public xyd(d13 d13Var) {
        this.f196739a = d13Var;
    }

    /* JADX INFO: renamed from: c */
    public static int m213609c(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, float f) throws NotFoundException {
        int iM140045c = (ihx.m140045c(s5d0.m184655b(s5d0Var, s5d0Var2) / f) + ihx.m140045c(s5d0.m184655b(s5d0Var, s5d0Var3) / f)) / 2;
        int i = iM140045c + 7;
        int i2 = i & 3;
        if (i2 == 0) {
            return iM140045c + 8;
        }
        if (i2 == 2) {
            return iM140045c + 6;
        }
        if (i2 != 3) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public static xw60 m213610d(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3, s5d0 s5d0Var4, int i) {
        float fM184657c;
        float fM184658d;
        float f;
        float f2 = i - 3.5f;
        if (s5d0Var4 != null) {
            fM184657c = s5d0Var4.m184657c();
            fM184658d = s5d0Var4.m184658d();
            f = f2 - 3.0f;
        } else {
            fM184657c = (s5d0Var2.m184657c() - s5d0Var.m184657c()) + s5d0Var3.m184657c();
            fM184658d = (s5d0Var2.m184658d() - s5d0Var.m184658d()) + s5d0Var3.m184658d();
            f = f2;
        }
        return xw60.m213293b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, s5d0Var.m184657c(), s5d0Var.m184658d(), s5d0Var2.m184657c(), s5d0Var2.m184658d(), fM184657c, fM184658d, s5d0Var3.m184657c(), s5d0Var3.m184658d());
    }

    /* JADX INFO: renamed from: h */
    public static d13 m213611h(d13 d13Var, xw60 xw60Var, int i) throws NotFoundException {
        return rdk.m180860b().mo180862d(d13Var, i, i, xw60Var);
    }

    /* JADX INFO: renamed from: a */
    public final float m213612a(s5d0 s5d0Var, s5d0 s5d0Var2, s5d0 s5d0Var3) {
        return (m213613b(s5d0Var, s5d0Var2) + m213613b(s5d0Var, s5d0Var3)) / 2.0f;
    }

    /* JADX INFO: renamed from: b */
    public final float m213613b(s5d0 s5d0Var, s5d0 s5d0Var2) {
        float fM213618j = m213618j((int) s5d0Var.m184657c(), (int) s5d0Var.m184658d(), (int) s5d0Var2.m184657c(), (int) s5d0Var2.m184658d());
        float fM213618j2 = m213618j((int) s5d0Var2.m184657c(), (int) s5d0Var2.m184658d(), (int) s5d0Var.m184657c(), (int) s5d0Var.m184658d());
        if (Float.isNaN(fM213618j)) {
            return fM213618j2 / 7.0f;
        }
        return Float.isNaN(fM213618j2) ? fM213618j / 7.0f : (fM213618j + fM213618j2) / 14.0f;
    }

    /* JADX INFO: renamed from: e */
    public final dzd m213614e(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        t5d0 t5d0Var = map == null ? null : (t5d0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.f196740b = t5d0Var;
        return m213616g(new FinderPatternFinder(this.f196739a, t5d0Var).m17432f(map));
    }

    /* JADX INFO: renamed from: f */
    public final ri0 m213615f(float f, int i, int i2, float f2) throws NotFoundException {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.f196739a.m113486m() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(this.f196739a.m113483j() - 1, i2 + i3) - iMax2;
        if (iMin2 >= f3) {
            return new si0(this.f196739a, iMax, iMax2, iMin, iMin2, f, this.f196740b).m185996c();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: g */
    public final dzd m213616g(koi koiVar) throws NotFoundException, FormatException {
        ri0 ri0VarM213615f;
        ioi ioiVarM150636b = koiVar.m150636b();
        ioi ioiVarM150637c = koiVar.m150637c();
        ioi ioiVarM150635a = koiVar.m150635a();
        float fM213612a = m213612a(ioiVarM150636b, ioiVarM150637c, ioiVarM150635a);
        if (fM213612a < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iM213609c = m213609c(ioiVarM150636b, ioiVarM150637c, ioiVarM150635a, fM213612a);
        o9l0 o9l0VarM166744g = o9l0.m166744g(iM213609c);
        int iM166748e = o9l0VarM166744g.m166748e() - 7;
        if (o9l0VarM166744g.m166747d().length <= 0) {
            ri0VarM213615f = null;
            break;
        }
        float fM184657c = (ioiVarM150637c.m184657c() - ioiVarM150636b.m184657c()) + ioiVarM150635a.m184657c();
        float fM184658d = (ioiVarM150637c.m184658d() - ioiVarM150636b.m184658d()) + ioiVarM150635a.m184658d();
        float f = 1.0f - (3.0f / iM166748e);
        int iM184657c = (int) (ioiVarM150636b.m184657c() + ((fM184657c - ioiVarM150636b.m184657c()) * f));
        int iM184658d = (int) (ioiVarM150636b.m184658d() + (f * (fM184658d - ioiVarM150636b.m184658d())));
        int i = 4;
        while (true) {
            if (i > 16) {
                ri0VarM213615f = null;
                break;
            }
            try {
                ri0VarM213615f = m213615f(fM213612a, iM184657c, iM184658d, i);
                break;
            } catch (NotFoundException unused) {
                i <<= 1;
            }
        }
        return new dzd(m213611h(this.f196739a, m213610d(ioiVarM150636b, ioiVarM150637c, ioiVarM150635a, ri0VarM213615f, iM213609c), iM213609c), ri0VarM213615f == null ? new s5d0[]{ioiVarM150635a, ioiVarM150636b, ioiVarM150637c} : new s5d0[]{ioiVarM150635a, ioiVarM150636b, ioiVarM150637c, ri0VarM213615f});
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final float m213617i(int i, int i2, int i3, int i4) {
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
            if ((i18 == i10 ? i10 : 0) == this.f196739a.m113480d(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return ihx.m140044b(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return ihx.m140044b(i15, i8, i5, i6);
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
            return ihx.m140044b(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: j */
    public final float m213618j(int i, int i2, int i3, int i4) {
        float fM113486m;
        float fM113483j;
        float fM213617i = m213617i(i, i2, i3, i4);
        int iM113486m = i - (i3 - i);
        int iM113483j = 0;
        if (iM113486m < 0) {
            fM113486m = i / (i - iM113486m);
            iM113486m = 0;
        } else if (iM113486m >= this.f196739a.m113486m()) {
            fM113486m = ((this.f196739a.m113486m() - 1) - i) / (iM113486m - i);
            iM113486m = this.f196739a.m113486m() - 1;
        } else {
            fM113486m = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * fM113486m));
        if (i5 < 0) {
            fM113483j = f / (i2 - i5);
        } else if (i5 >= this.f196739a.m113483j()) {
            fM113483j = ((this.f196739a.m113483j() - 1) - i2) / (i5 - i2);
            iM113483j = this.f196739a.m113483j() - 1;
        } else {
            iM113483j = i5;
            fM113483j = 1.0f;
        }
        return (fM213617i + m213617i(i, i2, (int) (i + ((iM113486m - i) * fM113483j)), iM113483j)) - 1.0f;
    }
}
