package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8042g1;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import p153l.dbc0;
import p153l.jxd0;
import p153l.l4g0;
import p153l.pf60;
import p153l.sfj0;
import p153l.w1e;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8042g1 extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38630p() {
        jxd0 jxd0Var = CoreModule.f18264c.f20294B0.f20489U;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20294B0.f20486R.put(bool);
        sfj0.m185596c("e_id_verification_succeed_swipe_page_click", "p_id_verification_succeed_swipe_page_popup", sfj0.C20032a.m185615h("id_verification_succeed_route", "avatar_and_id"));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        CoreModule.f18264c.f20381e0.m116593na();
        NewMainAct newMainActAct = aVar.f22837b.act();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_id_verification_succeed_swipe_page_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pf60.m172085a("id_verification_succeed_route", "avatar_and_id"));
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46167F1(newMainActAct, newMainActAct.string(R$string.f18864Sr), newMainActAct.string(R$string.f19085a8), dbc0.f87222mk, newMainActAct.string(R$string.f18894Tr), new x20() { // from class: l.zlh0
            @Override // p153l.x20
            public final void call() {
                C8042g1.m38630p();
            }
        }, false, null, null, new x20() { // from class: l.amh0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, null, false, false, null, null);
        aVar.f22836a.m101938P8(aVar.f22841f, "successIdAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return false;
    }
}
