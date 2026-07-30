package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import p151v.VDraweeView;
import p153l.h1e0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class MedalEditItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50017a;

    /* JADX INFO: renamed from: b */
    public ImageView f50018b;

    /* JADX INFO: renamed from: c */
    public boolean f50019c;

    /* JADX INFO: renamed from: d */
    public String f50020d;

    /* JADX INFO: renamed from: e */
    public String f50021e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f50022f;

    public MedalEditItemView(@NonNull Context context) {
        super(context);
        m74191a();
    }

    /* JADX INFO: renamed from: a */
    public final void m74191a() {
        ImageView imageView = new ImageView(getContext());
        this.f50018b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f50018b.setImageResource(obc0.f146557y3);
        int i = qa00.f156289B;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.f50018b, layoutParams);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f50017a = vDraweeView;
        vDraweeView.setVisibility(8);
        this.f50017a.getHierarchy().m207062w(h1e0.f107451h);
        int i2 = qa00.f156338y;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        addView(this.f50017a, layoutParams2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m74192b() {
        return this.f50019c;
    }

    public String getBackgroundColor() {
        return this.f50021e;
    }

    public String getName() {
        return this.f50020d;
    }

    public void setBackgroundColor(String str) {
        this.f50021e = str;
        this.f50022f = Color.parseColor(str);
        LayerDrawable layerDrawable = (LayerDrawable) this.f50018b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f50022f);
        if (this.f50019c) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(qa00.f156317d, this.f50022f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(qa00.f156317d, -1);
        }
    }

    public void setChecked(boolean z) {
        this.f50019c = z;
        LayerDrawable layerDrawable = (LayerDrawable) this.f50018b.getDrawable();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(this.f50022f);
        if (z) {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(qa00.f156317d, this.f50022f);
        } else {
            ((GradientDrawable) layerDrawable.getDrawable(1)).setStroke(qa00.f156317d, -1);
        }
    }

    public void setIcon(String str) {
        this.f50017a.setVisibility(0);
        izs.m142868s("context_livingAct", this.f50017a, str);
    }

    public void setName(String str) {
        this.f50020d = str;
    }
}
