package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.eyl;
import l.f30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ool0;
import l.roj0;
import l.t7m;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class snb0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f21436a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f21437b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f21438c;

    /* JADX INFO: renamed from: d */
    public User f21439d;

    public snb0(eyl eylVar) {
        this.f21436a = eylVar;
    }

    /* JADX INFO: renamed from: m */
    private void m23917m() {
        CoreModule.m1854P().m11706a().m5335Ri(false);
        this.f21436a.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m23918n() {
        this.f21438c.quickChatCardWrapper.markAsConsumed();
        CoreModule.f1534c.f3652m0.m2916C8("quick_audio_card_adapter");
        m23917m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m23919o(Boolean bool, String str) {
        if (this.f21436a.V1() == null || m23927q() != VSwipeStack.OnCardSwipeResult.pass) {
            return;
        }
        e51.H(this.f21436a.q1(), new Runnable() { // from class: l.rnb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20641a.m23918n();
            }
        }, 200L);
        zvf0.u("e_match_card_quickchat_voice", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f21439d).id), vwb.Y("remainingtimes", Integer.valueOf(CoreModule.m1854P().m11706a().m5262Gg()))});
    }

    /* JADX INFO: renamed from: d */
    public View m23922d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f14258s, viewGroup, false);
    }

    /* JADX INFO: renamed from: e */
    public void m23923e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m7089O0(false);
            view2.postDelayed(new Runnable() { // from class: l.pnb0
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m7089O0(true);
                }
            }, 1000L);
        }
        this.f21437b = (OnlineMatchBaseCardView) view;
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (!vwb.J(partialListOpt.loaded)) {
            this.f21438c = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
        }
        User user = this.f21438c.quickChatCardWrapper.getUser();
        this.f21439d = user;
        if (NullChecker.b(user)) {
            this.f21437b.f(this.f21438c.quickChatCardWrapper, new f30() { // from class: l.qnb0
                public final void call(Object obj, Object obj2) {
                    this.f19925a.m23919o((Boolean) obj, (String) obj2);
                }
            });
        }
        zvf0.A("e_match_card_quickchat_voice", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f21439d).id), vwb.Y("remainingtimes", Integer.valueOf(CoreModule.m1854P().m11706a().m5262Gg()))});
        CoreModule.m1854P().m11706a().m5335Ri(true);
        this.f21436a.O3();
    }

    /* JADX INFO: renamed from: f */
    public boolean m23924f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m23925g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f1534c.f3652m0.m2961O5();
        if (swipeDirection == swipeDirection2) {
            CoreModule.f1534c.f3662p1.m1983u3();
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM23927q = m23927q();
            if (onCardSwipeResultM23927q != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM23927q;
            }
        }
        this.f21438c.quickChatCardWrapper.markAsConsumed();
        m23917m();
        zvf0.w("e_match_card_quickchat_voice", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f21439d).id), vwb.Y("remainingtimes", Integer.valueOf(CoreModule.m1854P().m11706a().m5262Gg())), vwb.Y("direction", swipeDirection == swipeDirection2 ? "left" : "right")});
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m23926p(roj0 roj0Var) {
        CoreModule.m1854P().m11706a().m5247Ef(this.f21436a, this.f21438c.quickChatCardWrapper.getBroadcastCard().userId);
    }

    /* JADX INFO: renamed from: q */
    public final VSwipeStack.OnCardSwipeResult m23927q() {
        CoreModule.f1534c.f3544C0.m27420u4();
        if (CoreModule.m1854P().m11706a().m5470kp(true)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.f21436a.z1(CoreModule.f1534c.f3662p1.m1978p3(this.f21438c.quickChatCardWrapper.getBroadcastCard().tracker, CoreAudioMatch.m1977o3(CoreModule.m1854P().m11706a().m5262Gg() <= 0))).subscribe(mkd0.H(new e30() { // from class: l.nnb0
            public final void call(Object obj) {
                this.f17753a.m23926p((roj0) obj);
            }
        }, new e30() { // from class: l.onb0
            public final void call(Object obj) {
                lsi0.j("对方用户正在通话中，可以去发起语音闪聊哦");
            }
        }));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m23920b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m23921c(View view) {
    }
}
