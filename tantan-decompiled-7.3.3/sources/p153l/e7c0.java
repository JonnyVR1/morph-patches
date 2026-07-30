package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.oms.OmsBaseRender;

/* JADX INFO: loaded from: classes11.dex */
public class e7c0 extends c4k0 {
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        CoreModule.f18264c.f20297C0.m146425v4();
        int iM96168s0 = a5i0.m96168s0();
        OmsBaseRender omsBaseRender = this.f79710a;
        if (iM96168s0 <= 0) {
            C8927c.m54662o1(omsBaseRender.f55069a, new y20() { // from class: l.c7c0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80103a.m119691h((PurchaseType) obj);
                }
            }, C8772a.m51457p0(), "p_quickchat_intropopup,e_quickchat_intropopup_trynow,click");
        } else {
            Act act = omsBaseRender.f55069a;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m40796R5(TabName.Msg);
                l51.m152888H(this.f79710a.f55069a, new Runnable() { // from class: l.d7c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85503a.m119692i();
                    }
                }, 1000L);
            }
        }
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "quickchat";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m119691h(PurchaseType purchaseType) {
        this.f79710a.f55071c.m21566z().show();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m119692i() {
        OnlineMatchManager.m51326z().m51366o0(this.f79710a.f55069a, false);
    }
}
