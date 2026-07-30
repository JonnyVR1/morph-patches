package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.adc0;
import p153l.kec0;
import p153l.llb0;
import p153l.pzi0;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m1 */
/* JADX INFO: loaded from: classes11.dex */
public class C8060m1 extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public static boolean f22851g = false;

    /* JADX INFO: renamed from: r */
    public static void m38694r(Act act, User user) {
        CoreModule.f18264c.f20381e0.f89328s6.put(pzi0.m174459t());
        View viewInflate = LayoutInflater.from(act).inflate(kec0.f126156yc, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70349g4);
        StringBuilder sb = new StringBuilder("今日已右滑");
        sb.append(user.isFemale() ? "700" : "100");
        sb.append("次，可继续发送喜欢");
        vText.setText(sb.toString());
        uqb0.f180374G.m127115L0((SimpleDraweeView) viewInflate.findViewById(adc0.f70210Y), user.m61308fp().profileSmall().formatted());
        llb0.m154703c().m154710i(new SimplePushBubble.C4523a(act, viewInflate).m22170u("NotifySwipeCount").m22171v("NotifySwipeCount").m22172w(5000).m22166E(true).m22175z(CorePopLevel.VERIFIED_EXTRA_SWIPE_COUNT).m22168s());
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        return null;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22839d;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection != swipeDirection2) {
            return false;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (userM116593na.isVIP() || !userM116593na.isPicVerificationVerified() || TextUtils.equals(CoreModule.f18264c.f20381e0.f89328s6.get(), pzi0.m174459t())) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = m38511h() != null ? m38511h().likeLimit : null;
        if (aVar.f22839d == swipeDirection2 && NullChecker.m82486a(counterLikeLimit) && ((userM116593na.isFemale() && counterLikeLimit.count == 700) || (!userM116593na.isFemale() && counterLikeLimit.count == 100))) {
            m38694r(aVar.f22837b.act(), userM116593na);
        }
        return false;
    }
}
