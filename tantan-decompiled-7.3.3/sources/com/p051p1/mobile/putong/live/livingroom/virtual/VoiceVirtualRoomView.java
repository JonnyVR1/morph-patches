package com.p051p1.mobile.putong.live.livingroom.virtual;

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
import com.p051p1.mobile.putong.live.livingroom.common.chat.list.ChatListView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.notification.voice.VoiceUserNotificationView;
import com.p051p1.mobile.putong.live.livingroom.increment.bullet.BulletView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer.LiveGiftLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveGiftTrays;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.background.VirtualBgView;
import com.p051p1.mobile.putong.live.livingroom.virtual.board.VirtualLeadBoardEntranceView;
import com.p051p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView;
import com.p051p1.mobile.putong.live.livingroom.virtual.fans.VoiceVirtualFansView;
import com.p051p1.mobile.putong.live.livingroom.virtual.preview.VirtualNewPreviewView;
import com.p051p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import com.p051p1.mobile.putong.live.livingroom.virtual.settle.VoiceVirtualSettleSuccessView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceBottomView;
import com.p051p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.flymic.VoiceFlyMicContainer;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.ckp0;
import p153l.i6t;
import p153l.iam;
import p153l.mdc0;
import p153l.rgd0;
import p153l.ukp0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualRoomView extends ConstraintLayout implements iam<i6t> {

    /* JADX INFO: renamed from: A */
    public View f52971A;

    /* JADX INFO: renamed from: B */
    public TouchSwallowView f52972B;

    /* JADX INFO: renamed from: C */
    public ChatListView f52973C;

    /* JADX INFO: renamed from: D */
    public VoiceUserNotificationView f52974D;

    /* JADX INFO: renamed from: E */
    public View f52975E;

    /* JADX INFO: renamed from: E0 */
    public VoiceFlyMicContainer f52976E0;

    /* JADX INFO: renamed from: F */
    public TouchSwallowView f52977F;

    /* JADX INFO: renamed from: F0 */
    public View f52978F0;

    /* JADX INFO: renamed from: G */
    public VirtualChatInputTipsView f52979G;

    /* JADX INFO: renamed from: H */
    public TouchSwallowView f52980H;

    /* JADX INFO: renamed from: I */
    public LiveGiftTrays f52981I;

    /* JADX INFO: renamed from: J */
    public ViewStub f52982J;

    /* JADX INFO: renamed from: K */
    public TouchSwallowView f52983K;

    /* JADX INFO: renamed from: L */
    public VoiceBottomView f52984L;

    /* JADX INFO: renamed from: M */
    public VoiceChatBottomView f52985M;

    /* JADX INFO: renamed from: N */
    public BottomMenuView f52986N;

    /* JADX INFO: renamed from: O */
    public ViewStub f52987O;

    /* JADX INFO: renamed from: P */
    public LiveEnterRoomView f52988P;

    /* JADX INFO: renamed from: Q */
    public LiveEnterRoomView f52989Q;

    /* JADX INFO: renamed from: R */
    public VoiceVirtualSettleSuccessView f52990R;

    /* JADX INFO: renamed from: S */
    public FrameLayout f52991S;

    /* JADX INFO: renamed from: T */
    public ukp0 f52992T;

    /* JADX INFO: renamed from: U */
    public VirtualNewPreviewView f52993U;

    /* JADX INFO: renamed from: V */
    public boolean f52994V;

    /* JADX INFO: renamed from: W */
    public VoiceLiveBubbleView f52995W;

    /* JADX INFO: renamed from: d */
    public VoiceVirtualRoomView f52996d;

    /* JADX INFO: renamed from: e */
    public VirtualBgView f52997e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f52998f;

    /* JADX INFO: renamed from: g */
    public VirtualVoiceCloseView f52999g;

    /* JADX INFO: renamed from: h */
    public TouchSwallowView f53000h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f53001i;

    /* JADX INFO: renamed from: j */
    public VoiceVirtualRoomInfoTopBarView f53002j;

    /* JADX INFO: renamed from: k */
    public VirtualLeadBoardEntranceView f53003k;

    /* JADX INFO: renamed from: k0 */
    public LiveGiftLayer f53004k0;

    /* JADX INFO: renamed from: l */
    public BulletView f53005l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f53006m;

    /* JADX INFO: renamed from: n */
    public VoiceRedPacketView f53007n;

    /* JADX INFO: renamed from: o */
    public VoiceRedPacketView f53008o;

    /* JADX INFO: renamed from: p */
    public VFrame f53009p;

    /* JADX INFO: renamed from: p0 */
    public TopEffectLayer f53010p0;

    /* JADX INFO: renamed from: q */
    public VImage f53011q;

    /* JADX INFO: renamed from: r */
    public VText f53012r;

    /* JADX INFO: renamed from: s */
    public VText f53013s;

    /* JADX INFO: renamed from: t */
    public VLinear f53014t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f53015u;

    /* JADX INFO: renamed from: v */
    public VText f53016v;

    /* JADX INFO: renamed from: w */
    public VText f53017w;

    /* JADX INFO: renamed from: x */
    public VoiceVirtualFansView f53018x;

    /* JADX INFO: renamed from: y */
    public LiveCampaignView f53019y;

    /* JADX INFO: renamed from: z */
    public LiveVirtualCallListBottomView f53020z;

    public VoiceVirtualRoomView(Context context) {
        super(context);
        this.f52994V = false;
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f52994V) {
            return false;
        }
        if (this.f52992T.m196510d(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22421c<Integer> getGiftWidthObs() {
        return bnl0.m105520K(this.f52984L);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77901h0(View view) {
        ckp0.m110380a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i6t i6tVar) {
        this.f52992T = new ukp0(i6tVar);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public void m77903j0(rgd0 rgd0Var) {
        LiveScrollView liveScrollView = rgd0Var.f162994b;
        this.f52983K.setSwallowTarget(liveScrollView);
        this.f53000h.setSwallowTarget(liveScrollView);
        this.f52977F.setSwallowTarget(liveScrollView);
        this.f52998f.setSwallowTarget(liveScrollView);
    }

    /* JADX INFO: renamed from: k0 */
    public void m77904k0() {
        View viewInflate = this.f52987O.inflate();
        this.f52995W = (VoiceLiveBubbleView) viewInflate.findViewById(mdc0.f136312u3);
        this.f52978F0 = viewInflate.findViewById(mdc0.f136006N5);
        View viewInflate2 = this.f52982J.inflate();
        this.f53004k0 = (LiveGiftLayer) viewInflate2.findViewById(mdc0.f136190h2);
        bnl0.m105524M(viewInflate2, true);
        this.f53010p0 = (TopEffectLayer) viewInflate2.findViewById(mdc0.f136097X6);
        this.f52976E0 = (VoiceFlyMicContainer) viewInflate2.findViewById(mdc0.f135984L1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77901h0(this);
        bringChildToFront(this.f53002j);
        this.f52993U = (VirtualNewPreviewView) this.f52996d.findViewById(mdc0.f135951H4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f52992T.m196511e(motionEvent);
        return true;
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f52994V = z;
    }

    public VoiceVirtualRoomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52994V = false;
    }

    public VoiceVirtualRoomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52994V = false;
    }
}
