package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes7.dex */
public final class gc5 extends sp50 {

    /* JADX INFO: renamed from: c */
    public static final char[] f103523c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d */
    public static final int[] f103524d;

    /* JADX INFO: renamed from: e */
    public static final int f103525e;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f103526a = new StringBuilder(20);

    /* JADX INFO: renamed from: b */
    public final int[] f103527b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, HttpStatus.FAILED_DEPENDENCY_424, UnixStat.DEFAULT_FILE_PERM, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, HttpStatus.UNPROCESSABLE_ENTITY_422, HttpStatus.NOT_ACCEPTABLE_406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f103524d = iArr;
        f103525e = iArr[47];
    }

    /* JADX INFO: renamed from: g */
    public static void m129847g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m129848h(charSequence, length - 2, 20);
        m129848h(charSequence, length - 1, 15);
    }

    /* JADX INFO: renamed from: h */
    public static void m129848h(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != f103523c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: i */
    private static String m129849i(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i2 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                i2++;
                char cCharAt2 = charSequence.charAt(i2);
                switch (cCharAt) {
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i = cCharAt2 - '@';
                        c = (char) i;
                        sb.append(c);
                        break;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                            i = cCharAt2 - '&';
                        } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                            i = cCharAt2 - 11;
                        } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                            if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                i = cCharAt2 + '+';
                            } else {
                                if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c = 127;
                            }
                            sb.append(c);
                        } else {
                            i = cCharAt2 + 16;
                        }
                        c = (char) i;
                        sb.append(c);
                        break;
                    case 'c':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                            i = cCharAt2 - ' ';
                            c = (char) i;
                        } else {
                            if (cCharAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            c = ':';
                        }
                        sb.append(c);
                        break;
                    case 'd':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i = cCharAt2 + ' ';
                        c = (char) i;
                        sb.append(c);
                        break;
                    default:
                        c = 0;
                        sb.append(c);
                        break;
                }
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    private static char m129850k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f103524d;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return f103523c[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m129851l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int iRound = Math.round((iArr[i4] * 9.0f) / i);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < iRound; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= iRound;
            }
        }
        return i3;
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrM129852j = m129852j(b13Var);
        int iM101400k = b13Var.m101400k(iArrM129852j[1]);
        int iM101402m = b13Var.m101402m();
        int[] iArr = this.f103527b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f103526a;
        sb.setLength(0);
        while (true) {
            sp50.m187325e(b13Var, iM101400k, iArr);
            int iM129851l = m129851l(iArr);
            if (iM129851l < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cM129850k = m129850k(iM129851l);
            sb.append(cM129850k);
            int i2 = iM101400k;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int iM101400k2 = b13Var.m101400k(i2);
            if (cM129850k == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (iM101400k2 == iM101402m || !b13Var.m101398f(iM101400k2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                m129847g(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new r5d0(m129849i(sb), null, new s5d0[]{new s5d0((iArrM129852j[1] + iArrM129852j[0]) / 2.0f, f), new s5d0(iM101400k + (i4 / 2.0f), f)}, BarcodeFormat.CODE_93);
            }
            iM101400k = iM101400k2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int[] m129852j(b13 b13Var) throws NotFoundException {
        int iM101402m = b13Var.m101402m();
        int iM101400k = b13Var.m101400k(0);
        Arrays.fill(this.f103527b, 0);
        int[] iArr = this.f103527b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = iM101400k;
        while (iM101400k < iM101402m) {
            if (b13Var.m101398f(iM101400k) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (m129851l(iArr) == f103525e) {
                        return new int[]{i2, iM101400k};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            iM101400k++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
