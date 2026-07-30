package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.ui.home.VirtualCard;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0076n1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        VirtualCard virtualCardM17132f = aVar.f874c.m17132f();
        VSwipeStack.OnCardSwipeResult onCardSwipeResultI0 = virtualCardM17132f.I0(aVar.f875d, virtualCardM17132f, aVar.f876e);
        if (onCardSwipeResultI0 != null && onCardSwipeResultI0 == VSwipeStack.OnCardSwipeResult.pass) {
            HomeStatisticsHelper.m643H(aVar.f875d, virtualCardM17132f);
            CoreModule.c.m0.c2.clear();
        }
        return onCardSwipeResultI0;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
        if (userInfoM17131e == null || !userInfoM17131e.isVirtualCard()) {
            return false;
        }
        return !userInfoM17131e.isLivingCard();
    }
}
