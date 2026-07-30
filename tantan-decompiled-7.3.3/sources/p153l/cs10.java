package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class cs10 extends sp50 {

    /* JADX INFO: renamed from: a */
    public final vpj0[] f83387a;

    public cs10(Map<DecodeHintType, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new pje());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new qpj0());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new rje());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new xpj0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new pje());
            arrayList.add(new rje());
            arrayList.add(new xpj0());
        }
        this.f83387a = (vpj0[]) arrayList.toArray(new vpj0[arrayList.size()]);
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException {
        int[] iArrM202259o = vpj0.m202259o(b13Var);
        for (vpj0 vpj0Var : this.f83387a) {
            try {
                r5d0 r5d0VarMo177456l = vpj0Var.mo177456l(i, b13Var, iArrM202259o, map);
                boolean z = r5d0VarMo177456l.m179853b() == BarcodeFormat.EAN_13 && r5d0VarMo177456l.m179857f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                boolean z2 = collection == null || collection.contains(BarcodeFormat.UPC_A);
                if (!z || !z2) {
                    return r5d0VarMo177456l;
                }
                r5d0 r5d0Var = new r5d0(r5d0VarMo177456l.m179857f().substring(1), r5d0VarMo177456l.m179854c(), r5d0VarMo177456l.m179856e(), BarcodeFormat.UPC_A);
                r5d0Var.m179858g(r5d0VarMo177456l.m179855d());
                return r5d0Var;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // p153l.sp50, p153l.fmc0
    public void reset() {
        for (vpj0 vpj0Var : this.f83387a) {
            vpj0Var.reset();
        }
    }
}
