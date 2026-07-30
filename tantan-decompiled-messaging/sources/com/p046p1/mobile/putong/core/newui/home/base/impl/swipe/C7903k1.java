package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.api.C4737e0;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p149l.mah0;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7903k1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        if (!mah0.m153729s0().m153789z0()) {
            aVar.f22095b.m37286e6();
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (C4737e0.m31949a().m31954e()) {
            return false;
        }
        if (NullChecker.m81303a(aVar.f22096c) && aVar.f22096c.m141746e().isVirtualCard()) {
            return false;
        }
        if ((NullChecker.m81303a(aVar.f22096c) && aVar.f22096c.m141746e().isVirtualCard() && (aVar.f22096c.m141746e().virtualCardType == VirtualCardType.LiveActiveCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.IntlVipCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.SeeSuggestCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.FakeCard)) || !NullChecker.m81303a(aVar.f22096c) || !NullChecker.m81303a(aVar.f22096c.m141745d()) || ((aVar.f22096c.m141746e().isVirtualCard() && aVar.f22096c.m141746e().virtualCardType == VirtualCardType.AdCard) || !"-145".equals(aVar.f22096c.m141745d().f56011id))) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22097d;
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection2) {
            mah0.m153729s0().m153762Y0();
        }
        zvf0.m220401w("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view", vwb.m200311Y("is_which_direction", aVar.f22097d == swipeDirection2 ? BLiveGiftBubblePopupTitlePosition.left : "right"));
        return true;
    }
}
