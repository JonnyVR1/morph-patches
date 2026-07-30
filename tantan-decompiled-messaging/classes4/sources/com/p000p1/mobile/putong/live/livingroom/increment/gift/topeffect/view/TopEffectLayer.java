package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import l.d30;
import l.j5h0;
import l.s7m;
import l.xdl0;
import l.zmf0;
import p002l.mvi0;
import p002l.nvi0;
import p002l.vui0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TopEffectLayer extends ConstraintLayout implements s7m<mvi0> {

    /* JADX INFO: renamed from: d */
    public TopEffectLayer f6048d;

    /* JADX INFO: renamed from: e */
    public UserUpgradeView f6049e;

    /* JADX INFO: renamed from: f */
    public IdolUserUpgradeView f6050f;

    /* JADX INFO: renamed from: g */
    public HourTopBroadcastView f6051g;

    /* JADX INFO: renamed from: h */
    public VoiceLiveHourTopBroadcastView f6052h;

    /* JADX INFO: renamed from: i */
    public TopSVGAEffectView f6053i;

    /* JADX INFO: renamed from: j */
    public TopLeaderBoardEffectView f6054j;

    /* JADX INFO: renamed from: k */
    public LiveIntlStarLeaderBoardEffectView f6055k;

    /* JADX INFO: renamed from: l */
    public VoiceSpecialAuctionEffectView f6056l;

    /* JADX INFO: renamed from: m */
    public RoomTopEffectView f6057m;

    /* JADX INFO: renamed from: n */
    public AnimEffectPlayer f6058n;

    /* JADX INFO: renamed from: o */
    public mvi0 f6059o;

    /* JADX INFO: renamed from: p */
    public FrameLayout.LayoutParams f6060p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$a */
    public class C0411a extends AnimListener {
        public C0411a() {
        }

        public void onFinished() {
            super.onFinished();
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f6053i.f6068b.setLayoutParams(topEffectLayer.f6060p);
            xdl0.M(TopEffectLayer.this.f6048d, false);
            xdl0.M(TopEffectLayer.this.f6053i.f6067a, false);
            xdl0.M(TopEffectLayer.this.f6053i.f6068b, false);
        }

        public void onStart() {
            super.onStart();
            xdl0.M(TopEffectLayer.this.f6048d, true);
            xdl0.M(TopEffectLayer.this.f6053i.f6067a, true);
            xdl0.M(TopEffectLayer.this.f6053i.f6068b, true);
            TopEffectLayer topEffectLayer = TopEffectLayer.this;
            topEffectLayer.f6060p = (FrameLayout.LayoutParams) topEffectLayer.f6053i.f6068b.getLayoutParams();
            TopEffectLayer.this.f6053i.f6068b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer$b */
    public class C0412b extends AnimListener {
        public C0412b() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(TopEffectLayer.this.f6058n, false);
            TopEffectLayer.this.f6059o.m18238m4();
        }

        public void onStart() {
            super.onStart();
            xdl0.M(TopEffectLayer.this.f6058n, true);
        }
    }

    public TopEffectLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: B0 */
    public void m7637B0(BLiveUserUpgrade bLiveUserUpgrade, d30 d30Var) {
        if (bLiveUserUpgrade.superGrade > 0) {
            this.f6050f.m7604i(bLiveUserUpgrade, d30Var);
        } else {
            this.f6049e.m7682i(bLiveUserUpgrade, d30Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7638C0() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m7639D0(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage, d30 d30Var) {
        this.f6052h.m7691h(voiceLiveHourLeaderboardTopEffectMessage, d30Var);
    }

    /* JADX INFO: renamed from: E0 */
    public void m7640E0(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        this.f6051g.m7594n(this.f6059o, voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: G0 */
    public void m7641G0(String str, String str2, String str3, d30 d30Var) {
        this.f6051g.m7595o(str, str2, str3, d30Var);
    }

    public void destroy() {
        this.f6049e.m7677d();
        this.f6050f.m7600e();
        this.f6051g.m7585e();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7642i0(View view) {
        nvi0.m19104a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void m7643i1(mvi0 mvi0Var) {
        this.f6059o = mvi0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m7645k0() {
        return this.f6051g.m7588h() || this.f6054j.m7663d() || this.f6055k.m7617l();
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m7646l0() {
        return this.f6058n.isAnimating();
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m7647m0() {
        return this.f6057m.m7633g();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean m7648n0() {
        return this.f6049e.m7678e();
    }

    /* JADX INFO: renamed from: o0 */
    public void m7649o0(j5h0 j5h0Var) {
        SVGALoader.with(this.f6059o.act()).from(j5h0Var.a).autoPlay(true).isCacheable(false).dynamic(j5h0Var.b).animListener(new C0412b()).repeatCount(1).into(this.f6058n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7642i0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m7650p0(LongLinkGiftMessage.LiveRanking liveRanking, d30 d30Var) {
        this.f6051g.m7592l(liveRanking, d30Var);
    }

    /* JADX INFO: renamed from: q0 */
    public void m7651q0(vui0 vui0Var, d30 d30Var) {
        this.f6055k.m7626u(this.f6059o.act(), vui0Var, d30Var);
    }

    /* JADX INFO: renamed from: r0 */
    public void m7652r0(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, d30 d30Var) {
        this.f6054j.m7664e(this.f6059o.act(), leaderboardEffectInfo, d30Var);
    }

    /* JADX INFO: renamed from: s0 */
    public void m7653s0(j5h0 j5h0Var, d30 d30Var) {
        this.f6057m.m7635i(this.f6059o.act(), j5h0Var, d30Var);
    }

    /* JADX INFO: renamed from: t0 */
    public void m7654t0(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, d30 d30Var) {
        this.f6057m.m7634h(this.f6059o.act(), roomTopEffect, d30Var);
    }

    /* JADX INFO: renamed from: u0 */
    public void m7655u0(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        this.f6053i.m7670f(giftWallGradeFiveNotice, this.f6059o);
    }

    /* JADX INFO: renamed from: v0 */
    public void m7656v0(String str) {
        this.f6053i.m7671g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public void m7657w0(zmf0 zmf0Var) {
        xdl0.M(this, true);
        xdl0.M(this.f6056l, true);
        this.f6056l.m7705u0(zmf0Var);
    }

    /* JADX INFO: renamed from: y0 */
    public void m7658y0(LongLinkSocketMessage.TopEffect topEffect, d30 d30Var) {
        this.f6051g.m7593m(topEffect, d30Var);
    }

    /* JADX INFO: renamed from: z0 */
    public void m7659z0(j5h0 j5h0Var) {
        SVGALoader.with(this.f6059o.act()).from(j5h0Var.a).autoPlay(true).dynamic(j5h0Var.b).animListener(new C0411a()).repeatCount(1).into(this.f6053i.f6068b);
    }
}
