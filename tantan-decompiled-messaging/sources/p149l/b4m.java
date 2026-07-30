package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b4m extends mh50 {

    /* JADX INFO: renamed from: b */
    public static final int[] f73385b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c */
    public static final int[] f73386c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d */
    public static final int[][] f73387d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e */
    public static final int[][] f73388e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a */
    public int f73389a = -1;

    /* JADX INFO: renamed from: g */
    public static int m100267g(int[] iArr) throws NotFoundException {
        int length = f73388e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float fM154609d = mh50.m154609d(iArr, f73388e[i2], 0.5f);
            if (fM154609d < f) {
                i = i2;
                f = fM154609d;
            } else if (fM154609d == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: i */
    public static void m100268i(m03 m03Var, int i, int i2, StringBuilder sb) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            mh50.m154610e(m03Var, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m100267g(iArr2) + 48));
            sb.append((char) (m100267g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static int[] m100269k(m03 m03Var, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iM152494m = m03Var.m152494m();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < iM152494m) {
            if (m03Var.m152490f(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else {
                    if (mh50.m154609d(iArr2, iArr, 0.5f) < 0.38f) {
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
    public static int m100270l(m03 m03Var) throws NotFoundException {
        int iM152494m = m03Var.m152494m();
        int iM152492k = m03Var.m152492k(0);
        if (iM152492k != iM152494m) {
            return iM152492k;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z;
        int[] iArrM100273j = m100273j(m03Var);
        int[] iArrM100272h = m100272h(m03Var);
        StringBuilder sb = new StringBuilder(20);
        m100268i(m03Var, iArrM100273j[1], iArrM100272h[0], sb);
        String string = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f73385b;
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
        return new oxc0(string, null, new pxc0[]{new pxc0(iArrM100273j[1], f), new pxc0(iArrM100272h[0], f)}, BarcodeFormat.ITF);
    }

    /* JADX INFO: renamed from: h */
    public final int[] m100272h(m03 m03Var) throws NotFoundException {
        int[] iArrM100269k;
        m03Var.m152497q();
        try {
            int iM100270l = m100270l(m03Var);
            try {
                iArrM100269k = m100269k(m03Var, iM100270l, f73387d[0]);
            } catch (NotFoundException unused) {
                iArrM100269k = m100269k(m03Var, iM100270l, f73387d[1]);
            }
            m100274m(m03Var, iArrM100269k[0]);
            int i = iArrM100269k[0];
            iArrM100269k[0] = m03Var.m152494m() - iArrM100269k[1];
            iArrM100269k[1] = m03Var.m152494m() - i;
            m03Var.m152497q();
            return iArrM100269k;
        } catch (Throwable th) {
            m03Var.m152497q();
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int[] m100273j(m03 m03Var) throws NotFoundException {
        int[] iArrM100269k = m100269k(m03Var, m100270l(m03Var), f73386c);
        int i = iArrM100269k[1];
        int i2 = iArrM100269k[0];
        this.f73389a = (i - i2) / 4;
        m100274m(m03Var, i2);
        return iArrM100269k;
    }

    /* JADX INFO: renamed from: m */
    public final void m100274m(m03 m03Var, int i) throws NotFoundException {
        int i2 = this.f73389a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        for (int i3 = i - 1; i2 > 0 && i3 >= 0 && !m03Var.m152490f(i3); i3--) {
            i2--;
        }
        if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
