package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import p149l.d30;
import p149l.j5h0;
import p149l.mvi0;
import p149l.nvi0;
import p149l.s7m;
import p149l.vui0;
import p149l.xdl0;
import p149l.zmf0;

/* JADX INFO: loaded from: classes4.dex */
public class TopEffectLayer extends ConstraintLayout implements s7m<mvi0> {

    /* JADX INFO: renamed from: d */
    public TopEffectLayer f50006d;

    /* JADX INFO: renamed from: e */
    public UserUpgradeView f50007e;

    /* JADX INFO: renamed from: f */
    public IdolUserUpgradeView f50008f;

    /* JADX INFO: renamed from: g */
    public HourTopBroadcastView f50009g;

    /* JADX INFO: renamed from: h */
    public VoiceLiveHourTopBroadcastView f50010h;

    /* JADX INFO: renamed from: i */
    public TopSVGAEffectView f50011i;

    /* JADX INFO: renamed from: j */
    public TopLeaderBoardEffectView f50012j;

    /* JADX INFO: renamed from: k */
    public LiveIntlStarLeaderBoardEffectView f50013k;

    /* JADX INFO: renamed from: l */
    public VoiceSpecialAuctionEffectView f50014l;

    /* JADX INFO: renamed from: m */
    public RoomTopEffectView f50015m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f50016n;

    /* JADX INFO: renamed from: o */
    public mvi0 f50017o;

    /* JADX INFO: renamed from: p */
    public FrameLayout.LayoutParams f50018p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$a */
    public class C12822a extends AnimListener {
        public C12822a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f50011i.f50026b.setLayoutParams(topEffectLayer.f50018p);
            xdl0.m208344M(TopEffectLayer.this.f50006d, false);
            xdl0.m208344M(TopEffectLayer.this.f50011i.f50025a, false);
            xdl0.m208344M(TopEffectLayer.this.f50011i.f50026b, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(TopEffectLayer.this.f50006d, true);
            xdl0.m208344M(TopEffectLayer.this.f50011i.f50025a, true);
            xdl0.m208344M(TopEffectLayer.this.f50011i.f50026b, true);
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f50018p = (FrameLayout.LayoutParams) topEffectLayer.f50011i.f50026b.getLayoutParams();
            TopEffectLayer.this.f50011i.f50026b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$b */
    public class C12823b extends AnimListener {
        public C12823b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(TopEffectLayer.this.f50016n, false);
            TopEffectLayer.this.f50017o.m156514m4();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(TopEffectLayer.this.f50016n, true);
        }
    }

    public TopEffectLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: B0 */
    public void m74076B0(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        if (bLiveUserUpgrade.superGrade > 0) {
            this.f50008f.m74043i(bLiveUserUpgrade, d30Var);
        } else {
            this.f50007e.m74117i(bLiveUserUpgrade, d30Var);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m74077D0(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, d30 d30Var) {
        this.f50010h.m74126h(voiceLiveHourLeaderboardTopEffectMessage, d30Var);
    }

    /* JADX INFO: renamed from: E0 */
    public void m74078E0(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        this.f50009g.m74033n(this.f50017o, voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: G0 */
    public void m74079G0(String str, String str2, String str3, d30 d30Var) {
        this.f50009g.m74034o(str, str2, str3, d30Var);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f50007e.m74112d();
        this.f50008f.m74039e();
        this.f50009g.m74024e();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74080i0(View view) {
        nvi0.m161692a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mvi0 mvi0Var) {
        this.f50017o = mvi0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m74082k0() {
        return this.f50009g.m74027h() || this.f50012j.m74100d() || this.f50013k.m74056l();
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m74083l0() {
        return this.f50016n.isAnimating();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m74084m0() {
        return this.f50015m.m74072g();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m74085n0() {
        return this.f50007e.m74113e();
    }

    /* JADX INFO: renamed from: o0 */
    public void m74086o0(j5h0 j5h0Var) {
        SVGALoader.with(this.f50017o.act()).from(j5h0Var.f116318a).autoPlay(true).isCacheable(false).dynamic(j5h0Var.f116319b).animListener(new C12823b()).repeatCount(1).into(this.f50016n);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74080i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m74087p0(LongLinkGiftMessage.LiveRanking liveRanking, d30 d30Var) {
        this.f50009g.m74031l(liveRanking, d30Var);
    }

    /* JADX INFO: renamed from: q0 */
    public void m74088q0(vui0 vui0Var, d30 d30Var) {
        this.f50013k.m74065u(this.f50017o.act(), vui0Var, d30Var);
    }

    /* JADX INFO: renamed from: r0 */
    public void m74089r0(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, d30 d30Var) {
        this.f50012j.m74101e(this.f50017o.act(), leaderboardEffectInfo, d30Var);
    }

    /* JADX INFO: renamed from: s0 */
    public void m74090s0(j5h0 j5h0Var, d30 d30Var) {
        this.f50015m.m74074i(this.f50017o.act(), j5h0Var, d30Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m74091t0(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, d30 d30Var) {
        this.f50015m.m74073h(this.f50017o.act(), roomTopEffect, d30Var);
    }

    /* JADX INFO: renamed from: u0 */
    public void m74092u0(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        this.f50011i.m74107f(giftWallGradeFiveNotice, this.f50017o);
    }

    /* JADX INFO: renamed from: v0 */
    public void m74093v0(String str) {
        this.f50011i.m74108g(str);
    }

    /* JADX INFO: renamed from: w0 */
    public void m74094w0(zmf0 zmf0Var) {
        xdl0.m208344M(this, true);
        xdl0.m208344M(this.f50014l, true);
        this.f50014l.m74140u0(zmf0Var);
    }

    /* JADX INFO: renamed from: y0 */
    public void m74095y0(LongLinkSocketMessage.TopEffect topEffect, d30 d30Var) {
        this.f50009g.m74032m(topEffect, d30Var);
    }

    /* JADX INFO: renamed from: z0 */
    public void m74096z0(j5h0 j5h0Var) {
        SVGALoader.with(this.f50017o.act()).from(j5h0Var.f116318a).autoPlay(true).dynamic(j5h0Var.f116319b).animListener(new C12822a()).repeatCount(1).into(this.f50011i.f50026b);
    }
}
