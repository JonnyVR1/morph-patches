package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet;

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

/* JADX INFO: loaded from: classes10.dex */
public class SweetGalleryLayoutManager extends RecyclerView.AbstractC0579o implements RecyclerView.AbstractC0590z.b {

    /* JADX INFO: renamed from: e */
    public View f54360e;

    /* JADX INFO: renamed from: f */
    public C13203f f54361f;

    /* JADX INFO: renamed from: j */
    public int f54365j;

    /* JADX INFO: renamed from: k */
    public AbstractC0614r f54366k;

    /* JADX INFO: renamed from: l */
    public AbstractC0614r f54367l;

    /* JADX INFO: renamed from: m */
    public InterfaceC13200c f54368m;

    /* JADX INFO: renamed from: n */
    public InterfaceC13202e f54369n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f54370o;

    /* JADX INFO: renamed from: a */
    public int f54356a = 0;

    /* JADX INFO: renamed from: b */
    public int f54357b = 0;

    /* JADX INFO: renamed from: c */
    public int f54358c = 0;

    /* JADX INFO: renamed from: d */
    public int f54359d = -1;

    /* JADX INFO: renamed from: g */
    public C0611o f54362g = new C0611o();

    /* JADX INFO: renamed from: h */
    public C13199b f54363h = new C13199b();

    /* JADX INFO: renamed from: i */
    public boolean f54364i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$a */
    public class C13198a extends C0610n {
        public C13198a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m79670a(View view) {
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
        public int m79671b(View view) {
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
            int iM79670a = m79670a(view);
            int iM79671b = m79671b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM79670a * iM79670a) + (iM79671b * iM79671b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3492d(-iM79670a, -iM79671b, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$b */
    public class C13199b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f54372a;

        /* JADX INFO: renamed from: b */
        public boolean f54373b;

        public C13199b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3812h;
            super.onScrollStateChanged(recyclerView, i);
            this.f54372a = i;
            if (i != 0 || (viewMo3812h = SweetGalleryLayoutManager.this.f54362g.mo3812h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewMo3812h);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
            if (position == sweetGalleryLayoutManager.f54359d) {
                if (sweetGalleryLayoutManager.f54364i || SweetGalleryLayoutManager.this.f54369n == null || !this.f54373b) {
                    return;
                }
                this.f54373b = false;
                SweetGalleryLayoutManager.this.f54369n.mo79673a(recyclerView, viewMo3812h, SweetGalleryLayoutManager.this.f54359d);
                return;
            }
            View view = sweetGalleryLayoutManager.f54360e;
            if (view != null) {
                view.setSelected(false);
            }
            SweetGalleryLayoutManager.this.f54360e = viewMo3812h;
            viewMo3812h.setSelected(true);
            SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
            sweetGalleryLayoutManager2.f54359d = position;
            if (sweetGalleryLayoutManager2.f54369n != null) {
                SweetGalleryLayoutManager.this.f54369n.mo79673a(recyclerView, viewMo3812h, SweetGalleryLayoutManager.this.f54359d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewMo3812h = SweetGalleryLayoutManager.this.f54362g.mo3812h(recyclerView.getLayoutManager());
            if (viewMo3812h != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewMo3812h);
                SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
                if (position != sweetGalleryLayoutManager.f54359d) {
                    View view = sweetGalleryLayoutManager.f54360e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    SweetGalleryLayoutManager.this.f54360e = viewMo3812h;
                    viewMo3812h.setSelected(true);
                    SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
                    sweetGalleryLayoutManager2.f54359d = position;
                    if (!sweetGalleryLayoutManager2.f54364i && this.f54372a != 0) {
                        this.f54373b = true;
                    } else if (SweetGalleryLayoutManager.this.f54369n != null) {
                        SweetGalleryLayoutManager.this.f54369n.mo79673a(recyclerView, viewMo3812h, SweetGalleryLayoutManager.this.f54359d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$c */
    public interface InterfaceC13200c {
        /* JADX INFO: renamed from: a */
        void mo79672a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$e */
    public interface InterfaceC13202e {
        /* JADX INFO: renamed from: a */
        void mo79673a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$f */
    public class C13203f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f54375a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f54376b = 0;

        public C13203f() {
        }
    }

    public SweetGalleryLayoutManager(int i) {
        this.f54365j = i;
    }

    /* JADX INFO: renamed from: g */
    private int m79648g(View view, float f) {
        float height;
        int top;
        AbstractC0614r abstractC0614rM79666u = m79666u();
        int iMo3834i = ((abstractC0614rM79666u.mo3834i() - abstractC0614rM79666u.mo3838m()) / 2) + abstractC0614rM79666u.mo3838m();
        if (this.f54365j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - iMo3834i);
    }

    /* JADX INFO: renamed from: h */
    private int m79649h(int i) {
        return (getChildCount() != 0 && i >= this.f54356a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: i */
    private float m79650i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m79648g(view, f) * 1.0f) / (this.f54365j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    private void m79651j(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM79661t = m79661t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM79661t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            sweetGalleryLayoutManager.f54357b = i;
            if (sweetGalleryLayoutManager.m79667v().f54375a.get(i) == null) {
                sweetGalleryLayoutManager.m79667v().f54375a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m79667v().f54375a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m79652k(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f54365j == 0) {
            m79656o(c0586v, c0561a0, i);
        } else {
            m79657p(c0586v, c0561a0, i);
        }
        if (this.f54368m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f54368m.mo79672a(this, childAt, m79650i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m79653l(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM79662w = m79662w();
        while (i >= 0 && i2 > i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o, 0);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM79662w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            sweetGalleryLayoutManager.f54356a = i;
            if (sweetGalleryLayoutManager.m79667v().f54375a.get(i) == null) {
                sweetGalleryLayoutManager.m79667v().f54375a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m79667v().f54375a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m79654m(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM79662w = m79662w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM79662w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            sweetGalleryLayoutManager.f54357b = i;
            if (sweetGalleryLayoutManager.m79667v().f54375a.get(i) == null) {
                sweetGalleryLayoutManager.m79667v().f54375a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m79667v().f54375a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m79655n(RecyclerView.C0586v c0586v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM79661t = m79661t();
        while (i >= 0 && i2 > i3) {
            View viewM3475o = c0586v.m3475o(i);
            this.addView(viewM3475o, 0);
            this.measureChildWithMargins(viewM3475o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3475o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3475o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM79661t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            sweetGalleryLayoutManager.f54356a = i;
            if (sweetGalleryLayoutManager.m79667v().f54375a.get(i) == null) {
                sweetGalleryLayoutManager.m79667v().f54375a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m79667v().f54375a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m79656o(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        int i2;
        int decoratedRight;
        int iMo3838m = m79666u().mo3838m();
        int iMo3834i = m79666u().mo3834i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4 + i3);
                    if (getDecoratedRight(childAt) - i >= iMo3838m) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0586v);
                    this.f54356a++;
                    i3--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > iMo3834i) {
                        removeAndRecycleView(childAt2, c0586v);
                        this.f54357b--;
                    }
                }
            }
        }
        int i5 = this.f54356a;
        int iM79662w = m79662w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedLeft > iMo3838m + i; i6--) {
                Rect rect = m79667v().f54375a.get(i6);
                View viewM3475o = c0586v.m3475o(i6);
                addView(viewM3475o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m79667v().f54375a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3475o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
                int paddingTop = (int) (getPaddingTop() + ((iM79662w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewM3475o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f54356a = i6;
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
            Rect rect3 = m79667v().f54375a.get(i7);
            View viewM3475o2 = c0586v.m3475o(i7);
            addView(viewM3475o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m79667v().f54375a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3475o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3475o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3475o2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM79662w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m79661t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewM3475o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f54357b = i7;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m79657p(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        int i2;
        int decoratedBottom;
        int iMo3838m = m79666u().mo3838m();
        int iMo3834i = m79666u().mo3834i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= iMo3834i) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0586v);
                    this.f54357b--;
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4 + i3);
                    if (getDecoratedBottom(childAt2) - i >= iMo3838m) {
                        break;
                    }
                    removeAndRecycleView(childAt2, c0586v);
                    this.f54356a++;
                    i3--;
                }
            }
        }
        int i5 = this.f54356a;
        int iM79661t = m79661t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedTop > iMo3838m + i; i6--) {
                Rect rect = m79667v().f54375a.get(i6);
                View viewM3475o = c0586v.m3475o(i6);
                addView(viewM3475o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m79667v().f54375a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3475o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
                int paddingLeft = (int) (getPaddingLeft() + ((iM79661t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewM3475o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f54356a = i6;
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
            Rect rect3 = m79667v().f54375a.get(i7);
            View viewM3475o2 = c0586v.m3475o(i7);
            addView(viewM3475o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m79667v().f54375a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3475o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3475o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3475o2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM79661t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m79662w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewM3475o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f54357b = i7;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m79658q(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (this.f54365j == 0) {
            m79659r(c0586v, c0561a0);
        } else {
            m79660s(c0586v, c0561a0);
        }
        if (this.f54368m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f54368m.mo79672a(this, childAt, m79650i(childAt, i));
            }
        }
        this.f54363h.onScrolled(this.f54370o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m79659r(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        detachAndScrapAttachedViews(c0586v);
        int iMo3838m = m79666u().mo3838m();
        int iMo3834i = m79666u().mo3834i();
        int i = this.f54358c;
        Rect rect = new Rect();
        int iM79662w = m79662w();
        View viewM3475o = c0586v.m3475o(this.f54358c);
        addView(viewM3475o, 0);
        measureChildWithMargins(viewM3475o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
        int paddingTop = (int) (getPaddingTop() + ((iM79662w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m79661t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
        if (m79667v().f54375a.get(i) == null) {
            m79667v().f54375a.put(i, rect);
        } else {
            m79667v().f54375a.get(i).set(rect);
        }
        this.f54357b = i;
        this.f54356a = i;
        int decoratedLeft = getDecoratedLeft(viewM3475o);
        int decoratedRight = getDecoratedRight(viewM3475o);
        m79653l(c0586v, this.f54358c - 1, decoratedLeft, iMo3838m);
        m79654m(c0586v, this.f54358c + 1, decoratedRight, iMo3834i);
    }

    /* JADX INFO: renamed from: s */
    private void m79660s(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        detachAndScrapAttachedViews(c0586v);
        int iMo3838m = m79666u().mo3838m();
        int iMo3834i = m79666u().mo3834i();
        int i = this.f54358c;
        Rect rect = new Rect();
        int iM79661t = m79661t();
        View viewM3475o = c0586v.m3475o(this.f54358c);
        addView(viewM3475o, 0);
        measureChildWithMargins(viewM3475o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3475o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3475o);
        int paddingLeft = (int) (getPaddingLeft() + ((iM79661t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m79662w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3475o, rect.left, rect.top, rect.right, rect.bottom);
        if (m79667v().f54375a.get(i) == null) {
            m79667v().f54375a.put(i, rect);
        } else {
            m79667v().f54375a.get(i).set(rect);
        }
        this.f54357b = i;
        this.f54356a = i;
        int decoratedTop = getDecoratedTop(viewM3475o);
        int decoratedBottom = getDecoratedBottom(viewM3475o);
        m79655n(c0586v, this.f54358c - 1, decoratedTop, iMo3838m);
        m79651j(c0586v, this.f54358c + 1, decoratedBottom, iMo3834i);
    }

    /* JADX INFO: renamed from: t */
    private int m79661t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: w */
    private int m79662w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    private void m79663x() {
        C13203f c13203f = this.f54361f;
        if (c13203f != null) {
            c13203f.f54375a.clear();
        }
        int i = this.f54359d;
        if (i != -1) {
            this.f54358c = i;
        }
        int iMin = Math.min(Math.max(0, this.f54358c), getItemCount() - 1);
        this.f54358c = iMin;
        this.f54356a = iMin;
        this.f54357b = iMin;
        this.f54359d = -1;
        View view = this.f54360e;
        if (view != null) {
            view.setSelected(false);
            this.f54360e = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m79664A(InterfaceC13202e interfaceC13202e) {
        this.f54369n = interfaceC13202e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return this.f54365j == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return this.f54365j == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean checkLayoutParams(RecyclerView.C0580p c0580p) {
        return c0580p instanceof C13201d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM79649h = m79649h(i);
        PointF pointF = new PointF();
        if (iM79649h == 0) {
            return null;
        }
        if (this.f54365j == 0) {
            pointF.x = iM79649h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM79649h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m79665f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            wg3.m206174a("The attach RecycleView must not null!!");
            return;
        }
        this.f54370o = recyclerView;
        this.f54358c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f54362g.mo3858b(recyclerView);
        recyclerView.addOnScrollListener(this.f54363h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return this.f54365j == 1 ? new C13201d(-1, -2) : new C13201d(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C13201d((ViewGroup.MarginLayoutParams) layoutParams) : new C13201d(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (getItemCount() == 0) {
            m79663x();
            detachAndScrapAttachedViews(c0586v);
            return;
        }
        if (c0561a0.m3364f()) {
            return;
        }
        if (c0561a0.m3361c() == 0 || c0561a0.m3360b()) {
            if (getChildCount() == 0 || c0561a0.m3360b()) {
                m79663x();
            }
            this.f54358c = Math.min(Math.max(0, this.f54358c), getItemCount() - 1);
            detachAndScrapAttachedViews(c0586v);
            m79658q(c0586v, c0561a0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3834i = ((m79666u().mo3834i() - m79666u().mo3838m()) / 2) + m79666u().mo3838m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iMo3834i));
                i2 = -iMin;
            }
        } else if (this.f54356a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iMo3834i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m79667v().f54376b = i3;
        m79652k(c0586v, c0561a0, i3);
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
        int iMo3834i = ((m79666u().mo3834i() - m79666u().mo3838m()) / 2) + m79666u().mo3838m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iMo3834i));
                i2 = -iMin;
            }
        } else if (this.f54356a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iMo3834i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m79667v().f54376b = i3;
        m79652k(c0586v, c0561a0, i3);
        offsetChildrenVertical(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        C13198a c13198a = new C13198a(recyclerView.getContext());
        c13198a.setTargetPosition(i);
        startSmoothScroll(c13198a);
    }

    /* JADX INFO: renamed from: u */
    public AbstractC0614r m79666u() {
        if (this.f54365j == 0) {
            if (this.f54366k == null) {
                this.f54366k = AbstractC0614r.m3826a(this);
            }
            return this.f54366k;
        }
        if (this.f54367l == null) {
            this.f54367l = AbstractC0614r.m3828c(this);
        }
        return this.f54367l;
    }

    /* JADX INFO: renamed from: v */
    public C13203f m79667v() {
        if (this.f54361f == null) {
            this.f54361f = new C13203f();
        }
        return this.f54361f;
    }

    /* JADX INFO: renamed from: y */
    public void m79668y(boolean z) {
        this.f54364i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m79669z(InterfaceC13200c interfaceC13200c) {
        this.f54368m = interfaceC13200c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$d */
    public static class C13201d extends RecyclerView.C0580p {
        public C13201d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C13201d(int i, int i2) {
            super(i, i2);
        }

        public C13201d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C13201d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C13201d(context, attributeSet);
    }
}
