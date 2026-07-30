package com.p051p1.mobile.putong.feed.newui.status.share;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0614r;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.C0611o;
import androidx.recyclerview.widget.RecyclerView;
import p153l.wg3;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGalleryLayoutManager extends RecyclerView.AbstractC0579o implements RecyclerView.AbstractC0590z.b {

    /* JADX INFO: renamed from: e */
    public View f43851e;

    /* JADX INFO: renamed from: f */
    public C11519f f43852f;

    /* JADX INFO: renamed from: j */
    public int f43856j;

    /* JADX INFO: renamed from: k */
    public AbstractC0614r f43857k;

    /* JADX INFO: renamed from: l */
    public AbstractC0614r f43858l;

    /* JADX INFO: renamed from: m */
    public InterfaceC11516c f43859m;

    /* JADX INFO: renamed from: n */
    public InterfaceC11518e f43860n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f43861o;

    /* JADX INFO: renamed from: a */
    public int f43847a = 0;

    /* JADX INFO: renamed from: b */
    public int f43848b = 0;

    /* JADX INFO: renamed from: c */
    public int f43849c = 0;

    /* JADX INFO: renamed from: d */
    public int f43850d = -1;

    /* JADX INFO: renamed from: g */
    public C0611o f43853g = new C0611o();

    /* JADX INFO: renamed from: h */
    public C11515b f43854h = new C11515b();

    /* JADX INFO: renamed from: i */
    public boolean f43855i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$a */
    public class C11514a extends C0610n {
        public C11514a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m67047a(View view) {
            RecyclerView.AbstractC0579o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                return 0;
            }
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c0580p).leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin;
            return ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft()) / 2.0f)) - (decoratedLeft + ((int) ((decoratedRight - decoratedLeft) / 2.0f)));
        }

        /* JADX INFO: renamed from: b */
        public int m67048b(View view) {
            RecyclerView.AbstractC0579o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c0580p).topMargin;
            int decoratedBottom = layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin;
            return ((int) (((layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop()) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
        }

        @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public void onTargetFound(View view, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0590z.a aVar) {
            int iM67047a = m67047a(view);
            int iM67048b = m67048b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM67047a * iM67047a) + (iM67048b * iM67048b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3492d(-iM67047a, -iM67048b, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$b */
    public class C11515b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f43863a;

        /* JADX INFO: renamed from: b */
        public boolean f43864b;

        public C11515b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3812h;
            super.onScrollStateChanged(recyclerView, i);
            this.f43863a = i;
            if (i != 0 || (viewMo3812h = FeedGalleryLayoutManager.this.f43853g.mo3812h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewMo3812h);
            FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
            if (position == feedGalleryLayoutManager.f43850d) {
                if (feedGalleryLayoutManager.f43855i || FeedGalleryLayoutManager.this.f43860n == null || !this.f43864b) {
                    return;
                }
                this.f43864b = false;
                FeedGalleryLayoutManager.this.f43860n.mo67050a(recyclerView, viewMo3812h, FeedGalleryLayoutManager.this.f43850d);
                return;
            }
            View view = feedGalleryLayoutManager.f43851e;
            if (view != null) {
                view.setSelected(false);
            }
            FeedGalleryLayoutManager.this.f43851e = viewMo3812h;
            viewMo3812h.setSelected(true);
            FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
            feedGalleryLayoutManager2.f43850d = position;
            if (feedGalleryLayoutManager2.f43860n != null) {
                FeedGalleryLayoutManager.this.f43860n.mo67050a(recyclerView, viewMo3812h, FeedGalleryLayoutManager.this.f43850d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewMo3812h = FeedGalleryLayoutManager.this.f43853g.mo3812h(recyclerView.getLayoutManager());
            if (viewMo3812h != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewMo3812h);
                FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
                if (position != feedGalleryLayoutManager.f43850d) {
                    View view = feedGalleryLayoutManager.f43851e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    FeedGalleryLayoutManager.this.f43851e = viewMo3812h;
                    viewMo3812h.setSelected(true);
                    FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
                    feedGalleryLayoutManager2.f43850d = position;
                    if (!feedGalleryLayoutManager2.f43855i && this.f43863a != 0) {
                        this.f43864b = true;
                    } else if (FeedGalleryLayoutManager.this.f43860n != null) {
                        FeedGalleryLayoutManager.this.f43860n.mo67050a(recyclerView, viewMo3812h, FeedGalleryLayoutManager.this.f43850d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$c */
    public interface InterfaceC11516c {
        /* JADX INFO: renamed from: a */
        void mo67049a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$e */
    public interface InterfaceC11518e {
        /* JADX INFO: renamed from: a */
        void mo67050a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$f */
    public class C11519f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f43866a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f43867b = 0;

        public C11519f() {
        }
    }

    public FeedGalleryLayoutManager(int i) {
        this.f43856j = i;
    }

    /* JADX INFO: renamed from: h */
    private int m67025h(int i) {
        return (getChildCount() != 0 && i >= this.f43847a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: A */
    public void m67026A(InterfaceC11518e interfaceC11518e) {
        this.f43860n = interfaceC11518e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return this.f43856j == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return this.f43856j == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean checkLayoutParams(RecyclerView.C0580p c0580p) {
        return c0580p instanceof C11517d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM67025h = m67025h(i);
        PointF pointF = new PointF();
        if (iM67025h == 0) {
            return null;
        }
        if (this.f43856j == 0) {
            pointF.x = iM67025h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM67025h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m67027f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            wg3.m206174a("The attach RecycleView must not null!!");
            return;
        }
        this.f43861o = recyclerView;
        this.f43849c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f43853g.mo3858b(recyclerView);
        recyclerView.addOnScrollListener(this.f43854h);
    }

    /* JADX INFO: renamed from: g */
    public final int m67028g(View view, float f) {
        float height;
        int top;
        AbstractC0614r abstractC0614rM67041u = m67041u();
        int iMo3834i = ((abstractC0614rM67041u.mo3834i() - abstractC0614rM67041u.mo3838m()) / 2) + abstractC0614rM67041u.mo3838m();
        if (this.f43856j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - iMo3834i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return this.f43856j == 1 ? new C11517d(-1, -2) : new C11517d(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C11517d((ViewGroup.MarginLayoutParams) layoutParams) : new C11517d(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final float m67029i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m67028g(view, f) * 1.0f) / (this.f43856j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    public final void m67030j(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM67040t = m67040t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM67040t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            feedGalleryLayoutManager.f43848b = i;
            if (feedGalleryLayoutManager.m67042v().f43866a.get(i) == null) {
                feedGalleryLayoutManager.m67042v().f43866a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m67042v().f43866a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m67031k(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f43856j == 0) {
            m67035o(c0586v, c0561a0, i);
        } else {
            m67036p(c0586v, c0561a0, i);
        }
        if (this.f43859m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f43859m.mo67049a(this, childAt, m67029i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m67032l(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM67043w = m67043w();
        while (i >= 0 && i2 > i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o, 0);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM67043w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            feedGalleryLayoutManager.f43847a = i;
            if (feedGalleryLayoutManager.m67042v().f43866a.get(i) == null) {
                feedGalleryLayoutManager.m67042v().f43866a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m67042v().f43866a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m67033m(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM67043w = m67043w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM67043w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            feedGalleryLayoutManager.f43848b = i;
            if (feedGalleryLayoutManager.m67042v().f43866a.get(i) == null) {
                feedGalleryLayoutManager.m67042v().f43866a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m67042v().f43866a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m67034n(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM67040t = m67040t();
        while (i >= 0 && i2 > i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o, 0);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM67040t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            feedGalleryLayoutManager.f43847a = i;
            if (feedGalleryLayoutManager.m67042v().f43866a.get(i) == null) {
                feedGalleryLayoutManager.m67042v().f43866a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m67042v().f43866a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m67035o(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        int i2;
        int decoratedRight;
        int iMo3838m = m67041u().mo3838m();
        int iMo3834i = m67041u().mo3834i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4 + i3);
                    if (getDecoratedRight(childAt) - i >= iMo3838m) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0586v);
                    this.f43847a++;
                    i3--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > iMo3834i) {
                        removeAndRecycleView(childAt2, c0586v);
                        this.f43848b--;
                    }
                }
            }
        }
        int i5 = this.f43847a;
        int iM67043w = m67043w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedLeft > iMo3838m + i; i6--) {
                Rect rect = m67042v().f43866a.get(i6);
                View viewM3475o = c0586v.m3475o(i6);
                addView(viewM3475o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m67042v().f43866a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3475o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
                int paddingTop = (int) (getPaddingTop() + ((iM67043w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewM3475o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f43847a = i6;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedRight = getDecoratedRight(childAt4);
            i2 = position2;
        } else {
            i2 = i5;
            decoratedRight = -1;
        }
        for (int i7 = i2; i7 < getItemCount() && decoratedRight < iMo3834i + i; i7++) {
            Rect rect3 = m67042v().f43866a.get(i7);
            View viewM3475o2 = c0586v.m3475o(i7);
            addView(viewM3475o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m67042v().f43866a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3475o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3475o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3475o2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM67043w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m67040t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewM3475o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f43848b = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (getItemCount() == 0) {
            m67044x();
            detachAndScrapAttachedViews(c0586v);
            return;
        }
        if (c0561a0.m3364f()) {
            return;
        }
        if (c0561a0.m3361c() == 0 || c0561a0.m3360b()) {
            if (getChildCount() == 0 || c0561a0.m3360b()) {
                m67044x();
            }
            this.f43849c = Math.min(Math.max(0, this.f43849c), getItemCount() - 1);
            detachAndScrapAttachedViews(c0586v);
            m67037q(c0586v, c0561a0, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m67036p(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        int i2;
        int decoratedBottom;
        int iMo3838m = m67041u().mo3838m();
        int iMo3834i = m67041u().mo3834i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= iMo3834i) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0586v);
                    this.f43848b--;
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4 + i3);
                    if (getDecoratedBottom(childAt2) - i >= iMo3838m) {
                        break;
                    }
                    removeAndRecycleView(childAt2, c0586v);
                    this.f43847a++;
                    i3--;
                }
            }
        }
        int i5 = this.f43847a;
        int iM67040t = m67040t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedTop > iMo3838m + i; i6--) {
                Rect rect = m67042v().f43866a.get(i6);
                View viewM3475o = c0586v.m3475o(i6);
                addView(viewM3475o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m67042v().f43866a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3475o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
                int paddingLeft = (int) (getPaddingLeft() + ((iM67040t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewM3475o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f43847a = i6;
            }
            return;
        }
        if (getChildCount() != 0) {
            View childAt4 = getChildAt(getChildCount() - 1);
            int position2 = getPosition(childAt4) + 1;
            decoratedBottom = getDecoratedBottom(childAt4);
            i2 = position2;
        } else {
            i2 = i5;
            decoratedBottom = -1;
        }
        for (int i7 = i2; i7 < getItemCount() && decoratedBottom < iMo3834i + i; i7++) {
            Rect rect3 = m67042v().f43866a.get(i7);
            View viewM3475o2 = c0586v.m3475o(i7);
            addView(viewM3475o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m67042v().f43866a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3475o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3475o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3475o2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM67040t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m67043w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewM3475o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f43848b = i7;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m67037q(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (this.f43856j == 0) {
            m67038r(c0586v, c0561a0);
        } else {
            m67039s(c0586v, c0561a0);
        }
        if (this.f43859m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f43859m.mo67049a(this, childAt, m67029i(childAt, i));
            }
        }
        this.f43854h.onScrolled(this.f43861o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m67038r(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        detachAndScrapAttachedViews(c0586v);
        int iMo3838m = m67041u().mo3838m();
        int iMo3834i = m67041u().mo3834i();
        int i = this.f43849c;
        Rect rect = new Rect();
        int iM67043w = m67043w();
        View viewM3475o = c0586v.m3475o(this.f43849c);
        addView(viewM3475o, 0);
        measureChildWithMargins(viewM3475o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
        int paddingTop = (int) (getPaddingTop() + ((iM67043w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m67040t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
        if (m67042v().f43866a.get(i) == null) {
            m67042v().f43866a.put(i, rect);
        } else {
            m67042v().f43866a.get(i).set(rect);
        }
        this.f43848b = i;
        this.f43847a = i;
        int decoratedLeft = getDecoratedLeft(viewM3475o);
        int decoratedRight = getDecoratedRight(viewM3475o);
        m67032l(c0586v, this.f43849c - 1, decoratedLeft, iMo3838m);
        m67033m(c0586v, this.f43849c + 1, decoratedRight, iMo3834i);
    }

    /* JADX INFO: renamed from: s */
    public final void m67039s(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        detachAndScrapAttachedViews(c0586v);
        int iMo3838m = m67041u().mo3838m();
        int iMo3834i = m67041u().mo3834i();
        int i = this.f43849c;
        Rect rect = new Rect();
        int iM67040t = m67040t();
        View viewM3475o = c0586v.m3475o(this.f43849c);
        addView(viewM3475o, 0);
        measureChildWithMargins(viewM3475o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
        int paddingLeft = (int) (getPaddingLeft() + ((iM67040t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m67043w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
        if (m67042v().f43866a.get(i) == null) {
            m67042v().f43866a.put(i, rect);
        } else {
            m67042v().f43866a.get(i).set(rect);
        }
        this.f43848b = i;
        this.f43847a = i;
        int decoratedTop = getDecoratedTop(viewM3475o);
        int decoratedBottom = getDecoratedBottom(viewM3475o);
        m67034n(c0586v, this.f43849c - 1, decoratedTop, iMo3838m);
        m67030j(c0586v, this.f43849c + 1, decoratedBottom, iMo3834i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3834i = ((m67041u().mo3834i() - m67041u().mo3838m()) / 2) + m67041u().mo3838m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iMo3834i));
                i2 = -iMin;
            }
        } else if (this.f43847a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iMo3834i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m67042v().f43867b = i3;
        m67031k(c0586v, c0561a0, i3);
        offsetChildrenHorizontal(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3834i = ((m67041u().mo3834i() - m67041u().mo3838m()) / 2) + m67041u().mo3838m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iMo3834i));
                i2 = -iMin;
            }
        } else if (this.f43847a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iMo3834i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m67042v().f43867b = i3;
        m67031k(c0586v, c0561a0, i3);
        offsetChildrenVertical(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        C11514a c11514a = new C11514a(recyclerView.getContext());
        c11514a.setTargetPosition(i);
        startSmoothScroll(c11514a);
    }

    /* JADX INFO: renamed from: t */
    public final int m67040t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: u */
    public AbstractC0614r m67041u() {
        if (this.f43856j == 0) {
            if (this.f43857k == null) {
                this.f43857k = AbstractC0614r.m3826a(this);
            }
            return this.f43857k;
        }
        if (this.f43858l == null) {
            this.f43858l = AbstractC0614r.m3828c(this);
        }
        return this.f43858l;
    }

    /* JADX INFO: renamed from: v */
    public C11519f m67042v() {
        if (this.f43852f == null) {
            this.f43852f = new C11519f();
        }
        return this.f43852f;
    }

    /* JADX INFO: renamed from: w */
    public final int m67043w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    public final void m67044x() {
        C11519f c11519f = this.f43852f;
        if (c11519f != null) {
            c11519f.f43866a.clear();
        }
        int i = this.f43850d;
        if (i != -1) {
            this.f43849c = i;
        }
        int iMin = Math.min(Math.max(0, this.f43849c), getItemCount() - 1);
        this.f43849c = iMin;
        this.f43847a = iMin;
        this.f43848b = iMin;
        this.f43850d = -1;
        View view = this.f43851e;
        if (view != null) {
            view.setSelected(false);
            this.f43851e = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m67045y(boolean z) {
        this.f43855i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m67046z(InterfaceC11516c interfaceC11516c) {
        this.f43859m = interfaceC11516c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$d */
    public static class C11517d extends RecyclerView.C0580p {
        public C11517d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C11517d(int i, int i2) {
            super(i, i2);
        }

        public C11517d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C11517d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C11517d(context, attributeSet);
    }
}
