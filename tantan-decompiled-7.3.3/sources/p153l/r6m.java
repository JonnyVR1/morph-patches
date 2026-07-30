package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class r6m extends sp50 {

    /* JADX INFO: renamed from: b */
    public static final int[] f161479b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c */
    public static final int[] f161480c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d */
    public static final int[][] f161481d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e */
    public static final int[][] f161482e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a */
    public int f161483a = -1;

    /* JADX INFO: renamed from: g */
    public static int m180009g(int[] iArr) throws NotFoundException {
        int length = f161482e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float fM187324d = sp50.m187324d(iArr, f161482e[i2], 0.5f);
            if (fM187324d < f) {
                i = i2;
                f = fM187324d;
            } else if (fM187324d == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: i */
    public static void m180010i(b13 b13Var, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            sp50.m187325e(b13Var, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m180009g(iArr2) + 48));
            sb.append((char) (m180009g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static int[] m180011k(b13 b13Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iM101402m = b13Var.m101402m();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < iM101402m) {
            if (b13Var.m101398f(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (sp50.m187324d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: l */
    public static int m180012l(b13 b13Var) throws NotFoundException {
        int iM101402m = b13Var.m101402m();
        int iM101400k = b13Var.m101400k(0);
        if (iM101400k != iM101402m) {
            return iM101400k;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        int[] iArrM180014j = m180014j(b13Var);
        int[] iArrM180013h = m180013h(b13Var);
        StringBuilder sb = new StringBuilder(20);
        m180010i(b13Var, iArrM180014j[1], iArrM180013h[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f161479b;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (!z) {
            throw FormatException.getFormatInstance();
        }
        float f = i;
        return new r5d0(string, null, new s5d0[]{new s5d0(iArrM180014j[1], f), new s5d0(iArrM180013h[0], f)}, BarcodeFormat.ITF);
    }

    /* JADX INFO: renamed from: h */
    public final int[] m180013h(b13 b13Var) throws NotFoundException {
        int[] iArrM180011k;
        b13Var.m101405q();
        try {
            int iM180012l = m180012l(b13Var);
            try {
                iArrM180011k = m180011k(b13Var, iM180012l, f161481d[0]);
            } catch (NotFoundException unused) {
                iArrM180011k = m180011k(b13Var, iM180012l, f161481d[1]);
            }
            m180015m(b13Var, iArrM180011k[0]);
            int i = iArrM180011k[0];
            iArrM180011k[0] = b13Var.m101402m() - iArrM180011k[1];
            iArrM180011k[1] = b13Var.m101402m() - i;
            b13Var.m101405q();
            return iArrM180011k;
        } catch (Throwable th) {
            b13Var.m101405q();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int[] m180014j(b13 b13Var) throws NotFoundException {
        int[] iArrM180011k = m180011k(b13Var, m180012l(b13Var), f161480c);
        int i = iArrM180011k[1];
        int i2 = iArrM180011k[0];
        this.f161483a = (i - i2) / 4;
        m180015m(b13Var, i2);
        return iArrM180011k;
    }

    /* JADX INFO: renamed from: m */
    public final void m180015m(b13 b13Var, int i) throws NotFoundException {
        int i2 = this.f161483a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        for (int i3 = i - 1; i2 > 0 && i3 >= 0 && !b13Var.m101398f(i3); i3--) {
            i2--;
        }
        if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
