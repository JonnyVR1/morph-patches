package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.app.Dialog;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0055g1;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.User;
import l.cwf0;
import l.d30;
import l.hpd0;
import l.j760;
import l.o6j0;
import l.x2c0;
import p009l.i0e;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0055g1 extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1598p() {
        hpd0 hpd0Var = CoreModule.c.B0.U;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        CoreModule.c.B0.R.put(bool);
        o6j0.c("e_id_verification_succeed_swipe_page_click", "p_id_verification_succeed_swipe_page_popup", new o6j0.a[]{o6j0.a.h("id_verification_succeed_route", "avatar_and_id")});
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        CoreModule.c.e0.na();
        NewMainAct newMainActAct = aVar.f873b.act();
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_id_verification_succeed_swipe_page_popup", Dialog.class.getName());
        cwf0VarM16062c.p(new j760[]{j760.a("id_verification_succeed_route", "avatar_and_id")});
        i0e.m16065f(cwf0VarM16062c);
        CoreDlg.F1(newMainActAct, newMainActAct.string(R.string.wr), newMainActAct.string(R.string.Y7), x2c0.yj, newMainActAct.string(R.string.xr), new d30() { // from class: l.rdh0
            public final void call() {
                C0055g1.m1598p();
            }
        }, false, (String) null, (d30) null, new d30() { // from class: l.sdh0
            public final void call() {
                i0e.m16064e(cwf0VarM16062c);
            }
        }, (User) null, false, false, (String) null, (d30) null);
        aVar.f872a.m19348P8(aVar.f877f, "successIdAuth");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return false;
    }
}
