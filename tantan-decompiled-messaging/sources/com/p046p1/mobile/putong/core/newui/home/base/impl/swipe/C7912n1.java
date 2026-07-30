package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7912n1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        VirtualCard virtualCardM141747f = aVar.f22096c.m141747f();
        VSwipeStack.OnCardSwipeResult onCardSwipeResultM46083I0 = virtualCardM141747f.m46083I0(aVar.f22097d, virtualCardM141747f, aVar.f22098e);
        if (onCardSwipeResultM46083I0 != null && onCardSwipeResultM46083I0 == VSwipeStack.OnCardSwipeResult.pass) {
            HomeStatisticsHelper.m36694H(aVar.f22097d, virtualCardM141747f);
            CoreModule.f17545c.f19663m0.f19402c2.clear();
        }
        return onCardSwipeResultM46083I0;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
        if (userInfoM141746e == null || !userInfoM141746e.isVirtualCard()) {
            return false;
        }
        return !userInfoM141746e.isLivingCard();
    }
}
