package com.p046p1.mobile.putong.live.external.voice.entry;

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
import p147v.VDraweeView;
import p149l.djj;
import p149l.ejj;
import p149l.ftd0;
import p149l.g3c0;
import p149l.hxs;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceFeedEntryFloatingAnim extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f46405a;

    /* JADX INFO: renamed from: b */
    public int f46406b;

    /* JADX INFO: renamed from: c */
    public int f46407c;

    /* JADX INFO: renamed from: d */
    public int f46408d;

    /* JADX INFO: renamed from: e */
    public int f46409e;

    /* JADX INFO: renamed from: f */
    public int f46410f;

    /* JADX INFO: renamed from: g */
    public ArrayList<C12592a> f46411g;

    /* JADX INFO: renamed from: h */
    public Animator f46412h;

    /* JADX INFO: renamed from: i */
    public Animator f46413i;

    /* JADX INFO: renamed from: j */
    public Animator f46414j;

    /* JADX INFO: renamed from: k */
    public ArrayList<String> f46415k;

    /* JADX INFO: renamed from: l */
    public RunnableC12593b f46416l;

    /* JADX INFO: renamed from: m */
    public int f46417m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim$a */
    public static class C12592a {

        /* JADX INFO: renamed from: a */
        public int f46418a;

        /* JADX INFO: renamed from: b */
        public int f46419b;

        /* JADX INFO: renamed from: c */
        public VDraweeView f46420c;

        public C12592a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.voice.entry.VoiceFeedEntryFloatingAnim$b */
    public class RunnableC12593b implements Runnable {
        public RunnableC12593b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VoiceFeedEntryFloatingAnim.this.m70968k();
            VoiceFeedEntryFloatingAnim.this.postDelayed(this, 2000L);
        }
    }

    public VoiceFeedEntryFloatingAnim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m70962e();
        m70963f();
    }

    private String getNextImgUrl() {
        int size = this.f46417m % this.f46415k.size();
        this.f46417m = size;
        String str = this.f46415k.get(size);
        this.f46417m++;
        return str;
    }

    /* JADX INFO: renamed from: b */
    public final void m70959b(Animator animator) {
        if (NullChecker.m81303a(animator) && animator.isRunning()) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public final VDraweeView m70960c() {
        VDraweeView vDraweeView = new VDraweeView(getContext());
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8268v(true);
        roundingParams.m8261o(getResources().getColor(R.color.white), t100.m186890d(2.0f));
        djj djjVarM116872a = new ejj(getResources()).m116872a();
        djjVarM116872a.m112049D(g3c0.f100445u);
        djjVarM116872a.m112076w(ftd0.f99185i);
        djjVarM116872a.m112053H(roundingParams);
        vDraweeView.setHierarchy(djjVarM116872a);
        return vDraweeView;
    }

    /* JADX INFO: renamed from: d */
    public void m70961d(int i) {
        m70970m();
        m70964g();
        this.f46407c = i;
        if (i <= 0) {
            this.f46407c = 2;
        }
        this.f46409e = i + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m70962e() {
        this.f46405a = t100.m186890d(34.0f);
        this.f46406b = t100.m186890d(8.0f);
        this.f46408d = t100.m186890d(0.0f);
        this.f46407c = 2;
        this.f46416l = new RunnableC12593b();
        this.f46411g = new ArrayList<>();
        this.f46415k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: f */
    public final void m70963f() {
        m70959b(this.f46413i);
        m70959b(this.f46412h);
        m70959b(this.f46414j);
        setChildrenDrawingOrderEnabled(true);
        removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public void m70964g() {
        this.f46417m = 0;
        m70959b(this.f46413i);
        m70959b(this.f46412h);
        m70959b(this.f46414j);
        this.f46411g.clear();
        removeAllViews();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return i2 >= this.f46411g.size() ? i2 : this.f46411g.get(i2).f46419b;
    }

    /* JADX INFO: renamed from: h */
    public final void m70965h(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", this.f46405a, 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        this.f46412h = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(300L);
        this.f46412h.setStartDelay(200L);
        this.f46412h.start();
    }

    /* JADX INFO: renamed from: i */
    public final void m70966i(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f));
        this.f46414j = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f46414j.start();
    }

    /* JADX INFO: renamed from: j */
    public final void m70967j(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationX", view.getTranslationX(), (view.getTranslationX() - this.f46405a) + this.f46406b));
        this.f46413i = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(500L);
        this.f46413i.start();
    }

    /* JADX INFO: renamed from: k */
    public final void m70968k() {
        if (NullChecker.m81303a(this.f46413i) && this.f46413i.isRunning()) {
            return;
        }
        if ((NullChecker.m81303a(this.f46412h) && this.f46412h.isRunning()) || vwb.m200296J(this.f46415k)) {
            return;
        }
        int i = 0;
        if (this.f46411g.size() >= this.f46409e) {
            while (i < this.f46411g.size()) {
                C12592a c12592a = this.f46411g.get(i);
                int i2 = c12592a.f46418a;
                int i3 = this.f46407c;
                int i4 = this.f46409e;
                int i5 = (i2 + i3) % i4;
                c12592a.f46418a = i5;
                c12592a.f46419b = (c12592a.f46419b + 1) % i4;
                if (i5 == i3) {
                    c12592a.f46420c.setTranslationX(this.f46410f);
                    c12592a.f46420c.setAlpha(1.0f);
                    hxs.m133406s("context_square", c12592a.f46420c, getNextImgUrl());
                    m70965h(c12592a.f46420c);
                } else {
                    VDraweeView vDraweeView = c12592a.f46420c;
                    if (i5 == 0) {
                        m70966i(vDraweeView);
                    } else {
                        m70967j(vDraweeView);
                    }
                }
                i++;
            }
            requestLayout();
            return;
        }
        VDraweeView vDraweeViewM70960c = m70960c();
        hxs.m133406s("context_square", vDraweeViewM70960c, getNextImgUrl());
        int i6 = this.f46405a;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i6, i6);
        C12592a c12592a2 = new C12592a();
        c12592a2.f46420c = vDraweeViewM70960c;
        c12592a2.f46418a = this.f46411g.size();
        c12592a2.f46419b = this.f46411g.size();
        this.f46411g.add(c12592a2);
        addView(vDraweeViewM70960c, layoutParams);
        if (this.f46415k.size() == 1) {
            return;
        }
        if (this.f46411g.size() == 1) {
            vDraweeViewM70960c.setAlpha(1.0f);
        } else {
            vDraweeViewM70960c.setTranslationX(this.f46405a + this.f46408d);
            vDraweeViewM70960c.setAlpha(0.0f);
            m70965h(vDraweeViewM70960c);
        }
        if (this.f46411g.size() != this.f46409e) {
            while (i < this.f46411g.size() - 1) {
                m70967j(this.f46411g.get(i).f46420c);
                i++;
            }
        } else {
            m70966i(this.f46411g.get(0).f46420c);
            for (int i7 = 1; i7 < this.f46407c; i7++) {
                m70967j(this.f46411g.get(i7).f46420c);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m70969l() {
        if (this.f46415k.size() == 0) {
            return;
        }
        m70968k();
        if (this.f46415k.size() > 1) {
            postDelayed(this.f46416l, 2000L);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m70970m() {
        removeCallbacks(this.f46416l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m70970m();
        m70964g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.f46410f;
            int i7 = this.f46405a;
            int i8 = this.f46408d;
            childAt.layout((i6 - i7) - i8, 0, i6 - i8, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f46407c;
        int i4 = this.f46405a;
        int i5 = ((i3 * i4) - ((i3 - 1) * this.f46406b)) + this.f46408d;
        this.f46410f = i5;
        setMeasuredDimension(i5, i4);
    }

    public void setImageUrlList(List<String> list) {
        this.f46415k.clear();
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        this.f46415k.addAll(list);
    }

    public VoiceFeedEntryFloatingAnim(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceFeedEntryFloatingAnim(Context context) {
        this(context, null);
    }
}
