package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import p149l.bt0;
import p149l.kol;

/* JADX INFO: loaded from: classes11.dex */
public class CardSvgaRipple extends SVGAnimationView implements kol {
    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39115e();
    }

    @Override // p149l.kol
    /* JADX INFO: renamed from: a */
    public void mo39112a() {
        startAnimation();
        bt0.m103729b(this, bt0.m103744q(this, "alpha", getAlpha(), 1.0f).setDuration(350L));
    }

    @Override // p149l.kol
    /* JADX INFO: renamed from: b */
    public void mo39113b() {
        super.mo39113b();
        bt0.m103729b(this, bt0.m103744q(this, "alpha", getAlpha(), 1.0f).setDuration(350L));
    }

    @Override // p149l.kol
    /* JADX INFO: renamed from: c */
    public void mo39114c() {
        bt0.m103729b(this, bt0.m103744q(this, "alpha", getAlpha(), 0.0f).setDuration(350L));
    }

    /* JADX INFO: renamed from: e */
    public final void m39115e() {
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/98254782-d164-48de-8f82-dbf1f521b68814.svga").autoPlay(true).repeatCount(-1).into(this);
    }

    @Override // p149l.kol
    public ImageView getRippleView() {
        return this;
    }

    @Override // p149l.kol
    public /* bridge */ /* synthetic */ void setRadarColor(int i) {
        super.setRadarColor(i);
    }

    public CardSvgaRipple(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m39115e();
    }

    public CardSvgaRipple(@NonNull Context context) {
        super(context);
        m39115e();
    }
}
