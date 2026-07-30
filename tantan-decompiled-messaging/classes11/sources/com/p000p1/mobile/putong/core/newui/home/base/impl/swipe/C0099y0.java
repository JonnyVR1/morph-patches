package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.User;
import l.hpd0;
import l.qqi0;
import l.upa;
import p009l.mqi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0099y0 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public hpd0 f923g = new hpd0("insert_see_myself_" + CoreModule.H().userId(), Boolean.FALSE);

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
        if (userInfoM17131e.isVirtualCard() && userInfoM17131e.virtualCardType == VirtualCardType.NewUserSeeMyself) {
            return true;
        }
        if (((Boolean) this.f923g.get()).booleanValue()) {
            return false;
        }
        User userNa = CoreModule.c.e0.na();
        if (!qqi0.h(mqi0.m18550o(), (long) userNa.createdTime, upa.p1()) && !userNa.isFakeUser() && !aVar.f878g && !userNa.isBanedOrInactivated() && ((TextUtils.isEmpty(userNa.description) || userNa.pictures.size() < 3) && ((Long) CoreModule.c.e0.P0.get()).longValue() >= upa.q1() - 1)) {
            this.f923g.put(Boolean.TRUE);
            aVar.f878g = true;
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
            userInfo.id = "VirtualCard";
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.c.m0.w6(userInfo, 0);
        }
        return false;
    }
}
