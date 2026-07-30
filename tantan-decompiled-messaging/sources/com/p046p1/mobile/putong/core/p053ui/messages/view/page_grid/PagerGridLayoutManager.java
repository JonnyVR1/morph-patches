package com.p046p1.mobile.putong.core.p053ui.messages.view.page_grid;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p149l.a760;

/* JADX INFO: loaded from: classes4.dex */
public class PagerGridLayoutManager extends RecyclerView.AbstractC0577o implements RecyclerView.AbstractC0587y.b {

    /* JADX INFO: renamed from: a */
    public int f32515a;

    /* JADX INFO: renamed from: b */
    public int f32516b;

    /* JADX INFO: renamed from: c */
    public int f32517c;

    /* JADX INFO: renamed from: d */
    public int f32518d;

    /* JADX INFO: renamed from: e */
    public int f32519e;

    /* JADX INFO: renamed from: f */
    public int f32520f;

    /* JADX INFO: renamed from: g */
    public SparseArray<Rect> f32521g;

    /* JADX INFO: renamed from: h */
    public int f32522h;

    /* JADX INFO: renamed from: i */
    public int f32523i;

    /* JADX INFO: renamed from: j */
    public int f32524j;

    /* JADX INFO: renamed from: k */
    public int f32525k;

    /* JADX INFO: renamed from: l */
    public int f32526l;

    /* JADX INFO: renamed from: m */
    public int f32527m;

    /* JADX INFO: renamed from: n */
    public int f32528n;

    /* JADX INFO: renamed from: o */
    public boolean f32529o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f32530p;

    /* JADX INFO: renamed from: q */
    public int f32531q;

    /* JADX INFO: renamed from: r */
    public int f32532r;

    /* JADX INFO: renamed from: a */
    public final void m50048a(RecyclerView.C0584v c0584v, Rect rect, int i) {
        View viewM3466o = c0584v.m3466o(i);
        Rect rectM50049c = m50049c(i);
        if (!Rect.intersects(rect, rectM50049c)) {
            removeAndRecycleView(viewM3466o, c0584v);
            return;
        }
        addView(viewM3466o);
        measureChildWithMargins(viewM3466o, this.f32524j, this.f32525k);
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) viewM3466o.getLayoutParams();
        layoutDecorated(viewM3466o, (rectM50049c.left - this.f32516b) + ((ViewGroup.MarginLayoutParams) c0578p).leftMargin + getPaddingLeft(), (rectM50049c.top - this.f32517c) + ((ViewGroup.MarginLayoutParams) c0578p).topMargin + getPaddingTop(), ((rectM50049c.right - this.f32516b) - ((ViewGroup.MarginLayoutParams) c0578p).rightMargin) + getPaddingLeft(), ((rectM50049c.bottom - this.f32517c) - ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin) + getPaddingTop());
    }

    /* JADX INFO: renamed from: c */
    public final Rect m50049c(int i) {
        int iM50055j;
        Rect rect = this.f32521g.get(i);
        if (rect == null) {
            rect = new Rect();
            int i2 = i / this.f32520f;
            int iM50056k = 0;
            if (canScrollHorizontally()) {
                iM50056k = m50056k() * i2;
                iM50055j = 0;
            } else {
                iM50055j = m50055j() * i2;
            }
            int i3 = i % this.f32520f;
            int i4 = this.f32519e;
            int i5 = i3 / i4;
            int i6 = i3 - (i4 * i5);
            int i7 = this.f32522h;
            int i8 = iM50056k + (i6 * i7);
            int i9 = this.f32523i;
            int i10 = iM50055j + (i5 * i9);
            rect.left = i8;
            rect.top = i10;
            rect.right = i8 + i7;
            rect.bottom = i10 + i9;
            this.f32521g.put(i, rect);
        }
        return rect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return this.f32515a == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return this.f32515a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y.b
    public PointF computeScrollVectorForPosition(int i) {
        PointF pointF = new PointF();
        int[] iArrM50053h = m50053h(i);
        pointF.x = iArrM50053h[0];
        pointF.y = iArrM50053h[1];
        return pointF;
    }

    /* JADX INFO: renamed from: e */
    public final int m50050e() {
        int i;
        if (canScrollVertically()) {
            int iM50055j = m50055j();
            int i2 = this.f32517c;
            if (i2 <= 0 || iM50055j <= 0) {
                return 0;
            }
            i = i2 / iM50055j;
            if (i2 % iM50055j <= iM50055j / 2) {
                return i;
            }
        } else {
            int iM50056k = m50056k();
            int i3 = this.f32516b;
            if (i3 <= 0 || iM50056k <= 0) {
                return 0;
            }
            i = i3 / iM50056k;
            if (i3 % iM50056k <= iM50056k / 2) {
                return i;
            }
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m50051f(int i) {
        return i / this.f32520f;
    }

    /* JADX INFO: renamed from: g */
    public final int[] m50052g(int i) {
        int[] iArr = new int[2];
        int iM50051f = m50051f(i);
        if (canScrollHorizontally()) {
            iArr[0] = iM50051f * m50056k();
            iArr[1] = 0;
            return iArr;
        }
        iArr[0] = 0;
        iArr[1] = iM50051f * m50055j();
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return new RecyclerView.C0578p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public int[] m50053h(int i) {
        int[] iArrM50052g = m50052g(i);
        return new int[]{iArrM50052g[0] - this.f32516b, iArrM50052g[1] - this.f32517c};
    }

    /* JADX INFO: renamed from: i */
    public final int m50054i() {
        if (getItemCount() <= 0) {
            return 0;
        }
        int itemCount = getItemCount() / this.f32520f;
        return getItemCount() % this.f32520f != 0 ? itemCount + 1 : itemCount;
    }

    /* JADX INFO: renamed from: j */
    public final int m50055j() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: k */
    public final int m50056k() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: l */
    public boolean m50057l() {
        return this.f32529o;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: m */
    public final void m50058m(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        if (c0588z.m3490f()) {
            return;
        }
        Rect rect = new Rect(this.f32516b - this.f32522h, this.f32517c - this.f32523i, m50056k() + this.f32516b + this.f32522h, m50055j() + this.f32517c + this.f32523i);
        rect.intersect(0, 0, this.f32526l + m50056k(), this.f32527m + m50055j());
        rect.toString();
        int iM50050e = m50050e();
        int i = this.f32520f;
        int i2 = (iM50050e * i) - (i * 2);
        int i3 = i2 >= 0 ? i2 : 0;
        int itemCount = (i * 4) + i3;
        if (itemCount > getItemCount()) {
            itemCount = getItemCount();
        }
        detachAndScrapAttachedViews(c0584v);
        if (z) {
            while (i3 < itemCount) {
                m50048a(c0584v, rect, i3);
                i3++;
            }
        } else {
            for (int i4 = itemCount - 1; i4 >= i3; i4--) {
                m50048a(c0584v, rect, i4);
            }
        }
        getChildCount();
    }

    /* JADX INFO: renamed from: n */
    public void m50059n(int i) {
        int iM50056k;
        int iM50055j;
        if (i < 0 || i >= this.f32531q || this.f32530p == null) {
            return;
        }
        if (canScrollVertically()) {
            iM50055j = (m50055j() * i) - this.f32517c;
            iM50056k = 0;
        } else {
            iM50056k = (m50056k() * i) - this.f32516b;
            iM50055j = 0;
        }
        this.f32530p.scrollBy(iM50056k, iM50055j);
        m50061p(i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m50060o(int i) {
        if (i >= 0) {
            this.f32531q = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f32530p = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0584v c0584v) {
        super.onDetachedFromWindow(recyclerView, c0584v);
        this.f32530p = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (c0588z.m3490f() || !c0588z.m3486b()) {
            return;
        }
        if (getItemCount() == 0) {
            removeAndRecycleAllViews(c0584v);
            m50060o(0);
            m50061p(0, false);
            return;
        }
        m50060o(m50054i());
        m50061p(m50050e(), false);
        int itemCount = getItemCount() / this.f32520f;
        if (getItemCount() % this.f32520f != 0) {
            itemCount++;
        }
        if (canScrollHorizontally()) {
            int iM50056k = (itemCount - 1) * m50056k();
            this.f32526l = iM50056k;
            this.f32527m = 0;
            if (this.f32516b > iM50056k) {
                this.f32516b = iM50056k;
            }
        } else {
            this.f32526l = 0;
            int iM50055j = (itemCount - 1) * m50055j();
            this.f32527m = iM50055j;
            if (this.f32517c > iM50055j) {
                this.f32517c = iM50055j;
            }
        }
        if (this.f32522h <= 0) {
            this.f32522h = m50056k() / this.f32519e;
        }
        if (this.f32523i <= 0) {
            this.f32523i = m50055j() / this.f32518d;
        }
        this.f32524j = m50056k() - this.f32522h;
        this.f32525k = m50055j() - this.f32523i;
        for (int i = 0; i < this.f32520f * 2; i++) {
            m50049c(i);
        }
        if (this.f32516b == 0 && this.f32517c == 0) {
            for (int i2 = 0; i2 < this.f32520f && i2 < getItemCount(); i2++) {
                View viewM3466o = c0584v.m3466o(i2);
                addView(viewM3466o);
                measureChildWithMargins(viewM3466o, this.f32524j, this.f32525k);
            }
        }
        m50058m(c0584v, c0588z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutCompleted(RecyclerView.C0588z c0588z) {
        super.onLayoutCompleted(c0588z);
        if (c0588z.m3490f()) {
            return;
        }
        m50060o(m50054i());
        m50061p(m50050e(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onMeasure(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i, int i2) {
        super.onMeasure(c0584v, c0588z, i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && size > 0) {
            mode = 1073741824;
        }
        if (mode2 != 1073741824 && size2 > 0) {
            mode2 = 1073741824;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onScrollStateChanged(int i) {
        this.f32528n = i;
        super.onScrollStateChanged(i);
        if (i == 0) {
            m50061p(m50050e(), false);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m50061p(int i, boolean z) {
        if (i == this.f32532r) {
            return;
        }
        if (m50057l()) {
            this.f32532r = i;
        } else {
            if (z) {
                return;
            }
            this.f32532r = i;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m50062q(int i) {
        if (i < 0 || i >= this.f32531q || this.f32530p == null) {
            return;
        }
        int iM50050e = m50050e();
        if (Math.abs(i - iM50050e) > 3) {
            if (i > iM50050e) {
                m50059n(i - 3);
            } else if (i < iM50050e) {
                m50059n(i + 3);
            }
        }
        a760 a760Var = new a760(this.f32530p);
        a760Var.setTargetPosition(i * this.f32520f);
        startSmoothScroll(a760Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i2 = this.f32516b;
        int i3 = i2 + i;
        int i4 = this.f32526l;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f32516b = i2 + i;
        m50061p(m50050e(), true);
        offsetChildrenHorizontal(-i);
        if (i > 0) {
            m50058m(c0584v, c0588z, true);
            return i;
        }
        m50058m(c0584v, c0588z, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void scrollToPosition(int i) {
        m50059n(m50051f(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i2 = this.f32517c;
        int i3 = i2 + i;
        int i4 = this.f32527m;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f32517c = i2 + i;
        m50061p(m50050e(), true);
        offsetChildrenVertical(-i);
        if (i > 0) {
            m50058m(c0584v, c0588z, true);
            return i;
        }
        m50058m(c0584v, c0588z, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        m50062q(m50051f(i));
    }
}
