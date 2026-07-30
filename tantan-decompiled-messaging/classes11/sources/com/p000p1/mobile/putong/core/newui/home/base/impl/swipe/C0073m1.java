package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.CounterLikeLimit;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.f6c0;
import l.hdb0;
import l.qib0;
import l.u4c0;
import p009l.mqi0;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m1 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0073m1 extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public static boolean f887g = false;

    /* JADX INFO: renamed from: r */
    public static void m1662r(Act act, User user) {
        CoreModule.c.e0.s6.put(mqi0.m18555t());
        View viewInflate = LayoutInflater.from(act).inflate(f6c0.rc, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.e4);
        StringBuilder sb = new StringBuilder("今日已右滑");
        sb.append(user.isFemale() ? "700" : "100");
        sb.append("次，可继续发送喜欢");
        vTextFindViewById.setText(sb.toString());
        qib0.G.L0(viewInflate.findViewById(u4c0.Y), user.fp().profileSmall().formatted());
        hdb0.c().i(new SimplePushBubble.a(act, viewInflate).u("NotifySwipeCount").v("NotifySwipeCount").w(5000).E(true).z(CorePopLevel.VERIFIED_EXTRA_SWIPE_COUNT).s());
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        return null;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        SwipeDirection swipeDirection = aVar.f875d;
        SwipeDirection swipeDirection2 = SwipeDirection.RIGHT;
        if (swipeDirection != swipeDirection2) {
            return false;
        }
        User userNa = CoreModule.c.e0.na();
        if (userNa.isVIP() || !userNa.isPicVerificationVerified() || TextUtils.equals((CharSequence) CoreModule.c.e0.s6.get(), mqi0.m18555t())) {
            return false;
        }
        CounterLikeLimit counterLikeLimit = m1479h() != null ? m1479h().likeLimit : null;
        if (aVar.f875d == swipeDirection2 && NullChecker.a(counterLikeLimit) && ((userNa.isFemale() && counterLikeLimit.count == 700) || (!userNa.isFemale() && counterLikeLimit.count == 100))) {
            m1662r(aVar.f873b.act(), userNa);
        }
        return false;
    }
}
