package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.oms.OmsBaseRender;

/* JADX INFO: loaded from: classes11.dex */
public class azb0 extends zuj0 {
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        CoreModule.f17545c.f19555C0.m210112u4();
        int iM186263s0 = swh0.m186263s0();
        OmsBaseRender omsBaseRender = this.f204856a;
        if (iM186263s0 <= 0) {
            C8764c.m53479o1(omsBaseRender.f54221a, new e30() { // from class: l.yyb0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200720a.m99647h((PurchaseType) obj);
                }
            }, C8609a.m50274p0(), "p_quickchat_intropopup,e_quickchat_intropopup_trynow,click");
        } else {
            Act act = omsBaseRender.f54221a;
            if (act instanceof NewMainAct) {
                ((NewMainAct) act).m39786N5(TabName.Msg);
                e51.m114743H(this.f204856a.f54221a, new Runnable() { // from class: l.zyb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f205671a.m99648i();
                    }
                }, 1000L);
            }
        }
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "quickchat";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m99647h(PurchaseType purchaseType) {
        this.f204856a.f54223c.m20567z().show();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m99648i() {
        OnlineMatchManager.m50143z().m50183o0(this.f204856a.f54221a, false);
    }
}
