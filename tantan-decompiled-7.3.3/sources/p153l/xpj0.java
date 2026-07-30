package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes7.dex */
public final class xpj0 extends vpj0 {

    /* JADX INFO: renamed from: j */
    public static final int[] f195712j = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: k */
    public static final int[][] f195713k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: i */
    public final int[] f195714i = new int[4];

    /* JADX INFO: renamed from: r */
    public static String m212655r(String str) {
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
    public static void m212656s(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f195713k[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: g */
    public boolean mo202261g(String str) throws FormatException {
        return super.mo202261g(m212655r(str));
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: j */
    public int[] mo202262j(b13 b13Var, int i) throws NotFoundException {
        return vpj0.m202257m(b13Var, i, true, f195712j);
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: k */
    public int mo172489k(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f195714i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM101402m = b13Var.m101402m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < iM101402m; i3++) {
            int iM202256i = vpj0.m202256i(b13Var, iArr2, i, vpj0.f185263h);
            sb.append((char) ((iM202256i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (iM202256i >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m212656s(sb, i2);
        return i;
    }

    @Override // p153l.vpj0
    /* JADX INFO: renamed from: p */
    public BarcodeFormat mo172490p() {
        return BarcodeFormat.UPC_E;
    }
}
