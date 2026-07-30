package com.p051p1.mobile.putong.newui.view;

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
import p151v.VImage;
import p153l.bnl0;
import p153l.jec0;
import p153l.qa00;
import p153l.uqb0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class VIPShimmerTag extends ConstraintLayout {

    /* JADX INFO: renamed from: l */
    public static final int[] f55056l = {Color.parseColor("#f3b50c"), Color.parseColor("#f3b50c")};

    /* JADX INFO: renamed from: m */
    public static final int[] f55057m = {Color.parseColor("#ff9719"), Color.parseColor("#ff6a0c")};

    /* JADX INFO: renamed from: n */
    public static final int[] f55058n = {Color.parseColor("#fe7e1d"), Color.parseColor("#fe7e1d")};

    /* JADX INFO: renamed from: d */
    public View f55059d;

    /* JADX INFO: renamed from: e */
    public TextView f55060e;

    /* JADX INFO: renamed from: f */
    public VImage f55061f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f55062g;

    /* JADX INFO: renamed from: h */
    public int f55063h;

    /* JADX INFO: renamed from: i */
    public long f55064i;

    /* JADX INFO: renamed from: j */
    public CharSequence f55065j;

    /* JADX INFO: renamed from: k */
    public boolean f55066k;

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55063h = qa00.f156320g;
        this.f55066k = false;
        m80402r();
    }

    private void setBackground(int[] iArr) {
        float f = this.f55063h;
        float[] fArr = {f, f, f, f, f, f, f, f};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        this.f55059d.setBackground(gradientDrawable);
    }

    public ImageView getImageView() {
        return this.f55061f;
    }

    /* JADX INFO: renamed from: h0 */
    public void m80401h0() {
        this.f55066k = true;
        this.f55065j = null;
        this.f55064i = 0L;
        bnl0.m105525M0(this.f55062g, false);
        this.f55062g.stopAnimation(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80401h0();
    }

    /* JADX INFO: renamed from: r */
    public void m80402r() {
        LayoutInflater.from(getContext()).inflate(jec0.f120470p, this);
        this.f55059d = findViewById(ycc0.f198463j0);
        this.f55060e = (TextView) findViewById(ycc0.f198469m0);
        this.f55061f = (VImage) findViewById(ycc0.f198467l0);
        this.f55062g = (SVGAnimationView) findViewById(ycc0.f198465k0);
        uqb0.f180396b0.f170325b.mo31751bs(getContext(), this, uqb0.f180396b0.f170325b.mo31739Y3());
    }

    public void setBackgroundRoundRadius(int i) {
        this.f55063h = i;
    }

    public void setImageMarginTB(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f55061f.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        this.f55061f.setLayoutParams(layoutParams);
    }

    public void setImageResource(@DrawableRes int i) {
        bnl0.m105524M(this.f55060e, false);
        bnl0.m105524M(this.f55061f, true);
        this.f55061f.setImageResource(i);
    }

    public void setLeftRightPadding(int i) {
        this.f55059d.setPadding(i, 0, i, 0);
    }

    public void setTagType(CharSequence charSequence) {
        this.f55065j = charSequence;
        if (TextUtils.equals(charSequence, "advanced")) {
            setBackground(f55057m);
        } else if (TextUtils.equals(charSequence, "svip")) {
            setBackground(f55058n);
        } else {
            setBackground(f55056l);
        }
    }

    public void setText(CharSequence charSequence) {
        bnl0.m105524M(this.f55061f, false);
        bnl0.m105524M(this.f55060e, true);
        this.f55060e.setText(charSequence);
    }

    public void setTextColor(@ColorInt int i) {
        this.f55060e.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f55060e.setTextSize(f);
    }

    public VIPShimmerTag(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VIPShimmerTag(@NonNull Context context) {
        this(context, null);
    }
}
