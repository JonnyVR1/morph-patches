package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC8017b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8029c0;
import com.p051p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p153l.d79;
import p153l.joa;
import p153l.jyb;
import p153l.ndp;
import p153l.pzi0;
import p153l.sdp;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c0 */
/* JADX INFO: loaded from: classes11.dex */
public class C8029c0 extends AbstractC8022a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38570p(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded()) {
            C8032d0.m38591y(true);
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m38571q(C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded()) {
            sdp.m185493j(true);
            aVar.f22837b.m38128A2().mo39804A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: s */
    public final IntlSlGuideDialog.GuideType m38574s(C8049j.a aVar, User user, User user2) {
        if (sdp.m185489f()) {
            sdp.m185493j(false);
            return null;
        }
        IntlSlGuideConfig intlSlGuideConfigM114642A = d79.m114642A();
        if (!NullChecker.m82486a(intlSlGuideConfigM114642A)) {
            return null;
        }
        boolean zIsFemale = user.isFemale();
        int i = intlSlGuideConfigM114642A.intl_card_user_last_active_limit_time;
        if (i > 0 && m38578w(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigM114642A.intl_pop_0_30_women : intlSlGuideConfigM114642A.intl_pop_0_30_men) && m38577v(user, user2)) {
            return IntlSlGuideDialog.GuideType.TYPE_B;
        }
        if (f > (!zIsFemale ? intlSlGuideConfigM114642A.intl_pop_0_20_women : intlSlGuideConfigM114642A.intl_pop_0_20_men)) {
            return IntlSlGuideDialog.GuideType.TYPE_A;
        }
        if (sdp.m185488e(user2.f56859id)) {
            return IntlSlGuideDialog.GuideType.TYPE_D;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final List<String> m38575t(User user) {
        if (!NullChecker.m82486a(user.profile) || !NullChecker.m82486a(user.profile.extensions) || !NullChecker.m82486a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !jyb.m147479J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final C8049j.a aVar) {
        User userM38517n = m38517n();
        User userM140259d = aVar.f22838c.m140259d();
        IntlSlGuideDialog.GuideType guideTypeM38574s = m38574s(aVar, userM38517n, userM140259d);
        if (guideTypeM38574s == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sdp.m185491h(userM38517n.isFemale());
        IntlSlGuideDialog.m39620o(aVar.f22836a.m101951T4(), userM140259d, guideTypeM38574s, new x20() { // from class: l.jjh0
            @Override // p153l.x20
            public final void call() {
                this.f121179a.m38573x(aVar);
            }
        }, new x20() { // from class: l.kjh0
            @Override // p153l.x20
            public final void call() {
                C8029c0.m38571q(aVar);
            }
        });
        aVar.f22842g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m38577v(User user, User user2) {
        List<String> listM38575t = m38575t(user);
        List<String> listM38575t2 = m38575t(user2);
        if (!jyb.m147479J(listM38575t) && !jyb.m147479J(listM38575t2)) {
            for (String str : listM38575t) {
                if (str != null && listM38575t2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m38578w(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (pzi0.m174454o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m38573x(final C8049j.a aVar) {
        if (NullChecker.m82486a(aVar.f22837b) && aVar.f22837b.m38344q2().isAdded()) {
            if (!sdp.m185487d()) {
                C8032d0.m38591y(true);
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.m82486a(aVar.f22838c) && NullChecker.m82486a(aVar.f22838c.m140256a())) ? aVar.f22838c.m140256a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = aVar.f22837b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC8017b.f22662c;
            if (cardView != null && vFrame != null) {
                new ndp(viewTreeObserverOnGlobalLayoutListenerC8017b.act(), vFrame).m162726i(cardView, new Runnable() { // from class: l.ljh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8029c0.m38570p(aVar);
                    }
                });
            } else {
                C8032d0.m38591y(true);
                aVar.f22837b.m38128A2().mo39804A(SwipeDirection.UP);
            }
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        if (IntlCountryCodeController.m29114k() || aVar.f22839d != SwipeDirection.RIGHT || joa.m146354D3()) {
            return false;
        }
        User userM38517n = m38517n();
        if (!NullChecker.m82486a(userM38517n) || userM38517n.isBanned() || !NullChecker.m82486a(aVar.f22838c) || !NullChecker.m82486a(aVar.f22838c.m140260e()) || sdp.m185490g(aVar.f22838c.m140260e()) || !sdp.m185484a(userM38517n.isFemale())) {
            return false;
        }
        User userM140259d = aVar.f22838c.m140259d();
        return NullChecker.m82486a(userM140259d) && m38574s(aVar, userM38517n, userM140259d) != null;
    }
}
