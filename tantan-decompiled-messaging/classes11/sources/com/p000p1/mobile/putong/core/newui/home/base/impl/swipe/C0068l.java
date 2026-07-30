package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0068l;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.MatchInfo;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.g6a;
import l.lac0;
import l.mkd0;
import l.upa;
import p009l.b83;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0068l extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1645p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1646q(MatchInfo matchInfo) {
        if (!NullChecker.a(matchInfo) || matchInfo.todayMatchCount >= upa.c().min_match_count) {
            return;
        }
        b83.m11899d().m11903e();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        NewMainAct newMainActAct = aVar.f873b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && !g6a.k() && mqi0.m18558w((long) CoreModule.c.e0.p9().createdTime, 24) && ((Long) CoreModule.c.e0.P0.get()).longValue() >= b83.m11899d().m11902c() - 1 && !lac0.i().q(newMainActAct, "p_home,accelerate_guide") && b83.m11899d().m11907i()) {
            newMainActAct.duringCreated(CoreModule.c.e0.w7()).subscribe(mkd0.H(new e30() { // from class: l.m7h0
                public final void call(Object obj) {
                    C0068l.m1646q((MatchInfo) obj);
                }
            }, new e30() { // from class: l.n7h0
                public final void call(Object obj) {
                    C0068l.m1645p((Throwable) obj);
                }
            }));
        }
        return false;
    }
}
