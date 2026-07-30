package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.data.User;
import p153l.gra;
import p153l.jxd0;
import p153l.pzi0;
import p153l.tzi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8086y0 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public jxd0 f22887g = new jxd0("insert_see_myself_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        CoreSuggested.UserInfo userInfoM140260e = aVar.f22838c.m140260e();
        if (userInfoM140260e.isVirtualCard() && userInfoM140260e.virtualCardType == VirtualCardType.NewUserSeeMyself) {
            return true;
        }
        if (this.f22887g.get().booleanValue()) {
            return false;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (!tzi0.m193670h(pzi0.m174454o(), (long) userM116593na.createdTime, gra.m131730p1()) && !userM116593na.isFakeUser() && !aVar.f22842g && !userM116593na.isBanedOrInactivated() && ((TextUtils.isEmpty(userM116593na.description) || userM116593na.pictures.size() < 3) && CoreModule.f18264c.f20381e0.f89095P0.get().longValue() >= gra.m131735q1() - 1)) {
            this.f22887g.put(Boolean.TRUE);
            aVar.f22842g = true;
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.virtualCardType = VirtualCardType.NewUserSeeMyself;
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.preSwipedDirection = SwipeDirection.LEFT;
            CoreModule.f18264c.f20405m0.m32157w6(userInfo, 0);
        }
        return false;
    }
}
