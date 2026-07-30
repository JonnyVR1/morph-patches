package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p149l.awi0;
import p149l.d30;
import p149l.h1c0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TopLeaderBoardEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopLeaderBoardEffectView f50021a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50022b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView$a */
    public class C12824a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f50023a;

        public C12824a(d30 d30Var) {
            this.f50023a = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(TopLeaderBoardEffectView.this.f50021a, false);
            d30 d30Var = this.f50023a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(TopLeaderBoardEffectView.this.f50021a, true);
        }
    }

    public TopLeaderBoardEffectView(Context context) {
        super(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m74097a(View view) {
        awi0.m99289a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m74098b(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, TextPaint textPaint, TextPaint textPaint2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getTitle(), textPaint, "text01");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getUserName(), textPaint2, "text02");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getContent(), textPaint3, "text03");
        sVGADynamicEntity.setDynamicImage(leaderboardEffectInfo.getUserPic(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m74099c(float f, boolean z, String str, boolean z2) {
        TextPaint textPaint = new TextPaint();
        if (z2) {
            textPaint.setShadowLayer(12.0f, 0.0f, 0.0f, kvc0.m147352a(h1c0.f105389n1));
        }
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public boolean m74100d() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public void m74101e(Act act, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, d30 d30Var) {
        TextPaint textPaintM74099c;
        TextPaint textPaintM74099c2;
        if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.week) {
            textPaintM74099c = m74099c(t100.m186890d(14.0f), true, "#ffe9b7", false);
            textPaintM74099c2 = m74099c(t100.m186890d(11.0f), false, "#db8cfe", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.second) {
            textPaintM74099c = m74099c(t100.m186890d(14.0f), true, "#ffefc9", false);
            textPaintM74099c2 = m74099c(t100.m186890d(11.0f), false, "#8e6eec", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.love) {
            textPaintM74099c = m74099c(t100.m186890d(14.0f), true, "#fcf0cd", false);
            textPaintM74099c2 = m74099c(t100.m186890d(11.0f), false, "#9c7845", false);
        } else {
            textPaintM74099c = null;
            textPaintM74099c2 = null;
        }
        SVGALoader.with(act).from(leaderboardEffectInfo.getSvgUrl()).autoPlay(true).dynamic(m74098b(leaderboardEffectInfo, textPaintM74099c, m74099c(t100.m186890d(13.0f), true, "#ffffff", true), textPaintM74099c2)).animListener(new C12824a(d30Var)).repeatCount(1).into(this.f50022b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74097a(this);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
