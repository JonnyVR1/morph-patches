package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.e51;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.p */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0080p extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (partialListOpt != null && partialListOpt.loaded.size() == 1) {
            e51.G(new Runnable() { // from class: l.t7h0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.m0.m8();
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
        return userInfoM17131e.isVirtualCard() && userInfoM17131e.virtualCardType == VirtualCardType.QuestionOfNotVerify;
    }
}
