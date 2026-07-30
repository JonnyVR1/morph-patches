package com.p051p1.mobile.putong.core.p058ui.asneedloadscroll;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class AsNeedLayoutManager extends RecyclerView.AbstractC0579o {

    /* JADX INFO: renamed from: a */
    public RecyclerView f29302a;

    /* JADX INFO: renamed from: b */
    public int f29303b;

    /* JADX INFO: renamed from: c */
    public int f29304c;

    /* JADX INFO: renamed from: d */
    public int f29305d;

    /* JADX INFO: renamed from: e */
    public int f29306e;

    /* JADX INFO: renamed from: f */
    public int f29307f = 0;

    /* JADX INFO: renamed from: g */
    public int f29308g = 0;

    /* JADX INFO: renamed from: h */
    public int f29309h = 0;

    /* JADX INFO: renamed from: i */
    public int f29310i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f29311j = false;

    /* JADX INFO: renamed from: k */
    public boolean f29312k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLayoutManager$a */
    public class RunnableC8451a implements Runnable {
        public RunnableC8451a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsNeedLayoutManager.this.f29312k = false;
        }
    }

    public AsNeedLayoutManager(RecyclerView recyclerView) {
        this.f29302a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m45507a(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        AsNeedLayoutManager asNeedLayoutManager;
        int iM3361c = c0561a0.m3361c();
        int i = this.f29310i + 1;
        while (i < iM3361c) {
            View viewM3475o = c0586v.m3475o(i);
            if (viewM3475o.getVisibility() == 8) {
                asNeedLayoutManager = this;
            } else {
                this.measureChild(viewM3475o, 0, 0);
                int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
                int i2 = this.f29307f;
                this.f29308g = i2;
                this.f29307f = i2 + decoratedMeasuredHeight;
                this.addView(viewM3475o);
                int i3 = this.f29307f;
                int i4 = this.f29303b;
                asNeedLayoutManager = this;
                asNeedLayoutManager.layoutDecorated(viewM3475o, 0, (i3 - decoratedMeasuredHeight) - i4, this.f29306e, i3 - i4);
                if (i == iM3361c - 1) {
                    asNeedLayoutManager.f29309h = asNeedLayoutManager.f29307f;
                    asNeedLayoutManager.f29311j = true;
                }
                int i5 = asNeedLayoutManager.f29305d;
                if (i5 != 0 && asNeedLayoutManager.f29307f > i5 + asNeedLayoutManager.f29304c) {
                    asNeedLayoutManager.f29310i = i;
                    return;
                }
            }
            i++;
            this = asNeedLayoutManager;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45508c() {
        this.f29304c = this.f29303b;
        this.f29311j = false;
        this.f29305d = 0;
        this.f29306e = 0;
        this.f29307f = 0;
        this.f29308g = 0;
        this.f29310i = -1;
        this.f29309h = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m45509e() {
        m45510f(false);
    }

    /* JADX INFO: renamed from: f */
    public void m45510f(boolean z) {
        this.f29302a.stopScroll();
        this.f29312k = true;
        this.f29303b = 0;
        this.f29304c = 0;
        this.f29311j = false;
        this.f29302a.postDelayed(new RunnableC8451a(), z ? 10L : 200L);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return new RecyclerView.C0580p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (c0561a0.m3361c() <= 0) {
            return;
        }
        m45508c();
        detachAndScrapAttachedViews(c0586v);
        this.f29305d = this.f29302a.getMeasuredHeight();
        this.f29306e = this.f29302a.getMeasuredWidth();
        m45507a(c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f29312k || (i2 = this.f29303b) < 0) {
            return 0;
        }
        if (i2 + i <= 0) {
            i = -i2;
        } else if (i > 0 && (i3 = this.f29309h) != 0) {
            int i6 = this.f29305d;
            if (i2 > i3 - i6) {
                return 0;
            }
            if (i2 + i >= i3 - i6) {
                i = (i3 - i6) - i2;
            }
        }
        int i7 = i2 + i;
        this.f29303b = i7;
        if (i7 >= this.f29304c) {
            this.f29304c = i7;
        }
        offsetChildrenVertical(-i);
        if (!this.f29311j && ((i4 = this.f29308g) < (i5 = this.f29305d) || this.f29303b > i4 - i5)) {
            m45507a(c0586v, c0561a0);
        }
        return i;
    }
}
