package com.p051p1.mobile.putong.live.livingroom.base.live;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.LivePusherView;
import com.p051p1.mobile.putong.live.livingroom.base.room.LiveBgView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerContainer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerDragMask;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.ChatView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuViewPort;
import com.p051p1.mobile.putong.live.livingroom.common.chat.inputEntry.ChatInputEntryView;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;
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
import com.p051p1.mobile.putong.live.livingroom.other.obs.ObsPreviewView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.annoncements.view.LiveAnnouncementEntryView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.view.MultiCallTopView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.iam;
import p153l.kyu;
import p153l.xct;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveView extends VFrame implements iam<xct> {

    /* JADX INFO: renamed from: A */
    public DanmakuViewPort f48649A;

    /* JADX INFO: renamed from: B */
    public ChatView f48650B;

    /* JADX INFO: renamed from: C */
    public LiveCampaignView f48651C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f48652D;

    /* JADX INFO: renamed from: E */
    public VFrame f48653E;

    /* JADX INFO: renamed from: F */
    public LiveGiftLayer f48654F;

    /* JADX INFO: renamed from: G */
    public TopEffectLayer f48655G;

    /* JADX INFO: renamed from: H */
    public VRelative f48656H;

    /* JADX INFO: renamed from: I */
    public ChatInputEntryView f48657I;

    /* JADX INFO: renamed from: J */
    public BottomView f48658J;

    /* JADX INFO: renamed from: K */
    public LiveBubbleView f48659K;

    /* JADX INFO: renamed from: L */
    public LiveGiftTrays f48660L;

    /* JADX INFO: renamed from: M */
    public LiveEnterRoomView f48661M;

    /* JADX INFO: renamed from: N */
    public LiveEnterRoomView f48662N;

    /* JADX INFO: renamed from: O */
    public FrameLayout f48663O;

    /* JADX INFO: renamed from: P */
    public VRelative f48664P;

    /* JADX INFO: renamed from: Q */
    public VImage f48665Q;

    /* JADX INFO: renamed from: R */
    public LiveStickerDragMask f48666R;

    /* JADX INFO: renamed from: S */
    public View f48667S;

    /* JADX INFO: renamed from: T */
    public PreOperationAnimView f48668T;

    /* JADX INFO: renamed from: U */
    public GameEffectView f48669U;

    /* JADX INFO: renamed from: V */
    public VFrame f48670V;

    /* JADX INFO: renamed from: W */
    public xct f48671W;

    /* JADX INFO: renamed from: a */
    public LiveBgView f48672a;

    /* JADX INFO: renamed from: b */
    public LivePusherView f48673b;

    /* JADX INFO: renamed from: c */
    public PreviewView f48674c;

    /* JADX INFO: renamed from: d */
    public PkView f48675d;

    /* JADX INFO: renamed from: e */
    public PkViewInternal f48676e;

    /* JADX INFO: renamed from: f */
    public MultiCallTopView f48677f;

    /* JADX INFO: renamed from: g */
    public MultiPkTimerView f48678g;

    /* JADX INFO: renamed from: h */
    public ObsPreviewView f48679h;

    /* JADX INFO: renamed from: i */
    public LiveCallView f48680i;

    /* JADX INFO: renamed from: j */
    public VFrame f48681j;

    /* JADX INFO: renamed from: k */
    public AvatarView f48682k;

    /* JADX INFO: renamed from: l */
    public View f48683l;

    /* JADX INFO: renamed from: m */
    public VRelative f48684m;

    /* JADX INFO: renamed from: n */
    public LiveAnnouncementEntryView f48685n;

    /* JADX INFO: renamed from: o */
    public VFrame f48686o;

    /* JADX INFO: renamed from: p */
    public HourBoardEntryView f48687p;

    /* JADX INFO: renamed from: q */
    public HourBoardNewEntryView f48688q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f48689r;

    /* JADX INFO: renamed from: s */
    public StarBoardEntryView f48690s;

    /* JADX INFO: renamed from: t */
    public IntlLiveStarBoardEntryView f48691t;

    /* JADX INFO: renamed from: u */
    public FansView f48692u;

    /* JADX INFO: renamed from: v */
    public BulletView f48693v;

    /* JADX INFO: renamed from: w */
    public LiveStickerContainer f48694w;

    /* JADX INFO: renamed from: x */
    public OperationEntryView f48695x;

    /* JADX INFO: renamed from: y */
    public View f48696y;

    /* JADX INFO: renamed from: z */
    public CallWidgetView f48697z;

    public LiveView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: r */
    private void m73096r() {
        ynp0.m216919D(this.f48673b);
        ynp0.m216919D(this.f48675d);
        ynp0.m216919D(this.f48677f);
        ynp0.m216919D(this.f48678g);
        ynp0.m216919D(this.f48680i);
        bnl0.m105509E0(this.f48664P, new View.OnClickListener() { // from class: l.jyu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123201a.m73097v(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m73097v(View view) {
        this.f48671W.m210274X3();
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

    public C22421c<Integer> getGiftWidthObs() {
        return bnl0.m105520K(this.f48658J);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73098s(this);
        m73096r();
    }

    /* JADX INFO: renamed from: s */
    public final void m73098s(View view) {
        kyu.m152141a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xct xctVar) {
        this.f48671W = xctVar;
    }

    public LiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
