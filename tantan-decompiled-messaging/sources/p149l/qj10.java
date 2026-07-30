package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class qj10 extends mh50 {

    /* JADX INFO: renamed from: a */
    public final mh50[] f154831a;

    public qj10(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new sj10(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new eb5(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new gb5());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new db5());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new b4m());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new bb5());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new qac0());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new rac0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new sj10(map));
            arrayList.add(new eb5());
            arrayList.add(new bb5());
            arrayList.add(new gb5());
            arrayList.add(new db5());
            arrayList.add(new b4m());
            arrayList.add(new qac0());
            arrayList.add(new rac0());
        }
        this.f154831a = (mh50[]) arrayList.toArray(new mh50[arrayList.size()]);
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        mh50[] mh50VarArr = this.f154831a;
        for (int i2 = 0; i2 < mh50VarArr.length; i2++) {
            try {
                return mh50VarArr[i2].mo100271b(i, m03Var, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.mh50, p149l.ydc0
    public void reset() {
        for (mh50 mh50Var : this.f154831a) {
            mh50Var.reset();
        }
    }
}
