package p153l;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class wyd {

    /* JADX INFO: renamed from: a */
    public static final int[] f191631a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b */
    public static final int[] f191632b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c */
    public static final int[] f191633c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d */
    public static final int[] f191634d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* JADX INFO: renamed from: a */
    public static void m208609a(s5d0[] s5d0VarArr, s5d0[] s5d0VarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            s5d0VarArr[iArr[i]] = s5d0VarArr2[i];
        }
    }

    /* JADX INFO: renamed from: b */
    public static List<s5d0[]> m208610b(boolean z, d13 d13Var) {
        int iM184657c;
        float fM184658d;
        ArrayList<s5d0[]> arrayList = new ArrayList();
        int iMax = 0;
        int i = 0;
        loop0: while (true) {
            int i2 = i;
            while (iMax < d13Var.m113483j()) {
                s5d0[] s5d0VarArrM208614f = m208614f(d13Var, iMax, i);
                if (s5d0VarArrM208614f[0] == null && s5d0VarArrM208614f[3] == null) {
                    if (i2 == 0) {
                        break;
                    }
                    for (s5d0[] s5d0VarArr : arrayList) {
                        s5d0 s5d0Var = s5d0VarArr[1];
                        if (s5d0Var != null) {
                            iMax = (int) Math.max(iMax, s5d0Var.m184658d());
                        }
                        s5d0 s5d0Var2 = s5d0VarArr[3];
                        if (s5d0Var2 != null) {
                            iMax = Math.max(iMax, (int) s5d0Var2.m184658d());
                        }
                    }
                    iMax += 5;
                    i = 0;
                } else {
                    arrayList.add(s5d0VarArrM208614f);
                    if (!z) {
                        break loop0;
                    }
                    s5d0 s5d0Var3 = s5d0VarArrM208614f[2];
                    if (s5d0Var3 != null) {
                        iM184657c = (int) s5d0Var3.m184657c();
                        fM184658d = s5d0VarArrM208614f[2].m184658d();
                    } else {
                        iM184657c = (int) s5d0VarArrM208614f[4].m184657c();
                        fM184658d = s5d0VarArrM208614f[4].m184658d();
                    }
                    iMax = (int) fM184658d;
                    i = iM184657c;
                    i2 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static x860 m208611c(cy2 cy2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        d13 d13VarM113086a = cy2Var.m113086a();
        List<s5d0[]> listM208610b = m208610b(z, d13VarM113086a);
        if (listM208610b.isEmpty()) {
            d13VarM113086a = d13VarM113086a.clone();
            d13VarM113086a.m113487n();
            listM208610b = m208610b(z, d13VarM113086a);
        }
        return new x860(d13VarM113086a, listM208610b);
    }

    /* JADX INFO: renamed from: d */
    public static int[] m208612d(d13 d13Var, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (d13Var.m113480d(i, i2) && i > 0) {
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
            if (d13Var.m113480d(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (m208615g(iArr2, iArr, 0.8f) < 0.42f) {
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
        if (i6 != length - 1 || m208615g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* JADX INFO: renamed from: e */
    public static s5d0[] m208613e(d13 d13Var, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int[] iArr2;
        s5d0[] s5d0VarArr = new s5d0[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                i5 = i6;
                z = false;
                break;
            }
            int[] iArrM208612d = m208612d(d13Var, i4, i6, i2, false, iArr3, iArr4);
            if (iArrM208612d != null) {
                do {
                    i5 = i6;
                    iArr2 = iArrM208612d;
                    if (i5 <= 0) {
                        break;
                    }
                    i6 = i5 - 1;
                    iArrM208612d = m208612d(d13Var, i4, i6, i2, false, iArr, iArr4);
                } while (iArrM208612d != null);
                float f = i5;
                s5d0VarArr[0] = new s5d0(iArr2[0], f);
                s5d0VarArr[1] = new s5d0(iArr2[1], f);
                z = true;
                break;
            }
            i6 += 5;
            iArr3 = iArr;
        }
        int i7 = i5 + 1;
        if (z) {
            int[] iArr5 = {(int) s5d0VarArr[0].m184657c(), (int) s5d0VarArr[1].m184657c()};
            int i8 = i7;
            int i9 = 0;
            while (i8 < i) {
                int[] iArrM208612d2 = m208612d(d13Var, iArr5[0], i8, i2, false, iArr, iArr4);
                if (iArrM208612d2 != null && Math.abs(iArr5[0] - iArrM208612d2[0]) < 5 && Math.abs(iArr5[1] - iArrM208612d2[1]) < 5) {
                    iArr5 = iArrM208612d2;
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
            s5d0VarArr[2] = new s5d0(iArr5[0], f2);
            s5d0VarArr[3] = new s5d0(iArr5[1], f2);
        }
        if (i7 - i5 < 10) {
            Arrays.fill(s5d0VarArr, (Object) null);
        }
        return s5d0VarArr;
    }

    /* JADX INFO: renamed from: f */
    public static s5d0[] m208614f(d13 d13Var, int i, int i2) {
        int iM113483j = d13Var.m113483j();
        int iM113486m = d13Var.m113486m();
        s5d0[] s5d0VarArr = new s5d0[8];
        int iM184658d = i;
        int i3 = i2;
        m208609a(s5d0VarArr, m208613e(d13Var, iM113483j, iM113486m, iM184658d, i3, f191633c), f191631a);
        s5d0 s5d0Var = s5d0VarArr[4];
        if (s5d0Var != null) {
            int iM184657c = (int) s5d0Var.m184657c();
            iM184658d = (int) s5d0VarArr[4].m184658d();
            i3 = iM184657c;
        }
        m208609a(s5d0VarArr, m208613e(d13Var, iM113483j, iM113486m, iM184658d, i3, f191634d), f191632b);
        return s5d0VarArr;
    }

    /* JADX INFO: renamed from: g */
    public static float m208615g(int[] iArr, int[] iArr2, float f) {
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
