package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import p153l.l51;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.p */
/* JADX INFO: loaded from: classes11.dex */
public class C8067p extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e != null && partialListOptM222761e.loaded.size() == 1) {
            l51.m152887G(new Runnable() { // from class: l.bgh0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20405m0.m32130m8();
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
        return userInfoM140260e.isVirtualCard() && userInfoM140260e.virtualCardType == VirtualCardType.QuestionOfNotVerify;
    }
}
