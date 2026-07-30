package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.cdq0;
import l.d30;
import l.gxg0;
import l.swh0;
import l.szd;
import l.u59;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.z */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0100z extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public szd f924g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m1784z(final C0062j.a aVar) {
        m1788u(aVar, new d30() { // from class: l.yah0
            public final void call() {
                this.f22951a.m1789v();
            }
        }, new d30() { // from class: l.zah0
            public final void call() {
                this.f23536a.m1783y(aVar);
            }
        });
    }

    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m1783y(C0062j.a aVar) {
        m1789v();
        if (NullChecker.a(aVar.f873b) && NullChecker.a(aVar.f874c) && aVar.f873b.m1310q2().isAdded()) {
            if (NullChecker.a(aVar.f874c.m17127a()) && NullChecker.a(aVar.f874c.m17127a().getCardData()) && NullChecker.a(aVar.f874c.m17127a().getCardData().m17131e())) {
                aVar.f874c.m17127a().getCardData().m17131e().intlInsertCardData = null;
            }
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (aVar.f875d == SwipeDirection.RIGHT && NullChecker.a(CoreModule.c.m0.e2) && NullChecker.a(aVar.f874c)) {
            return CoreModule.c.m0.e2.z3(aVar.f874c.m17131e());
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m1787D(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded()) {
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1788u(final C0062j.a aVar, d30 d30Var, d30 d30Var2) {
        if (NullChecker.a(d30Var) && NullChecker.a(d30Var2)) {
            if (aVar == null) {
                d30Var2.call();
                return;
            }
            if (!NullChecker.a(aVar.f872a) || !NullChecker.a(aVar.f874c)) {
                d30Var2.call();
                return;
            }
            User userM1485n = m1485n();
            if (!NullChecker.a(userM1485n)) {
                d30Var2.call();
                return;
            }
            cdq0 cdq0VarM19361T4 = aVar.f872a.m19361T4();
            if (!NullChecker.a(cdq0VarM19361T4) || cdq0VarM19361T4.isFinishing() || cdq0VarM19361T4.isDestroyed()) {
                d30Var2.call();
                return;
            }
            if (!userM1485n.isVIP() && !u59.a0()) {
                c.M1(cdq0VarM19361T4, "p_home,superlike", Privilege.vip_super_like, (d30) null, (d30) null, false, aVar.f874c.m17130d());
                return;
            }
            boolean zL1 = swh0.L1();
            boolean zJ1 = swh0.J1();
            boolean zJ2 = swh0.p0().j1();
            if (!zL1) {
                d30Var.call();
                m1787D(aVar);
            } else if (zJ1 && zJ2) {
                d30Var.call();
                swh0.B1(cdq0VarM19361T4, PurchaseType.TYPE_GET_VIP_SUPERLIKE, new d30() { // from class: l.abh0
                    public final void call() {
                        this.f9365a.m1791x(aVar);
                    }
                }, d30Var2);
            } else if (!zJ1) {
                c.F1(cdq0VarM19361T4, "p_home,superlike");
            } else {
                d30Var.call();
                m1787D(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1789v() {
        if (NullChecker.a(this.f924g) && this.f924g.isShowing()) {
            this.f924g.dismiss();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        if (aVar.f875d != SwipeDirection.RIGHT || !CoreModule.c.m0.e2.z3(aVar.f874c.m17131e())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.a(aVar.f872a) || !NullChecker.a(aVar.f874c.m17130d())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!NullChecker.a(CoreModule.c.o3())) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (!((Boolean) CoreModule.c.m0.u0.get()).booleanValue()) {
            CoreModule.c.m0.u0.put(Boolean.TRUE);
        }
        szd szdVarT = gxg0.t(aVar.f872a.m19361T4(), aVar.f874c.m17130d().name, CoreModule.c.o3().superLikeLimit.remainToday() + "", new Runnable() { // from class: l.wah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21968a.m1784z(aVar);
            }
        }, new Runnable() { // from class: l.xah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22486a.m1777A(aVar);
            }
        });
        this.f924g = szdVarT;
        return szdVarT == null ? VSwipeStack.OnCardSwipeResult.pass : VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m1791x(C0062j.a aVar) {
        aVar.f872a.m19385X8(true);
        swh0.p0().Y0();
        m1787D(aVar);
    }
}
