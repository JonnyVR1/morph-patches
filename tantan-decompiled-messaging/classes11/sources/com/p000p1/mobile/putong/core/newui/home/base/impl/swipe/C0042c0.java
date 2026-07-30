package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p000p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC0030b;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0042c0;
import com.p000p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.u59;
import l.vwb;
import l.xma;
import p009l.mqi0;
import p009l.nbp;
import p009l.sbp;
import v.VFrame;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0042c0 extends AbstractC0035a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1538p(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded()) {
            C0045d0.m1559y(true);
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m1539q(C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded()) {
            sbp.m22053j(true);
            aVar.f873b.m1092A2().mo2797A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: s */
    public final IntlSlGuideDialog.GuideType m1542s(C0062j.a aVar, User user, User user2) {
        if (sbp.m22049f()) {
            sbp.m22053j(false);
            return null;
        }
        IntlSlGuideConfig intlSlGuideConfigA = u59.A();
        if (!NullChecker.a(intlSlGuideConfigA)) {
            return null;
        }
        boolean zIsFemale = user.isFemale();
        int i = intlSlGuideConfigA.intl_card_user_last_active_limit_time;
        if (i > 0 && m1546w(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigA.intl_pop_0_30_women : intlSlGuideConfigA.intl_pop_0_30_men) && m1545v(user, user2)) {
            return IntlSlGuideDialog.GuideType.TYPE_B;
        }
        if (f > (!zIsFemale ? intlSlGuideConfigA.intl_pop_0_20_women : intlSlGuideConfigA.intl_pop_0_20_men)) {
            return IntlSlGuideDialog.GuideType.TYPE_A;
        }
        if (sbp.m22048e(((DbObject) user2).id)) {
            return IntlSlGuideDialog.GuideType.TYPE_D;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final List<String> m1543t(User user) {
        if (!NullChecker.a(user.profile) || !NullChecker.a(user.profile.extensions) || !NullChecker.a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final C0062j.a aVar) {
        User userM1485n = m1485n();
        User userM17130d = aVar.f874c.m17130d();
        IntlSlGuideDialog.GuideType guideTypeM1542s = m1542s(aVar, userM1485n, userM17130d);
        if (guideTypeM1542s == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sbp.m22051h(userM1485n.isFemale());
        IntlSlGuideDialog.m2603o(aVar.f872a.m19361T4(), userM17130d, guideTypeM1542s, new d30() { // from class: l.bbh0
            public final void call() {
                this.f9998a.m1541x(aVar);
            }
        }, new d30() { // from class: l.cbh0
            public final void call() {
                C0042c0.m1539q(aVar);
            }
        });
        aVar.f878g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1545v(User user, User user2) {
        List<String> listM1543t = m1543t(user);
        List<String> listM1543t2 = m1543t(user2);
        if (!vwb.J(listM1543t) && !vwb.J(listM1543t2)) {
            for (String str : listM1543t) {
                if (str != null && listM1543t2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1546w(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (mqi0.m18550o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m1541x(final C0062j.a aVar) {
        if (NullChecker.a(aVar.f873b) && aVar.f873b.m1310q2().isAdded()) {
            if (!sbp.m22047d()) {
                C0045d0.m1559y(true);
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.a(aVar.f874c) && NullChecker.a(aVar.f874c.m17127a())) ? aVar.f874c.m17127a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = aVar.f873b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC0030b.f698c;
            if (cardView != null && vFrame != null) {
                new nbp(viewTreeObserverOnGlobalLayoutListenerC0030b.act(), vFrame).m18835i(cardView, new Runnable() { // from class: l.dbh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0042c0.m1538p(aVar);
                    }
                });
            } else {
                C0045d0.m1559y(true);
                aVar.f873b.m1092A2().mo2797A(SwipeDirection.UP);
            }
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        if (IntlCountryCodeController.k() || aVar.f875d != SwipeDirection.RIGHT || xma.C3()) {
            return false;
        }
        User userM1485n = m1485n();
        if (!NullChecker.a(userM1485n) || userM1485n.isBanned() || !NullChecker.a(aVar.f874c) || !NullChecker.a(aVar.f874c.m17131e()) || sbp.m22050g(aVar.f874c.m17131e()) || !sbp.m22044a(userM1485n.isFemale())) {
            return false;
        }
        User userM17130d = aVar.f874c.m17130d();
        return NullChecker.a(userM17130d) && m1542s(aVar, userM1485n, userM17130d) != null;
    }
}
