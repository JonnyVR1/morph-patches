package com.p051p1.mobile.putong.live.livingroom.voice.intl.root;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p051p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;
import com.p051p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.game.gameRoot.VoiceNewGamePlayRootView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk.VoicePkMvpView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.p069pk.VoicePkTimeView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p151v.VFrame;
import p153l.b4o0;
import p153l.bnl0;
import p153l.iam;
import p153l.m5o0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceLiveView extends ConstraintLayout implements iam<b4o0> {

    /* JADX INFO: renamed from: A */
    public View f54252A;

    /* JADX INFO: renamed from: B */
    public VoicePkTimeView f54253B;

    /* JADX INFO: renamed from: C */
    public VoiceGrabHatFloatViewMode f54254C;

    /* JADX INFO: renamed from: D */
    public VoiceBottomView f54255D;

    /* JADX INFO: renamed from: E */
    public VoiceChatBottomView f54256E;

    /* JADX INFO: renamed from: F */
    public BottomMenuView f54257F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f54258G;

    /* JADX INFO: renamed from: H */
    public DanmakuViewPort f54259H;

    /* JADX INFO: renamed from: I */
    public FrameLayout f54260I;

    /* JADX INFO: renamed from: J */
    public IntlGiftComboView f54261J;

    /* JADX INFO: renamed from: K */
    public VoiceLiveBulletView f54262K;

    /* JADX INFO: renamed from: L */
    public VFrame f54263L;

    /* JADX INFO: renamed from: M */
    public VoiceFlyMicContainer f54264M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f54265N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f54266O;

    /* JADX INFO: renamed from: P */
    public LiveEnterRoomView f54267P;

    /* JADX INFO: renamed from: Q */
    public LiveEnterRoomView f54268Q;

    /* JADX INFO: renamed from: R */
    public VFrame f54269R;

    /* JADX INFO: renamed from: S */
    public VoiceLiveBubbleView f54270S;

    /* JADX INFO: renamed from: T */
    public View f54271T;

    /* JADX INFO: renamed from: U */
    public VoicePreviewViewModel f54272U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f54273V;

    /* JADX INFO: renamed from: W */
    public b4o0 f54274W;

    /* JADX INFO: renamed from: d */
    public VoiceBackgroundView f54275d;

    /* JADX INFO: renamed from: e */
    public TouchSwallowView f54276e;

    /* JADX INFO: renamed from: f */
    public VoiceFansView f54277f;

    /* JADX INFO: renamed from: g */
    public VoiceCloseView f54278g;

    /* JADX INFO: renamed from: h */
    public VoicePkMvpView f54279h;

    /* JADX INFO: renamed from: i */
    public VoiceRoomInfoView f54280i;

    /* JADX INFO: renamed from: j */
    public LiveCampaignView f54281j;

    /* JADX INFO: renamed from: k */
    public VoiceNewOperationView f54282k;

    /* JADX INFO: renamed from: l */
    public VoiceLiveApplyManagerEnterViewModel f54283l;

    /* JADX INFO: renamed from: m */
    public VoiceNewGamePlayRootView f54284m;

    /* JADX INFO: renamed from: n */
    public VoiceOperationsView f54285n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f54286o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f54287p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f54288q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f54289r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f54290s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f54291t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f54292u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f54293v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f54294w;

    /* JADX INFO: renamed from: x */
    public View f54295x;

    /* JADX INFO: renamed from: y */
    public ChatListView f54296y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f54297z;

    public VoiceLiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m79633r() {
        m79636j0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79634h0(View view) {
        m5o0.m157113a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b4o0 b4o0Var) {
        this.f54274W = b4o0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79636j0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f54258G.f50977b.getLayoutParams();
        layoutParams.topMargin = -qa00.m175859d(14.0f);
        this.f54258G.f50977b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: k0 */
    public void m79637k0(Frag frag) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m79638l0(boolean z) {
        bnl0.m105524M(this.f54269R, z);
        bnl0.m105524M(this.f54278g, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79634h0(this);
        bnl0.m105540X(this.f54278g, bnl0.m105511F0() + qa00.f156324k);
        m79633r();
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
