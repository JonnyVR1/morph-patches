package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g */
/* JADX INFO: loaded from: classes11.dex */
public class C7889g extends AbstractC7871a {
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m37623s() {
        int iM31131o6 = CoreModule.f17545c.f19663m0.m31131o6();
        if (iM31131o6 == 1 || iM31131o6 == 0) {
            CoreModule.f17545c.f19663m0.m31127m8();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        aVar.f22095b.act().postDelayed(new Runnable() { // from class: l.etq
            @Override // java.lang.Runnable
            public final void run() {
                this.f93168a.m37623s();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
        if (!NullChecker.m81303a(userInfoM141746e) || userInfoM141746e.isVirtualCard() || !CoreModule.f17545c.f19704z2.m30255r3()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22097d;
        if (swipeDirection != SwipeDirection.UP && swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            return true;
        }
        User userM141745d = aVar.f22096c.m141745d();
        if (!NullChecker.m81303a(userM141745d)) {
            return true;
        }
        CoreModule.f17545c.f19704z2.m30243f3(aVar.f22097d, userM141745d);
        return true;
    }
}
