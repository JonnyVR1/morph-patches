package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.e30;
import p149l.e51;
import p149l.e5m;
import p149l.g30;
import p149l.mb90;
import p149l.mkd0;
import p149l.nbp;
import p149l.nt30;
import p149l.ogl0;
import p149l.roj0;
import p149l.rxg0;
import p149l.swh0;
import p149l.u59;
import p149l.wge0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7876b1 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f22063g = false;

    /* JADX INFO: renamed from: J */
    public static void m37540J(boolean z) {
        f22063g = z;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m37549A(C7898j.a aVar, PurchaseType purchaseType, Act act, String str) {
        m37562y(aVar);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m37552D(C7898j.a aVar, roj0 roj0Var) {
        m37556H(aVar);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m37553E(C7898j.a aVar, Throwable th) {
        m37556H(aVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m37556H(final C7898j.a aVar) {
        if (IntlCountryCodeController.m28126v()) {
            m37555G(aVar);
            return;
        }
        if (NullChecker.m81303a(aVar.f22095b)) {
            if (!aVar.f22095b.m37341q2().isAdded()) {
                e51.m114743H(aVar.f22095b.act(), new Runnable() { // from class: l.ldh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f127551a.m37554F(aVar);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141742a())) ? aVar.f22096c.m141742a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC7866b.f21920c;
            if (cardView == null || vFrame == null) {
                m37555G(aVar);
            } else {
                new nbp(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), vFrame).m158826i(cardView, new Runnable() { // from class: l.mdh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f133238a.m37555G(aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void m37554F(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded()) {
            m37562y(aVar);
        } else {
            m37555G(aVar);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (f22063g) {
            f22063g = false;
            return false;
        }
        boolean z = aVar.f22097d == SwipeDirection.UP;
        if (z && NullChecker.m81303a(aVar.f22096c.m141746e()) && aVar.f22096c.m141746e().isLivingCard() && !CoreModule.m29936Q().mo67286t7().mo152520a()) {
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = m37508h().superLikeLimit;
        if (u59.m191827f0() && z && aVar.f22094a.m161235j6(aVar.f22096c.m141745d().f56011id)) {
            return false;
        }
        if (ogl0.m164247Z()) {
            return z && (swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) < wge0.m203034f().m203037d(aVar.f22096c.m141745d().f56011id) || swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) && !(NullChecker.m81303a(aVar.f22096c.m141745d()) && TextUtils.equals(aVar.f22096c.m141745d().f56011id, rxg0.m181572j().f161468m));
        }
        return z && swh0.m186273w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m37550B(C7898j.a aVar, String str) {
        C8764c.m53412M1(aVar.f22095b.act(), str, Privilege.vip_super_like, null, null, false, aVar.f22096c.m141745d());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void m37555G(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded() && NullChecker.m81303a(aVar.f22095b.m37125A2())) {
            C7881d0.m37588y(true);
            m37540J(true);
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        User userM37514n = m37514n();
        final String strM161035p5 = nt30.m161035p5();
        if (TextUtils.isEmpty(strM161035p5)) {
            strM161035p5 = "p_home,superlike";
        }
        if (mb90.m153867c(userM37514n, PurchaseType.TYPE_SUPERLIKE_PKG) || u59.m191818a0()) {
            final int iM203037d = wge0.m203034f().m203037d(aVar.f22096c.m141745d().f56011id);
            if (!ogl0.m164247Z() || iM203037d <= 1) {
                C8764c.m53394G1(aVar.f22095b.act(), strM161035p5, 1, new g30() { // from class: l.gdh0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        this.f102114a.m37549A(aVar, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            } else {
                C8764c.m53394G1(aVar.f22095b.act(), strM161035p5, iM203037d, new g30() { // from class: l.fdh0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        aVar.f22095b.m37324m6(iM203037d);
                    }
                });
            }
            aVar.f22094a.m161144P8(aVar.f22099f, "failExhaustSuperlike");
        } else {
            if (NullChecker.m81303a(aVar.f22095b.m37125A2().mo38809d()) && (aVar.f22095b.m37125A2().mo38809d() instanceof e5m)) {
                e51.m114743H(aVar.f22095b.act(), new Runnable() { // from class: l.hdh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f107246a.m37550B(aVar, strM161035p5);
                    }
                }, 280L);
            } else {
                m37550B(aVar, strM161035p5);
            }
            aVar.f22094a.m161144P8(aVar.f22099f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: y */
    public final void m37562y(final C7898j.a aVar) {
        m37540J(true);
        if (NullChecker.m81303a(aVar.f22095b)) {
            e51.m114741F(aVar.f22095b.act(), new Runnable() { // from class: l.idh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112555a.m37551C(aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void m37551C(final C7898j.a aVar) {
        CoreModule.f17545c.f19639e0.m169397H9().compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.jdh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117385a.m37552D(aVar, (roj0) obj);
            }
        }, new e30() { // from class: l.kdh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122562a.m37553E(aVar, (Throwable) obj);
            }
        }));
    }
}
