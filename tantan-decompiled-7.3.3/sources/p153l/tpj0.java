package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tpj0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f175607c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a */
    public final int[] f175608a = new int[4];

    /* JADX INFO: renamed from: b */
    public final StringBuilder f175609b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public static int m192139c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f175607c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public static int m192140d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i = length - 2; i >= 0; i -= 2) {
            iCharAt += charSequence.charAt(i) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            iCharAt2 += charSequence.charAt(i2) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    /* JADX INFO: renamed from: e */
    public static String m192141e(String str) {
        String str2;
        byte b = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        if (!str.equals("90000")) {
                            b = -1;
                        }
                        break;
                    case 54395376:
                        b = !str.equals("99990") ? (byte) -1 : (byte) 1;
                        break;
                    case 54395377:
                        b = !str.equals("99991") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int i = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i / 100);
        int i2 = i % 100;
        return str2 + strValueOf + '.' + (i2 < 10 ? "0".concat(String.valueOf(i2)) : String.valueOf(i2));
    }

    /* JADX INFO: renamed from: f */
    public static Map<ResultMetadataType, Object> m192142f(String str) {
        String strM192141e;
        if (str.length() != 5 || (strM192141e = m192141e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, strM192141e);
        return enumMap;
    }

    /* JADX INFO: renamed from: a */
    public final int m192143a(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f175608a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM101402m = b13Var.m101402m();
        int iM101401l = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 5 && iM101401l < iM101402m; i2++) {
            int iM202256i = vpj0.m202256i(b13Var, iArr2, iM101401l, vpj0.f185263h);
            sb.append((char) ((iM202256i % 10) + 48));
            for (int i3 : iArr2) {
                iM101401l += i3;
            }
            if (iM202256i >= 10) {
                i |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                iM101401l = b13Var.m101401l(b13Var.m101400k(iM101401l));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (m192140d(sb.toString()) == m192139c(i)) {
            return iM101401l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: b */
    public r5d0 m192144b(int i, b13 b13Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f175609b;
        sb.setLength(0);
        int iM192143a = m192143a(b13Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapM192142f = m192142f(string);
        float f = i;
        r5d0 r5d0Var = new r5d0(string, null, new s5d0[]{new s5d0((iArr[0] + iArr[1]) / 2.0f, f), new s5d0(iM192143a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapM192142f != null) {
            r5d0Var.m179858g(mapM192142f);
        }
        return r5d0Var;
    }
}
