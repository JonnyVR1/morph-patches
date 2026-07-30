package com.p000p1.mobile.putong.core.p004ui.asneedloadscroll;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AsNeedLayoutManager extends RecyclerView.o {

    /* JADX INFO: renamed from: a */
    public RecyclerView f4521a;

    /* JADX INFO: renamed from: b */
    public int f4522b;

    /* JADX INFO: renamed from: c */
    public int f4523c;

    /* JADX INFO: renamed from: d */
    public int f4524d;

    /* JADX INFO: renamed from: e */
    public int f4525e;

    /* JADX INFO: renamed from: f */
    public int f4526f = 0;

    /* JADX INFO: renamed from: g */
    public int f4527g = 0;

    /* JADX INFO: renamed from: h */
    public int f4528h = 0;

    /* JADX INFO: renamed from: i */
    public int f4529i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f4530j = false;

    /* JADX INFO: renamed from: k */
    public boolean f4531k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLayoutManager$a */
    public class RunnableC0204a implements Runnable {
        public RunnableC0204a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AsNeedLayoutManager.this.f4531k = false;
        }
    }

    public AsNeedLayoutManager(RecyclerView recyclerView) {
        this.f4521a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m7280a(RecyclerView.v vVar, RecyclerView.z zVar) {
        AsNeedLayoutManager asNeedLayoutManager;
        int iC = zVar.c();
        int i = this.f4529i + 1;
        while (i < iC) {
            View viewO = vVar.o(i);
            if (viewO.getVisibility() == 8) {
                asNeedLayoutManager = this;
            } else {
                this.measureChild(viewO, 0, 0);
                int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
                int i2 = this.f4526f;
                this.f4527g = i2;
                this.f4526f = i2 + decoratedMeasuredHeight;
                this.addView(viewO);
                int i3 = this.f4526f;
                int i4 = this.f4522b;
                asNeedLayoutManager = this;
                asNeedLayoutManager.layoutDecorated(viewO, 0, (i3 - decoratedMeasuredHeight) - i4, this.f4525e, i3 - i4);
                if (i == iC - 1) {
                    asNeedLayoutManager.f4528h = asNeedLayoutManager.f4526f;
                    asNeedLayoutManager.f4530j = true;
                }
                int i5 = asNeedLayoutManager.f4524d;
                if (i5 != 0 && asNeedLayoutManager.f4526f > i5 + asNeedLayoutManager.f4523c) {
                    asNeedLayoutManager.f4529i = i;
                    return;
                }
            }
            i++;
            this = asNeedLayoutManager;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7281c() {
        this.f4523c = this.f4522b;
        this.f4530j = false;
        this.f4524d = 0;
        this.f4525e = 0;
        this.f4526f = 0;
        this.f4527g = 0;
        this.f4529i = -1;
        this.f4528h = 0;
    }

    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m7282e() {
        m7283f(false);
    }

    /* JADX INFO: renamed from: f */
    public void m7283f(boolean z) {
        this.f4521a.stopScroll();
        this.f4531k = true;
        this.f4522b = 0;
        this.f4523c = 0;
        this.f4530j = false;
        this.f4521a.postDelayed(new RunnableC0204a(), z ? 10L : 200L);
        requestLayout();
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.c() <= 0) {
            return;
        }
        m7281c();
        detachAndScrapAttachedViews(vVar);
        this.f4524d = this.f4521a.getMeasuredHeight();
        this.f4525e = this.f4521a.getMeasuredWidth();
        m7280a(vVar, zVar);
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f4531k || (i2 = this.f4522b) < 0) {
            return 0;
        }
        if (i2 + i <= 0) {
            i = -i2;
        } else if (i > 0 && (i3 = this.f4528h) != 0) {
            int i6 = this.f4524d;
            if (i2 > i3 - i6) {
                return 0;
            }
            if (i2 + i >= i3 - i6) {
                i = (i3 - i6) - i2;
            }
        }
        int i7 = i2 + i;
        this.f4522b = i7;
        if (i7 >= this.f4523c) {
            this.f4523c = i7;
        }
        offsetChildrenVertical(-i);
        if (!this.f4530j && ((i4 = this.f4527g) < (i5 = this.f4524d) || this.f4522b > i4 - i5)) {
            m7280a(vVar, zVar);
        }
        return i;
    }
}
