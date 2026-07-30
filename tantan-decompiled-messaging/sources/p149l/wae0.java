package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.Counter;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class wae0 extends bh60 {
    public wae0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.m31483n3().distinctUntilChanged(new x9j() { // from class: l.uae0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Counter) obj).likersLimit.expiresTime == ((Counter) obj2).likersLimit.expiresTime);
            }
        }).skip(1).map(new w9j() { // from class: l.vae0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        CoreModule.f17545c.f19639e0.m169397H9();
        if (ura.m195053e().m195057d().mo33658B()) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182901s(this.f75560a);
    }
}
