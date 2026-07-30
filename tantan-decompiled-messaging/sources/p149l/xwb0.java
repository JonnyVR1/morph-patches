package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.QuickChatPartyType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.party.AudioQuickChatPartyInvitationCardView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class xwb0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f194720a;

    /* JADX INFO: renamed from: b */
    public AudioQuickChatPartyInvitationCardView f194721b;

    /* JADX INFO: renamed from: c */
    public Boolean f194722c = Boolean.FALSE;

    /* JADX INFO: renamed from: d */
    public VirtualCardType f194723d;

    public xwb0(NewNewHomeFrag newNewHomeFrag) {
        this.f194720a = newNewHomeFrag;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95426K, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f194723d = virtualCardType;
        if (NullChecker.m81303a(this.f194720a) && NullChecker.m81303a(this.f194720a.f21678C)) {
            this.f194720a.f21678C.m37204P2();
            if (view instanceof AudioQuickChatPartyInvitationCardView) {
                AudioQuickChatPartyInvitationCardView audioQuickChatPartyInvitationCardView = (AudioQuickChatPartyInvitationCardView) view;
                this.f194721b = audioQuickChatPartyInvitationCardView;
                audioQuickChatPartyInvitationCardView.m54543m(this.f194720a, this);
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        QuickChatPartyType quickChatPartyTypeM211324h = m211324h();
        if (z) {
            exb0.m118586i().m118587g(this.f194720a.mo36758q1(), quickChatPartyTypeM211324h);
        } else {
            exb0.m118586i().m118592m(this.f194720a.mo36758q1(), quickChatPartyTypeM211324h);
        }
        exb0.m118586i().f93592b = true;
        if (!this.f194722c.booleanValue()) {
            zvf0.m220401w("e_card_quickchat_activity", "p_suggest_users_home_view", vwb.m200311Y("direction", z ? "like" : "dislike"), vwb.m200311Y("quickchat_activity_card_type", TEnum.equals(quickChatPartyTypeM211324h, "quickchat") ? "quickchat_party" : "voice_quickchat_party"));
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public final QuickChatPartyType m211324h() {
        return this.f194723d == VirtualCardType.AudioQuickChatPartyInvitationCard ? QuickChatPartyType.get(QuickChatPartyType.voiceQuickchat) : QuickChatPartyType.get("quickchat");
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
