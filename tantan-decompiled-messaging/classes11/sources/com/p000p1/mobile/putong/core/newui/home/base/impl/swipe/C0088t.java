package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.card.VSwipeStack;
import l.g6a;
import p009l.idi;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0088t extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        NewMainAct newMainActAct = aVar.f873b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && g6a.k() && !m1485n().isBanned() && idi.m16341c().m16354n()) {
            idi.m16341c().m16348g();
        }
        return false;
    }
}
