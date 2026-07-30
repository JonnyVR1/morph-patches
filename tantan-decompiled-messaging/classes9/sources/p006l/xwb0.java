package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.party.AudioQuickChatPartyInvitationCardView;
import com.p1.mobile.putong.core.data.QuickChatPartyType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.ool0;
import l.t7m;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xwb0 implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f27755a;

    /* JADX INFO: renamed from: b */
    public AudioQuickChatPartyInvitationCardView f27756b;

    /* JADX INFO: renamed from: c */
    public Boolean f27757c = Boolean.FALSE;

    /* JADX INFO: renamed from: d */
    public VirtualCardType f27758d;

    public xwb0(NewNewHomeFrag newNewHomeFrag) {
        this.f27755a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: d */
    public View m27659d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f11840K, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m27660e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f27758d = virtualCardType;
        if (NullChecker.a(this.f27755a) && NullChecker.a(this.f27755a.C)) {
            this.f27755a.C.P2();
            if (view instanceof AudioQuickChatPartyInvitationCardView) {
                AudioQuickChatPartyInvitationCardView audioQuickChatPartyInvitationCardView = (AudioQuickChatPartyInvitationCardView) view;
                this.f27756b = audioQuickChatPartyInvitationCardView;
                audioQuickChatPartyInvitationCardView.m7886m(this.f27755a, this);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m27661f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m27662g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        QuickChatPartyType quickChatPartyTypeM27663h = m27663h();
        if (z) {
            exb0.m14911i().m14912g(this.f27755a.q1(), quickChatPartyTypeM27663h);
        } else {
            exb0.m14911i().m14917m(this.f27755a.q1(), quickChatPartyTypeM27663h);
        }
        exb0.m14911i().f11492b = true;
        if (!this.f27757c.booleanValue()) {
            zvf0.w("e_card_quickchat_activity", "p_suggest_users_home_view", new j760[]{vwb.Y("direction", z ? "like" : "dislike"), vwb.Y("quickchat_activity_card_type", TEnum.equals(quickChatPartyTypeM27663h, "quickchat") ? "quickchat_party" : "voice_quickchat_party")});
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: h */
    public final QuickChatPartyType m27663h() {
        return this.f27758d == VirtualCardType.AudioQuickChatPartyInvitationCard ? QuickChatPartyType.get("voiceQuickchat") : QuickChatPartyType.get("quickchat");
    }

    /* JADX INFO: renamed from: b */
    public void m27657b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m27658c(View view) {
    }
}
