package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import l.g6a;
import l.hdb0;
import l.xma;
import p009l.hpk0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0070l1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (g6a.w() && xma.V3()) {
            Counter counterM1479h = m1479h();
            User userP9 = CoreModule.c.e0.p9();
            if (userP9 != null && counterM1479h != null && counterM1479h.likeLimit != null && ((!userP9.isFemale() && counterM1479h.likeLimit.count == 100) || (userP9.isFemale() && counterM1479h.likeLimit.count == 700))) {
                hpk0 hpk0Var = new hpk0(aVar.f872a.m19361T4());
                hpk0Var.m15910I(aVar.f872a.m19361T4());
                hdb0.c().i(hpk0Var);
            }
        }
        return false;
    }
}
