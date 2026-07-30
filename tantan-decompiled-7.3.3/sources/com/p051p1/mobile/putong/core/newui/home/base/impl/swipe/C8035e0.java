package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.qyp;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.e0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8035e0 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        NewMainAct newMainActM101951T4 = aVar.f22836a.m101951T4();
        if (NullChecker.m82486a(newMainActM101951T4)) {
            qyp.m178723i().m178729n(newMainActM101951T4, true);
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        return CoreModule.f18264c.f20381e0.m116559f8();
    }
}
