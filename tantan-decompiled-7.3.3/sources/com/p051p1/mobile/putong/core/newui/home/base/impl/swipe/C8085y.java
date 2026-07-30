package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;
import p153l.d79;
import p153l.haw;
import p153l.nbw;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y */
/* JADX INFO: loaded from: classes11.dex */
public class C8085y extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22839d;
        if (swipeDirection != SwipeDirection.RIGHT) {
            return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
        if (NullChecker.m82486a(userInfoM140260e.intlInsertCardData.buzzUser)) {
            nbw.INSTANCE.m162219N(userInfoM140260e.intlInsertCardData.buzzUser.isBlur, "right");
            haw.INSTANCE.m134320a().m134280W(aVar.f22836a.m101951T4(), userInfoM140260e.intlInsertCardData.buzzUser.buzzToken, userInfoM140260e.f20214id, "", null, null, null, false);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        boolean zM35223y3;
        if (!d79.m114675e0() || !NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20150e2) || !NullChecker.m82486a(aVar.f22838c) || !(zM35223y3 = CoreModule.f18264c.f20405m0.f20150e2.m35223y3(aVar.f22838c.m140260e()))) {
            return false;
        }
        boolean zM35222x3 = CoreModule.f18264c.f20405m0.f20150e2.m35222x3(aVar.f22838c.m140260e());
        SwipeDirection swipeDirection = aVar.f22839d;
        if (swipeDirection == SwipeDirection.UP) {
            if (zM35222x3) {
                return true;
            }
            nbw.INSTANCE.m162219N(false, "up");
            return false;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            nbw.INSTANCE.m162219N(zM35222x3, BLiveGiftBubblePopupTitlePosition.left);
            return false;
        }
        if (swipeDirection == SwipeDirection.RIGHT && aVar.f22840e) {
            return NullChecker.m82486a(aVar.f22841f) && NullChecker.m82486a(aVar.f22841f.f23721h) && TextUtils.equals(aVar.f22841f.f23721h.getFrom(), HomeStatisticsHelper.ScActionFrom.PROFILE.getFrom());
        }
        return zM35223y3;
    }
}
