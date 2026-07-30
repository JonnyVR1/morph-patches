package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import l.hpd0;
import l.qib0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0064j1 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if ((((Boolean) CoreModule.c.m0.t0.get()).booleanValue() && ((Boolean) CoreModule.c.m0.v0.get()).booleanValue()) || !NullChecker.a(m1485n()) || qib0.H.guessedCurrentServerTime() - m1485n().createdTime < 2.592E8d) {
            return false;
        }
        hpd0 hpd0Var = CoreModule.c.m0.v0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        CoreModule.c.m0.t0.put(bool);
        return false;
    }
}
