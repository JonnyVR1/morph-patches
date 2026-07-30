package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import p149l.g6a;
import p149l.idi;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.t */
/* JADX INFO: loaded from: classes11.dex */
public class C7924t extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        NewMainAct newMainActAct = aVar.f22095b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && g6a.m124562k() && !m37514n().isBanned() && idi.m135447c().m135460n()) {
            idi.m135447c().m135454g();
        }
        return false;
    }
}
