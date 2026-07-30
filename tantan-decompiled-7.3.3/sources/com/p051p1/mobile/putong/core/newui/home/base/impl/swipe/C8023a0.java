package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8023a0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        Counter counterM38511h = m38511h();
        CounterLikeLimit counterLikeLimit = counterM38511h == null ? null : counterM38511h.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 1 && counterLikeLimit.resetNowMillis() > 0 && m38514k(aVar) && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20190s0) && NullChecker.m82486a(CoreModule.f18264c.f20405m0.f20190s0)) {
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.m32149t6(coreSuggested.f20190s0, 0, true);
            CoreModule.f18264c.f20405m0.f20190s0 = null;
        }
        return false;
    }
}
