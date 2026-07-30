package com.p051p1.mobile.putong.core.p058ui.onlinematch;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Random;
import p151v.VDraweeView;
import p153l.dbc0;
import p153l.jyb;
import p153l.khc0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatAnimView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f33487a;

    /* JADX INFO: renamed from: b */
    public int f33488b;

    /* JADX INFO: renamed from: c */
    public int f33489c;

    /* JADX INFO: renamed from: d */
    public int f33490d;

    /* JADX INFO: renamed from: e */
    public int f33491e;

    /* JADX INFO: renamed from: f */
    public int f33492f;

    /* JADX INFO: renamed from: g */
    public int f33493g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C8766a> f33494h;

    /* JADX INFO: renamed from: i */
    public Animator f33495i;

    /* JADX INFO: renamed from: j */
    public Animator f33496j;

    /* JADX INFO: renamed from: k */
    public Animator f33497k;

    /* JADX INFO: renamed from: l */
    public int f33498l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f33499m;

    /* JADX INFO: renamed from: n */
    public RunnableC8767b f33500n;

    /* JADX INFO: renamed from: o */
    public double f33501o;

    /* JADX INFO: renamed from: p */
    public int f33502p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$a */
    public class C8766a {

        /* JADX INFO: renamed from: a */
        public int f33503a;

        /* JADX INFO: renamed from: b */
        public int f33504b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f33505c;

        public C8766a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$b */
    public class RunnableC8767b implements Runnable {
        public RunnableC8767b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QuickChatAnimView.this.m51398h();
            QuickChatAnimView.this.postDelayed(this, new Random().nextInt(QuickChatAnimView.this.f33502p) + QuickChatAnimView.this.f33502p);
        }
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33493g = 0;
        this.f33498l = -1;
        this.f33501o = 1.0d;
        this.f33502p = 2000;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126830p1);
        this.f33498l = typedArrayObtainStyledAttributes.getInt(khc0.f126833q1, -1);
        typedArrayObtainStyledAttributes.recycle();
        m51393c();
        m51394d();
    }

    private String getNextImgUrl() {
        int size = this.f33499m.size();
        if (size == 0) {
            return "";
        }
        int iNextInt = new Random().nextInt(size);
        String str = this.f33499m.get(iNextInt);
        this.f33499m.remove(iNextInt);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m51392b(Animator animator) {
        if (NullChecker.m82486a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m51393c() {
        int i = this.f33498l;
        if (i != -1) {
            this.f33487a = qa00.m175859d(i);
        } else {
            this.f33487a = qa00.m175859d(32.0f);
        }
        this.f33488b = qa00.m175859d(8.0f);
        int iM175859d = qa00.m175859d(8.0f);
        this.f33490d = iM175859d;
        this.f33489c = 3;
        this.f33491e = 3 + 1;
        this.f33492f = ((this.f33487a * 3) - ((3 - 1) * this.f33488b)) + iM175859d;
        this.f33500n = new RunnableC8767b();
    }

    /* JADX INFO: renamed from: d */
    public final void m51394d() {
        this.f33499m = OnlineMatchPictureHelper.m51378b().m51379a();
        m51392b(this.f33496j);
        m51392b(this.f33495i);
        m51392b(this.f33497k);
        setChildrenDrawingOrderEnabled(true);
        this.f33494h = new ArrayList<>();
        removeAllViews();
    }

    /* JADX INFO: renamed from: e */
    public final void m51395e(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f33487a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f33495i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f33501o * 300.0d));
        this.f33495i.setStartDelay((long) (this.f33501o * 200.0d));
        this.f33495i.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m51396f(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f33497k = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f33501o * 300.0d));
        this.f33497k.start();
    }

    /* JADX INFO: renamed from: g */
    public final void m51397g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f33487a) + this.f33488b));
        this.f33496j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f33501o * 500.0d));
        this.f33496j.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f33494h.size() ? i2 : this.f33494h.get(i2).f33504b;
    }

    public int getViewCalculateWidth() {
        return this.f33492f;
    }

    /* JADX INFO: renamed from: h */
    public void m51398h() {
        if (NullChecker.m82486a(this.f33496j) && this.f33496j.isRunning()) {
            return;
        }
        if ((NullChecker.m82486a(this.f33495i) && this.f33495i.isRunning()) || jyb.m147479J(this.f33499m)) {
            return;
        }
        setChildrenDrawingOrderEnabled(true);
        requestLayout();
        int i = 0;
        if (this.f33494h.size() < this.f33491e) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            vDraweeView.setImageResource(dbc0.f86135Eu);
            uqb0.f180374G.m127115L0(vDraweeView, getNextImgUrl());
            this.f33493g = (this.f33493g + 1) % 2;
            int i2 = this.f33487a;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i2, i2);
            C8766a c8766a = new C8766a();
            c8766a.f33505c = vDraweeView;
            c8766a.f33503a = this.f33494h.size();
            c8766a.f33504b = this.f33494h.size();
            this.f33494h.add(c8766a);
            addView(vDraweeView, layoutParams);
            if (this.f33494h.size() == 1) {
                vDraweeView.setAlpha(1.0f);
            } else {
                vDraweeView.setTranslationX(this.f33487a + this.f33490d);
                vDraweeView.setAlpha(0.0f);
                m51395e(vDraweeView);
            }
            if (this.f33494h.size() == this.f33491e) {
                m51396f(this.f33494h.get(0).f33505c);
                for (int i3 = 1; i3 < this.f33489c; i3++) {
                    m51397g(this.f33494h.get(i3).f33505c);
                }
            } else {
                while (i < this.f33494h.size() - 1) {
                    m51397g(this.f33494h.get(i).f33505c);
                    i++;
                }
            }
        } else {
            while (i < this.f33494h.size()) {
                C8766a c8766a2 = this.f33494h.get(i);
                int i4 = c8766a2.f33503a;
                int i5 = this.f33489c;
                int i6 = this.f33491e;
                int i7 = (i4 + i5) % i6;
                c8766a2.f33503a = i7;
                c8766a2.f33504b = (c8766a2.f33504b + 1) % i6;
                if (i7 == i5) {
                    c8766a2.f33505c.setTranslationX(this.f33492f);
                    c8766a2.f33505c.setAlpha(1.0f);
                    VDraweeView vDraweeView2 = c8766a2.f33505c;
                    if (vDraweeView2 != null) {
                        vDraweeView2.setImageResource(dbc0.f86135Eu);
                    }
                    uqb0.f180374G.m127115L0(c8766a2.f33505c, getNextImgUrl());
                    m51395e(c8766a2.f33505c);
                } else {
                    View view = c8766a2.f33505c;
                    if (i7 == 0) {
                        m51396f(view);
                    } else {
                        m51397g(view);
                    }
                }
                i++;
            }
            requestLayout();
        }
        if (jyb.m147479J(this.f33499m)) {
            this.f33499m = OnlineMatchPictureHelper.m51378b().m51379a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m51399i() {
        removeCallbacks(this.f33500n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m51399i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f33492f;
            int i7 = this.f33487a;
            int i8 = this.f33490d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f33492f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f33487a, Integer.MIN_VALUE));
    }

    public void setItemViewCount(int i) {
        this.f33489c = i;
        if (i <= 0) {
            this.f33489c = 3;
        }
        int i2 = this.f33489c;
        this.f33491e = i2 + 1;
        this.f33492f = ((this.f33487a * i2) - ((i2 - 1) * this.f33488b)) + this.f33490d;
    }

    public void setSpeedUpRate(double d) {
        this.f33501o = d;
        this.f33502p = (int) (((double) this.f33502p) * d);
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatAnimView(Context context) {
        this(context, null);
    }
}
