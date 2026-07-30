package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.n1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8063n1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        VirtualCard virtualCardM140261f = aVar.f22838c.m140261f();
        VSwipeStack.OnCardSwipeResult onCardSwipeResultM47266I0 = virtualCardM140261f.m47266I0(aVar.f22839d, virtualCardM140261f, aVar.f22840e);
        if (onCardSwipeResultM47266I0 != null && onCardSwipeResultM47266I0 == VSwipeStack.OnCardSwipeResult.pass) {
            HomeStatisticsHelper.m37697H(aVar.f22839d, virtualCardM140261f);
            CoreModule.f18264c.f20405m0.f20144c2.clear();
        }
        return onCardSwipeResultM47266I0;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
        if (userInfoM140260e == null || !userInfoM140260e.isVirtualCard()) {
            return false;
        }
        return !userInfoM140260e.isLivingCard();
    }
}
