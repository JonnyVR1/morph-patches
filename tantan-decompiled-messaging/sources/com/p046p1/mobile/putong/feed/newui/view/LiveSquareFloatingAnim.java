package com.p046p1.mobile.putong.feed.newui.view;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.djj;
import p149l.ejj;
import p149l.f3c0;
import p149l.ftd0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class LiveSquareFloatingAnim extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f43470a;

    /* JADX INFO: renamed from: b */
    public int f43471b;

    /* JADX INFO: renamed from: c */
    public int f43472c;

    /* JADX INFO: renamed from: d */
    public int f43473d;

    /* JADX INFO: renamed from: e */
    public int f43474e;

    /* JADX INFO: renamed from: f */
    public int f43475f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C11388a> f43476g;

    /* JADX INFO: renamed from: h */
    public Animator f43477h;

    /* JADX INFO: renamed from: i */
    public Animator f43478i;

    /* JADX INFO: renamed from: j */
    public Animator f43479j;

    /* JADX INFO: renamed from: k */
    public ArrayList<Picture.ImageUri> f43480k;

    /* JADX INFO: renamed from: l */
    public RunnableC11389b f43481l;

    /* JADX INFO: renamed from: m */
    public int f43482m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$a */
    public class C11388a {

        /* JADX INFO: renamed from: a */
        public int f43483a;

        /* JADX INFO: renamed from: b */
        public int f43484b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f43485c;

        public C11388a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$b */
    public class RunnableC11389b implements Runnable {
        public RunnableC11389b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveSquareFloatingAnim.this.m66418j();
            LiveSquareFloatingAnim.this.postDelayed(this, 2000L);
        }
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66412d();
        m66413e();
    }

    private Picture.ImageUri getNextImgUrl() {
        int size = this.f43482m % this.f43480k.size();
        this.f43482m = size;
        Picture.ImageUri imageUri = this.f43480k.get(size);
        this.f43482m++;
        return imageUri;
    }

    /* JADX INFO: renamed from: b */
    public final void m66410b(Animator animator) {
        if (NullChecker.m81303a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final VDraweeView m66411c() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(true);
        roundingParams.m8261o(getResources().getColor(R.color.white), t100.m186890d(2.0f));
        djj djjVarM116872a = new ejj(getResources()).m116872a();
        djjVarM116872a.m112049D(f3c0.f94650w1);
        djjVarM116872a.m112076w(ftd0.f99185i);
        djjVarM116872a.m112053H(roundingParams);
        vDraweeView.setHierarchy(djjVarM116872a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: d */
    public final void m66412d() {
        this.f43470a = t100.m186890d(36.0f);
        this.f43471b = t100.m186890d(8.0f);
        this.f43473d = t100.m186890d(0.0f);
        this.f43472c = 3;
        this.f43481l = new RunnableC11389b();
        this.f43476g = new ArrayList<>();
        this.f43480k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e */
    public final void m66413e() {
        m66410b(this.f43478i);
        m66410b(this.f43477h);
        m66410b(this.f43479j);
        setChildrenDrawingOrderEnabled(true);
        removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public void m66414f() {
        this.f43482m = 0;
        m66410b(this.f43478i);
        m66410b(this.f43477h);
        m66410b(this.f43479j);
        this.f43476g.clear();
        removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public final void m66415g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f43470a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f43477h = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        this.f43477h.setStartDelay(200L);
        this.f43477h.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f43476g.size() ? i2 : this.f43476g.get(i2).f43484b;
    }

    /* JADX INFO: renamed from: h */
    public final void m66416h(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f43479j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f43479j.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m66417i(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f43470a) + this.f43471b));
        this.f43478i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f43478i.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m66418j() {
        if (NullChecker.m81303a(this.f43478i) && this.f43478i.isRunning()) {
            return;
        }
        if ((NullChecker.m81303a(this.f43477h) && this.f43477h.isRunning()) || vwb.m200296J(this.f43480k)) {
            return;
        }
        int i = 0;
        if (this.f43476g.size() >= this.f43474e) {
            while (i < this.f43476g.size()) {
                C11388a c11388a = this.f43476g.get(i);
                int i2 = c11388a.f43483a;
                int i3 = this.f43472c;
                int i4 = this.f43474e;
                int i5 = (i2 + i3) % i4;
                c11388a.f43483a = i5;
                c11388a.f43484b = (c11388a.f43484b + 1) % i4;
                if (i5 == i3) {
                    c11388a.f43485c.setTranslationX(this.f43475f);
                    c11388a.f43485c.setAlpha(1.0f);
                    qib0.f154691G.m102341Q0(c11388a.f43485c, getNextImgUrl());
                    m66415g(c11388a.f43485c);
                } else {
                    VDraweeView vDraweeView = c11388a.f43485c;
                    if (i5 == 0) {
                        m66416h(vDraweeView);
                    } else {
                        m66417i(vDraweeView);
                    }
                }
                i++;
            }
            requestLayout();
            return;
        }
        VDraweeView vDraweeViewM66411c = m66411c();
        qib0.f154691G.m102341Q0(vDraweeViewM66411c, getNextImgUrl());
        int i6 = this.f43470a;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i6, i6);
        C11388a c11388a2 = new C11388a();
        c11388a2.f43485c = vDraweeViewM66411c;
        c11388a2.f43483a = this.f43476g.size();
        c11388a2.f43484b = this.f43476g.size();
        this.f43476g.add(c11388a2);
        addView(vDraweeViewM66411c, layoutParams);
        if (this.f43480k.size() == 1) {
            return;
        }
        if (this.f43476g.size() == 1) {
            vDraweeViewM66411c.setAlpha(1.0f);
        } else {
            vDraweeViewM66411c.setTranslationX(this.f43470a + this.f43473d);
            vDraweeViewM66411c.setAlpha(0.0f);
            m66415g(vDraweeViewM66411c);
        }
        if (this.f43476g.size() != this.f43474e) {
            while (i < this.f43476g.size() - 1) {
                m66417i(this.f43476g.get(i).f43485c);
                i++;
            }
        } else {
            m66416h(this.f43476g.get(0).f43485c);
            for (int i7 = 1; i7 < this.f43472c; i7++) {
                m66417i(this.f43476g.get(i7).f43485c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m66419k() {
        removeCallbacks(this.f43481l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m66419k();
        m66414f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f43475f;
            int i7 = this.f43470a;
            int i8 = this.f43473d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f43472c;
        int i4 = this.f43470a;
        int i5 = ((i3 * i4) - ((i3 - 1) * this.f43471b)) + this.f43473d;
        this.f43475f = i5;
        setMeasuredDimension(i5, i4);
    }

    public void setImageUrlList(List<Picture.ImageUri> list) {
        this.f43480k.clear();
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        this.f43480k.addAll(list);
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveSquareFloatingAnim(Context context) {
        this(context, null);
    }
}
