package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class o9n extends gp60 {
    public o9n(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        return CoreModule.f18264c.f20315I0.m144056M3().distinctUntilChanged(new qcj() { // from class: l.m9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }).skip(1).map(new qcj() { // from class: l.n9n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        CoreModule.f18264c.f20315I0.m144059P3();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return PurchaseType.TYPE_INTL_DIAMOND == this.f105436a;
    }
}
