package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.roj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ql40 extends bh60 {
    public ql40(PurchaseType purchaseType) {
        super(purchaseType, null);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return CoreModule.c.H0.a5().distinctUntilChanged(new w9j() { // from class: l.ol40
            public final Object call(Object obj) {
                return Long.valueOf(((Coin) obj).available);
            }
        }).skip(1).map(new w9j() { // from class: l.pl40
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        CoreModule.c.H0.k5();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        PurchaseType purchaseType = PurchaseType.TYPE_GET_NON_LIVE_COIN;
        PurchaseType purchaseType2 = this.f10106a;
        return purchaseType == purchaseType2 || PurchaseType.TYPE_INTL_TTT_COIN == purchaseType2;
    }
}
