package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.d30;
import l.kvc0;
import l.t100;
import l.xdl0;
import p002l.awi0;
import p002l.h1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TopLeaderBoardEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopLeaderBoardEffectView f6063a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f6064b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView$a */
    public class C0413a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f6065a;

        public C0413a(d30 d30Var) {
            this.f6065a = d30Var;
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(TopLeaderBoardEffectView.this.f6063a, false);
            d30 d30Var = this.f6065a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        public void onStart() {
            super.onStart();
            xdl0.M(TopLeaderBoardEffectView.this.f6063a, true);
        }
    }

    public TopLeaderBoardEffectView(Context context) {
        super(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m7660a(View view) {
        awi0.m10080a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m7661b(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, TextPaint textPaint, TextPaint textPaint2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getTitle(), textPaint, "text01");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getUserName(), textPaint2, "text02");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getContent(), textPaint3, "text03");
        sVGADynamicEntity.setDynamicImage(leaderboardEffectInfo.getUserPic(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m7662c(float f, boolean z, String str, boolean z2) {
        TextPaint textPaint = new TextPaint();
        if (z2) {
            textPaint.setShadowLayer(12.0f, 0.0f, 0.0f, kvc0.a(h1c0.f11809n1));
        }
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7663d() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public void m7664e(Act act, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, d30 d30Var) {
        TextPaint textPaintM7662c;
        TextPaint textPaintM7662c2;
        if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.week) {
            textPaintM7662c = m7662c(t100.d(14.0f), true, "#ffe9b7", false);
            textPaintM7662c2 = m7662c(t100.d(11.0f), false, "#db8cfe", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.second) {
            textPaintM7662c = m7662c(t100.d(14.0f), true, "#ffefc9", false);
            textPaintM7662c2 = m7662c(t100.d(11.0f), false, "#8e6eec", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.love) {
            textPaintM7662c = m7662c(t100.d(14.0f), true, "#fcf0cd", false);
            textPaintM7662c2 = m7662c(t100.d(11.0f), false, "#9c7845", false);
        } else {
            textPaintM7662c = null;
            textPaintM7662c2 = null;
        }
        SVGALoader.with(act).from(leaderboardEffectInfo.getSvgUrl()).autoPlay(true).dynamic(m7661b(leaderboardEffectInfo, textPaintM7662c, m7662c(t100.d(13.0f), true, "#ffffff", true), textPaintM7662c2)).animListener(new C0413a(d30Var)).repeatCount(1).into(this.f6064b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7660a(this);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
