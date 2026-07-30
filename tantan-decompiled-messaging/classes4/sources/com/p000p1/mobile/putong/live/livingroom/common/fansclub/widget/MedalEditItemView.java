package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import l.ftd0;
import l.hxs;
import l.t100;
import p002l.i3c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MedalEditItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5211a;

    /* JADX INFO: renamed from: b */
    public ImageView f5212b;

    /* JADX INFO: renamed from: c */
    public boolean f5213c;

    /* JADX INFO: renamed from: d */
    public String f5214d;

    /* JADX INFO: renamed from: e */
    public String f5215e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f5216f;

    public MedalEditItemView(@NonNull Context context) {
        super(context);
        m6531a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6531a() {
        ImageView imageView = new ImageView(getContext());
        this.f5212b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f5212b.setImageResource(i3c0.f13014y3);
        int i = t100.B;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.f5212b, layoutParams);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f5211a = vDraweeView;
        vDraweeView.setVisibility(8);
        this.f5211a.getHierarchy().w(ftd0.h);
        int i2 = t100.y;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        addView(this.f5211a, layoutParams2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m6532b() {
        return this.f5213c;
    }

    public String getBackgroundColor() {
        return this.f5215e;
    }

    public String getName() {
        return this.f5214d;
    }

    public void setBackgroundColor(String str) {
        this.f5215e = str;
        this.f5216f = Color.parseColor(str);
        LayerDrawable layerDrawable = (LayerDrawable) this.f5212b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f5216f);
        if (this.f5213c) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.d, this.f5216f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.d, -1);
        }
    }

    public void setChecked(boolean z) {
        this.f5213c = z;
        LayerDrawable layerDrawable = (LayerDrawable) this.f5212b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f5216f);
        if (z) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.d, this.f5216f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.d, -1);
        }
    }

    public void setIcon(String str) {
        this.f5211a.setVisibility(0);
        hxs.s("context_livingAct", this.f5211a, str);
    }

    public void setName(String str) {
        this.f5214d = str;
    }
}
