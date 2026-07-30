package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ql40 extends bh60 {
    public ql40(PurchaseType purchaseType) {
        super(purchaseType, null);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.f19570H0.m210349a5().distinctUntilChanged(new w9j() { // from class: l.ol40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        }).skip(1).map(new w9j() { // from class: l.pl40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        CoreModule.f17545c.f19570H0.m210361k5();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f75560a;
        return purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2;
    }
}
