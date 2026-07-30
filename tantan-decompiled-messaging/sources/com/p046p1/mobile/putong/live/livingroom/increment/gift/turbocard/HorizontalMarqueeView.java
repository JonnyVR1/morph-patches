package com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard;

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
import p149l.bt0;
import p149l.dt0;
import p149l.p9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class HorizontalMarqueeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public int f50176a;

    /* JADX INFO: renamed from: b */
    public int f50177b;

    /* JADX INFO: renamed from: c */
    public int f50178c;

    /* JADX INFO: renamed from: d */
    public int f50179d;

    /* JADX INFO: renamed from: e */
    public String f50180e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f50181f;

    /* JADX INFO: renamed from: g */
    public TextView f50182g;

    /* JADX INFO: renamed from: h */
    public int f50183h;

    /* JADX INFO: renamed from: i */
    public int f50184i;

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50181f = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147751r);
        this.f50176a = typedArrayObtainStyledAttributes.getColor(p9c0.f147755v, Color.parseColor("#ffffffff"));
        this.f50177b = typedArrayObtainStyledAttributes.getInteger(p9c0.f147757x, 12);
        this.f50178c = typedArrayObtainStyledAttributes.getColor(p9c0.f147752s, 0);
        this.f50179d = typedArrayObtainStyledAttributes.getInteger(p9c0.f147753t, 0);
        this.f50180e = typedArrayObtainStyledAttributes.getString(p9c0.f147756w);
        this.f50184i = t100.m186890d(typedArrayObtainStyledAttributes.getColor(p9c0.f147754u, 0));
        typedArrayObtainStyledAttributes.recycle();
        m74294a();
    }

    /* JADX INFO: renamed from: a */
    public final void m74294a() {
        setHorizontalScrollBarEnabled(false);
        this.f50182g = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388627;
        setContentLayoutParams(layoutParams);
        setGravity(8388611);
        setTextSize(this.f50177b);
        setTextColor(this.f50176a);
        setMarqueeText(this.f50180e);
        setMaxLines(1);
        setBackgroundColor(this.f50178c);
        requestDisallowInterceptTouchEvent(true);
        addView(this.f50182g);
    }

    /* JADX INFO: renamed from: b */
    public void m74295b() {
        dt0.m113501A(this.f50181f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50182g, "translationX", -this.f50183h, 0.0f);
        this.f50181f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(0L);
        this.f50181f.start();
    }

    /* JADX INFO: renamed from: c */
    public void m74296c(int i, Runnable runnable, int i2) {
        if (getWidth() == 0 || this.f50182g.getMeasuredWidth() <= getWidth()) {
            this.f50183h = 1;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f50182g, "translationX", 0.0f, 0.0f);
            this.f50181f = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setStartDelay(2500L);
            this.f50181f.setDuration(0L);
        } else {
            if (NullChecker.m81303a(this.f50181f)) {
                this.f50181f.cancel();
            }
            int width = ((-this.f50182g.getMeasuredWidth()) + getWidth()) - t100.m186890d(i2);
            this.f50183h = width;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f50182g, "translationX", 0.0f, width);
            this.f50181f = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setStartDelay(i);
            this.f50181f.setDuration((long) (this.f50179d * (Math.abs(this.f50183h) / t100.m186890d(50.0f))));
        }
        this.f50181f.setInterpolator(new LinearInterpolator());
        bt0.m103733f(this.f50181f, runnable);
        this.f50181f.start();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f50184i;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), i2);
    }

    public void setAnimDuration(int i) {
        this.f50179d = i;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        this.f50182g.setBackgroundColor(this.f50178c);
    }

    public void setContentLayoutParams(FrameLayout.LayoutParams layoutParams) {
        this.f50182g.setLayoutParams(layoutParams);
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f50182g.setEllipsize(truncateAt);
    }

    public void setGravity(int i) {
        this.f50182g.setGravity(i);
    }

    public void setMarqueeText(CharSequence charSequence) {
        TextView textView = this.f50182g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setMaxLines(int i) {
        this.f50182g.setMaxLines(i);
    }

    public void setSingleLine(boolean z) {
        this.f50182g.setSingleLine(z);
    }

    public void setTextColor(@ColorInt int i) {
        this.f50182g.setTextColor(i);
    }

    public void setTextSize(float f) {
        this.f50182g.setTextSize(0, f);
    }

    public HorizontalMarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalMarqueeView(Context context) {
        this(context, null);
    }
}
