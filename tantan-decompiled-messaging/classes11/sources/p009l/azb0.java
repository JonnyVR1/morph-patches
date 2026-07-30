package p009l;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.OMSAction;
import l.e30;
import l.e51;
import l.swh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class azb0 extends zuj0 {
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        CoreModule.c.C0.u4();
        int iS0 = swh0.s0();
        OmsBaseRender omsBaseRender = this.f23916a;
        if (iS0 <= 0) {
            c.o1(omsBaseRender.f7827a, new e30() { // from class: l.yyb0
                public final void call(Object obj) {
                    this.f23287a.m11786h((PurchaseType) obj);
                }
            }, a.p0(), "p_quickchat_intropopup,e_quickchat_intropopup_trynow,click");
        } else {
            NewMainAct newMainAct = omsBaseRender.f7827a;
            if (newMainAct instanceof NewMainAct) {
                newMainAct.m3862N5(TabName.Msg);
                e51.H(this.f23916a.f7827a, new Runnable() { // from class: l.zyb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24050a.m11787i();
                    }
                }, 1000L);
            }
        }
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "quickchat";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m11786h(PurchaseType purchaseType) {
        this.f23916a.f7829c.z().show();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m11787i() {
        OnlineMatchManager.z().o0(this.f23916a.f7827a, false);
    }
}
