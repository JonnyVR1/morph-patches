package com.p000p1.mobile.putong.live.livingroom.voice.intl.root;

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
import com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.operations.VoiceOperationsView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkMvpView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.p003pk.VoicePkTimeView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.preview.VoicePreviewViewModel;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roombg.common.VoiceBackgroundView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
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
import l.iwn0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.xun0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceLiveView extends ConstraintLayout implements s7m<xun0> {

    /* JADX INFO: renamed from: A */
    public View f7010A;

    /* JADX INFO: renamed from: B */
    public VoicePkTimeView f7011B;

    /* JADX INFO: renamed from: C */
    public VoiceGrabHatFloatViewMode f7012C;

    /* JADX INFO: renamed from: D */
    public VoiceBottomView f7013D;

    /* JADX INFO: renamed from: E */
    public VoiceChatBottomView f7014E;

    /* JADX INFO: renamed from: F */
    public BottomMenuView f7015F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f7016G;

    /* JADX INFO: renamed from: H */
    public DanmakuViewPort f7017H;

    /* JADX INFO: renamed from: I */
    public FrameLayout f7018I;

    /* JADX INFO: renamed from: J */
    public IntlGiftComboView f7019J;

    /* JADX INFO: renamed from: K */
    public VoiceLiveBulletView f7020K;

    /* JADX INFO: renamed from: L */
    public VFrame f7021L;

    /* JADX INFO: renamed from: M */
    public VoiceFlyMicContainer f7022M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f7023N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f7024O;

    /* JADX INFO: renamed from: P */
    public LiveEnterRoomView f7025P;

    /* JADX INFO: renamed from: Q */
    public LiveEnterRoomView f7026Q;

    /* JADX INFO: renamed from: R */
    public VFrame f7027R;

    /* JADX INFO: renamed from: S */
    public VoiceLiveBubbleView f7028S;

    /* JADX INFO: renamed from: T */
    public View f7029T;

    /* JADX INFO: renamed from: U */
    public VoicePreviewViewModel f7030U;

    /* JADX INFO: renamed from: V */
    public FrameLayout f7031V;

    /* JADX INFO: renamed from: W */
    public xun0 f7032W;

    /* JADX INFO: renamed from: d */
    public VoiceBackgroundView f7033d;

    /* JADX INFO: renamed from: e */
    public TouchSwallowView f7034e;

    /* JADX INFO: renamed from: f */
    public VoiceFansView f7035f;

    /* JADX INFO: renamed from: g */
    public VoiceCloseView f7036g;

    /* JADX INFO: renamed from: h */
    public VoicePkMvpView f7037h;

    /* JADX INFO: renamed from: i */
    public VoiceRoomInfoView f7038i;

    /* JADX INFO: renamed from: j */
    public LiveCampaignView f7039j;

    /* JADX INFO: renamed from: k */
    public VoiceNewOperationView f7040k;

    /* JADX INFO: renamed from: l */
    public VoiceLiveApplyManagerEnterViewModel f7041l;

    /* JADX INFO: renamed from: m */
    public VoiceNewGamePlayRootView f7042m;

    /* JADX INFO: renamed from: n */
    public VoiceOperationsView f7043n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f7044o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f7045p;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f7046q;

    /* JADX INFO: renamed from: r */
    public VoiceTopHeartBeatView f7047r;

    /* JADX INFO: renamed from: s */
    public IntlLiveStarBoardEntryView f7048s;

    /* JADX INFO: renamed from: t */
    public VoiceLiveHourBoardEntryView f7049t;

    /* JADX INFO: renamed from: u */
    public VoiceLiveHeatBoxEntryView f7050u;

    /* JADX INFO: renamed from: v */
    public VoiceTopNoticeView f7051v;

    /* JADX INFO: renamed from: w */
    public VoiceChatGroupEnterView f7052w;

    /* JADX INFO: renamed from: x */
    public View f7053x;

    /* JADX INFO: renamed from: y */
    public ChatListView f7054y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f7055z;

    public VoiceLiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m8655r() {
        m8660j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8656C0() {
        return getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8657h0(View view) {
        iwn0.a(this, view);
    }

    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void m8659i1(xun0 xun0Var) {
        this.f7032W = xun0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8660j0() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7016G.b.getLayoutParams();
        layoutParams.topMargin = -t100.d(14.0f);
        this.f7016G.b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: k0 */
    public void m8661k0(Frag frag) {
    }

    /* JADX INFO: renamed from: l0 */
    public void m8662l0(boolean z) {
        xdl0.M(this.f7027R, z);
        xdl0.M(this.f7036g, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8657h0(this);
        xdl0.X(this.f7036g, xdl0.F0() + t100.k);
        m8655r();
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
