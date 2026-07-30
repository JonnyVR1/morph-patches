package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import p153l.bnl0;
import p153l.iam;
import p153l.ivf0;
import p153l.q4j0;
import p153l.r4j0;
import p153l.rdh0;
import p153l.x20;
import p153l.z3j0;

/* JADX INFO: loaded from: classes4.dex */
public class TopEffectLayer extends ConstraintLayout implements iam<q4j0> {

    /* JADX INFO: renamed from: d */
    public TopEffectLayer f50854d;

    /* JADX INFO: renamed from: e */
    public UserUpgradeView f50855e;

    /* JADX INFO: renamed from: f */
    public IdolUserUpgradeView f50856f;

    /* JADX INFO: renamed from: g */
    public HourTopBroadcastView f50857g;

    /* JADX INFO: renamed from: h */
    public VoiceLiveHourTopBroadcastView f50858h;

    /* JADX INFO: renamed from: i */
    public TopSVGAEffectView f50859i;

    /* JADX INFO: renamed from: j */
    public TopLeaderBoardEffectView f50860j;

    /* JADX INFO: renamed from: k */
    public LiveIntlStarLeaderBoardEffectView f50861k;

    /* JADX INFO: renamed from: l */
    public VoiceSpecialAuctionEffectView f50862l;

    /* JADX INFO: renamed from: m */
    public RoomTopEffectView f50863m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f50864n;

    /* JADX INFO: renamed from: o */
    public q4j0 f50865o;

    /* JADX INFO: renamed from: p */
    public FrameLayout.LayoutParams f50866p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$a */
    public class C12985a extends AnimListener {
        public C12985a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f50859i.f50874b.setLayoutParams(topEffectLayer.f50866p);
            bnl0.m105524M(TopEffectLayer.this.f50854d, false);
            bnl0.m105524M(TopEffectLayer.this.f50859i.f50873a, false);
            bnl0.m105524M(TopEffectLayer.this.f50859i.f50874b, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(TopEffectLayer.this.f50854d, true);
            bnl0.m105524M(TopEffectLayer.this.f50859i.f50873a, true);
            bnl0.m105524M(TopEffectLayer.this.f50859i.f50874b, true);
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f50866p = (FrameLayout.LayoutParams) topEffectLayer.f50859i.f50874b.getLayoutParams();
            TopEffectLayer.this.f50859i.f50874b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$b */
    public class C12986b extends AnimListener {
        public C12986b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(TopEffectLayer.this.f50864n, false);
            TopEffectLayer.this.f50865o.m175248m4();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(TopEffectLayer.this.f50864n, true);
        }
    }

    public TopEffectLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: B0 */
    public void m75259B0(BLiveUserUpgrade bLiveUserUpgrade, x20 x20Var) {
        if (bLiveUserUpgrade.superGrade > 0) {
            this.f50856f.m75226i(bLiveUserUpgrade, x20Var);
        } else {
            this.f50855e.m75300i(bLiveUserUpgrade, x20Var);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m75260D0(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, x20 x20Var) {
        this.f50858h.m75309h(voiceLiveHourLeaderboardTopEffectMessage, x20Var);
    }

    /* JADX INFO: renamed from: E0 */
    public void m75261E0(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        this.f50857g.m75216n(this.f50865o, voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: G0 */
    public void m75262G0(String str, String str2, String str3, x20 x20Var) {
        this.f50857g.m75217o(str, str2, str3, x20Var);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f50855e.m75295d();
        this.f50856f.m75222e();
        this.f50857g.m75207e();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75263i0(View view) {
        r4j0.m179769a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q4j0 q4j0Var) {
        this.f50865o = q4j0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m75265k0() {
        return this.f50857g.m75210h() || this.f50860j.m75283d() || this.f50861k.m75239l();
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m75266l0() {
        return this.f50864n.isAnimating();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m75267m0() {
        return this.f50863m.m75255g();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m75268n0() {
        return this.f50855e.m75296e();
    }

    /* JADX INFO: renamed from: o0 */
    public void m75269o0(rdh0 rdh0Var) {
        SVGALoader.with(this.f50865o.act()).from(rdh0Var.f162309a).autoPlay(true).isCacheable(false).dynamic(rdh0Var.f162310b).animListener(new C12986b()).repeatCount(1).into(this.f50864n);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75263i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m75270p0(LongLinkGiftMessage.LiveRanking liveRanking, x20 x20Var) {
        this.f50857g.m75214l(liveRanking, x20Var);
    }

    /* JADX INFO: renamed from: q0 */
    public void m75271q0(z3j0 z3j0Var, x20 x20Var) {
        this.f50861k.m75248u(this.f50865o.act(), z3j0Var, x20Var);
    }

    /* JADX INFO: renamed from: r0 */
    public void m75272r0(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, x20 x20Var) {
        this.f50860j.m75284e(this.f50865o.act(), leaderboardEffectInfo, x20Var);
    }

    /* JADX INFO: renamed from: s0 */
    public void m75273s0(rdh0 rdh0Var, x20 x20Var) {
        this.f50863m.m75257i(this.f50865o.act(), rdh0Var, x20Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m75274t0(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, x20 x20Var) {
        this.f50863m.m75256h(this.f50865o.act(), roomTopEffect, x20Var);
    }

    /* JADX INFO: renamed from: u0 */
    public void m75275u0(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        this.f50859i.m75290f(giftWallGradeFiveNotice, this.f50865o);
    }

    /* JADX INFO: renamed from: v0 */
    public void m75276v0(String str) {
        this.f50859i.m75291g(str);
    }

    /* JADX INFO: renamed from: w0 */
    public void m75277w0(ivf0 ivf0Var) {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.f50862l, true);
        this.f50862l.m75323u0(ivf0Var);
    }

    /* JADX INFO: renamed from: y0 */
    public void m75278y0(LongLinkSocketMessage.TopEffect topEffect, x20 x20Var) {
        this.f50857g.m75215m(topEffect, x20Var);
    }

    /* JADX INFO: renamed from: z0 */
    public void m75279z0(rdh0 rdh0Var) {
        SVGALoader.with(this.f50865o.act()).from(rdh0Var.f162309a).autoPlay(true).dynamic(rdh0Var.f162310b).animListener(new C12985a()).repeatCount(1).into(this.f50859i.f50874b);
    }
}
