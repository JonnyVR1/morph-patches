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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import l.ap0;
import l.kvc0;
import l.t100;
import l.xdl0;
import p002l.h1c0;
import p002l.mvi0;
import p002l.txi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TopSVGAEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TopSVGAEffectView f6067a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f6068b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f6069c;

    /* JADX INFO: renamed from: d */
    public String f6070d;

    /* JADX INFO: renamed from: e */
    public String f6071e;

    /* JADX INFO: renamed from: f */
    public String f6072f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$a */
    public class C0414a extends ap0 {
        public C0414a() {
        }

        /* JADX INFO: renamed from: b */
        public void m7672b() {
            super.b();
            TopSVGAEffectView.this.f6067a.setBackgroundColor(kvc0.a(h1c0.f11833v1));
            xdl0.M(TopSVGAEffectView.this.f6068b, false);
            xdl0.M(TopSVGAEffectView.this.f6067a, false);
        }

        /* JADX INFO: renamed from: g */
        public void m7673g() {
            super.g();
            TopSVGAEffectView.this.f6067a.setBackgroundColor(kvc0.a(h1c0.f11746P));
            xdl0.M(TopSVGAEffectView.this.f6068b, true);
            xdl0.M(TopSVGAEffectView.this.f6067a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$b */
    public class C0415b extends AnimListener {
        public C0415b() {
        }

        public void onFinished() {
            super.onFinished();
            xdl0.M(TopSVGAEffectView.this.f6069c, false);
            xdl0.M(TopSVGAEffectView.this.f6067a, false);
        }

        public void onStart() {
            super.onStart();
            TopSVGAEffectView.this.f6067a.setBackgroundColor(kvc0.a(h1c0.f11833v1));
            xdl0.M(TopSVGAEffectView.this.f6069c, true);
            xdl0.M(TopSVGAEffectView.this.f6067a, true);
        }
    }

    public TopSVGAEffectView(@NonNull Context context) {
        super(context);
        this.f6070d = "#CCFFFFFF";
        this.f6071e = "#9AFFFFFF";
        this.f6072f = "#FFC770";
    }

    /* JADX INFO: renamed from: a */
    public final void m7665a(View view) {
        txi0.m23230a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m7666b(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        String userName = giftWallGradeFiveNotice.getUserName().length() <= 5 ? giftWallGradeFiveNotice.getUserName() : giftWallGradeFiveNotice.getUserName().substring(0, 4).concat("...");
        String otherUserName = giftWallGradeFiveNotice.getOtherUserName().length() <= 5 ? giftWallGradeFiveNotice.getOtherUserName() : giftWallGradeFiveNotice.getOtherUserName().substring(0, 4).concat("...");
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(giftWallGradeFiveNotice.getGiftIcon(), "icon");
        sVGADynamicEntity.setDynamicText(giftWallGradeFiveNotice.getGiftName(), m7667c(t100.d(11.0f), true, this.f6070d), "text01");
        sVGADynamicEntity.setDynamicText(m7669e(m7668d(t100.d(9.0f), this.f6071e), String.format("%s助力%s", userName, otherUserName), userName, otherUserName, this.f6072f), "text02");
        sVGADynamicEntity.setDynamicText("点亮" + giftWallGradeFiveNotice.getGiftName() + "五星成就", m7667c(t100.d(9.0f), true, this.f6071e), "text03");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m7667c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m7668d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m7669e(TextPaint textPaint, String str, String str2, String str3, String str4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str3), str.indexOf(str3) + str3.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m7670f(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice, mvi0 mvi0Var) {
        SVGALoader.with(mvi0Var.act()).from(giftWallGradeFiveNotice.getSvgaUrl()).autoPlay(true).dynamic(m7666b(giftWallGradeFiveNotice)).animListener(new C0415b()).repeatCount(1).into(this.f6069c);
    }

    /* JADX INFO: renamed from: g */
    public void m7671g(String str) {
        this.f6068b.l(str, 1, new C0414a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7665a(this);
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6070d = "#CCFFFFFF";
        this.f6071e = "#9AFFFFFF";
        this.f6072f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6070d = "#CCFFFFFF";
        this.f6071e = "#9AFFFFFF";
        this.f6072f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f6070d = "#CCFFFFFF";
        this.f6071e = "#9AFFFFFF";
        this.f6072f = "#FFC770";
    }
}
