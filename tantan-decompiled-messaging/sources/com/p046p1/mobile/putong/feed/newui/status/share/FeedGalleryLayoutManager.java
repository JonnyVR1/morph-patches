package com.p046p1.mobile.putong.feed.newui.status.share;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0612r;
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.C0609o;
import androidx.recyclerview.widget.RecyclerView;
import p149l.ig3;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGalleryLayoutManager extends RecyclerView.AbstractC0577o implements RecyclerView.AbstractC0587y.b {

    /* JADX INFO: renamed from: e */
    public View f43003e;

    /* JADX INFO: renamed from: f */
    public C11356f f43004f;

    /* JADX INFO: renamed from: j */
    public int f43008j;

    /* JADX INFO: renamed from: k */
    public AbstractC0612r f43009k;

    /* JADX INFO: renamed from: l */
    public AbstractC0612r f43010l;

    /* JADX INFO: renamed from: m */
    public InterfaceC11353c f43011m;

    /* JADX INFO: renamed from: n */
    public InterfaceC11355e f43012n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f43013o;

    /* JADX INFO: renamed from: a */
    public int f42999a = 0;

    /* JADX INFO: renamed from: b */
    public int f43000b = 0;

    /* JADX INFO: renamed from: c */
    public int f43001c = 0;

    /* JADX INFO: renamed from: d */
    public int f43002d = -1;

    /* JADX INFO: renamed from: g */
    public C0609o f43005g = new C0609o();

    /* JADX INFO: renamed from: h */
    public C11352b f43006h = new C11352b();

    /* JADX INFO: renamed from: i */
    public boolean f43007i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$a */
    public class C11351a extends C0608n {
        public C11351a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m65864a(View view) {
            RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
                return 0;
            }
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            int decoratedLeft = layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) c0578p).leftMargin;
            int decoratedRight = layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) c0578p).rightMargin;
            return ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - layoutManager.getPaddingLeft()) / 2.0f)) - (decoratedLeft + ((int) ((decoratedRight - decoratedLeft) / 2.0f)));
        }

        /* JADX INFO: renamed from: b */
        public int m65865b(View view) {
            RecyclerView.AbstractC0577o layoutManager = getLayoutManager();
            if (layoutManager == null || !layoutManager.canScrollVertically()) {
                return 0;
            }
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            int decoratedTop = layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) c0578p).topMargin;
            int decoratedBottom = layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin;
            return ((int) (((layoutManager.getHeight() - layoutManager.getPaddingBottom()) - layoutManager.getPaddingTop()) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
        }

        @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public void onTargetFound(View view, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
            int iM65864a = m65864a(view);
            int iM65865b = m65865b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM65864a * iM65864a) + (iM65865b * iM65865b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3483d(-iM65864a, -iM65865b, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$b */
    public class C11352b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f43015a;

        /* JADX INFO: renamed from: b */
        public boolean f43016b;

        public C11352b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3811h;
            super.onScrollStateChanged(recyclerView, i);
            this.f43015a = i;
            if (i != 0 || (viewMo3811h = FeedGalleryLayoutManager.this.f43005g.mo3811h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewMo3811h);
            FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
            if (position == feedGalleryLayoutManager.f43002d) {
                if (feedGalleryLayoutManager.f43007i || FeedGalleryLayoutManager.this.f43012n == null || !this.f43016b) {
                    return;
                }
                this.f43016b = false;
                FeedGalleryLayoutManager.this.f43012n.mo65867a(recyclerView, viewMo3811h, FeedGalleryLayoutManager.this.f43002d);
                return;
            }
            View view = feedGalleryLayoutManager.f43003e;
            if (view != null) {
                view.setSelected(false);
            }
            FeedGalleryLayoutManager.this.f43003e = viewMo3811h;
            viewMo3811h.setSelected(true);
            FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
            feedGalleryLayoutManager2.f43002d = position;
            if (feedGalleryLayoutManager2.f43012n != null) {
                FeedGalleryLayoutManager.this.f43012n.mo65867a(recyclerView, viewMo3811h, FeedGalleryLayoutManager.this.f43002d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewMo3811h = FeedGalleryLayoutManager.this.f43005g.mo3811h(recyclerView.getLayoutManager());
            if (viewMo3811h != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewMo3811h);
                FeedGalleryLayoutManager feedGalleryLayoutManager = FeedGalleryLayoutManager.this;
                if (position != feedGalleryLayoutManager.f43002d) {
                    View view = feedGalleryLayoutManager.f43003e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    FeedGalleryLayoutManager.this.f43003e = viewMo3811h;
                    viewMo3811h.setSelected(true);
                    FeedGalleryLayoutManager feedGalleryLayoutManager2 = FeedGalleryLayoutManager.this;
                    feedGalleryLayoutManager2.f43002d = position;
                    if (!feedGalleryLayoutManager2.f43007i && this.f43015a != 0) {
                        this.f43016b = true;
                    } else if (FeedGalleryLayoutManager.this.f43012n != null) {
                        FeedGalleryLayoutManager.this.f43012n.mo65867a(recyclerView, viewMo3811h, FeedGalleryLayoutManager.this.f43002d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$c */
    public interface InterfaceC11353c {
        /* JADX INFO: renamed from: a */
        void mo65866a(FeedGalleryLayoutManager feedGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$e */
    public interface InterfaceC11355e {
        /* JADX INFO: renamed from: a */
        void mo65867a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$f */
    public class C11356f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f43018a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f43019b = 0;

        public C11356f() {
        }
    }

    public FeedGalleryLayoutManager(int i) {
        this.f43008j = i;
    }

    /* JADX INFO: renamed from: h */
    private int m65842h(int i) {
        return (getChildCount() != 0 && i >= this.f42999a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: A */
    public void m65843A(InterfaceC11355e interfaceC11355e) {
        this.f43012n = interfaceC11355e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return this.f43008j == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return this.f43008j == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean checkLayoutParams(RecyclerView.C0578p c0578p) {
        return c0578p instanceof C11354d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM65842h = m65842h(i);
        PointF pointF = new PointF();
        if (iM65842h == 0) {
            return null;
        }
        if (this.f43008j == 0) {
            pointF.x = iM65842h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM65842h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m65844f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            ig3.m135964a("The attach RecycleView must not null!!");
            return;
        }
        this.f43013o = recyclerView;
        this.f43001c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f43005g.mo3857b(recyclerView);
        recyclerView.addOnScrollListener(this.f43006h);
    }

    /* JADX INFO: renamed from: g */
    public final int m65845g(View view, float f) {
        float height;
        int top;
        AbstractC0612r abstractC0612rM65858u = m65858u();
        int iMo3833i = ((abstractC0612rM65858u.mo3833i() - abstractC0612rM65858u.mo3837m()) / 2) + abstractC0612rM65858u.mo3837m();
        if (this.f43008j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - iMo3833i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return this.f43008j == 1 ? new C11354d(-1, -2) : new C11354d(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C11354d((ViewGroup.MarginLayoutParams) layoutParams) : new C11354d(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final float m65846i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m65845g(view, f) * 1.0f) / (this.f43008j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    public final void m65847j(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM65857t = m65857t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM65857t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            feedGalleryLayoutManager.f43000b = i;
            if (feedGalleryLayoutManager.m65859v().f43018a.get(i) == null) {
                feedGalleryLayoutManager.m65859v().f43018a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m65859v().f43018a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m65848k(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f43008j == 0) {
            m65852o(c0584v, c0588z, i);
        } else {
            m65853p(c0584v, c0588z, i);
        }
        if (this.f43011m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f43011m.mo65866a(this, childAt, m65846i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m65849l(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM65860w = m65860w();
        while (i >= 0 && i2 > i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o, 0);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM65860w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            feedGalleryLayoutManager.f42999a = i;
            if (feedGalleryLayoutManager.m65859v().f43018a.get(i) == null) {
                feedGalleryLayoutManager.m65859v().f43018a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m65859v().f43018a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m65850m(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM65860w = m65860w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM65860w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            feedGalleryLayoutManager.f43000b = i;
            if (feedGalleryLayoutManager.m65859v().f43018a.get(i) == null) {
                feedGalleryLayoutManager.m65859v().f43018a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m65859v().f43018a.get(i).set(rect);
            }
            i++;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m65851n(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM65857t = m65857t();
        while (i >= 0 && i2 > i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o, 0);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM65857t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            FeedGalleryLayoutManager feedGalleryLayoutManager = this;
            feedGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            feedGalleryLayoutManager.f42999a = i;
            if (feedGalleryLayoutManager.m65859v().f43018a.get(i) == null) {
                feedGalleryLayoutManager.m65859v().f43018a.put(i, rect);
            } else {
                feedGalleryLayoutManager.m65859v().f43018a.get(i).set(rect);
            }
            i--;
            this = feedGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m65852o(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        int i2;
        int decoratedRight;
        int iMo3837m = m65858u().mo3837m();
        int iMo3833i = m65858u().mo3833i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4 + i3);
                    if (getDecoratedRight(childAt) - i >= iMo3837m) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0584v);
                    this.f42999a++;
                    i3--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > iMo3833i) {
                        removeAndRecycleView(childAt2, c0584v);
                        this.f43000b--;
                    }
                }
            }
        }
        int i5 = this.f42999a;
        int iM65860w = m65860w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedLeft > iMo3837m + i; i6--) {
                Rect rect = m65859v().f43018a.get(i6);
                View viewM3466o = c0584v.m3466o(i6);
                addView(viewM3466o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m65859v().f43018a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3466o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
                int paddingTop = (int) (getPaddingTop() + ((iM65860w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewM3466o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f42999a = i6;
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
        for (int i7 = i2; i7 < getItemCount() && decoratedRight < iMo3833i + i; i7++) {
            Rect rect3 = m65859v().f43018a.get(i7);
            View viewM3466o2 = c0584v.m3466o(i7);
            addView(viewM3466o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m65859v().f43018a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3466o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3466o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3466o2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM65860w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m65857t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewM3466o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f43000b = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (getItemCount() == 0) {
            m65861x();
            detachAndScrapAttachedViews(c0584v);
            return;
        }
        if (c0588z.m3490f()) {
            return;
        }
        if (c0588z.m3487c() == 0 || c0588z.m3486b()) {
            if (getChildCount() == 0 || c0588z.m3486b()) {
                m65861x();
            }
            this.f43001c = Math.min(Math.max(0, this.f43001c), getItemCount() - 1);
            detachAndScrapAttachedViews(c0584v);
            m65854q(c0584v, c0588z, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m65853p(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        int i2;
        int decoratedBottom;
        int iMo3837m = m65858u().mo3837m();
        int iMo3833i = m65858u().mo3833i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= iMo3833i) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0584v);
                    this.f43000b--;
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4 + i3);
                    if (getDecoratedBottom(childAt2) - i >= iMo3837m) {
                        break;
                    }
                    removeAndRecycleView(childAt2, c0584v);
                    this.f42999a++;
                    i3--;
                }
            }
        }
        int i5 = this.f42999a;
        int iM65857t = m65857t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedTop > iMo3837m + i; i6--) {
                Rect rect = m65859v().f43018a.get(i6);
                View viewM3466o = c0584v.m3466o(i6);
                addView(viewM3466o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m65859v().f43018a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3466o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
                int paddingLeft = (int) (getPaddingLeft() + ((iM65857t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewM3466o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f42999a = i6;
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
        for (int i7 = i2; i7 < getItemCount() && decoratedBottom < iMo3833i + i; i7++) {
            Rect rect3 = m65859v().f43018a.get(i7);
            View viewM3466o2 = c0584v.m3466o(i7);
            addView(viewM3466o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m65859v().f43018a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3466o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3466o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3466o2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM65857t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m65860w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewM3466o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f43000b = i7;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m65854q(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (this.f43008j == 0) {
            m65855r(c0584v, c0588z);
        } else {
            m65856s(c0584v, c0588z);
        }
        if (this.f43011m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f43011m.mo65866a(this, childAt, m65846i(childAt, i));
            }
        }
        this.f43006h.onScrolled(this.f43013o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m65855r(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        detachAndScrapAttachedViews(c0584v);
        int iMo3837m = m65858u().mo3837m();
        int iMo3833i = m65858u().mo3833i();
        int i = this.f43001c;
        Rect rect = new Rect();
        int iM65860w = m65860w();
        View viewM3466o = c0584v.m3466o(this.f43001c);
        addView(viewM3466o, 0);
        measureChildWithMargins(viewM3466o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
        int paddingTop = (int) (getPaddingTop() + ((iM65860w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m65857t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
        if (m65859v().f43018a.get(i) == null) {
            m65859v().f43018a.put(i, rect);
        } else {
            m65859v().f43018a.get(i).set(rect);
        }
        this.f43000b = i;
        this.f42999a = i;
        int decoratedLeft = getDecoratedLeft(viewM3466o);
        int decoratedRight = getDecoratedRight(viewM3466o);
        m65849l(c0584v, this.f43001c - 1, decoratedLeft, iMo3837m);
        m65850m(c0584v, this.f43001c + 1, decoratedRight, iMo3833i);
    }

    /* JADX INFO: renamed from: s */
    public final void m65856s(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        detachAndScrapAttachedViews(c0584v);
        int iMo3837m = m65858u().mo3837m();
        int iMo3833i = m65858u().mo3833i();
        int i = this.f43001c;
        Rect rect = new Rect();
        int iM65857t = m65857t();
        View viewM3466o = c0584v.m3466o(this.f43001c);
        addView(viewM3466o, 0);
        measureChildWithMargins(viewM3466o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
        int paddingLeft = (int) (getPaddingLeft() + ((iM65857t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m65860w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
        if (m65859v().f43018a.get(i) == null) {
            m65859v().f43018a.put(i, rect);
        } else {
            m65859v().f43018a.get(i).set(rect);
        }
        this.f43000b = i;
        this.f42999a = i;
        int decoratedTop = getDecoratedTop(viewM3466o);
        int decoratedBottom = getDecoratedBottom(viewM3466o);
        m65851n(c0584v, this.f43001c - 1, decoratedTop, iMo3837m);
        m65847j(c0584v, this.f43001c + 1, decoratedBottom, iMo3833i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3833i = ((m65858u().mo3833i() - m65858u().mo3837m()) / 2) + m65858u().mo3837m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iMo3833i));
                i2 = -iMin;
            }
        } else if (this.f42999a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iMo3833i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m65859v().f43019b = i3;
        m65848k(c0584v, c0588z, i3);
        offsetChildrenHorizontal(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3833i = ((m65858u().mo3833i() - m65858u().mo3837m()) / 2) + m65858u().mo3837m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iMo3833i));
                i2 = -iMin;
            }
        } else if (this.f42999a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iMo3833i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m65859v().f43019b = i3;
        m65848k(c0584v, c0588z, i3);
        offsetChildrenVertical(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        C11351a c11351a = new C11351a(recyclerView.getContext());
        c11351a.setTargetPosition(i);
        startSmoothScroll(c11351a);
    }

    /* JADX INFO: renamed from: t */
    public final int m65857t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: u */
    public AbstractC0612r m65858u() {
        if (this.f43008j == 0) {
            if (this.f43009k == null) {
                this.f43009k = AbstractC0612r.m3825a(this);
            }
            return this.f43009k;
        }
        if (this.f43010l == null) {
            this.f43010l = AbstractC0612r.m3827c(this);
        }
        return this.f43010l;
    }

    /* JADX INFO: renamed from: v */
    public C11356f m65859v() {
        if (this.f43004f == null) {
            this.f43004f = new C11356f();
        }
        return this.f43004f;
    }

    /* JADX INFO: renamed from: w */
    public final int m65860w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    public final void m65861x() {
        C11356f c11356f = this.f43004f;
        if (c11356f != null) {
            c11356f.f43018a.clear();
        }
        int i = this.f43002d;
        if (i != -1) {
            this.f43001c = i;
        }
        int iMin = Math.min(Math.max(0, this.f43001c), getItemCount() - 1);
        this.f43001c = iMin;
        this.f42999a = iMin;
        this.f43000b = iMin;
        this.f43002d = -1;
        View view = this.f43003e;
        if (view != null) {
            view.setSelected(false);
            this.f43003e = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m65862y(boolean z) {
        this.f43007i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m65863z(InterfaceC11353c interfaceC11353c) {
        this.f43011m = interfaceC11353c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.share.FeedGalleryLayoutManager$d */
    public static class C11354d extends RecyclerView.C0578p {
        public C11354d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C11354d(int i, int i2) {
            super(i, i2);
        }

        public C11354d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C11354d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C11354d(context, attributeSet);
    }
}
