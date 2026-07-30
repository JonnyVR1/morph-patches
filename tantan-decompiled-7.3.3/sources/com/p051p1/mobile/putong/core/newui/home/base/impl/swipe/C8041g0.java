package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import p153l.ric0;
import p153l.rsh0;
import p153l.s8d0;
import p153l.xrd;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8041g0 extends AbstractC8022a {
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
        if ((ric0.m181583m() && CoreModule.f18264c.f20377c2.m118408t3()) || !NullChecker.m82486a(counterLikeLimit)) {
            return false;
        }
        int i = counterLikeLimit.remaining;
        if ((i != 20 && i != 10) || counterLikeLimit.resetNowMillis() <= 0 || !m38514k(aVar) || !s8d0.m185067i().getCanPollingRefresh()) {
            return false;
        }
        rsh0.m182974e().m182977c().m187710a("swipe", new xrd());
        return false;
    }
}
