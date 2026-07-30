package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import p149l.myf;
import p149l.upa;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h */
/* JADX INFO: loaded from: classes11.dex */
public class C7892h extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (myf.m157034N() && !CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() && myf.m157031K()) {
            Long l2 = CoreModule.f17545c.f19622Y0.f94264i.get();
            if (l2.longValue() > 0 && l2.longValue() % 10 == 0) {
                myf.m157039S(aVar.f22095b.act(), "repeatPictureDlg");
            }
        }
        if (!upa.m194639G2() && !upa.m194644H2()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22097d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() || !NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149300W6) || !CoreModule.f17545c.f19639e0.f149300W6.isGetSumPopCount || !NullChecker.m81303a(upa.m194721Z0()) || !xma.m210087m4() || xma.m210047L3() || xma.m210043F3()) {
            return false;
        }
        if (CoreModule.f17545c.f19622Y0.f94264i.get().longValue() < upa.m194721Z0().trigger.netPictureSwipeLimit) {
            return false;
        }
        myf.m157039S(aVar.f22095b.act(), "swipeLimitDlg");
        return true;
    }
}
