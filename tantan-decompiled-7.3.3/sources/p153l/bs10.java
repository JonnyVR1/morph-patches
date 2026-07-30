package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class bs10 implements fmc0 {

    /* JADX INFO: renamed from: a */
    public Map<DecodeHintType, ?> f78081a;

    /* JADX INFO: renamed from: b */
    public fmc0[] f78082b;

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        m106195d(map);
        return m106193b(cy2Var);
    }

    /* JADX INFO: renamed from: b */
    public final r5d0 m106193b(cy2 cy2Var) throws NotFoundException {
        fmc0[] fmc0VarArr = this.f78082b;
        if (fmc0VarArr != null) {
            for (fmc0 fmc0Var : fmc0VarArr) {
                try {
                    return fmc0Var.mo96539a(cy2Var, this.f78081a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: c */
    public r5d0 m106194c(cy2 cy2Var) throws NotFoundException {
        if (this.f78082b == null) {
            m106195d(null);
        }
        return m106193b(cy2Var);
    }

    /* JADX INFO: renamed from: d */
    public void m106195d(Map<DecodeHintType, ?> map) {
        this.f78081a = map;
        boolean z = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z2 = collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.UPC_E) || collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.CODABAR) || collection.contains(BarcodeFormat.CODE_39) || collection.contains(BarcodeFormat.CODE_93) || collection.contains(BarcodeFormat.CODE_128) || collection.contains(BarcodeFormat.ITF) || collection.contains(BarcodeFormat.RSS_14) || collection.contains(BarcodeFormat.RSS_EXPANDED);
            if (z2 && !z) {
                arrayList.add(new as10(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new lvb0());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new w5c());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new zp1());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new a960());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new shx());
            }
            if (z2 && z) {
                arrayList.add(new as10(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new as10(map));
            }
            arrayList.add(new lvb0());
            arrayList.add(new w5c());
            arrayList.add(new zp1());
            arrayList.add(new a960());
            arrayList.add(new shx());
            if (z) {
                arrayList.add(new as10(map));
            }
        }
        this.f78082b = (fmc0[]) arrayList.toArray(new fmc0[arrayList.size()]);
    }

    @Override // p153l.fmc0
    public void reset() {
        fmc0[] fmc0VarArr = this.f78082b;
        if (fmc0VarArr != null) {
            for (fmc0 fmc0Var : fmc0VarArr) {
                fmc0Var.reset();
            }
        }
    }
}
