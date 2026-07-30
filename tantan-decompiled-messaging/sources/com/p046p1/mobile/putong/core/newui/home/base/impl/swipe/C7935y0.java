package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.User;
import p149l.hpd0;
import p149l.mqi0;
import p149l.qqi0;
import p149l.upa;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7935y0 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public hpd0 f22145g = new hpd0("insert_see_myself_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        CoreSuggested.UserInfo userInfoM141746e = aVar.f22096c.m141746e();
        if (userInfoM141746e.isVirtualCard() && userInfoM141746e.virtualCardType == VirtualCardType.NewUserSeeMyself) {
            return true;
        }
        if (this.f22145g.get().booleanValue()) {
            return false;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (!qqi0.m175940h(mqi0.m155944o(), (long) userM169520na.createdTime, upa.m194799p1()) && !userM169520na.isFakeUser() && !aVar.f22100g && !userM169520na.isBanedOrInactivated() && ((TextUtils.isEmpty(userM169520na.description) || userM169520na.pictures.size() < 3) && CoreModule.f17545c.f19639e0.f149238P0.get().longValue() >= upa.m194804q1() - 1)) {
            this.f22145g.put(Boolean.TRUE);
            aVar.f22100g = true;
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f17545c.f19663m0.m31154w6(userInfo, 0);
        }
        return false;
    }
}
