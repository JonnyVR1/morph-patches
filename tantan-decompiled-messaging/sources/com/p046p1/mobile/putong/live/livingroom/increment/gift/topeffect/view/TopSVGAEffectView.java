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
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import p149l.ap0;
import p149l.h1c0;
import p149l.kvc0;
import p149l.mvi0;
import p149l.t100;
import p149l.txi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TopSVGAEffectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TopSVGAEffectView f50025a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f50026b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f50027c;

    /* JADX INFO: renamed from: d */
    public String f50028d;

    /* JADX INFO: renamed from: e */
    public String f50029e;

    /* JADX INFO: renamed from: f */
    public String f50030f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$a */
    public class C12825a extends ap0 {
        public C12825a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            TopSVGAEffectView.this.f50025a.setBackgroundColor(kvc0.m147352a(h1c0.f105413v1));
            xdl0.m208344M(TopSVGAEffectView.this.f50026b, false);
            xdl0.m208344M(TopSVGAEffectView.this.f50025a, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            TopSVGAEffectView.this.f50025a.setBackgroundColor(kvc0.m147352a(h1c0.f105326P));
            xdl0.m208344M(TopSVGAEffectView.this.f50026b, true);
            xdl0.m208344M(TopSVGAEffectView.this.f50025a, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopSVGAEffectView$b */
    public class C12826b extends AnimListener {
        public C12826b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(TopSVGAEffectView.this.f50027c, false);
            xdl0.m208344M(TopSVGAEffectView.this.f50025a, false);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            TopSVGAEffectView.this.f50025a.setBackgroundColor(kvc0.m147352a(h1c0.f105413v1));
            xdl0.m208344M(TopSVGAEffectView.this.f50027c, true);
            xdl0.m208344M(TopSVGAEffectView.this.f50025a, true);
        }
    }

    public TopSVGAEffectView(@NonNull Context context) {
        super(context);
        this.f50028d = "#CCFFFFFF";
        this.f50029e = "#9AFFFFFF";
        this.f50030f = "#FFC770";
    }

    /* JADX INFO: renamed from: a */
    public final void m74102a(View view) {
        txi0.m190960a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final SVGADynamicEntity m74103b(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        String userName = giftWallGradeFiveNotice.getUserName().length() <= 5 ? giftWallGradeFiveNotice.getUserName() : giftWallGradeFiveNotice.getUserName().substring(0, 4).concat("...");
        String otherUserName = giftWallGradeFiveNotice.getOtherUserName().length() <= 5 ? giftWallGradeFiveNotice.getOtherUserName() : giftWallGradeFiveNotice.getOtherUserName().substring(0, 4).concat("...");
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(giftWallGradeFiveNotice.getGiftIcon(), "icon");
        sVGADynamicEntity.setDynamicText(giftWallGradeFiveNotice.getGiftName(), m74104c(t100.m186890d(11.0f), true, this.f50028d), "text01");
        sVGADynamicEntity.setDynamicText(m74106e(m74105d(t100.m186890d(9.0f), this.f50029e), String.format("%s助力%s", userName, otherUserName), userName, otherUserName, this.f50030f), "text02");
        sVGADynamicEntity.setDynamicText("点亮" + giftWallGradeFiveNotice.getGiftName() + "五星成就", m74104c(t100.m186890d(9.0f), true, this.f50029e), "text03");
        return sVGADynamicEntity;
    }

    /* JADX INFO: renamed from: c */
    public final TextPaint m74104c(float f, boolean z, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setFakeBoldText(z);
        textPaint.setColor(Color.parseColor(str));
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        return textPaint;
    }

    /* JADX INFO: renamed from: d */
    public final TextPaint m74105d(float f, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setColor(Color.parseColor(str));
        return textPaint;
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m74106e(TextPaint textPaint, String str, String str2, String str3, String str4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str2), str.indexOf(str2) + str2.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(str4)), str.indexOf(str3), str.indexOf(str3) + str3.length(), 18);
        return new StaticLayout(spannableStringBuilder, 0, spannableStringBuilder.length(), textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    /* JADX INFO: renamed from: f */
    public void m74107f(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice, mvi0 mvi0Var) {
        SVGALoader.with(mvi0Var.act()).from(giftWallGradeFiveNotice.getSvgaUrl()).autoPlay(true).dynamic(m74103b(giftWallGradeFiveNotice)).animListener(new C12826b()).repeatCount(1).into(this.f50027c);
    }

    /* JADX INFO: renamed from: g */
    public void m74108g(String str) {
        this.f50026b.mo68502l(str, 1, new C12825a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74102a(this);
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50028d = "#CCFFFFFF";
        this.f50029e = "#9AFFFFFF";
        this.f50030f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50028d = "#CCFFFFFF";
        this.f50029e = "#9AFFFFFF";
        this.f50030f = "#FFC770";
    }

    public TopSVGAEffectView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f50028d = "#CCFFFFFF";
        this.f50029e = "#9AFFFFFF";
        this.f50030f = "#FFC770";
    }
}
