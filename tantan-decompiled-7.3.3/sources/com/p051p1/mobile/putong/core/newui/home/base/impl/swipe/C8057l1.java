package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import p153l.joa;
import p153l.llb0;
import p153l.nyk0;
import p153l.s7a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8057l1 extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (s7a.m184994w() && joa.m146371W3()) {
            Counter counterM38511h = m38511h();
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9 != null && counterM38511h != null && counterM38511h.likeLimit != null && ((!userM116600p9.isFemale() && counterM38511h.likeLimit.count == 100) || (userM116600p9.isFemale() && counterM38511h.likeLimit.count == 700))) {
                nyk0 nyk0Var = new nyk0(aVar.f22836a.m101951T4());
                nyk0Var.m165334I(aVar.f22836a.m101951T4());
                llb0.m154703c().m154710i(nyk0Var);
            }
        }
        return false;
    }
}
