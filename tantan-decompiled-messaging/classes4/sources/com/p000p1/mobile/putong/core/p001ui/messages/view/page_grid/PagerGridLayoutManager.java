package com.p000p1.mobile.putong.core.p001ui.messages.view.page_grid;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p002l.a760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PagerGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: a */
    public int f337a;

    /* JADX INFO: renamed from: b */
    public int f338b;

    /* JADX INFO: renamed from: c */
    public int f339c;

    /* JADX INFO: renamed from: d */
    public int f340d;

    /* JADX INFO: renamed from: e */
    public int f341e;

    /* JADX INFO: renamed from: f */
    public int f342f;

    /* JADX INFO: renamed from: g */
    public SparseArray<Rect> f343g;

    /* JADX INFO: renamed from: h */
    public int f344h;

    /* JADX INFO: renamed from: i */
    public int f345i;

    /* JADX INFO: renamed from: j */
    public int f346j;

    /* JADX INFO: renamed from: k */
    public int f347k;

    /* JADX INFO: renamed from: l */
    public int f348l;

    /* JADX INFO: renamed from: m */
    public int f349m;

    /* JADX INFO: renamed from: n */
    public int f350n;

    /* JADX INFO: renamed from: o */
    public boolean f351o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f352p;

    /* JADX INFO: renamed from: q */
    public int f353q;

    /* JADX INFO: renamed from: r */
    public int f354r;

    /* JADX INFO: renamed from: a */
    public final void m473a(RecyclerView.v vVar, Rect rect, int i) {
        View viewO = vVar.o(i);
        Rect rectM474c = m474c(i);
        if (!Rect.intersects(rect, rectM474c)) {
            removeAndRecycleView(viewO, vVar);
            return;
        }
        addView(viewO);
        measureChildWithMargins(viewO, this.f346j, this.f347k);
        RecyclerView.p layoutParams = viewO.getLayoutParams();
        layoutDecorated(viewO, (rectM474c.left - this.f338b) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + getPaddingLeft(), (rectM474c.top - this.f339c) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + getPaddingTop(), ((rectM474c.right - this.f338b) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + getPaddingLeft(), ((rectM474c.bottom - this.f339c) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + getPaddingTop());
    }

    /* JADX INFO: renamed from: c */
    public final Rect m474c(int i) {
        int iM480j;
        Rect rect = this.f343g.get(i);
        if (rect == null) {
            rect = new Rect();
            int i2 = i / this.f342f;
            int iM481k = 0;
            if (canScrollHorizontally()) {
                iM481k = m481k() * i2;
                iM480j = 0;
            } else {
                iM480j = m480j() * i2;
            }
            int i3 = i % this.f342f;
            int i4 = this.f341e;
            int i5 = i3 / i4;
            int i6 = i3 - (i4 * i5);
            int i7 = this.f344h;
            int i8 = iM481k + (i6 * i7);
            int i9 = this.f345i;
            int i10 = iM480j + (i5 * i9);
            rect.left = i8;
            rect.top = i10;
            rect.right = i8 + i7;
            rect.bottom = i10 + i9;
            this.f343g.put(i, rect);
        }
        return rect;
    }

    public boolean canScrollHorizontally() {
        return this.f337a == 1;
    }

    public boolean canScrollVertically() {
        return this.f337a == 0;
    }

    public PointF computeScrollVectorForPosition(int i) {
        PointF pointF = new PointF();
        int[] iArrM478h = m478h(i);
        pointF.x = iArrM478h[0];
        pointF.y = iArrM478h[1];
        return pointF;
    }

    /* JADX INFO: renamed from: e */
    public final int m475e() {
        int i;
        if (canScrollVertically()) {
            int iM480j = m480j();
            int i2 = this.f339c;
            if (i2 <= 0 || iM480j <= 0) {
                return 0;
            }
            i = i2 / iM480j;
            if (i2 % iM480j <= iM480j / 2) {
                return i;
            }
        } else {
            int iM481k = m481k();
            int i3 = this.f338b;
            if (i3 <= 0 || iM481k <= 0) {
                return 0;
            }
            i = i3 / iM481k;
            if (i3 % iM481k <= iM481k / 2) {
                return i;
            }
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: f */
    public final int m476f(int i) {
        return i / this.f342f;
    }

    /* JADX INFO: renamed from: g */
    public final int[] m477g(int i) {
        int[] iArr = new int[2];
        int iM476f = m476f(i);
        if (canScrollHorizontally()) {
            iArr[0] = iM476f * m481k();
            iArr[1] = 0;
            return iArr;
        }
        iArr[0] = 0;
        iArr[1] = iM476f * m480j();
        return iArr;
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public int[] m478h(int i) {
        int[] iArrM477g = m477g(i);
        return new int[]{iArrM477g[0] - this.f338b, iArrM477g[1] - this.f339c};
    }

    /* JADX INFO: renamed from: i */
    public final int m479i() {
        if (getItemCount() <= 0) {
            return 0;
        }
        int itemCount = getItemCount() / this.f342f;
        return getItemCount() % this.f342f != 0 ? itemCount + 1 : itemCount;
    }

    /* JADX INFO: renamed from: j */
    public final int m480j() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: k */
    public final int m481k() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: l */
    public boolean m482l() {
        return this.f351o;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: m */
    public final void m483m(RecyclerView.v vVar, RecyclerView.z zVar, boolean z) {
        if (zVar.f()) {
            return;
        }
        Rect rect = new Rect(this.f338b - this.f344h, this.f339c - this.f345i, m481k() + this.f338b + this.f344h, m480j() + this.f339c + this.f345i);
        rect.intersect(0, 0, this.f348l + m481k(), this.f349m + m480j());
        rect.toString();
        int iM475e = m475e();
        int i = this.f342f;
        int i2 = (iM475e * i) - (i * 2);
        int i3 = i2 >= 0 ? i2 : 0;
        int itemCount = (i * 4) + i3;
        if (itemCount > getItemCount()) {
            itemCount = getItemCount();
        }
        detachAndScrapAttachedViews(vVar);
        if (z) {
            while (i3 < itemCount) {
                m473a(vVar, rect, i3);
                i3++;
            }
        } else {
            for (int i4 = itemCount - 1; i4 >= i3; i4--) {
                m473a(vVar, rect, i4);
            }
        }
        getChildCount();
    }

    /* JADX INFO: renamed from: n */
    public void m484n(int i) {
        int iM481k;
        int iM480j;
        if (i < 0 || i >= this.f353q || this.f352p == null) {
            return;
        }
        if (canScrollVertically()) {
            iM480j = (m480j() * i) - this.f339c;
            iM481k = 0;
        } else {
            iM481k = (m481k() * i) - this.f338b;
            iM480j = 0;
        }
        this.f352p.scrollBy(iM481k, iM480j);
        m486p(i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m485o(int i) {
        if (i >= 0) {
            this.f353q = i;
        }
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f352p = recyclerView;
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        this.f352p = null;
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.f() || !zVar.b()) {
            return;
        }
        if (getItemCount() == 0) {
            removeAndRecycleAllViews(vVar);
            m485o(0);
            m486p(0, false);
            return;
        }
        m485o(m479i());
        m486p(m475e(), false);
        int itemCount = getItemCount() / this.f342f;
        if (getItemCount() % this.f342f != 0) {
            itemCount++;
        }
        if (canScrollHorizontally()) {
            int iM481k = (itemCount - 1) * m481k();
            this.f348l = iM481k;
            this.f349m = 0;
            if (this.f338b > iM481k) {
                this.f338b = iM481k;
            }
        } else {
            this.f348l = 0;
            int iM480j = (itemCount - 1) * m480j();
            this.f349m = iM480j;
            if (this.f339c > iM480j) {
                this.f339c = iM480j;
            }
        }
        if (this.f344h <= 0) {
            this.f344h = m481k() / this.f341e;
        }
        if (this.f345i <= 0) {
            this.f345i = m480j() / this.f340d;
        }
        this.f346j = m481k() - this.f344h;
        this.f347k = m480j() - this.f345i;
        for (int i = 0; i < this.f342f * 2; i++) {
            m474c(i);
        }
        if (this.f338b == 0 && this.f339c == 0) {
            for (int i2 = 0; i2 < this.f342f && i2 < getItemCount(); i2++) {
                View viewO = vVar.o(i2);
                addView(viewO);
                measureChildWithMargins(viewO, this.f346j, this.f347k);
            }
        }
        m483m(vVar, zVar, true);
    }

    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        if (zVar.f()) {
            return;
        }
        m485o(m479i());
        m486p(m475e(), false);
    }

    public void onMeasure(RecyclerView.v vVar, RecyclerView.z zVar, int i, int i2) {
        super.onMeasure(vVar, zVar, i, i2);
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

    public void onScrollStateChanged(int i) {
        this.f350n = i;
        super.onScrollStateChanged(i);
        if (i == 0) {
            m486p(m475e(), false);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m486p(int i, boolean z) {
        if (i == this.f354r) {
            return;
        }
        if (m482l()) {
            this.f354r = i;
        } else {
            if (z) {
                return;
            }
            this.f354r = i;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m487q(int i) {
        if (i < 0 || i >= this.f353q || this.f352p == null) {
            return;
        }
        int iM475e = m475e();
        if (Math.abs(i - iM475e) > 3) {
            if (i > iM475e) {
                m484n(i - 3);
            } else if (i < iM475e) {
                m484n(i + 3);
            }
        }
        a760 a760Var = new a760(this.f352p);
        a760Var.setTargetPosition(i * this.f342f);
        startSmoothScroll(a760Var);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i2 = this.f338b;
        int i3 = i2 + i;
        int i4 = this.f348l;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f338b = i2 + i;
        m486p(m475e(), true);
        offsetChildrenHorizontal(-i);
        if (i > 0) {
            m483m(vVar, zVar, true);
            return i;
        }
        m483m(vVar, zVar, false);
        return i;
    }

    public void scrollToPosition(int i) {
        m484n(m476f(i));
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i2 = this.f339c;
        int i3 = i2 + i;
        int i4 = this.f349m;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.f339c = i2 + i;
        m486p(m475e(), true);
        offsetChildrenVertical(-i);
        if (i > 0) {
            m483m(vVar, zVar, true);
            return i;
        }
        m483m(vVar, zVar, false);
        return i;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        m487q(m476f(i));
    }
}
