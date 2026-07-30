package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8038f0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        CoreModule.m30930K().startJailedDialogLikeAct();
        aVar.f22836a.m101938P8(aVar.f22841f, "failJailedUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return m38517n().isJailed();
    }
}
