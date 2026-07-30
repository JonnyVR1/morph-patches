package com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p153l.bf10;
import p153l.bnl0;
import p153l.dmd0;
import p153l.qa00;
import p153l.rdh0;
import p153l.wft;
import p153l.x20;
import p153l.xau;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class RoomTopEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RoomTopEffectView f50848a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50849b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$a */
    public class C12983a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f50850a;

        public C12983a(x20 x20Var) {
            this.f50850a = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(RoomTopEffectView.this.f50848a, false);
            x20 x20Var = this.f50850a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(RoomTopEffectView.this.f50848a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$b */
    public class C12984b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f50852a;

        public C12984b(x20 x20Var) {
            this.f50852a = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(RoomTopEffectView.this.f50848a, false);
            x20 x20Var = this.f50852a;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            bnl0.m105524M(RoomTopEffectView.this.f50848a, true);
        }
    }

    public RoomTopEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m75249a(View view) {
        dmd0.m116944a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m75250b(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, String str, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (NullChecker.m82486a(staticLayout)) {
            sVGADynamicEntity.setDynamicText(staticLayout, "text01");
        } else {
            sVGADynamicEntity.setDynamicText(str, textPaint, "text01");
        }
        sVGADynamicEntity.setDynamicText(str2, textPaint2, "text02");
        if (textPaint3 != null) {
            String tag = roomTopEffect.getTag();
            if (!wft.m206159b(2) && zrv.f205799a.m207638I()) {
                tag = roomTopEffect.getGrade() > 38 ? xau.m209910t(R$string.f47990b6) : xau.m209910t(R$string.f47968a6);
            }
            sVGADynamicEntity.setDynamicText(tag, textPaint3, "text03");
        }
        sVGADynamicEntity.setDynamicImage(roomTopEffect.getUserImageUrl(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m75251c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m75252d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final float m75253e(float f, float f2, float f3) {
        if (wft.m206159b(2)) {
            return f;
        }
        if (qa00.m175858c().widthPixels <= 720) {
            return f * f2;
        }
        return !xau.m209896A() ? f * f3 : f;
    }

    /* JADX INFO: renamed from: f */
    public final StaticLayout m75254f(TextPaint textPaint, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public boolean m75255g() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: h */
    public void m75256h(Act act, LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, x20 x20Var) {
        TextPaint textPaintM75251c;
        TextPaint textPaintM75251c2;
        StaticLayout staticLayoutM75254f;
        String str;
        String str2;
        TextPaint textPaintM75251c3;
        TextPaint textPaintM75252d;
        String strM209910t;
        StaticLayout staticLayoutM75254f2;
        long grade = roomTopEffect.getGrade();
        String strM103845w = bf10.m103845w(roomTopEffect.getUserName(), 4);
        if (roomTopEffect.getSuperGrade() == 0) {
            textPaintM75251c2 = null;
            if (grade < 20) {
                textPaintM75251c3 = m75251c(m75253e(qa00.m175859d(11.0f), 1.7f, 1.0f), false, "#CCFFFFFF");
                TextPaint textPaintM75251c4 = m75251c(m75253e(qa00.m175859d(13.0f), 1.8f, 1.0f), true, "#FFFFFFFF");
                strM209910t = xau.m209910t(R$string.f47904X5);
                textPaintM75251c = textPaintM75251c4;
                staticLayoutM75254f = null;
            } else {
                if (grade < 30) {
                    textPaintM75252d = m75252d(m75253e(qa00.m175859d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM75251c = m75251c(m75253e(qa00.m175859d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strM209910t = String.format(xau.m209910t(R$string.f47925Y5), strM103845w);
                    staticLayoutM75254f2 = m75254f(textPaintM75252d, strM209910t, strM103845w, "#CCFFD73E");
                } else {
                    textPaintM75252d = m75252d(m75253e(qa00.m175859d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM75251c = m75251c(m75253e(qa00.m175859d(15.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strM209910t = String.format(xau.m209910t(R$string.f47925Y5), strM103845w);
                    staticLayoutM75254f2 = m75254f(textPaintM75252d, strM209910t, strM103845w, "#CCFFD73E");
                }
                TextPaint textPaint = textPaintM75252d;
                staticLayoutM75254f = staticLayoutM75254f2;
                textPaintM75251c3 = textPaint;
            }
            str2 = strM209910t;
            str = String.format("Lv.%s", Long.valueOf(grade));
        } else {
            TextPaint textPaintM75252d2 = m75252d(m75253e(qa00.m175859d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
            textPaintM75251c = m75251c(m75253e(qa00.m175859d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
            textPaintM75251c2 = m75251c(m75253e(qa00.m175859d(14.0f), 1.25f, 0.75f), true, "#FFD73E");
            String str3 = String.format(xau.m209910t(R$string.f47946Z5), strM103845w);
            staticLayoutM75254f = m75254f(textPaintM75252d2, str3, strM103845w, "#CCFFD73E");
            str = String.format(xau.m209910t(R$string.f48012c6), Long.valueOf(roomTopEffect.getSuperGrade()));
            str2 = str3;
            textPaintM75251c3 = textPaintM75252d2;
        }
        SVGALoader.with(act).from(roomTopEffect.getSvgUrl()).autoPlay(true).dynamic(m75250b(roomTopEffect, str2, textPaintM75251c3, staticLayoutM75254f, textPaintM75251c, str, textPaintM75251c2)).animListener(new C12983a(x20Var)).repeatCount(1).into(this.f50849b);
    }

    /* JADX INFO: renamed from: i */
    public void m75257i(Act act, rdh0 rdh0Var, x20 x20Var) {
        SVGALoader.with(act).from(rdh0Var.f162309a).autoPlay(true).dynamic(rdh0Var.f162310b).animListener(new C12984b(x20Var)).repeatCount(1).into(this.f50849b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75249a(this);
    }

    public RoomTopEffectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoomTopEffectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RoomTopEffectView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
