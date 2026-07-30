package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7891g1;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import p149l.cwf0;
import p149l.d30;
import p149l.hpd0;
import p149l.i0e;
import p149l.j760;
import p149l.o6j0;
import p149l.x2c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7891g1 extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37627p() {
        hpd0 hpd0Var = CoreModule.f17545c.f19552B0.f19747U;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19552B0.f19744R.put(bool);
        o6j0.m162859c("e_id_verification_succeed_swipe_page_click", "p_id_verification_succeed_swipe_page_popup", o6j0.C18854a.m162878h("id_verification_succeed_route", "avatar_and_id"));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        CoreModule.f17545c.f19639e0.m169520na();
        NewMainAct newMainActAct = aVar.f22095b.act();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_id_verification_succeed_swipe_page_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(j760.m140076a("id_verification_succeed_route", "avatar_and_id"));
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44984F1(newMainActAct, newMainActAct.string(R$string.f19046wr), newMainActAct.string(R$string.f18294Y7), x2c0.f190750yj, newMainActAct.string(R$string.f19076xr), new d30() { // from class: l.rdh0
            @Override // p149l.d30
            public final void call() {
                C7891g1.m37627p();
            }
        }, false, null, null, new d30() { // from class: l.sdh0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, null, false, false, null, null);
        aVar.f22094a.m161144P8(aVar.f22099f, "successIdAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        return false;
    }
}
