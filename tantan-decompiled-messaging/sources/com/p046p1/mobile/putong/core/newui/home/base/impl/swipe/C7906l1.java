package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import p149l.g6a;
import p149l.hdb0;
import p149l.hpk0;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7906l1 extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (g6a.m124574w() && xma.m210057V3()) {
            Counter counterM37508h = m37508h();
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9 != null && counterM37508h != null && counterM37508h.likeLimit != null && ((!userM169527p9.isFemale() && counterM37508h.likeLimit.count == 100) || (userM169527p9.isFemale() && counterM37508h.likeLimit.count == 700))) {
                hpk0 hpk0Var = new hpk0(aVar.f22094a.m161157T4());
                hpk0Var.m132362I(aVar.f22094a.m161157T4());
                hdb0.m130575c().m130582i(hpk0Var);
            }
        }
        return false;
    }
}
