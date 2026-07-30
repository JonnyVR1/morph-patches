package com.p000p1.mobile.putong.live.livingroom.officialshow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p000p1.mobile.putong.live.livingroom.base.room.LiveBgView;
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
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import l.s7m;
import l.xdl0;
import p002l.o8d0;
import p002l.p650;
import p002l.q750;
import rx.c;
import v.VFrame;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowView extends VFrame implements s7m<p650> {

    /* JADX INFO: renamed from: A */
    public TopEffectLayer f7099A;

    /* JADX INFO: renamed from: B */
    public VFrame f7100B;

    /* JADX INFO: renamed from: C */
    public ChatInputEntryView f7101C;

    /* JADX INFO: renamed from: D */
    public BottomView f7102D;

    /* JADX INFO: renamed from: E */
    public LiveBubbleView f7103E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f7104F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f7105G;

    /* JADX INFO: renamed from: H */
    public LiveEnterRoomView f7106H;

    /* JADX INFO: renamed from: I */
    public LiveEnterRoomView f7107I;

    /* JADX INFO: renamed from: J */
    public View f7108J;

    /* JADX INFO: renamed from: K */
    public PreOperationAnimView f7109K;

    /* JADX INFO: renamed from: L */
    public VRelative f7110L;

    /* JADX INFO: renamed from: M */
    public VImage f7111M;

    /* JADX INFO: renamed from: N */
    public GameEffectView f7112N;

    /* JADX INFO: renamed from: O */
    public VFrame f7113O;

    /* JADX INFO: renamed from: P */
    public VRelative f7114P;

    /* JADX INFO: renamed from: Q */
    public p650 f7115Q;

    /* JADX INFO: renamed from: R */
    public boolean f7116R;

    /* JADX INFO: renamed from: a */
    public OfficialShowView f7117a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f7118b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f7119c;

    /* JADX INFO: renamed from: d */
    public OfficialShowPusherView f7120d;

    /* JADX INFO: renamed from: e */
    public View f7121e;

    /* JADX INFO: renamed from: f */
    public View f7122f;

    /* JADX INFO: renamed from: g */
    public OfficialShowSwitchView f7123g;

    /* JADX INFO: renamed from: h */
    public VFrame f7124h;

    /* JADX INFO: renamed from: i */
    public VRelative f7125i;

    /* JADX INFO: renamed from: j */
    public JumpToRoomView f7126j;

    /* JADX INFO: renamed from: k */
    public VText f7127k;

    /* JADX INFO: renamed from: l */
    public VFrame f7128l;

    /* JADX INFO: renamed from: m */
    public OfficialShowAvatarView f7129m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f7130n;

    /* JADX INFO: renamed from: o */
    public OperationEntryView f7131o;

    /* JADX INFO: renamed from: p */
    public BulletView f7132p;

    /* JADX INFO: renamed from: q */
    public TouchSwallowView f7133q;

    /* JADX INFO: renamed from: r */
    public FansView f7134r;

    /* JADX INFO: renamed from: s */
    public LiveCampaignView f7135s;

    /* JADX INFO: renamed from: t */
    public TouchSwallowView f7136t;

    /* JADX INFO: renamed from: u */
    public ChatView f7137u;

    /* JADX INFO: renamed from: v */
    public TouchSwallowView f7138v;

    /* JADX INFO: renamed from: w */
    public OfficialShowPlayBillView f7139w;

    /* JADX INFO: renamed from: x */
    public VFrame f7140x;

    /* JADX INFO: renamed from: y */
    public DanmakuViewPort f7141y;

    /* JADX INFO: renamed from: z */
    public LiveGiftLayer f7142z;

    public OfficialShowView(Context context) {
        super(context);
        this.f7116R = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m8994B(View view) {
        this.f7115Q.mo9416Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m8996r() {
        xdl0.E0(this.f7110L, new View.OnClickListener() { // from class: l.o750
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16413a.m8998z(view);
            }
        });
        xdl0.E0(this.f7114P, new View.OnClickListener() { // from class: l.p750
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17032a.m8994B(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m8998z(View view) {
        this.f7115Q.mo9416Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m8999C(boolean z) {
        xdl0.M(this.f7111M, z);
        xdl0.M(this.f7125i, z);
        xdl0.M(this.f7140x, z);
        xdl0.M(this.f7100B, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9000C0() {
        return getContext();
    }

    public void destroy() {
        m8999C(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f7116R) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public c<Integer> getGiftWidthObs() {
        return xdl0.K(this.f7102D);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9002u(this);
        m8996r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f7116R = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m9002u(View view) {
        q750.m21033a(this, view);
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m9001i1(p650 p650Var) {
        this.f7115Q = p650Var;
    }

    /* JADX INFO: renamed from: w */
    public void m9004w(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f16428b;
        this.f7133q.setSwallowTarget(liveScrollView);
        this.f7130n.setSwallowTarget(liveScrollView);
        this.f7136t.setSwallowTarget(liveScrollView);
        this.f7138v.setSwallowTarget(liveScrollView);
    }

    public OfficialShowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7116R = false;
    }

    public OfficialShowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7116R = false;
    }
}
