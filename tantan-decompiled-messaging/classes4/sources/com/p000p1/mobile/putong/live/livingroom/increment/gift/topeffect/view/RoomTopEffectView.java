package com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.j5h0;
import l.r610;
import l.t100;
import l.vdt;
import l.w8u;
import l.xdl0;
import l.ypv;
import p002l.bed0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomTopEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RoomTopEffectView f6042a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f6043b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$a */
    public class C0409a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f6044a;

        public C0409a(d30 d30Var) {
            this.f6044a = d30Var;
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(RoomTopEffectView.this.f6042a, false);
            d30 d30Var = this.f6044a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        public void onStart() {
            super.onStart();
            xdl0.M(RoomTopEffectView.this.f6042a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$b */
    public class C0410b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f6046a;

        public C0410b(d30 d30Var) {
            this.f6046a = d30Var;
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(RoomTopEffectView.this.f6042a, false);
            d30 d30Var = this.f6046a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        public void onStart() {
            super.onStart();
            xdl0.M(RoomTopEffectView.this.f6042a, true);
        }
    }

    public RoomTopEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7627a(View view) {
        bed0.m10321a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m7628b(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, String str, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (NullChecker.a(staticLayout)) {
            sVGADynamicEntity.setDynamicText(staticLayout, "text01");
        } else {
            sVGADynamicEntity.setDynamicText(str, textPaint, "text01");
        }
        sVGADynamicEntity.setDynamicText(str2, textPaint2, "text02");
        if (textPaint3 != null) {
            String tag = roomTopEffect.getTag();
            if (!vdt.b(2) && ypv.a.I()) {
                tag = roomTopEffect.getGrade() > 38 ? w8u.t(R$string.f3184b6) : w8u.t(R$string.f3162a6);
            }
            sVGADynamicEntity.setDynamicText(tag, textPaint3, "text03");
        }
        sVGADynamicEntity.setDynamicImage(roomTopEffect.getUserImageUrl(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m7629c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m7630d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final float m7631e(float f, float f2, float f3) {
        if (vdt.b(2)) {
            return f;
        }
        if (t100.c().widthPixels <= 720) {
            return f * f2;
        }
        return !w8u.A() ? f * f3 : f;
    }

    /* JADX INFO: renamed from: f */
    public final StaticLayout m7632f(TextPaint textPaint, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public boolean m7633g() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: h */
    public void m7634h(Act act, LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, d30 d30Var) {
        TextPaint textPaintM7629c;
        TextPaint textPaintM7629c2;
        StaticLayout staticLayoutM7632f;
        String str;
        String str2;
        TextPaint textPaintM7629c3;
        TextPaint textPaintM7630d;
        String strT;
        StaticLayout staticLayoutM7632f2;
        long grade = roomTopEffect.getGrade();
        String strW = r610.w(roomTopEffect.getUserName(), 4);
        if (roomTopEffect.getSuperGrade() == 0) {
            textPaintM7629c2 = null;
            if (grade < 20) {
                textPaintM7629c3 = m7629c(m7631e(t100.d(11.0f), 1.7f, 1.0f), false, "#CCFFFFFF");
                TextPaint textPaintM7629c4 = m7629c(m7631e(t100.d(13.0f), 1.8f, 1.0f), true, "#FFFFFFFF");
                strT = w8u.t(R$string.f3098X5);
                textPaintM7629c = textPaintM7629c4;
                staticLayoutM7632f = null;
            } else {
                if (grade < 30) {
                    textPaintM7630d = m7630d(m7631e(t100.d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM7629c = m7629c(m7631e(t100.d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strT = String.format(w8u.t(R$string.f3119Y5), strW);
                    staticLayoutM7632f2 = m7632f(textPaintM7630d, strT, strW, "#CCFFD73E");
                } else {
                    textPaintM7630d = m7630d(m7631e(t100.d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM7629c = m7629c(m7631e(t100.d(15.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strT = String.format(w8u.t(R$string.f3119Y5), strW);
                    staticLayoutM7632f2 = m7632f(textPaintM7630d, strT, strW, "#CCFFD73E");
                }
                TextPaint textPaint = textPaintM7630d;
                staticLayoutM7632f = staticLayoutM7632f2;
                textPaintM7629c3 = textPaint;
            }
            str2 = strT;
            str = String.format("Lv.%s", Long.valueOf(grade));
        } else {
            TextPaint textPaintM7630d2 = m7630d(m7631e(t100.d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
            textPaintM7629c = m7629c(m7631e(t100.d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
            textPaintM7629c2 = m7629c(m7631e(t100.d(14.0f), 1.25f, 0.75f), true, "#FFD73E");
            String str3 = String.format(w8u.t(R$string.f3140Z5), strW);
            staticLayoutM7632f = m7632f(textPaintM7630d2, str3, strW, "#CCFFD73E");
            str = String.format(w8u.t(R$string.f3206c6), Long.valueOf(roomTopEffect.getSuperGrade()));
            str2 = str3;
            textPaintM7629c3 = textPaintM7630d2;
        }
        SVGALoader.with(act).from(roomTopEffect.getSvgUrl()).autoPlay(true).dynamic(m7628b(roomTopEffect, str2, textPaintM7629c3, staticLayoutM7632f, textPaintM7629c, str, textPaintM7629c2)).animListener(new C0409a(d30Var)).repeatCount(1).into(this.f6043b);
    }

    /* JADX INFO: renamed from: i */
    public void m7635i(Act act, j5h0 j5h0Var, d30 d30Var) {
        SVGALoader.with(act).from(j5h0Var.a).autoPlay(true).dynamic(j5h0Var.b).animListener(new C0410b(d30Var)).repeatCount(1).into(this.f6043b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7627a(this);
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
