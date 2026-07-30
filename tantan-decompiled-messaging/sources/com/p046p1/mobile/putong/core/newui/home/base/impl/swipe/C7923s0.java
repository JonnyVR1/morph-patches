package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7923s0;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSEventId;
import com.p046p1.mobile.putong.data.OMSPosition;
import p149l.e30;
import p149l.ic50;
import p149l.qib0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.s0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7923s0 extends SwipeDialogOmsLimitStrategy {
    public C7923s0(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m37748t(C7898j.a aVar, String str) {
        aVar.f22100g = true;
        if (OmsDialog.real_auth_success.getIdentifier().equals(str)) {
            CoreModule.f17545c.f19552B0.f19747U.put(Boolean.FALSE);
            return;
        }
        if (OmsDialog.real_auth_fail.getIdentifier().equals(str)) {
            CoreModule.f17545c.f19552B0.f19748V.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_succeed_popup.getIdentifier().equals(str)) {
            CoreModule.f17545c.f19552B0.f19744R.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_fail_popup.getIdentifier().equals(str)) {
            CoreModule.f17545c.f19552B0.f19745S.put(Boolean.FALSE);
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo37500q(C7898j.a aVar) {
        this.f22052i = false;
        m37749u(aVar);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo37502s(C7898j.a aVar) {
        if (!qib0.f154720i0.m196493a(ic50.m135327j().m135333f().m145238Y(this.f22050g, OMSEventId.get(OMSEventId.e_swipe_before).name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        SwipeDialogOmsLimitStrategy.HandleState handleState = ic50.m135327j().m135333f().m145224K(this.f22050g) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.direct;
        if (handleState == SwipeDialogOmsLimitStrategy.HandleState.direct) {
            this.f22052i = false;
            aVar.f22100g = true;
            m37749u(aVar);
        }
        return handleState;
    }

    /* JADX INFO: renamed from: u */
    public final void m37749u(final C7898j.a aVar) {
        ic50.m135327j().m135333f().m145260u0(aVar.f22094a.m161157T4(), ic50.m135327j().m135333f().m145232S(this.f22050g), true, new e30() { // from class: l.mch0
            @Override // p149l.e30
            public final void call(Object obj) {
                C7923s0.m37748t(aVar, (String) obj);
            }
        });
    }
}
