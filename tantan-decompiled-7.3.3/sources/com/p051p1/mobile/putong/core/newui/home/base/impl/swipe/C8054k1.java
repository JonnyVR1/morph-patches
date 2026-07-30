package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.api.C4888e0;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p153l.i4g0;
import p153l.jyb;
import p153l.uih0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8054k1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        if (!uih0.m196223s0().m196283z0()) {
            aVar.f22837b.m38289e6();
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (C4888e0.m32952a().m32957e()) {
            return false;
        }
        if (NullChecker.m82486a(aVar.f22838c) && aVar.f22838c.m140260e().isVirtualCard()) {
            return false;
        }
        if ((NullChecker.m82486a(aVar.f22838c) && aVar.f22838c.m140260e().isVirtualCard() && (aVar.f22838c.m140260e().virtualCardType == VirtualCardType.LiveActiveCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.IntlVipCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.SeeSuggestCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.FakeCard)) || !NullChecker.m82486a(aVar.f22838c) || !NullChecker.m82486a(aVar.f22838c.m140259d()) || ((aVar.f22838c.m140260e().isVirtualCard() && aVar.f22838c.m140260e().virtualCardType == VirtualCardType.AdCard) || !"-145".equals(aVar.f22838c.m140259d().f56859id))) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22839d;
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection2) {
            uih0.m196223s0().m196256Y0();
        }
        i4g0.m138525w("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view", jyb.m147494Y("is_which_direction", aVar.f22839d == swipeDirection2 ? BLiveGiftBubblePopupTitlePosition.left : "right"));
        return true;
    }
}
