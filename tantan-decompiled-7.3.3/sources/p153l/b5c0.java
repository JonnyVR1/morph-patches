package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.QuickChatPartyType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.party.AudioQuickChatPartyInvitationCardView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class b5c0 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f75047a;

    /* JADX INFO: renamed from: b */
    public AudioQuickChatPartyInvitationCardView f75048b;

    /* JADX INFO: renamed from: c */
    public Boolean f75049c = Boolean.FALSE;

    /* JADX INFO: renamed from: d */
    public VirtualCardType f75050d;

    public b5c0(NewNewHomeFrag newNewHomeFrag) {
        this.f75047a = newNewHomeFrag;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125480K, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f75050d = virtualCardType;
        if (NullChecker.m82486a(this.f75047a) && NullChecker.m82486a(this.f75047a.f22420C)) {
            this.f75047a.f22420C.m38207P2();
            if (view instanceof AudioQuickChatPartyInvitationCardView) {
                AudioQuickChatPartyInvitationCardView audioQuickChatPartyInvitationCardView = (AudioQuickChatPartyInvitationCardView) view;
                this.f75048b = audioQuickChatPartyInvitationCardView;
                audioQuickChatPartyInvitationCardView.m55726m(this.f75047a, this);
            }
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        QuickChatPartyType quickChatPartyTypeM102566h = m102566h();
        if (z) {
            i5c0.m138650i().m138651g(this.f75047a.mo37761q1(), quickChatPartyTypeM102566h);
        } else {
            i5c0.m138650i().m138656m(this.f75047a.mo37761q1(), quickChatPartyTypeM102566h);
        }
        i5c0.m138650i().f113029b = true;
        if (!this.f75049c.booleanValue()) {
            i4g0.m138525w("e_card_quickchat_activity", "p_suggest_users_home_view", jyb.m147494Y("direction", z ? "like" : "dislike"), jyb.m147494Y("quickchat_activity_card_type", TEnum.equals(quickChatPartyTypeM102566h, "quickchat") ? "quickchat_party" : "voice_quickchat_party"));
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public final QuickChatPartyType m102566h() {
        return this.f75050d == VirtualCardType.AudioQuickChatPartyInvitationCard ? QuickChatPartyType.get(QuickChatPartyType.voiceQuickchat) : QuickChatPartyType.get("quickchat");
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
