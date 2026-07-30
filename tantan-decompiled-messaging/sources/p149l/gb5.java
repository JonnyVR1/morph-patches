package p149l;

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
public final class gb5 extends mh50 {

    /* JADX INFO: renamed from: c */
    public static final char[] f101808c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d */
    public static final int[] f101809d;

    /* JADX INFO: renamed from: e */
    public static final int f101810e;

    /* JADX INFO: renamed from: a */
    public final StringBuilder f101811a = new StringBuilder(20);

    /* JADX INFO: renamed from: b */
    public final int[] f101812b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, HttpStatus.FAILED_DEPENDENCY_424, UnixStat.DEFAULT_FILE_PERM, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, HttpStatus.UNPROCESSABLE_ENTITY_422, HttpStatus.NOT_ACCEPTABLE_406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f101809d = iArr;
        f101810e = iArr[47];
    }

    /* JADX INFO: renamed from: g */
    public static void m125117g(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m125118h(charSequence, length - 2, 20);
        m125118h(charSequence, length - 1, 15);
    }

    /* JADX INFO: renamed from: h */
    public static void m125118h(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int iIndexOf = 0;
        int i3 = 1;
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i4)) * i3;
            i3++;
            if (i3 > i2) {
                i3 = 1;
            }
        }
        if (charSequence.charAt(i) != f101808c[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: i */
    private static String m125119i(CharSequence charSequence) throws FormatException {
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
    private static char m125120k(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f101809d;
            if (i2 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return f101808c[i2];
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m125121l(int[] iArr) {
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

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrM125122j = m125122j(m03Var);
        int iM152492k = m03Var.m152492k(iArrM125122j[1]);
        int iM152494m = m03Var.m152494m();
        int[] iArr = this.f101812b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f101811a;
        sb.setLength(0);
        while (true) {
            mh50.m154610e(m03Var, iM152492k, iArr);
            int iM125121l = m125121l(iArr);
            if (iM125121l < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cM125120k = m125120k(iM125121l);
            sb.append(cM125120k);
            int i2 = iM152492k;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int iM152492k2 = m03Var.m152492k(i2);
            if (cM125120k == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (iM152492k2 == iM152494m || !m03Var.m152490f(iM152492k2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                m125117g(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new oxc0(m125119i(sb), null, new pxc0[]{new pxc0((iArrM125122j[1] + iArrM125122j[0]) / 2.0f, f), new pxc0(iM152492k + (i4 / 2.0f), f)}, BarcodeFormat.CODE_93);
            }
            iM152492k = iM152492k2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int[] m125122j(m03 m03Var) throws NotFoundException {
        int iM152494m = m03Var.m152494m();
        int iM152492k = m03Var.m152492k(0);
        Arrays.fill(this.f101812b, 0);
        int[] iArr = this.f101812b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = iM152492k;
        while (iM152492k < iM152494m) {
            if (m03Var.m152490f(iM152492k) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (m125121l(iArr) == f101810e) {
                        return new int[]{i2, iM152492k};
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
            iM152492k++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
