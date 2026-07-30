package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qac0 extends AbstractC21038x7 {

    /* JADX INFO: renamed from: i */
    public static final int[] f153524i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j */
    public static final int[] f153525j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k */
    public static final int[] f153526k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l */
    public static final int[] f153527l = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: m */
    public static final int[] f153528m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n */
    public static final int[] f153529n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o */
    public static final int[][] f153530o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g */
    public final List<h760> f153531g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<h760> f153532h = new ArrayList();

    /* JADX INFO: renamed from: q */
    public static void m173718q(Collection<h760> collection, h760 h760Var) {
        if (h760Var == null) {
            return;
        }
        for (h760 h760Var2 : collection) {
            if (h760Var2.m134324b() == h760Var.m134324b()) {
                h760Var2.m129623e();
                return;
            }
        }
        collection.add(h760Var);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m173719s(h760 h760Var, h760 h760Var2) {
        int iM134323a = (h760Var.m134323a() + (h760Var2.m134323a() * 16)) % 79;
        int iM160057c = (h760Var.m129622d().m160057c() * 9) + h760Var2.m129622d().m160057c();
        if (iM160057c > 72) {
            iM160057c--;
        }
        if (iM160057c > 8) {
            iM160057c--;
        }
        return iM134323a == iM160057c;
    }

    /* JADX INFO: renamed from: t */
    public static oxc0 m173720t(h760 h760Var, h760 h760Var2) {
        String strValueOf = String.valueOf((((long) h760Var.m134324b()) * 4537077) + ((long) h760Var2.m134324b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(strValueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int iCharAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                iCharAt *= 3;
            }
            i += iCharAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        pxc0[] pxc0VarArrM160055a = h760Var.m129622d().m160055a();
        pxc0[] pxc0VarArrM160055a2 = h760Var2.m129622d().m160055a();
        return new oxc0(sb.toString(), null, new pxc0[]{pxc0VarArrM160055a[0], pxc0VarArrM160055a[1], pxc0VarArrM160055a2[0], pxc0VarArrM160055a2[1]}, BarcodeFormat.RSS_14);
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        m173718q(this.f153531g, m173723v(m03Var, false, i, map));
        m03Var.m152497q();
        m173718q(this.f153532h, m173723v(m03Var, true, i, map));
        m03Var.m152497q();
        for (h760 h760Var : this.f153531g) {
            if (h760Var.m129621c() > 1) {
                for (h760 h760Var2 : this.f153532h) {
                    if (h760Var2.m129621c() > 1 && m173719s(h760Var, h760Var2)) {
                        return m173720t(h760Var, h760Var2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r6 r7
      0x0025: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x009c  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00af  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final void m173721r(boolean z, int i) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iM141165d = jex.m141165d(m207228l());
        int iM141165d2 = jex.m141165d(m207226j());
        boolean z6 = true;
        if (z) {
            if (iM141165d > 12) {
                z3 = true;
                z2 = false;
            } else if (iM141165d < 4) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iM141165d2 > 12) {
                z5 = true;
                z4 = false;
            } else if (iM141165d2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        } else {
            if (iM141165d > 11) {
                z3 = true;
                z2 = false;
            } else if (iM141165d < 5) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iM141165d2 > 10) {
                z5 = true;
                z4 = false;
            } else if (iM141165d2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        }
        int i2 = (iM141165d + iM141165d2) - i;
        boolean z7 = (iM141165d & 1) == z;
        boolean z8 = (iM141165d2 & 1) == 1;
        if (i2 != 1) {
            if (i2 == -1) {
                if (z7) {
                    if (z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z4 = true;
                }
            } else {
                if (i2 != 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z7) {
                    if (!z8) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (iM141165d < iM141165d2) {
                        z5 = true;
                    } else {
                        z4 = true;
                        z3 = true;
                    }
                } else if (z8) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z6) {
                if (!z3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC21038x7.m207221n(m207228l(), m207229m());
            }
            if (z3) {
                AbstractC21038x7.m207220g(m207228l(), m207229m());
            }
            if (z4) {
                if (!z5) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC21038x7.m207221n(m207226j(), m207229m());
            }
            if (z5) {
                AbstractC21038x7.m207220g(m207226j(), m207227k());
            }
        }
        if (z7) {
            if (z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            z3 = true;
        } else {
            if (!z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            z5 = true;
        }
        z6 = z2;
        if (z6) {
            if (!z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC21038x7.m207221n(m207228l(), m207229m());
        }
        if (z3) {
            AbstractC21038x7.m207220g(m207228l(), m207229m());
        }
        if (z4) {
            if (!z5) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC21038x7.m207221n(m207226j(), m207229m());
        }
        if (z5) {
            AbstractC21038x7.m207220g(m207226j(), m207227k());
        }
    }

    @Override // p149l.mh50, p149l.ydc0
    public void reset() {
        this.f153531g.clear();
        this.f153532h.clear();
    }

    /* JADX INFO: renamed from: u */
    public final i4c m173722u(m03 m03Var, nli nliVar, boolean z) throws NotFoundException {
        int[] iArrM207224h = m207224h();
        for (int i = 0; i < iArrM207224h.length; i++) {
            iArrM207224h[i] = 0;
        }
        if (z) {
            mh50.m154611f(m03Var, nliVar.m160056b()[0], iArrM207224h);
        } else {
            mh50.m154610e(m03Var, nliVar.m160056b()[1] + 1, iArrM207224h);
            int i2 = 0;
            for (int length = iArrM207224h.length - 1; i2 < length; length--) {
                int i3 = iArrM207224h[i2];
                iArrM207224h[i2] = iArrM207224h[length];
                iArrM207224h[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fM141165d = jex.m141165d(iArrM207224h) / i4;
        int[] iArrM207228l = m207228l();
        int[] iArrM207226j = m207226j();
        float[] fArrM207229m = m207229m();
        float[] fArrM207227k = m207227k();
        for (int i5 = 0; i5 < iArrM207224h.length; i5++) {
            float f = iArrM207224h[i5] / fM141165d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArrM207228l[i7] = i6;
                fArrM207229m[i7] = f - i6;
            } else {
                iArrM207226j[i7] = i6;
                fArrM207227k[i7] = f - i6;
            }
        }
        m173721r(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = iArrM207228l.length - 1; length2 >= 0; length2--) {
            int i10 = iArrM207228l[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = iArrM207226j.length - 1; length3 >= 0; length3--) {
            int i13 = iArrM207226j[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (!z) {
            if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i15 = (10 - i12) / 2;
            int i16 = f153529n[i15];
            return new i4c((sac0.m182908b(iArrM207226j, 9 - i16, false) * f153525j[i15]) + sac0.m182908b(iArrM207228l, i16, true) + f153527l[i15], i14);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i17 = (12 - i9) / 2;
        int i18 = f153528m[i17];
        return new i4c((sac0.m182908b(iArrM207228l, i18, false) * f153524i[i17]) + sac0.m182908b(iArrM207226j, 9 - i18, true) + f153526k[i17], i14);
    }

    /* JADX INFO: renamed from: v */
    public final h760 m173723v(m03 m03Var, boolean z, int i, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrM173724w = m173724w(m03Var, z);
            nli nliVarM173725x = m173725x(m03Var, i, z, iArrM173724w);
            qxc0 qxc0Var = map == null ? null : (qxc0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (qxc0Var != null) {
                float fM152494m = (iArrM173724w[0] + iArrM173724w[1]) / 2.0f;
                if (z) {
                    fM152494m = (m03Var.m152494m() - 1) - fM152494m;
                }
                qxc0Var.mo176992a(new pxc0(fM152494m, i));
            }
            i4c i4cVarM173722u = m173722u(m03Var, nliVarM173725x, true);
            i4c i4cVarM173722u2 = m173722u(m03Var, nliVarM173725x, false);
            return new h760((i4cVarM173722u.m134324b() * 1597) + i4cVarM173722u2.m134324b(), i4cVarM173722u.m134323a() + (i4cVarM173722u2.m134323a() * 4), nliVarM173725x);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final int[] m173724w(m03 m03Var, boolean z) throws NotFoundException {
        int[] iArrM207225i = m207225i();
        iArrM207225i[0] = 0;
        iArrM207225i[1] = 0;
        iArrM207225i[2] = 0;
        iArrM207225i[3] = 0;
        int iM152494m = m03Var.m152494m();
        int i = 0;
        boolean z2 = false;
        while (i < iM152494m) {
            z2 = !m03Var.m152490f(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < iM152494m) {
            if (m03Var.m152490f(i) != z2) {
                iArrM207225i[i2] = iArrM207225i[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else {
                    if (AbstractC21038x7.m207222o(iArrM207225i)) {
                        return new int[]{i3, i};
                    }
                    i3 += iArrM207225i[0] + iArrM207225i[1];
                    iArrM207225i[0] = iArrM207225i[2];
                    iArrM207225i[1] = iArrM207225i[3];
                    iArrM207225i[2] = 0;
                    iArrM207225i[3] = 0;
                    i2--;
                }
                iArrM207225i[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: x */
    public final nli m173725x(m03 m03Var, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        boolean zM152490f = m03Var.m152490f(iArr[0]);
        int i3 = iArr[0] - 1;
        while (i3 >= 0 && zM152490f != m03Var.m152490f(i3)) {
            i3--;
        }
        int i4 = i3 + 1;
        int i5 = iArr[0] - i4;
        int[] iArrM207225i = m207225i();
        System.arraycopy(iArrM207225i, 0, iArrM207225i, 1, iArrM207225i.length - 1);
        iArrM207225i[0] = i5;
        int iM207223p = AbstractC21038x7.m207223p(iArrM207225i, f153530o);
        int iM152494m = iArr[1];
        if (z) {
            int iM152494m2 = (m03Var.m152494m() - 1) - i4;
            iM152494m = (m03Var.m152494m() - 1) - iM152494m;
            i2 = iM152494m2;
        } else {
            i2 = i4;
        }
        return new nli(iM207223p, new int[]{i4, iArr[1]}, i2, iM152494m, i);
    }
}
