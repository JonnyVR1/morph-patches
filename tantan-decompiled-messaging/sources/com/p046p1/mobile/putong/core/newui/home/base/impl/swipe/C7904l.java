package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.MatchInfo;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7904l;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import p149l.b83;
import p149l.e30;
import p149l.g6a;
import p149l.lac0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l */
/* JADX INFO: loaded from: classes11.dex */
public class C7904l extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37674p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37675q(MatchInfo matchInfo) {
        if (!NullChecker.m81303a(matchInfo) || matchInfo.todayMatchCount >= upa.m194732c().min_match_count) {
            return;
        }
        b83.m100710d().m100714e();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        NewMainAct newMainActAct = aVar.f22095b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && !g6a.m124562k() && mqi0.m155952w((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime, 24) && CoreModule.f17545c.f19639e0.f149238P0.get().longValue() >= b83.m100710d().m100713c() - 1 && !lac0.m149134i().m149145q(newMainActAct, "p_home,accelerate_guide") && b83.m100710d().m100718i()) {
            newMainActAct.duringCreated(CoreModule.f17545c.f19639e0.m169553w7()).subscribe(mkd0.m154956H(new e30() { // from class: l.m7h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7904l.m37675q((MatchInfo) obj);
                }
            }, new e30() { // from class: l.n7h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C7904l.m37674p((Throwable) obj);
                }
            }));
        }
        return false;
    }
}
