package com.p046p1.mobile.putong.core.p053ui.onlinematch;

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
import p147v.VDraweeView;
import p149l.e9c0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class QuickChatAnimView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f32639a;

    /* JADX INFO: renamed from: b */
    public int f32640b;

    /* JADX INFO: renamed from: c */
    public int f32641c;

    /* JADX INFO: renamed from: d */
    public int f32642d;

    /* JADX INFO: renamed from: e */
    public int f32643e;

    /* JADX INFO: renamed from: f */
    public int f32644f;

    /* JADX INFO: renamed from: g */
    public int f32645g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C8603a> f32646h;

    /* JADX INFO: renamed from: i */
    public Animator f32647i;

    /* JADX INFO: renamed from: j */
    public Animator f32648j;

    /* JADX INFO: renamed from: k */
    public Animator f32649k;

    /* JADX INFO: renamed from: l */
    public int f32650l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f32651m;

    /* JADX INFO: renamed from: n */
    public RunnableC8604b f32652n;

    /* JADX INFO: renamed from: o */
    public double f32653o;

    /* JADX INFO: renamed from: p */
    public int f32654p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$a */
    public class C8603a {

        /* JADX INFO: renamed from: a */
        public int f32655a;

        /* JADX INFO: renamed from: b */
        public int f32656b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f32657c;

        public C8603a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$b */
    public class RunnableC8604b implements Runnable {
        public RunnableC8604b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QuickChatAnimView.this.m50215h();
            QuickChatAnimView.this.postDelayed(this, new Random().nextInt(QuickChatAnimView.this.f32654p) + QuickChatAnimView.this.f32654p);
        }
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32645g = 0;
        this.f32650l = -1;
        this.f32653o = 1.0d;
        this.f32654p = 2000;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90060p1);
        this.f32650l = typedArrayObtainStyledAttributes.getInt(e9c0.f90063q1, -1);
        typedArrayObtainStyledAttributes.recycle();
        m50210c();
        m50211d();
    }

    private String getNextImgUrl() {
        int size = this.f32651m.size();
        if (size == 0) {
            return "";
        }
        int iNextInt = new Random().nextInt(size);
        String str = this.f32651m.get(iNextInt);
        this.f32651m.remove(iNextInt);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m50209b(Animator animator) {
        if (NullChecker.m81303a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m50210c() {
        int i = this.f32650l;
        if (i != -1) {
            this.f32639a = t100.m186890d(i);
        } else {
            this.f32639a = t100.m186890d(32.0f);
        }
        this.f32640b = t100.m186890d(8.0f);
        int iM186890d = t100.m186890d(8.0f);
        this.f32642d = iM186890d;
        this.f32641c = 3;
        this.f32643e = 3 + 1;
        this.f32644f = ((this.f32639a * 3) - ((3 - 1) * this.f32640b)) + iM186890d;
        this.f32652n = new RunnableC8604b();
    }

    /* JADX INFO: renamed from: d */
    public final void m50211d() {
        this.f32651m = OnlineMatchPictureHelper.m50195b().m50196a();
        m50209b(this.f32648j);
        m50209b(this.f32647i);
        m50209b(this.f32649k);
        setChildrenDrawingOrderEnabled(true);
        this.f32646h = new ArrayList<>();
        removeAllViews();
    }

    /* JADX INFO: renamed from: e */
    public final void m50212e(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f32639a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f32647i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f32653o * 300.0d));
        this.f32647i.setStartDelay((long) (this.f32653o * 200.0d));
        this.f32647i.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m50213f(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f32649k = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f32653o * 300.0d));
        this.f32649k.start();
    }

    /* JADX INFO: renamed from: g */
    public final void m50214g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f32639a) + this.f32640b));
        this.f32648j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f32653o * 500.0d));
        this.f32648j.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f32646h.size() ? i2 : this.f32646h.get(i2).f32656b;
    }

    public int getViewCalculateWidth() {
        return this.f32644f;
    }

    /* JADX INFO: renamed from: h */
    public void m50215h() {
        if (NullChecker.m81303a(this.f32648j) && this.f32648j.isRunning()) {
            return;
        }
        if ((NullChecker.m81303a(this.f32647i) && this.f32647i.isRunning()) || vwb.m200296J(this.f32651m)) {
            return;
        }
        setChildrenDrawingOrderEnabled(true);
        requestLayout();
        int i = 0;
        if (this.f32646h.size() < this.f32643e) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            vDraweeView.setImageResource(x2c0.f189685Qt);
            qib0.f154691G.m102331L0(vDraweeView, getNextImgUrl());
            this.f32645g = (this.f32645g + 1) % 2;
            int i2 = this.f32639a;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i2, i2);
            C8603a c8603a = new C8603a();
            c8603a.f32657c = vDraweeView;
            c8603a.f32655a = this.f32646h.size();
            c8603a.f32656b = this.f32646h.size();
            this.f32646h.add(c8603a);
            addView(vDraweeView, layoutParams);
            if (this.f32646h.size() == 1) {
                vDraweeView.setAlpha(1.0f);
            } else {
                vDraweeView.setTranslationX(this.f32639a + this.f32642d);
                vDraweeView.setAlpha(0.0f);
                m50212e(vDraweeView);
            }
            if (this.f32646h.size() == this.f32643e) {
                m50213f(this.f32646h.get(0).f32657c);
                for (int i3 = 1; i3 < this.f32641c; i3++) {
                    m50214g(this.f32646h.get(i3).f32657c);
                }
            } else {
                while (i < this.f32646h.size() - 1) {
                    m50214g(this.f32646h.get(i).f32657c);
                    i++;
                }
            }
        } else {
            while (i < this.f32646h.size()) {
                C8603a c8603a2 = this.f32646h.get(i);
                int i4 = c8603a2.f32655a;
                int i5 = this.f32641c;
                int i6 = this.f32643e;
                int i7 = (i4 + i5) % i6;
                c8603a2.f32655a = i7;
                c8603a2.f32656b = (c8603a2.f32656b + 1) % i6;
                if (i7 == i5) {
                    c8603a2.f32657c.setTranslationX(this.f32644f);
                    c8603a2.f32657c.setAlpha(1.0f);
                    VDraweeView vDraweeView2 = c8603a2.f32657c;
                    if (vDraweeView2 != null) {
                        vDraweeView2.setImageResource(x2c0.f189685Qt);
                    }
                    qib0.f154691G.m102331L0(c8603a2.f32657c, getNextImgUrl());
                    m50212e(c8603a2.f32657c);
                } else {
                    View view = c8603a2.f32657c;
                    if (i7 == 0) {
                        m50213f(view);
                    } else {
                        m50214g(view);
                    }
                }
                i++;
            }
            requestLayout();
        }
        if (vwb.m200296J(this.f32651m)) {
            this.f32651m = OnlineMatchPictureHelper.m50195b().m50196a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m50216i() {
        removeCallbacks(this.f32652n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m50216i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f32644f;
            int i7 = this.f32639a;
            int i8 = this.f32642d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f32644f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f32639a, Integer.MIN_VALUE));
    }

    public void setItemViewCount(int i) {
        this.f32641c = i;
        if (i <= 0) {
            this.f32641c = 3;
        }
        int i2 = this.f32641c;
        this.f32643e = i2 + 1;
        this.f32644f = ((this.f32639a * i2) - ((i2 - 1) * this.f32640b)) + this.f32642d;
    }

    public void setSpeedUpRate(double d) {
        this.f32653o = d;
        this.f32654p = (int) (((double) this.f32654p) * d);
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatAnimView(Context context) {
        this(context, null);
    }
}
