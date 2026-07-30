package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSEventId;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.g6a;
import p149l.ic50;
import p149l.jj4;
import p149l.kzl;
import p149l.lac0;
import p149l.nt30;
import p149l.ogl0;
import p149l.p3m;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.vy8;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j */
/* JADX INFO: loaded from: classes11.dex */
public class C7898j implements p3m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f22093a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j$a */
    public static class a implements kzl {

        /* JADX INFO: renamed from: a */
        public nt30 f22094a;

        /* JADX INFO: renamed from: b */
        public ViewTreeObserverOnGlobalLayoutListenerC7866b f22095b;

        /* JADX INFO: renamed from: c */
        public jj4 f22096c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f22097d;

        /* JADX INFO: renamed from: e */
        public boolean f22098e;

        /* JADX INFO: renamed from: f */
        public C7994d f22099f;

        /* JADX INFO: renamed from: g */
        public boolean f22100g = false;

        public a(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f22094a = nt30Var;
            this.f22095b = viewTreeObserverOnGlobalLayoutListenerC7866b;
            this.f22096c = jj4Var;
            this.f22097d = swipeDirection;
            this.f22098e = z;
            this.f22099f = HomeStatisticsHelper.m36698d(jj4Var, z, nt30Var.f140387g, swipeDirection, viewTreeObserverOnGlobalLayoutListenerC7866b.m37125A2());
        }

        /* JADX INFO: renamed from: a */
        public boolean m37660a() {
            SwipeDirection swipeDirection = this.f22097d;
            return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        }
    }

    public C7898j() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f22093a = dialogStrategyQueue;
        if (vy8.m200609g()) {
            dialogStrategyQueue.m37406c(new C7903k1());
        }
        if (upa.m194635F3()) {
            dialogStrategyQueue.m37406c(new C7935y0());
        }
        if (upa.m194629E2()) {
            dialogStrategyQueue.m37406c(new C7916p());
        }
        if (upa.m194655J3()) {
            dialogStrategyQueue.m37406c(new C7901k());
        }
        dialogStrategyQueue.m37406c(new C7896i0());
        dialogStrategyQueue.m37406c(new C7918q());
        dialogStrategyQueue.m37406c(new C7887f0());
        dialogStrategyQueue.m37406c(new C7884e0());
        dialogStrategyQueue.m37406c(new C7937z0());
        if (upa.m194639G2() || upa.m194644H2()) {
            dialogStrategyQueue.m37406c(new C7892h());
        }
        dialogStrategyQueue.m37406c(new C7920r());
        if (upa.m194665L3()) {
            dialogStrategyQueue.m37406c(new C7883e());
        }
        if (upa.m194723Z2()) {
            dialogStrategyQueue.m37406c(new C7889g());
        }
        if (g6a.m124574w()) {
            dialogStrategyQueue.m37406c(new C7906l1());
        }
        if (CoreModule.f17557o.m195055b().mo33649wf()) {
            dialogStrategyQueue.m37406c(new C7875b0());
        }
        if (upa.m194809r1()) {
            dialogStrategyQueue.m37406c(new C7919q0());
        }
        dialogStrategyQueue.m37406c(new C7917p0());
        dialogStrategyQueue.m37406c(new C7912n1());
        dialogStrategyQueue.m37406c(new C7927u0());
        if (ogl0.m164262o()) {
            dialogStrategyQueue.m37406c(new C7907m());
        }
        dialogStrategyQueue.m37406c(new C7876b1());
        dialogStrategyQueue.m37406c(new C7890g0());
        dialogStrategyQueue.m37406c(new C7893h0());
        dialogStrategyQueue.m37406c(new C7900j1());
        dialogStrategyQueue.m37406c(new C7891g1());
        if (!ogl0.m164268u()) {
            dialogStrategyQueue.m37406c(new C7929v0());
            dialogStrategyQueue.m37406c(new C7931w0());
        }
        dialogStrategyQueue.m37406c(new C7879c1());
        if (u59.m191827f0()) {
            dialogStrategyQueue.m37406c(new C7885e1());
        }
        if (u59.m191823d0()) {
            dialogStrategyQueue.m37406c(new C7934y());
        }
        dialogStrategyQueue.m37406c(new C7888f1());
        dialogStrategyQueue.m37406c(new C7882d1());
        dialogStrategyQueue.m37406c(new C7932x());
        dialogStrategyQueue.m37406c(new C7930w());
        dialogStrategyQueue.m37406c(new C7894h1());
        dialogStrategyQueue.m37406c(new C7897i1());
        dialogStrategyQueue.m37406c(new C7928v());
        dialogStrategyQueue.m37406c(new C7873a1(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), false));
        dialogStrategyQueue.m37406c(new C7908m0(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), true));
        dialogStrategyQueue.m37406c(new C7910n(OmsDialog.p_profile_picture_popup.getIdentifier(), false));
        if (!ogl0.m164273z()) {
            dialogStrategyQueue.m37406c(new C7925t0(OmsDialog.real_person_guide.getIdentifier(), true));
        }
        dialogStrategyQueue.m37406c(new C7911n0());
        dialogStrategyQueue.m37406c(new C7902k0());
        dialogStrategyQueue.m37406c(new C7905l0());
        dialogStrategyQueue.m37406c(new C7936z());
        dialogStrategyQueue.m37406c(new C7881d0());
        dialogStrategyQueue.m37406c(new C7878c0());
        dialogStrategyQueue.m37406c(new C7899j0());
        if (upa.m194690R1()) {
            dialogStrategyQueue.m37406c(new C7922s());
        }
        if (upa.m194811r3()) {
            dialogStrategyQueue.m37406c(new C7921r0());
        }
        if (lac0.m149136m()) {
            dialogStrategyQueue.m37406c(new C7904l());
        }
        if (g6a.m124562k()) {
            dialogStrategyQueue.m37406c(new C7924t());
        }
        if (upa.m194702U1()) {
            dialogStrategyQueue.m37406c(new C7877c());
        }
        if (upa.m194749f1() != null && upa.m194749f1().activities) {
            dialogStrategyQueue.m37406c(new C7895i());
        }
        if (ogl0.m164241T()) {
            dialogStrategyQueue.m37406c(new C7933x0());
        }
        if (upa.m194745e2()) {
            dialogStrategyQueue.m37406c(new C7914o0());
        }
        if (upa.m194606A()) {
            dialogStrategyQueue.m37406c(new C7880d());
        }
        if (upa.m194665L3()) {
            dialogStrategyQueue.m37406c(new C7913o());
        }
        if (upa.m194736c3()) {
            dialogStrategyQueue.m37406c(new C7886f());
        }
        dialogStrategyQueue.m37406c(new C7872a0());
        dialogStrategyQueue.m37406c(new C7926u());
        m37658d();
        dialogStrategyQueue.m37408e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(a aVar) {
        for (p3m p3mVar : this.f22093a.m37407d()) {
            if (p3mVar instanceof AbstractC7871a) {
                AbstractC7871a abstractC7871a = (AbstractC7871a) p3mVar;
                if (abstractC7871a.mo37498b(aVar)) {
                    return abstractC7871a.mo37497a(aVar);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m37658d() {
        if (ogl0.m164266s()) {
            List<OMSDialogInfo> listM145236W = ic50.m135327j().m135333f().m145236W(OMSEventId.e_swipe_before, "p_suggest_users_home_view");
            if (vwb.m200296J(listM145236W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM145236W) {
                if (NullChecker.m81303a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    this.f22093a.m37406c(new C7923s0(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(a aVar) {
        return true;
    }
}
