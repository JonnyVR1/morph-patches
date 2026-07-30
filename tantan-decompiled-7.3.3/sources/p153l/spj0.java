package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class spj0 {

    /* JADX INFO: renamed from: a */
    public final int[] f170055a = new int[4];

    /* JADX INFO: renamed from: b */
    public final StringBuilder f170056b = new StringBuilder();

    /* JADX INFO: renamed from: c */
    public static Map<ResultMetadataType, Object> m187346c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: renamed from: a */
    public final int m187347a(b13 b13Var, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f170055a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iM101402m = b13Var.m101402m();
        int iM101401l = iArr[1];
        int i = 0;
        for (int i2 = 0; i2 < 2 && iM101401l < iM101402m; i2++) {
            int iM202256i = vpj0.m202256i(b13Var, iArr2, iM101401l, vpj0.f185263h);
            sb.append((char) ((iM202256i % 10) + 48));
            for (int i3 : iArr2) {
                iM101401l += i3;
            }
            if (iM202256i >= 10) {
                i |= 1 << (1 - i2);
            }
            if (i2 != 1) {
                iM101401l = b13Var.m101401l(b13Var.m101400k(iM101401l));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb.toString()) % 4 == i) {
            return iM101401l;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: b */
    public r5d0 m187348b(int i, b13 b13Var, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f170056b;
        sb.setLength(0);
        int iM187347a = m187347a(b13Var, iArr, sb);
        String string = sb.toString();
        Map<ResultMetadataType, Object> mapM187346c = m187346c(string);
        float f = i;
        r5d0 r5d0Var = new r5d0(string, null, new s5d0[]{new s5d0((iArr[0] + iArr[1]) / 2.0f, f), new s5d0(iM187347a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (mapM187346c != null) {
            r5d0Var.m179858g(mapM187346c);
        }
        return r5d0Var;
    }
}
