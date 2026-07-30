package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.a5i0;
import p153l.d79;
import p153l.g1e;
import p153l.o5h0;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z */
/* JADX INFO: loaded from: classes11.dex */
public class C8087z extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public g1e f22888g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m38816z(final C8049j.a aVar) {
        m38820u(aVar, new x20() { // from class: l.gjh0
            @Override // p153l.x20
            public final void call() {
                this.f104632a.m38821v();
            }
        }, new x20() { // from class: l.hjh0
            @Override // p153l.x20
            public final void call() {
                this.f110221a.m38815y(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m38815y(C8049j.a aVar) {
        m38821v();
        if (NullChecker.m82486a(aVar.f22837b) && NullChecker.m82486a(aVar.f22838c) && aVar.f22837b.m38344q2().isAdded()) {
            if (NullChecker.m82486a(aVar.f22838c.m140256a()) && NullChecker.m82486a(aVar.f22838c.m140256a().getCardData()) && NullChecker.m82486a(aVar.f22838c.m140256a().getCardData().m140260e())) {
                aVar.f22838c.m140256a().getCardData().m140260e().intlInsertCardData = null;
            }
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (aVar.f22839d == SwipeDirection.RIGHT && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20150e2) && NullChecker.m82486a(aVar.f22838c)) {
            return CoreModule.f18264c.f20405m0.f20150e2.m35224z3(aVar.f22838c.m140260e());
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m38819D(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded()) {
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m38820u(final C8049j.a aVar, x20 x20Var, x20 x20Var2) {
        if (NullChecker.m82486a(x20Var) && NullChecker.m82486a(x20Var2)) {
            if (aVar == null) {
                x20Var2.call();
                return;
            }
            if (!NullChecker.m82486a(aVar.f22836a) || !NullChecker.m82486a(aVar.f22838c)) {
                x20Var2.call();
                return;
            }
            User userM38517n = m38517n();
            if (!NullChecker.m82486a(userM38517n)) {
                x20Var2.call();
                return;
            }
            NewMainAct newMainActM101951T4 = aVar.f22836a.m101951T4();
            if (!NullChecker.m82486a(newMainActM101951T4) || newMainActM101951T4.isFinishing() || newMainActM101951T4.isDestroyed()) {
                x20Var2.call();
                return;
            }
            if (!userM38517n.isVIP() && !d79.m114669b0()) {
                C8927c.m54595M1(newMainActM101951T4, "p_home,superlike", Privilege.vip_super_like, null, null, false, aVar.f22838c.m140259d());
                return;
            }
            boolean zM96108L1 = a5i0.m96108L1();
            boolean zM96105J1 = a5i0.m96105J1();
            boolean zM96221j1 = a5i0.m96160p0().m96221j1();
            if (!zM96108L1) {
                x20Var.call();
                m38819D(aVar);
            } else if (zM96105J1 && zM96221j1) {
                x20Var.call();
                a5i0.m96085B1(newMainActM101951T4, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new x20() { // from class: l.ijh0
                    @Override // p153l.x20
                    public final void call() {
                        this.f115222a.m38823x(aVar);
                    }
                }, x20Var2);
            } else if (!zM96105J1) {
                C8927c.m54574F1(newMainActM101951T4, "p_home,superlike");
            } else {
                x20Var.call();
                m38819D(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m38821v() {
        if (NullChecker.m82486a(this.f22888g) && this.f22888g.isShowing()) {
            this.f22888g.dismiss();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        if (aVar.f22839d != SwipeDirection.RIGHT || !CoreModule.f18264c.f20405m0.f20150e2.m35224z3(aVar.f22838c.m140260e())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.m82486a(aVar.f22836a) || !NullChecker.m82486a(aVar.f22838c.m140259d())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.m82486a(CoreModule.f18264c.m32487o3())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!CoreModule.f18264c.f20405m0.f20196u0.get().booleanValue()) {
            CoreModule.f18264c.f20405m0.f20196u0.put(Boolean.TRUE);
        }
        g1e g1eVarM166147t = o5h0.m166147t(aVar.f22836a.m101951T4(), aVar.f22838c.m140259d().name, CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() + "", new Runnable() { // from class: l.ejh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f94302a.m38816z(aVar);
            }
        }, new Runnable() { // from class: l.fjh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99334a.m38809A(aVar);
            }
        });
        this.f22888g = g1eVarM166147t;
        return g1eVarM166147t == null ? VSwipeStack.OnCardSwipeResult.pass : VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m38823x(C8049j.a aVar) {
        aVar.f22836a.m101975X8(true);
        a5i0.m96160p0().m96210Y0();
        m38819D(aVar);
    }
}
