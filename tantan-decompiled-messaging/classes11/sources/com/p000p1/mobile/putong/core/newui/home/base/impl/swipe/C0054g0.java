package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import l.hqd;
import l.kkh0;
import l.lac0;
import l.p0d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.g0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0054g0 extends AbstractC0035a {
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
        if ((lac0.m() && CoreModule.c.c2.t3()) || !NullChecker.a(counterLikeLimit)) {
            return false;
        }
        int i = counterLikeLimit.remaining;
        if ((i != 20 && i != 10) || counterLikeLimit.resetNowMillis() <= 0 || !m1482k(aVar) || !p0d0.i().o()) {
            return false;
        }
        kkh0.e().c().a("swipe", new hqd());
        return false;
    }
}
