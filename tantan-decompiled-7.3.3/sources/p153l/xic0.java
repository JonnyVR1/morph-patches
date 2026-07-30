package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class xic0 extends AbstractC19998s7 {

    /* JADX INFO: renamed from: i */
    public static final int[] f194451i = {1, 10, 34, 70, 126};

    /* JADX INFO: renamed from: j */
    public static final int[] f194452j = {4, 20, 48, 81};

    /* JADX INFO: renamed from: k */
    public static final int[] f194453k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l */
    public static final int[] f194454l = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: m */
    public static final int[] f194455m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n */
    public static final int[] f194456n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o */
    public static final int[][] f194457o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g */
    public final List<nf60> f194458g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final List<nf60> f194459h = new ArrayList();

    /* JADX INFO: renamed from: q */
    public static void m211132q(Collection<nf60> collection, nf60 nf60Var) {
        if (nf60Var == null) {
            return;
        }
        for (nf60 nf60Var2 : collection) {
            if (nf60Var2.m175348b() == nf60Var.m175348b()) {
                nf60Var2.m162921e();
                return;
            }
        }
        collection.add(nf60Var);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m211133s(nf60 nf60Var, nf60 nf60Var2) {
        int iM175347a = (nf60Var.m175347a() + (nf60Var2.m175347a() * 16)) % 79;
        int iM146462c = (nf60Var.m162920d().m146462c() * 9) + nf60Var2.m162920d().m146462c();
        if (iM146462c > 72) {
            iM146462c--;
        }
        if (iM146462c > 8) {
            iM146462c--;
        }
        return iM175347a == iM146462c;
    }

    /* JADX INFO: renamed from: t */
    public static r5d0 m211134t(nf60 nf60Var, nf60 nf60Var2) {
        String strValueOf = String.valueOf((((long) nf60Var.m175348b()) * 4537077) + ((long) nf60Var2.m175348b()));
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
        s5d0[] s5d0VarArrM146460a = nf60Var.m162920d().m146460a();
        s5d0[] s5d0VarArrM146460a2 = nf60Var2.m162920d().m146460a();
        return new r5d0(sb.toString(), null, new s5d0[]{s5d0VarArrM146460a[0], s5d0VarArrM146460a[1], s5d0VarArrM146460a2[0], s5d0VarArrM146460a2[1]}, BarcodeFormat.RSS_14);
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        m211132q(this.f194458g, m211137v(b13Var, false, i, map));
        b13Var.m101405q();
        m211132q(this.f194459h, m211137v(b13Var, true, i, map));
        b13Var.m101405q();
        for (nf60 nf60Var : this.f194458g) {
            if (nf60Var.m162919c() > 1) {
                for (nf60 nf60Var2 : this.f194459h) {
                    if (nf60Var2.m162919c() > 1 && m211133s(nf60Var, nf60Var2)) {
                        return m211134t(nf60Var, nf60Var2);
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
    public final void m211135r(boolean z, int i) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iM140046d = ihx.m140046d(m184938l());
        int iM140046d2 = ihx.m140046d(m184936j());
        boolean z6 = true;
        if (z) {
            if (iM140046d > 12) {
                z3 = true;
                z2 = false;
            } else if (iM140046d < 4) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iM140046d2 > 12) {
                z5 = true;
                z4 = false;
            } else if (iM140046d2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        } else {
            if (iM140046d > 11) {
                z3 = true;
                z2 = false;
            } else if (iM140046d < 5) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (iM140046d2 > 10) {
                z5 = true;
                z4 = false;
            } else if (iM140046d2 < 4) {
                z4 = true;
                z5 = false;
            } else {
                z4 = false;
                z5 = false;
            }
        }
        int i2 = (iM140046d + iM140046d2) - i;
        boolean z7 = (iM140046d & 1) == z;
        boolean z8 = (iM140046d2 & 1) == 1;
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
                    if (iM140046d < iM140046d2) {
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
                AbstractC19998s7.m184931n(m184938l(), m184939m());
            }
            if (z3) {
                AbstractC19998s7.m184930g(m184938l(), m184939m());
            }
            if (z4) {
                if (!z5) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC19998s7.m184931n(m184936j(), m184939m());
            }
            if (z5) {
                AbstractC19998s7.m184930g(m184936j(), m184937k());
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
            AbstractC19998s7.m184931n(m184938l(), m184939m());
        }
        if (z3) {
            AbstractC19998s7.m184930g(m184938l(), m184939m());
        }
        if (z4) {
            if (!z5) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC19998s7.m184931n(m184936j(), m184939m());
        }
        if (z5) {
            AbstractC19998s7.m184930g(m184936j(), m184937k());
        }
    }

    @Override // p153l.sp50, p153l.fmc0
    public void reset() {
        this.f194458g.clear();
        this.f194459h.clear();
    }

    /* JADX INFO: renamed from: u */
    public final q5c m211136u(b13 b13Var, joi joiVar, boolean z) throws NotFoundException {
        int[] iArrM184934h = m184934h();
        for (int i = 0; i < iArrM184934h.length; i++) {
            iArrM184934h[i] = 0;
        }
        if (z) {
            sp50.m187326f(b13Var, joiVar.m146461b()[0], iArrM184934h);
        } else {
            sp50.m187325e(b13Var, joiVar.m146461b()[1] + 1, iArrM184934h);
            int i2 = 0;
            for (int length = iArrM184934h.length - 1; i2 < length; length--) {
                int i3 = iArrM184934h[i2];
                iArrM184934h[i2] = iArrM184934h[length];
                iArrM184934h[length] = i3;
                i2++;
            }
        }
        int i4 = z ? 16 : 15;
        float fM140046d = ihx.m140046d(iArrM184934h) / i4;
        int[] iArrM184938l = m184938l();
        int[] iArrM184936j = m184936j();
        float[] fArrM184939m = m184939m();
        float[] fArrM184937k = m184937k();
        for (int i5 = 0; i5 < iArrM184934h.length; i5++) {
            float f = iArrM184934h[i5] / fM140046d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArrM184938l[i7] = i6;
                fArrM184939m[i7] = f - i6;
            } else {
                iArrM184936j[i7] = i6;
                fArrM184937k[i7] = f - i6;
            }
        }
        m211135r(z, i4);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = iArrM184938l.length - 1; length2 >= 0; length2--) {
            int i10 = iArrM184938l[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = iArrM184936j.length - 1; length3 >= 0; length3--) {
            int i13 = iArrM184936j[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (!z) {
            if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i15 = (10 - i12) / 2;
            int i16 = f194456n[i15];
            return new q5c((zic0.m219727b(iArrM184936j, 9 - i16, false) * f194452j[i15]) + zic0.m219727b(iArrM184938l, i16, true) + f194454l[i15], i14);
        }
        if ((i9 & 1) != 0 || i9 > 12 || i9 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i17 = (12 - i9) / 2;
        int i18 = f194455m[i17];
        return new q5c((zic0.m219727b(iArrM184938l, i18, false) * f194451i[i17]) + zic0.m219727b(iArrM184936j, 9 - i18, true) + f194453k[i17], i14);
    }

    /* JADX INFO: renamed from: v */
    public final nf60 m211137v(b13 b13Var, boolean z, int i, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrM211138w = m211138w(b13Var, z);
            joi joiVarM211139x = m211139x(b13Var, i, z, iArrM211138w);
            t5d0 t5d0Var = map == null ? null : (t5d0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (t5d0Var != null) {
                float fM101402m = (iArrM211138w[0] + iArrM211138w[1]) / 2.0f;
                if (z) {
                    fM101402m = (b13Var.m101402m() - 1) - fM101402m;
                }
                t5d0Var.mo189379a(new s5d0(fM101402m, i));
            }
            q5c q5cVarM211136u = m211136u(b13Var, joiVarM211139x, true);
            q5c q5cVarM211136u2 = m211136u(b13Var, joiVarM211139x, false);
            return new nf60((q5cVarM211136u.m175348b() * 1597) + q5cVarM211136u2.m175348b(), q5cVarM211136u.m175347a() + (q5cVarM211136u2.m175347a() * 4), joiVarM211139x);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final int[] m211138w(b13 b13Var, boolean z) throws NotFoundException {
        int[] iArrM184935i = m184935i();
        iArrM184935i[0] = 0;
        iArrM184935i[1] = 0;
        iArrM184935i[2] = 0;
        iArrM184935i[3] = 0;
        int iM101402m = b13Var.m101402m();
        int i = 0;
        boolean z2 = false;
        while (i < iM101402m) {
            z2 = !b13Var.m101398f(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < iM101402m) {
            if (b13Var.m101398f(i) != z2) {
                iArrM184935i[i2] = iArrM184935i[i2] + 1;
            } else {
                if (i2 != 3) {
                    i2++;
                } else {
                    if (AbstractC19998s7.m184932o(iArrM184935i)) {
                        return new int[]{i3, i};
                    }
                    i3 += iArrM184935i[0] + iArrM184935i[1];
                    iArrM184935i[0] = iArrM184935i[2];
                    iArrM184935i[1] = iArrM184935i[3];
                    iArrM184935i[2] = 0;
                    iArrM184935i[3] = 0;
                    i2--;
                }
                iArrM184935i[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: x */
    public final joi m211139x(b13 b13Var, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        boolean zM101398f = b13Var.m101398f(iArr[0]);
        int i3 = iArr[0] - 1;
        while (i3 >= 0 && zM101398f != b13Var.m101398f(i3)) {
            i3--;
        }
        int i4 = i3 + 1;
        int i5 = iArr[0] - i4;
        int[] iArrM184935i = m184935i();
        System.arraycopy(iArrM184935i, 0, iArrM184935i, 1, iArrM184935i.length - 1);
        iArrM184935i[0] = i5;
        int iM184933p = AbstractC19998s7.m184933p(iArrM184935i, f194457o);
        int iM101402m = iArr[1];
        if (z) {
            int iM101402m2 = (b13Var.m101402m() - 1) - i4;
            iM101402m = (b13Var.m101402m() - 1) - iM101402m;
            i2 = iM101402m2;
        } else {
            i2 = i4;
        }
        return new joi(iM184933p, new int[]{i4, iArr[1]}, i2, iM101402m, i);
    }
}
