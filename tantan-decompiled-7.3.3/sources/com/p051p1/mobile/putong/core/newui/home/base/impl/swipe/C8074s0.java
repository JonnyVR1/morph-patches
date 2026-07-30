package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8074s0;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSEventId;
import com.p051p1.mobile.putong.data.OMSPosition;
import p153l.pk50;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.s0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8074s0 extends SwipeDialogOmsLimitStrategy {
    public C8074s0(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m38751t(C8049j.a aVar, String str) {
        aVar.f22842g = true;
        if (OmsDialog.real_auth_success.getIdentifier().equals(str)) {
            CoreModule.f18264c.f20294B0.f20489U.put(Boolean.FALSE);
            return;
        }
        if (OmsDialog.real_auth_fail.getIdentifier().equals(str)) {
            CoreModule.f18264c.f20294B0.f20490V.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_succeed_popup.getIdentifier().equals(str)) {
            CoreModule.f18264c.f20294B0.f20486R.put(Boolean.FALSE);
        } else if (OmsDialog.p_identityVerification_fail_popup.getIdentifier().equals(str)) {
            CoreModule.f18264c.f20294B0.f20487S.put(Boolean.FALSE);
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: q */
    public VSwipeStack.OnCardSwipeResult mo38503q(C8049j.a aVar) {
        this.f22794i = false;
        m38752u(aVar);
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.SwipeDialogOmsLimitStrategy
    /* JADX INFO: renamed from: s */
    public SwipeDialogOmsLimitStrategy.HandleState mo38505s(C8049j.a aVar) {
        if (!uqb0.f180403i0.m218282a(pk50.m172568j().m172574f().m181661Y(this.f22792g, OMSEventId.get(OMSEventId.e_swipe_before).name(), OMSPosition.get("p_suggest_users_home_view").name()))) {
            return SwipeDialogOmsLimitStrategy.HandleState.refuse;
        }
        SwipeDialogOmsLimitStrategy.HandleState handleState = pk50.m172568j().m172574f().m181647K(this.f22792g) ? SwipeDialogOmsLimitStrategy.HandleState.proxy : SwipeDialogOmsLimitStrategy.HandleState.direct;
        if (handleState == SwipeDialogOmsLimitStrategy.HandleState.direct) {
            this.f22794i = false;
            aVar.f22842g = true;
            m38752u(aVar);
        }
        return handleState;
    }

    /* JADX INFO: renamed from: u */
    public final void m38752u(final C8049j.a aVar) {
        pk50.m172568j().m172574f().m181683u0(aVar.f22836a.m101951T4(), pk50.m172568j().m172574f().m181655S(this.f22792g), true, new y20() { // from class: l.ukh0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8074s0.m38751t(aVar, (String) obj);
            }
        });
    }
}
