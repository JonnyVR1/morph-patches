package com.p051p1.mobile.putong.live.livingroom.voice.intl.root;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
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
import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceOrignalStateView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p137rx.C22421c;
import p151v.VFrame;
import p153l.AbstractC21253x5;
import p153l.bnl0;
import p153l.iam;
import p153l.qa00;
import p153l.rgd0;
import p153l.sro0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceRoomView extends ConstraintLayout implements iam<AbstractC21253x5> {

    /* JADX INFO: renamed from: A */
    public VoiceOrignalStateView f54298A;

    /* JADX INFO: renamed from: B */
    public VoiceNewGamePlayRootView f54299B;

    /* JADX INFO: renamed from: C */
    public View f54300C;

    /* JADX INFO: renamed from: D */
    public TouchSwallowView f54301D;

    /* JADX INFO: renamed from: E */
    public ChatListView f54302E;

    /* JADX INFO: renamed from: E0 */
    public LiveEnterRoomView f54303E0;

    /* JADX INFO: renamed from: F */
    public VoicePkTimeView f54304F;

    /* JADX INFO: renamed from: F0 */
    public LiveEnterRoomView f54305F0;

    /* JADX INFO: renamed from: G */
    public VoiceGrabHatFloatViewMode f54306G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f54307G0;

    /* JADX INFO: renamed from: H */
    public FrameLayout f54308H;

    /* JADX INFO: renamed from: H0 */
    public VoiceLiveBubbleView f54309H0;

    /* JADX INFO: renamed from: I */
    public View f54310I;

    /* JADX INFO: renamed from: I0 */
    public View f54311I0;

    /* JADX INFO: renamed from: J */
    public TouchSwallowView f54312J;

    /* JADX INFO: renamed from: J0 */
    public FrameLayout f54313J0;

    /* JADX INFO: renamed from: K */
    public VoiceBottomView f54314K;

    /* JADX INFO: renamed from: K0 */
    public AbstractC21253x5 f54315K0;

    /* JADX INFO: renamed from: L */
    public VoiceChatBottomView f54316L;

    /* JADX INFO: renamed from: L0 */
    public boolean f54317L0;

    /* JADX INFO: renamed from: M */
    public BottomMenuView f54318M;

    /* JADX INFO: renamed from: N */
    public VoiceRoomLoadingView f54319N;

    /* JADX INFO: renamed from: O */
    public TouchSwallowView f54320O;

    /* JADX INFO: renamed from: P */
    public LiveGiftTrays f54321P;

    /* JADX INFO: renamed from: Q */
    public DanmakuViewPort f54322Q;

    /* JADX INFO: renamed from: R */
    public TouchSwallowView f54323R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f54324S;

    /* JADX INFO: renamed from: T */
    public IntlGiftComboView f54325T;

    /* JADX INFO: renamed from: U */
    public VoiceLiveBulletView f54326U;

    /* JADX INFO: renamed from: V */
    public VFrame f54327V;

    /* JADX INFO: renamed from: W */
    public VoiceFlyMicContainer f54328W;

    /* JADX INFO: renamed from: d */
    public VoiceRoomView f54329d;

    /* JADX INFO: renamed from: e */
    public VoiceBackgroundView f54330e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f54331f;

    /* JADX INFO: renamed from: g */
    public VoiceFansView f54332g;

    /* JADX INFO: renamed from: h */
    public VoiceCloseView f54333h;

    /* JADX INFO: renamed from: i */
    public VoicePkMvpView f54334i;

    /* JADX INFO: renamed from: j */
    public VoiceRoomInfoView f54335j;

    /* JADX INFO: renamed from: k */
    public LiveCampaignView f54336k;

    /* JADX INFO: renamed from: k0 */
    public LiveGiftLayer f54337k0;

    /* JADX INFO: renamed from: l */
    public VoiceNewOperationView f54338l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f54339m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f54340n;

    /* JADX INFO: renamed from: o */
    public VoiceOperationsView f54341o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f54342p;

    /* JADX INFO: renamed from: p0 */
    public TopEffectLayer f54343p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f54344q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f54345r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f54346s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f54347t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f54348u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f54349v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f54350w;

    /* JADX INFO: renamed from: x */
    public VoiceLiveApplyManagerEnterViewModel f54351x;

    /* JADX INFO: renamed from: y */
    public VoiceIncomeAreaStateView f54352y;

    /* JADX INFO: renamed from: z */
    public VFrame f54353z;

    public VoiceRoomView(Context context) {
        super(context);
        this.f54317L0 = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m79639l0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f54321P.f50977b.getLayoutParams();
        layoutParams.topMargin = -qa00.m175859d(14.0f);
        this.f54321P.f50977b.setLayoutParams(layoutParams);
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f54317L0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22421c<Integer> getGiftWidthObs() {
        return bnl0.m105520K(this.f54314K);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79640h0(View view) {
        sro0.m187631a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(AbstractC21253x5 abstractC21253x5) {
        this.f54315K0 = abstractC21253x5;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m79642j0(rgd0 rgd0Var) {
        LiveScrollView liveScrollView = rgd0Var.f162994b;
        this.f54312J.setSwallowTarget(liveScrollView);
        TouchSwallowView touchSwallowView = this.f54340n;
        if (touchSwallowView != null) {
            touchSwallowView.setSwallowTarget(liveScrollView);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m79643k0(boolean z) {
        bnl0.m105524M(this.f54327V, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79640h0(this);
        bnl0.m105540X(this.f54333h, bnl0.m105511F0() + qa00.f156324k);
        m79639l0();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f54317L0 = z;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54317L0 = false;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54317L0 = false;
    }
}
