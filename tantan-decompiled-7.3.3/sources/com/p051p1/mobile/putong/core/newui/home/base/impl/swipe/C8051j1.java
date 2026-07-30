package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import p153l.jxd0;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.j1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8051j1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if ((CoreModule.f18264c.f20405m0.f20193t0.get().booleanValue() && CoreModule.f18264c.f20405m0.f20199v0.get().booleanValue()) || !NullChecker.m82486a(m38517n()) || uqb0.f180376H.guessedCurrentServerTime() - m38517n().createdTime < 2.592E8d) {
            return false;
        }
        jxd0 jxd0Var = CoreModule.f18264c.f20405m0.f20199v0;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20405m0.f20193t0.put(bool);
        return false;
    }
}
