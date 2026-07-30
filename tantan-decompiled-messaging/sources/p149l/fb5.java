package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class fb5 extends nh50 {
    /* JADX INFO: renamed from: f */
    public static void m120346f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    /* JADX INFO: renamed from: g */
    public static String m120347g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("%U");
            } else if (cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '@') {
                sb.append("%V");
            } else if (cCharAt == '`') {
                sb.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb.append('$');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb.append('%');
                sb.append((char) (cCharAt + '&'));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb.append('/');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb.append('%');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('%');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb.append('+');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                }
                sb.append('%');
                sb.append((char) (cCharAt - '+'));
            }
        }
        return sb.toString();
    }

    @Override // p149l.nh50, p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.mo17346a(str, barcodeFormat, i, i2, map);
        }
        ig3.m135964a("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }

    @Override // p149l.nh50
    /* JADX INFO: renamed from: c */
    public boolean[] mo17347c(String str) {
        int length = str.length();
        if (length > 80) {
            ig3.m135964a("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
            return null;
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = m120347g(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                ctq0.m108694a("Requested contents should be less than 80 digits long, but got ", length, " (extended full ASCII mode)");
                return null;
            }
        }
        int[] iArr = new int[9];
        int i2 = length + 25;
        for (int i3 = 0; i3 < length; i3++) {
            m120346f(eb5.f90295e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            for (int i4 = 0; i4 < 9; i4++) {
                i2 += iArr[i4];
            }
        }
        boolean[] zArr = new boolean[i2];
        m120346f(148, iArr);
        int iM159381b = nh50.m159381b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iM159381b2 = iM159381b + nh50.m159381b(zArr, iM159381b, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            m120346f(eb5.f90295e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
            int iM159381b3 = iM159381b2 + nh50.m159381b(zArr, iM159381b2, iArr, true);
            iM159381b2 = iM159381b3 + nh50.m159381b(zArr, iM159381b3, iArr2, false);
        }
        m120346f(148, iArr);
        nh50.m159381b(zArr, iM159381b2, iArr, true);
        return zArr;
    }
}
