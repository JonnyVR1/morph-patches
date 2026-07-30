package p009l;

import android.view.View;
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
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zip extends udp {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25826i(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && c0970a.f14968b.m20403e0().isAdded()) {
            sbp.m22053j(true);
            c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m25827j(j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && c0970a.f14968b.m20403e0().isAdded()) {
            cjp.m12633r(true);
            c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: m */
    private List<String> m25829m(User user) {
        if (!NullChecker.a(user.profile) || !NullChecker.a(user.profile.extensions) || !NullChecker.a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    /* JADX INFO: renamed from: o */
    private boolean m25830o(User user, User user2) {
        List<String> listM25829m = m25829m(user);
        List<String> listM25829m2 = m25829m(user2);
        if (!vwb.J(listM25829m) && !vwb.J(listM25829m2)) {
            for (String str : listM25829m) {
                if (str != null && listM25829m2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m25831p(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (mqi0.m18550o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: l */
    public final IntlSlGuideDialog.GuideType m25833l(j7h0.C0970a c0970a, User user, User user2) {
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
        if (i > 0 && m25831p(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigA.intl_pop_0_30_women : intlSlGuideConfigA.intl_pop_0_30_men) && m25830o(user, user2)) {
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

    @Override // p009l.p3m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(final j7h0.C0970a c0970a) {
        User userM22809h = m22809h();
        User userM17130d = c0970a.f14969c.m17130d();
        IntlSlGuideDialog.GuideType guideTypeM25833l = m25833l(c0970a, userM22809h, userM17130d);
        if (guideTypeM25833l == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sbp.m22051h(userM22809h.isFemale());
        IntlSlGuideDialog.m2603o(c0970a.f14968b.act(), userM17130d, guideTypeM25833l, new d30() { // from class: l.wip
            public final void call() {
                this.f22140a.m25832q(c0970a);
            }
        }, new d30() { // from class: l.xip
            public final void call() {
                zip.m25826i(c0970a);
            }
        });
        c0970a.f14973g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m25832q(final j7h0.C0970a c0970a) {
        if (NullChecker.a(c0970a.f14968b) && c0970a.f14968b.m20403e0().isAdded()) {
            if (!sbp.m22047d()) {
                cjp.m12633r(true);
                c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.a(c0970a.f14969c) && NullChecker.a(c0970a.f14969c.m17127a())) ? c0970a.f14969c.m17127a().getCardView() : null;
            pip pipVar = c0970a.f14968b;
            VFrame vFrame = pipVar.f18696o;
            if (cardView != null && vFrame != null) {
                new nbp(pipVar.act(), vFrame).m18835i(cardView, new Runnable() { // from class: l.yip
                    @Override // java.lang.Runnable
                    public final void run() {
                        zip.m25827j(c0970a);
                    }
                });
            } else {
                cjp.m12633r(true);
                c0970a.f14968b.m20414m0().mo2797A(SwipeDirection.UP);
            }
        }
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(j7h0.C0970a c0970a) {
        if (IntlCountryCodeController.k() || c0970a.f14970d != SwipeDirection.RIGHT || xma.C3()) {
            return false;
        }
        User userM22809h = m22809h();
        if (!NullChecker.a(userM22809h) || userM22809h.isBanned() || !NullChecker.a(c0970a.f14969c) || !NullChecker.a(c0970a.f14969c.m17131e()) || sbp.m22050g(c0970a.f14969c.m17131e()) || !sbp.m22044a(userM22809h.isFemale())) {
            return false;
        }
        User userM17130d = c0970a.f14969c.m17130d();
        return NullChecker.a(userM17130d) && m25833l(c0970a, userM22809h, userM17130d) != null;
    }
}
