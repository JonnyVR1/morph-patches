package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.bt0;
import p009l.kol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardSvgaRipple extends SVGAnimationView implements kol {
    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3130e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.kol
    /* JADX INFO: renamed from: a */
    public void mo3127a() {
        startAnimation();
        bt0.b(this, bt0.q(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(350L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.kol
    /* JADX INFO: renamed from: b */
    public void mo3128b() {
        super.mo3128b();
        bt0.b(this, bt0.q(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(350L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.kol
    /* JADX INFO: renamed from: c */
    public void mo3129c() {
        bt0.b(this, bt0.q(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(350L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m3130e() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/98254782-d164-48de-8f82-dbf1f521b68814.svga").autoPlay(true).repeatCount(-1).into(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.kol
    public ImageView getRippleView() {
        return this;
    }

    @Override // p009l.kol
    public /* bridge */ /* synthetic */ void setRadarColor(int i) {
        super.setRadarColor(i);
    }

    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3130e();
    }

    public CardSvgaRipple(@NonNull Context context) {
        super(context);
        m3130e();
    }
}
