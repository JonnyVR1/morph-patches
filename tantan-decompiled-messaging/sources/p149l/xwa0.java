package p149l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xwa0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static wwa0 m211317a(byte[] bArr, int i) {
        ArrayList<wwa0.C20983a> arrayListM211322f;
        d860 d860Var = new d860(bArr);
        try {
            arrayListM211322f = m211319c(d860Var) ? m211322f(d860Var) : m211321e(d860Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListM211322f = null;
        }
        if (arrayListM211322f == null) {
            return null;
        }
        int size = arrayListM211322f.size();
        if (size == 1) {
            return new wwa0(arrayListM211322f.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new wwa0(arrayListM211322f.get(0), arrayListM211322f.get(1), i);
    }

    /* JADX INFO: renamed from: b */
    public static int m211318b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m211319c(d860 d860Var) {
        d860Var.m110293V(4);
        int iM110311q = d860Var.m110311q();
        d860Var.m110292U(0);
        return iM110311q == 1886547818;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static wwa0.C20983a m211320d(d860 d860Var) {
        int iM110311q = d860Var.m110311q();
        wwa0.C20983a c20983a = null;
        if (iM110311q > 10000) {
            return null;
        }
        float[] fArr = new float[iM110311q];
        for (int i = 0; i < iM110311q; i++) {
            fArr[i] = d860Var.m110310p();
        }
        int iM110311q2 = d860Var.m110311q();
        if (iM110311q2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iM110311q) * 2.0d) / dLog);
        c860 c860Var = new c860(d860Var.m110299e());
        int i2 = 8;
        c860Var.m105672p(d860Var.m110300f() * 8);
        float[] fArr2 = new float[iM110311q2 * 5];
        int[] iArr = new int[5];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iM110311q2) {
            wwa0.C20983a c20983a2 = c20983a;
            int i5 = 0;
            while (i5 < 5) {
                int iM211318b = iArr[i5] + m211318b(c860Var.m105664h(iCeil));
                if (iM211318b >= iM110311q || iM211318b < 0) {
                    return c20983a2;
                }
                fArr2[i4] = fArr[iM211318b];
                iArr[i5] = iM211318b;
                i5++;
                i4++;
            }
            i3++;
            c20983a = c20983a2;
        }
        wwa0.C20983a c20983a3 = c20983a;
        c860Var.m105672p((c860Var.m105661e() + 7) & (-8));
        int i6 = 32;
        int iM105664h = c860Var.m105664h(32);
        wwa0.C20984b[] c20984bArr = new wwa0.C20984b[iM105664h];
        int i7 = 0;
        while (i7 < iM105664h) {
            int iM105664h2 = c860Var.m105664h(i2);
            int iM105664h3 = c860Var.m105664h(i2);
            int iM105664h4 = c860Var.m105664h(i6);
            if (iM105664h4 > 128000) {
                return c20983a3;
            }
            int i8 = iM105664h;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iM110311q2) * d) / dLog);
            float[] fArr3 = new float[iM105664h4 * 3];
            float[] fArr4 = new float[iM105664h4 * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < iM105664h4) {
                int iM211318b2 = i10 + m211318b(c860Var.m105664h(iCeil2));
                if (iM211318b2 < 0 || iM211318b2 >= iM110311q2) {
                    return c20983a3;
                }
                int i11 = i9 * 3;
                int i12 = iM211318b2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i9 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
                i9++;
                i10 = iM211318b2;
            }
            c20984bArr[i7] = new wwa0.C20984b(iM105664h2, fArr3, fArr4, iM105664h3);
            i7++;
            iM105664h = i8;
            i6 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new wwa0.C20983a(c20984bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static ArrayList<wwa0.C20983a> m211321e(d860 d860Var) {
        if (d860Var.m110279H() != 0) {
            return null;
        }
        d860Var.m110293V(7);
        int iM110311q = d860Var.m110311q();
        if (iM110311q == 1684433976) {
            d860 d860Var2 = new d860();
            Inflater inflater = new Inflater(true);
            try {
                if (!vck0.m197901y0(d860Var, d860Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                d860Var = d860Var2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM110311q != 1918990112) {
            return null;
        }
        return m211323g(d860Var);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static ArrayList<wwa0.C20983a> m211322f(d860 d860Var) {
        int iM110311q;
        d860Var.m110293V(8);
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        while (iM110300f < iM110301g && (iM110311q = d860Var.m110311q() + iM110300f) > iM110300f && iM110311q <= iM110301g) {
            int iM110311q2 = d860Var.m110311q();
            if (iM110311q2 == 2037673328 || iM110311q2 == 1836279920) {
                d860Var.m110291T(iM110311q);
                return m211321e(d860Var);
            }
            d860Var.m110292U(iM110311q);
            iM110300f = iM110311q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static ArrayList<wwa0.C20983a> m211323g(d860 d860Var) {
        ArrayList<wwa0.C20983a> arrayList = new ArrayList<>();
        int iM110300f = d860Var.m110300f();
        int iM110301g = d860Var.m110301g();
        while (iM110300f < iM110301g) {
            int iM110311q = d860Var.m110311q() + iM110300f;
            if (iM110311q <= iM110300f || iM110311q > iM110301g) {
                return null;
            }
            if (d860Var.m110311q() == 1835365224) {
                wwa0.C20983a c20983aM211320d = m211320d(d860Var);
                if (c20983aM211320d == null) {
                    return null;
                }
                arrayList.add(c20983aM211320d);
            }
            d860Var.m110292U(iM110311q);
            iM110300f = iM110311q;
        }
        return arrayList;
    }
}
