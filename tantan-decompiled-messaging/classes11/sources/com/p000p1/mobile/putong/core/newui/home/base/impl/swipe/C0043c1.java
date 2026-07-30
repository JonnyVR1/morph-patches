package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0043c1;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.swh0;
import p009l.d5m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0043c1 extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1549p(C0062j.a aVar) {
        aVar.f872a.m19370U8(true);
        swh0.p0().U0();
        if (aVar.f873b.m1310q2().isAdded()) {
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1550q(C0062j.a aVar) {
        aVar.f872a.m19375V8(false);
        if (NullChecker.a(aVar.f873b.m1092A2().mo2805d()) && (aVar.f873b.m1092A2().mo2805d() instanceof d5m)) {
            aVar.f873b.m1092A2().mo2818y();
            aVar.f872a.m19407c5();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        if (!aVar.f872a.m19461n6()) {
            aVar.f872a.m19375V8(true);
            swh0.B1(aVar.f873b.act(), PurchaseType.TYPE_GET_LETTER, new d30() { // from class: l.ndh0
                public final void call() {
                    C0043c1.m1549p(aVar);
                }
            }, new d30() { // from class: l.odh0
                public final void call() {
                    C0043c1.m1550q(aVar);
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        SwipeDirection swipeDirection = aVar.f875d;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        return false;
    }
}
