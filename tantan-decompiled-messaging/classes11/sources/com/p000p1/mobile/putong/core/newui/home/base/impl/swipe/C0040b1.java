package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.g30;
import l.mb90;
import l.mkd0;
import l.ogl0;
import l.roj0;
import l.rxg0;
import l.swh0;
import l.u59;
import l.wge0;
import p009l.e5m;
import p009l.nbp;
import p009l.nt30;
import v.VFrame;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0040b1 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f841g = false;

    /* JADX INFO: renamed from: J */
    public static void m1511J(boolean z) {
        f841g = z;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m1520A(C0062j.a aVar, PurchaseType purchaseType, Act act, String str) {
        m1533y(aVar);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m1523D(C0062j.a aVar, roj0 roj0Var) {
        m1527H(aVar);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m1524E(C0062j.a aVar, Throwable th) {
        m1527H(aVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m1527H(final C0062j.a aVar) {
        if (IntlCountryCodeController.v()) {
            m1526G(aVar);
            return;
        }
        if (NullChecker.a(aVar.f873b)) {
            if (!aVar.f873b.m1310q2().isAdded()) {
                e51.H(aVar.f873b.act(), new Runnable() { // from class: l.ldh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16099a.m1525F(aVar);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17127a())) ? aVar.f874c.m17127a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC0030b.f698c;
            if (cardView == null || vFrame == null) {
                m1526G(aVar);
            } else {
                new nbp(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), vFrame).m18835i(cardView, new Runnable() { // from class: l.mdh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16811a.m1526G(aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void m1525F(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded()) {
            m1533y(aVar);
        } else {
            m1526G(aVar);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (f841g) {
            f841g = false;
            return false;
        }
        boolean z = aVar.f875d == SwipeDirection.UP;
        if (z && NullChecker.a(aVar.f874c.m17131e()) && aVar.f874c.m17131e().isLivingCard() && !CoreModule.Q().m9071t7().m18210a()) {
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = m1479h().superLikeLimit;
        if (u59.f0() && z && aVar.f872a.m19441j6(((DbObject) aVar.f874c.m17130d()).id)) {
            return false;
        }
        if (ogl0.Z()) {
            return z && (swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.f().d(((DbObject) aVar.f874c.m17130d()).id) || swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) && !(NullChecker.a(aVar.f874c.m17130d()) && TextUtils.equals(((DbObject) aVar.f874c.m17130d()).id, rxg0.j().m));
        }
        return z && swh0.w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m1521B(C0062j.a aVar, String str) {
        c.M1(aVar.f873b.act(), str, Privilege.vip_super_like, (d30) null, (d30) null, false, aVar.f874c.m17130d());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void m1526G(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded() && NullChecker.a(aVar.f873b.m1092A2())) {
            C0045d0.m1559y(true);
            m1511J(true);
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        User userM1485n = m1485n();
        final String strM19239p5 = nt30.m19239p5();
        if (TextUtils.isEmpty(strM19239p5)) {
            strM19239p5 = "p_home,superlike";
        }
        if (mb90.c(userM1485n, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.a0()) {
            final int iD = wge0.f().d(((DbObject) aVar.f874c.m17130d()).id);
            if (!ogl0.Z() || iD <= 1) {
                c.G1(aVar.f873b.act(), strM19239p5, 1, new g30() { // from class: l.gdh0
                    /* JADX INFO: renamed from: a */
                    public final void m14914a(Object obj, Object obj2, Object obj3) {
                        this.f13444a.m1520A(aVar, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            } else {
                c.G1(aVar.f873b.act(), strM19239p5, iD, new g30() { // from class: l.fdh0
                    /* JADX INFO: renamed from: a */
                    public final void m14382a(Object obj, Object obj2, Object obj3) {
                        aVar.f873b.m1293m6(iD);
                    }
                });
            }
            aVar.f872a.m19348P8(aVar.f877f, "failExhaustSuperlike");
        } else {
            if (NullChecker.a(aVar.f873b.m1092A2().mo2805d()) && (aVar.f873b.m1092A2().mo2805d() instanceof e5m)) {
                e51.H(aVar.f873b.act(), new Runnable() { // from class: l.hdh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13982a.m1521B(aVar, strM19239p5);
                    }
                }, 280L);
            } else {
                m1521B(aVar, strM19239p5);
            }
            aVar.f872a.m19348P8(aVar.f877f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: y */
    public final void m1533y(final C0062j.a aVar) {
        m1511J(true);
        if (NullChecker.a(aVar.f873b)) {
            e51.F(aVar.f873b.act(), new Runnable() { // from class: l.idh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14493a.m1522C(aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void m1522C(final C0062j.a aVar) {
        CoreModule.c.e0.H9().compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.jdh0
            public final void call(Object obj) {
                this.f15063a.m1523D(aVar, (roj0) obj);
            }
        }, new e30() { // from class: l.kdh0
            public final void call(Object obj) {
                this.f15612a.m1524E(aVar, (Throwable) obj);
            }
        }));
    }
}
