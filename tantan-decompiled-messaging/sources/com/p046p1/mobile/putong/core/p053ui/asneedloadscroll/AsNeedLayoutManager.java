package com.p046p1.mobile.putong.core.p053ui.asneedloadscroll;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class AsNeedLayoutManager extends RecyclerView.AbstractC0577o {

    /* JADX INFO: renamed from: a */
    public RecyclerView f28454a;

    /* JADX INFO: renamed from: b */
    public int f28455b;

    /* JADX INFO: renamed from: c */
    public int f28456c;

    /* JADX INFO: renamed from: d */
    public int f28457d;

    /* JADX INFO: renamed from: e */
    public int f28458e;

    /* JADX INFO: renamed from: f */
    public int f28459f = 0;

    /* JADX INFO: renamed from: g */
    public int f28460g = 0;

    /* JADX INFO: renamed from: h */
    public int f28461h = 0;

    /* JADX INFO: renamed from: i */
    public int f28462i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f28463j = false;

    /* JADX INFO: renamed from: k */
    public boolean f28464k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLayoutManager$a */
    public class RunnableC8288a implements Runnable {
        public RunnableC8288a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsNeedLayoutManager.this.f28464k = false;
        }
    }

    public AsNeedLayoutManager(RecyclerView recyclerView) {
        this.f28454a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m44324a(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        AsNeedLayoutManager asNeedLayoutManager;
        int iM3487c = c0588z.m3487c();
        int i = this.f28462i + 1;
        while (i < iM3487c) {
            View viewM3466o = c0584v.m3466o(i);
            if (viewM3466o.getVisibility() == 8) {
                asNeedLayoutManager = this;
            } else {
                this.measureChild(viewM3466o, 0, 0);
                int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
                int i2 = this.f28459f;
                this.f28460g = i2;
                this.f28459f = i2 + decoratedMeasuredHeight;
                this.addView(viewM3466o);
                int i3 = this.f28459f;
                int i4 = this.f28455b;
                asNeedLayoutManager = this;
                asNeedLayoutManager.layoutDecorated(viewM3466o, 0, (i3 - decoratedMeasuredHeight) - i4, this.f28458e, i3 - i4);
                if (i == iM3487c - 1) {
                    asNeedLayoutManager.f28461h = asNeedLayoutManager.f28459f;
                    asNeedLayoutManager.f28463j = true;
                }
                int i5 = asNeedLayoutManager.f28457d;
                if (i5 != 0 && asNeedLayoutManager.f28459f > i5 + asNeedLayoutManager.f28456c) {
                    asNeedLayoutManager.f28462i = i;
                    return;
                }
            }
            i++;
            this = asNeedLayoutManager;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m44325c() {
        this.f28456c = this.f28455b;
        this.f28463j = false;
        this.f28457d = 0;
        this.f28458e = 0;
        this.f28459f = 0;
        this.f28460g = 0;
        this.f28462i = -1;
        this.f28461h = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m44326e() {
        m44327f(false);
    }

    /* JADX INFO: renamed from: f */
    public void m44327f(boolean z) {
        this.f28454a.stopScroll();
        this.f28464k = true;
        this.f28455b = 0;
        this.f28456c = 0;
        this.f28463j = false;
        this.f28454a.postDelayed(new RunnableC8288a(), z ? 10L : 200L);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return new RecyclerView.C0578p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (c0588z.m3487c() <= 0) {
            return;
        }
        m44325c();
        detachAndScrapAttachedViews(c0584v);
        this.f28457d = this.f28454a.getMeasuredHeight();
        this.f28458e = this.f28454a.getMeasuredWidth();
        m44324a(c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f28464k || (i2 = this.f28455b) < 0) {
            return 0;
        }
        if (i2 + i <= 0) {
            i = -i2;
        } else if (i > 0 && (i3 = this.f28461h) != 0) {
            int i6 = this.f28457d;
            if (i2 > i3 - i6) {
                return 0;
            }
            if (i2 + i >= i3 - i6) {
                i = (i3 - i6) - i2;
            }
        }
        int i7 = i2 + i;
        this.f28455b = i7;
        if (i7 >= this.f28456c) {
            this.f28456c = i7;
        }
        offsetChildrenVertical(-i);
        if (!this.f28463j && ((i4 = this.f28460g) < (i5 = this.f28457d) || this.f28455b > i4 - i5)) {
            m44324a(c0584v, c0588z);
        }
        return i;
    }
}
