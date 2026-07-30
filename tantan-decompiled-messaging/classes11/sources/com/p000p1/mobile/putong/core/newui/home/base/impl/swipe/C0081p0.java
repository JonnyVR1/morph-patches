package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.data.User;
import l.roj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.p0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0081p0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        aVar.f872a.f17710r.onNext(roj0.a);
        aVar.f872a.m19348P8(aVar.f877f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        User userM1485n = m1485n();
        return userM1485n != null && userM1485n.isNameFake();
    }
}
