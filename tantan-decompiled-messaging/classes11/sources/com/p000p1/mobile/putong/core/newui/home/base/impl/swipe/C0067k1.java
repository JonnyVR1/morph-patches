package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.api.e0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.mah0;
import l.vwb;
import l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.k1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0067k1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        if (!mah0.s0().z0()) {
            aVar.f873b.m1254e6();
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (e0.a().e()) {
            return false;
        }
        if (NullChecker.a(aVar.f874c) && aVar.f874c.m17131e().isVirtualCard()) {
            return false;
        }
        if ((NullChecker.a(aVar.f874c) && aVar.f874c.m17131e().isVirtualCard() && (aVar.f874c.m17131e().virtualCardType == VirtualCardType.LiveActiveCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.IntlVipCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.SeeSuggestCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.OnlineMatchBroadcastCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.FakeCard)) || !NullChecker.a(aVar.f874c) || !NullChecker.a(aVar.f874c.m17130d()) || ((aVar.f874c.m17131e().isVirtualCard() && aVar.f874c.m17131e().virtualCardType == VirtualCardType.AdCard) || !"-145".equals(((DbObject) aVar.f874c.m17130d()).id))) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f875d;
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection == swipeDirection2) {
            mah0.s0().Y0();
        }
        zvf0.w("e_new_user_guide_to_swipe_right", "p_suggest_users_home_view", new j760[]{vwb.Y("is_which_direction", aVar.f875d == swipeDirection2 ? "left" : "right")});
        return true;
    }
}
