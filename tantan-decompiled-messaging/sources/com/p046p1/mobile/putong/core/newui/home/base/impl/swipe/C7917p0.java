package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.User;
import p149l.roj0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.p0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7917p0 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        aVar.f22094a.f140400r.m132487l(roj0.f160388a);
        aVar.f22094a.m161144P8(aVar.f22099f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        User userM37514n = m37514n();
        return userM37514n != null && userM37514n.isNameFake();
    }
}
