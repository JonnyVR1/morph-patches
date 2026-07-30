package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import l.cxf;
import l.e010;
import l.n3b0;
import l.upa;
import l.y19;
import p009l.w1g;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0084r extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        cxf.f().h(aVar.f874c.m17130d());
        aVar.f872a.m19348P8(aVar.f877f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1711q() {
        return ((String) a0.j().d.get()).equals(CoreModule.c.m0.q6());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1712r(C0062j.a aVar) {
        QuickChatCardWrapper quickChatCardWrapper;
        if (y19.K() && e010.a()) {
            CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
            if (NullChecker.a(userInfoM17131e) && userInfoM17131e.isVirtualCard() && userInfoM17131e.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard) {
                return false;
            }
        }
        if (upa.L3()) {
            CoreSuggested.UserInfo userInfoM17131e2 = aVar.f874c.m17131e();
            if (NullChecker.a(userInfoM17131e2) && userInfoM17131e2.isVirtualCard() && userInfoM17131e2.virtualCardType == VirtualCardType.ExpandedNewUserRightGuide) {
                return false;
            }
        }
        if (NullChecker.a(aVar.f874c)) {
            CoreSuggested.UserInfo userInfoM17131e3 = aVar.f874c.m17131e();
            if (NullChecker.a(userInfoM17131e3) && (quickChatCardWrapper = userInfoM17131e3.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao()) {
                return false;
            }
        }
        if (CoreModule.c.e0.Z7()) {
            return true;
        }
        return CoreModule.c.e0.c8() && !w1g.m23770a();
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (aVar.f874c.m17131e().virtualCardType == VirtualCardType.IntlRecallMembershipCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.FakeCard || aVar.f874c.m17131e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (n3b0.q() && m1711q()) {
            return false;
        }
        return m1712r(aVar);
    }
}
