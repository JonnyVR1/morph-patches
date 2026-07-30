package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import p153l.s7a;
import p153l.xei;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t */
/* JADX INFO: loaded from: classes11.dex */
public class C8075t extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        NewMainAct newMainActAct = aVar.f22837b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && s7a.m184982k() && !m38517n().isBanned() && xei.m210680c().m210693n()) {
            xei.m210680c().m210687g();
        }
        return false;
    }
}
