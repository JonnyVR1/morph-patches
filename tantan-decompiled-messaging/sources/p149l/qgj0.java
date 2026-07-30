package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qgj0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f154340c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a */
    public final int[] f154341a = new int[4];

    /* JADX INFO: renamed from: b */
    public final StringBuilder f154342b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public static int m174432c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f154340c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: d */
    public static int m174433d(CharSequence charSequence) {
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
    public static String m174434e(String str) {
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
    public static Map<ResultMetadataType, Object> m174435f(String str) {
        String strM174434e;
        if (str.length() != 5 || (strM174434e = m174434e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, strM174434e);
        return enumMap;
    }

    /* JADX INFO: renamed from: a */
    public final int m174436a(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f154341a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM152494m = m03Var.m152494m();
        int iM152493l = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 5 && iM152493l < iM152494m; i2++) {
            int iM184103i = sgj0.m184103i(m03Var, iArr2, iM152493l, sgj0.f164441h);
            sb.append((char) ((iM184103i % 10) + 48));
            for (int i3 : iArr2) {
                iM152493l += i3;
            }
            if (iM184103i >= 10) {
                i |= 1 << (4 - i2);
            }
            if (i2 != 4) {
                iM152493l = m03Var.m152493l(m03Var.m152492k(iM152493l));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (m174433d(sb.toString()) == m174432c(i)) {
            return iM152493l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: b */
    public oxc0 m174437b(int i, m03 m03Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f154342b;
        sb.setLength(0);
        int iM174436a = m174436a(m03Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapM174435f = m174435f(string);
        float f = i;
        oxc0 oxc0Var = new oxc0(string, null, new pxc0[]{new pxc0((iArr[0] + iArr[1]) / 2.0f, f), new pxc0(iM174436a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapM174435f != null) {
            oxc0Var.m166533g(mapM174435f);
        }
        return oxc0Var;
    }
}
