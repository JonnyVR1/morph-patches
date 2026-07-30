package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import p149l.djj;
import p149l.ftd0;
import p149l.m9c0;
import p149l.t100;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class CameraMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Drawable f39554a;

    /* JADX INFO: renamed from: b */
    public Drawable f39555b;

    /* JADX INFO: renamed from: c */
    public TextView f39556c;

    /* JADX INFO: renamed from: d */
    public ImageView f39557d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f39558e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f39559f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f39560g;

    /* JADX INFO: renamed from: h */
    public float f39561h;

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132718a, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(m9c0.f132728f);
        this.f39555b = typedArrayObtainStyledAttributes.getDrawable(m9c0.f132724d);
        this.f39554a = typedArrayObtainStyledAttributes.getDrawable(m9c0.f132726e);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(m9c0.f132720b, 20);
        this.f39561h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(m9c0.f132722c, t100.m186890d(2.0f));
        typedArrayObtainStyledAttributes.recycle();
        m61429c(string, this.f39555b, dimensionPixelOffset);
    }

    /* JADX INFO: renamed from: b */
    public final void m61428b() {
        View view = this.f39557d;
        if (xdl0.m208349O0(this.f39560g)) {
            view = this.f39560g;
        }
        View view2 = view;
        bt0.m103746s(bt0.m103739l(view2, bt0.f77162i, 30L, 50L, new LinearInterpolator(), 1.0f, 1.2f), bt0.m103739l(view2, bt0.f77162i, 0L, 50L, new LinearInterpolator(), 1.2f, 1.0f)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m61429c(String str, Drawable drawable, int i) {
        setOrientation(1);
        setClipChildren(false);
        this.f39557d = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        this.f39557d.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f39557d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f39560g = frameLayout;
        frameLayout.setVisibility(8);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
        layoutParams2.gravity = 17;
        this.f39560g.setLayoutParams(layoutParams2);
        VDraweeView vDraweeView = new VDraweeView(getContext());
        this.f39559f = vDraweeView;
        vDraweeView.setVisibility(8);
        djj hierarchy = this.f39559f.getHierarchy();
        ftd0 ftd0Var = ftd0.f99177a;
        hierarchy.m112076w(ftd0Var);
        this.f39559f.getHierarchy().m112053H(RoundingParams.m8247a());
        this.f39560g.addView(this.f39559f, layoutParams2);
        VDraweeView vDraweeView2 = new VDraweeView(getContext());
        this.f39558e = vDraweeView2;
        vDraweeView2.setVisibility(8);
        this.f39558e.getHierarchy().m112076w(ftd0Var);
        this.f39558e.getHierarchy().m112053H(RoundingParams.m8247a());
        this.f39560g.addView(this.f39558e, layoutParams2);
        addView(this.f39560g, layoutParams);
        this.f39556c = new TextView(getContext());
        int i2 = xdl0.f192404f;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 17;
        layoutParams3.topMargin = (int) this.f39561h;
        this.f39556c.setShadowLayer(2.0f, 0.0f, 2.0f, Color.parseColor("#34000000"));
        this.f39556c.setTextSize(10.0f);
        this.f39556c.setTextColor(-1);
        this.f39556c.setGravity(17);
        addView(this.f39556c, layoutParams3);
        if (!TextUtils.isEmpty(str)) {
            this.f39556c.setText(str);
        }
        if (NullChecker.m81303a(drawable)) {
            this.f39557d.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m61430d(View.OnClickListener onClickListener, View view) {
        m61428b();
        if (NullChecker.m81303a(onClickListener)) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m61431e() {
        this.f39557d.setVisibility(0);
        this.f39560g.setVisibility(8);
    }

    public FrameLayout getDraweeLayout() {
        this.f39557d.setVisibility(8);
        this.f39560g.setVisibility(0);
        return this.f39560g;
    }

    public VDraweeView getDraweeView() {
        this.f39557d.setVisibility(8);
        this.f39560g.setVisibility(0);
        this.f39558e.setVisibility(0);
        return this.f39558e;
    }

    public void setImageResource(int i) {
        this.f39557d.setImageResource(i);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        super.setOnClickListener(new View.OnClickListener() { // from class: l.l94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126913a.m61430d(onClickListener, view);
            }
        });
    }

    public void setText(String str) {
        this.f39556c.setText(str);
    }

    public void setThemeType(int i) {
        if (i == 1) {
            this.f39557d.setImageDrawable(this.f39555b);
            this.f39556c.setTextColor(-1);
        } else if (i == 2) {
            this.f39557d.setImageDrawable(this.f39554a);
            this.f39556c.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
    }

    public CameraMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraMenuView(Context context) {
        this(context, null);
    }
}
