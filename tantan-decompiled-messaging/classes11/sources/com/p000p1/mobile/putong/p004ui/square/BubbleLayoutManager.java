package com.p000p1.mobile.putong.p004ui.square;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e30;
import l.t100;
import l.xdl0;
import p009l.ydq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BubbleLayoutManager extends RecyclerView.o {

    /* JADX INFO: renamed from: l */
    public static final int f8346l = t100.d(98.0f);

    /* JADX INFO: renamed from: c */
    public ydq f8349c;

    /* JADX INFO: renamed from: f */
    public int f8352f;

    /* JADX INFO: renamed from: g */
    public final int f8353g;

    /* JADX INFO: renamed from: h */
    public final int f8354h;

    /* JADX INFO: renamed from: i */
    public final int f8355i;

    /* JADX INFO: renamed from: j */
    public int f8356j;

    /* JADX INFO: renamed from: k */
    public boolean f8357k;

    /* JADX INFO: renamed from: a */
    public SparseArray<Rect> f8347a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public SparseBooleanArray f8348b = new SparseBooleanArray();

    /* JADX INFO: renamed from: d */
    public int f8350d = 0;

    /* JADX INFO: renamed from: e */
    public int f8351e = 0;

    public BubbleLayoutManager() {
        int i = f8346l;
        this.f8353g = i / 2;
        this.f8354h = i / 3;
        this.f8355i = i / 6;
        this.f8356j = 0;
        this.f8357k = false;
    }

    /* JADX INFO: renamed from: h */
    private int m10456h() {
        return (getWidth() - getPaddingStart()) - getPaddingEnd();
    }

    /* JADX INFO: renamed from: i */
    private int m10457i() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m10458g() {
        this.f8350d = f8346l;
        this.f8347a.clear();
        int i = 0;
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            Rect rect = this.f8347a.get(i2);
            if (rect == null) {
                rect = new Rect();
            }
            int i3 = this.f8350d;
            int iY0 = xdl0.y0();
            int i4 = this.f8350d;
            int i5 = f8346l;
            rect.set(0, i3, iY0, i4 + i5);
            this.f8350d += i5;
            this.f8347a.put(i2, rect);
        }
        int itemCount = getItemCount() - 1;
        int i6 = this.f8352f;
        int i7 = f8346l;
        int i8 = i6 + i7;
        if (i8 > i7) {
            for (int i9 = itemCount; i9 >= 0; i9--) {
                Rect rect2 = this.f8347a.get(i9);
                if (rect2.top < i8) {
                    int i10 = f8346l;
                    int iCeil = i10 - ((int) Math.ceil(((double) (i8 % i10)) / 2.0d));
                    if (iCeil == i10) {
                        int i11 = i8 % i10;
                        int i12 = this.f8353g;
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
        if (i8 > f8346l * 2) {
            for (int i13 = itemCount; i13 >= 0; i13--) {
                Rect rect3 = this.f8347a.get(i13);
                if (rect3.top < i8) {
                    int i14 = this.f8353g;
                    int i15 = f8346l;
                    int iCeil2 = i14 - ((int) Math.ceil(((double) (i8 % i15)) / 6.0d));
                    int i16 = this.f8353g;
                    if (iCeil2 == i16 && (i8 % i15 > i16 || i8 % i15 == 0)) {
                        iCeil2 = this.f8354h;
                    }
                    rect3.bottom = i;
                    i -= iCeil2;
                    rect3.top = i;
                    itemCount = i13 - 1;
                    break;
                }
            }
        }
        if (i8 > f8346l * 3) {
            while (itemCount >= 0) {
                Rect rect4 = this.f8347a.get(itemCount);
                if (rect4.top < i8) {
                    int i17 = this.f8354h;
                    int i18 = f8346l;
                    int iCeil3 = i17 - ((int) Math.ceil(((double) (i8 % i18)) / 6.0d));
                    if (iCeil3 == this.f8354h && (i8 % i18 > this.f8353g || i8 % i18 == 0)) {
                        iCeil3 = this.f8355i;
                    }
                    rect4.bottom = i;
                    rect4.top = i - iCeil3;
                    break;
                }
                itemCount--;
            }
        }
        this.f8351e = this.f8350d;
        int iMax = Math.max(m10457i(), this.f8350d);
        this.f8350d = iMax;
        if (this.f8352f > iMax - m10457i()) {
            this.f8352f = this.f8350d - m10457i();
            m10458g();
        }
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-1, -2);
    }

    /* JADX INFO: renamed from: j */
    public int m10459j() {
        return (this.f8351e - m10457i()) - this.f8352f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m10460k() {
        return this.f8357k;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m10461l(RecyclerView recyclerView, e30 e30Var, ValueAnimator valueAnimator) {
        recyclerView.scrollBy(0, ((Integer) valueAnimator.getAnimatedValue()).intValue() - this.f8356j);
        this.f8356j = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (e30Var != null) {
            e30Var.call(Float.valueOf(valueAnimator.getAnimatedFraction()));
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10462m() {
        this.f8357k = true;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10463n(e30 e30Var) {
        this.f8357k = false;
        if (NullChecker.a(e30Var)) {
            e30Var.call(Float.valueOf(1.0f));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10464o(final RecyclerView recyclerView, final e30 e30Var) {
        this.f8356j = 0;
        int iM10457i = (this.f8350d - m10457i()) - this.f8352f;
        if (iM10457i > 0 || !this.f8357k) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM10457i);
            valueAnimatorOfInt.setDuration(600L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kf3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f15623a.m10461l(recyclerView, e30Var, valueAnimator);
                }
            });
            bt0.w(valueAnimatorOfInt, new Runnable() { // from class: l.lf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16131a.m10462m();
                }
            }, new Runnable() { // from class: l.mf3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16869a.m10463n(e30Var);
                }
            });
            valueAnimatorOfInt.start();
        }
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getItemCount() <= 0 || zVar.f()) {
            return;
        }
        detachAndScrapAttachedViews(vVar);
        m10458g();
        m10465p(vVar, zVar);
    }

    /* JADX INFO: renamed from: p */
    public final void m10465p(RecyclerView.v vVar, RecyclerView.z zVar) {
        BubbleLayoutManager bubbleLayoutManager;
        if (getItemCount() <= 0 || zVar.f()) {
            return;
        }
        Rect rect = new Rect(0, this.f8352f, m10456h(), this.f8352f + m10457i());
        Rect rect2 = new Rect();
        for (int i = 0; i < getItemCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                rect2.left = getDecoratedLeft(childAt);
                rect2.top = getDecoratedTop(childAt);
                rect2.right = getDecoratedRight(childAt);
                rect2.bottom = getDecoratedBottom(childAt);
                if (this.f8348b.get(i) && !Rect.intersects(rect, rect2)) {
                    removeAndRecycleView(childAt, vVar);
                    this.f8348b.put(i, false);
                }
            }
        }
        detachAndScrapAttachedViews(vVar);
        int i2 = 0;
        while (i2 < this.getItemCount()) {
            if (Rect.intersects(rect, this.f8347a.get(i2))) {
                View viewO = vVar.o(i2);
                this.measureChildWithMargins(viewO, 0, 0);
                this.addView(viewO);
                Rect rect3 = this.f8347a.get(i2);
                int i3 = rect3.top;
                int i4 = this.f8352f;
                int i5 = i3 - i4;
                int i6 = rect3.bottom - i4;
                bubbleLayoutManager = this;
                bubbleLayoutManager.layoutDecoratedWithMargins(viewO, rect3.left, i5, rect3.right, i6);
                ydq ydqVar = bubbleLayoutManager.f8349c;
                if (ydqVar != null) {
                    ydqVar.mo23374a(viewO, (i6 - i5) / f8346l, i2 == bubbleLayoutManager.getItemCount() - 1);
                }
                bubbleLayoutManager.f8348b.put(i2, true);
            } else {
                bubbleLayoutManager = this;
            }
            i2++;
            this = bubbleLayoutManager;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m10466q(final RecyclerView recyclerView, final e30<Float> e30Var) {
        recyclerView.post(new Runnable() { // from class: l.jf3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15093a.m10464o(recyclerView, e30Var);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m10467r(ydq ydqVar) {
        this.f8349c = ydqVar;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        return super.scrollHorizontallyBy(i, vVar, zVar);
    }

    public void scrollToPosition(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i > getItemCount()) {
            i = getItemCount();
        }
        int iM10457i = i * f8346l;
        if (iM10457i > this.f8350d - m10457i()) {
            iM10457i = this.f8350d - m10457i();
        }
        this.f8352f = iM10457i;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i2 = this.f8352f;
        if (i2 + i < 0) {
            i = -i2;
        } else if (i2 + i > this.f8350d - m10457i()) {
            i = (this.f8350d - m10457i()) - this.f8352f;
        }
        this.f8352f += i;
        m10458g();
        offsetChildrenVertical(-i);
        m10465p(vVar, zVar);
        return i;
    }
}
