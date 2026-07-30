package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.gxg0;
import p149l.swh0;
import p149l.szd;
import p149l.u59;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z */
/* JADX INFO: loaded from: classes11.dex */
public class C7936z extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public szd f22146g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m37813z(final C7898j.a aVar) {
        m37817u(aVar, new d30() { // from class: l.yah0
            @Override // p149l.d30
            public final void call() {
                this.f197207a.m37818v();
            }
        }, new d30() { // from class: l.zah0
            @Override // p149l.d30
            public final void call() {
                this.f202363a.m37812y(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m37812y(C7898j.a aVar) {
        m37818v();
        if (NullChecker.m81303a(aVar.f22095b) && NullChecker.m81303a(aVar.f22096c) && aVar.f22095b.m37341q2().isAdded()) {
            if (NullChecker.m81303a(aVar.f22096c.m141742a()) && NullChecker.m81303a(aVar.f22096c.m141742a().getCardData()) && NullChecker.m81303a(aVar.f22096c.m141742a().getCardData().m141746e())) {
                aVar.f22096c.m141742a().getCardData().m141746e().intlInsertCardData = null;
            }
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (aVar.f22097d == SwipeDirection.RIGHT && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19408e2) && NullChecker.m81303a(aVar.f22096c)) {
            return CoreModule.f17545c.f19663m0.f19408e2.m34221z3(aVar.f22096c.m141746e());
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m37816D(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded()) {
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m37817u(final C7898j.a aVar, d30 d30Var, d30 d30Var2) {
        if (NullChecker.m81303a(d30Var) && NullChecker.m81303a(d30Var2)) {
            if (aVar == null) {
                d30Var2.call();
                return;
            }
            if (!NullChecker.m81303a(aVar.f22094a) || !NullChecker.m81303a(aVar.f22096c)) {
                d30Var2.call();
                return;
            }
            User userM37514n = m37514n();
            if (!NullChecker.m81303a(userM37514n)) {
                d30Var2.call();
                return;
            }
            NewMainAct newMainActM161157T4 = aVar.f22094a.m161157T4();
            if (!NullChecker.m81303a(newMainActM161157T4) || newMainActM161157T4.isFinishing() || newMainActM161157T4.isDestroyed()) {
                d30Var2.call();
                return;
            }
            if (!userM37514n.isVIP() && !u59.m191818a0()) {
                C8764c.m53412M1(newMainActM161157T4, "p_home,superlike", Privilege.vip_super_like, null, null, false, aVar.f22096c.m141745d());
                return;
            }
            boolean zM186203L1 = swh0.m186203L1();
            boolean zM186200J1 = swh0.m186200J1();
            boolean zM186316j1 = swh0.m186255p0().m186316j1();
            if (!zM186203L1) {
                d30Var.call();
                m37816D(aVar);
            } else if (zM186200J1 && zM186316j1) {
                d30Var.call();
                swh0.m186180B1(newMainActM161157T4, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.abh0
                    @Override // p149l.d30
                    public final void call() {
                        this.f68668a.m37820x(aVar);
                    }
                }, d30Var2);
            } else if (!zM186200J1) {
                C8764c.m53391F1(newMainActM161157T4, "p_home,superlike");
            } else {
                d30Var.call();
                m37816D(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m37818v() {
        if (NullChecker.m81303a(this.f22146g) && this.f22146g.isShowing()) {
            this.f22146g.dismiss();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        if (aVar.f22097d != SwipeDirection.RIGHT || !CoreModule.f17545c.f19663m0.f19408e2.m34221z3(aVar.f22096c.m141746e())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.m81303a(aVar.f22094a) || !NullChecker.m81303a(aVar.f22096c.m141745d())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.m81303a(CoreModule.f17545c.m31484o3())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!CoreModule.f17545c.f19663m0.f19454u0.get().booleanValue()) {
            CoreModule.f17545c.f19663m0.f19454u0.put(Boolean.TRUE);
        }
        szd szdVarM128611t = gxg0.m128611t(aVar.f22094a.m161157T4(), aVar.f22096c.m141745d().name, CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() + "", new Runnable() { // from class: l.wah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185466a.m37813z(aVar);
            }
        }, new Runnable() { // from class: l.xah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191744a.m37806A(aVar);
            }
        });
        this.f22146g = szdVarM128611t;
        return szdVarM128611t == null ? VSwipeStack.OnCardSwipeResult.pass : VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m37820x(C7898j.a aVar) {
        aVar.f22094a.m161181X8(true);
        swh0.m186255p0().m186305Y0();
        m37816D(aVar);
    }
}
