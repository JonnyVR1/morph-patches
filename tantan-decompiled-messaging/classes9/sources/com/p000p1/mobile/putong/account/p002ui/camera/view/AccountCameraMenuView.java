package com.p000p1.mobile.putong.account.p002ui.camera.view;

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
import p006l.c9c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f753a;

    /* JADX INFO: renamed from: b */
    public Drawable f754b;

    /* JADX INFO: renamed from: c */
    public TextView f755c;

    /* JADX INFO: renamed from: d */
    public ImageView f756d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f757e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f758f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f759g;

    /* JADX INFO: renamed from: h */
    public float f760h;

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f9508E, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(c9c0.f9513J);
        this.f754b = typedArrayObtainStyledAttributes.getDrawable(c9c0.f9511H);
        this.f753a = typedArrayObtainStyledAttributes.getDrawable(c9c0.f9512I);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c9c0.f9509F, 20);
        this.f760h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c9c0.f9510G, t100.d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m834c(string, this.f754b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m833b() {
        View view = this.f756d;
        if (xdl0.O0(this.f759g)) {
            view = this.f759g;
        }
        View view2 = view;
        bt0.s(new Animator[]{bt0.l(view2, bt0.i, 30L, 50L, new LinearInterpolator(), new float[]{1.0f, 1.2f}), bt0.l(view2, bt0.i, 0L, 50L, new LinearInterpolator(), new float[]{1.2f, 1.0f})}).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m834c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f756d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f756d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f756d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f759g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f759g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f758f = vDraweeView;
        vDraweeView.setVisibility(8);
        djj hierarchy = this.f758f.getHierarchy();
        ftd0 ftd0Var = ftd0.a;
        hierarchy.w(ftd0Var);
        this.f758f.getHierarchy().H(RoundingParams.a());
        this.f759g.addView((View) this.f758f, (ViewGroup.LayoutParams) layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f757e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f757e.getHierarchy().w(ftd0Var);
        this.f757e.getHierarchy().H(RoundingParams.a());
        this.f759g.addView((View) this.f757e, (ViewGroup.LayoutParams) layoutParams2);
        addView(this.f759g, layoutParams);
        this.f755c = new TextView(getContext());
        int i2 = xdl0.f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f760h;
        this.f755c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f755c.setTextSize(10.0f);
        this.f755c.setTextColor(-1);
        this.f755c.setGravity(17);
        addView(this.f755c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f755c.setText(str);
        }
        if (NullChecker.a(drawable)) {
            this.f756d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m835d(View.OnClickListener onClickListener, View view) {
        m833b();
        if (NullChecker.a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    public FrameLayout getDraweeLayout() {
        this.f756d.setVisibility(8);
        this.f759g.setVisibility(0);
        return this.f759g;
    }

    public VDraweeView getDraweeView() {
        this.f756d.setVisibility(8);
        this.f759g.setVisibility(0);
        this.f757e.setVisibility(0);
        return this.f757e;
    }

    public void setImageResource(int i) {
        this.f756d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.ti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22122a.m835d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f755c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f756d.setImageDrawable(this.f754b);
            this.f755c.setTextColor(-1);
        } else if (i == 2) {
            this.f756d.setImageDrawable(this.f753a);
            this.f755c.setTextColor(-16777216);
        }
    }

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraMenuView(Context context) {
        this(context, null);
    }
}
