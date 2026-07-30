package com.p046p1.mobile.putong.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p149l.e6c0;
import p149l.qib0;
import p149l.s4c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VIPShimmerTag extends ConstraintLayout {

    /* JADX INFO: renamed from: l */
    public static final int[] f54208l = {Color.parseColor("#f3b50c"), Color.parseColor("#f3b50c")};

    /* JADX INFO: renamed from: m */
    public static final int[] f54209m = {Color.parseColor("#ff9719"), Color.parseColor("#ff6a0c")};

    /* JADX INFO: renamed from: n */
    public static final int[] f54210n = {Color.parseColor("#fe7e1d"), Color.parseColor("#fe7e1d")};

    /* JADX INFO: renamed from: d */
    public View f54211d;

    /* JADX INFO: renamed from: e */
    public TextView f54212e;

    /* JADX INFO: renamed from: f */
    public VImage f54213f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f54214g;

    /* JADX INFO: renamed from: h */
    public int f54215h;

    /* JADX INFO: renamed from: i */
    public long f54216i;

    /* JADX INFO: renamed from: j */
    public CharSequence f54217j;

    /* JADX INFO: renamed from: k */
    public boolean f54218k;

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54215h = t100.f167258g;
        this.f54218k = false;
        m79219r();
    }

    private void setBackground(int[] iArr) {
        float f = this.f54215h;
        float[] fArr = {f, f, f, f, f, f, f, f};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        this.f54211d.setBackground(gradientDrawable);
    }

    public ImageView getImageView() {
        return this.f54213f;
    }

    /* JADX INFO: renamed from: h0 */
    public void m79218h0() {
        this.f54218k = true;
        this.f54217j = null;
        this.f54216i = 0L;
        xdl0.m208345M0(this.f54214g, false);
        this.f54214g.stopAnimation(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79218h0();
    }

    /* JADX INFO: renamed from: r */
    public void m79219r() {
        LayoutInflater.from(getContext()).inflate(e6c0.f89557p, this);
        this.f54211d = findViewById(s4c0.f162342j0);
        this.f54212e = (TextView) findViewById(s4c0.f162348m0);
        this.f54213f = (VImage) findViewById(s4c0.f162346l0);
        this.f54214g = (SVGAnimationView) findViewById(s4c0.f162344k0);
        qib0.f154713b0.f139231b.mo30748bs(getContext(), this, qib0.f154713b0.f139231b.mo30736Y3());
    }

    public void setBackgroundRoundRadius(int i) {
        this.f54215h = i;
    }

    public void setImageMarginTB(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54213f.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        this.f54213f.setLayoutParams(layoutParams);
    }

    public void setImageResource(@DrawableRes int i) {
        xdl0.m208344M(this.f54212e, false);
        xdl0.m208344M(this.f54213f, true);
        this.f54213f.setImageResource(i);
    }

    public void setLeftRightPadding(int i) {
        this.f54211d.setPadding(i, 0, i, 0);
    }

    public void setTagType(CharSequence charSequence) {
        this.f54217j = charSequence;
        if (TextUtils.equals(charSequence, "advanced")) {
            setBackground(f54209m);
        } else if (TextUtils.equals(charSequence, "svip")) {
            setBackground(f54210n);
        } else {
            setBackground(f54208l);
        }
    }

    public void setText(CharSequence charSequence) {
        xdl0.m208344M(this.f54213f, false);
        xdl0.m208344M(this.f54212e, true);
        this.f54212e.setText(charSequence);
    }

    public void setTextColor(@ColorInt int i) {
        this.f54212e.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f54212e.setTextSize(f);
    }

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VIPShimmerTag(@NonNull Context context) {
        this(context, null);
    }
}
