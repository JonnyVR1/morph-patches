package p149l;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ixd {

    /* JADX INFO: renamed from: a */
    public static final int[] f115352a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b */
    public static final int[] f115353b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c */
    public static final int[] f115354c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d */
    public static final int[] f115355d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* JADX INFO: renamed from: a */
    public static void m138808a(pxc0[] pxc0VarArr, pxc0[] pxc0VarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            pxc0VarArr[iArr[i]] = pxc0VarArr2[i];
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<pxc0[]> m138809b(boolean z, o03 o03Var) {
        int iM171831c;
        float fM171832d;
        ArrayList<pxc0[]> arrayList = new ArrayList();
        int iMax = 0;
        int i = 0;
        loop0: while (true) {
            int i2 = i;
            while (iMax < o03Var.m162113j()) {
                pxc0[] pxc0VarArrM138813f = m138813f(o03Var, iMax, i);
                if (pxc0VarArrM138813f[0] == null && pxc0VarArrM138813f[3] == null) {
                    if (i2 == 0) {
                        break;
                    }
                    for (pxc0[] pxc0VarArr : arrayList) {
                        pxc0 pxc0Var = pxc0VarArr[1];
                        if (pxc0Var != null) {
                            iMax = (int) Math.max(iMax, pxc0Var.m171832d());
                        }
                        pxc0 pxc0Var2 = pxc0VarArr[3];
                        if (pxc0Var2 != null) {
                            iMax = Math.max(iMax, (int) pxc0Var2.m171832d());
                        }
                    }
                    iMax += 5;
                    i = 0;
                } else {
                    arrayList.add(pxc0VarArrM138813f);
                    if (!z) {
                        break loop0;
                    }
                    pxc0 pxc0Var3 = pxc0VarArrM138813f[2];
                    if (pxc0Var3 != null) {
                        iM171831c = (int) pxc0Var3.m171831c();
                        fM171832d = pxc0VarArrM138813f[2].m171832d();
                    } else {
                        iM171831c = (int) pxc0VarArrM138813f[4].m171831c();
                        fM171832d = pxc0VarArrM138813f[4].m171832d();
                    }
                    iMax = (int) fM171832d;
                    i = iM171831c;
                    i2 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static s060 m138810c(nx2 nx2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        o03 o03VarM161925a = nx2Var.m161925a();
        List<pxc0[]> listM138809b = m138809b(z, o03VarM161925a);
        if (listM138809b.isEmpty()) {
            o03VarM161925a = o03VarM161925a.clone();
            o03VarM161925a.m162117n();
            listM138809b = m138809b(z, o03VarM161925a);
        }
        return new s060(o03VarM161925a, listM138809b);
    }

    /* JADX INFO: renamed from: d */
    public static int[] m138811d(o03 o03Var, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (o03Var.m162110d(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (o03Var.m162110d(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (m138814g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m138814g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* JADX INFO: renamed from: e */
    public static pxc0[] m138812e(o03 o03Var, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int[] iArr2;
        pxc0[] pxc0VarArr = new pxc0[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                i5 = i6;
                z = false;
                break;
            }
            int[] iArrM138811d = m138811d(o03Var, i4, i6, i2, false, iArr3, iArr4);
            if (iArrM138811d != null) {
                do {
                    i5 = i6;
                    iArr2 = iArrM138811d;
                    if (i5 <= 0) {
                        break;
                    }
                    i6 = i5 - 1;
                    iArrM138811d = m138811d(o03Var, i4, i6, i2, false, iArr, iArr4);
                } while (iArrM138811d != null);
                float f = i5;
                pxc0VarArr[0] = new pxc0(iArr2[0], f);
                pxc0VarArr[1] = new pxc0(iArr2[1], f);
                z = true;
                break;
            }
            i6 += 5;
            iArr3 = iArr;
        }
        int i7 = i5 + 1;
        if (z) {
            int[] iArr5 = {(int) pxc0VarArr[0].m171831c(), (int) pxc0VarArr[1].m171831c()};
            int i8 = i7;
            int i9 = 0;
            while (i8 < i) {
                int[] iArrM138811d2 = m138811d(o03Var, iArr5[0], i8, i2, false, iArr, iArr4);
                if (iArrM138811d2 != null && Math.abs(iArr5[0] - iArrM138811d2[0]) < 5 && Math.abs(iArr5[1] - iArrM138811d2[1]) < 5) {
                    iArr5 = iArrM138811d2;
                    i9 = 0;
                } else {
                    if (i9 > 25) {
                        break;
                    }
                    i9++;
                }
                i8++;
            }
            i7 = i8 - (i9 + 1);
            float f2 = i7;
            pxc0VarArr[2] = new pxc0(iArr5[0], f2);
            pxc0VarArr[3] = new pxc0(iArr5[1], f2);
        }
        if (i7 - i5 < 10) {
            Arrays.fill(pxc0VarArr, (Object) null);
        }
        return pxc0VarArr;
    }

    /* JADX INFO: renamed from: f */
    public static pxc0[] m138813f(o03 o03Var, int i, int i2) {
        int iM162113j = o03Var.m162113j();
        int iM162116m = o03Var.m162116m();
        pxc0[] pxc0VarArr = new pxc0[8];
        int iM171832d = i;
        int i3 = i2;
        m138808a(pxc0VarArr, m138812e(o03Var, iM162113j, iM162116m, iM171832d, i3, f115354c), f115352a);
        pxc0 pxc0Var = pxc0VarArr[4];
        if (pxc0Var != null) {
            int iM171831c = (int) pxc0Var.m171831c();
            iM171832d = (int) pxc0VarArr[4].m171832d();
            i3 = iM171831c;
        }
        m138808a(pxc0VarArr, m138812e(o03Var, iM162113j, iM162116m, iM171832d, i3, f115355d), f115353b);
        return pxc0VarArr;
    }

    /* JADX INFO: renamed from: g */
    public static float m138814g(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
