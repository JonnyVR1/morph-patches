package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p149l.j8w;
import p149l.p9w;
import p149l.u59;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y */
/* JADX INFO: loaded from: classes11.dex */
public class C7934y extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22097d;
        if (swipeDirection != SwipeDirection.RIGHT) {
            return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
        if (NullChecker.m81303a(userInfoM141746e.intlInsertCardData.buzzUser)) {
            p9w.INSTANCE.m167915N(userInfoM141746e.intlInsertCardData.buzzUser.isBlur, "right");
            j8w.INSTANCE.m140473a().m140433W(aVar.f22094a.m161157T4(), userInfoM141746e.intlInsertCardData.buzzUser.buzzToken, userInfoM141746e.f19472id, "", null, null, null, false);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        boolean zM34220y3;
        if (!u59.m191823d0() || !NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19408e2) || !NullChecker.m81303a(aVar.f22096c) || !(zM34220y3 = CoreModule.f17545c.f19663m0.f19408e2.m34220y3(aVar.f22096c.m141746e()))) {
            return false;
        }
        boolean zM34219x3 = CoreModule.f17545c.f19663m0.f19408e2.m34219x3(aVar.f22096c.m141746e());
        SwipeDirection swipeDirection = aVar.f22097d;
        if (swipeDirection == SwipeDirection.UP) {
            if (zM34219x3) {
                return true;
            }
            p9w.INSTANCE.m167915N(false, "up");
            return false;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            p9w.INSTANCE.m167915N(zM34219x3, BLiveGiftBubblePopupTitlePosition.left);
            return false;
        }
        if (swipeDirection == SwipeDirection.RIGHT && aVar.f22098e) {
            return NullChecker.m81303a(aVar.f22099f) && NullChecker.m81303a(aVar.f22099f.f22979h) && TextUtils.equals(aVar.f22099f.f22979h.getFrom(), HomeStatisticsHelper.ScActionFrom.PROFILE.getFrom());
        }
        return zM34220y3;
    }
}
