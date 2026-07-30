package com.p051p1.mobile.putong.p070ui.square;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.gt0;
import p153l.qa00;
import p153l.y20;
import p153l.yfq;

/* JADX INFO: loaded from: classes10.dex */
public class BubbleLayoutManager extends RecyclerView.AbstractC0579o {

    /* JADX INFO: renamed from: l */
    public static final int f55588l = qa00.m175859d(98.0f);

    /* JADX INFO: renamed from: c */
    public yfq f55591c;

    /* JADX INFO: renamed from: f */
    public int f55594f;

    /* JADX INFO: renamed from: g */
    public final int f55595g;

    /* JADX INFO: renamed from: h */
    public final int f55596h;

    /* JADX INFO: renamed from: i */
    public final int f55597i;

    /* JADX INFO: renamed from: j */
    public int f55598j;

    /* JADX INFO: renamed from: k */
    public boolean f55599k;

    /* JADX INFO: renamed from: a */
    public SparseArray<Rect> f55589a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public SparseBooleanArray f55590b = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public int f55592d = 0;

    /* JADX INFO: renamed from: e */
    public int f55593e = 0;

    public BubbleLayoutManager() {
        int i = f55588l;
        this.f55595g = i / 2;
        this.f55596h = i / 3;
        this.f55597i = i / 6;
        this.f55598j = 0;
        this.f55599k = false;
    }

    /* JADX INFO: renamed from: h */
    private int m81308h() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    /* JADX INFO: renamed from: i */
    private int m81309i() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m81310g() {
        this.f55592d = f55588l;
        this.f55589a.clear();
        int i = 0;
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            Rect rect = this.f55589a.get(i2);
            if (rect == null) {
                rect = new Rect();
            }
            int i3 = this.f55592d;
            int iM105592y0 = bnl0.m105592y0();
            int i4 = this.f55592d;
            int i5 = f55588l;
            rect.set(0, i3, iM105592y0, i4 + i5);
            this.f55592d += i5;
            this.f55589a.put(i2, rect);
        }
        int itemCount = getItemCount() - 1;
        int i6 = this.f55594f;
        int i7 = f55588l;
        int i8 = i6 + i7;
        if (i8 > i7) {
            for (int i9 = itemCount; i9 >= 0; i9--) {
                Rect rect2 = this.f55589a.get(i9);
                if (rect2.top < i8) {
                    int i10 = f55588l;
                    int iCeil = i10 - ((int) Math.ceil(((double) (i8 % i10)) / 2.0d));
                    if (iCeil == i10) {
                        int i11 = i8 % i10;
                        int i12 = this.f55595g;
                        if (i11 > i12 || i8 % i10 == 0) {
                            iCeil = i12;
                        }
                    }
                    i = rect2.bottom - iCeil;
                    rect2.top = i;
                    itemCount = i9 - 1;
                    break;
                }
            }
        }
        if (i8 > f55588l * 2) {
            for (int i13 = itemCount; i13 >= 0; i13--) {
                Rect rect3 = this.f55589a.get(i13);
                if (rect3.top < i8) {
                    int i14 = this.f55595g;
                    int i15 = f55588l;
                    int iCeil2 = i14 - ((int) Math.ceil(((double) (i8 % i15)) / 6.0d));
                    int i16 = this.f55595g;
                    if (iCeil2 == i16 && (i8 % i15 > i16 || i8 % i15 == 0)) {
                        iCeil2 = this.f55596h;
                    }
                    rect3.bottom = i;
                    i -= iCeil2;
                    rect3.top = i;
                    itemCount = i13 - 1;
                    break;
                }
            }
        }
        if (i8 > f55588l * 3) {
            while (itemCount >= 0) {
                Rect rect4 = this.f55589a.get(itemCount);
                if (rect4.top < i8) {
                    int i17 = this.f55596h;
                    int i18 = f55588l;
                    int iCeil3 = i17 - ((int) Math.ceil(((double) (i8 % i18)) / 6.0d));
                    if (iCeil3 == this.f55596h && (i8 % i18 > this.f55595g || i8 % i18 == 0)) {
                        iCeil3 = this.f55597i;
                    }
                    rect4.bottom = i;
                    rect4.top = i - iCeil3;
                    break;
                }
                itemCount--;
            }
        }
        this.f55593e = this.f55592d;
        int iMax = Math.max(m81309i(), this.f55592d);
        this.f55592d = iMax;
        if (this.f55594f > iMax - m81309i()) {
            this.f55594f = this.f55592d - m81309i();
            m81310g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return new RecyclerView.C0580p(-1, -2);
    }

    /* JADX INFO: renamed from: j */
    public int m81311j() {
        return (this.f55593e - m81309i()) - this.f55594f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m81312k() {
        return this.f55599k;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m81313l(RecyclerView recyclerView, y20 y20Var, ValueAnimator valueAnimator) {
        recyclerView.scrollBy(0, ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.f55598j);
        this.f55598j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (y20Var != null) {
            y20Var.call(Float.valueOf(valueAnimator.getAnimatedFraction()));
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m81314m() {
        this.f55599k = true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m81315n(y20 y20Var) {
        this.f55599k = false;
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Float.valueOf(1.0f));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m81316o(final RecyclerView recyclerView, final y20 y20Var) {
        this.f55598j = 0;
        int iM81309i = (this.f55592d - m81309i()) - this.f55594f;
        if (iM81309i > 0 || !this.f55599k) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM81309i);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.yf3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f199442a.m81313l(recyclerView, y20Var, valueAnimator);
                }
            });
            gt0.m132177w(valueAnimatorOfInt, new Runnable() { // from class: l.zf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204101a.m81314m();
                }
            }, new Runnable() { // from class: l.ag3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71080a.m81315n(y20Var);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (getItemCount() <= 0 || c0561a0.m3364f()) {
            return;
        }
        detachAndScrapAttachedViews(c0586v);
        m81310g();
        m81317p(c0586v, c0561a0);
    }

    /* JADX INFO: renamed from: p */
    public final void m81317p(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        BubbleLayoutManager bubbleLayoutManager;
        if (getItemCount() <= 0 || c0561a0.m3364f()) {
            return;
        }
        Rect rect = new Rect(0, this.f55594f, m81308h(), this.f55594f + m81309i());
        Rect rect2 = new Rect();
        for (int i = 0; i < getItemCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                rect2.left = getDecoratedLeft(childAt);
                rect2.top = getDecoratedTop(childAt);
                rect2.right = getDecoratedRight(childAt);
                rect2.bottom = getDecoratedBottom(childAt);
                if (this.f55590b.get(i) && !Rect.intersects(rect, rect2)) {
                    removeAndRecycleView(childAt, c0586v);
                    this.f55590b.put(i, false);
                }
            }
        }
        detachAndScrapAttachedViews(c0586v);
        int i2 = 0;
        while (i2 < this.getItemCount()) {
            if (Rect.intersects(rect, this.f55589a.get(i2))) {
                View viewM3475o = c0586v.m3475o(i2);
                this.measureChildWithMargins(viewM3475o, 0, 0);
                this.addView(viewM3475o);
                Rect rect3 = this.f55589a.get(i2);
                int i3 = rect3.top;
                int i4 = this.f55594f;
                int i5 = i3 - i4;
                int i6 = rect3.bottom - i4;
                bubbleLayoutManager = this;
                bubbleLayoutManager.layoutDecoratedWithMargins(viewM3475o, rect3.left, i5, rect3.right, i6);
                yfq yfqVar = bubbleLayoutManager.f55591c;
                if (yfqVar != null) {
                    yfqVar.mo144749a(viewM3475o, (i6 - i5) / f55588l, i2 == bubbleLayoutManager.getItemCount() - 1);
                }
                bubbleLayoutManager.f55590b.put(i2, true);
            } else {
                bubbleLayoutManager = this;
            }
            i2++;
            this = bubbleLayoutManager;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m81318q(final RecyclerView recyclerView, final y20<Float> y20Var) {
        recyclerView.post(new Runnable() { // from class: l.xf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f193999a.m81316o(recyclerView, y20Var);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m81319r(yfq yfqVar) {
        this.f55591c = yfqVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        return super.scrollHorizontallyBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void scrollToPosition(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > getItemCount()) {
            i = getItemCount();
        }
        int iM81309i = i * f55588l;
        if (iM81309i > this.f55592d - m81309i()) {
            iM81309i = this.f55592d - m81309i();
        }
        this.f55594f = iM81309i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i2 = this.f55594f;
        if (i2 + i < 0) {
            i = -i2;
        } else if (i2 + i > this.f55592d - m81309i()) {
            i = (this.f55592d - m81309i()) - this.f55594f;
        }
        this.f55594f += i;
        m81310g();
        offsetChildrenVertical(-i);
        m81317p(c0586v, c0561a0);
        return i;
    }
}
