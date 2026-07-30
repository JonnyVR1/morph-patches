package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class lie extends sgj0 {

    /* JADX INFO: renamed from: j */
    public static final int[] f128186j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i */
    public final int[] f128187i = new int[4];

    /* JADX INFO: renamed from: r */
    public static void m149887r(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f128186j[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: k */
    public int mo149888k(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f128187i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM152494m = m03Var.m152494m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < iM152494m; i3++) {
            int iM184103i = sgj0.m184103i(m03Var, iArr2, i, sgj0.f164441h);
            sb.append((char) ((iM184103i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (iM184103i >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m149887r(sb, i2);
        int i5 = sgj0.m184104m(m03Var, i, true, sgj0.f164438e)[1];
        for (int i6 = 0; i6 < 6 && i5 < iM152494m; i6++) {
            sb.append((char) (sgj0.m184103i(m03Var, iArr2, i5, sgj0.f164440g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo149889p() {
        return BarcodeFormat.EAN_13;
    }
}
