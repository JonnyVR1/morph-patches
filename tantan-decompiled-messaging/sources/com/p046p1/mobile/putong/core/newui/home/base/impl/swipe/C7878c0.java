package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.view.View;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.IntlSlGuideConfig;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.ViewTreeObserverOnGlobalLayoutListenerC7866b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7878c0;
import com.p046p1.mobile.putong.core.newui.home.intlslguide.IntlSlGuideDialog;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p149l.d30;
import p149l.mqi0;
import p149l.nbp;
import p149l.sbp;
import p149l.u59;
import p149l.vwb;
import p149l.xma;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.c0 */
/* JADX INFO: loaded from: classes11.dex */
public class C7878c0 extends AbstractC7871a {
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37567p(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded()) {
            C7881d0.m37588y(true);
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m37568q(C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded()) {
            sbp.m183250j(true);
            aVar.f22095b.m37125A2().mo38801A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: s */
    public final IntlSlGuideDialog.GuideType m37571s(C7898j.a aVar, User user, User user2) {
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
        if (i > 0 && m37575w(user2, i)) {
            return IntlSlGuideDialog.GuideType.TYPE_C;
        }
        float f = user2.popularity;
        if (f > (!zIsFemale ? intlSlGuideConfigM191792A.intl_pop_0_30_women : intlSlGuideConfigM191792A.intl_pop_0_30_men) && m37574v(user, user2)) {
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

    /* JADX INFO: renamed from: t */
    public final List<String> m37572t(User user) {
        if (!NullChecker.m81303a(user.profile) || !NullChecker.m81303a(user.profile.extensions) || !NullChecker.m81303a(user.profile.extensions.basic)) {
            return null;
        }
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        return !vwb.m200296J(list) ? list : user.profile.extensions.basic.intlFriendPurpose;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(final C7898j.a aVar) {
        User userM37514n = m37514n();
        User userM141745d = aVar.f22096c.m141745d();
        IntlSlGuideDialog.GuideType guideTypeM37571s = m37571s(aVar, userM37514n, userM141745d);
        if (guideTypeM37571s == null) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        sbp.m183248h(userM37514n.isFemale());
        IntlSlGuideDialog.m38617o(aVar.f22094a.m161157T4(), userM141745d, guideTypeM37571s, new d30() { // from class: l.bbh0
            @Override // p149l.d30
            public final void call() {
                this.f74806a.m37570x(aVar);
            }
        }, new d30() { // from class: l.cbh0
            @Override // p149l.d30
            public final void call() {
                C7878c0.m37568q(aVar);
            }
        });
        aVar.f22100g = true;
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m37574v(User user, User user2) {
        List<String> listM37572t = m37572t(user);
        List<String> listM37572t2 = m37572t(user2);
        if (!vwb.m200296J(listM37572t) && !vwb.m200296J(listM37572t2)) {
            for (String str : listM37572t) {
                if (str != null && listM37572t2.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m37575w(User user, int i) {
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        return lastActiveTimeMillis > 0 && (mqi0.m155944o() - lastActiveTimeMillis) / 3600000 < ((long) i);
    }

    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void m37570x(final C7898j.a aVar) {
        if (NullChecker.m81303a(aVar.f22095b) && aVar.f22095b.m37341q2().isAdded()) {
            if (!sbp.m183244d()) {
                C7881d0.m37588y(true);
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
                return;
            }
            View cardView = (NullChecker.m81303a(aVar.f22096c) && NullChecker.m81303a(aVar.f22096c.m141742a())) ? aVar.f22096c.m141742a().getCardView() : null;
            ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = aVar.f22095b;
            VFrame vFrame = viewTreeObserverOnGlobalLayoutListenerC7866b.f21920c;
            if (cardView != null && vFrame != null) {
                new nbp(viewTreeObserverOnGlobalLayoutListenerC7866b.act(), vFrame).m158826i(cardView, new Runnable() { // from class: l.dbh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7878c0.m37567p(aVar);
                    }
                });
            } else {
                C7881d0.m37588y(true);
                aVar.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
            }
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (IntlCountryCodeController.m28115k() || aVar.f22097d != SwipeDirection.RIGHT || xma.m210040C3()) {
            return false;
        }
        User userM37514n = m37514n();
        if (!NullChecker.m81303a(userM37514n) || userM37514n.isBanned() || !NullChecker.m81303a(aVar.f22096c) || !NullChecker.m81303a(aVar.f22096c.m141746e()) || sbp.m183247g(aVar.f22096c.m141746e()) || !sbp.m183241a(userM37514n.isFemale())) {
            return false;
        }
        User userM141745d = aVar.f22096c.m141745d();
        return NullChecker.m81303a(userM141745d) && m37571s(aVar, userM37514n, userM141745d) != null;
    }
}
