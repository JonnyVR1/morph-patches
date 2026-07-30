package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.gt0;
import p153l.h1e0;
import p153l.qa00;
import p153l.shc0;
import p153l.wlj;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class CameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f40402a;

    /* JADX INFO: renamed from: b */
    public Drawable f40403b;

    /* JADX INFO: renamed from: c */
    public TextView f40404c;

    /* JADX INFO: renamed from: d */
    public ImageView f40405d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f40406e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f40407f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f40408g;

    /* JADX INFO: renamed from: h */
    public float f40409h;

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168640a, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(shc0.f168650f);
        this.f40403b = typedArrayObtainStyledAttributes.getDrawable(shc0.f168646d);
        this.f40402a = typedArrayObtainStyledAttributes.getDrawable(shc0.f168648e);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(shc0.f168642b, 20);
        this.f40409h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(shc0.f168644c, qa00.m175859d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m62613c(string, this.f40403b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m62612b() {
        View view = this.f40405d;
        if (bnl0.m105529O0(this.f40408g)) {
            view = this.f40408g;
        }
        View view2 = view;
        gt0.m132173s(gt0.m132166l(view2, gt0.f106354i, 30L, 50L, new LinearInterpolator(), 1.0f, 1.2f), gt0.m132166l(view2, gt0.f106354i, 0L, 50L, new LinearInterpolator(), 1.2f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m62613c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f40405d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f40405d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f40405d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f40408g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f40408g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f40407f = vDraweeView;
        vDraweeView.setVisibility(8);
        wlj hierarchy = this.f40407f.getHierarchy();
        h1e0 h1e0Var = h1e0.f107444a;
        hierarchy.m207062w(h1e0Var);
        this.f40407f.getHierarchy().m207045H(RoundingParams.m8301a());
        this.f40408g.addView(this.f40407f, layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f40406e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f40406e.getHierarchy().m207062w(h1e0Var);
        this.f40406e.getHierarchy().m207045H(RoundingParams.m8301a());
        this.f40408g.addView(this.f40406e, layoutParams2);
        addView(this.f40408g, layoutParams);
        this.f40404c = new TextView(getContext());
        int i2 = bnl0.f77545f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f40409h;
        this.f40404c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f40404c.setTextSize(10.0f);
        this.f40404c.setTextColor(-1);
        this.f40404c.setGravity(17);
        addView(this.f40404c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f40404c.setText(str);
        }
        if (NullChecker.m82486a(drawable)) {
            this.f40405d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m62614d(View.OnClickListener onClickListener, View view) {
        m62612b();
        if (NullChecker.m82486a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m62615e() {
        this.f40405d.setVisibility(0);
        this.f40408g.setVisibility(8);
    }

    public FrameLayout getDraweeLayout() {
        this.f40405d.setVisibility(8);
        this.f40408g.setVisibility(0);
        return this.f40408g;
    }

    public VDraweeView getDraweeView() {
        this.f40405d.setVisibility(8);
        this.f40408g.setVisibility(0);
        this.f40406e.setVisibility(0);
        return this.f40406e;
    }

    public void setImageResource(int i) {
        this.f40405d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.ka4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124622a.m62614d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f40404c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f40405d.setImageDrawable(this.f40403b);
            this.f40404c.setTextColor(-1);
        } else if (i == 2) {
            this.f40405d.setImageDrawable(this.f40402a);
            this.f40404c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraMenuView(Context context) {
        this(context, null);
    }
}
