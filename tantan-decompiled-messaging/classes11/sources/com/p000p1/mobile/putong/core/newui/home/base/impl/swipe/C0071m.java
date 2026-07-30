package com.p000p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.base.impl.swipe.C0071m;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.j760;
import l.n3b0;
import l.vwb;
import l.xma;
import l.zvf0;
import p009l.th5;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0071m extends AbstractC0035a {

    /* JADX INFO: renamed from: g */
    public final int f881g = 1;

    /* JADX INFO: renamed from: h */
    public final int f882h = 2;

    /* JADX INFO: renamed from: i */
    public final int f883i = 3;

    /* JADX INFO: renamed from: j */
    public int f884j = 0;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1653p() {
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0062j.a aVar) {
        int i = this.f884j;
        if (i == 1) {
            m1656s(aVar.f873b.act());
        } else if (i == 2) {
            m1658u(aVar.f873b.act(), aVar.f874c.m17130d());
        } else if (i == 3) {
            m1657t(aVar.f873b.act());
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0062j.a aVar) {
        NewMainAct newMainActAct = aVar.f873b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || aVar.f875d != SwipeDirection.RIGHT || !NullChecker.a(aVar.f874c) || !NullChecker.a(aVar.f874c.m17131e()) || TextUtils.isEmpty(aVar.f874c.m17131e().payCardStyle) || aVar.f872a.f17697g) {
            return false;
        }
        String str = aVar.f874c.m17131e().payCardStyle;
        if ("match".equals(str) && xma.X3() && th5.m22530d()) {
            this.f884j = 1;
            return true;
        }
        if ("superlike".equals(str) && xma.m4() && th5.m22534h()) {
            this.f884j = 2;
            return true;
        }
        if ("chat".equals(str) && xma.e4() && th5.m22532f()) {
            this.f884j = 3;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m1656s(Act act) {
        zvf0.r("e_odiamond_sayhi", "p_suggest_users_home_view");
        b.l(act, "p_home,odiamond_sayhi", new d30() { // from class: l.s7h0
            public final void call() {
                C0071m.m1653p();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m1657t(Act act) {
        zvf0.r("e_send_message", "p_suggest_users_home_view");
        c.x0(act, "p_home,greet", Privilege.say_hi_pkg);
    }

    /* JADX INFO: renamed from: u */
    public final void m1658u(Act act, User user) {
        zvf0.u("e_superlikeButton", "p_suggest_users_home_view", new j760[]{vwb.Y("moments_user_id", ((DbObject) user).id), vwb.Y("is_privileged", Boolean.valueOf(!n3b0.t())), vwb.Y("showfrom_superlike", "home"), vwb.Y("from_top_tab", "tantan"), vwb.Y("is_newui_guide", Boolean.TRUE)});
        c.M1(act, "p_home,superlike", Privilege.vip_super_like, (d30) null, (d30) null, false, user);
    }
}
