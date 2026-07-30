package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class eu40 extends gp60 {
    public eu40(PurchaseType purchaseType) {
        super(purchaseType, null);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        return CoreModule.f18264c.f20312H0.m155437a5().distinctUntilChanged(new qcj() { // from class: l.cu40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        }).skip(1).map(new qcj() { // from class: l.du40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        CoreModule.f18264c.f20312H0.m155449k5();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f105436a;
        return purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2;
    }
}
