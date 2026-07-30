package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.DialogStrategyQueue;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSEventId;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.b240;
import p153l.d09;
import p153l.d79;
import p153l.e2m;
import p153l.g6m;
import p153l.gra;
import p153l.ik4;
import p153l.jyb;
import p153l.pk50;
import p153l.ric0;
import p153l.s7a;
import p153l.spl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j */
/* JADX INFO: loaded from: classes11.dex */
public class C8049j implements g6m<a, VSwipeStack.OnCardSwipeResult> {

    /* JADX INFO: renamed from: a */
    public final DialogStrategyQueue f22835a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j$a */
    public static class a implements e2m {

        /* JADX INFO: renamed from: a */
        public b240 f22836a;

        /* JADX INFO: renamed from: b */
        public ViewTreeObserverOnGlobalLayoutListenerC8017b f22837b;

        /* JADX INFO: renamed from: c */
        public ik4 f22838c;

        /* JADX INFO: renamed from: d */
        public SwipeDirection f22839d;

        /* JADX INFO: renamed from: e */
        public boolean f22840e;

        /* JADX INFO: renamed from: f */
        public C8145d f22841f;

        /* JADX INFO: renamed from: g */
        public boolean f22842g = false;

        public a(b240 b240Var, ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b, ik4 ik4Var, SwipeDirection swipeDirection, boolean z) {
            this.f22836a = b240Var;
            this.f22837b = viewTreeObserverOnGlobalLayoutListenerC8017b;
            this.f22838c = ik4Var;
            this.f22839d = swipeDirection;
            this.f22840e = z;
            this.f22841f = HomeStatisticsHelper.m37701d(ik4Var, z, b240Var.f74539g, swipeDirection, viewTreeObserverOnGlobalLayoutListenerC8017b.m38128A2());
        }

        /* JADX INFO: renamed from: a */
        public boolean m38663a() {
            SwipeDirection swipeDirection = this.f22839d;
            return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        }
    }

    public C8049j() {
        DialogStrategyQueue dialogStrategyQueue = new DialogStrategyQueue();
        this.f22835a = dialogStrategyQueue;
        if (d09.m113370g()) {
            dialogStrategyQueue.m38409c(new C8054k1());
        }
        if (gra.m131566F3()) {
            dialogStrategyQueue.m38409c(new C8086y0());
        }
        if (gra.m131560E2()) {
            dialogStrategyQueue.m38409c(new C8067p());
        }
        if (gra.m131586J3()) {
            dialogStrategyQueue.m38409c(new C8052k());
        }
        dialogStrategyQueue.m38409c(new C8047i0());
        dialogStrategyQueue.m38409c(new C8069q());
        dialogStrategyQueue.m38409c(new C8038f0());
        dialogStrategyQueue.m38409c(new C8035e0());
        dialogStrategyQueue.m38409c(new C8088z0());
        if (gra.m131570G2() || gra.m131575H2()) {
            dialogStrategyQueue.m38409c(new C8043h());
        }
        dialogStrategyQueue.m38409c(new C8071r());
        if (gra.m131596L3()) {
            dialogStrategyQueue.m38409c(new C8034e());
        }
        if (gra.m131654Z2()) {
            dialogStrategyQueue.m38409c(new C8040g());
        }
        if (s7a.m184994w()) {
            dialogStrategyQueue.m38409c(new C8057l1());
        }
        if (CoreModule.f18276o.m132212b().mo34652wf()) {
            dialogStrategyQueue.m38409c(new C8026b0());
        }
        if (gra.m131740r1()) {
            dialogStrategyQueue.m38409c(new C8070q0());
        }
        dialogStrategyQueue.m38409c(new C8068p0());
        dialogStrategyQueue.m38409c(new C8063n1());
        dialogStrategyQueue.m38409c(new C8078u0());
        if (spl0.m187389o()) {
            dialogStrategyQueue.m38409c(new C8058m());
        }
        dialogStrategyQueue.m38409c(new C8027b1());
        dialogStrategyQueue.m38409c(new C8041g0());
        dialogStrategyQueue.m38409c(new C8044h0());
        dialogStrategyQueue.m38409c(new C8051j1());
        dialogStrategyQueue.m38409c(new C8042g1());
        if (!spl0.m187395u()) {
            dialogStrategyQueue.m38409c(new C8080v0());
            dialogStrategyQueue.m38409c(new C8082w0());
        }
        dialogStrategyQueue.m38409c(new C8030c1());
        if (d79.m114685j0()) {
            dialogStrategyQueue.m38409c(new C8036e1());
        }
        if (d79.m114675e0()) {
            dialogStrategyQueue.m38409c(new C8085y());
        }
        dialogStrategyQueue.m38409c(new C8039f1());
        dialogStrategyQueue.m38409c(new C8033d1());
        dialogStrategyQueue.m38409c(new C8083x());
        dialogStrategyQueue.m38409c(new C8081w());
        dialogStrategyQueue.m38409c(new C8045h1());
        dialogStrategyQueue.m38409c(new C8048i1());
        dialogStrategyQueue.m38409c(new C8079v());
        dialogStrategyQueue.m38409c(new C8024a1(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), false));
        dialogStrategyQueue.m38409c(new C8059m0(OmsDialog.p_alert_positioning_authority_open_guide_popup.getIdentifier(), true));
        dialogStrategyQueue.m38409c(new C8061n(OmsDialog.p_profile_picture_popup.getIdentifier(), false));
        if (!spl0.m187400z()) {
            dialogStrategyQueue.m38409c(new C8076t0(OmsDialog.real_person_guide.getIdentifier(), true));
        }
        dialogStrategyQueue.m38409c(new C8062n0());
        dialogStrategyQueue.m38409c(new C8053k0());
        dialogStrategyQueue.m38409c(new C8056l0());
        dialogStrategyQueue.m38409c(new C8087z());
        dialogStrategyQueue.m38409c(new C8032d0());
        dialogStrategyQueue.m38409c(new C8029c0());
        dialogStrategyQueue.m38409c(new C8050j0());
        if (gra.m131621R1()) {
            dialogStrategyQueue.m38409c(new C8073s());
        }
        if (gra.m131742r3()) {
            dialogStrategyQueue.m38409c(new C8072r0());
        }
        if (ric0.m181583m()) {
            dialogStrategyQueue.m38409c(new C8055l());
        }
        if (s7a.m184982k()) {
            dialogStrategyQueue.m38409c(new C8075t());
        }
        if (gra.m131633U1()) {
            dialogStrategyQueue.m38409c(new C8028c());
        }
        if (gra.m131680f1() != null && gra.m131680f1().activities) {
            dialogStrategyQueue.m38409c(new C8046i());
        }
        if (spl0.m187368T()) {
            dialogStrategyQueue.m38409c(new C8084x0());
        }
        if (gra.m131676e2()) {
            dialogStrategyQueue.m38409c(new C8065o0());
        }
        if (gra.m131537A()) {
            dialogStrategyQueue.m38409c(new C8031d());
        }
        if (gra.m131596L3()) {
            dialogStrategyQueue.m38409c(new C8064o());
        }
        if (gra.m131667c3()) {
            dialogStrategyQueue.m38409c(new C8037f());
        }
        dialogStrategyQueue.m38409c(new C8023a0());
        dialogStrategyQueue.m38409c(new C8077u());
        m38661d();
        dialogStrategyQueue.m38411e(DialogStrategyQueue.StrategyType.swipe);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(a aVar) {
        for (g6m g6mVar : this.f22835a.m38410d()) {
            if (g6mVar instanceof AbstractC8022a) {
                AbstractC8022a abstractC8022a = (AbstractC8022a) g6mVar;
                if (abstractC8022a.mo38501b(aVar)) {
                    return abstractC8022a.mo38500a(aVar);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m38661d() {
        if (spl0.m187393s()) {
            List<OMSDialogInfo> listM181659W = pk50.m172568j().m172574f().m181659W(OMSEventId.e_swipe_before, "p_suggest_users_home_view");
            if (jyb.m147479J(listM181659W)) {
                return;
            }
            for (OMSDialogInfo oMSDialogInfo : listM181659W) {
                if (NullChecker.m82486a(oMSDialogInfo) && !TEnum.equals(oMSDialogInfo.contentType, "local")) {
                    this.f22835a.m38409c(new C8074s0(oMSDialogInfo.identifier, !oMSDialogInfo.constraint.userDimension));
                }
            }
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(a aVar) {
        return true;
    }
}
