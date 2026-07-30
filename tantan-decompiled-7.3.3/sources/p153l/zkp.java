package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class zkp extends ufp {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m220120i(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && c19824a.f162788b.m172715e0().isAdded()) {
            sdp.m185493j(true);
            c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m220121j(rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && c19824a.f162788b.m172715e0().isAdded()) {
            clp.m110673r(true);
            c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: m */
    private List<String> m220123m(User user) {
        if (!NullChecker.m82486a(user.profile) || !NullChecker.m82486a(user.profile.extensions) || !NullChecker.m82486a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !jyb.m147479J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    /* JADX INFO: renamed from: o */
    private boolean m220124o(User user, User user2) {
        List<String> listM220123m = m220123m(user);
        List<String> listM220123m2 = m220123m(user2);
        if (!jyb.m147479J(listM220123m) && !jyb.m147479J(listM220123m2)) {
            for (String str : listM220123m) {
                if (str != null && listM220123m2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m220125p(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (pzi0.m174454o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: l */
    public final IntlSlGuideDialog.GuideType m220127l(rfh0.C19824a c19824a, User user, User user2) {
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
        if (i > 0 && m220125p(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigM114642A.intl_pop_0_30_women : intlSlGuideConfigM114642A.intl_pop_0_30_men) && m220124o(user, user2)) {
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

    @Override // p153l.g6m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(final rfh0.C19824a c19824a) {
        User userM195855h = m195855h();
        User userM140259d = c19824a.f162789c.m140259d();
        IntlSlGuideDialog.GuideType guideTypeM220127l = m220127l(c19824a, userM195855h, userM140259d);
        if (guideTypeM220127l == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sdp.m185491h(userM195855h.isFemale());
        IntlSlGuideDialog.m39620o(c19824a.f162788b.getAct(), userM140259d, guideTypeM220127l, new x20() { // from class: l.wkp
            @Override // p153l.x20
            public final void call() {
                this.f189581a.m220126q(c19824a);
            }
        }, new x20() { // from class: l.xkp
            @Override // p153l.x20
            public final void call() {
                zkp.m220120i(c19824a);
            }
        });
        c19824a.f162793g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m220126q(final rfh0.C19824a c19824a) {
        if (NullChecker.m82486a(c19824a.f162788b) && c19824a.f162788b.m172715e0().isAdded()) {
            if (!sdp.m185487d()) {
                clp.m110673r(true);
                c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.m82486a(c19824a.f162789c) && NullChecker.m82486a(c19824a.f162789c.m140256a())) ? c19824a.f162789c.m140256a().getCardView() : null;
            pkp pkpVar = c19824a.f162788b;
            VFrame vFrame = pkpVar.f152917o;
            if (cardView != null && vFrame != null) {
                new ndp(pkpVar.getAct(), vFrame).m162726i(cardView, new Runnable() { // from class: l.ykp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zkp.m220121j(c19824a);
                    }
                });
            } else {
                clp.m110673r(true);
                c19824a.f162788b.m172725m0().mo39804A(SwipeDirection.UP);
            }
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        if (IntlCountryCodeController.m29114k() || c19824a.f162790d != SwipeDirection.RIGHT || joa.m146354D3()) {
            return false;
        }
        User userM195855h = m195855h();
        if (!NullChecker.m82486a(userM195855h) || userM195855h.isBanned() || !NullChecker.m82486a(c19824a.f162789c) || !NullChecker.m82486a(c19824a.f162789c.m140260e()) || sdp.m185490g(c19824a.f162789c.m140260e()) || !sdp.m185484a(userM195855h.isFemale())) {
            return false;
        }
        User userM140259d = c19824a.f162789c.m140259d();
        return NullChecker.m82486a(userM140259d) && m220127l(c19824a, userM195855h, userM140259d) != null;
    }
}
