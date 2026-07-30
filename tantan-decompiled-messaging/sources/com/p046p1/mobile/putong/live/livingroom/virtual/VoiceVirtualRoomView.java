package com.p046p1.mobile.putong.live.livingroom.virtual;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p046p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import com.p046p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import com.p046p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p046p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.p046p1.mobile.putong.live.livingroom.virtual.preview.VirtualNewPreviewView;
import com.p046p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p046p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p046p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.g5c0;
import p149l.h4t;
import p149l.o8d0;
import p149l.qbp0;
import p149l.s7m;
import p149l.xdl0;
import p149l.yap0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualRoomView extends ConstraintLayout implements s7m<h4t> {

    /* JADX INFO: renamed from: A */
    public View f52123A;

    /* JADX INFO: renamed from: B */
    public TouchSwallowView f52124B;

    /* JADX INFO: renamed from: C */
    public ChatListView f52125C;

    /* JADX INFO: renamed from: D */
    public VoiceUserNotificationView f52126D;

    /* JADX INFO: renamed from: E */
    public View f52127E;

    /* JADX INFO: renamed from: E0 */
    public VoiceFlyMicContainer f52128E0;

    /* JADX INFO: renamed from: F */
    public TouchSwallowView f52129F;

    /* JADX INFO: renamed from: F0 */
    public View f52130F0;

    /* JADX INFO: renamed from: G */
    public VirtualChatInputTipsView f52131G;

    /* JADX INFO: renamed from: H */
    public TouchSwallowView f52132H;

    /* JADX INFO: renamed from: I */
    public LiveGiftTrays f52133I;

    /* JADX INFO: renamed from: J */
    public ViewStub f52134J;

    /* JADX INFO: renamed from: K */
    public TouchSwallowView f52135K;

    /* JADX INFO: renamed from: L */
    public VoiceBottomView f52136L;

    /* JADX INFO: renamed from: M */
    public VoiceChatBottomView f52137M;

    /* JADX INFO: renamed from: N */
    public BottomMenuView f52138N;

    /* JADX INFO: renamed from: O */
    public ViewStub f52139O;

    /* JADX INFO: renamed from: P */
    public LiveEnterRoomView f52140P;

    /* JADX INFO: renamed from: Q */
    public LiveEnterRoomView f52141Q;

    /* JADX INFO: renamed from: R */
    public VoiceVirtualSettleSuccessView f52142R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f52143S;

    /* JADX INFO: renamed from: T */
    public qbp0 f52144T;

    /* JADX INFO: renamed from: U */
    public VirtualNewPreviewView f52145U;

    /* JADX INFO: renamed from: V */
    public boolean f52146V;

    /* JADX INFO: renamed from: W */
    public VoiceLiveBubbleView f52147W;

    /* JADX INFO: renamed from: d */
    public VoiceVirtualRoomView f52148d;

    /* JADX INFO: renamed from: e */
    public VirtualBgView f52149e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f52150f;

    /* JADX INFO: renamed from: g */
    public VirtualVoiceCloseView f52151g;

    /* JADX INFO: renamed from: h */
    public TouchSwallowView f52152h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f52153i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualRoomInfoTopBarView f52154j;

    /* JADX INFO: renamed from: k */
    public VirtualLeadBoardEntranceView f52155k;

    /* JADX INFO: renamed from: k0 */
    public LiveGiftLayer f52156k0;

    /* JADX INFO: renamed from: l */
    public BulletView f52157l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f52158m;

    /* JADX INFO: renamed from: n */
    public VoiceRedPacketView f52159n;

    /* JADX INFO: renamed from: o */
    public VoiceRedPacketView f52160o;

    /* JADX INFO: renamed from: p */
    public VFrame f52161p;

    /* JADX INFO: renamed from: p0 */
    public TopEffectLayer f52162p0;

    /* JADX INFO: renamed from: q */
    public VImage f52163q;

    /* JADX INFO: renamed from: r */
    public VText f52164r;

    /* JADX INFO: renamed from: s */
    public VText f52165s;

    /* JADX INFO: renamed from: t */
    public VLinear f52166t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f52167u;

    /* JADX INFO: renamed from: v */
    public VText f52168v;

    /* JADX INFO: renamed from: w */
    public VText f52169w;

    /* JADX INFO: renamed from: x */
    public VoiceVirtualFansView f52170x;

    /* JADX INFO: renamed from: y */
    public LiveCampaignView f52171y;

    /* JADX INFO: renamed from: z */
    public LiveVirtualCallListBottomView f52172z;

    public VoiceVirtualRoomView(Context context) {
        super(context);
        this.f52146V = false;
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f52146V) {
            return false;
        }
        if (this.f52144T.m173838d(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22306c<Integer> getGiftWidthObs() {
        return xdl0.m208340K(this.f52136L);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76718h0(View view) {
        yap0.m213868a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h4t h4tVar) {
        this.f52144T = new qbp0(h4tVar);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m76720j0(o8d0 o8d0Var) {
        LiveScrollView liveScrollView = o8d0Var.f142612b;
        this.f52135K.setSwallowTarget(liveScrollView);
        this.f52152h.setSwallowTarget(liveScrollView);
        this.f52129F.setSwallowTarget(liveScrollView);
        this.f52150f.setSwallowTarget(liveScrollView);
    }

    /* JADX INFO: renamed from: k0 */
    public void m76721k0() {
        View viewInflate = this.f52139O.inflate();
        this.f52147W = (VoiceLiveBubbleView) viewInflate.findViewById(g5c0.f101067u3);
        this.f52130F0 = viewInflate.findViewById(g5c0.f100761N5);
        View viewInflate2 = this.f52134J.inflate();
        this.f52156k0 = (LiveGiftLayer) viewInflate2.findViewById(g5c0.f100945h2);
        xdl0.m208344M(viewInflate2, true);
        this.f52162p0 = (TopEffectLayer) viewInflate2.findViewById(g5c0.f100852X6);
        this.f52128E0 = (VoiceFlyMicContainer) viewInflate2.findViewById(g5c0.f100739L1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76718h0(this);
        bringChildToFront(this.f52154j);
        this.f52145U = (VirtualNewPreviewView) this.f52148d.findViewById(g5c0.f100706H4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f52144T.m173839e(motionEvent);
        return true;
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f52146V = z;
    }

    public VoiceVirtualRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52146V = false;
    }

    public VoiceVirtualRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52146V = false;
    }
}
