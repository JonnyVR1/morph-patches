package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.zebraprogress;

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
import l.nu0;
import p003l.mkp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ProgressBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AppCompatImageView f174a;

    /* JADX INFO: renamed from: b */
    public TranslateAnimation f175b;

    /* JADX INFO: renamed from: c */
    public long f176c;

    public ProgressBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f176c = 2000L;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f174a = appCompatImageView;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(appCompatImageView);
    }

    /* JADX INFO: renamed from: a */
    public final void m298a(int i) {
        if (this.f175b == null) {
            ((FrameLayout.LayoutParams) this.f174a.getLayoutParams()).setMargins(-i, 0, 0, 0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - 3, 0.0f, 0.0f);
            this.f175b = translateAnimation;
            translateAnimation.setInterpolator(new LinearInterpolator());
            this.f175b.setDuration(this.f176c);
            this.f175b.setRepeatCount(-1);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m299b() {
        return this.f174a.getAnimation() != null;
    }

    /* JADX INFO: renamed from: c */
    public void m300c() {
        TranslateAnimation translateAnimation;
        if (this.f174a.getAnimation() != null || (translateAnimation = this.f175b) == null) {
            return;
        }
        this.f174a.startAnimation(translateAnimation);
    }

    /* JADX INFO: renamed from: d */
    public void m301d() {
        if (this.f174a.getAnimation() != null) {
            this.f174a.getAnimation().cancel();
            this.f174a.clearAnimation();
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
        m298a(bitmap.getWidth());
        this.f174a.setBackground(bitmapDrawable);
    }

    public void setBackgroundRes(int i) {
        this.f174a.setBackground(nu0.b(getContext(), i));
    }

    public void setDuration(long j) {
        this.f176c = j;
        TranslateAnimation translateAnimation = this.f175b;
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
