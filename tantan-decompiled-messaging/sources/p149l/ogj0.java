package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ogj0 implements lbq0 {

    /* JADX INFO: renamed from: a */
    public final mie f143868a = new mie();

    @Override // p149l.lbq0
    /* JADX INFO: renamed from: a */
    public o03 mo17346a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f143868a.mo17346a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
        }
        ig3.m135964a("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }
}
