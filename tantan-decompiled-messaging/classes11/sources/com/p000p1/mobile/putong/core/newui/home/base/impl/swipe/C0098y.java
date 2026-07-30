package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.utils.NullChecker;
import kotlin.jvm.functions.Function0;
import l.j8w;
import l.p9w;
import l.u59;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.y */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0098y extends AbstractC0035a {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        SwipeDirection swipeDirection = aVar.f875d;
        if (swipeDirection != SwipeDirection.RIGHT) {
            return swipeDirection == SwipeDirection.UP ? VSwipeStack.OnCardSwipeResult.back : VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreSuggested.UserInfo userInfoM17131e = aVar.f874c.m17131e();
        if (NullChecker.a(userInfoM17131e.intlInsertCardData.buzzUser)) {
            p9w.INSTANCE.N(userInfoM17131e.intlInsertCardData.buzzUser.isBlur, "right");
            j8w.Companion.a().W(aVar.f872a.m19361T4(), userInfoM17131e.intlInsertCardData.buzzUser.buzzToken, userInfoM17131e.id, "", (Function0) null, (Function0) null, (Function0) null, false);
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        boolean zY3;
        if (!u59.d0() || !NullChecker.a(CoreModule.c.m0.e2) || !NullChecker.a(aVar.f874c) || !(zY3 = CoreModule.c.m0.e2.y3(aVar.f874c.m17131e()))) {
            return false;
        }
        boolean zX3 = CoreModule.c.m0.e2.x3(aVar.f874c.m17131e());
        SwipeDirection swipeDirection = aVar.f875d;
        if (swipeDirection == SwipeDirection.UP) {
            if (zX3) {
                return true;
            }
            p9w.INSTANCE.N(false, "up");
            return false;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            p9w.INSTANCE.N(zX3, "left");
            return false;
        }
        if (swipeDirection == SwipeDirection.RIGHT && aVar.f876e) {
            return NullChecker.a(aVar.f877f) && NullChecker.a(aVar.f877f.f1757h) && TextUtils.equals(aVar.f877f.f1757h.getFrom(), HomeStatisticsHelper.ScActionFrom.PROFILE.getFrom());
        }
        return zY3;
    }
}
