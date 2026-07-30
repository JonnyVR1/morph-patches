package com.p051p1.mobile.putong.live.livingroom.officialshow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.base.player.LivePlayerView;
import com.p051p1.mobile.putong.live.livingroom.base.room.LiveBgView;
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
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.PreOperationAnimView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.pusher.OfficialShowPusherView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.ef50;
import p153l.fg50;
import p153l.iam;
import p153l.rgd0;

/* JADX INFO: loaded from: classes5.dex */
public class OfficialShowView extends VFrame implements iam<ef50> {

    /* JADX INFO: renamed from: A */
    public TopEffectLayer f51905A;

    /* JADX INFO: renamed from: B */
    public VFrame f51906B;

    /* JADX INFO: renamed from: C */
    public ChatInputEntryView f51907C;

    /* JADX INFO: renamed from: D */
    public BottomView f51908D;

    /* JADX INFO: renamed from: E */
    public LiveBubbleView f51909E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f51910F;

    /* JADX INFO: renamed from: G */
    public LiveGiftTrays f51911G;

    /* JADX INFO: renamed from: H */
    public LiveEnterRoomView f51912H;

    /* JADX INFO: renamed from: I */
    public LiveEnterRoomView f51913I;

    /* JADX INFO: renamed from: J */
    public View f51914J;

    /* JADX INFO: renamed from: K */
    public PreOperationAnimView f51915K;

    /* JADX INFO: renamed from: L */
    public VRelative f51916L;

    /* JADX INFO: renamed from: M */
    public VImage f51917M;

    /* JADX INFO: renamed from: N */
    public GameEffectView f51918N;

    /* JADX INFO: renamed from: O */
    public VFrame f51919O;

    /* JADX INFO: renamed from: P */
    public VRelative f51920P;

    /* JADX INFO: renamed from: Q */
    public ef50 f51921Q;

    /* JADX INFO: renamed from: R */
    public boolean f51922R;

    /* JADX INFO: renamed from: a */
    public OfficialShowView f51923a;

    /* JADX INFO: renamed from: b */
    public LiveBgView f51924b;

    /* JADX INFO: renamed from: c */
    public LivePlayerView f51925c;

    /* JADX INFO: renamed from: d */
    public OfficialShowPusherView f51926d;

    /* JADX INFO: renamed from: e */
    public View f51927e;

    /* JADX INFO: renamed from: f */
    public View f51928f;

    /* JADX INFO: renamed from: g */
    public OfficialShowSwitchView f51929g;

    /* JADX INFO: renamed from: h */
    public VFrame f51930h;

    /* JADX INFO: renamed from: i */
    public VRelative f51931i;

    /* JADX INFO: renamed from: j */
    public JumpToRoomView f51932j;

    /* JADX INFO: renamed from: k */
    public VText f51933k;

    /* JADX INFO: renamed from: l */
    public VFrame f51934l;

    /* JADX INFO: renamed from: m */
    public OfficialShowAvatarView f51935m;

    /* JADX INFO: renamed from: n */
    public TouchSwallowView f51936n;

    /* JADX INFO: renamed from: o */
    public OperationEntryView f51937o;

    /* JADX INFO: renamed from: p */
    public BulletView f51938p;

    /* JADX INFO: renamed from: q */
    public TouchSwallowView f51939q;

    /* JADX INFO: renamed from: r */
    public FansView f51940r;

    /* JADX INFO: renamed from: s */
    public LiveCampaignView f51941s;

    /* JADX INFO: renamed from: t */
    public TouchSwallowView f51942t;

    /* JADX INFO: renamed from: u */
    public ChatView f51943u;

    /* JADX INFO: renamed from: v */
    public TouchSwallowView f51944v;

    /* JADX INFO: renamed from: w */
    public OfficialShowPlayBillView f51945w;

    /* JADX INFO: renamed from: x */
    public VFrame f51946x;

    /* JADX INFO: renamed from: y */
    public DanmakuViewPort f51947y;

    /* JADX INFO: renamed from: z */
    public LiveGiftLayer f51948z;

    public OfficialShowView(Context context) {
        super(context);
        this.f51922R = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m76554B(View view) {
        this.f51921Q.mo120620Z3();
    }

    /* JADX INFO: renamed from: r */
    private void m76556r() {
        bnl0.m105509E0(this.f51916L, new View.OnClickListener() { // from class: l.dg50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88261a.m76558z(view);
            }
        });
        bnl0.m105509E0(this.f51920P, new View.OnClickListener() { // from class: l.eg50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93904a.m76554B(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m76558z(View view) {
        this.f51921Q.mo120620Z3();
    }

    /* JADX INFO: renamed from: C */
    public void m76559C(boolean z) {
        bnl0.m105524M(this.f51917M, z);
        bnl0.m105524M(this.f51931i, z);
        bnl0.m105524M(this.f51946x, z);
        bnl0.m105524M(this.f51906B, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        m76559C(false);
    }

    @Override // p151v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f51922R) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C22421c<Integer> getGiftWidthObs() {
        return bnl0.m105520K(this.f51908D);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76560u(this);
        m76556r();
    }

    public void setSwallowAllTouchEvent(boolean z) {
        this.f51922R = z;
    }

    /* JADX INFO: renamed from: u */
    public final void m76560u(View view) {
        fg50.m125481a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ef50 ef50Var) {
        this.f51921Q = ef50Var;
    }

    /* JADX INFO: renamed from: w */
    public void m76562w(rgd0 rgd0Var) {
        LiveScrollView liveScrollView = rgd0Var.f162994b;
        this.f51939q.setSwallowTarget(liveScrollView);
        this.f51936n.setSwallowTarget(liveScrollView);
        this.f51942t.setSwallowTarget(liveScrollView);
        this.f51944v.setSwallowTarget(liveScrollView);
    }

    public OfficialShowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51922R = false;
    }

    public OfficialShowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51922R = false;
    }
}
