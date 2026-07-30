package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.CounterSuperlikeAndUndoLimit;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.a30;
import p153l.a5i0;
import p153l.b240;
import p153l.bpe0;
import p153l.d79;
import p153l.l51;
import p153l.ndp;
import p153l.psd0;
import p153l.qj90;
import p153l.spl0;
import p153l.u7m;
import p153l.uxj0;
import p153l.y20;
import p153l.z5h0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.b1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8027b1 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f22805g = false;

    /* JADX INFO: renamed from: J */
    public static void m38543J(boolean z) {
        f22805g = z;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m38552A(C8049j.a aVar, PurchaseType purchaseType, Act act, String str) {
        m38565y(aVar);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m38555D(C8049j.a aVar, uxj0 uxj0Var) {
        m38559H(aVar);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m38556E(C8049j.a aVar, Throwable th) {
        m38559H(aVar);
    }

    /* JADX INFO: renamed from: H */
    public final void m38559H(final C8049j.a aVar) {
        if (IntlCountryCodeController.m29125v()) {
            m38558G(aVar);
            return;
        }
        if (NullChecker.m82486a(aVar.f22837b)) {
            if (!aVar.f22837b.m38344q2().isAdded()) {
                l51.m152888H(aVar.f22837b.act(), new Runnable() { // from class: l.tlh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f174830a.m38557F(aVar);
                    }
                }, 300L);
                return;
            }
            View cardView = (NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140256a())) ? aVar.f22838c.m140256a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC8017b.f22662c;
            if (cardView == null || vFrame == null) {
                m38558G(aVar);
            } else {
                new ndp(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), vFrame).m162726i(cardView, new Runnable() { // from class: l.ulh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f179512a.m38558G(aVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void m38557F(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded()) {
            m38565y(aVar);
        } else {
            m38558G(aVar);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (f22805g) {
            f22805g = false;
            return false;
        }
        boolean z = aVar.f22839d == SwipeDirection.UP;
        if (z && NullChecker.m82486a(aVar.f22838c.m140260e()) && aVar.f22838c.m140260e().isLivingCard() && !CoreModule.m30934Q().mo68469t7().mo161253a()) {
            return false;
        }
        CounterSuperlikeAndUndoLimit counterSuperlikeAndUndoLimit = m38511h().superLikeLimit;
        if (d79.m114685j0() && z && aVar.f22836a.m102029j6(aVar.f22838c.m140259d().f56859id)) {
            return false;
        }
        if (spl0.m187374Z()) {
            return z && (a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) < bpe0.m105814f().m105817d(aVar.f22838c.m140259d().f56859id) || a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0) && !(NullChecker.m82486a(aVar.f22838c.m140259d()) && TextUtils.equals(aVar.f22838c.m140259d().f56859id, z5h0.m218675j().f203055m));
        }
        return z && a5i0.m96178w0(counterSuperlikeAndUndoLimit.remainToday()) == 0;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void m38553B(C8049j.a aVar, String str) {
        C8927c.m54595M1(aVar.f22837b.act(), str, Privilege.vip_super_like, null, null, false, aVar.f22838c.m140259d());
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void m38558G(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded() && NullChecker.m82486a(aVar.f22837b.m38128A2())) {
            C8032d0.m38591y(true);
            m38543J(true);
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        User userM38517n = m38517n();
        final String strM101829p5 = b240.m101829p5();
        if (TextUtils.isEmpty(strM101829p5)) {
            strM101829p5 = "p_home,superlike";
        }
        if (qj90.m176831c(userM38517n, PurchaseType.TYPE_SUPERLIKE_PKG) || d79.m114669b0()) {
            final int iM105817d = bpe0.m105814f().m105817d(aVar.f22838c.m140259d().f56859id);
            if (!spl0.m187374Z() || iM105817d <= 1) {
                C8927c.m54577G1(aVar.f22837b.act(), strM101829p5, 1, new a30() { // from class: l.olh0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        this.f147835a.m38552A(aVar, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                });
            } else {
                C8927c.m54577G1(aVar.f22837b.act(), strM101829p5, iM105817d, new a30() { // from class: l.nlh0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        aVar.f22837b.m38327m6(iM105817d);
                    }
                });
            }
            aVar.f22836a.m101938P8(aVar.f22841f, "failExhaustSuperlike");
        } else {
            if (NullChecker.m82486a(aVar.f22837b.m38128A2().mo39812d()) && (aVar.f22837b.m38128A2().mo39812d() instanceof u7m)) {
                l51.m152888H(aVar.f22837b.act(), new Runnable() { // from class: l.plh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f153033a.m38553B(aVar, strM101829p5);
                    }
                }, 280L);
            } else {
                m38553B(aVar, strM101829p5);
            }
            aVar.f22836a.m101938P8(aVar.f22841f, "failLessVipSuperLike");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: y */
    public final void m38565y(final C8049j.a aVar) {
        m38543J(true);
        if (NullChecker.m82486a(aVar.f22837b)) {
            l51.m152886F(aVar.f22837b.act(), new Runnable() { // from class: l.qlh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158231a.m38554C(aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void m38554C(final C8049j.a aVar) {
        CoreModule.f18264c.f20381e0.m116470H9().compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.rlh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163762a.m38555D(aVar, (uxj0) obj);
            }
        }, new y20() { // from class: l.slh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169383a.m38556E(aVar, (Throwable) obj);
            }
        }));
    }
}
