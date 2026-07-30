package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import p149l.e51;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.p */
/* JADX INFO: loaded from: classes11.dex */
public class C7916p extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e != null && partialListOptM221515e.loaded.size() == 1) {
            e51.m114742G(new Runnable() { // from class: l.t7h0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19663m0.m31127m8();
                }
            });
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
        return userInfoM141746e.isVirtualCard() && userInfoM141746e.virtualCardType == VirtualCardType.QuestionOfNotVerify;
    }
}
