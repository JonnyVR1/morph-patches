package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0049e1;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.swh0;
import l.xma;
import p009l.a5m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0049e1 extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1576p(C0062j.a aVar) {
        aVar.f872a.m19370U8(true);
        if (aVar.f873b.m1310q2().isAdded()) {
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1577q(C0062j.a aVar) {
        aVar.f872a.m19375V8(false);
        if (NullChecker.a(aVar.f873b.m1092A2().mo2805d()) && (aVar.f873b.m1092A2().mo2805d() instanceof a5m)) {
            aVar.f873b.m1092A2().mo2818y();
            aVar.f872a.m19407c5();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        if (!aVar.f872a.m19461n6()) {
            aVar.f872a.m19375V8(true);
            swh0.B1(aVar.f873b.act(), PurchaseType.TYPE_GET_SEE_LETTER_INTL, new d30() { // from class: l.pdh0
                public final void call() {
                    C0049e1.m1576p(aVar);
                }
            }, new d30() { // from class: l.qdh0
                public final void call() {
                    C0049e1.m1577q(aVar);
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return aVar.f875d == SwipeDirection.UP && aVar.f872a.m19441j6(aVar.f874c.m17131e().id) && !aVar.f872a.m19456m6() && !xma.D3() && swh0.G() && swh0.p0().i1();
    }
}
