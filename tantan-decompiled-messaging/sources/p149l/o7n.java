package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class o7n extends bh60 {
    public o7n(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.f19573I0.m140259M3().distinctUntilChanged(new w9j() { // from class: l.m7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Long.valueOf(((IntlCurrencyDiamond) obj).available);
            }
        }).skip(1).map(new w9j() { // from class: l.n7n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        CoreModule.f17545c.f19573I0.m140262P3();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return PurchaseType.TYPE_INTL_DIAMOND == this.f75560a;
    }
}
