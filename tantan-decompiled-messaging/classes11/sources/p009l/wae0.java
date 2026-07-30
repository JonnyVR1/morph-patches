package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Counter;
import l.roj0;
import l.sab0;
import l.ura;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wae0 extends bh60 {
    public wae0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return CoreModule.c.n3().distinctUntilChanged(new x9j() { // from class: l.uae0
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Counter) obj).likersLimit.expiresTime == ((Counter) obj2).likersLimit.expiresTime);
            }
        }).skip(1).map(new w9j() { // from class: l.vae0
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        CoreModule.c.e0.H9();
        if (ura.e().d().B()) {
            CoreModule.c.C0.u4();
        }
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return sab0.s(this.f10106a);
    }
}
