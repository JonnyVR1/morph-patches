package p149l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.tencent.wcdb.FileUtils;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class eb5 extends mh50 {

    /* JADX INFO: renamed from: e */
    public static final int[] f90295e = {52, 289, 97, 352, 49, HttpStatus.NOT_MODIFIED_304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, FileUtils.S_IRWXU, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 400, 208, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 388, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 162, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 42};

    /* JADX INFO: renamed from: a */
    public final boolean f90296a;

    /* JADX INFO: renamed from: b */
    public final boolean f90297b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f90298c;

    /* JADX INFO: renamed from: d */
    public final int[] f90299d;

    public eb5(boolean z, boolean z2) {
        this.f90296a = z;
        this.f90297b = z2;
        this.f90298c = new StringBuilder(20);
        this.f90299d = new int[9];
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX INFO: renamed from: g */
    public static String m115454g(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i2++;
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i = cCharAt2 - ' ';
                            } else {
                                if (cCharAt2 != 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c = ':';
                            }
                        } else {
                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            i = cCharAt2 + ' ';
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i = cCharAt2 - '&';
                    } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                        i = cCharAt2 - 11;
                    } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                        i = cCharAt2 + 16;
                    } else if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                        i = cCharAt2 + '+';
                    } else if (cCharAt2 == 'U') {
                        c = 0;
                    } else if (cCharAt2 == 'V') {
                        c = '@';
                    } else if (cCharAt2 == 'W') {
                        c = '`';
                    } else {
                        if (cCharAt2 != 'X' && cCharAt2 != 'Y' && cCharAt2 != 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        c = 127;
                    }
                    sb.append(c);
                } else {
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        throw FormatException.getFormatInstance();
                    }
                    i = cCharAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(cCharAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static int[] m115455h(m03 m03Var, int[] iArr) throws NotFoundException {
        int iM152494m = m03Var.m152494m();
        int iM152492k = m03Var.m152492k(0);
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
                    if (m115457j(iArr) == 148 && m03Var.m152496o(Math.max(0, i2 - ((iM152492k - i2) / 2)), i2, false)) {
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

    /* JADX INFO: renamed from: i */
    public static char m115456i(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f90295e;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m115457j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.f90299d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f90298c;
        sb.setLength(0);
        int[] iArrM115455h = m115455h(m03Var, iArr);
        int iM152492k = m03Var.m152492k(iArrM115455h[1]);
        int iM152494m = m03Var.m152494m();
        while (true) {
            mh50.m154610e(m03Var, iM152492k, iArr);
            int iM115457j = m115457j(iArr);
            if (iM115457j < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cM115456i = m115456i(iM115457j);
            sb.append(cM115456i);
            int i2 = iM152492k;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int iM152492k2 = m03Var.m152492k(i2);
            if (cM115456i == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (iM152492k2 - iM152492k) - i4;
                if (iM152492k2 != iM152494m && (i6 << 1) < i4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.f90296a) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f90298c.charAt(i7));
                    }
                    if (sb.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f = i;
                return new oxc0(this.f90297b ? m115454g(sb) : sb.toString(), null, new pxc0[]{new pxc0((iArrM115455h[1] + iArrM115455h[0]) / 2.0f, f), new pxc0(iM152492k + (i4 / 2.0f), f)}, BarcodeFormat.CODE_39);
            }
            iM152492k = iM152492k2;
        }
    }

    public eb5(boolean z) {
        this(z, false);
    }

    public eb5() {
        this(false);
    }
}
