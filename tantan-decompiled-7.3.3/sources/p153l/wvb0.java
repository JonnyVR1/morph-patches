package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class wvb0 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public x0m f190946a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f190947b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f190948c;

    /* JADX INFO: renamed from: d */
    public User f190949d;

    public wvb0(x0m x0mVar) {
        this.f190946a = x0mVar;
    }

    /* JADX INFO: renamed from: m */
    private void m208061m() {
        CoreModule.m30933P().m143405a().mo34401Ri(false);
        this.f190946a.mo37742I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m208062n() {
        this.f190948c.quickChatCardWrapper.markAsConsumed();
        CoreModule.f18264c.f20405m0.m31989C8("quick_audio_card_adapter");
        m208061m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m208063o(Boolean bool, String str) {
        if (this.f190946a.mo37750V1() == null || m208065q() != VSwipeStack.OnCardSwipeResult.pass) {
            return;
        }
        l51.m152888H(this.f190946a.mo37761q1(), new Runnable() { // from class: l.vvb0
            @Override // java.lang.Runnable
            public final void run() {
                this.f185919a.m208062n();
            }
        }, 200L);
        i4g0.m138523u("e_match_card_quickchat_voice", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", this.f190949d.f56859id), jyb.m147494Y("remainingtimes", Integer.valueOf(CoreModule.m30933P().m143405a().mo34328Gg())));
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141634s, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m36150O0(false);
            view2.postDelayed(new Runnable() { // from class: l.tvb0
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m36150O0(true);
                }
            }, 1000L);
        }
        this.f190947b = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (!jyb.m147479J(partialListOptM222761e.loaded)) {
            this.f190948c = partialListOptM222761e.loaded.get(i);
        }
        User user = this.f190948c.quickChatCardWrapper.getUser();
        this.f190949d = user;
        if (NullChecker.m82487b(user)) {
            this.f190947b.mo51489f(this.f190948c.quickChatCardWrapper, new z20() { // from class: l.uvb0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f181135a.m208063o((Boolean) obj, (String) obj2);
                }
            });
        }
        i4g0.m138492A("e_match_card_quickchat_voice", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", this.f190949d.f56859id), jyb.m147494Y("remainingtimes", Integer.valueOf(CoreModule.m30933P().m143405a().mo34328Gg())));
        CoreModule.m30933P().m143405a().mo34401Ri(true);
        this.f190946a.mo37745O3();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f18264c.f20405m0.m32034O5();
        if (swipeDirection == swipeDirection2) {
            CoreModule.f18264c.f20415p1.m31053u3();
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM208065q = m208065q();
            if (onCardSwipeResultM208065q != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM208065q;
            }
        }
        this.f190948c.quickChatCardWrapper.markAsConsumed();
        m208061m();
        i4g0.m138525w("e_match_card_quickchat_voice", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", this.f190949d.f56859id), jyb.m147494Y("remainingtimes", Integer.valueOf(CoreModule.m30933P().m143405a().mo34328Gg())), jyb.m147494Y("direction", swipeDirection == swipeDirection2 ? BLiveGiftBubblePopupTitlePosition.left : "right"));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m208064p(uxj0 uxj0Var) {
        CoreModule.m30933P().m143405a().mo34313Ef(this.f190946a, this.f190948c.quickChatCardWrapper.getBroadcastCard().userId);
    }

    /* JADX INFO: renamed from: q */
    public final VSwipeStack.OnCardSwipeResult m208065q() {
        CoreModule.f18264c.f20297C0.m146425v4();
        if (CoreModule.m30933P().m143405a().mo34536kp(true)) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        this.f190946a.mo37767z1(CoreModule.f18264c.f20415p1.m31048p3(this.f190948c.quickChatCardWrapper.getBroadcastCard().tracker, CoreAudioMatch.m31047o3(CoreModule.m30933P().m143405a().mo34328Gg() <= 0))).subscribe(psd0.m173597H(new y20() { // from class: l.rvb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165002a.m208064p((uxj0) obj);
            }
        }, new y20() { // from class: l.svb0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165636j("对方用户正在通话中，可以去发起语音闪聊哦");
            }
        }));
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
