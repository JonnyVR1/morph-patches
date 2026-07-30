package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import p147v.VDraweeView;
import p149l.ftd0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class MedalEditItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49169a;

    /* JADX INFO: renamed from: b */
    public ImageView f49170b;

    /* JADX INFO: renamed from: c */
    public boolean f49171c;

    /* JADX INFO: renamed from: d */
    public String f49172d;

    /* JADX INFO: renamed from: e */
    public String f49173e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f49174f;

    public MedalEditItemView(@NonNull Context context) {
        super(context);
        m73008a();
    }

    /* JADX INFO: renamed from: a */
    public final void m73008a() {
        ImageView imageView = new ImageView(getContext());
        this.f49170b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f49170b.setImageResource(i3c0.f111229y3);
        int i = t100.f167227B;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.f49170b, layoutParams);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f49169a = vDraweeView;
        vDraweeView.setVisibility(8);
        this.f49169a.getHierarchy().m112076w(ftd0.f99184h);
        int i2 = t100.f167276y;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        addView(this.f49169a, layoutParams2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m73009b() {
        return this.f49171c;
    }

    public String getBackgroundColor() {
        return this.f49173e;
    }

    public String getName() {
        return this.f49172d;
    }

    public void setBackgroundColor(String str) {
        this.f49173e = str;
        this.f49174f = Color.parseColor(str);
        LayerDrawable layerDrawable = (LayerDrawable) this.f49170b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f49174f);
        if (this.f49171c) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.f167255d, this.f49174f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.f167255d, -1);
        }
    }

    public void setChecked(boolean z) {
        this.f49171c = z;
        LayerDrawable layerDrawable = (LayerDrawable) this.f49170b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f49174f);
        if (z) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.f167255d, this.f49174f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(t100.f167255d, -1);
        }
    }

    public void setIcon(String str) {
        this.f49169a.setVisibility(0);
        hxs.m133406s("context_livingAct", this.f49169a, str);
    }

    public void setName(String str) {
        this.f49172d = str;
    }
}
