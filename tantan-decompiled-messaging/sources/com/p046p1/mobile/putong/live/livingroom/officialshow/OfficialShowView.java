package com.p046p1.mobile.putong.live.livingroom.officialshow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p046p1.mobile.putong.live.livingroom.base.room.LiveBgView;
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
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.o8d0;
import p149l.p650;
import p149l.q750;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowView extends VFrame implements s7m<p650> {

    /* JADX INFO: renamed from: A */
    public TopEffectLayer f51057A;

    /* JADX INFO: renamed from: B */
    public VFrame f51058B;

    /* JADX INFO: renamed from: C */
    public ChatInputEntryView f51059C;

    /* JADX INFO: renamed from: D */
    public BottomView f51060D;

    /* JADX INFO: renamed from: E */
    public LiveBubbleView f51061E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f51062F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f51063G;

    /* JADX INFO: renamed from: H */
    public LiveEnterRoomView f51064H;

    /* JADX INFO: renamed from: I */
    public LiveEnterRoomView f51065I;

    /* JADX INFO: renamed from: J */
    public View f51066J;

    /* JADX INFO: renamed from: K */
    public PreOperationAnimView f51067K;

    /* JADX INFO: renamed from: L */
    public VRelative f51068L;

    /* JADX INFO: renamed from: M */
    public VImage f51069M;

    /* JADX INFO: renamed from: N */
    public GameEffectView f51070N;

    /* JADX INFO: renamed from: O */
    public VFrame f51071O;

    /* JADX INFO: renamed from: P */
    public VRelative f51072P;

    /* JADX INFO: renamed from: Q */
    public p650 f51073Q;

    /* JADX INFO: renamed from: R */
    public boolean f51074R;

    /* JADX INFO: renamed from: a */
    public OfficialShowView f51075a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f51076b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f51077c;

    /* JADX INFO: renamed from: d */
    public OfficialShowPusherView f51078d;

    /* JADX INFO: renamed from: e */
    public View f51079e;

    /* JADX INFO: renamed from: f */
    public View f51080f;

    /* JADX INFO: renamed from: g */
    public OfficialShowSwitchView f51081g;

    /* JADX INFO: renamed from: h */
    public VFrame f51082h;

    /* JADX INFO: renamed from: i */
    public VRelative f51083i;

    /* JADX INFO: renamed from: j */
    public JumpToRoomView f51084j;

    /* JADX INFO: renamed from: k */
    public VText f51085k;

    /* JADX INFO: renamed from: l */
    public VFrame f51086l;

    /* JADX INFO: renamed from: m */
    public OfficialShowAvatarView f51087m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f51088n;

    /* JADX INFO: renamed from: o */
    public OperationEntryView f51089o;

    /* JADX INFO: renamed from: p */
    public BulletView f51090p;

    /* JADX INFO: renamed from: q */
    public TouchSwallowView f51091q;

    /* JADX INFO: renamed from: r */
    public FansView f51092r;

    /* JADX INFO: renamed from: s */
    public LiveCampaignView f51093s;

    /* JADX INFO: renamed from: t */
    public TouchSwallowView f51094t;

    /* JADX INFO: renamed from: u */
    public ChatView f51095u;

    /* JADX INFO: renamed from: v */
    public TouchSwallowView f51096v;

    /* JADX INFO: renamed from: w */
    public OfficialShowPlayBillView f51097w;

    /* JADX INFO: renamed from: x */
    public VFrame f51098x;

    /* JADX INFO: renamed from: y */
    public DanmakuViewPort f51099y;

    /* JADX INFO: renamed from: z */
    public LiveGiftLayer f51100z;

    public OfficialShowView(Context context) {
        super(context);
        this.f51074R = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m75371B(View view) {
        this.f51073Q.mo95095Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m75373r() {
        xdl0.m208329E0(this.f51068L, new View.OnClickListener() { // from class: l.o750
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142469a.m75375z(view);
            }
        });
        xdl0.m208329E0(this.f51072P, new View.OnClickListener() { // from class: l.p750
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147478a.m75371B(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m75375z(View view) {
        this.f51073Q.mo95095Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m75376C(boolean z) {
        xdl0.m208344M(this.f51069M, z);
        xdl0.m208344M(this.f51083i, z);
        xdl0.m208344M(this.f51098x, z);
        xdl0.m208344M(this.f51058B, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        m75376C(false);
    }

    @Override // p147v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f51074R) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22306c<Integer> getGiftWidthObs() {
        return xdl0.m208340K(this.f51060D);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75377u(this);
        m75373r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f51074R = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m75377u(View view) {
        q750.m173183a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(p650 p650Var) {
        this.f51073Q = p650Var;
    }

    /* JADX INFO: renamed from: w */
    public void m75379w(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f142612b;
        this.f51091q.setSwallowTarget(liveScrollView);
        this.f51088n.setSwallowTarget(liveScrollView);
        this.f51094t.setSwallowTarget(liveScrollView);
        this.f51096v.setSwallowTarget(liveScrollView);
    }

    public OfficialShowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51074R = false;
    }

    public OfficialShowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51074R = false;
    }
}
