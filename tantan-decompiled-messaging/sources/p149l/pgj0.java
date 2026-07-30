package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class pgj0 {

    /* JADX INFO: renamed from: a */
    public final int[] f148721a = new int[4];

    /* JADX INFO: renamed from: b */
    public final StringBuilder f148722b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public static Map<ResultMetadataType, Object> m168754c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: renamed from: a */
    public final int m168755a(m03 m03Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f148721a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM152494m = m03Var.m152494m();
        int iM152493l = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 2 && iM152493l < iM152494m; i2++) {
            int iM184103i = sgj0.m184103i(m03Var, iArr2, iM152493l, sgj0.f164441h);
            sb.append((char) ((iM184103i % 10) + 48));
            for (int i3 : iArr2) {
                iM152493l += i3;
            }
            if (iM184103i >= 10) {
                i |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                iM152493l = m03Var.m152493l(m03Var.m152492k(iM152493l));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i) {
            return iM152493l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: b */
    public oxc0 m168756b(int i, m03 m03Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f148722b;
        sb.setLength(0);
        int iM168755a = m168755a(m03Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapM168754c = m168754c(string);
        float f = i;
        oxc0 oxc0Var = new oxc0(string, null, new pxc0[]{new pxc0((iArr[0] + iArr[1]) / 2.0f, f), new pxc0(iM168755a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapM168754c != null) {
            oxc0Var.m166533g(mapM168754c);
        }
        return oxc0Var;
    }
}
