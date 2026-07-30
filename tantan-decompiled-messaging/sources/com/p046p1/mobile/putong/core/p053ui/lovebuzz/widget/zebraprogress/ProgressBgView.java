package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.zebraprogress;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import p149l.mkp;
import p149l.nu0;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AppCompatImageView f30283a;

    /* JADX INFO: renamed from: b */
    public TranslateAnimation f30284b;

    /* JADX INFO: renamed from: c */
    public long f30285c;

    public ProgressBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30285c = 2000L;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f30283a = appCompatImageView;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(appCompatImageView);
    }

    /* JADX INFO: renamed from: a */
    public final void m47268a(int i) {
        if (this.f30284b == null) {
            ((FrameLayout.LayoutParams) this.f30283a.getLayoutParams()).setMargins(-i, 0, 0, 0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - 3, 0.0f, 0.0f);
            this.f30284b = translateAnimation;
            translateAnimation.setInterpolator(new LinearInterpolator());
            this.f30284b.setDuration(this.f30285c);
            this.f30284b.setRepeatCount(-1);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m47269b() {
        return this.f30283a.getAnimation() != null;
    }

    /* JADX INFO: renamed from: c */
    public void m47270c() {
        TranslateAnimation translateAnimation;
        if (this.f30283a.getAnimation() != null || (translateAnimation = this.f30284b) == null) {
            return;
        }
        this.f30283a.startAnimation(translateAnimation);
    }

    /* JADX INFO: renamed from: d */
    public void m47271d() {
        if (this.f30283a.getAnimation() != null) {
            this.f30283a.getAnimation().cancel();
            this.f30283a.clearAnimation();
        }
    }

    public void setBackgroundAsTile(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setDither(true);
        m47268a(bitmap.getWidth());
        this.f30283a.setBackground(bitmapDrawable);
    }

    public void setBackgroundRes(int i) {
        this.f30283a.setBackground(nu0.m161424b(getContext(), i));
    }

    public void setDuration(long j) {
        this.f30285c = j;
        TranslateAnimation translateAnimation = this.f30284b;
        if (translateAnimation != null) {
            translateAnimation.setDuration(j);
        }
    }

    public void setRadiusPx(int i) {
        if (i <= 0) {
            return;
        }
        setOutlineProvider(new mkp(i));
        setClipToOutline(true);
    }

    public void setRightRadiusPx(int i) {
        if (i <= 0) {
            return;
        }
        setOutlineProvider(new mkp(i, 3));
        setClipToOutline(true);
    }

    public void setBackgroundAsTile(int i) {
        setBackgroundAsTile(BitmapFactory.decodeResource(getResources(), i));
    }
}
