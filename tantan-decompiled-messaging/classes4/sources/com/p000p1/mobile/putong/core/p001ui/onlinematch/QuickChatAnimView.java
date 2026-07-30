package com.p000p1.mobile.putong.core.p001ui.onlinematch;

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
import l.e9c0;
import l.qib0;
import l.t100;
import l.vwb;
import l.x2c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class QuickChatAnimView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f461a;

    /* JADX INFO: renamed from: b */
    public int f462b;

    /* JADX INFO: renamed from: c */
    public int f463c;

    /* JADX INFO: renamed from: d */
    public int f464d;

    /* JADX INFO: renamed from: e */
    public int f465e;

    /* JADX INFO: renamed from: f */
    public int f466f;

    /* JADX INFO: renamed from: g */
    public int f467g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C0028a> f468h;

    /* JADX INFO: renamed from: i */
    public Animator f469i;

    /* JADX INFO: renamed from: j */
    public Animator f470j;

    /* JADX INFO: renamed from: k */
    public Animator f471k;

    /* JADX INFO: renamed from: l */
    public int f472l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f473m;

    /* JADX INFO: renamed from: n */
    public RunnableC0029b f474n;

    /* JADX INFO: renamed from: o */
    public double f475o;

    /* JADX INFO: renamed from: p */
    public int f476p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$a */
    public class C0028a {

        /* JADX INFO: renamed from: a */
        public int f477a;

        /* JADX INFO: renamed from: b */
        public int f478b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f479c;

        public C0028a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.QuickChatAnimView$b */
    public class RunnableC0029b implements Runnable {
        public RunnableC0029b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QuickChatAnimView.this.m646h();
            QuickChatAnimView.this.postDelayed(this, new Random().nextInt(QuickChatAnimView.this.f476p) + QuickChatAnimView.this.f476p);
        }
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f467g = 0;
        this.f472l = -1;
        this.f475o = 1.0d;
        this.f476p = 2000;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.p1);
        this.f472l = typedArrayObtainStyledAttributes.getInt(e9c0.q1, -1);
        typedArrayObtainStyledAttributes.recycle();
        m641c();
        m642d();
    }

    private String getNextImgUrl() {
        int size = this.f473m.size();
        if (size == 0) {
            return "";
        }
        int iNextInt = new Random().nextInt(size);
        String str = this.f473m.get(iNextInt);
        this.f473m.remove(iNextInt);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m640b(Animator animator) {
        if (NullChecker.a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m641c() {
        int i = this.f472l;
        if (i != -1) {
            this.f461a = t100.d(i);
        } else {
            this.f461a = t100.d(32.0f);
        }
        this.f462b = t100.d(8.0f);
        int iD = t100.d(8.0f);
        this.f464d = iD;
        this.f463c = 3;
        this.f465e = 3 + 1;
        this.f466f = ((this.f461a * 3) - ((3 - 1) * this.f462b)) + iD;
        this.f474n = new RunnableC0029b();
    }

    /* JADX INFO: renamed from: d */
    public final void m642d() {
        this.f473m = OnlineMatchPictureHelper.m626b().m627a();
        m640b(this.f470j);
        m640b(this.f469i);
        m640b(this.f471k);
        setChildrenDrawingOrderEnabled(true);
        this.f468h = new ArrayList<>();
        removeAllViews();
    }

    /* JADX INFO: renamed from: e */
    public final void m643e(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f461a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f469i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f475o * 300.0d));
        this.f469i.setStartDelay((long) (this.f475o * 200.0d));
        this.f469i.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m644f(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f471k = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f475o * 300.0d));
        this.f471k.start();
    }

    /* JADX INFO: renamed from: g */
    public final void m645g(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f461a) + this.f462b));
        this.f470j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration((long) (this.f475o * 500.0d));
        this.f470j.start();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f468h.size() ? i2 : this.f468h.get(i2).f478b;
    }

    public int getViewCalculateWidth() {
        return this.f466f;
    }

    /* JADX INFO: renamed from: h */
    public void m646h() {
        if (NullChecker.a(this.f470j) && this.f470j.isRunning()) {
            return;
        }
        if ((NullChecker.a(this.f469i) && this.f469i.isRunning()) || vwb.J(this.f473m)) {
            return;
        }
        setChildrenDrawingOrderEnabled(true);
        requestLayout();
        int i = 0;
        if (this.f468h.size() < this.f465e) {
            VDraweeView vDraweeView = new VDraweeView(getContext());
            vDraweeView.setImageResource(x2c0.Qt);
            qib0.G.L0(vDraweeView, getNextImgUrl());
            this.f467g = (this.f467g + 1) % 2;
            int i2 = this.f461a;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i2, i2);
            C0028a c0028a = new C0028a();
            c0028a.f479c = vDraweeView;
            c0028a.f477a = this.f468h.size();
            c0028a.f478b = this.f468h.size();
            this.f468h.add(c0028a);
            addView((View) vDraweeView, layoutParams);
            if (this.f468h.size() == 1) {
                vDraweeView.setAlpha(1.0f);
            } else {
                vDraweeView.setTranslationX(this.f461a + this.f464d);
                vDraweeView.setAlpha(0.0f);
                m643e(vDraweeView);
            }
            if (this.f468h.size() == this.f465e) {
                m644f(this.f468h.get(0).f479c);
                for (int i3 = 1; i3 < this.f463c; i3++) {
                    m645g(this.f468h.get(i3).f479c);
                }
            } else {
                while (i < this.f468h.size() - 1) {
                    m645g(this.f468h.get(i).f479c);
                    i++;
                }
            }
        } else {
            while (i < this.f468h.size()) {
                C0028a c0028a2 = this.f468h.get(i);
                int i4 = c0028a2.f477a;
                int i5 = this.f463c;
                int i6 = this.f465e;
                int i7 = (i4 + i5) % i6;
                c0028a2.f477a = i7;
                c0028a2.f478b = (c0028a2.f478b + 1) % i6;
                if (i7 == i5) {
                    c0028a2.f479c.setTranslationX(this.f466f);
                    c0028a2.f479c.setAlpha(1.0f);
                    VDraweeView vDraweeView2 = c0028a2.f479c;
                    if (vDraweeView2 != null) {
                        vDraweeView2.setImageResource(x2c0.Qt);
                    }
                    qib0.G.L0(c0028a2.f479c, getNextImgUrl());
                    m643e(c0028a2.f479c);
                } else {
                    VDraweeView vDraweeView3 = c0028a2.f479c;
                    if (i7 == 0) {
                        m644f(vDraweeView3);
                    } else {
                        m645g(vDraweeView3);
                    }
                }
                i++;
            }
            requestLayout();
        }
        if (vwb.J(this.f473m)) {
            this.f473m = OnlineMatchPictureHelper.m626b().m627a();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m647i() {
        removeCallbacks(this.f474n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m647i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f466f;
            int i7 = this.f461a;
            int i8 = this.f464d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.f466f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f461a, Integer.MIN_VALUE));
    }

    public void setItemViewCount(int i) {
        this.f463c = i;
        if (i <= 0) {
            this.f463c = 3;
        }
        int i2 = this.f463c;
        this.f465e = i2 + 1;
        this.f466f = ((this.f461a * i2) - ((i2 - 1) * this.f462b)) + this.f464d;
    }

    public void setSpeedUpRate(double d) {
        this.f475o = d;
        this.f476p = (int) (((double) this.f476p) * d);
    }

    public QuickChatAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QuickChatAnimView(Context context) {
        this(context, null);
    }
}
