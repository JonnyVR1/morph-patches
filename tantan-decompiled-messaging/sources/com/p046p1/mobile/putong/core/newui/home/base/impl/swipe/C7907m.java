package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7907m;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.match.C8456b;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.d30;
import p149l.n3b0;
import p149l.th5;
import p149l.vwb;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m */
/* JADX INFO: loaded from: classes11.dex */
public class C7907m extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public final int f22103g = 1;

    /* JADX INFO: renamed from: h */
    public final int f22104h = 2;

    /* JADX INFO: renamed from: i */
    public final int f22105i = 3;

    /* JADX INFO: renamed from: j */
    public int f22106j = 0;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m37682p() {
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        int i = this.f22106j;
        if (i == 1) {
            m37685s(aVar.f22095b.act());
        } else if (i == 2) {
            m37687u(aVar.f22095b.act(), aVar.f22096c.m141745d());
        } else if (i == 3) {
            m37686t(aVar.f22095b.act());
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        NewMainAct newMainActAct = aVar.f22095b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || aVar.f22097d != SwipeDirection.RIGHT || !NullChecker.m81303a(aVar.f22096c) || !NullChecker.m81303a(aVar.f22096c.m141746e()) || TextUtils.isEmpty(aVar.f22096c.m141746e().payCardStyle) || aVar.f22094a.f140387g) {
            return false;
        }
        String str = aVar.f22096c.m141746e().payCardStyle;
        if ("match".equals(str) && xma.m210059X3() && th5.m188861d()) {
            this.f22106j = 1;
            return true;
        }
        if ("superlike".equals(str) && xma.m210087m4() && th5.m188865h()) {
            this.f22106j = 2;
            return true;
        }
        if ("chat".equals(str) && xma.m210071e4() && th5.m188863f()) {
            this.f22106j = 3;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m37685s(Act act) {
        zvf0.m220396r("e_odiamond_sayhi", "p_suggest_users_home_view");
        C8456b.m47633l(act, "p_home,odiamond_sayhi", new d30() { // from class: l.s7h0
            @Override // p149l.d30
            public final void call() {
                C7907m.m37682p();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m37686t(Act act) {
        zvf0.m220396r("e_send_message", "p_suggest_users_home_view");
        C8764c.m53504x0(act, "p_home,greet", Privilege.say_hi_pkg);
    }

    /* JADX INFO: renamed from: u */
    public final void m37687u(Act act, User user) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_superlikeButton, "p_suggest_users_home_view", vwb.m200311Y("moments_user_id", user.f56011id), vwb.m200311Y("is_privileged", Boolean.valueOf(!n3b0.m157745t())), vwb.m200311Y("showfrom_superlike", "home"), vwb.m200311Y("from_top_tab", "tantan"), vwb.m200311Y("is_newui_guide", Boolean.TRUE));
        C8764c.m53412M1(act, "p_home,superlike", Privilege.vip_super_like, null, null, false, user);
    }
}
