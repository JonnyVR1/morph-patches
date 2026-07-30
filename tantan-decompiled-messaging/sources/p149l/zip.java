package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes11.dex */
public class zip extends udp {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m219051i(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && c17710a.f116600b.m169719e0().isAdded()) {
            sbp.m183250j(true);
            c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m219052j(j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && c17710a.f116600b.m169719e0().isAdded()) {
            cjp.m107223r(true);
            c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: m */
    private List<String> m219054m(User user) {
        if (!NullChecker.m81303a(user.profile) || !NullChecker.m81303a(user.profile.extensions) || !NullChecker.m81303a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.m200296J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    /* JADX INFO: renamed from: o */
    private boolean m219055o(User user, User user2) {
        List<String> listM219054m = m219054m(user);
        List<String> listM219054m2 = m219054m(user2);
        if (!vwb.m200296J(listM219054m) && !vwb.m200296J(listM219054m2)) {
            for (String str : listM219054m) {
                if (str != null && listM219054m2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private boolean m219056p(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (mqi0.m155944o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: l */
    public final IntlSlGuideDialog.GuideType m219058l(j7h0.C17710a c17710a, User user, User user2) {
        if (sbp.m183246f()) {
            sbp.m183250j(false);
            return null;
        }
        IntlSlGuideConfig intlSlGuideConfigM191792A = u59.m191792A();
        if (!NullChecker.m81303a(intlSlGuideConfigM191792A)) {
            return null;
        }
        boolean zIsFemale = user.isFemale();
        int i = intlSlGuideConfigM191792A.intl_card_user_last_active_limit_time;
        if (i > 0 && m219056p(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigM191792A.intl_pop_0_30_women : intlSlGuideConfigM191792A.intl_pop_0_30_men) && m219055o(user, user2)) {
            return IntlSlGuideDialog.GuideType.TYPE_B;
        }
        if (f > (!zIsFemale ? intlSlGuideConfigM191792A.intl_pop_0_20_women : intlSlGuideConfigM191792A.intl_pop_0_20_men)) {
            return IntlSlGuideDialog.GuideType.TYPE_A;
        }
        if (sbp.m183245e(user2.f56011id)) {
            return IntlSlGuideDialog.GuideType.TYPE_D;
        }
        return null;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final j7h0.C17710a c17710a) {
        User userM193150h = m193150h();
        User userM141745d = c17710a.f116601c.m141745d();
        IntlSlGuideDialog.GuideType guideTypeM219058l = m219058l(c17710a, userM193150h, userM141745d);
        if (guideTypeM219058l == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sbp.m183248h(userM193150h.isFemale());
        IntlSlGuideDialog.m38617o(c17710a.f116600b.getAct(), userM141745d, guideTypeM219058l, new d30() { // from class: l.wip
            @Override // p149l.d30
            public final void call() {
                this.f186559a.m219057q(c17710a);
            }
        }, new d30() { // from class: l.xip
            @Override // p149l.d30
            public final void call() {
                zip.m219051i(c17710a);
            }
        });
        c17710a.f116605g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m219057q(final j7h0.C17710a c17710a) {
        if (NullChecker.m81303a(c17710a.f116600b) && c17710a.f116600b.m169719e0().isAdded()) {
            if (!sbp.m183244d()) {
                cjp.m107223r(true);
                c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.m81303a(c17710a.f116601c) && NullChecker.m81303a(c17710a.f116601c.m141742a())) ? c17710a.f116601c.m141742a().getCardView() : null;
            pip pipVar = c17710a.f116600b;
            VFrame vFrame = pipVar.f149650o;
            if (cardView != null && vFrame != null) {
                new nbp(pipVar.getAct(), vFrame).m158826i(cardView, new Runnable() { // from class: l.yip
                    @Override // java.lang.Runnable
                    public final void run() {
                        zip.m219052j(c17710a);
                    }
                });
            } else {
                cjp.m107223r(true);
                c17710a.f116600b.m169729m0().mo38801A(SwipeDirection.UP);
            }
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(j7h0.C17710a c17710a) {
        if (IntlCountryCodeController.m28115k() || c17710a.f116602d != SwipeDirection.RIGHT || xma.m210040C3()) {
            return false;
        }
        User userM193150h = m193150h();
        if (!NullChecker.m81303a(userM193150h) || userM193150h.isBanned() || !NullChecker.m81303a(c17710a.f116601c) || !NullChecker.m81303a(c17710a.f116601c.m141746e()) || sbp.m183247g(c17710a.f116601c.m141746e()) || !sbp.m183241a(userM193150h.isFemale())) {
            return false;
        }
        User userM141745d = c17710a.f116601c.m141745d();
        return NullChecker.m81303a(userM141745d) && m219058l(c17710a, userM193150h, userM141745d) != null;
    }
}
