package com.p000p1.mobile.putong.live.livingroom.base.live;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p000p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p000p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
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
import com.p000p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.PkView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkViewInternal;
import l.s7m;
import l.uep0;
import l.xdl0;
import p002l.jwu;
import p002l.wat;
import rx.c;
import v.VFrame;
import v.VImage;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveView extends VFrame implements s7m<wat> {

    /* JADX INFO: renamed from: A */
    public DanmakuViewPort f3843A;

    /* JADX INFO: renamed from: B */
    public ChatView f3844B;

    /* JADX INFO: renamed from: C */
    public LiveCampaignView f3845C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f3846D;

    /* JADX INFO: renamed from: E */
    public VFrame f3847E;

    /* JADX INFO: renamed from: F */
    public LiveGiftLayer f3848F;

    /* JADX INFO: renamed from: G */
    public TopEffectLayer f3849G;

    /* JADX INFO: renamed from: H */
    public VRelative f3850H;

    /* JADX INFO: renamed from: I */
    public ChatInputEntryView f3851I;

    /* JADX INFO: renamed from: J */
    public BottomView f3852J;

    /* JADX INFO: renamed from: K */
    public LiveBubbleView f3853K;

    /* JADX INFO: renamed from: L */
    public LiveGiftTrays f3854L;

    /* JADX INFO: renamed from: M */
    public LiveEnterRoomView f3855M;

    /* JADX INFO: renamed from: N */
    public LiveEnterRoomView f3856N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f3857O;

    /* JADX INFO: renamed from: P */
    public VRelative f3858P;

    /* JADX INFO: renamed from: Q */
    public VImage f3859Q;

    /* JADX INFO: renamed from: R */
    public LiveStickerDragMask f3860R;

    /* JADX INFO: renamed from: S */
    public View f3861S;

    /* JADX INFO: renamed from: T */
    public PreOperationAnimView f3862T;

    /* JADX INFO: renamed from: U */
    public GameEffectView f3863U;

    /* JADX INFO: renamed from: V */
    public VFrame f3864V;

    /* JADX INFO: renamed from: W */
    public wat f3865W;

    /* JADX INFO: renamed from: a */
    public LiveBgView f3866a;

    /* JADX INFO: renamed from: b */
    public LivePusherView f3867b;

    /* JADX INFO: renamed from: c */
    public PreviewView f3868c;

    /* JADX INFO: renamed from: d */
    public PkView f3869d;

    /* JADX INFO: renamed from: e */
    public PkViewInternal f3870e;

    /* JADX INFO: renamed from: f */
    public MultiCallTopView f3871f;

    /* JADX INFO: renamed from: g */
    public MultiPkTimerView f3872g;

    /* JADX INFO: renamed from: h */
    public ObsPreviewView f3873h;

    /* JADX INFO: renamed from: i */
    public LiveCallView f3874i;

    /* JADX INFO: renamed from: j */
    public VFrame f3875j;

    /* JADX INFO: renamed from: k */
    public AvatarView f3876k;

    /* JADX INFO: renamed from: l */
    public View f3877l;

    /* JADX INFO: renamed from: m */
    public VRelative f3878m;

    /* JADX INFO: renamed from: n */
    public LiveAnnouncementEntryView f3879n;

    /* JADX INFO: renamed from: o */
    public VFrame f3880o;

    /* JADX INFO: renamed from: p */
    public HourBoardEntryView f3881p;

    /* JADX INFO: renamed from: q */
    public HourBoardNewEntryView f3882q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f3883r;

    /* JADX INFO: renamed from: s */
    public StarBoardEntryView f3884s;

    /* JADX INFO: renamed from: t */
    public IntlLiveStarBoardEntryView f3885t;

    /* JADX INFO: renamed from: u */
    public FansView f3886u;

    /* JADX INFO: renamed from: v */
    public BulletView f3887v;

    /* JADX INFO: renamed from: w */
    public LiveStickerContainer f3888w;

    /* JADX INFO: renamed from: x */
    public OperationEntryView f3889x;

    /* JADX INFO: renamed from: y */
    public View f3890y;

    /* JADX INFO: renamed from: z */
    public CallWidgetView f3891z;

    public LiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m5292r() {
        uep0.D(this.f3867b);
        uep0.D(this.f3869d);
        uep0.D(this.f3871f);
        uep0.D(this.f3872g);
        uep0.D(this.f3874i);
        xdl0.E0(this.f3858P, new View.OnClickListener() { // from class: l.iwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13458a.m5293v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m5293v(View view) {
        this.f3865W.m24458X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5294C0() {
        return getContext();
    }

    public void destroy() {
    }

    public c<Integer> getGiftWidthObs() {
        return xdl0.K(this.f3852J);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5296s(this);
        m5292r();
    }

    /* JADX INFO: renamed from: s */
    public final void m5296s(View view) {
        jwu.m16397a(this, view);
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m5295i1(wat watVar) {
        this.f3865W = watVar;
    }

    public LiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
