package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.djj;
import l.ftd0;
import l.t100;
import l.xdl0;
import p007l.m9c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f1015a;

    /* JADX INFO: renamed from: b */
    public Drawable f1016b;

    /* JADX INFO: renamed from: c */
    public TextView f1017c;

    /* JADX INFO: renamed from: d */
    public ImageView f1018d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1019e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1020f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f1021g;

    /* JADX INFO: renamed from: h */
    public float f1022h;

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10309a, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(m9c0.f10319f);
        this.f1016b = typedArrayObtainStyledAttributes.getDrawable(m9c0.f10315d);
        this.f1015a = typedArrayObtainStyledAttributes.getDrawable(m9c0.f10317e);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(m9c0.f10311b, 20);
        this.f1022h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(m9c0.f10313c, t100.d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m2379c(string, this.f1016b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m2378b() {
        View view = this.f1018d;
        if (xdl0.O0(this.f1021g)) {
            view = this.f1021g;
        }
        View view2 = view;
        bt0.s(new Animator[]{bt0.l(view2, bt0.i, 30L, 50L, new LinearInterpolator(), new float[]{1.0f, 1.2f}), bt0.l(view2, bt0.i, 0L, 50L, new LinearInterpolator(), new float[]{1.2f, 1.0f})}).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m2379c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f1018d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f1018d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f1018d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1021g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f1021g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f1020f = vDraweeView;
        vDraweeView.setVisibility(8);
        djj hierarchy = this.f1020f.getHierarchy();
        ftd0 ftd0Var = ftd0.a;
        hierarchy.w(ftd0Var);
        this.f1020f.getHierarchy().H(RoundingParams.a());
        this.f1021g.addView((View) this.f1020f, (ViewGroup.LayoutParams) layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f1019e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f1019e.getHierarchy().w(ftd0Var);
        this.f1019e.getHierarchy().H(RoundingParams.a());
        this.f1021g.addView((View) this.f1019e, (ViewGroup.LayoutParams) layoutParams2);
        addView(this.f1021g, layoutParams);
        this.f1017c = new TextView(getContext());
        int i2 = xdl0.f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f1022h;
        this.f1017c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f1017c.setTextSize(10.0f);
        this.f1017c.setTextColor(-1);
        this.f1017c.setGravity(17);
        addView(this.f1017c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f1017c.setText(str);
        }
        if (NullChecker.a(drawable)) {
            this.f1018d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m2380d(View.OnClickListener onClickListener, View view) {
        m2378b();
        if (NullChecker.a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2381e() {
        this.f1018d.setVisibility(0);
        this.f1021g.setVisibility(8);
    }

    public FrameLayout getDraweeLayout() {
        this.f1018d.setVisibility(8);
        this.f1021g.setVisibility(0);
        return this.f1021g;
    }

    public VDraweeView getDraweeView() {
        this.f1018d.setVisibility(8);
        this.f1021g.setVisibility(0);
        this.f1019e.setVisibility(0);
        return this.f1019e;
    }

    public void setImageResource(int i) {
        this.f1018d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.l94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9956a.m2380d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f1017c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f1018d.setImageDrawable(this.f1016b);
            this.f1017c.setTextColor(-1);
        } else if (i == 2) {
            this.f1018d.setImageDrawable(this.f1015a);
            this.f1017c.setTextColor(-16777216);
        }
    }

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraMenuView(Context context) {
        this(context, null);
    }
}
