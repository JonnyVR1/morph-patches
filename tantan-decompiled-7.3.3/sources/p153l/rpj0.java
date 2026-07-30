package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class rpj0 implements qkq0 {

    /* JADX INFO: renamed from: a */
    public final qje f164374a = new qje();

    @Override // p153l.qkq0
    /* JADX INFO: renamed from: a */
    public d13 mo17401a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f164374a.mo17401a("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, i, i2, map);
        }
        wg3.m206174a("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        return null;
    }
}
