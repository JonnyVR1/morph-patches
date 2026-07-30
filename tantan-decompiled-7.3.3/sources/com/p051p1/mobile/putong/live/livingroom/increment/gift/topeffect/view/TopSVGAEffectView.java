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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p153l.bnl0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.q4j0;
import p153l.qa00;
import p153l.wo0;
import p153l.x6j0;

/* JADX INFO: loaded from: classes4.dex */
public class TopSVGAEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TopSVGAEffectView f50873a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50874b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50875c;

    /* JADX INFO: renamed from: d */
    public String f50876d;

    /* JADX INFO: renamed from: e */
    public String f50877e;

    /* JADX INFO: renamed from: f */
    public String f50878f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$a */
    public class C12988a extends wo0 {
        public C12988a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            TopSVGAEffectView.this.f50873a.setBackgroundColor(n3d0.m161277a(n9c0.f140874v1));
            bnl0.m105524M(TopSVGAEffectView.this.f50874b, false);
            bnl0.m105524M(TopSVGAEffectView.this.f50873a, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            TopSVGAEffectView.this.f50873a.setBackgroundColor(n3d0.m161277a(n9c0.f140787P));
            bnl0.m105524M(TopSVGAEffectView.this.f50874b, true);
            bnl0.m105524M(TopSVGAEffectView.this.f50873a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$b */
    public class C12989b extends AnimListener {
        public C12989b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(TopSVGAEffectView.this.f50875c, false);
            bnl0.m105524M(TopSVGAEffectView.this.f50873a, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            TopSVGAEffectView.this.f50873a.setBackgroundColor(n3d0.m161277a(n9c0.f140874v1));
            bnl0.m105524M(TopSVGAEffectView.this.f50875c, true);
            bnl0.m105524M(TopSVGAEffectView.this.f50873a, true);
        }
    }

    public TopSVGAEffectView(@NonNull Context context) {
        super(context);
        this.f50876d = "#CCFFFFFF";
        this.f50877e = "#9AFFFFFF";
        this.f50878f = "#FFC770";
    }

    /* JADX INFO: renamed from: a */
    public final void m75285a(View view) {
        x6j0.m209505a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m75286b(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        String userName = giftWallGradeFiveNotice.getUserName().length() <= 5 ? giftWallGradeFiveNotice.getUserName() : giftWallGradeFiveNotice.getUserName().substring(0, 4).concat("...");
        String otherUserName = giftWallGradeFiveNotice.getOtherUserName().length() <= 5 ? giftWallGradeFiveNotice.getOtherUserName() : giftWallGradeFiveNotice.getOtherUserName().substring(0, 4).concat("...");
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(giftWallGradeFiveNotice.getGiftIcon(), "icon");
        sVGADynamicEntity.setDynamicText(giftWallGradeFiveNotice.getGiftName(), m75287c(qa00.m175859d(11.0f), true, this.f50876d), "text01");
        sVGADynamicEntity.setDynamicText(m75289e(m75288d(qa00.m175859d(9.0f), this.f50877e), String.format("%s助力%s", userName, otherUserName), userName, otherUserName, this.f50878f), "text02");
        sVGADynamicEntity.setDynamicText("点亮" + giftWallGradeFiveNotice.getGiftName() + "五星成就", m75287c(qa00.m175859d(9.0f), true, this.f50877e), "text03");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m75287c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m75288d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m75289e(TextPaint textPaint, String str, String str2, String str3, String str4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str3), str.indexOf(str3) + str3.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m75290f(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice, q4j0 q4j0Var) {
        SVGALoader.with(q4j0Var.act()).from(giftWallGradeFiveNotice.getSvgaUrl()).autoPlay(true).dynamic(m75286b(giftWallGradeFiveNotice)).animListener(new C12989b()).repeatCount(1).into(this.f50875c);
    }

    /* JADX INFO: renamed from: g */
    public void m75291g(String str) {
        this.f50874b.mo69685l(str, 1, new C12988a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75285a(this);
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50876d = "#CCFFFFFF";
        this.f50877e = "#9AFFFFFF";
        this.f50878f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50876d = "#CCFFFFFF";
        this.f50877e = "#9AFFFFFF";
        this.f50878f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50876d = "#CCFFFFFF";
        this.f50877e = "#9AFFFFFF";
        this.f50878f = "#FFC770";
    }
}
