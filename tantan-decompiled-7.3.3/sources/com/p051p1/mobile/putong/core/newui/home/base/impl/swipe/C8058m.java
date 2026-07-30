package com.p051p1.mobile.putong.core.newui.home.base.impl.swipe;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8058m;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.rbb0;
import p153l.ti5;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.m */
/* JADX INFO: loaded from: classes11.dex */
public class C8058m extends AbstractC8022a {

    /* JADX INFO: renamed from: g */
    public final int f22845g = 1;

    /* JADX INFO: renamed from: h */
    public final int f22846h = 2;

    /* JADX INFO: renamed from: i */
    public final int f22847i = 3;

    /* JADX INFO: renamed from: j */
    public int f22848j = 0;

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m38685p() {
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8049j.a aVar) {
        int i = this.f22848j;
        if (i == 1) {
            m38688s(aVar.f22837b.act());
        } else if (i == 2) {
            m38690u(aVar.f22837b.act(), aVar.f22838c.m140259d());
        } else if (i == 3) {
            m38689t(aVar.f22837b.act());
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8049j.a aVar) {
        NewMainAct newMainActAct = aVar.f22837b.act();
        if (newMainActAct == null || newMainActAct.isFinishing() || aVar.f22839d != SwipeDirection.RIGHT || !NullChecker.m82486a(aVar.f22838c) || !NullChecker.m82486a(aVar.f22838c.m140260e()) || TextUtils.isEmpty(aVar.f22838c.m140260e().payCardStyle) || aVar.f22836a.f74539g) {
            return false;
        }
        String str = aVar.f22838c.m140260e().payCardStyle;
        if ("match".equals(str) && joa.m146373Y3() && ti5.m191318d()) {
            this.f22848j = 1;
            return true;
        }
        if ("superlike".equals(str) && joa.m146401n4() && ti5.m191322h()) {
            this.f22848j = 2;
            return true;
        }
        if ("chat".equals(str) && joa.m146386f4() && ti5.m191320f()) {
            this.f22848j = 3;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m38688s(Act act) {
        i4g0.m138520r("e_odiamond_sayhi", "p_suggest_users_home_view");
        C8619b.m48816l(act, "p_home,odiamond_sayhi", new x20() { // from class: l.agh0
            @Override // p153l.x20
            public final void call() {
                C8058m.m38685p();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m38689t(Act act) {
        i4g0.m138520r("e_send_message", "p_suggest_users_home_view");
        C8927c.m54687x0(act, "p_home,greet", Privilege.say_hi_pkg);
    }

    /* JADX INFO: renamed from: u */
    public final void m38690u(Act act, User user) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_superlikeButton, "p_suggest_users_home_view", jyb.m147494Y("moments_user_id", user.f56859id), jyb.m147494Y("is_privileged", Boolean.valueOf(!rbb0.m180747t())), jyb.m147494Y("showfrom_superlike", "home"), jyb.m147494Y("from_top_tab", "tantan"), jyb.m147494Y("is_newui_guide", Boolean.TRUE));
        C8927c.m54595M1(act, "p_home,superlike", Privilege.vip_super_like, null, null, false, user);
    }
}
