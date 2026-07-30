package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0051f0 extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        CoreModule.K().startJailedDialogLikeAct();
        aVar.f872a.m19348P8(aVar.f877f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        return m1485n().isJailed();
    }
}
