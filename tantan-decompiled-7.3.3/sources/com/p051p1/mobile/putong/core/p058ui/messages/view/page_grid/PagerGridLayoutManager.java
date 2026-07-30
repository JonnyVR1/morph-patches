package com.p051p1.mobile.putong.core.p058ui.messages.view.page_grid;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p153l.gf60;

/* JADX INFO: loaded from: classes4.dex */
public class PagerGridLayoutManager extends RecyclerView.AbstractC0579o implements RecyclerView.AbstractC0590z.b {

    /* JADX INFO: renamed from: a */
    public int f33363a;

    /* JADX INFO: renamed from: b */
    public int f33364b;

    /* JADX INFO: renamed from: c */
    public int f33365c;

    /* JADX INFO: renamed from: d */
    public int f33366d;

    /* JADX INFO: renamed from: e */
    public int f33367e;

    /* JADX INFO: renamed from: f */
    public int f33368f;

    /* JADX INFO: renamed from: g */
    public SparseArray<Rect> f33369g;

    /* JADX INFO: renamed from: h */
    public int f33370h;

    /* JADX INFO: renamed from: i */
    public int f33371i;

    /* JADX INFO: renamed from: j */
    public int f33372j;

    /* JADX INFO: renamed from: k */
    public int f33373k;

    /* JADX INFO: renamed from: l */
    public int f33374l;

    /* JADX INFO: renamed from: m */
    public int f33375m;

    /* JADX INFO: renamed from: n */
    public int f33376n;

    /* JADX INFO: renamed from: o */
    public boolean f33377o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f33378p;

    /* JADX INFO: renamed from: q */
    public int f33379q;

    /* JADX INFO: renamed from: r */
    public int f33380r;

    /* JADX INFO: renamed from: a */
    public final void m51231a(RecyclerView.C0586v c0586v, Rect rect, int i) {
        View viewM3475o = c0586v.m3475o(i);
        Rect rectM51232c = m51232c(i);
        if (!Rect.intersects(rect, rectM51232c)) {
            removeAndRecycleView(viewM3475o, c0586v);
            return;
        }
        addView(viewM3475o);
        measureChildWithMargins(viewM3475o, this.f33372j, this.f33373k);
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) viewM3475o.getLayoutParams();
        layoutDecorated(viewM3475o, (rectM51232c.left - this.f33364b) + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin + getPaddingLeft(), (rectM51232c.top - this.f33365c) + ((ViewGroup.MarginLayoutParams) c0580p).topMargin + getPaddingTop(), ((rectM51232c.right - this.f33364b) - ((ViewGroup.MarginLayoutParams) c0580p).rightMargin) + getPaddingLeft(), ((rectM51232c.bottom - this.f33365c) - ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin) + getPaddingTop());
    }

    /* JADX INFO: renamed from: c */
    public final Rect m51232c(int i) {
        int iM51238j;
        Rect rect = this.f33369g.get(i);
        if (rect == null) {
            rect = new Rect();
            int i2 = i / this.f33368f;
            int iM51239k = 0;
            if (canScrollHorizontally()) {
                iM51239k = m51239k() * i2;
                iM51238j = 0;
            } else {
                iM51238j = m51238j() * i2;
            }
            int i3 = i % this.f33368f;
            int i4 = this.f33367e;
            int i5 = i3 / i4;
            int i6 = i3 - (i4 * i5);
            int i7 = this.f33370h;
            int i8 = iM51239k + (i6 * i7);
            int i9 = this.f33371i;
            int i10 = iM51238j + (i5 * i9);
            rect.left = i8;
            rect.top = i10;
            rect.right = i8 + i7;
            rect.bottom = i10 + i9;
            this.f33369g.put(i, rect);
        }
        return rect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return this.f33363a == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return this.f33363a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z.b
    public PointF computeScrollVectorForPosition(int i) {
        PointF pointF = new PointF();
        int[] iArrM51236h = m51236h(i);
        pointF.x = iArrM51236h[0];
        pointF.y = iArrM51236h[1];
        return pointF;
    }

    /* JADX INFO: renamed from: e */
    public final int m51233e() {
        int i;
        if (canScrollVertically()) {
            int iM51238j = m51238j();
            int i2 = this.f33365c;
            if (i2 <= 0 || iM51238j <= 0) {
                return 0;
            }
            i = i2 / iM51238j;
            if (i2 % iM51238j <= iM51238j / 2) {
                return i;
            }
        } else {
            int iM51239k = m51239k();
            int i3 = this.f33364b;
            if (i3 <= 0 || iM51239k <= 0) {
                return 0;
            }
            i = i3 / iM51239k;
            if (i3 % iM51239k <= iM51239k / 2) {
                return i;
            }
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m51234f(int i) {
        return i / this.f33368f;
    }

    /* JADX INFO: renamed from: g */
    public final int[] m51235g(int i) {
        int[] iArr = new int[2];
        int iM51234f = m51234f(i);
        if (canScrollHorizontally()) {
            iArr[0] = iM51234f * m51239k();
            iArr[1] = 0;
            return iArr;
        }
        iArr[0] = 0;
        iArr[1] = iM51234f * m51238j();
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return new RecyclerView.C0580p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public int[] m51236h(int i) {
        int[] iArrM51235g = m51235g(i);
        return new int[]{iArrM51235g[0] - this.f33364b, iArrM51235g[1] - this.f33365c};
    }

    /* JADX INFO: renamed from: i */
    public final int m51237i() {
        if (getItemCount() <= 0) {
            return 0;
        }
        int itemCount = getItemCount() / this.f33368f;
        return getItemCount() % this.f33368f != 0 ? itemCount + 1 : itemCount;
    }

    /* JADX INFO: renamed from: j */
    public final int m51238j() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: k */
    public final int m51239k() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: l */
    public boolean m51240l() {
        return this.f33377o;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: m */
    public final void m51241m(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        if (c0561a0.m3364f()) {
            return;
        }
        Rect rect = new Rect(this.f33364b - this.f33370h, this.f33365c - this.f33371i, m51239k() + this.f33364b + this.f33370h, m51238j() + this.f33365c + this.f33371i);
        rect.intersect(0, 0, this.f33374l + m51239k(), this.f33375m + m51238j());
        rect.toString();
        int iM51233e = m51233e();
        int i = this.f33368f;
        int i2 = (iM51233e * i) - (i * 2);
        int i3 = i2 >= 0 ? i2 : 0;
        int itemCount = (i * 4) + i3;
        if (itemCount > getItemCount()) {
            itemCount = getItemCount();
        }
        detachAndScrapAttachedViews(c0586v);
        if (z) {
            while (i3 < itemCount) {
                m51231a(c0586v, rect, i3);
                i3++;
            }
        } else {
            for (int i4 = itemCount - 1; i4 >= i3; i4--) {
                m51231a(c0586v, rect, i4);
            }
        }
        getChildCount();
    }

    /* JADX INFO: renamed from: n */
    public void m51242n(int i) {
        int iM51239k;
        int iM51238j;
        if (i < 0 || i >= this.f33379q || this.f33378p == null) {
            return;
        }
        if (canScrollVertically()) {
            iM51238j = (m51238j() * i) - this.f33365c;
            iM51239k = 0;
        } else {
            iM51239k = (m51239k() * i) - this.f33364b;
            iM51238j = 0;
        }
        this.f33378p.scrollBy(iM51239k, iM51238j);
        m51244p(i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m51243o(int i) {
        if (i >= 0) {
            this.f33379q = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f33378p = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0586v c0586v) {
        super.onDetachedFromWindow(recyclerView, c0586v);
        this.f33378p = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (c0561a0.m3364f() || !c0561a0.m3360b()) {
            return;
        }
        if (getItemCount() == 0) {
            removeAndRecycleAllViews(c0586v);
            m51243o(0);
            m51244p(0, false);
            return;
        }
        m51243o(m51237i());
        m51244p(m51233e(), false);
        int itemCount = getItemCount() / this.f33368f;
        if (getItemCount() % this.f33368f != 0) {
            itemCount++;
        }
        if (canScrollHorizontally()) {
            int iM51239k = (itemCount - 1) * m51239k();
            this.f33374l = iM51239k;
            this.f33375m = 0;
            if (this.f33364b > iM51239k) {
                this.f33364b = iM51239k;
            }
        } else {
            this.f33374l = 0;
            int iM51238j = (itemCount - 1) * m51238j();
            this.f33375m = iM51238j;
            if (this.f33365c > iM51238j) {
                this.f33365c = iM51238j;
            }
        }
        if (this.f33370h <= 0) {
            this.f33370h = m51239k() / this.f33367e;
        }
        if (this.f33371i <= 0) {
            this.f33371i = m51238j() / this.f33366d;
        }
        this.f33372j = m51239k() - this.f33370h;
        this.f33373k = m51238j() - this.f33371i;
        for (int i = 0; i < this.f33368f * 2; i++) {
            m51232c(i);
        }
        if (this.f33364b == 0 && this.f33365c == 0) {
            for (int i2 = 0; i2 < this.f33368f && i2 < getItemCount(); i2++) {
                View viewM3475o = c0586v.m3475o(i2);
                addView(viewM3475o);
                measureChildWithMargins(viewM3475o, this.f33372j, this.f33373k);
            }
        }
        m51241m(c0586v, c0561a0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutCompleted(RecyclerView.C0561a0 c0561a0) {
        super.onLayoutCompleted(c0561a0);
        if (c0561a0.m3364f()) {
            return;
        }
        m51243o(m51237i());
        m51244p(m51233e(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onMeasure(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i, int i2) {
        super.onMeasure(c0586v, c0561a0, i, i2);
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onScrollStateChanged(int i) {
        this.f33376n = i;
        super.onScrollStateChanged(i);
        if (i == 0) {
            m51244p(m51233e(), false);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m51244p(int i, boolean z) {
        if (i == this.f33380r) {
            return;
        }
        if (m51240l()) {
            this.f33380r = i;
        } else {
            if (z) {
                return;
            }
            this.f33380r = i;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m51245q(int i) {
        if (i < 0 || i >= this.f33379q || this.f33378p == null) {
            return;
        }
        int iM51233e = m51233e();
        if (Math.abs(i - iM51233e) > 3) {
            if (i > iM51233e) {
                m51242n(i - 3);
            } else if (i < iM51233e) {
                m51242n(i + 3);
            }
        }
        gf60 gf60Var = new gf60(this.f33378p);
        gf60Var.setTargetPosition(i * this.f33368f);
        startSmoothScroll(gf60Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i2 = this.f33364b;
        int i3 = i2 + i;
        int i4 = this.f33374l;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f33364b = i2 + i;
        m51244p(m51233e(), true);
        offsetChildrenHorizontal(-i);
        if (i > 0) {
            m51241m(c0586v, c0561a0, true);
            return i;
        }
        m51241m(c0586v, c0561a0, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void scrollToPosition(int i) {
        m51242n(m51234f(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i2 = this.f33365c;
        int i3 = i2 + i;
        int i4 = this.f33375m;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f33365c = i2 + i;
        m51244p(m51233e(), true);
        offsetChildrenVertical(-i);
        if (i > 0) {
            m51241m(c0586v, c0561a0, true);
            return i;
        }
        m51241m(c0586v, c0561a0, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        m51245q(m51234f(i));
    }
}
