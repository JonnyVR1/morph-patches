package com.p000p1.mobile.putong.feed.newui.view;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.djj;
import l.ejj;
import l.ftd0;
import l.qib0;
import l.t100;
import l.vwb;
import p007l.f3c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveSquareFloatingAnim extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f4931a;

    /* JADX INFO: renamed from: b */
    public int f4932b;

    /* JADX INFO: renamed from: c */
    public int f4933c;

    /* JADX INFO: renamed from: d */
    public int f4934d;

    /* JADX INFO: renamed from: e */
    public int f4935e;

    /* JADX INFO: renamed from: f */
    public int f4936f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C2232a> f4937g;

    /* JADX INFO: renamed from: h */
    public Animator f4938h;

    /* JADX INFO: renamed from: i */
    public Animator f4939i;

    /* JADX INFO: renamed from: j */
    public Animator f4940j;

    /* JADX INFO: renamed from: k */
    public ArrayList<Picture.ImageUri> f4941k;

    /* JADX INFO: renamed from: l */
    public RunnableC2233b f4942l;

    /* JADX INFO: renamed from: m */
    public int f4943m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$a */
    public class C2232a {

        /* JADX INFO: renamed from: a */
        public int f4944a;

        /* JADX INFO: renamed from: b */
        public int f4945b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f4946c;

        public C2232a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$b */
    public class RunnableC2233b implements Runnable {
        public RunnableC2233b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveSquareFloatingAnim.this.m7583j();
            LiveSquareFloatingAnim.this.postDelayed(this, 2000L);
        }
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7577d();
        m7578e();
    }

    private Picture.ImageUri getNextImgUrl() {
        int size = this.f4943m % this.f4941k.size();
        this.f4943m = size;
        Picture.ImageUri imageUri = this.f4941k.get(size);
        this.f4943m++;
        return imageUri;
    }

    /* JADX INFO: renamed from: b */
    public final void m7575b(Animator animator) {
        if (NullChecker.a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final VDraweeView m7576c() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.v(true);
        roundingParams.o(getResources().getColor(R.color.white), t100.d(2.0f));
        djj djjVarA = new ejj(getResources()).a();
        djjVarA.D(f3c0.f7933w1);
        djjVarA.w(ftd0.i);
        djjVarA.H(roundingParams);
        vDraweeView.setHierarchy(djjVarA);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: d */
    public final void m7577d() {
        this.f4931a = t100.d(36.0f);
        this.f4932b = t100.d(8.0f);
        this.f4934d = t100.d(0.0f);
        this.f4933c = 3;
        this.f4942l = new RunnableC2233b();
        this.f4937g = new ArrayList<>();
        this.f4941k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e */
    public final void m7578e() {
        m7575b(this.f4939i);
        m7575b(this.f4938h);
        m7575b(this.f4940j);
        setChildrenDrawingOrderEnabled(true);
        removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public void m7579f() {
        this.f4943m = 0;
        m7575b(this.f4939i);
        m7575b(this.f4938h);
        m7575b(this.f4940j);
        this.f4937g.clear();
        removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public final void m7580g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f4931a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f4938h = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        this.f4938h.setStartDelay(200L);
        this.f4938h.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f4937g.size() ? i2 : this.f4937g.get(i2).f4945b;
    }

    /* JADX INFO: renamed from: h */
    public final void m7581h(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f4940j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f4940j.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m7582i(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f4931a) + this.f4932b));
        this.f4939i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f4939i.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m7583j() {
        if (NullChecker.a(this.f4939i) && this.f4939i.isRunning()) {
            return;
        }
        if ((NullChecker.a(this.f4938h) && this.f4938h.isRunning()) || vwb.J(this.f4941k)) {
            return;
        }
        int i = 0;
        if (this.f4937g.size() >= this.f4935e) {
            while (i < this.f4937g.size()) {
                C2232a c2232a = this.f4937g.get(i);
                int i2 = c2232a.f4944a;
                int i3 = this.f4933c;
                int i4 = this.f4935e;
                int i5 = (i2 + i3) % i4;
                c2232a.f4944a = i5;
                c2232a.f4945b = (c2232a.f4945b + 1) % i4;
                if (i5 == i3) {
                    c2232a.f4946c.setTranslationX(this.f4936f);
                    c2232a.f4946c.setAlpha(1.0f);
                    qib0.G.Q0(c2232a.f4946c, getNextImgUrl());
                    m7580g(c2232a.f4946c);
                } else {
                    VDraweeView vDraweeView = c2232a.f4946c;
                    if (i5 == 0) {
                        m7581h(vDraweeView);
                    } else {
                        m7582i(vDraweeView);
                    }
                }
                i++;
            }
            requestLayout();
            return;
        }
        VDraweeView vDraweeViewM7576c = m7576c();
        qib0.G.Q0(vDraweeViewM7576c, getNextImgUrl());
        int i6 = this.f4931a;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i6, i6);
        C2232a c2232a2 = new C2232a();
        c2232a2.f4946c = vDraweeViewM7576c;
        c2232a2.f4944a = this.f4937g.size();
        c2232a2.f4945b = this.f4937g.size();
        this.f4937g.add(c2232a2);
        addView((View) vDraweeViewM7576c, layoutParams);
        if (this.f4941k.size() == 1) {
            return;
        }
        if (this.f4937g.size() == 1) {
            vDraweeViewM7576c.setAlpha(1.0f);
        } else {
            vDraweeViewM7576c.setTranslationX(this.f4931a + this.f4934d);
            vDraweeViewM7576c.setAlpha(0.0f);
            m7580g(vDraweeViewM7576c);
        }
        if (this.f4937g.size() != this.f4935e) {
            while (i < this.f4937g.size() - 1) {
                m7582i(this.f4937g.get(i).f4946c);
                i++;
            }
        } else {
            m7581h(this.f4937g.get(0).f4946c);
            for (int i7 = 1; i7 < this.f4933c; i7++) {
                m7582i(this.f4937g.get(i7).f4946c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7584k() {
        removeCallbacks(this.f4942l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m7584k();
        m7579f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f4936f;
            int i7 = this.f4931a;
            int i8 = this.f4934d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f4933c;
        int i4 = this.f4931a;
        int i5 = ((i3 * i4) - ((i3 - 1) * this.f4932b)) + this.f4934d;
        this.f4936f = i5;
        setMeasuredDimension(i5, i4);
    }

    public void setImageUrlList(List<Picture.ImageUri> list) {
        this.f4941k.clear();
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        this.f4941k.addAll(list);
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveSquareFloatingAnim(Context context) {
        this(context, null);
    }
}
