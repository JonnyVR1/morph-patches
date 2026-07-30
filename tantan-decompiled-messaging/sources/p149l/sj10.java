package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class sj10 extends mh50 {

    /* JADX INFO: renamed from: a */
    public final sgj0[] f164773a;

    public sj10(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new lie());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new ngj0());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new nie());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new ugj0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new lie());
            arrayList.add(new nie());
            arrayList.add(new ugj0());
        }
        this.f164773a = (sgj0[]) arrayList.toArray(new sgj0[arrayList.size()]);
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        int[] iArrM184106o = sgj0.m184106o(m03Var);
        for (sgj0 sgj0Var : this.f164773a) {
            try {
                oxc0 oxc0VarMo159336l = sgj0Var.mo159336l(i, m03Var, iArrM184106o, map);
                boolean z = oxc0VarMo159336l.m166528b() == BarcodeFormat.EAN_13 && oxc0VarMo159336l.m166532f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z || !z2) {
                    return oxc0VarMo159336l;
                }
                oxc0 oxc0Var = new oxc0(oxc0VarMo159336l.m166532f().substring(1), oxc0VarMo159336l.m166529c(), oxc0VarMo159336l.m166531e(), BarcodeFormat.UPC_A);
                oxc0Var.m166533g(oxc0VarMo159336l.m166530d());
                return oxc0Var;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p149l.mh50, p149l.ydc0
    public void reset() {
        for (sgj0 sgj0Var : this.f164773a) {
            sgj0Var.reset();
        }
    }
}
