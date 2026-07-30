package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import p149l.hpd0;
import p149l.qib0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7900j1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if ((CoreModule.f17545c.f19663m0.f19451t0.get().booleanValue() && CoreModule.f17545c.f19663m0.f19457v0.get().booleanValue()) || !NullChecker.m81303a(m37514n()) || qib0.f154693H.guessedCurrentServerTime() - m37514n().createdTime < 2.592E8d) {
            return false;
        }
        hpd0 hpd0Var = CoreModule.f17545c.f19663m0.f19457v0;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        CoreModule.f17545c.f19663m0.f19451t0.put(bool);
        return false;
    }
}
