package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public final class ec5 extends sp50 {

    /* JADX INFO: renamed from: e */
    public static final int[] f93012e = {52, 289, 97, 352, 49, HttpStatus.NOT_MODIFIED_304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 400, 208, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 388, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 162, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 42};

    /* JADX INFO: renamed from: a */
    public final boolean f93013a;

    /* JADX INFO: renamed from: b */
    public final boolean f93014b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f93015c;

    /* JADX INFO: renamed from: d */
    public final int[] f93016d;

    public ec5(boolean z, boolean z2) {
        this.f93013a = z;
        this.f93014b = z2;
        this.f93015c = new StringBuilder(20);
        this.f93016d = new int[9];
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX INFO: renamed from: g */
    public static String m120292g(CharSequence charSequence) throws FormatException {
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
    public static int[] m120293h(b13 b13Var, int[] iArr) throws NotFoundException {
        int iM101402m = b13Var.m101402m();
        int iM101400k = b13Var.m101400k(0);
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
                    if (m120295j(iArr) == 148 && b13Var.m101404o(Math.max(0, i2 - ((iM101400k - i2) / 2)), i2, false)) {
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

    /* JADX INFO: renamed from: i */
    public static char m120294i(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f93012e;
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
    public static int m120295j(int[] iArr) {
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

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.f93016d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f93015c;
        sb.setLength(0);
        int[] iArrM120293h = m120293h(b13Var, iArr);
        int iM101400k = b13Var.m101400k(iArrM120293h[1]);
        int iM101402m = b13Var.m101402m();
        while (true) {
            sp50.m187325e(b13Var, iM101400k, iArr);
            int iM120295j = m120295j(iArr);
            if (iM120295j < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cM120294i = m120294i(iM120295j);
            sb.append(cM120294i);
            int i2 = iM101400k;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int iM101400k2 = b13Var.m101400k(i2);
            if (cM120294i == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (iM101400k2 - iM101400k) - i4;
                if (iM101400k2 != iM101402m && (i6 << 1) < i4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.f93013a) {
                    int length = sb.length() - 1;
                    int iIndexOf = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f93015c.charAt(i7));
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
                return new r5d0(this.f93014b ? m120292g(sb) : sb.toString(), null, new s5d0[]{new s5d0((iArrM120293h[1] + iArrM120293h[0]) / 2.0f, f), new s5d0(iM101400k + (i4 / 2.0f), f)}, BarcodeFormat.CODE_39);
            }
            iM101400k = iM101400k2;
        }
    }

    public ec5(boolean z) {
        this(z, false);
    }

    public ec5() {
        this(false);
    }
}
