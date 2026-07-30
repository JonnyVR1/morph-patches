package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class snb0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f165422a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f165423b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f165424c;

    /* JADX INFO: renamed from: d */
    public User f165425d;

    public snb0(eyl eylVar) {
        this.f165422a = eylVar;
    }

    /* JADX INFO: renamed from: m */
    private void m185040m() {
        CoreModule.m29935P().m94651a().mo33398Ri(false);
        this.f165422a.mo36739I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m185041n() {
        this.f165424c.quickChatCardWrapper.markAsConsumed();
        CoreModule.f17545c.f19663m0.m30986C8("quick_audio_card_adapter");
        m185040m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m185042o(Boolean bool, String str) {
        if (this.f165422a.mo36747V1() == null || m185044q() != VSwipeStack.OnCardSwipeResult.pass) {
            return;
        }
        e51.m114743H(this.f165422a.mo36758q1(), new Runnable() { // from class: l.rnb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160256a.m185041n();
            }
        }, 200L);
        zvf0.m220399u("e_match_card_quickchat_voice", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", this.f165425d.f56011id), vwb.m200311Y("remainingtimes", Integer.valueOf(CoreModule.m29935P().m94651a().mo33325Gg())));
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111724s, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m35147O0(false);
            view2.postDelayed(new Runnable() { // from class: l.pnb0
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m35147O0(true);
                }
            }, 1000L);
        }
        this.f165423b = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (!vwb.m200296J(partialListOptM221515e.loaded)) {
            this.f165424c = partialListOptM221515e.loaded.get(i);
        }
        User user = this.f165424c.quickChatCardWrapper.getUser();
        this.f165425d = user;
        if (NullChecker.m81304b(user)) {
            this.f165423b.mo50306f(this.f165424c.quickChatCardWrapper, new f30() { // from class: l.qnb0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f155408a.m185042o((Boolean) obj, (String) obj2);
                }
            });
        }
        zvf0.m220368A("e_match_card_quickchat_voice", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", this.f165425d.f56011id), vwb.m200311Y("remainingtimes", Integer.valueOf(CoreModule.m29935P().m94651a().mo33325Gg())));
        CoreModule.m29935P().m94651a().mo33398Ri(true);
        this.f165422a.mo36742O3();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return true;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f17545c.f19663m0.m31031O5();
        if (swipeDirection == swipeDirection2) {
            CoreModule.f17545c.f19673p1.m30055u3();
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM185044q = m185044q();
            if (onCardSwipeResultM185044q != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM185044q;
            }
        }
        this.f165424c.quickChatCardWrapper.markAsConsumed();
        m185040m();
        zvf0.m220401w("e_match_card_quickchat_voice", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", this.f165425d.f56011id), vwb.m200311Y("remainingtimes", Integer.valueOf(CoreModule.m29935P().m94651a().mo33325Gg())), vwb.m200311Y("direction", swipeDirection == swipeDirection2 ? BLiveGiftBubblePopupTitlePosition.left : "right"));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m185043p(roj0 roj0Var) {
        CoreModule.m29935P().m94651a().mo33310Ef(this.f165422a, this.f165424c.quickChatCardWrapper.getBroadcastCard().userId);
    }

    /* JADX INFO: renamed from: q */
    public final VSwipeStack.OnCardSwipeResult m185044q() {
        CoreModule.f17545c.f19555C0.m210112u4();
        if (CoreModule.m29935P().m94651a().mo33533kp(true)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.f165422a.mo36764z1(CoreModule.f17545c.f19673p1.m30050p3(this.f165424c.quickChatCardWrapper.getBroadcastCard().tracker, CoreAudioMatch.m30049o3(CoreModule.m29935P().m94651a().mo33325Gg() <= 0))).subscribe(mkd0.m154956H(new e30() { // from class: l.nnb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139707a.m185043p((roj0) obj);
            }
        }, new e30() { // from class: l.onb0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151580j("对方用户正在通话中，可以去发起语音闪聊哦");
            }
        }));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
