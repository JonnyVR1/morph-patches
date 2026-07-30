package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import p149l.cxf;
import p149l.e010;
import p149l.n3b0;
import p149l.upa;
import p149l.w1g;
import p149l.y19;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r */
/* JADX INFO: loaded from: classes11.dex */
public class C7920r extends AbstractC7871a {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        cxf.m109094f().m109098h(aVar.f22096c.m141745d());
        aVar.f22094a.m161144P8(aVar.f22099f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m37740q() {
        return C4729a0.m31387j().f19525d.get().equals(CoreModule.f17545c.f19663m0.m31137q6());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m37741r(C7898j.a aVar) {
        QuickChatCardWrapper quickChatCardWrapper;
        if (y19.m212151K() && e010.m114153a()) {
            CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
            if (NullChecker.m81303a(userInfoM141746e) && userInfoM141746e.isVirtualCard() && userInfoM141746e.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard) {
                return false;
            }
        }
        if (upa.m194665L3()) {
            CoreSuggested.UserInfo userInfoM141746e2 = aVar.f22096c.m141746e();
            if (NullChecker.m81303a(userInfoM141746e2) && userInfoM141746e2.isVirtualCard() && userInfoM141746e2.virtualCardType == VirtualCardType.ExpandedNewUserRightGuide) {
                return false;
            }
        }
        if (NullChecker.m81303a(aVar.f22096c)) {
            CoreSuggested.UserInfo userInfoM141746e3 = aVar.f22096c.m141746e();
            if (NullChecker.m81303a(userInfoM141746e3) && (quickChatCardWrapper = userInfoM141746e3.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao()) {
                return false;
            }
        }
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return true;
        }
        return CoreModule.f17545c.f19639e0.m169476c8() && !w1g.m200928a();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (aVar.f22096c.m141746e().virtualCardType == VirtualCardType.IntlRecallMembershipCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.FakeCard || aVar.f22096c.m141746e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (n3b0.m157742q() && m37740q()) {
            return false;
        }
        return m37741r(aVar);
    }
}
