package com.p051p1.mobile.putong.feed.newui.view;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.h1e0;
import p153l.jyb;
import p153l.lbc0;
import p153l.qa00;
import p153l.uqb0;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareFloatingAnim extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f44318a;

    /* JADX INFO: renamed from: b */
    public int f44319b;

    /* JADX INFO: renamed from: c */
    public int f44320c;

    /* JADX INFO: renamed from: d */
    public int f44321d;

    /* JADX INFO: renamed from: e */
    public int f44322e;

    /* JADX INFO: renamed from: f */
    public int f44323f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C11551a> f44324g;

    /* JADX INFO: renamed from: h */
    public Animator f44325h;

    /* JADX INFO: renamed from: i */
    public Animator f44326i;

    /* JADX INFO: renamed from: j */
    public Animator f44327j;

    /* JADX INFO: renamed from: k */
    public ArrayList<Picture.ImageUri> f44328k;

    /* JADX INFO: renamed from: l */
    public RunnableC11552b f44329l;

    /* JADX INFO: renamed from: m */
    public int f44330m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$a */
    public class C11551a {

        /* JADX INFO: renamed from: a */
        public int f44331a;

        /* JADX INFO: renamed from: b */
        public int f44332b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f44333c;

        public C11551a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.LiveSquareFloatingAnim$b */
    public class RunnableC11552b implements Runnable {
        public RunnableC11552b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveSquareFloatingAnim.this.m67601j();
            LiveSquareFloatingAnim.this.postDelayed(this, 2000L);
        }
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67595d();
        m67596e();
    }

    private Picture.ImageUri getNextImgUrl() {
        int size = this.f44330m % this.f44328k.size();
        this.f44330m = size;
        Picture.ImageUri imageUri = this.f44328k.get(size);
        this.f44330m++;
        return imageUri;
    }

    /* JADX INFO: renamed from: b */
    public final void m67593b(Animator animator) {
        if (NullChecker.m82486a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final VDraweeView m67594c() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(true);
        roundingParams.m8315o(getResources().getColor(R.color.white), qa00.m175859d(2.0f));
        wlj wljVarM211638a = new xlj(getResources()).m211638a();
        wljVarM211638a.m207041D(lbc0.f131168w1);
        wljVarM211638a.m207062w(h1e0.f107452i);
        wljVarM211638a.m207045H(roundingParams);
        vDraweeView.setHierarchy(wljVarM211638a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: d */
    public final void m67595d() {
        this.f44318a = qa00.m175859d(36.0f);
        this.f44319b = qa00.m175859d(8.0f);
        this.f44321d = qa00.m175859d(0.0f);
        this.f44320c = 3;
        this.f44329l = new RunnableC11552b();
        this.f44324g = new ArrayList<>();
        this.f44328k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e */
    public final void m67596e() {
        m67593b(this.f44326i);
        m67593b(this.f44325h);
        m67593b(this.f44327j);
        setChildrenDrawingOrderEnabled(true);
        removeAllViews();
    }

    /* JADX INFO: renamed from: f */
    public void m67597f() {
        this.f44330m = 0;
        m67593b(this.f44326i);
        m67593b(this.f44325h);
        m67593b(this.f44327j);
        this.f44324g.clear();
        removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public final void m67598g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f44318a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f44325h = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        this.f44325h.setStartDelay(200L);
        this.f44325h.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f44324g.size() ? i2 : this.f44324g.get(i2).f44332b;
    }

    /* JADX INFO: renamed from: h */
    public final void m67599h(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f44327j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f44327j.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m67600i(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f44318a) + this.f44319b));
        this.f44326i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f44326i.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m67601j() {
        if (NullChecker.m82486a(this.f44326i) && this.f44326i.isRunning()) {
            return;
        }
        if ((NullChecker.m82486a(this.f44325h) && this.f44325h.isRunning()) || jyb.m147479J(this.f44328k)) {
            return;
        }
        int i = 0;
        if (this.f44324g.size() >= this.f44322e) {
            while (i < this.f44324g.size()) {
                C11551a c11551a = this.f44324g.get(i);
                int i2 = c11551a.f44331a;
                int i3 = this.f44320c;
                int i4 = this.f44322e;
                int i5 = (i2 + i3) % i4;
                c11551a.f44331a = i5;
                c11551a.f44332b = (c11551a.f44332b + 1) % i4;
                if (i5 == i3) {
                    c11551a.f44333c.setTranslationX(this.f44323f);
                    c11551a.f44333c.setAlpha(1.0f);
                    uqb0.f180374G.m127125Q0(c11551a.f44333c, getNextImgUrl());
                    m67598g(c11551a.f44333c);
                } else {
                    VDraweeView vDraweeView = c11551a.f44333c;
                    if (i5 == 0) {
                        m67599h(vDraweeView);
                    } else {
                        m67600i(vDraweeView);
                    }
                }
                i++;
            }
            requestLayout();
            return;
        }
        VDraweeView vDraweeViewM67594c = m67594c();
        uqb0.f180374G.m127125Q0(vDraweeViewM67594c, getNextImgUrl());
        int i6 = this.f44318a;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i6, i6);
        C11551a c11551a2 = new C11551a();
        c11551a2.f44333c = vDraweeViewM67594c;
        c11551a2.f44331a = this.f44324g.size();
        c11551a2.f44332b = this.f44324g.size();
        this.f44324g.add(c11551a2);
        addView(vDraweeViewM67594c, layoutParams);
        if (this.f44328k.size() == 1) {
            return;
        }
        if (this.f44324g.size() == 1) {
            vDraweeViewM67594c.setAlpha(1.0f);
        } else {
            vDraweeViewM67594c.setTranslationX(this.f44318a + this.f44321d);
            vDraweeViewM67594c.setAlpha(0.0f);
            m67598g(vDraweeViewM67594c);
        }
        if (this.f44324g.size() != this.f44322e) {
            while (i < this.f44324g.size() - 1) {
                m67600i(this.f44324g.get(i).f44333c);
                i++;
            }
        } else {
            m67599h(this.f44324g.get(0).f44333c);
            for (int i7 = 1; i7 < this.f44320c; i7++) {
                m67600i(this.f44324g.get(i7).f44333c);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m67602k() {
        removeCallbacks(this.f44329l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m67602k();
        m67597f();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f44323f;
            int i7 = this.f44318a;
            int i8 = this.f44321d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f44320c;
        int i4 = this.f44318a;
        int i5 = ((i3 * i4) - ((i3 - 1) * this.f44319b)) + this.f44321d;
        this.f44323f = i5;
        setMeasuredDimension(i5, i4);
    }

    public void setImageUrlList(List<Picture.ImageUri> list) {
        this.f44328k.clear();
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        this.f44328k.addAll(list);
    }

    public LiveSquareFloatingAnim(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveSquareFloatingAnim(Context context) {
        this(context, null);
    }
}
