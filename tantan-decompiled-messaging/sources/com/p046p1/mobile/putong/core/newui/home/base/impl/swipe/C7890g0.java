package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import p149l.hqd;
import p149l.kkh0;
import p149l.lac0;
import p149l.p0d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7890g0 extends AbstractC7871a {
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
        if ((lac0.m149136m() && CoreModule.f17545c.f19635c2.m99148t3()) || !NullChecker.m81303a(counterLikeLimit)) {
            return false;
        }
        int i = counterLikeLimit.remaining;
        if ((i != 20 && i != 10) || counterLikeLimit.resetNowMillis() <= 0 || !m37511k(aVar) || !p0d0.m166973i().getCanPollingRefresh()) {
            return false;
        }
        kkh0.m146325e().m146328c().m150268a("swipe", new hqd());
        return false;
    }
}
