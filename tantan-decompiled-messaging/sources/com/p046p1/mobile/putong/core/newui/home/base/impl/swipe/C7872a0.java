package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.a0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7872a0 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        Counter counterM37508h = m37508h();
        CounterLikeLimit counterLikeLimit = counterM37508h == null ? null : counterM37508h.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 1 && counterLikeLimit.resetNowMillis() > 0 && m37511k(aVar) && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19448s0) && NullChecker.m81303a(CoreModule.f17545c.f19663m0.f19448s0)) {
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.m31146t6(coreSuggested.f19448s0, 0, true);
            CoreModule.f17545c.f19663m0.f19448s0 = null;
        }
        return false;
    }
}
