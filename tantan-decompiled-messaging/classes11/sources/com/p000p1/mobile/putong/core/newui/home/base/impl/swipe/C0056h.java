package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.xma;
import p009l.myf;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.h */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0056h extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (myf.m18692N() && !CoreModule.c.e0.p9().isPicVerificationVerified() && myf.m18689K()) {
            Long l2 = (Long) CoreModule.c.Y0.i.get();
            if (l2.longValue() > 0 && l2.longValue() % 10 == 0) {
                myf.m18697S(aVar.f873b.act(), "repeatPictureDlg");
            }
        }
        if (!upa.G2() && !upa.H2()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f875d;
        if ((swipeDirection != SwipeDirection.RIGHT && swipeDirection != SwipeDirection.UP) || CoreModule.c.e0.p9().isPicVerificationVerified() || !NullChecker.a(CoreModule.c.e0.W6) || !CoreModule.c.e0.W6.isGetSumPopCount || !NullChecker.a(upa.Z0()) || !xma.m4() || xma.L3() || xma.F3()) {
            return false;
        }
        if (((Long) CoreModule.c.Y0.i.get()).longValue() < upa.Z0().trigger.netPictureSwipeLimit) {
            return false;
        }
        myf.m18697S(aVar.f873b.act(), "swipeLimitDlg");
        return true;
    }
}
