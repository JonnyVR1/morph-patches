package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p153l.a0g;
import p153l.gra;
import p153l.joa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h */
/* JADX INFO: loaded from: classes11.dex */
public class C8043h extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (a0g.m95358N() && !CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() && a0g.m95355K()) {
            Long l2 = CoreModule.f18264c.f20364Y0.f161167i.get();
            if (l2.longValue() > 0 && l2.longValue() % 10 == 0) {
                a0g.m95363S(aVar.f22837b.act(), "repeatPictureDlg");
            }
        }
        if (!gra.m131570G2() && !gra.m131575H2()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22839d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() || !NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89157W6) || !CoreModule.f18264c.f20381e0.f89157W6.isGetSumPopCount || !NullChecker.m82486a(gra.m131652Z0()) || !joa.m146401n4() || joa.m146361M3() || joa.m146357G3()) {
            return false;
        }
        if (CoreModule.f18264c.f20364Y0.f161167i.get().longValue() < gra.m131652Z0().trigger.netPictureSwipeLimit) {
            return false;
        }
        a0g.m95363S(aVar.f22837b.act(), "swipeLimitDlg");
        return true;
    }
}
