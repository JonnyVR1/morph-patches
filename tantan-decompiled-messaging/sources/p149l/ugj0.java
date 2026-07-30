package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class ugj0 extends sgj0 {

    /* JADX INFO: renamed from: j */
    public static final int[] f176394j = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: k */
    public static final int[][] f176395k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: i */
    public final int[] f176396i = new int[4];

    /* JADX INFO: renamed from: r */
    public static String m193565r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static void m193566s(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f176395k[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: g */
    public boolean mo184108g(String str) throws FormatException {
        return super.mo184108g(m193565r(str));
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: j */
    public int[] mo184109j(m03 m03Var, int i) throws NotFoundException {
        return sgj0.m184104m(m03Var, i, true, f176394j);
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: k */
    public int mo149888k(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f176396i;
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
        m193566s(sb, i2);
        return i;
    }

    @Override // p149l.sgj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo149889p() {
        return BarcodeFormat.UPC_E;
    }
}
