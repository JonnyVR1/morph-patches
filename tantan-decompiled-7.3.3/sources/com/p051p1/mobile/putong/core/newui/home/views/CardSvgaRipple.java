package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p153l.gt0;
import p153l.vql;

/* JADX INFO: loaded from: classes11.dex */
public class CardSvgaRipple extends SVGAnimationView implements vql {
    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40118e();
    }

    @Override // p153l.vql
    /* JADX INFO: renamed from: a */
    public void mo40115a() {
        startAnimation();
        gt0.m132156b(this, gt0.m132171q(this, "alpha", getAlpha(), 1.0f).setDuration(350L));
    }

    @Override // p153l.vql
    /* JADX INFO: renamed from: b */
    public void mo40116b() {
        super.mo40116b();
        gt0.m132156b(this, gt0.m132171q(this, "alpha", getAlpha(), 1.0f).setDuration(350L));
    }

    @Override // p153l.vql
    /* JADX INFO: renamed from: c */
    public void mo40117c() {
        gt0.m132156b(this, gt0.m132171q(this, "alpha", getAlpha(), 0.0f).setDuration(350L));
    }

    /* JADX INFO: renamed from: e */
    public final void m40118e() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/98254782-d164-48de-8f82-dbf1f521b68814.svga").autoPlay(true).repeatCount(-1).into(this);
    }

    @Override // p153l.vql
    public ImageView getRippleView() {
        return this;
    }

    @Override // p153l.vql
    public /* bridge */ /* synthetic */ void setRadarColor(int i) {
        super.setRadarColor(i);
    }

    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m40118e();
    }

    public CardSvgaRipple(@NonNull Context context) {
        super(context);
        m40118e();
    }
}
