package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.c9c0;
import p149l.djj;
import p149l.ftd0;
import p149l.t100;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f16764a;

    /* JADX INFO: renamed from: b */
    public Drawable f16765b;

    /* JADX INFO: renamed from: c */
    public TextView f16766c;

    /* JADX INFO: renamed from: d */
    public ImageView f16767d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f16768e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f16769f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f16770g;

    /* JADX INFO: renamed from: h */
    public float f16771h;

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f79885E, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(c9c0.f79890J);
        this.f16765b = typedArrayObtainStyledAttributes.getDrawable(c9c0.f79888H);
        this.f16764a = typedArrayObtainStyledAttributes.getDrawable(c9c0.f79889I);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c9c0.f79886F, 20);
        this.f16771h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c9c0.f79887G, t100.m186890d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m28928c(string, this.f16765b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m28927b() {
        View view = this.f16767d;
        if (xdl0.m208349O0(this.f16770g)) {
            view = this.f16770g;
        }
        View view2 = view;
        bt0.m103746s(bt0.m103739l(view2, bt0.f77162i, 30L, 50L, new LinearInterpolator(), 1.0f, 1.2f), bt0.m103739l(view2, bt0.f77162i, 0L, 50L, new LinearInterpolator(), 1.2f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m28928c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f16767d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f16767d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f16767d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16770g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f16770g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f16769f = vDraweeView;
        vDraweeView.setVisibility(8);
        djj hierarchy = this.f16769f.getHierarchy();
        ftd0 ftd0Var = ftd0.f99177a;
        hierarchy.m112076w(ftd0Var);
        this.f16769f.getHierarchy().m112053H(RoundingParams.m8247a());
        this.f16770g.addView(this.f16769f, layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f16768e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f16768e.getHierarchy().m112076w(ftd0Var);
        this.f16768e.getHierarchy().m112053H(RoundingParams.m8247a());
        this.f16770g.addView(this.f16768e, layoutParams2);
        addView(this.f16770g, layoutParams);
        this.f16766c = new TextView(getContext());
        int i2 = xdl0.f192404f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f16771h;
        this.f16766c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f16766c.setTextSize(10.0f);
        this.f16766c.setTextColor(-1);
        this.f16766c.setGravity(17);
        addView(this.f16766c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f16766c.setText(str);
        }
        if (NullChecker.m81303a(drawable)) {
            this.f16767d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m28929d(View.OnClickListener onClickListener, View view) {
        m28927b();
        if (NullChecker.m81303a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    public FrameLayout getDraweeLayout() {
        this.f16767d.setVisibility(8);
        this.f16770g.setVisibility(0);
        return this.f16770g;
    }

    public VDraweeView getDraweeView() {
        this.f16767d.setVisibility(8);
        this.f16770g.setVisibility(0);
        this.f16768e.setVisibility(0);
        return this.f16768e;
    }

    public void setImageResource(int i) {
        this.f16767d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.ti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170340a.m28929d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f16766c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f16767d.setImageDrawable(this.f16765b);
            this.f16766c.setTextColor(-1);
        } else if (i == 2) {
            this.f16767d.setImageDrawable(this.f16764a);
            this.f16766c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public AccountCameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraMenuView(Context context) {
        this(context, null);
    }
}
