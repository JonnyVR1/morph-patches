package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0087s0;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.OMSEventId;
import com.p1.mobile.putong.data.OMSPosition;
import l.e30;
import l.qib0;
import p009l.ic50;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.s0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0087s0 extends SwipeDialogOmsLimitStrategy {
    public C0087s0(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m1719t(C0062j.a aVar, String str) {
        aVar.f878g = true;
        if (OmsDialog.real_auth_success.getIdentifier().equals(str)) {
            CoreModule.c.B0.U.put(Boolean.FALSE);
            return;
        }
        if (OmsDialog.real_auth_fail.getIdentifier().equals(str)) {
            CoreModule.c.B0.V.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_succeed_popup.getIdentifier().equals(str)) {
            CoreModule.c.B0.R.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_fail_popup.getIdentifier().equals(str)) {
            CoreModule.c.B0.S.put(Boolean.FALSE);
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo1471q(C0062j.a aVar) {
        this.f830i = false;
        m1720u(aVar);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo1473s(C0062j.a aVar) {
        if (!qib0.i0.a(ic50.m16316j().m16322f().m17404Y(this.f828g, OMSEventId.get("e_swipe_before").name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        SwipeDialogOmsLimitStrategy.HandleState handleState = ic50.m16316j().m16322f().m17390K(this.f828g) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.direct;
        if (handleState == SwipeDialogOmsLimitStrategy.HandleState.direct) {
            this.f830i = false;
            aVar.f878g = true;
            m1720u(aVar);
        }
        return handleState;
    }

    /* JADX INFO: renamed from: u */
    public final void m1720u(final C0062j.a aVar) {
        ic50.m16316j().m16322f().m17426u0(aVar.f872a.m19361T4(), ic50.m16316j().m16322f().m17398S(this.f828g), true, new e30() { // from class: l.mch0
            public final void call(Object obj) {
                C0087s0.m1719t(aVar, (String) obj);
            }
        });
    }
}
