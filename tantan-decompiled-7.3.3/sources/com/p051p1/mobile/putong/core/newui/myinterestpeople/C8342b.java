package com.p051p1.mobile.putong.core.newui.myinterestpeople;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.myinterestpeople.C8342b;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p153l.epc0;
import p153l.f59;
import p153l.g6m;
import p153l.i4g0;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.r1j0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8342b implements g6m<C8343c.a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m43665c(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m43666d(User user, Act act, f59 f59Var, Boolean bool) {
        CoreModule.m30932N().mo61515Wd(user.f56859id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !f59Var.m124112f()) {
            return;
        }
        r1j0.m179420g("小红花已发送");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m43668f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m43669g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m43670h(User user, Act act, f59 f59Var, Boolean bool) {
        CoreModule.m30932N().mo61515Wd(user.f56859id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !f59Var.m124112f()) {
            return;
        }
        r1j0.m179420g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: i */
    public VSwipeStack.OnCardSwipeResult m43671i(C8343c.a aVar) {
        User userM124109c = aVar.f26830e.m124109c();
        if (epc0.m121848c(userM124109c.f56859id)) {
            m43674l(aVar);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreModule.m30930K().mo31741Yn(aVar.f26826a, userM124109c.f56859id, null, "p_interested_user", null, false, "");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public void m43672j(f59 f59Var, Act act) {
        i4g0.m138523u(MatchScData.ModuleId.mid_e_follow, "p_interested_user", pf60.m172085a("card_user_id", f59Var.m124109c().f56859id));
        User userM124109c = f59Var.m124109c();
        if (NullChecker.m82487b(userM124109c)) {
            Followship followship = userM124109c.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM124109c.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(userM124109c.localFollowship.state, "unknown_")) {
                if (userM124109c.profile.moments.hidePublicMoments) {
                    o1j0.m165649w(R$string.f18746P);
                } else {
                    act.duringCreated(CoreModule.m30932N().following(CoreModule.m30929H().userId(), userM124109c, true, null, null)).subscribe(psd0.m173597H(new y20() { // from class: l.k59
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C8342b.m43669g((Followship) obj);
                        }
                    }, new y20() { // from class: l.l59
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            C8342b.m43668f((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m43673k(C8343c.a aVar) {
        Act act = aVar.f26826a;
        f59 f59Var = aVar.f26830e;
        if (act == null || act.isDestroyed() || act.isFinishing() || f59Var == null) {
            return;
        }
        i4g0.m138523u("e_interested_user_card_close", "p_interested_user", pf60.m172085a("card_user_id", f59Var.m124109c().f56859id));
        act.duringCreated(CoreModule.m30932N().mo61515Wd(f59Var.m124109c().f56859id)).subscribe(psd0.m173597H(new y20() { // from class: l.g59
            @Override // p153l.y20
            public final void call(Object obj) {
                C8342b.m43665c((Envelope) obj);
            }
        }, new y20() { // from class: l.h59
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m43674l(C8343c.a aVar) {
        final Act act = aVar.f26826a;
        final f59 f59Var = aVar.f26830e;
        if (act == null || act.isDestroyed() || act.isFinishing() || f59Var == null) {
            return;
        }
        final User userM124109c = f59Var.m124109c();
        if (!f59Var.m124110d()) {
            m43672j(f59Var, act);
            return;
        }
        if (!CoreModule.m30932N().mo61573so()) {
            m43672j(f59Var, act);
            return;
        }
        if (CoreModule.m30932N().mo61465Hj() && CoreModule.m30932N().mo61583vj(CoreModule.m30930K().me_().isFemale()) && CoreModule.f18264c.m32487o3().flower.count > 0) {
            CoreModule.m30930K().mo31733Vk(act, CoreModule.m30932N().mo61511V9(), userM124109c.f56859id, null, null, Channel.get(Channel.red_flower), new y20() { // from class: l.i59
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8342b.m43666d(userM124109c, act, f59Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.m30930K().mo31733Vk(act, CoreModule.m30932N().mo61511V9(), userM124109c.f56859id, null, null, Channel.get(Channel.reply_thanks), new y20() { // from class: l.j59
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8342b.m43670h(userM124109c, act, f59Var, (Boolean) obj);
                }
            });
        }
        i4g0.m138523u("e_polite_gratitude", "p_interested_user", pf60.m172085a("moments_user_id", userM124109c.f56859id));
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(C8343c.a aVar) {
        aVar.f26832g.mo43655s(aVar.f26827b, aVar.f26829d, aVar.f26830e);
        if (!CoreModule.m30932N().mo61465Hj() || aVar.f26829d != SwipeDirection.RIGHT) {
            if (m43677o(aVar)) {
                m43674l(aVar);
            }
            if (m43676n(aVar)) {
                m43673k(aVar);
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (CoreModule.f18264c.m32487o3().flower.count <= 0 || aVar.f26830e.m124107a() != 6 || !m43677o(aVar)) {
            return m43671i(aVar);
        }
        m43674l(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m43676n(C8343c.a aVar) {
        SwipeDirection swipeDirection = aVar.f26829d;
        return swipeDirection == SwipeDirection.LEFT || swipeDirection == SwipeDirection.REMOVE;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m43677o(C8343c.a aVar) {
        SwipeDirection swipeDirection = aVar.f26829d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(C8343c.a aVar) {
        return true;
    }
}
