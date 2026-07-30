package com.p000p1.mobile.putong.feed.newui.status.share;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGalleryLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: e */
    public View f4464e;

    /* JADX INFO: renamed from: f */
    public C2200f f4465f;

    /* JADX INFO: renamed from: j */
    public int f4469j;

    /* JADX INFO: renamed from: k */
    public r f4470k;

    /* JADX INFO: renamed from: l */
    public r f4471l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2197c f4472m;

    /* JADX INFO: renamed from: n */
    public InterfaceC2199e f4473n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f4474o;

    /* JADX INFO: renamed from: a */
    public int f4460a = 0;

    /* JADX INFO: renamed from: b */
    public int f4461b = 0;

    /* JADX INFO: renamed from: c */
    public int f4462c = 0;

    /* JADX INFO: renamed from: d */
    public int f4463d = -1;

    /* JADX INFO: renamed from: g */
    public o f4466g = new o();

    /* JADX INFO: renamed from: h */
    public C2196b f4467h = new C2196b();

    /* JADX INFO: renamed from: i */
    public boolean f4468i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$a */
    public class C2195a extends n {
        public C2195a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m7011a(View view) {
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                return 0;
            }
            RecyclerView.p layoutParams = view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            return ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft()) / 2.0f)) - (decoratedLeft + ((int) ((decoratedRight - decoratedLeft) / 2.0f)));
        }

        /* JADX INFO: renamed from: b */
        public int m7012b(View view) {
            RecyclerView.o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.p layoutParams = view.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int decoratedBottom = layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            return ((int) (((layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop()) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
        }

        public void onTargetFound(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            int iM7011a = m7011a(view);
            int iM7012b = m7012b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM7011a * iM7011a) + (iM7012b * iM7012b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(-iM7011a, -iM7012b, iCalculateTimeForDeceleration, ((n) this).mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$b */
    public class C2196b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public int f4476a;

        /* JADX INFO: renamed from: b */
        public boolean f4477b;

        public C2196b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewH;
            super.onScrollStateChanged(recyclerView, i);
            this.f4476a = i;
            if (i != 0 || (viewH = FeedGalleryLayoutManager.this.f4466g.h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewH);
            FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
            if (position == feedGalleryLayoutManager.f4463d) {
                if (feedGalleryLayoutManager.f4468i || FeedGalleryLayoutManager.this.f4473n == null || !this.f4477b) {
                    return;
                }
                this.f4477b = false;
                FeedGalleryLayoutManager.this.f4473n.mo7014a(recyclerView, viewH, FeedGalleryLayoutManager.this.f4463d);
                return;
            }
            View view = feedGalleryLayoutManager.f4464e;
            if (view != null) {
                view.setSelected(false);
            }
            FeedGalleryLayoutManager.this.f4464e = viewH;
            viewH.setSelected(true);
            FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
            feedGalleryLayoutManager2.f4463d = position;
            if (feedGalleryLayoutManager2.f4473n != null) {
                FeedGalleryLayoutManager.this.f4473n.mo7014a(recyclerView, viewH, FeedGalleryLayoutManager.this.f4463d);
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewH = FeedGalleryLayoutManager.this.f4466g.h(recyclerView.getLayoutManager());
            if (viewH != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewH);
                FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
                if (position != feedGalleryLayoutManager.f4463d) {
                    View view = feedGalleryLayoutManager.f4464e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    FeedGalleryLayoutManager.this.f4464e = viewH;
                    viewH.setSelected(true);
                    FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
                    feedGalleryLayoutManager2.f4463d = position;
                    if (!feedGalleryLayoutManager2.f4468i && this.f4476a != 0) {
                        this.f4477b = true;
                    } else if (FeedGalleryLayoutManager.this.f4473n != null) {
                        FeedGalleryLayoutManager.this.f4473n.mo7014a(recyclerView, viewH, FeedGalleryLayoutManager.this.f4463d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$c */
    public interface InterfaceC2197c {
        /* JADX INFO: renamed from: a */
        void mo7013a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$e */
    public interface InterfaceC2199e {
        /* JADX INFO: renamed from: a */
        void mo7014a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$f */
    public class C2200f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f4479a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f4480b = 0;

        public C2200f() {
        }
    }

    public FeedGalleryLayoutManager(int i) {
        this.f4469j = i;
    }

    /* JADX INFO: renamed from: h */
    private int m6989h(int i) {
        return (getChildCount() != 0 && i >= this.f4460a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: A */
    public void m6990A(InterfaceC2199e interfaceC2199e) {
        this.f4473n = interfaceC2199e;
    }

    public boolean canScrollHorizontally() {
        return this.f4469j == 0;
    }

    public boolean canScrollVertically() {
        return this.f4469j == 1;
    }

    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof C2198d;
    }

    public PointF computeScrollVectorForPosition(int i) {
        int iM6989h = m6989h(i);
        PointF pointF = new PointF();
        if (iM6989h == 0) {
            return null;
        }
        if (this.f4469j == 0) {
            pointF.x = iM6989h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM6989h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m6991f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            ig3.a("The attach RecycleView must not null!!");
            return;
        }
        this.f4474o = recyclerView;
        this.f4462c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f4466g.b(recyclerView);
        recyclerView.addOnScrollListener(this.f4467h);
    }

    /* JADX INFO: renamed from: g */
    public final int m6992g(View view, float f) {
        float height;
        int top;
        r rVarM7005u = m7005u();
        int i = ((rVarM7005u.i() - rVarM7005u.m()) / 2) + rVarM7005u.m();
        if (this.f4469j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - i);
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return this.f4469j == 1 ? new C2198d(-1, -2) : new C2198d(-2, -1);
    }

    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2198d((ViewGroup.MarginLayoutParams) layoutParams) : new C2198d(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final float m6993i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m6992g(view, f) * 1.0f) / (this.f4469j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    public final void m6994j(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM7004t = m7004t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewO = vVar.o(i);
            this.addView(viewO);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM7004t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            feedGalleryLayoutManager.f4461b = i;
            if (feedGalleryLayoutManager.m7006v().f4479a.get(i) == null) {
                feedGalleryLayoutManager.m7006v().f4479a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m7006v().f4479a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6995k(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f4469j == 0) {
            m6999o(vVar, zVar, i);
        } else {
            m7000p(vVar, zVar, i);
        }
        if (this.f4472m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f4472m.mo7013a(this, childAt, m6993i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6996l(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM7007w = m7007w();
        while (i >= 0 && i2 > i3) {
            View viewO = vVar.o(i);
            this.addView(viewO, 0);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (this.getPaddingTop() + ((iM7007w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            feedGalleryLayoutManager.f4460a = i;
            if (feedGalleryLayoutManager.m7006v().f4479a.get(i) == null) {
                feedGalleryLayoutManager.m7006v().f4479a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m7006v().f4479a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6997m(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM7007w = m7007w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewO = vVar.o(i);
            this.addView(viewO);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (this.getPaddingTop() + ((iM7007w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            feedGalleryLayoutManager.f4461b = i;
            if (feedGalleryLayoutManager.m7006v().f4479a.get(i) == null) {
                feedGalleryLayoutManager.m7006v().f4479a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m7006v().f4479a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6998n(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM7004t = m7004t();
        while (i >= 0 && i2 > i3) {
            View viewO = vVar.o(i);
            this.addView(viewO, 0);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM7004t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            feedGalleryLayoutManager.f4460a = i;
            if (feedGalleryLayoutManager.m7006v().f4479a.get(i) == null) {
                feedGalleryLayoutManager.m7006v().f4479a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m7006v().f4479a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6999o(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedRight;
        int iM = m7005u().m();
        int i3 = m7005u().i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5 + i4);
                    if (getDecoratedRight(childAt) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt, vVar);
                    this.f4460a++;
                    i4--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > i3) {
                        removeAndRecycleView(childAt2, vVar);
                        this.f4461b--;
                    }
                }
            }
        }
        int i6 = this.f4460a;
        int iM7007w = m7007w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedLeft > iM + i; i7--) {
                Rect rect = m7006v().f4479a.get(i7);
                View viewO = vVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    m7006v().f4479a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingTop = (int) (getPaddingTop() + ((iM7007w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f4460a = i7;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedRight = getDecoratedRight(childAt4);
            i2 = position2;
        } else {
            i2 = i6;
            decoratedRight = -1;
        }
        for (int i8 = i2; i8 < getItemCount() && decoratedRight < i3 + i; i8++) {
            Rect rect3 = m7006v().f4479a.get(i8);
            View viewO2 = vVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                m7006v().f4479a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM7007w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m7004t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f4461b = i8;
        }
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getItemCount() == 0) {
            m7008x();
            detachAndScrapAttachedViews(vVar);
            return;
        }
        if (zVar.f()) {
            return;
        }
        if (zVar.c() == 0 || zVar.b()) {
            if (getChildCount() == 0 || zVar.b()) {
                m7008x();
            }
            this.f4462c = Math.min(Math.max(0, this.f4462c), getItemCount() - 1);
            detachAndScrapAttachedViews(vVar);
            m7001q(vVar, zVar, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7000p(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedBottom;
        int iM = m7005u().m();
        int i3 = m7005u().i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= i3) {
                        break;
                    }
                    removeAndRecycleView(childAt, vVar);
                    this.f4461b--;
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt2 = getChildAt(i5 + i4);
                    if (getDecoratedBottom(childAt2) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt2, vVar);
                    this.f4460a++;
                    i4--;
                }
            }
        }
        int i6 = this.f4460a;
        int iM7004t = m7004t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedTop > iM + i; i7--) {
                Rect rect = m7006v().f4479a.get(i7);
                View viewO = vVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    m7006v().f4479a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingLeft = (int) (getPaddingLeft() + ((iM7004t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f4460a = i7;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedBottom = getDecoratedBottom(childAt4);
            i2 = position2;
        } else {
            i2 = i6;
            decoratedBottom = -1;
        }
        for (int i8 = i2; i8 < getItemCount() && decoratedBottom < i3 + i; i8++) {
            Rect rect3 = m7006v().f4479a.get(i8);
            View viewO2 = vVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                m7006v().f4479a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM7004t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m7007w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f4461b = i8;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7001q(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (this.f4469j == 0) {
            m7002r(vVar, zVar);
        } else {
            m7003s(vVar, zVar);
        }
        if (this.f4472m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f4472m.mo7013a(this, childAt, m6993i(childAt, i));
            }
        }
        this.f4467h.onScrolled(this.f4474o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m7002r(RecyclerView.v vVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(vVar);
        int iM = m7005u().m();
        int i = m7005u().i();
        int i2 = this.f4462c;
        Rect rect = new Rect();
        int iM7007w = m7007w();
        View viewO = vVar.o(this.f4462c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingTop = (int) (getPaddingTop() + ((iM7007w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m7004t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (m7006v().f4479a.get(i2) == null) {
            m7006v().f4479a.put(i2, rect);
        } else {
            m7006v().f4479a.get(i2).set(rect);
        }
        this.f4461b = i2;
        this.f4460a = i2;
        int decoratedLeft = getDecoratedLeft(viewO);
        int decoratedRight = getDecoratedRight(viewO);
        m6996l(vVar, this.f4462c - 1, decoratedLeft, iM);
        m6997m(vVar, this.f4462c + 1, decoratedRight, i);
    }

    /* JADX INFO: renamed from: s */
    public final void m7003s(RecyclerView.v vVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(vVar);
        int iM = m7005u().m();
        int i = m7005u().i();
        int i2 = this.f4462c;
        Rect rect = new Rect();
        int iM7004t = m7004t();
        View viewO = vVar.o(this.f4462c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingLeft = (int) (getPaddingLeft() + ((iM7004t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m7007w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (m7006v().f4479a.get(i2) == null) {
            m7006v().f4479a.put(i2, rect);
        } else {
            m7006v().f4479a.get(i2).set(rect);
        }
        this.f4461b = i2;
        this.f4460a = i2;
        int decoratedTop = getDecoratedTop(viewO);
        int decoratedBottom = getDecoratedBottom(viewO);
        m6998n(vVar, this.f4462c - 1, decoratedTop, iM);
        m6994j(vVar, this.f4462c + 1, decoratedBottom, i);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((m7005u().i() - m7005u().m()) / 2) + m7005u().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - i3));
                i2 = -iMin;
            }
        } else if (this.f4460a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        m7006v().f4480b = i4;
        m6995k(vVar, zVar, i4);
        offsetChildrenHorizontal(i2);
        return i4;
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((m7005u().i() - m7005u().m()) / 2) + m7005u().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - i3));
                i2 = -iMin;
            }
        } else if (this.f4460a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        m7006v().f4480b = i4;
        m6995k(vVar, zVar, i4);
        offsetChildrenVertical(i2);
        return i4;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        C2195a c2195a = new C2195a(recyclerView.getContext());
        c2195a.setTargetPosition(i);
        startSmoothScroll(c2195a);
    }

    /* JADX INFO: renamed from: t */
    public final int m7004t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: u */
    public r m7005u() {
        if (this.f4469j == 0) {
            if (this.f4470k == null) {
                this.f4470k = r.a(this);
            }
            return this.f4470k;
        }
        if (this.f4471l == null) {
            this.f4471l = r.c(this);
        }
        return this.f4471l;
    }

    /* JADX INFO: renamed from: v */
    public C2200f m7006v() {
        if (this.f4465f == null) {
            this.f4465f = new C2200f();
        }
        return this.f4465f;
    }

    /* JADX INFO: renamed from: w */
    public final int m7007w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    public final void m7008x() {
        C2200f c2200f = this.f4465f;
        if (c2200f != null) {
            c2200f.f4479a.clear();
        }
        int i = this.f4463d;
        if (i != -1) {
            this.f4462c = i;
        }
        int iMin = Math.min(Math.max(0, this.f4462c), getItemCount() - 1);
        this.f4462c = iMin;
        this.f4460a = iMin;
        this.f4461b = iMin;
        this.f4463d = -1;
        View view = this.f4464e;
        if (view != null) {
            view.setSelected(false);
            this.f4464e = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m7009y(boolean z) {
        this.f4468i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m7010z(InterfaceC2197c interfaceC2197c) {
        this.f4472m = interfaceC2197c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$d */
    public static class C2198d extends RecyclerView.p {
        public C2198d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C2198d(int i, int i2) {
            super(i, i2);
        }

        public C2198d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2198d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C2198d(context, attributeSet);
    }
}
