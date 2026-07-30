package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import p153l.gra;
import p153l.h39;
import p153l.k3g;
import p153l.o810;
import p153l.qyf;
import p153l.rbb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.r */
/* JADX INFO: loaded from: classes11.dex */
public class C8071r extends AbstractC8022a {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        qyf.m178643f().m178647h(aVar.f22838c.m140259d());
        aVar.f22836a.m101938P8(aVar.f22841f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m38743q() {
        return C4880a0.m32390j().f20267d.get().equals(CoreModule.f18264c.f20405m0.m32140q6());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m38744r(C8049j.a aVar) {
        QuickChatCardWrapper quickChatCardWrapper;
        if (h39.m133422K() && o810.m166444a()) {
            CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
            if (NullChecker.m82486a(userInfoM140260e) && userInfoM140260e.isVirtualCard() && userInfoM140260e.virtualCardType == VirtualCardType.OnlineMatchBroadcastCard) {
                return false;
            }
        }
        if (gra.m131596L3()) {
            CoreSuggested.UserInfo userInfoM140260e2 = aVar.f22838c.m140260e();
            if (NullChecker.m82486a(userInfoM140260e2) && userInfoM140260e2.isVirtualCard() && userInfoM140260e2.virtualCardType == VirtualCardType.ExpandedNewUserRightGuide) {
                return false;
            }
        }
        if (NullChecker.m82486a(aVar.f22838c)) {
            CoreSuggested.UserInfo userInfoM140260e3 = aVar.f22838c.m140260e();
            if (NullChecker.m82486a(userInfoM140260e3) && (quickChatCardWrapper = userInfoM140260e3.quickChatCardWrapper) != null && quickChatCardWrapper.isPeiLiao()) {
                return false;
            }
        }
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return true;
        }
        return CoreModule.f18264c.f20381e0.m116549c8() && !k3g.m148016a();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (aVar.f22838c.m140260e().virtualCardType == VirtualCardType.IntlRecallMembershipCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.FakeCard || aVar.f22838c.m140260e().virtualCardType == VirtualCardType.AdCard) {
            return false;
        }
        if (rbb0.m180744q() && m38743q()) {
            return false;
        }
        return m38744r(aVar);
    }
}
