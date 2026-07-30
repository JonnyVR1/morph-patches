package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.g6a;
import l.lac0;
import l.ogl0;
import l.u59;
import l.upa;
import l.vwb;
import l.vy8;
import p009l.ic50;
import p009l.jj4;
import p009l.kzl;
import p009l.nt30;
import p009l.p3m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0062j implements p3m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f871a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j$a */
    public static class a implements kzl {

        /* JADX INFO: renamed from: a */
        public nt30 f872a;

        /* JADX INFO: renamed from: b */
        public ViewTreeObserverOnGlobalLayoutListenerC0030b f873b;

        /* JADX INFO: renamed from: c */
        public jj4 f874c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f875d;

        /* JADX INFO: renamed from: e */
        public boolean f876e;

        /* JADX INFO: renamed from: f */
        public C0158d f877f;

        /* JADX INFO: renamed from: g */
        public boolean f878g = false;

        public a(nt30 nt30Var, ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b, jj4 jj4Var, SwipeDirection swipeDirection, boolean z) {
            this.f872a = nt30Var;
            this.f873b = viewTreeObserverOnGlobalLayoutListenerC0030b;
            this.f874c = jj4Var;
            this.f875d = swipeDirection;
            this.f876e = z;
            this.f877f = HomeStatisticsHelper.m647d(jj4Var, z, nt30Var.f17697g, swipeDirection, viewTreeObserverOnGlobalLayoutListenerC0030b.m1092A2());
        }

        /* JADX INFO: renamed from: a */
        public boolean m1631a() {
            SwipeDirection swipeDirection = this.f875d;
            return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        }
    }

    public C0062j() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f871a = dialogStrategyQueue;
        if (vy8.g()) {
            dialogStrategyQueue.m1377c(new C0067k1());
        }
        if (upa.F3()) {
            dialogStrategyQueue.m1377c(new C0099y0());
        }
        if (upa.E2()) {
            dialogStrategyQueue.m1377c(new C0080p());
        }
        if (upa.J3()) {
            dialogStrategyQueue.m1377c(new C0065k());
        }
        dialogStrategyQueue.m1377c(new C0060i0());
        dialogStrategyQueue.m1377c(new C0082q());
        dialogStrategyQueue.m1377c(new C0051f0());
        dialogStrategyQueue.m1377c(new C0048e0());
        dialogStrategyQueue.m1377c(new C0101z0());
        if (upa.G2() || upa.H2()) {
            dialogStrategyQueue.m1377c(new C0056h());
        }
        dialogStrategyQueue.m1377c(new C0084r());
        if (upa.L3()) {
            dialogStrategyQueue.m1377c(new C0047e());
        }
        if (upa.Z2()) {
            dialogStrategyQueue.m1377c(new C0053g());
        }
        if (g6a.w()) {
            dialogStrategyQueue.m1377c(new C0070l1());
        }
        if (CoreModule.o.b().wf()) {
            dialogStrategyQueue.m1377c(new C0039b0());
        }
        if (upa.r1()) {
            dialogStrategyQueue.m1377c(new C0083q0());
        }
        dialogStrategyQueue.m1377c(new C0081p0());
        dialogStrategyQueue.m1377c(new C0076n1());
        dialogStrategyQueue.m1377c(new C0091u0());
        if (ogl0.o()) {
            dialogStrategyQueue.m1377c(new C0071m());
        }
        dialogStrategyQueue.m1377c(new C0040b1());
        dialogStrategyQueue.m1377c(new C0054g0());
        dialogStrategyQueue.m1377c(new C0057h0());
        dialogStrategyQueue.m1377c(new C0064j1());
        dialogStrategyQueue.m1377c(new C0055g1());
        if (!ogl0.u()) {
            dialogStrategyQueue.m1377c(new C0093v0());
            dialogStrategyQueue.m1377c(new C0095w0());
        }
        dialogStrategyQueue.m1377c(new C0043c1());
        if (u59.f0()) {
            dialogStrategyQueue.m1377c(new C0049e1());
        }
        if (u59.d0()) {
            dialogStrategyQueue.m1377c(new C0098y());
        }
        dialogStrategyQueue.m1377c(new C0052f1());
        dialogStrategyQueue.m1377c(new C0046d1());
        dialogStrategyQueue.m1377c(new C0096x());
        dialogStrategyQueue.m1377c(new C0094w());
        dialogStrategyQueue.m1377c(new C0058h1());
        dialogStrategyQueue.m1377c(new C0061i1());
        dialogStrategyQueue.m1377c(new C0092v());
        dialogStrategyQueue.m1377c(new C0037a1(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), false));
        dialogStrategyQueue.m1377c(new C0072m0(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), true));
        dialogStrategyQueue.m1377c(new C0074n(OmsDialog.p_profile_picture_popup.getIdentifier(), false));
        if (!ogl0.z()) {
            dialogStrategyQueue.m1377c(new C0089t0(OmsDialog.real_person_guide.getIdentifier(), true));
        }
        dialogStrategyQueue.m1377c(new C0075n0());
        dialogStrategyQueue.m1377c(new C0066k0());
        dialogStrategyQueue.m1377c(new C0069l0());
        dialogStrategyQueue.m1377c(new C0100z());
        dialogStrategyQueue.m1377c(new C0045d0());
        dialogStrategyQueue.m1377c(new C0042c0());
        dialogStrategyQueue.m1377c(new C0063j0());
        if (upa.R1()) {
            dialogStrategyQueue.m1377c(new C0086s());
        }
        if (upa.r3()) {
            dialogStrategyQueue.m1377c(new C0085r0());
        }
        if (lac0.m()) {
            dialogStrategyQueue.m1377c(new C0068l());
        }
        if (g6a.k()) {
            dialogStrategyQueue.m1377c(new C0088t());
        }
        if (upa.U1()) {
            dialogStrategyQueue.m1377c(new C0041c());
        }
        if (upa.f1() != null && upa.f1().activities) {
            dialogStrategyQueue.m1377c(new C0059i());
        }
        if (ogl0.T()) {
            dialogStrategyQueue.m1377c(new C0097x0());
        }
        if (upa.e2()) {
            dialogStrategyQueue.m1377c(new C0078o0());
        }
        if (upa.A()) {
            dialogStrategyQueue.m1377c(new C0044d());
        }
        if (upa.L3()) {
            dialogStrategyQueue.m1377c(new C0077o());
        }
        if (upa.c3()) {
            dialogStrategyQueue.m1377c(new C0050f());
        }
        dialogStrategyQueue.m1377c(new C0036a0());
        dialogStrategyQueue.m1377c(new C0090u());
        m1629d();
        dialogStrategyQueue.m1379e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(a aVar) {
        for (p3m p3mVar : this.f871a.m1378d()) {
            if (p3mVar instanceof AbstractC0035a) {
                AbstractC0035a abstractC0035a = (AbstractC0035a) p3mVar;
                if (abstractC0035a.mo1469b(aVar)) {
                    return abstractC0035a.mo1468a(aVar);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m1629d() {
        if (ogl0.s()) {
            List<OMSDialogInfo> listM17402W = ic50.m16316j().m16322f().m17402W("e_swipe_before", "p_suggest_users_home_view");
            if (vwb.J(listM17402W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM17402W) {
                if (NullChecker.a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    this.f871a.m1377c(new C0087s0(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(a aVar) {
        return true;
    }
}
