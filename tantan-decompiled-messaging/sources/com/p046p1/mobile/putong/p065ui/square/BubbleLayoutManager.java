package com.p046p1.mobile.putong.p065ui.square;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import p149l.bt0;
import p149l.e30;
import p149l.t100;
import p149l.xdl0;
import p149l.ydq;

/* JADX INFO: loaded from: classes11.dex */
public class BubbleLayoutManager extends RecyclerView.AbstractC0577o {

    /* JADX INFO: renamed from: l */
    public static final int f54740l = t100.m186890d(98.0f);

    /* JADX INFO: renamed from: c */
    public ydq f54743c;

    /* JADX INFO: renamed from: f */
    public int f54746f;

    /* JADX INFO: renamed from: g */
    public final int f54747g;

    /* JADX INFO: renamed from: h */
    public final int f54748h;

    /* JADX INFO: renamed from: i */
    public final int f54749i;

    /* JADX INFO: renamed from: j */
    public int f54750j;

    /* JADX INFO: renamed from: k */
    public boolean f54751k;

    /* JADX INFO: renamed from: a */
    public SparseArray<Rect> f54741a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public SparseBooleanArray f54742b = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public int f54744d = 0;

    /* JADX INFO: renamed from: e */
    public int f54745e = 0;

    public BubbleLayoutManager() {
        int i = f54740l;
        this.f54747g = i / 2;
        this.f54748h = i / 3;
        this.f54749i = i / 6;
        this.f54750j = 0;
        this.f54751k = false;
    }

    /* JADX INFO: renamed from: h */
    private int m80125h() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    /* JADX INFO: renamed from: i */
    private int m80126i() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m80127g() {
        this.f54744d = f54740l;
        this.f54741a.clear();
        int i = 0;
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            Rect rect = this.f54741a.get(i2);
            if (rect == null) {
                rect = new Rect();
            }
            int i3 = this.f54744d;
            int iM208412y0 = xdl0.m208412y0();
            int i4 = this.f54744d;
            int i5 = f54740l;
            rect.set(0, i3, iM208412y0, i4 + i5);
            this.f54744d += i5;
            this.f54741a.put(i2, rect);
        }
        int itemCount = getItemCount() - 1;
        int i6 = this.f54746f;
        int i7 = f54740l;
        int i8 = i6 + i7;
        if (i8 > i7) {
            for (int i9 = itemCount; i9 >= 0; i9--) {
                Rect rect2 = this.f54741a.get(i9);
                if (rect2.top < i8) {
                    int i10 = f54740l;
                    int iCeil = i10 - ((int) Math.ceil(((double) (i8 % i10)) / 2.0d));
                    if (iCeil == i10) {
                        int i11 = i8 % i10;
                        int i12 = this.f54747g;
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
        if (i8 > f54740l * 2) {
            for (int i13 = itemCount; i13 >= 0; i13--) {
                Rect rect3 = this.f54741a.get(i13);
                if (rect3.top < i8) {
                    int i14 = this.f54747g;
                    int i15 = f54740l;
                    int iCeil2 = i14 - ((int) Math.ceil(((double) (i8 % i15)) / 6.0d));
                    int i16 = this.f54747g;
                    if (iCeil2 == i16 && (i8 % i15 > i16 || i8 % i15 == 0)) {
                        iCeil2 = this.f54748h;
                    }
                    rect3.bottom = i;
                    i -= iCeil2;
                    rect3.top = i;
                    itemCount = i13 - 1;
                    break;
                }
            }
        }
        if (i8 > f54740l * 3) {
            while (itemCount >= 0) {
                Rect rect4 = this.f54741a.get(itemCount);
                if (rect4.top < i8) {
                    int i17 = this.f54748h;
                    int i18 = f54740l;
                    int iCeil3 = i17 - ((int) Math.ceil(((double) (i8 % i18)) / 6.0d));
                    if (iCeil3 == this.f54748h && (i8 % i18 > this.f54747g || i8 % i18 == 0)) {
                        iCeil3 = this.f54749i;
                    }
                    rect4.bottom = i;
                    rect4.top = i - iCeil3;
                    break;
                }
                itemCount--;
            }
        }
        this.f54745e = this.f54744d;
        int iMax = Math.max(m80126i(), this.f54744d);
        this.f54744d = iMax;
        if (this.f54746f > iMax - m80126i()) {
            this.f54746f = this.f54744d - m80126i();
            m80127g();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return new RecyclerView.C0578p(-1, -2);
    }

    /* JADX INFO: renamed from: j */
    public int m80128j() {
        return (this.f54745e - m80126i()) - this.f54746f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m80129k() {
        return this.f54751k;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m80130l(RecyclerView recyclerView, e30 e30Var, ValueAnimator valueAnimator) {
        recyclerView.scrollBy(0, ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.f54750j);
        this.f54750j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (e30Var != null) {
            e30Var.call(Float.valueOf(valueAnimator.getAnimatedFraction()));
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m80131m() {
        this.f54751k = true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m80132n(e30 e30Var) {
        this.f54751k = false;
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Float.valueOf(1.0f));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m80133o(final RecyclerView recyclerView, final e30 e30Var) {
        this.f54750j = 0;
        int iM80126i = (this.f54744d - m80126i()) - this.f54746f;
        if (iM80126i > 0 || !this.f54751k) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM80126i);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kf3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f122892a.m80130l(recyclerView, e30Var, valueAnimator);
                }
            });
            bt0.m103750w(valueAnimatorOfInt, new Runnable() { // from class: l.lf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f127828a.m80131m();
                }
            }, new Runnable() { // from class: l.mf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133555a.m80132n(e30Var);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (getItemCount() <= 0 || c0588z.m3490f()) {
            return;
        }
        detachAndScrapAttachedViews(c0584v);
        m80127g();
        m80134p(c0584v, c0588z);
    }

    /* JADX INFO: renamed from: p */
    public final void m80134p(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        BubbleLayoutManager bubbleLayoutManager;
        if (getItemCount() <= 0 || c0588z.m3490f()) {
            return;
        }
        Rect rect = new Rect(0, this.f54746f, m80125h(), this.f54746f + m80126i());
        Rect rect2 = new Rect();
        for (int i = 0; i < getItemCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                rect2.left = getDecoratedLeft(childAt);
                rect2.top = getDecoratedTop(childAt);
                rect2.right = getDecoratedRight(childAt);
                rect2.bottom = getDecoratedBottom(childAt);
                if (this.f54742b.get(i) && !Rect.intersects(rect, rect2)) {
                    removeAndRecycleView(childAt, c0584v);
                    this.f54742b.put(i, false);
                }
            }
        }
        detachAndScrapAttachedViews(c0584v);
        int i2 = 0;
        while (i2 < this.getItemCount()) {
            if (Rect.intersects(rect, this.f54741a.get(i2))) {
                View viewM3466o = c0584v.m3466o(i2);
                this.measureChildWithMargins(viewM3466o, 0, 0);
                this.addView(viewM3466o);
                Rect rect3 = this.f54741a.get(i2);
                int i3 = rect3.top;
                int i4 = this.f54746f;
                int i5 = i3 - i4;
                int i6 = rect3.bottom - i4;
                bubbleLayoutManager = this;
                bubbleLayoutManager.layoutDecoratedWithMargins(viewM3466o, rect3.left, i5, rect3.right, i6);
                ydq ydqVar = bubbleLayoutManager.f54743c;
                if (ydqVar != null) {
                    ydqVar.mo198263a(viewM3466o, (i6 - i5) / f54740l, i2 == bubbleLayoutManager.getItemCount() - 1);
                }
                bubbleLayoutManager.f54742b.put(i2, true);
            } else {
                bubbleLayoutManager = this;
            }
            i2++;
            this = bubbleLayoutManager;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m80135q(final RecyclerView recyclerView, final e30<Float> e30Var) {
        recyclerView.post(new Runnable() { // from class: l.jf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f117628a.m80133o(recyclerView, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m80136r(ydq ydqVar) {
        this.f54743c = ydqVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        return super.scrollHorizontallyBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void scrollToPosition(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > getItemCount()) {
            i = getItemCount();
        }
        int iM80126i = i * f54740l;
        if (iM80126i > this.f54744d - m80126i()) {
            iM80126i = this.f54744d - m80126i();
        }
        this.f54746f = iM80126i;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i2 = this.f54746f;
        if (i2 + i < 0) {
            i = -i2;
        } else if (i2 + i > this.f54744d - m80126i()) {
            i = (this.f54744d - m80126i()) - this.f54746f;
        }
        this.f54746f += i;
        m80127g();
        offsetChildrenVertical(-i);
        m80134p(c0584v, c0588z);
        return i;
    }
}
