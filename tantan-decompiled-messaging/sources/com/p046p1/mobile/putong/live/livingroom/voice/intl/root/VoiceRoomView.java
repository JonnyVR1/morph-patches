package com.p046p1.mobile.putong.live.livingroom.voice.intl.root;

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
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p046p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;
import com.p046p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.game.gameRoot.VoiceNewGamePlayRootView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk.VoicePkMvpView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.p064pk.VoicePkTimeView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceOrignalStateView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p133rx.C22306c;
import p147v.VFrame;
import p149l.AbstractC15533a6;
import p149l.o8d0;
import p149l.oio0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceRoomView extends ConstraintLayout implements s7m<AbstractC15533a6> {

    /* JADX INFO: renamed from: A */
    public VoiceOrignalStateView f53450A;

    /* JADX INFO: renamed from: B */
    public VoiceNewGamePlayRootView f53451B;

    /* JADX INFO: renamed from: C */
    public View f53452C;

    /* JADX INFO: renamed from: D */
    public TouchSwallowView f53453D;

    /* JADX INFO: renamed from: E */
    public ChatListView f53454E;

    /* JADX INFO: renamed from: E0 */
    public LiveEnterRoomView f53455E0;

    /* JADX INFO: renamed from: F */
    public VoicePkTimeView f53456F;

    /* JADX INFO: renamed from: F0 */
    public LiveEnterRoomView f53457F0;

    /* JADX INFO: renamed from: G */
    public VoiceGrabHatFloatViewMode f53458G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f53459G0;

    /* JADX INFO: renamed from: H */
    public FrameLayout f53460H;

    /* JADX INFO: renamed from: H0 */
    public VoiceLiveBubbleView f53461H0;

    /* JADX INFO: renamed from: I */
    public View f53462I;

    /* JADX INFO: renamed from: I0 */
    public View f53463I0;

    /* JADX INFO: renamed from: J */
    public TouchSwallowView f53464J;

    /* JADX INFO: renamed from: J0 */
    public FrameLayout f53465J0;

    /* JADX INFO: renamed from: K */
    public VoiceBottomView f53466K;

    /* JADX INFO: renamed from: K0 */
    public AbstractC15533a6 f53467K0;

    /* JADX INFO: renamed from: L */
    public VoiceChatBottomView f53468L;

    /* JADX INFO: renamed from: L0 */
    public boolean f53469L0;

    /* JADX INFO: renamed from: M */
    public BottomMenuView f53470M;

    /* JADX INFO: renamed from: N */
    public VoiceRoomLoadingView f53471N;

    /* JADX INFO: renamed from: O */
    public TouchSwallowView f53472O;

    /* JADX INFO: renamed from: P */
    public LiveGiftTrays f53473P;

    /* JADX INFO: renamed from: Q */
    public DanmakuViewPort f53474Q;

    /* JADX INFO: renamed from: R */
    public TouchSwallowView f53475R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f53476S;

    /* JADX INFO: renamed from: T */
    public IntlGiftComboView f53477T;

    /* JADX INFO: renamed from: U */
    public VoiceLiveBulletView f53478U;

    /* JADX INFO: renamed from: V */
    public VFrame f53479V;

    /* JADX INFO: renamed from: W */
    public VoiceFlyMicContainer f53480W;

    /* JADX INFO: renamed from: d */
    public VoiceRoomView f53481d;

    /* JADX INFO: renamed from: e */
    public VoiceBackgroundView f53482e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f53483f;

    /* JADX INFO: renamed from: g */
    public VoiceFansView f53484g;

    /* JADX INFO: renamed from: h */
    public VoiceCloseView f53485h;

    /* JADX INFO: renamed from: i */
    public VoicePkMvpView f53486i;

    /* JADX INFO: renamed from: j */
    public VoiceRoomInfoView f53487j;

    /* JADX INFO: renamed from: k */
    public LiveCampaignView f53488k;

    /* JADX INFO: renamed from: k0 */
    public LiveGiftLayer f53489k0;

    /* JADX INFO: renamed from: l */
    public VoiceNewOperationView f53490l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f53491m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f53492n;

    /* JADX INFO: renamed from: o */
    public VoiceOperationsView f53493o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f53494p;

    /* JADX INFO: renamed from: p0 */
    public TopEffectLayer f53495p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f53496q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f53497r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f53498s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f53499t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f53500u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f53501v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f53502w;

    /* JADX INFO: renamed from: x */
    public VoiceLiveApplyManagerEnterViewModel f53503x;

    /* JADX INFO: renamed from: y */
    public VoiceIncomeAreaStateView f53504y;

    /* JADX INFO: renamed from: z */
    public VFrame f53505z;

    public VoiceRoomView(Context context) {
        super(context);
        this.f53469L0 = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m78456l0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53473P.f50129b.getLayoutParams();
        layoutParams.topMargin = -t100.m186890d(14.0f);
        this.f53473P.f50129b.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f53469L0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22306c<Integer> getGiftWidthObs() {
        return xdl0.m208340K(this.f53466K);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78457h0(View view) {
        oio0.m164542a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(AbstractC15533a6 abstractC15533a6) {
        this.f53467K0 = abstractC15533a6;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m78459j0(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f142612b;
        this.f53464J.setSwallowTarget(liveScrollView);
        TouchSwallowView touchSwallowView = this.f53492n;
        if (touchSwallowView != null) {
            touchSwallowView.setSwallowTarget(liveScrollView);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m78460k0(boolean z) {
        xdl0.m208344M(this.f53479V, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78457h0(this);
        xdl0.m208360X(this.f53485h, xdl0.m208331F0() + t100.f167262k);
        m78456l0();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f53469L0 = z;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53469L0 = false;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53469L0 = false;
    }
}
