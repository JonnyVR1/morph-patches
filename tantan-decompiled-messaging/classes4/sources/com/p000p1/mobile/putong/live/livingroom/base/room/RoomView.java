package com.p000p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p000p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p000p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.PkView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import l.s7m;
import l.t100;
import l.uep0;
import l.xdl0;
import p002l.AbstractC0485a6;
import p002l.ged0;
import p002l.o8d0;
import rx.c;
import v.VFrame;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomView extends VFrame implements s7m<AbstractC0485a6> {

    /* JADX INFO: renamed from: A */
    public TouchSwallowView f3940A;

    /* JADX INFO: renamed from: B */
    public OperationEntryView f3941B;

    /* JADX INFO: renamed from: C */
    public BulletView f3942C;

    /* JADX INFO: renamed from: D */
    public LiveSiderEntryView f3943D;

    /* JADX INFO: renamed from: E */
    public TouchSwallowView f3944E;

    /* JADX INFO: renamed from: E0 */
    public FrameLayout f3945E0;

    /* JADX INFO: renamed from: F */
    public FansView f3946F;

    /* JADX INFO: renamed from: F0 */
    public VRelative f3947F0;

    /* JADX INFO: renamed from: G */
    public CallWidgetView f3948G;

    /* JADX INFO: renamed from: G0 */
    public VImage f3949G0;

    /* JADX INFO: renamed from: H */
    public LiveCampaignView f3950H;

    /* JADX INFO: renamed from: H0 */
    public GameEffectView f3951H0;

    /* JADX INFO: renamed from: I */
    public TouchSwallowView f3952I;

    /* JADX INFO: renamed from: I0 */
    public VFrame f3953I0;

    /* JADX INFO: renamed from: J */
    public ChatView f3954J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f3955J0;

    /* JADX INFO: renamed from: K */
    public DanmakuViewPort f3956K;

    /* JADX INFO: renamed from: K0 */
    public AbstractC0485a6 f3957K0;

    /* JADX INFO: renamed from: L */
    public IntlGiftComboView f3958L;

    /* JADX INFO: renamed from: L0 */
    public boolean f3959L0;

    /* JADX INFO: renamed from: M */
    public VFrame f3960M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f3961N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f3962O;

    /* JADX INFO: renamed from: P */
    public VRelative f3963P;

    /* JADX INFO: renamed from: Q */
    public ChatInputEntryView f3964Q;

    /* JADX INFO: renamed from: R */
    public BottomView f3965R;

    /* JADX INFO: renamed from: S */
    public LiveBubbleView f3966S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f3967T;

    /* JADX INFO: renamed from: U */
    public LiveGiftTrays f3968U;

    /* JADX INFO: renamed from: V */
    public LiveEnterRoomView f3969V;

    /* JADX INFO: renamed from: W */
    public LiveEnterRoomView f3970W;

    /* JADX INFO: renamed from: a */
    public RoomView f3971a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f3972b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f3973c;

    /* JADX INFO: renamed from: d */
    public RoomPusherView f3974d;

    /* JADX INFO: renamed from: e */
    public View f3975e;

    /* JADX INFO: renamed from: f */
    public LiveRtcPlayErrorView f3976f;

    /* JADX INFO: renamed from: g */
    public VFrame f3977g;

    /* JADX INFO: renamed from: h */
    public VRelative f3978h;

    /* JADX INFO: renamed from: i */
    public JumpToRoomView f3979i;

    /* JADX INFO: renamed from: j */
    public PkView f3980j;

    /* JADX INFO: renamed from: k */
    public PkViewInternal f3981k;

    /* JADX INFO: renamed from: k0 */
    public View f3982k0;

    /* JADX INFO: renamed from: l */
    public MultiCallTopView f3983l;

    /* JADX INFO: renamed from: m */
    public MultiPkTimerView f3984m;

    /* JADX INFO: renamed from: n */
    public VText f3985n;

    /* JADX INFO: renamed from: o */
    public LiveCallView f3986o;

    /* JADX INFO: renamed from: p */
    public VFrame f3987p;

    /* JADX INFO: renamed from: p0 */
    public PreOperationAnimView f3988p0;

    /* JADX INFO: renamed from: q */
    public AvatarView f3989q;

    /* JADX INFO: renamed from: r */
    public VRelative f3990r;

    /* JADX INFO: renamed from: s */
    public LiveAnnouncementEntryView f3991s;

    /* JADX INFO: renamed from: t */
    public VFrame f3992t;

    /* JADX INFO: renamed from: u */
    public HourBoardEntryView f3993u;

    /* JADX INFO: renamed from: v */
    public HourBoardNewEntryView f3994v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f3995w;

    /* JADX INFO: renamed from: x */
    public StarBoardEntryView f3996x;

    /* JADX INFO: renamed from: y */
    public IntlLiveStarBoardEntryView f3997y;

    /* JADX INFO: renamed from: z */
    public RoomStickerContainer f3998z;

    public RoomView(Context context) {
        super(context);
        this.f3959L0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m5393B(View view) {
        this.f3957K0.mo9416Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m5395r() {
        uep0.D(this.f3973c);
        uep0.D(this.f3974d);
        uep0.D(this.f3980j);
        uep0.D(this.f3983l);
        uep0.D(this.f3984m);
        uep0.D(this.f3986o);
        xdl0.E0(this.f3947F0, new View.OnClickListener() { // from class: l.ded0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9184a.m5397z(view);
            }
        });
        xdl0.E0(this.f3955J0, new View.OnClickListener() { // from class: l.eed0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9725a.m5393B(view);
            }
        });
        xdl0.X(this.f3978h, xdl0.F0() + t100.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m5397z(View view) {
        this.f3957K0.mo9416Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m5398C(boolean z) {
        xdl0.M(this.f3949G0, z);
        xdl0.M(this.f3978h, z);
        xdl0.M(this.f3960M, z);
        xdl0.M(this.f3963P, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5399C0() {
        return getContext();
    }

    public void destroy() {
        m5398C(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f3959L0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public c<Integer> getGiftWidthObs() {
        return xdl0.K(this.f3965R);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5401u(this);
        m5395r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f3959L0 = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m5401u(View view) {
        ged0.m13767a(this, view);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m5400i1(AbstractC0485a6 abstractC0485a6) {
        this.f3957K0 = abstractC0485a6;
    }

    /* JADX INFO: renamed from: w */
    public void m5403w(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f16428b;
        this.f3944E.setSwallowTarget(liveScrollView);
        this.f3940A.setSwallowTarget(liveScrollView);
        this.f3952I.setSwallowTarget(liveScrollView);
        this.f3983l.setSwallowTarget(liveScrollView);
    }

    public RoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3959L0 = false;
    }

    public RoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3959L0 = false;
    }
}
