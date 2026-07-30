package com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.dt0;
import l.t100;
import p002l.p9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HorizontalMarqueeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public int f6218a;

    /* JADX INFO: renamed from: b */
    public int f6219b;

    /* JADX INFO: renamed from: c */
    public int f6220c;

    /* JADX INFO: renamed from: d */
    public int f6221d;

    /* JADX INFO: renamed from: e */
    public String f6222e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f6223f;

    /* JADX INFO: renamed from: g */
    public TextView f6224g;

    /* JADX INFO: renamed from: h */
    public int f6225h;

    /* JADX INFO: renamed from: i */
    public int f6226i;

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6223f = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17148r);
        this.f6218a = typedArrayObtainStyledAttributes.getColor(p9c0.f17152v, Color.parseColor("#ffffffff"));
        this.f6219b = typedArrayObtainStyledAttributes.getInteger(p9c0.f17154x, 12);
        this.f6220c = typedArrayObtainStyledAttributes.getColor(p9c0.f17149s, 0);
        this.f6221d = typedArrayObtainStyledAttributes.getInteger(p9c0.f17150t, 0);
        this.f6222e = typedArrayObtainStyledAttributes.getString(p9c0.f17153w);
        this.f6226i = t100.d(typedArrayObtainStyledAttributes.getColor(p9c0.f17151u, 0));
        typedArrayObtainStyledAttributes.recycle();
        m7875a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7875a() {
        setHorizontalScrollBarEnabled(false);
        this.f6224g = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388627;
        setContentLayoutParams(layoutParams);
        setGravity(8388611);
        setTextSize(this.f6219b);
        setTextColor(this.f6218a);
        setMarqueeText(this.f6222e);
        setMaxLines(1);
        setBackgroundColor(this.f6220c);
        requestDisallowInterceptTouchEvent(true);
        addView(this.f6224g);
    }

    /* JADX INFO: renamed from: b */
    public void m7876b() {
        dt0.A(this.f6223f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6224g, "translationX", -this.f6225h, 0.0f);
        this.f6223f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(0L);
        this.f6223f.start();
    }

    /* JADX INFO: renamed from: c */
    public void m7877c(int i, Runnable runnable, int i2) {
        if (getWidth() == 0 || this.f6224g.getMeasuredWidth() <= getWidth()) {
            this.f6225h = 1;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f6224g, "translationX", 0.0f, 0.0f);
            this.f6223f = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setStartDelay(2500L);
            this.f6223f.setDuration(0L);
        } else {
            if (NullChecker.a(this.f6223f)) {
                this.f6223f.cancel();
            }
            int width = ((-this.f6224g.getMeasuredWidth()) + getWidth()) - t100.d(i2);
            this.f6225h = width;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f6224g, "translationX", 0.0f, width);
            this.f6223f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setStartDelay(i);
            this.f6223f.setDuration((long) (this.f6221d * (Math.abs(this.f6225h) / t100.d(50.0f))));
        }
        this.f6223f.setInterpolator(new LinearInterpolator());
        bt0.f(this.f6223f, runnable);
        this.f6223f.start();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f6226i;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    public void setAnimDuration(int i) {
        this.f6221d = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        this.f6224g.setBackgroundColor(this.f6220c);
    }

    public void setContentLayoutParams(FrameLayout.LayoutParams layoutParams) {
        this.f6224g.setLayoutParams(layoutParams);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f6224g.setEllipsize(truncateAt);
    }

    public void setGravity(int i) {
        this.f6224g.setGravity(i);
    }

    public void setMarqueeText(CharSequence charSequence) {
        TextView textView = this.f6224g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setMaxLines(int i) {
        this.f6224g.setMaxLines(i);
    }

    public void setSingleLine(boolean z) {
        this.f6224g.setSingleLine(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f6224g.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f6224g.setTextSize(0, f);
    }

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalMarqueeView(Context context) {
        this(context, null);
    }
}
