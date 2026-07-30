package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class b5b0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static a5b0 m102559a(byte[] bArr, int i) {
        ArrayList<a5b0.C15649a> arrayListM102564f;
        ig60 ig60Var = new ig60(bArr);
        try {
            arrayListM102564f = m102561c(ig60Var) ? m102564f(ig60Var) : m102563e(ig60Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListM102564f = null;
        }
        if (arrayListM102564f == null) {
            return null;
        }
        int size = arrayListM102564f.size();
        if (size == 1) {
            return new a5b0(arrayListM102564f.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new a5b0(arrayListM102564f.get(0), arrayListM102564f.get(1), i);
    }

    /* JADX INFO: renamed from: b */
    public static int m102560b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m102561c(ig60 ig60Var) {
        ig60Var.m139809V(4);
        int iM139827q = ig60Var.m139827q();
        ig60Var.m139808U(0);
        return iM139827q == 1886547818;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static a5b0.C15649a m102562d(ig60 ig60Var) {
        int iM139827q = ig60Var.m139827q();
        a5b0.C15649a c15649a = null;
        if (iM139827q > 10000) {
            return null;
        }
        float[] fArr = new float[iM139827q];
        for (int i = 0; i < iM139827q; i++) {
            fArr[i] = ig60Var.m139826p();
        }
        int iM139827q2 = ig60Var.m139827q();
        if (iM139827q2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iM139827q) * 2.0d) / dLog);
        hg60 hg60Var = new hg60(ig60Var.m139815e());
        int i2 = 8;
        hg60Var.m134913p(ig60Var.m139816f() * 8);
        float[] fArr2 = new float[iM139827q2 * 5];
        int[] iArr = new int[5];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iM139827q2) {
            a5b0.C15649a c15649a2 = c15649a;
            int i5 = 0;
            while (i5 < 5) {
                int iM102560b = iArr[i5] + m102560b(hg60Var.m134905h(iCeil));
                if (iM102560b >= iM139827q || iM102560b < 0) {
                    return c15649a2;
                }
                fArr2[i4] = fArr[iM102560b];
                iArr[i5] = iM102560b;
                i5++;
                i4++;
            }
            i3++;
            c15649a = c15649a2;
        }
        a5b0.C15649a c15649a3 = c15649a;
        hg60Var.m134913p((hg60Var.m134902e() + 7) & (-8));
        int i6 = 32;
        int iM134905h = hg60Var.m134905h(32);
        a5b0.C15650b[] c15650bArr = new a5b0.C15650b[iM134905h];
        int i7 = 0;
        while (i7 < iM134905h) {
            int iM134905h2 = hg60Var.m134905h(i2);
            int iM134905h3 = hg60Var.m134905h(i2);
            int iM134905h4 = hg60Var.m134905h(i6);
            if (iM134905h4 > 128000) {
                return c15649a3;
            }
            int i8 = iM134905h;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iM139827q2) * d) / dLog);
            float[] fArr3 = new float[iM134905h4 * 3];
            float[] fArr4 = new float[iM134905h4 * 2];
            int i9 = 0;
            int i10 = 0;
            while (i9 < iM134905h4) {
                int iM102560b2 = i10 + m102560b(hg60Var.m134905h(iCeil2));
                if (iM102560b2 < 0 || iM102560b2 >= iM139827q2) {
                    return c15649a3;
                }
                int i11 = i9 * 3;
                int i12 = iM102560b2 * 5;
                fArr3[i11] = fArr2[i12];
                fArr3[i11 + 1] = fArr2[i12 + 1];
                fArr3[i11 + 2] = fArr2[i12 + 2];
                int i13 = i9 * 2;
                fArr4[i13] = fArr2[i12 + 3];
                fArr4[i13 + 1] = fArr2[i12 + 4];
                i9++;
                i10 = iM102560b2;
            }
            c15650bArr[i7] = new a5b0.C15650b(iM134905h2, fArr3, fArr4, iM134905h3);
            i7++;
            iM134905h = i8;
            i6 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new a5b0.C15649a(c15650bArr);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static ArrayList<a5b0.C15649a> m102563e(ig60 ig60Var) {
        if (ig60Var.m139795H() != 0) {
            return null;
        }
        ig60Var.m139809V(7);
        int iM139827q = ig60Var.m139827q();
        if (iM139827q == 1684433976) {
            ig60 ig60Var2 = new ig60();
            Inflater inflater = new Inflater(true);
            try {
                if (!bmk0.m105179y0(ig60Var, ig60Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                ig60Var = ig60Var2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM139827q != 1918990112) {
            return null;
        }
        return m102565g(ig60Var);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static ArrayList<a5b0.C15649a> m102564f(ig60 ig60Var) {
        int iM139827q;
        ig60Var.m139809V(8);
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        while (iM139816f < iM139817g && (iM139827q = ig60Var.m139827q() + iM139816f) > iM139816f && iM139827q <= iM139817g) {
            int iM139827q2 = ig60Var.m139827q();
            if (iM139827q2 == 2037673328 || iM139827q2 == 1836279920) {
                ig60Var.m139807T(iM139827q);
                return m102563e(ig60Var);
            }
            ig60Var.m139808U(iM139827q);
            iM139816f = iM139827q;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static ArrayList<a5b0.C15649a> m102565g(ig60 ig60Var) {
        ArrayList<a5b0.C15649a> arrayList = new ArrayList<>();
        int iM139816f = ig60Var.m139816f();
        int iM139817g = ig60Var.m139817g();
        while (iM139816f < iM139817g) {
            int iM139827q = ig60Var.m139827q() + iM139816f;
            if (iM139827q <= iM139816f || iM139827q > iM139817g) {
                return null;
            }
            if (ig60Var.m139827q() == 1835365224) {
                a5b0.C15649a c15649aM102562d = m102562d(ig60Var);
                if (c15649aM102562d == null) {
                    return null;
                }
                arrayList.add(c15649aM102562d);
            }
            ig60Var.m139808U(iM139827q);
            iM139816f = iM139827q;
        }
        return arrayList;
    }
}
