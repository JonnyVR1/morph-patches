package com.p000p1.mobile.putong.live.livingroom.voice.intl.root;

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
import com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkMvpView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkTimeView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.player.VoiceIncomeAreaStateView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.player.VoiceOrignalStateView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.player.VoiceRoomLoadingView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p1.mobile.putong.live.livingroom.voice.applymanager.VoiceLiveApplyManagerEnterViewModel;
import com.p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceTopNoticeView;
import com.p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import com.p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;
import com.p1.mobile.putong.live.livingroom.voice.grabhat.view.VoiceGrabHatFloatViewMode;
import com.p1.mobile.putong.live.livingroom.voice.intl.chatgroup.VoiceChatGroupEnterView;
import com.p1.mobile.putong.live.livingroom.voice.intl.close.VoiceCloseView;
import com.p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import com.p1.mobile.putong.live.livingroom.voice.intl.game.gameRoot.VoiceNewGamePlayRootView;
import com.p1.mobile.putong.live.livingroom.voice.intl.heartbeat.VoiceTopHeartBeatView;
import com.p1.mobile.putong.live.livingroom.voice.intl.heatbox.VoiceLiveHeatBoxEntryView;
import com.p1.mobile.putong.live.livingroom.voice.intl.increment.bullet.VoiceLiveBulletView;
import com.p1.mobile.putong.live.livingroom.voice.intl.increment.leaderboard.hourleaderboard.widget.VoiceLiveHourBoardEntryView;
import l.a6;
import l.o8d0;
import l.oio0;
import l.s7m;
import l.t100;
import l.xdl0;
import rx.c;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceRoomView extends ConstraintLayout implements s7m<a6> {

    /* JADX INFO: renamed from: A */
    public VoiceOrignalStateView f7056A;

    /* JADX INFO: renamed from: B */
    public VoiceNewGamePlayRootView f7057B;

    /* JADX INFO: renamed from: C */
    public View f7058C;

    /* JADX INFO: renamed from: D */
    public TouchSwallowView f7059D;

    /* JADX INFO: renamed from: E */
    public ChatListView f7060E;

    /* JADX INFO: renamed from: E0 */
    public LiveEnterRoomView f7061E0;

    /* JADX INFO: renamed from: F */
    public VoicePkTimeView f7062F;

    /* JADX INFO: renamed from: F0 */
    public LiveEnterRoomView f7063F0;

    /* JADX INFO: renamed from: G */
    public VoiceGrabHatFloatViewMode f7064G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f7065G0;

    /* JADX INFO: renamed from: H */
    public FrameLayout f7066H;

    /* JADX INFO: renamed from: H0 */
    public VoiceLiveBubbleView f7067H0;

    /* JADX INFO: renamed from: I */
    public View f7068I;

    /* JADX INFO: renamed from: I0 */
    public View f7069I0;

    /* JADX INFO: renamed from: J */
    public TouchSwallowView f7070J;

    /* JADX INFO: renamed from: J0 */
    public FrameLayout f7071J0;

    /* JADX INFO: renamed from: K */
    public VoiceBottomView f7072K;

    /* JADX INFO: renamed from: K0 */
    public a6 f7073K0;

    /* JADX INFO: renamed from: L */
    public VoiceChatBottomView f7074L;

    /* JADX INFO: renamed from: L0 */
    public boolean f7075L0;

    /* JADX INFO: renamed from: M */
    public BottomMenuView f7076M;

    /* JADX INFO: renamed from: N */
    public VoiceRoomLoadingView f7077N;

    /* JADX INFO: renamed from: O */
    public TouchSwallowView f7078O;

    /* JADX INFO: renamed from: P */
    public LiveGiftTrays f7079P;

    /* JADX INFO: renamed from: Q */
    public DanmakuViewPort f7080Q;

    /* JADX INFO: renamed from: R */
    public TouchSwallowView f7081R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f7082S;

    /* JADX INFO: renamed from: T */
    public IntlGiftComboView f7083T;

    /* JADX INFO: renamed from: U */
    public VoiceLiveBulletView f7084U;

    /* JADX INFO: renamed from: V */
    public VFrame f7085V;

    /* JADX INFO: renamed from: W */
    public VoiceFlyMicContainer f7086W;

    /* JADX INFO: renamed from: d */
    public VoiceRoomView f7087d;

    /* JADX INFO: renamed from: e */
    public VoiceBackgroundView f7088e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f7089f;

    /* JADX INFO: renamed from: g */
    public VoiceFansView f7090g;

    /* JADX INFO: renamed from: h */
    public VoiceCloseView f7091h;

    /* JADX INFO: renamed from: i */
    public VoicePkMvpView f7092i;

    /* JADX INFO: renamed from: j */
    public VoiceRoomInfoView f7093j;

    /* JADX INFO: renamed from: k */
    public LiveCampaignView f7094k;

    /* JADX INFO: renamed from: k0 */
    public LiveGiftLayer f7095k0;

    /* JADX INFO: renamed from: l */
    public VoiceNewOperationView f7096l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f7097m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f7098n;

    /* JADX INFO: renamed from: o */
    public VoiceOperationsView f7099o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f7100p;

    /* JADX INFO: renamed from: p0 */
    public TopEffectLayer f7101p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f7102q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f7103r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f7104s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f7105t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f7106u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f7107v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f7108w;

    /* JADX INFO: renamed from: x */
    public VoiceLiveApplyManagerEnterViewModel f7109x;

    /* JADX INFO: renamed from: y */
    public VoiceIncomeAreaStateView f7110y;

    /* JADX INFO: renamed from: z */
    public VFrame f7111z;

    public VoiceRoomView(Context context) {
        super(context);
        this.f7075L0 = false;
    }

    /* JADX INFO: renamed from: l0 */
    private void m8663l0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7079P.b.getLayoutParams();
        layoutParams.topMargin = -t100.d(14.0f);
        this.f7079P.b.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8664C0() {
        return getContext();
    }

    public void destroy() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7075L0) {
            return false;
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public c<Integer> getGiftWidthObs() {
        return xdl0.K(this.f7072K);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8665h0(View view) {
        oio0.a(this, view);
    }

    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void m8667i1(a6 a6Var) {
        this.f7073K0 = a6Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m8668j0(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.b;
        this.f7070J.setSwallowTarget(liveScrollView);
        TouchSwallowView touchSwallowView = this.f7098n;
        if (touchSwallowView != null) {
            touchSwallowView.setSwallowTarget(liveScrollView);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m8669k0(boolean z) {
        xdl0.M(this.f7085V, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8665h0(this);
        xdl0.X(this.f7091h, xdl0.F0() + t100.k);
        m8663l0();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f7075L0 = z;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7075L0 = false;
    }

    public VoiceRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7075L0 = false;
    }
}
