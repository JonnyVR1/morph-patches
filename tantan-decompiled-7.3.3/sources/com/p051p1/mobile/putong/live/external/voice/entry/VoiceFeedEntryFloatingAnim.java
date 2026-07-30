package com.p051p1.mobile.putong.live.external.voice.entry;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.generic.RoundingParams;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.h1e0;
import p153l.izs;
import p153l.jyb;
import p153l.mbc0;
import p153l.qa00;
import p153l.wlj;
import p153l.xlj;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceFeedEntryFloatingAnim extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f47253a;

    /* JADX INFO: renamed from: b */
    public int f47254b;

    /* JADX INFO: renamed from: c */
    public int f47255c;

    /* JADX INFO: renamed from: d */
    public int f47256d;

    /* JADX INFO: renamed from: e */
    public int f47257e;

    /* JADX INFO: renamed from: f */
    public int f47258f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C12755a> f47259g;

    /* JADX INFO: renamed from: h */
    public Animator f47260h;

    /* JADX INFO: renamed from: i */
    public Animator f47261i;

    /* JADX INFO: renamed from: j */
    public Animator f47262j;

    /* JADX INFO: renamed from: k */
    public ArrayList<String> f47263k;

    /* JADX INFO: renamed from: l */
    public RunnableC12756b f47264l;

    /* JADX INFO: renamed from: m */
    public int f47265m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim$a */
    public static class C12755a {

        /* JADX INFO: renamed from: a */
        public int f47266a;

        /* JADX INFO: renamed from: b */
        public int f47267b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f47268c;

        public C12755a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim$b */
    public class RunnableC12756b implements Runnable {
        public RunnableC12756b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoiceFeedEntryFloatingAnim.this.m72151k();
            VoiceFeedEntryFloatingAnim.this.postDelayed(this, 2000L);
        }
    }

    public VoiceFeedEntryFloatingAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72145e();
        m72146f();
    }

    private String getNextImgUrl() {
        int size = this.f47265m % this.f47263k.size();
        this.f47265m = size;
        String str = this.f47263k.get(size);
        this.f47265m++;
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m72142b(Animator animator) {
        if (NullChecker.m82486a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final VDraweeView m72143c() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8322v(true);
        roundingParams.m8315o(getResources().getColor(R.color.white), qa00.m175859d(2.0f));
        wlj wljVarM211638a = new xlj(getResources()).m211638a();
        wljVarM211638a.m207041D(mbc0.f135707u);
        wljVarM211638a.m207062w(h1e0.f107452i);
        wljVarM211638a.m207045H(roundingParams);
        vDraweeView.setHierarchy(wljVarM211638a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: d */
    public void m72144d(int i) {
        m72153m();
        m72147g();
        this.f47255c = i;
        if (i <= 0) {
            this.f47255c = 2;
        }
        this.f47257e = i + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m72145e() {
        this.f47253a = qa00.m175859d(34.0f);
        this.f47254b = qa00.m175859d(8.0f);
        this.f47256d = qa00.m175859d(0.0f);
        this.f47255c = 2;
        this.f47264l = new RunnableC12756b();
        this.f47259g = new ArrayList<>();
        this.f47263k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public final void m72146f() {
        m72142b(this.f47261i);
        m72142b(this.f47260h);
        m72142b(this.f47262j);
        setChildrenDrawingOrderEnabled(true);
        removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public void m72147g() {
        this.f47265m = 0;
        m72142b(this.f47261i);
        m72142b(this.f47260h);
        m72142b(this.f47262j);
        this.f47259g.clear();
        removeAllViews();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f47259g.size() ? i2 : this.f47259g.get(i2).f47267b;
    }

    /* JADX INFO: renamed from: h */
    public final void m72148h(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f47253a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f47260h = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        this.f47260h.setStartDelay(200L);
        this.f47260h.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m72149i(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f47262j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f47262j.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m72150j(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f47253a) + this.f47254b));
        this.f47261i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f47261i.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m72151k() {
        if (NullChecker.m82486a(this.f47261i) && this.f47261i.isRunning()) {
            return;
        }
        if ((NullChecker.m82486a(this.f47260h) && this.f47260h.isRunning()) || jyb.m147479J(this.f47263k)) {
            return;
        }
        int i = 0;
        if (this.f47259g.size() >= this.f47257e) {
            while (i < this.f47259g.size()) {
                C12755a c12755a = this.f47259g.get(i);
                int i2 = c12755a.f47266a;
                int i3 = this.f47255c;
                int i4 = this.f47257e;
                int i5 = (i2 + i3) % i4;
                c12755a.f47266a = i5;
                c12755a.f47267b = (c12755a.f47267b + 1) % i4;
                if (i5 == i3) {
                    c12755a.f47268c.setTranslationX(this.f47258f);
                    c12755a.f47268c.setAlpha(1.0f);
                    izs.m142868s("context_square", c12755a.f47268c, getNextImgUrl());
                    m72148h(c12755a.f47268c);
                } else {
                    VDraweeView vDraweeView = c12755a.f47268c;
                    if (i5 == 0) {
                        m72149i(vDraweeView);
                    } else {
                        m72150j(vDraweeView);
                    }
                }
                i++;
            }
            requestLayout();
            return;
        }
        VDraweeView vDraweeViewM72143c = m72143c();
        izs.m142868s("context_square", vDraweeViewM72143c, getNextImgUrl());
        int i6 = this.f47253a;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i6, i6);
        C12755a c12755a2 = new C12755a();
        c12755a2.f47268c = vDraweeViewM72143c;
        c12755a2.f47266a = this.f47259g.size();
        c12755a2.f47267b = this.f47259g.size();
        this.f47259g.add(c12755a2);
        addView(vDraweeViewM72143c, layoutParams);
        if (this.f47263k.size() == 1) {
            return;
        }
        if (this.f47259g.size() == 1) {
            vDraweeViewM72143c.setAlpha(1.0f);
        } else {
            vDraweeViewM72143c.setTranslationX(this.f47253a + this.f47256d);
            vDraweeViewM72143c.setAlpha(0.0f);
            m72148h(vDraweeViewM72143c);
        }
        if (this.f47259g.size() != this.f47257e) {
            while (i < this.f47259g.size() - 1) {
                m72150j(this.f47259g.get(i).f47268c);
                i++;
            }
        } else {
            m72149i(this.f47259g.get(0).f47268c);
            for (int i7 = 1; i7 < this.f47255c; i7++) {
                m72150j(this.f47259g.get(i7).f47268c);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m72152l() {
        if (this.f47263k.size() == 0) {
            return;
        }
        m72151k();
        if (this.f47263k.size() > 1) {
            postDelayed(this.f47264l, 2000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m72153m() {
        removeCallbacks(this.f47264l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m72153m();
        m72147g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f47258f;
            int i7 = this.f47253a;
            int i8 = this.f47256d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f47255c;
        int i4 = this.f47253a;
        int i5 = ((i3 * i4) - ((i3 - 1) * this.f47254b)) + this.f47256d;
        this.f47258f = i5;
        setMeasuredDimension(i5, i4);
    }

    public void setImageUrlList(List<String> list) {
        this.f47263k.clear();
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        this.f47263k.addAll(list);
    }

    public VoiceFeedEntryFloatingAnim(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceFeedEntryFloatingAnim(Context context) {
        this(context, null);
    }
}
