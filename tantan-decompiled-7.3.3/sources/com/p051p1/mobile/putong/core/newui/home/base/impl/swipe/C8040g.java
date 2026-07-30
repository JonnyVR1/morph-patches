package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g */
/* JADX INFO: loaded from: classes11.dex */
public class C8040g extends AbstractC8022a {
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m38626s() {
        int iM32134o6 = CoreModule.f18264c.f20405m0.m32134o6();
        if (iM32134o6 == 1 || iM32134o6 == 0) {
            CoreModule.f18264c.f20405m0.m32130m8();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        aVar.f22837b.act().postDelayed(new Runnable() { // from class: l.fvq
            @Override // java.lang.Runnable
            public final void run() {
                this.f101082a.m38626s();
            }
        }, 400L);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
        if (!NullChecker.m82486a(userInfoM140260e) || userInfoM140260e.isVirtualCard() || !CoreModule.f18264c.f20446z2.m31253r3()) {
            return false;
        }
        SwipeDirection swipeDirection = aVar.f22839d;
        if (swipeDirection != SwipeDirection.UP && swipeDirection != SwipeDirection.LEFT && swipeDirection != SwipeDirection.RIGHT) {
            return true;
        }
        User userM140259d = aVar.f22838c.m140259d();
        if (!NullChecker.m82486a(userM140259d)) {
            return true;
        }
        CoreModule.f18264c.f20446z2.m31241f3(aVar.f22839d, userM140259d);
        return true;
    }
}
