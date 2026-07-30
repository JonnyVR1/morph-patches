package com.p051p1.mobile.putong.live.livingroom.base.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p051p1.mobile.putong.live.livingroom.base.player.LiveRtcPlayErrorView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpToRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.game.GameEffectView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p051p1.mobile.putong.live.livingroom.intl.gift.IntlGiftComboView;
import com.p051p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.RoomPusherView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.AbstractC21253x5;
import p153l.bnl0;
import p153l.iam;
import p153l.imd0;
import p153l.qa00;
import p153l.rgd0;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomView extends VFrame implements iam<AbstractC21253x5> {

    /* JADX INFO: renamed from: A */
    public TouchSwallowView f48746A;

    /* JADX INFO: renamed from: B */
    public OperationEntryView f48747B;

    /* JADX INFO: renamed from: C */
    public BulletView f48748C;

    /* JADX INFO: renamed from: D */
    public LiveSiderEntryView f48749D;

    /* JADX INFO: renamed from: E */
    public TouchSwallowView f48750E;

    /* JADX INFO: renamed from: E0 */
    public FrameLayout f48751E0;

    /* JADX INFO: renamed from: F */
    public FansView f48752F;

    /* JADX INFO: renamed from: F0 */
    public VRelative f48753F0;

    /* JADX INFO: renamed from: G */
    public CallWidgetView f48754G;

    /* JADX INFO: renamed from: G0 */
    public VImage f48755G0;

    /* JADX INFO: renamed from: H */
    public LiveCampaignView f48756H;

    /* JADX INFO: renamed from: H0 */
    public GameEffectView f48757H0;

    /* JADX INFO: renamed from: I */
    public TouchSwallowView f48758I;

    /* JADX INFO: renamed from: I0 */
    public VFrame f48759I0;

    /* JADX INFO: renamed from: J */
    public ChatView f48760J;

    /* JADX INFO: renamed from: J0 */
    public VRelative f48761J0;

    /* JADX INFO: renamed from: K */
    public DanmakuViewPort f48762K;

    /* JADX INFO: renamed from: K0 */
    public AbstractC21253x5 f48763K0;

    /* JADX INFO: renamed from: L */
    public IntlGiftComboView f48764L;

    /* JADX INFO: renamed from: L0 */
    public boolean f48765L0;

    /* JADX INFO: renamed from: M */
    public VFrame f48766M;

    /* JADX INFO: renamed from: N */
    public LiveGiftLayer f48767N;

    /* JADX INFO: renamed from: O */
    public TopEffectLayer f48768O;

    /* JADX INFO: renamed from: P */
    public VRelative f48769P;

    /* JADX INFO: renamed from: Q */
    public ChatInputEntryView f48770Q;

    /* JADX INFO: renamed from: R */
    public BottomView f48771R;

    /* JADX INFO: renamed from: S */
    public LiveBubbleView f48772S;

    /* JADX INFO: renamed from: T */
    public FrameLayout f48773T;

    /* JADX INFO: renamed from: U */
    public LiveGiftTrays f48774U;

    /* JADX INFO: renamed from: V */
    public LiveEnterRoomView f48775V;

    /* JADX INFO: renamed from: W */
    public LiveEnterRoomView f48776W;

    /* JADX INFO: renamed from: a */
    public RoomView f48777a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f48778b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f48779c;

    /* JADX INFO: renamed from: d */
    public RoomPusherView f48780d;

    /* JADX INFO: renamed from: e */
    public View f48781e;

    /* JADX INFO: renamed from: f */
    public LiveRtcPlayErrorView f48782f;

    /* JADX INFO: renamed from: g */
    public VFrame f48783g;

    /* JADX INFO: renamed from: h */
    public VRelative f48784h;

    /* JADX INFO: renamed from: i */
    public JumpToRoomView f48785i;

    /* JADX INFO: renamed from: j */
    public PkView f48786j;

    /* JADX INFO: renamed from: k */
    public PkViewInternal f48787k;

    /* JADX INFO: renamed from: k0 */
    public View f48788k0;

    /* JADX INFO: renamed from: l */
    public MultiCallTopView f48789l;

    /* JADX INFO: renamed from: m */
    public MultiPkTimerView f48790m;

    /* JADX INFO: renamed from: n */
    public VText f48791n;

    /* JADX INFO: renamed from: o */
    public LiveCallView f48792o;

    /* JADX INFO: renamed from: p */
    public VFrame f48793p;

    /* JADX INFO: renamed from: p0 */
    public PreOperationAnimView f48794p0;

    /* JADX INFO: renamed from: q */
    public AvatarView f48795q;

    /* JADX INFO: renamed from: r */
    public VRelative f48796r;

    /* JADX INFO: renamed from: s */
    public LiveAnnouncementEntryView f48797s;

    /* JADX INFO: renamed from: t */
    public VFrame f48798t;

    /* JADX INFO: renamed from: u */
    public HourBoardEntryView f48799u;

    /* JADX INFO: renamed from: v */
    public HourBoardNewEntryView f48800v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f48801w;

    /* JADX INFO: renamed from: x */
    public StarBoardEntryView f48802x;

    /* JADX INFO: renamed from: y */
    public IntlLiveStarBoardEntryView f48803y;

    /* JADX INFO: renamed from: z */
    public RoomStickerContainer f48804z;

    public RoomView(Context context) {
        super(context);
        this.f48765L0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m73185B(View view) {
        this.f48763K0.mo120620Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m73187r() {
        ynp0.m216919D(this.f48779c);
        ynp0.m216919D(this.f48780d);
        ynp0.m216919D(this.f48786j);
        ynp0.m216919D(this.f48789l);
        ynp0.m216919D(this.f48790m);
        ynp0.m216919D(this.f48792o);
        bnl0.m105509E0(this.f48753F0, new View.OnClickListener() { // from class: l.fmd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99766a.m73189z(view);
            }
        });
        bnl0.m105509E0(this.f48761J0, new View.OnClickListener() { // from class: l.gmd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104969a.m73185B(view);
            }
        });
        bnl0.m105540X(this.f48784h, bnl0.m105511F0() + qa00.f156316c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m73189z(View view) {
        this.f48763K0.mo120620Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m73190C(boolean z) {
        bnl0.m105524M(this.f48755G0, z);
        bnl0.m105524M(this.f48784h, z);
        bnl0.m105524M(this.f48766M, z);
        bnl0.m105524M(this.f48769P, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        m73190C(false);
    }

    @Override // p151v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f48765L0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22421c<Integer> getGiftWidthObs() {
        return bnl0.m105520K(this.f48771R);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73191u(this);
        m73187r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f48765L0 = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m73191u(View view) {
        imd0.m140922a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(AbstractC21253x5 abstractC21253x5) {
        this.f48763K0 = abstractC21253x5;
    }

    /* JADX INFO: renamed from: w */
    public void m73193w(rgd0 rgd0Var) {
        LiveScrollView liveScrollView = rgd0Var.f162994b;
        this.f48750E.setSwallowTarget(liveScrollView);
        this.f48746A.setSwallowTarget(liveScrollView);
        this.f48758I.setSwallowTarget(liveScrollView);
        this.f48789l.setSwallowTarget(liveScrollView);
    }

    public RoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48765L0 = false;
    }

    public RoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48765L0 = false;
    }
}
