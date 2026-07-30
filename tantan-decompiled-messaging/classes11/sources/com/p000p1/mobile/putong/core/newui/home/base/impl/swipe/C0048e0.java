package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import l.qwp;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0048e0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        NewMainAct newMainActM19361T4 = aVar.f872a.m19361T4();
        if (NullChecker.a(newMainActM19361T4)) {
            qwp.i().n(newMainActM19361T4, true);
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return CoreModule.c.e0.f8();
    }
}
