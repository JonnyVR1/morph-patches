package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class as10 extends sp50 {

    /* JADX INFO: renamed from: a */
    public final sp50[] f73021a;

    public as10(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new cs10(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new ec5(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new gc5());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new dc5());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new r6m());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new bc5());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new xic0());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new yic0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new cs10(map));
            arrayList.add(new ec5());
            arrayList.add(new bc5());
            arrayList.add(new gc5());
            arrayList.add(new dc5());
            arrayList.add(new r6m());
            arrayList.add(new xic0());
            arrayList.add(new yic0());
        }
        this.f73021a = (sp50[]) arrayList.toArray(new sp50[arrayList.size()]);
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        sp50[] sp50VarArr = this.f73021a;
        for (int i2 = 0; i2 < sp50VarArr.length; i2++) {
            try {
                return sp50VarArr[i2].mo99812b(i, b13Var, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.sp50, p153l.fmc0
    public void reset() {
        for (sp50 sp50Var : this.f73021a) {
            sp50Var.reset();
        }
    }
}
