package com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p149l.bed0;
import p149l.d30;
import p149l.j5h0;
import p149l.r610;
import p149l.t100;
import p149l.vdt;
import p149l.w8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class RoomTopEffectView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RoomTopEffectView f50000a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50001b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$a */
    public class C12820a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f50002a;

        public C12820a(d30 d30Var) {
            this.f50002a = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(RoomTopEffectView.this.f50000a, false);
            d30 d30Var = this.f50002a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(RoomTopEffectView.this.f50000a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.RoomTopEffectView$b */
    public class C12821b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f50004a;

        public C12821b(d30 d30Var) {
            this.f50004a = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(RoomTopEffectView.this.f50000a, false);
            d30 d30Var = this.f50004a;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            xdl0.m208344M(RoomTopEffectView.this.f50000a, true);
        }
    }

    public RoomTopEffectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m74066a(View view) {
        bed0.m101353a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m74067b(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, String str, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str2, TextPaint textPaint3) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        if (NullChecker.m81303a(staticLayout)) {
            sVGADynamicEntity.setDynamicText(staticLayout, "text01");
        } else {
            sVGADynamicEntity.setDynamicText(str, textPaint, "text01");
        }
        sVGADynamicEntity.setDynamicText(str2, textPaint2, "text02");
        if (textPaint3 != null) {
            String tag = roomTopEffect.getTag();
            if (!vdt.m198092b(2) && ypv.f199493a.m199316I()) {
                tag = roomTopEffect.getGrade() > 38 ? w8u.m202217t(R$string.f47142b6) : w8u.m202217t(R$string.f47120a6);
            }
            sVGADynamicEntity.setDynamicText(tag, textPaint3, "text03");
        }
        sVGADynamicEntity.setDynamicImage(roomTopEffect.getUserImageUrl(), "head");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m74068c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m74069d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final float m74070e(float f, float f2, float f3) {
        if (vdt.m198092b(2)) {
            return f;
        }
        if (t100.m186889c().widthPixels <= 720) {
            return f * f2;
        }
        return !w8u.m202203A() ? f * f3 : f;
    }

    /* JADX INFO: renamed from: f */
    public final StaticLayout m74071f(TextPaint textPaint, String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: g */
    public boolean m74072g() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: h */
    public void m74073h(Act act, LongLinkLiveUserLevel.RoomTopEffect roomTopEffect, d30 d30Var) {
        TextPaint textPaintM74068c;
        TextPaint textPaintM74068c2;
        StaticLayout staticLayoutM74071f;
        String str;
        String str2;
        TextPaint textPaintM74068c3;
        TextPaint textPaintM74069d;
        String strM202217t;
        StaticLayout staticLayoutM74071f2;
        long grade = roomTopEffect.getGrade();
        String strM178016w = r610.m178016w(roomTopEffect.getUserName(), 4);
        if (roomTopEffect.getSuperGrade() == 0) {
            textPaintM74068c2 = null;
            if (grade < 20) {
                textPaintM74068c3 = m74068c(m74070e(t100.m186890d(11.0f), 1.7f, 1.0f), false, "#CCFFFFFF");
                TextPaint textPaintM74068c4 = m74068c(m74070e(t100.m186890d(13.0f), 1.8f, 1.0f), true, "#FFFFFFFF");
                strM202217t = w8u.m202217t(R$string.f47056X5);
                textPaintM74068c = textPaintM74068c4;
                staticLayoutM74071f = null;
            } else {
                if (grade < 30) {
                    textPaintM74069d = m74069d(m74070e(t100.m186890d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM74068c = m74068c(m74070e(t100.m186890d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strM202217t = String.format(w8u.m202217t(R$string.f47077Y5), strM178016w);
                    staticLayoutM74071f2 = m74071f(textPaintM74069d, strM202217t, strM178016w, "#CCFFD73E");
                } else {
                    textPaintM74069d = m74069d(m74070e(t100.m186890d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
                    textPaintM74068c = m74068c(m74070e(t100.m186890d(15.0f), 1.8f, 1.0f), true, "#FFD73E");
                    strM202217t = String.format(w8u.m202217t(R$string.f47077Y5), strM178016w);
                    staticLayoutM74071f2 = m74071f(textPaintM74069d, strM202217t, strM178016w, "#CCFFD73E");
                }
                TextPaint textPaint = textPaintM74069d;
                staticLayoutM74071f = staticLayoutM74071f2;
                textPaintM74068c3 = textPaint;
            }
            str2 = strM202217t;
            str = String.format("Lv.%s", Long.valueOf(grade));
        } else {
            TextPaint textPaintM74069d2 = m74069d(m74070e(t100.m186890d(11.0f), 1.6f, 0.8f), "#CCFFFFFF");
            textPaintM74068c = m74068c(m74070e(t100.m186890d(13.0f), 1.8f, 1.0f), true, "#FFD73E");
            textPaintM74068c2 = m74068c(m74070e(t100.m186890d(14.0f), 1.25f, 0.75f), true, "#FFD73E");
            String str3 = String.format(w8u.m202217t(R$string.f47098Z5), strM178016w);
            staticLayoutM74071f = m74071f(textPaintM74069d2, str3, strM178016w, "#CCFFD73E");
            str = String.format(w8u.m202217t(R$string.f47164c6), Long.valueOf(roomTopEffect.getSuperGrade()));
            str2 = str3;
            textPaintM74068c3 = textPaintM74069d2;
        }
        SVGALoader.with(act).from(roomTopEffect.getSvgUrl()).autoPlay(true).dynamic(m74067b(roomTopEffect, str2, textPaintM74068c3, staticLayoutM74071f, textPaintM74068c, str, textPaintM74068c2)).animListener(new C12820a(d30Var)).repeatCount(1).into(this.f50001b);
    }

    /* JADX INFO: renamed from: i */
    public void m74074i(Act act, j5h0 j5h0Var, d30 d30Var) {
        SVGALoader.with(act).from(j5h0Var.f116318a).autoPlay(true).dynamic(j5h0Var.f116319b).animListener(new C12821b(d30Var)).repeatCount(1).into(this.f50001b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74066a(this);
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
