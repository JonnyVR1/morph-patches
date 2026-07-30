package com.p046p1.mobile.putong.live.livingroom.voice.intl.root;

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
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
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
import com.p046p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p147v.VFrame;
import p149l.iwn0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;
import p149l.xun0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceLiveView extends ConstraintLayout implements s7m<xun0> {

    /* JADX INFO: renamed from: A */
    public View f53404A;

    /* JADX INFO: renamed from: B */
    public VoicePkTimeView f53405B;

    /* JADX INFO: renamed from: C */
    public VoiceGrabHatFloatViewMode f53406C;

    /* JADX INFO: renamed from: D */
    public VoiceBottomView f53407D;

    /* JADX INFO: renamed from: E */
    public VoiceChatBottomView f53408E;

    /* JADX INFO: renamed from: F */
    public BottomMenuView f53409F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f53410G;

    /* JADX INFO: renamed from: H */
    public DanmakuViewPort f53411H;

    /* JADX INFO: renamed from: I */
    public FrameLayout f53412I;

    /* JADX INFO: renamed from: J */
    public IntlGiftComboView f53413J;

    /* JADX INFO: renamed from: K */
    public VoiceLiveBulletView f53414K;

    /* JADX INFO: renamed from: L */
    public VFrame f53415L;

    /* JADX INFO: renamed from: M */
    public VoiceFlyMicContainer f53416M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f53417N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f53418O;

    /* JADX INFO: renamed from: P */
    public LiveEnterRoomView f53419P;

    /* JADX INFO: renamed from: Q */
    public LiveEnterRoomView f53420Q;

    /* JADX INFO: renamed from: R */
    public VFrame f53421R;

    /* JADX INFO: renamed from: S */
    public VoiceLiveBubbleView f53422S;

    /* JADX INFO: renamed from: T */
    public View f53423T;

    /* JADX INFO: renamed from: U */
    public VoicePreviewViewModel f53424U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f53425V;

    /* JADX INFO: renamed from: W */
    public xun0 f53426W;

    /* JADX INFO: renamed from: d */
    public VoiceBackgroundView f53427d;

    /* JADX INFO: renamed from: e */
    public TouchSwallowView f53428e;

    /* JADX INFO: renamed from: f */
    public VoiceFansView f53429f;

    /* JADX INFO: renamed from: g */
    public VoiceCloseView f53430g;

    /* JADX INFO: renamed from: h */
    public VoicePkMvpView f53431h;

    /* JADX INFO: renamed from: i */
    public VoiceRoomInfoView f53432i;

    /* JADX INFO: renamed from: j */
    public LiveCampaignView f53433j;

    /* JADX INFO: renamed from: k */
    public VoiceNewOperationView f53434k;

    /* JADX INFO: renamed from: l */
    public VoiceLiveApplyManagerEnterViewModel f53435l;

    /* JADX INFO: renamed from: m */
    public VoiceNewGamePlayRootView f53436m;

    /* JADX INFO: renamed from: n */
    public VoiceOperationsView f53437n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f53438o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f53439p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f53440q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f53441r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f53442s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f53443t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f53444u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f53445v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f53446w;

    /* JADX INFO: renamed from: x */
    public View f53447x;

    /* JADX INFO: renamed from: y */
    public ChatListView f53448y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f53449z;

    public VoiceLiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m78450r() {
        m78453j0();
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

    /* JADX INFO: renamed from: h0 */
    public final void m78451h0(View view) {
        iwn0.m138757a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xun0 xun0Var) {
        this.f53426W = xun0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78453j0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53410G.f50129b.getLayoutParams();
        layoutParams.topMargin = -t100.m186890d(14.0f);
        this.f53410G.f50129b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: k0 */
    public void m78454k0(Frag frag) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m78455l0(boolean z) {
        xdl0.m208344M(this.f53421R, z);
        xdl0.m208344M(this.f53430g, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78451h0(this);
        xdl0.m208360X(this.f53430g, xdl0.m208331F0() + t100.f167262k);
        m78450r();
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
