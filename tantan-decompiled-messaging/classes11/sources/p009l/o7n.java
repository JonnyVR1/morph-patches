package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.roj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o7n extends bh60 {
    public o7n(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return CoreModule.c.I0.M3().distinctUntilChanged(new w9j() { // from class: l.m7n
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }).skip(1).map(new w9j() { // from class: l.n7n
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        CoreModule.c.I0.P3();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return PurchaseType.TYPE_INTL_DIAMOND == this.f10106a;
    }
}
