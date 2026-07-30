package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0053g extends AbstractC0035a {
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m1594s() {
        int iO6 = CoreModule.c.m0.o6();
        if (iO6 == 1 || iO6 == 0) {
            CoreModule.c.m0.m8();
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        aVar.f873b.act().postDelayed(new Runnable() { // from class: l.etq
            @Override // java.lang.Runnable
            public final void run() {
                this.f12686a.m1594s();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
        if (!NullChecker.a(userInfoM17131e) || userInfoM17131e.isVirtualCard() || !CoreModule.c.z2.r3()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f875d;
        if (swipeDirection != SwipeDirection.UP && swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            return true;
        }
        User userM17130d = aVar.f874c.m17130d();
        if (!NullChecker.a(userM17130d)) {
            return true;
        }
        CoreModule.c.z2.f3(aVar.f875d, userM17130d);
        return true;
    }
}
