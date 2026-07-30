package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.bounty;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import p153l.gt0;
import p153l.it0;
import p153l.qa00;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
public class PkHorizontalMarqueeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public int f52621a;

    /* JADX INFO: renamed from: b */
    public int f52622b;

    /* JADX INFO: renamed from: c */
    public int f52623c;

    /* JADX INFO: renamed from: d */
    public int f52624d;

    /* JADX INFO: renamed from: e */
    public String f52625e;

    /* JADX INFO: renamed from: f */
    public Animator f52626f;

    /* JADX INFO: renamed from: g */
    public TextView f52627g;

    public PkHorizontalMarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52626f = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184150r);
        this.f52621a = typedArrayObtainStyledAttributes.getColor(vhc0.f184154v, 0);
        this.f52622b = typedArrayObtainStyledAttributes.getInteger(vhc0.f184156x, 0);
        this.f52623c = typedArrayObtainStyledAttributes.getColor(vhc0.f184151s, 0);
        this.f52624d = typedArrayObtainStyledAttributes.getInteger(vhc0.f184152t, 0);
        this.f52625e = typedArrayObtainStyledAttributes.getString(vhc0.f184155w);
        typedArrayObtainStyledAttributes.recycle();
        m77469c();
    }

    /* JADX INFO: renamed from: b */
    public void m77468b() {
        Animator animator = this.f52626f;
        if (animator != null) {
            it0.m142007A(animator);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77469c() {
        setHorizontalScrollBarEnabled(false);
        setFadingEdgeLength(qa00.m175859d(14.0f));
        setHorizontalFadingEdgeEnabled(true);
        this.f52627g = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f52627g.setTextSize(2, this.f52622b);
        this.f52627g.setTextColor(this.f52621a);
        this.f52627g.setText(this.f52625e);
        this.f52627g.setMaxLines(1);
        this.f52627g.setBackgroundColor(this.f52623c);
        this.f52627g.setGravity(17);
        layoutParams.gravity = 16;
        this.f52627g.setLayoutParams(layoutParams);
        requestDisallowInterceptTouchEvent(true);
        addView(this.f52627g);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m77470d() {
        this.f52627g.setVisibility(0);
    }

    /* JADX INFO: renamed from: e */
    public void m77471e(int i, Runnable runnable) {
        this.f52627g.setVisibility(8);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f52627g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f52627g.getMeasuredWidth();
        int iM175859d = qa00.m175859d(96.0f);
        if (measuredWidth > iM175859d) {
            if (NullChecker.m82486a(this.f52626f)) {
                this.f52626f.cancel();
            }
            Animator animatorM132170p = gt0.m132170p(this.f52627g, "translationX", i, (long) (this.f52624d * (Math.abs(measuredWidth + iM175859d) / qa00.m175859d(48.0f))), new LinearInterpolator(), iM175859d, -measuredWidth);
            this.f52626f = animatorM132170p;
            gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.jx70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123009a.m77470d();
                }
            });
        } else {
            this.f52626f = gt0.m132170p(this.f52627g, "translationX", 2500L, 0L, new LinearInterpolator(), 0.0f, 0.0f);
            this.f52627g.setVisibility(0);
        }
        gt0.m132160f(this.f52626f, runnable);
        this.f52626f.start();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return 1.0f;
    }

    public CharSequence getMarqueeText() {
        TextView textView = this.f52627g;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77468b();
    }

    public void setAnimDuration(int i) {
        this.f52624d = i;
    }

    public void setMarqueeText(CharSequence charSequence) {
        TextView textView = this.f52627g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public PkHorizontalMarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PkHorizontalMarqueeView(Context context) {
        this(context, null);
    }
}
