package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.MatchInfo;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8055l;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import p153l.gra;
import p153l.psd0;
import p153l.pzi0;
import p153l.q83;
import p153l.ric0;
import p153l.s7a;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.l */
/* JADX INFO: loaded from: classes11.dex */
public class C8055l extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38677p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38678q(MatchInfo matchInfo) {
        if (!NullChecker.m82486a(matchInfo) || matchInfo.todayMatchCount >= gra.m131663c().min_match_count) {
            return;
        }
        q83.m175748d().m175752e();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        NewMainAct newMainActAct = aVar.f22837b.act();
        if (newMainActAct != null && !newMainActAct.isFinishing() && !s7a.m184982k() && pzi0.m174462w((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime, 24) && CoreModule.f18264c.f20381e0.f89095P0.get().longValue() >= q83.m175748d().m175751c() - 1 && !ric0.m181581i().m181592q(newMainActAct, "p_home,accelerate_guide") && q83.m175748d().m175756i()) {
            newMainActAct.duringCreated(CoreModule.f18264c.f20381e0.m116626w7()).subscribe(psd0.m173597H(new y20() { // from class: l.ufh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8055l.m38678q((MatchInfo) obj);
                }
            }, new y20() { // from class: l.vfh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8055l.m38677p((Throwable) obj);
                }
            }));
        }
        return false;
    }
}
