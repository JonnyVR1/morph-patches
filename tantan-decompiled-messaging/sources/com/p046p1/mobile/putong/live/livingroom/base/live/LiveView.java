package com.p046p1.mobile.putong.live.livingroom.base.live;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p046p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p046p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p046p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;
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
import com.p046p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p149l.jwu;
import p149l.s7m;
import p149l.uep0;
import p149l.wat;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveView extends VFrame implements s7m<wat> {

    /* JADX INFO: renamed from: A */
    public DanmakuViewPort f47801A;

    /* JADX INFO: renamed from: B */
    public ChatView f47802B;

    /* JADX INFO: renamed from: C */
    public LiveCampaignView f47803C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f47804D;

    /* JADX INFO: renamed from: E */
    public VFrame f47805E;

    /* JADX INFO: renamed from: F */
    public LiveGiftLayer f47806F;

    /* JADX INFO: renamed from: G */
    public TopEffectLayer f47807G;

    /* JADX INFO: renamed from: H */
    public VRelative f47808H;

    /* JADX INFO: renamed from: I */
    public ChatInputEntryView f47809I;

    /* JADX INFO: renamed from: J */
    public BottomView f47810J;

    /* JADX INFO: renamed from: K */
    public LiveBubbleView f47811K;

    /* JADX INFO: renamed from: L */
    public LiveGiftTrays f47812L;

    /* JADX INFO: renamed from: M */
    public LiveEnterRoomView f47813M;

    /* JADX INFO: renamed from: N */
    public LiveEnterRoomView f47814N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f47815O;

    /* JADX INFO: renamed from: P */
    public VRelative f47816P;

    /* JADX INFO: renamed from: Q */
    public VImage f47817Q;

    /* JADX INFO: renamed from: R */
    public LiveStickerDragMask f47818R;

    /* JADX INFO: renamed from: S */
    public View f47819S;

    /* JADX INFO: renamed from: T */
    public PreOperationAnimView f47820T;

    /* JADX INFO: renamed from: U */
    public GameEffectView f47821U;

    /* JADX INFO: renamed from: V */
    public VFrame f47822V;

    /* JADX INFO: renamed from: W */
    public wat f47823W;

    /* JADX INFO: renamed from: a */
    public LiveBgView f47824a;

    /* JADX INFO: renamed from: b */
    public LivePusherView f47825b;

    /* JADX INFO: renamed from: c */
    public PreviewView f47826c;

    /* JADX INFO: renamed from: d */
    public PkView f47827d;

    /* JADX INFO: renamed from: e */
    public PkViewInternal f47828e;

    /* JADX INFO: renamed from: f */
    public MultiCallTopView f47829f;

    /* JADX INFO: renamed from: g */
    public MultiPkTimerView f47830g;

    /* JADX INFO: renamed from: h */
    public ObsPreviewView f47831h;

    /* JADX INFO: renamed from: i */
    public LiveCallView f47832i;

    /* JADX INFO: renamed from: j */
    public VFrame f47833j;

    /* JADX INFO: renamed from: k */
    public AvatarView f47834k;

    /* JADX INFO: renamed from: l */
    public View f47835l;

    /* JADX INFO: renamed from: m */
    public VRelative f47836m;

    /* JADX INFO: renamed from: n */
    public LiveAnnouncementEntryView f47837n;

    /* JADX INFO: renamed from: o */
    public VFrame f47838o;

    /* JADX INFO: renamed from: p */
    public HourBoardEntryView f47839p;

    /* JADX INFO: renamed from: q */
    public HourBoardNewEntryView f47840q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f47841r;

    /* JADX INFO: renamed from: s */
    public StarBoardEntryView f47842s;

    /* JADX INFO: renamed from: t */
    public IntlLiveStarBoardEntryView f47843t;

    /* JADX INFO: renamed from: u */
    public FansView f47844u;

    /* JADX INFO: renamed from: v */
    public BulletView f47845v;

    /* JADX INFO: renamed from: w */
    public LiveStickerContainer f47846w;

    /* JADX INFO: renamed from: x */
    public OperationEntryView f47847x;

    /* JADX INFO: renamed from: y */
    public View f47848y;

    /* JADX INFO: renamed from: z */
    public CallWidgetView f47849z;

    public LiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m71913r() {
        uep0.m193309D(this.f47825b);
        uep0.m193309D(this.f47827d);
        uep0.m193309D(this.f47829f);
        uep0.m193309D(this.f47830g);
        uep0.m193309D(this.f47832i);
        xdl0.m208329E0(this.f47816P, new View.OnClickListener() { // from class: l.iwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115297a.m71914v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m71914v(View view) {
        this.f47823W.m202470X3();
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

    public C22306c<Integer> getGiftWidthObs() {
        return xdl0.m208340K(this.f47810J);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71915s(this);
        m71913r();
    }

    /* JADX INFO: renamed from: s */
    public final void m71915s(View view) {
        jwu.m143672a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(wat watVar) {
        this.f47823W = watVar;
    }

    public LiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
