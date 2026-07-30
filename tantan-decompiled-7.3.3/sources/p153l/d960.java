package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d960 implements qkq0 {
    /* JADX INFO: renamed from: b */
    public static d13 m114995b(byte[][] bArr, int i) {
        int i2 = i * 2;
        d13 d13Var = new d13(bArr[0].length + i2, bArr.length + i2);
        d13Var.clear();
        int iM113483j = (d13Var.m113483j() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    d13Var.m113488o(i4 + i, iM113483j);
                }
            }
            i3++;
            iM113483j--;
        }
        return d13Var;
    }

    /* JADX INFO: renamed from: c */
    public static d13 m114996c(u860 u860Var, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        u860Var.m194987e(str, i);
        byte[][] bArrM139586b = u860Var.m194988f().m139586b(1, 4);
        if ((i3 > i2) != (bArrM139586b[0].length < bArrM139586b.length)) {
            bArrM139586b = m114997d(bArrM139586b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / bArrM139586b[0].length;
        int length2 = i3 / bArrM139586b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m114995b(bArrM139586b, i4);
        }
        byte[][] bArrM139586b2 = u860Var.m194988f().m139586b(length, length << 2);
        if (z) {
            bArrM139586b2 = m114997d(bArrM139586b2);
        }
        return m114995b(bArrM139586b2, i4);
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m114997d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            wg3.m206174a("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        u860 u860Var = new u860();
        int i3 = 30;
        int i4 = 2;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                u860Var.m194989h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                u860Var.m194990i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                u2e u2eVar = (u2e) map.get(encodeHintType3);
                u860Var.m194991j(u2eVar.m194257a(), u2eVar.m194259c(), u2eVar.m194258b(), u2eVar.m194260d());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                u860Var.m194992k(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return m114996c(u860Var, str, i4, i, i2, i3);
    }
}
