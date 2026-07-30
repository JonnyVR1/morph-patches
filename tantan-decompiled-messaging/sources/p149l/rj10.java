package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class rj10 implements ydc0 {

    /* JADX INFO: renamed from: a */
    public Map<DecodeHintType, ?> f159622a;

    /* JADX INFO: renamed from: b */
    public ydc0[] f159623b;

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        m179542d(map);
        return m179540b(nx2Var);
    }

    /* JADX INFO: renamed from: b */
    public final oxc0 m179540b(nx2 nx2Var) throws NotFoundException {
        ydc0[] ydc0VarArr = this.f159623b;
        if (ydc0VarArr != null) {
            for (ydc0 ydc0Var : ydc0VarArr) {
                try {
                    return ydc0Var.mo131886a(nx2Var, this.f159622a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: c */
    public oxc0 m179541c(nx2 nx2Var) throws NotFoundException {
        if (this.f159623b == null) {
            m179542d(null);
        }
        return m179540b(nx2Var);
    }

    /* JADX INFO: renamed from: d */
    public void m179542d(Map<DecodeHintType, ?> map) {
        this.f159622a = map;
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED);
            if (z2 && !z) {
                arrayList.add(new qj10(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new hnb0());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new o4c());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new sp1());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new v060());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new tex());
            }
            if (z2 && z) {
                arrayList.add(new qj10(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new qj10(map));
            }
            arrayList.add(new hnb0());
            arrayList.add(new o4c());
            arrayList.add(new sp1());
            arrayList.add(new v060());
            arrayList.add(new tex());
            if (z) {
                arrayList.add(new qj10(map));
            }
        }
        this.f159623b = (ydc0[]) arrayList.toArray(new ydc0[arrayList.size()]);
    }

    @Override // p149l.ydc0
    public void reset() {
        ydc0[] ydc0VarArr = this.f159623b;
        if (ydc0VarArr != null) {
            for (ydc0 ydc0Var : ydc0VarArr) {
                ydc0Var.reset();
            }
        }
    }
}
