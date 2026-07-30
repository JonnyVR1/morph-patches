package com.p046p1.mobile.putong.core.newui.myinterestpeople;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.myinterestpeople.C8191b;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.osi0;
import p149l.p3m;
import p149l.w39;
import p149l.xgc0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.myinterestpeople.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8191b implements p3m<C8192c.a, VSwipeStack.OnCardSwipeResult> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m42654c(Envelope envelope) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m42655d(User user, Act act, w39 w39Var, Boolean bool) {
        CoreModule.m29934N().mo60331Wd(user.f56011id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !w39Var.m201266f()) {
            return;
        }
        osi0.m165783g("小红花已发送");
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m42657f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m42658g(Followship followship) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m42659h(User user, Act act, w39 w39Var, Boolean bool) {
        CoreModule.m29934N().mo60331Wd(user.f56011id);
        if (act == null || act.isDestroyed() || act.isFinishing() || !bool.booleanValue() || !w39Var.m201266f()) {
            return;
        }
        osi0.m165783g("礼貌回谢已发送");
    }

    /* JADX INFO: renamed from: i */
    public VSwipeStack.OnCardSwipeResult m42660i(C8192c.a aVar) {
        User userM201263c = aVar.f26088e.m201263c();
        if (xgc0.m208625c(userM201263c.f56011id)) {
            m42663l(aVar);
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        CoreModule.m29932K().mo30738Yn(aVar.f26084a, userM201263c.f56011id, null, "p_interested_user", null, false, "");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: j */
    public void m42661j(w39 w39Var, Act act) {
        zvf0.m220399u(MatchScData.ModuleId.mid_e_follow, "p_interested_user", j760.m140076a("card_user_id", w39Var.m201263c().f56011id));
        User userM201263c = w39Var.m201263c();
        if (NullChecker.m81304b(userM201263c)) {
            Followship followship = userM201263c.localFollowship;
            if (followship == null || TEnum.equals(followship.state, "default") || TEnum.equals(userM201263c.localFollowship.state, FollowshipStatus.followed) || TEnum.equals(userM201263c.localFollowship.state, "unknown_")) {
                if (userM201263c.profile.moments.hidePublicMoments) {
                    lsi0.m151593w(R$string.f18016P);
                } else {
                    act.duringCreated(CoreModule.m29934N().following(CoreModule.m29931H().userId(), userM201263c, true, null, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.b49
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C8191b.m42658g((Followship) obj);
                        }
                    }, new e30() { // from class: l.c49
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            C8191b.m42657f((Throwable) obj);
                        }
                    }));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m42662k(C8192c.a aVar) {
        Act act = aVar.f26084a;
        w39 w39Var = aVar.f26088e;
        if (act == null || act.isDestroyed() || act.isFinishing() || w39Var == null) {
            return;
        }
        zvf0.m220399u("e_interested_user_card_close", "p_interested_user", j760.m140076a("card_user_id", w39Var.m201263c().f56011id));
        act.duringCreated(CoreModule.m29934N().mo60331Wd(w39Var.m201263c().f56011id)).subscribe(mkd0.m154956H(new e30() { // from class: l.x39
            @Override // p149l.e30
            public final void call(Object obj) {
                C8191b.m42654c((Envelope) obj);
            }
        }, new e30() { // from class: l.y39
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m42663l(C8192c.a aVar) {
        final Act act = aVar.f26084a;
        final w39 w39Var = aVar.f26088e;
        if (act == null || act.isDestroyed() || act.isFinishing() || w39Var == null) {
            return;
        }
        final User userM201263c = w39Var.m201263c();
        if (!w39Var.m201264d()) {
            m42661j(w39Var, act);
            return;
        }
        if (!CoreModule.m29934N().mo60389so()) {
            m42661j(w39Var, act);
            return;
        }
        if (CoreModule.m29934N().mo60281Hj() && CoreModule.m29934N().mo60399vj(CoreModule.m29932K().me_().isFemale()) && CoreModule.f17545c.m31484o3().flower.count > 0) {
            CoreModule.m29932K().mo30730Vk(act, CoreModule.m29934N().mo60327V9(), userM201263c.f56011id, null, null, Channel.get(Channel.red_flower), new e30() { // from class: l.z39
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8191b.m42655d(userM201263c, act, w39Var, (Boolean) obj);
                }
            });
        } else {
            CoreModule.m29932K().mo30730Vk(act, CoreModule.m29934N().mo60327V9(), userM201263c.f56011id, null, null, Channel.get(Channel.reply_thanks), new e30() { // from class: l.a49
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8191b.m42659h(userM201263c, act, w39Var, (Boolean) obj);
                }
            });
        }
        zvf0.m220399u("e_polite_gratitude", "p_interested_user", j760.m140076a("moments_user_id", userM201263c.f56011id));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C8192c.a aVar) {
        aVar.f26090g.mo42645s(aVar.f26085b, aVar.f26087d, aVar.f26088e);
        if (!CoreModule.m29934N().mo60281Hj() || aVar.f26087d != SwipeDirection.RIGHT) {
            if (m42666o(aVar)) {
                m42663l(aVar);
            }
            if (m42665n(aVar)) {
                m42662k(aVar);
            }
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (CoreModule.f17545c.m31484o3().flower.count <= 0 || aVar.f26088e.m201261a() != 6 || !m42666o(aVar)) {
            return m42660i(aVar);
        }
        m42663l(aVar);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m42665n(C8192c.a aVar) {
        SwipeDirection swipeDirection = aVar.f26087d;
        return swipeDirection == SwipeDirection.LEFT || swipeDirection == SwipeDirection.REMOVE;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m42666o(C8192c.a aVar) {
        SwipeDirection swipeDirection = aVar.f26087d;
        return swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C8192c.a aVar) {
        return true;
    }
}
