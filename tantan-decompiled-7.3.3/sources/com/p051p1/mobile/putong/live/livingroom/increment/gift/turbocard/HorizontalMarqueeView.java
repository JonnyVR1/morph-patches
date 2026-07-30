package com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard;

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
import p153l.gt0;
import p153l.it0;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalMarqueeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public int f51024a;

    /* JADX INFO: renamed from: b */
    public int f51025b;

    /* JADX INFO: renamed from: c */
    public int f51026c;

    /* JADX INFO: renamed from: d */
    public int f51027d;

    /* JADX INFO: renamed from: e */
    public String f51028e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f51029f;

    /* JADX INFO: renamed from: g */
    public TextView f51030g;

    /* JADX INFO: renamed from: h */
    public int f51031h;

    /* JADX INFO: renamed from: i */
    public int f51032i;

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51029f = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184150r);
        this.f51024a = typedArrayObtainStyledAttributes.getColor(vhc0.f184154v, Color.parseColor("#ffffffff"));
        this.f51025b = typedArrayObtainStyledAttributes.getInteger(vhc0.f184156x, 12);
        this.f51026c = typedArrayObtainStyledAttributes.getColor(vhc0.f184151s, 0);
        this.f51027d = typedArrayObtainStyledAttributes.getInteger(vhc0.f184152t, 0);
        this.f51028e = typedArrayObtainStyledAttributes.getString(vhc0.f184155w);
        this.f51032i = qa00.m175859d(typedArrayObtainStyledAttributes.getColor(vhc0.f184153u, 0));
        typedArrayObtainStyledAttributes.recycle();
        m75477a();
    }

    /* JADX INFO: renamed from: a */
    public final void m75477a() {
        setHorizontalScrollBarEnabled(false);
        this.f51030g = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388627;
        setContentLayoutParams(layoutParams);
        setGravity(8388611);
        setTextSize(this.f51025b);
        setTextColor(this.f51024a);
        setMarqueeText(this.f51028e);
        setMaxLines(1);
        setBackgroundColor(this.f51026c);
        requestDisallowInterceptTouchEvent(true);
        addView(this.f51030g);
    }

    /* JADX INFO: renamed from: b */
    public void m75478b() {
        it0.m142007A(this.f51029f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51030g, "translationX", -this.f51031h, 0.0f);
        this.f51029f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(0L);
        this.f51029f.start();
    }

    /* JADX INFO: renamed from: c */
    public void m75479c(int i, Runnable runnable, int i2) {
        if (getWidth() == 0 || this.f51030g.getMeasuredWidth() <= getWidth()) {
            this.f51031h = 1;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f51030g, "translationX", 0.0f, 0.0f);
            this.f51029f = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setStartDelay(2500L);
            this.f51029f.setDuration(0L);
        } else {
            if (NullChecker.m82486a(this.f51029f)) {
                this.f51029f.cancel();
            }
            int width = ((-this.f51030g.getMeasuredWidth()) + getWidth()) - qa00.m175859d(i2);
            this.f51031h = width;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f51030g, "translationX", 0.0f, width);
            this.f51029f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setStartDelay(i);
            this.f51029f.setDuration((long) (this.f51027d * (Math.abs(this.f51031h) / qa00.m175859d(50.0f))));
        }
        this.f51029f.setInterpolator(new LinearInterpolator());
        gt0.m132160f(this.f51029f, runnable);
        this.f51029f.start();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f51032i;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    public void setAnimDuration(int i) {
        this.f51027d = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        this.f51030g.setBackgroundColor(this.f51026c);
    }

    public void setContentLayoutParams(FrameLayout.LayoutParams layoutParams) {
        this.f51030g.setLayoutParams(layoutParams);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f51030g.setEllipsize(truncateAt);
    }

    public void setGravity(int i) {
        this.f51030g.setGravity(i);
    }

    public void setMarqueeText(CharSequence charSequence) {
        TextView textView = this.f51030g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setMaxLines(int i) {
        this.f51030g.setMaxLines(i);
    }

    public void setSingleLine(boolean z) {
        this.f51030g.setSingleLine(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f51030g.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f51030g.setTextSize(0, f);
    }

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalMarqueeView(Context context) {
        this(context, null);
    }
}
