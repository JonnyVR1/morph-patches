package com.p000p1.mobile.putong.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantan.library.svga.SVGAnimationView;
import l.e6c0;
import l.qib0;
import l.s4c0;
import l.t100;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VIPShimmerTag extends ConstraintLayout {

    /* JADX INFO: renamed from: l */
    public static final int[] f7814l = {Color.parseColor("#f3b50c"), Color.parseColor("#f3b50c")};

    /* JADX INFO: renamed from: m */
    public static final int[] f7815m = {Color.parseColor("#ff9719"), Color.parseColor("#ff6a0c")};

    /* JADX INFO: renamed from: n */
    public static final int[] f7816n = {Color.parseColor("#fe7e1d"), Color.parseColor("#fe7e1d")};

    /* JADX INFO: renamed from: d */
    public View f7817d;

    /* JADX INFO: renamed from: e */
    public TextView f7818e;

    /* JADX INFO: renamed from: f */
    public VImage f7819f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f7820g;

    /* JADX INFO: renamed from: h */
    public int f7821h;

    /* JADX INFO: renamed from: i */
    public long f7822i;

    /* JADX INFO: renamed from: j */
    public CharSequence f7823j;

    /* JADX INFO: renamed from: k */
    public boolean f7824k;

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7821h = t100.g;
        this.f7824k = false;
        m9538r();
    }

    private void setBackground(int[] iArr) {
        float f = this.f7821h;
        float[] fArr = {f, f, f, f, f, f, f, f};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        this.f7817d.setBackground(gradientDrawable);
    }

    public ImageView getImageView() {
        return this.f7819f;
    }

    /* JADX INFO: renamed from: h0 */
    public void m9537h0() {
        this.f7824k = true;
        this.f7823j = null;
        this.f7822i = 0L;
        xdl0.M0(this.f7820g, false);
        this.f7820g.stopAnimation(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m9537h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m9538r() {
        LayoutInflater.from(getContext()).inflate(e6c0.p, (ViewGroup) this);
        this.f7817d = findViewById(s4c0.j0);
        this.f7818e = (TextView) findViewById(s4c0.m0);
        this.f7819f = findViewById(s4c0.l0);
        this.f7820g = findViewById(s4c0.k0);
        qib0.b0.b.bs(getContext(), this, qib0.b0.b.Y3());
    }

    public void setBackgroundRoundRadius(int i) {
        this.f7821h = i;
    }

    public void setImageMarginTB(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7819f.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        this.f7819f.setLayoutParams(layoutParams);
    }

    public void setImageResource(@DrawableRes int i) {
        xdl0.M(this.f7818e, false);
        xdl0.M(this.f7819f, true);
        this.f7819f.setImageResource(i);
    }

    public void setLeftRightPadding(int i) {
        this.f7817d.setPadding(i, 0, i, 0);
    }

    public void setTagType(CharSequence charSequence) {
        this.f7823j = charSequence;
        if (TextUtils.equals(charSequence, "advanced")) {
            setBackground(f7815m);
        } else if (TextUtils.equals(charSequence, "svip")) {
            setBackground(f7816n);
        } else {
            setBackground(f7814l);
        }
    }

    public void setText(CharSequence charSequence) {
        xdl0.M(this.f7819f, false);
        xdl0.M(this.f7818e, true);
        this.f7818e.setText(charSequence);
    }

    public void setTextColor(@ColorInt int i) {
        this.f7818e.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f7818e.setTextSize(f);
    }

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VIPShimmerTag(@NonNull Context context) {
        this(context, null);
    }
}
