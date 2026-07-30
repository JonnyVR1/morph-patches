package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress;

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
import p153l.mmp;
import p153l.tu0;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final AppCompatImageView f31131a;

    /* JADX INFO: renamed from: b */
    public TranslateAnimation f31132b;

    /* JADX INFO: renamed from: c */
    public long f31133c;

    public ProgressBgView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31133c = 2000L;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.f31131a = appCompatImageView;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(appCompatImageView);
    }

    /* JADX INFO: renamed from: a */
    public final void m48451a(int i) {
        if (this.f31132b == null) {
            ((FrameLayout.LayoutParams) this.f31131a.getLayoutParams()).setMargins(-i, 0, 0, 0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, i - 3, 0.0f, 0.0f);
            this.f31132b = translateAnimation;
            translateAnimation.setInterpolator(new LinearInterpolator());
            this.f31132b.setDuration(this.f31133c);
            this.f31132b.setRepeatCount(-1);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m48452b() {
        return this.f31131a.getAnimation() != null;
    }

    /* JADX INFO: renamed from: c */
    public void m48453c() {
        TranslateAnimation translateAnimation;
        if (this.f31131a.getAnimation() != null || (translateAnimation = this.f31132b) == null) {
            return;
        }
        this.f31131a.startAnimation(translateAnimation);
    }

    /* JADX INFO: renamed from: d */
    public void m48454d() {
        if (this.f31131a.getAnimation() != null) {
            this.f31131a.getAnimation().cancel();
            this.f31131a.clearAnimation();
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
        m48451a(bitmap.getWidth());
        this.f31131a.setBackground(bitmapDrawable);
    }

    public void setBackgroundRes(int i) {
        this.f31131a.setBackground(tu0.m192702b(getContext(), i));
    }

    public void setDuration(long j) {
        this.f31133c = j;
        TranslateAnimation translateAnimation = this.f31132b;
        if (translateAnimation != null) {
            translateAnimation.setDuration(j);
        }
    }

    public void setRadiusPx(int i) {
        if (i <= 0) {
            return;
        }
        setOutlineProvider(new mmp(i));
        setClipToOutline(true);
    }

    public void setRightRadiusPx(int i) {
        if (i <= 0) {
            return;
        }
        setOutlineProvider(new mmp(i, 3));
        setClipToOutline(true);
    }

    public void setBackgroundAsTile(int i) {
        setBackgroundAsTile(BitmapFactory.decodeResource(getResources(), i));
    }
}
