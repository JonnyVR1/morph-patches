package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.f6c0;
import p149l.hdb0;
import p149l.mqi0;
import p149l.qib0;
import p149l.u4c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7909m1 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public static boolean f22109g = false;

    /* JADX INFO: renamed from: r */
    public static void m37691r(Act act, User user) {
        CoreModule.f17545c.f19639e0.f149471s6.put(mqi0.m155949t());
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.f95983rc, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174224e4);
        StringBuilder sb = new StringBuilder("今日已右滑");
        sb.append(user.isFemale() ? "700" : "100");
        sb.append("次，可继续发送喜欢");
        vText.setText(sb.toString());
        qib0.f154691G.m102331L0((SimpleDraweeView) viewInflate.findViewById(u4c0.f174119Y), user.m60124fp().profileSmall().formatted());
        hdb0.m130575c().m130582i(new SimplePushBubble.C4372a(act, viewInflate).m21171u("NotifySwipeCount").m21172v("NotifySwipeCount").m21173w(5000).m21167E(true).m21176z(CorePopLevel.VERIFIED_EXTRA_SWIPE_COUNT).m21169s());
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        SwipeDirection swipeDirection = aVar.f22097d;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection != swipeDirection2) {
            return false;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (userM169520na.isVIP() || !userM169520na.isPicVerificationVerified() || TextUtils.equals(CoreModule.f17545c.f19639e0.f149471s6.get(), mqi0.m155949t())) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = m37508h() != null ? m37508h().likeLimit : null;
        if (aVar.f22097d == swipeDirection2 && NullChecker.m81303a(counterLikeLimit) && ((userM169520na.isFemale() && counterLikeLimit.count == 700) || (!userM169520na.isFemale() && counterLikeLimit.count == 100))) {
            m37691r(aVar.f22095b.act(), userM169520na);
        }
        return false;
    }
}
