package com.p000p1.mobile.putong.core.newui.myinterestpeople;

import com.p000p1.mobile.putong.core.newui.myinterestpeople.C0355b;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.xgc0;
import l.zvf0;
import p009l.p3m;
import p009l.w39;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0355b implements p3m<C0356c.a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6817c(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6818d(User user, Act act, w39 w39Var, Boolean bool) {
        CoreModule.N().Wd(((DbObject) user).id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !w39Var.m23802f()) {
            return;
        }
        osi0.g("小红花已发送");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6820f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m6821g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m6822h(User user, Act act, w39 w39Var, Boolean bool) {
        CoreModule.N().Wd(((DbObject) user).id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !w39Var.m23802f()) {
            return;
        }
        osi0.g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: i */
    public VSwipeStack.OnCardSwipeResult m6823i(C0356c.a aVar) {
        User userM23799c = aVar.f4866e.m23799c();
        if (xgc0.c(((DbObject) userM23799c).id)) {
            m6826l(aVar);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreModule.K().Yn(aVar.f4862a, ((DbObject) userM23799c).id, (String) null, "p_interested_user", (String) null, false, "");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public void m6824j(w39 w39Var, Act act) {
        zvf0.u("e_follow", "p_interested_user", new j760[]{j760.a("card_user_id", ((DbObject) w39Var.m23799c()).id)});
        User userM23799c = w39Var.m23799c();
        if (NullChecker.b(userM23799c)) {
            Followship followship = userM23799c.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM23799c.localFollowship.state, "followed") || TEnum.equals(userM23799c.localFollowship.state, "unknown_")) {
                if (userM23799c.profile.moments.hidePublicMoments) {
                    lsi0.w(R.string.P);
                } else {
                    act.duringCreated(CoreModule.N().following(CoreModule.H().userId(), userM23799c, true, (String) null, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.b49
                        public final void call(Object obj) {
                            C0355b.m6821g((Followship) obj);
                        }
                    }, new e30() { // from class: l.c49
                        public final void call(Object obj) {
                            C0355b.m6820f((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m6825k(C0356c.a aVar) {
        Act act = aVar.f4862a;
        w39 w39Var = aVar.f4866e;
        if (act == null || act.isDestroyed() || act.isFinishing() || w39Var == null) {
            return;
        }
        zvf0.u("e_interested_user_card_close", "p_interested_user", new j760[]{j760.a("card_user_id", ((DbObject) w39Var.m23799c()).id)});
        act.duringCreated(CoreModule.N().Wd(((DbObject) w39Var.m23799c()).id)).subscribe(mkd0.H(new e30() { // from class: l.x39
            public final void call(Object obj) {
                C0355b.m6817c((Envelope) obj);
            }
        }, new e30() { // from class: l.y39
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m6826l(C0356c.a aVar) {
        final Act act = aVar.f4862a;
        final w39 w39Var = aVar.f4866e;
        if (act == null || act.isDestroyed() || act.isFinishing() || w39Var == null) {
            return;
        }
        final User userM23799c = w39Var.m23799c();
        if (!w39Var.m23800d()) {
            m6824j(w39Var, act);
            return;
        }
        if (!CoreModule.N().so()) {
            m6824j(w39Var, act);
            return;
        }
        if (CoreModule.N().Hj() && CoreModule.N().vj(CoreModule.K().me_().isFemale()) && CoreModule.c.o3().flower.count > 0) {
            CoreModule.K().Vk(act, CoreModule.N().V9(), ((DbObject) userM23799c).id, (String) null, (String) null, Channel.get("red_flower"), new e30() { // from class: l.z39
                public final void call(Object obj) {
                    C0355b.m6818d(userM23799c, act, w39Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.K().Vk(act, CoreModule.N().V9(), ((DbObject) userM23799c).id, (String) null, (String) null, Channel.get("reply_thanks"), new e30() { // from class: l.a49
                public final void call(Object obj) {
                    C0355b.m6822h(userM23799c, act, w39Var, (Boolean) obj);
                }
            });
        }
        zvf0.u("e_polite_gratitude", "p_interested_user", new j760[]{j760.a("moments_user_id", ((DbObject) userM23799c).id)});
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(C0356c.a aVar) {
        aVar.f4868g.mo6808s(aVar.f4863b, aVar.f4865d, aVar.f4866e);
        if (!CoreModule.N().Hj() || aVar.f4865d != SwipeDirection.RIGHT) {
            if (m6829o(aVar)) {
                m6826l(aVar);
            }
            if (m6828n(aVar)) {
                m6825k(aVar);
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (CoreModule.c.o3().flower.count <= 0 || aVar.f4866e.m23797a() != 6 || !m6829o(aVar)) {
            return m6823i(aVar);
        }
        m6826l(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6828n(C0356c.a aVar) {
        SwipeDirection swipeDirection = aVar.f4865d;
        return swipeDirection == SwipeDirection.LEFT || swipeDirection == SwipeDirection.REMOVE;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6829o(C0356c.a aVar) {
        SwipeDirection swipeDirection = aVar.f4865d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(C0356c.a aVar) {
        return true;
    }
}
