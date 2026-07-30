package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class y060 implements lbq0 {
    /* JADX INFO: renamed from: b */
    public static o03 m212103b(byte[][] bArr, int i) {
        int i2 = i * 2;
        o03 o03Var = new o03(bArr[0].length + i2, bArr.length + i2);
        o03Var.clear();
        int iM162113j = (o03Var.m162113j() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    o03Var.m162118o(i4 + i, iM162113j);
                }
            }
            i3++;
            iM162113j--;
        }
        return o03Var;
    }

    /* JADX INFO: renamed from: c */
    public static o03 m212104c(p060 p060Var, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        p060Var.m166922e(str, i);
        byte[][] bArrM101304b = p060Var.m166923f().m101304b(1, 4);
        if ((i3 > i2) != (bArrM101304b[0].length < bArrM101304b.length)) {
            bArrM101304b = m212105d(bArrM101304b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / bArrM101304b[0].length;
        int length2 = i3 / bArrM101304b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m212103b(bArrM101304b, i4);
        }
        byte[][] bArrM101304b2 = p060Var.m166923f().m101304b(length, length << 2);
        if (z) {
            bArrM101304b2 = m212105d(bArrM101304b2);
        }
        return m212103b(bArrM101304b2, i4);
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m212105d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            ig3.m135964a("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        p060 p060Var = new p060();
        int i3 = 30;
        int i4 = 2;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                p060Var.m166924h(Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                p060Var.m166925i(Compaction.valueOf(map.get(encodeHintType2).toString()));
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                g1e g1eVar = (g1e) map.get(encodeHintType3);
                p060Var.m166926j(g1eVar.m124074a(), g1eVar.m124076c(), g1eVar.m124075b(), g1eVar.m124077d());
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                p060Var.m166927k(Charset.forName(map.get(encodeHintType6).toString()));
            }
        }
        return m212104c(p060Var, str, i4, i, i2, i3);
    }
}
