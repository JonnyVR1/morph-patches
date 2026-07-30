package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0036a0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        Counter counterM1479h = m1479h();
        CounterLikeLimit counterLikeLimit = counterM1479h == null ? null : counterM1479h.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 1 && counterLikeLimit.resetNowMillis() > 0 && m1482k(aVar) && NullChecker.a(CoreModule.c.m0.s0) && NullChecker.a(CoreModule.c.m0.s0)) {
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.t6(coreSuggested.s0, 0, true);
            CoreModule.c.m0.s0 = null;
        }
        return false;
    }
}
