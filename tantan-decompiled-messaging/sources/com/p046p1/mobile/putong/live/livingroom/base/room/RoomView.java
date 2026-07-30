package com.p046p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p046p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p046p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p046p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.AbstractC15533a6;
import p149l.ged0;
import p149l.o8d0;
import p149l.s7m;
import p149l.t100;
import p149l.uep0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomView extends VFrame implements s7m<AbstractC15533a6> {

    /* JADX INFO: renamed from: A */
    public TouchSwallowView f47898A;

    /* JADX INFO: renamed from: B */
    public OperationEntryView f47899B;

    /* JADX INFO: renamed from: C */
    public BulletView f47900C;

    /* JADX INFO: renamed from: D */
    public LiveSiderEntryView f47901D;

    /* JADX INFO: renamed from: E */
    public TouchSwallowView f47902E;

    /* JADX INFO: renamed from: E0 */
    public FrameLayout f47903E0;

    /* JADX INFO: renamed from: F */
    public FansView f47904F;

    /* JADX INFO: renamed from: F0 */
    public VRelative f47905F0;

    /* JADX INFO: renamed from: G */
    public CallWidgetView f47906G;

    /* JADX INFO: renamed from: G0 */
    public VImage f47907G0;

    /* JADX INFO: renamed from: H */
    public LiveCampaignView f47908H;

    /* JADX INFO: renamed from: H0 */
    public GameEffectView f47909H0;

    /* JADX INFO: renamed from: I */
    public TouchSwallowView f47910I;

    /* JADX INFO: renamed from: I0 */
    public VFrame f47911I0;

    /* JADX INFO: renamed from: J */
    public ChatView f47912J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f47913J0;

    /* JADX INFO: renamed from: K */
    public DanmakuViewPort f47914K;

    /* JADX INFO: renamed from: K0 */
    public AbstractC15533a6 f47915K0;

    /* JADX INFO: renamed from: L */
    public IntlGiftComboView f47916L;

    /* JADX INFO: renamed from: L0 */
    public boolean f47917L0;

    /* JADX INFO: renamed from: M */
    public VFrame f47918M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f47919N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f47920O;

    /* JADX INFO: renamed from: P */
    public VRelative f47921P;

    /* JADX INFO: renamed from: Q */
    public ChatInputEntryView f47922Q;

    /* JADX INFO: renamed from: R */
    public BottomView f47923R;

    /* JADX INFO: renamed from: S */
    public LiveBubbleView f47924S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f47925T;

    /* JADX INFO: renamed from: U */
    public LiveGiftTrays f47926U;

    /* JADX INFO: renamed from: V */
    public LiveEnterRoomView f47927V;

    /* JADX INFO: renamed from: W */
    public LiveEnterRoomView f47928W;

    /* JADX INFO: renamed from: a */
    public RoomView f47929a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f47930b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f47931c;

    /* JADX INFO: renamed from: d */
    public RoomPusherView f47932d;

    /* JADX INFO: renamed from: e */
    public View f47933e;

    /* JADX INFO: renamed from: f */
    public LiveRtcPlayErrorView f47934f;

    /* JADX INFO: renamed from: g */
    public VFrame f47935g;

    /* JADX INFO: renamed from: h */
    public VRelative f47936h;

    /* JADX INFO: renamed from: i */
    public JumpToRoomView f47937i;

    /* JADX INFO: renamed from: j */
    public PkView f47938j;

    /* JADX INFO: renamed from: k */
    public PkViewInternal f47939k;

    /* JADX INFO: renamed from: k0 */
    public View f47940k0;

    /* JADX INFO: renamed from: l */
    public MultiCallTopView f47941l;

    /* JADX INFO: renamed from: m */
    public MultiPkTimerView f47942m;

    /* JADX INFO: renamed from: n */
    public VText f47943n;

    /* JADX INFO: renamed from: o */
    public LiveCallView f47944o;

    /* JADX INFO: renamed from: p */
    public VFrame f47945p;

    /* JADX INFO: renamed from: p0 */
    public PreOperationAnimView f47946p0;

    /* JADX INFO: renamed from: q */
    public AvatarView f47947q;

    /* JADX INFO: renamed from: r */
    public VRelative f47948r;

    /* JADX INFO: renamed from: s */
    public LiveAnnouncementEntryView f47949s;

    /* JADX INFO: renamed from: t */
    public VFrame f47950t;

    /* JADX INFO: renamed from: u */
    public HourBoardEntryView f47951u;

    /* JADX INFO: renamed from: v */
    public HourBoardNewEntryView f47952v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f47953w;

    /* JADX INFO: renamed from: x */
    public StarBoardEntryView f47954x;

    /* JADX INFO: renamed from: y */
    public IntlLiveStarBoardEntryView f47955y;

    /* JADX INFO: renamed from: z */
    public RoomStickerContainer f47956z;

    public RoomView(Context context) {
        super(context);
        this.f47917L0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m72002B(View view) {
        this.f47915K0.mo95095Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m72004r() {
        uep0.m193309D(this.f47931c);
        uep0.m193309D(this.f47932d);
        uep0.m193309D(this.f47938j);
        uep0.m193309D(this.f47941l);
        uep0.m193309D(this.f47942m);
        uep0.m193309D(this.f47944o);
        xdl0.m208329E0(this.f47905F0, new View.OnClickListener() { // from class: l.ded0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85782a.m72006z(view);
            }
        });
        xdl0.m208329E0(this.f47913J0, new View.OnClickListener() { // from class: l.eed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90735a.m72002B(view);
            }
        });
        xdl0.m208360X(this.f47936h, xdl0.m208331F0() + t100.f167254c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m72006z(View view) {
        this.f47915K0.mo95095Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m72007C(boolean z) {
        xdl0.m208344M(this.f47907G0, z);
        xdl0.m208344M(this.f47936h, z);
        xdl0.m208344M(this.f47918M, z);
        xdl0.m208344M(this.f47921P, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        m72007C(false);
    }

    @Override // p147v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f47917L0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22306c<Integer> getGiftWidthObs() {
        return xdl0.m208340K(this.f47923R);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72008u(this);
        m72004r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f47917L0 = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m72008u(View view) {
        ged0.m125691a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(AbstractC15533a6 abstractC15533a6) {
        this.f47915K0 = abstractC15533a6;
    }

    /* JADX INFO: renamed from: w */
    public void m72010w(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f142612b;
        this.f47902E.setSwallowTarget(liveScrollView);
        this.f47898A.setSwallowTarget(liveScrollView);
        this.f47910I.setSwallowTarget(liveScrollView);
        this.f47941l.setSwallowTarget(liveScrollView);
    }

    public RoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47917L0 = false;
    }

    public RoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47917L0 = false;
    }
}
