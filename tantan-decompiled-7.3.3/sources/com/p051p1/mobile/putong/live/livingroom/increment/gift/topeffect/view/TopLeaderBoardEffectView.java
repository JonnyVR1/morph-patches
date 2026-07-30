package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p153l.bnl0;
import p153l.e5j0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class TopLeaderBoardEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TopLeaderBoardEffectView f50869a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50870b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopLeaderBoardEffectView$a */
    public class C12987a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f50871a;

        public C12987a(x20 x20Var) {
            this.f50871a = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(TopLeaderBoardEffectView.this.f50869a, false);
            x20 x20Var = this.f50871a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(TopLeaderBoardEffectView.this.f50869a, true);
        }
    }

    public TopLeaderBoardEffectView(Context context) {
        super(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m75280a(View view) {
        e5j0.m119536a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m75281b(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, TextPaint textPaint, TextPaint textPaint2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getTitle(), textPaint, "text01");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getUserName(), textPaint2, "text02");
        sVGADynamicEntity.setDynamicText(leaderboardEffectInfo.getContent(), textPaint3, "text03");
        sVGADynamicEntity.setDynamicImage(leaderboardEffectInfo.getUserPic(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m75282c(float f, boolean z, String str, boolean z2) {
        TextPaint textPaint = new TextPaint();
        if (z2) {
            textPaint.setShadowLayer(12.0f, 0.0f, 0.0f, n3d0.m161277a(n9c0.f140850n1));
        }
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public boolean m75283d() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public void m75284e(Act act, LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo, x20 x20Var) {
        TextPaint textPaintM75282c;
        TextPaint textPaintM75282c2;
        if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.week) {
            textPaintM75282c = m75282c(qa00.m175859d(14.0f), true, "#ffe9b7", false);
            textPaintM75282c2 = m75282c(qa00.m175859d(11.0f), false, "#db8cfe", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.second) {
            textPaintM75282c = m75282c(qa00.m175859d(14.0f), true, "#ffefc9", false);
            textPaintM75282c2 = m75282c(qa00.m175859d(11.0f), false, "#8e6eec", false);
        } else if (leaderboardEffectInfo.getType() == LongLinkLiveLeadBoardMsg.LeaderboardEffectType.love) {
            textPaintM75282c = m75282c(qa00.m175859d(14.0f), true, "#fcf0cd", false);
            textPaintM75282c2 = m75282c(qa00.m175859d(11.0f), false, "#9c7845", false);
        } else {
            textPaintM75282c = null;
            textPaintM75282c2 = null;
        }
        SVGALoader.with(act).from(leaderboardEffectInfo.getSvgUrl()).autoPlay(true).dynamic(m75281b(leaderboardEffectInfo, textPaintM75282c, m75282c(qa00.m175859d(13.0f), true, "#ffffff", true), textPaintM75282c2)).animListener(new C12987a(x20Var)).repeatCount(1).into(this.f50870b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75280a(this);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public TopLeaderBoardEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
