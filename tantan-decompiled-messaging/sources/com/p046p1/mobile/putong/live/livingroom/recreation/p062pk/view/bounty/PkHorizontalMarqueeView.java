package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.bounty;

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
import p149l.bt0;
import p149l.dt0;
import p149l.p9c0;
import p149l.t100;

/* JADX INFO: loaded from: classes5.dex */
public class PkHorizontalMarqueeView extends HorizontalScrollView {

    /* JADX INFO: renamed from: a */
    public int f51773a;

    /* JADX INFO: renamed from: b */
    public int f51774b;

    /* JADX INFO: renamed from: c */
    public int f51775c;

    /* JADX INFO: renamed from: d */
    public int f51776d;

    /* JADX INFO: renamed from: e */
    public String f51777e;

    /* JADX INFO: renamed from: f */
    public Animator f51778f;

    /* JADX INFO: renamed from: g */
    public TextView f51779g;

    public PkHorizontalMarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51778f = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147751r);
        this.f51773a = typedArrayObtainStyledAttributes.getColor(p9c0.f147755v, 0);
        this.f51774b = typedArrayObtainStyledAttributes.getInteger(p9c0.f147757x, 0);
        this.f51775c = typedArrayObtainStyledAttributes.getColor(p9c0.f147752s, 0);
        this.f51776d = typedArrayObtainStyledAttributes.getInteger(p9c0.f147753t, 0);
        this.f51777e = typedArrayObtainStyledAttributes.getString(p9c0.f147756w);
        typedArrayObtainStyledAttributes.recycle();
        m76286c();
    }

    /* JADX INFO: renamed from: b */
    public void m76285b() {
        Animator animator = this.f51778f;
        if (animator != null) {
            dt0.m113501A(animator);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76286c() {
        setHorizontalScrollBarEnabled(false);
        setFadingEdgeLength(t100.m186890d(14.0f));
        setHorizontalFadingEdgeEnabled(true);
        this.f51779g = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f51779g.setTextSize(2, this.f51774b);
        this.f51779g.setTextColor(this.f51773a);
        this.f51779g.setText(this.f51777e);
        this.f51779g.setMaxLines(1);
        this.f51779g.setBackgroundColor(this.f51775c);
        this.f51779g.setGravity(17);
        layoutParams.gravity = 16;
        this.f51779g.setLayoutParams(layoutParams);
        requestDisallowInterceptTouchEvent(true);
        addView(this.f51779g);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m76287d() {
        this.f51779g.setVisibility(0);
    }

    /* JADX INFO: renamed from: e */
    public void m76288e(int i, Runnable runnable) {
        this.f51779g.setVisibility(8);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f51779g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f51779g.getMeasuredWidth();
        int iM186890d = t100.m186890d(96.0f);
        if (measuredWidth > iM186890d) {
            if (NullChecker.m81303a(this.f51778f)) {
                this.f51778f.cancel();
            }
            Animator animatorM103743p = bt0.m103743p(this.f51779g, "translationX", i, (long) (this.f51776d * (Math.abs(measuredWidth + iM186890d) / t100.m186890d(48.0f))), new LinearInterpolator(), iM186890d, -measuredWidth);
            this.f51778f = animatorM103743p;
            bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.dp70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87244a.m76287d();
                }
            });
        } else {
            this.f51778f = bt0.m103743p(this.f51779g, "translationX", 2500L, 0L, new LinearInterpolator(), 0.0f, 0.0f);
            this.f51779g.setVisibility(0);
        }
        bt0.m103733f(this.f51778f, runnable);
        this.f51778f.start();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return 1.0f;
    }

    public CharSequence getMarqueeText() {
        TextView textView = this.f51779g;
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76285b();
    }

    public void setAnimDuration(int i) {
        this.f51776d = i;
    }

    public void setMarqueeText(CharSequence charSequence) {
        TextView textView = this.f51779g;
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
