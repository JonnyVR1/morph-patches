package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.Counter;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class bje0 extends gp60 {
    public bje0(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        return CoreModule.f18264c.m32486n3().distinctUntilChanged(new rcj() { // from class: l.zie0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Counter) obj).likersLimit.expiresTime == ((Counter) obj2).likersLimit.expiresTime);
            }
        }).skip(1).map(new qcj() { // from class: l.aje0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        CoreModule.f18264c.f20381e0.m116470H9();
        if (gta.m132210e().m132214d().mo34661B()) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return wib0.m206575s(this.f105436a);
    }
}
