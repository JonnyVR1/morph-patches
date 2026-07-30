package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet;

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

/* JADX INFO: loaded from: classes11.dex */
public class SweetGalleryLayoutManager extends RecyclerView.AbstractC0577o implements RecyclerView.AbstractC0587y.b {

    /* JADX INFO: renamed from: e */
    public View f53512e;

    /* JADX INFO: renamed from: f */
    public C13040f f53513f;

    /* JADX INFO: renamed from: j */
    public int f53517j;

    /* JADX INFO: renamed from: k */
    public AbstractC0612r f53518k;

    /* JADX INFO: renamed from: l */
    public AbstractC0612r f53519l;

    /* JADX INFO: renamed from: m */
    public InterfaceC13037c f53520m;

    /* JADX INFO: renamed from: n */
    public InterfaceC13039e f53521n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f53522o;

    /* JADX INFO: renamed from: a */
    public int f53508a = 0;

    /* JADX INFO: renamed from: b */
    public int f53509b = 0;

    /* JADX INFO: renamed from: c */
    public int f53510c = 0;

    /* JADX INFO: renamed from: d */
    public int f53511d = -1;

    /* JADX INFO: renamed from: g */
    public C0609o f53514g = new C0609o();

    /* JADX INFO: renamed from: h */
    public C13036b f53515h = new C13036b();

    /* JADX INFO: renamed from: i */
    public boolean f53516i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$a */
    public class C13035a extends C0608n {
        public C13035a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m78487a(View view) {
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
        public int m78488b(View view) {
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
            int iM78487a = m78487a(view);
            int iM78488b = m78488b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM78487a * iM78487a) + (iM78488b * iM78488b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3483d(-iM78487a, -iM78488b, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$b */
    public class C13036b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f53524a;

        /* JADX INFO: renamed from: b */
        public boolean f53525b;

        public C13036b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewMo3811h;
            super.onScrollStateChanged(recyclerView, i);
            this.f53524a = i;
            if (i != 0 || (viewMo3811h = SweetGalleryLayoutManager.this.f53514g.mo3811h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewMo3811h);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
            if (position == sweetGalleryLayoutManager.f53511d) {
                if (sweetGalleryLayoutManager.f53516i || SweetGalleryLayoutManager.this.f53521n == null || !this.f53525b) {
                    return;
                }
                this.f53525b = false;
                SweetGalleryLayoutManager.this.f53521n.mo78490a(recyclerView, viewMo3811h, SweetGalleryLayoutManager.this.f53511d);
                return;
            }
            View view = sweetGalleryLayoutManager.f53512e;
            if (view != null) {
                view.setSelected(false);
            }
            SweetGalleryLayoutManager.this.f53512e = viewMo3811h;
            viewMo3811h.setSelected(true);
            SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
            sweetGalleryLayoutManager2.f53511d = position;
            if (sweetGalleryLayoutManager2.f53521n != null) {
                SweetGalleryLayoutManager.this.f53521n.mo78490a(recyclerView, viewMo3811h, SweetGalleryLayoutManager.this.f53511d);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewMo3811h = SweetGalleryLayoutManager.this.f53514g.mo3811h(recyclerView.getLayoutManager());
            if (viewMo3811h != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewMo3811h);
                SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
                if (position != sweetGalleryLayoutManager.f53511d) {
                    View view = sweetGalleryLayoutManager.f53512e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    SweetGalleryLayoutManager.this.f53512e = viewMo3811h;
                    viewMo3811h.setSelected(true);
                    SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
                    sweetGalleryLayoutManager2.f53511d = position;
                    if (!sweetGalleryLayoutManager2.f53516i && this.f53524a != 0) {
                        this.f53525b = true;
                    } else if (SweetGalleryLayoutManager.this.f53521n != null) {
                        SweetGalleryLayoutManager.this.f53521n.mo78490a(recyclerView, viewMo3811h, SweetGalleryLayoutManager.this.f53511d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$c */
    public interface InterfaceC13037c {
        /* JADX INFO: renamed from: a */
        void mo78489a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$e */
    public interface InterfaceC13039e {
        /* JADX INFO: renamed from: a */
        void mo78490a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$f */
    public class C13040f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f53527a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f53528b = 0;

        public C13040f() {
        }
    }

    public SweetGalleryLayoutManager(int i) {
        this.f53517j = i;
    }

    /* JADX INFO: renamed from: g */
    private int m78465g(View view, float f) {
        float height;
        int top;
        AbstractC0612r abstractC0612rM78483u = m78483u();
        int iMo3833i = ((abstractC0612rM78483u.mo3833i() - abstractC0612rM78483u.mo3837m()) / 2) + abstractC0612rM78483u.mo3837m();
        if (this.f53517j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - iMo3833i);
    }

    /* JADX INFO: renamed from: h */
    private int m78466h(int i) {
        return (getChildCount() != 0 && i >= this.f53508a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: i */
    private float m78467i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m78465g(view, f) * 1.0f) / (this.f53517j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    private void m78468j(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM78478t = m78478t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM78478t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            sweetGalleryLayoutManager.f53509b = i;
            if (sweetGalleryLayoutManager.m78484v().f53527a.get(i) == null) {
                sweetGalleryLayoutManager.m78484v().f53527a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m78484v().f53527a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m78469k(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f53517j == 0) {
            m78473o(c0584v, c0588z, i);
        } else {
            m78474p(c0584v, c0588z, i);
        }
        if (this.f53520m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f53520m.mo78489a(this, childAt, m78467i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m78470l(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM78479w = m78479w();
        while (i >= 0 && i2 > i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o, 0);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM78479w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            sweetGalleryLayoutManager.f53508a = i;
            if (sweetGalleryLayoutManager.m78484v().f53527a.get(i) == null) {
                sweetGalleryLayoutManager.m78484v().f53527a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m78484v().f53527a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m78471m(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM78479w = m78479w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingTop = (int) (this.getPaddingTop() + ((iM78479w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            sweetGalleryLayoutManager.f53509b = i;
            if (sweetGalleryLayoutManager.m78484v().f53527a.get(i) == null) {
                sweetGalleryLayoutManager.m78484v().f53527a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m78484v().f53527a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m78472n(RecyclerView.C0584v c0584v, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM78478t = m78478t();
        while (i >= 0 && i2 > i3) {
            View viewM3466o = c0584v.m3466o(i);
            this.addView(viewM3466o, 0);
            this.measureChildWithMargins(viewM3466o, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewM3466o);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewM3466o);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM78478t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            sweetGalleryLayoutManager.f53508a = i;
            if (sweetGalleryLayoutManager.m78484v().f53527a.get(i) == null) {
                sweetGalleryLayoutManager.m78484v().f53527a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m78484v().f53527a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m78473o(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        int i2;
        int decoratedRight;
        int iMo3837m = m78483u().mo3837m();
        int iMo3833i = m78483u().mo3833i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4 + i3);
                    if (getDecoratedRight(childAt) - i >= iMo3837m) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0584v);
                    this.f53508a++;
                    i3--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > iMo3833i) {
                        removeAndRecycleView(childAt2, c0584v);
                        this.f53509b--;
                    }
                }
            }
        }
        int i5 = this.f53508a;
        int iM78479w = m78479w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedLeft > iMo3837m + i; i6--) {
                Rect rect = m78484v().f53527a.get(i6);
                View viewM3466o = c0584v.m3466o(i6);
                addView(viewM3466o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m78484v().f53527a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3466o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
                int paddingTop = (int) (getPaddingTop() + ((iM78479w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewM3466o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f53508a = i6;
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
            Rect rect3 = m78484v().f53527a.get(i7);
            View viewM3466o2 = c0584v.m3466o(i7);
            addView(viewM3466o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m78484v().f53527a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3466o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3466o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3466o2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM78479w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m78478t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewM3466o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f53509b = i7;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m78474p(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        int i2;
        int decoratedBottom;
        int iMo3837m = m78483u().mo3837m();
        int iMo3833i = m78483u().mo3833i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= iMo3833i) {
                        break;
                    }
                    removeAndRecycleView(childAt, c0584v);
                    this.f53509b--;
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt2 = getChildAt(i4 + i3);
                    if (getDecoratedBottom(childAt2) - i >= iMo3837m) {
                        break;
                    }
                    removeAndRecycleView(childAt2, c0584v);
                    this.f53508a++;
                    i3--;
                }
            }
        }
        int i5 = this.f53508a;
        int iM78478t = m78478t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i5 = position;
            }
            for (int i6 = i5; i6 >= 0 && decoratedTop > iMo3837m + i; i6--) {
                Rect rect = m78484v().f53527a.get(i6);
                View viewM3466o = c0584v.m3466o(i6);
                addView(viewM3466o, 0);
                if (rect == null) {
                    rect = new Rect();
                    m78484v().f53527a.put(i6, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewM3466o, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
                int paddingLeft = (int) (getPaddingLeft() + ((iM78478t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewM3466o, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f53508a = i6;
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
            Rect rect3 = m78484v().f53527a.get(i7);
            View viewM3466o2 = c0584v.m3466o(i7);
            addView(viewM3466o2);
            if (rect3 == null) {
                rect3 = new Rect();
                m78484v().f53527a.put(i7, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewM3466o2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewM3466o2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewM3466o2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM78478t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m78479w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewM3466o2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f53509b = i7;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m78475q(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (this.f53517j == 0) {
            m78476r(c0584v, c0588z);
        } else {
            m78477s(c0584v, c0588z);
        }
        if (this.f53520m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f53520m.mo78489a(this, childAt, m78467i(childAt, i));
            }
        }
        this.f53515h.onScrolled(this.f53522o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m78476r(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        detachAndScrapAttachedViews(c0584v);
        int iMo3837m = m78483u().mo3837m();
        int iMo3833i = m78483u().mo3833i();
        int i = this.f53510c;
        Rect rect = new Rect();
        int iM78479w = m78479w();
        View viewM3466o = c0584v.m3466o(this.f53510c);
        addView(viewM3466o, 0);
        measureChildWithMargins(viewM3466o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
        int paddingTop = (int) (getPaddingTop() + ((iM78479w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m78478t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
        if (m78484v().f53527a.get(i) == null) {
            m78484v().f53527a.put(i, rect);
        } else {
            m78484v().f53527a.get(i).set(rect);
        }
        this.f53509b = i;
        this.f53508a = i;
        int decoratedLeft = getDecoratedLeft(viewM3466o);
        int decoratedRight = getDecoratedRight(viewM3466o);
        m78470l(c0584v, this.f53510c - 1, decoratedLeft, iMo3837m);
        m78471m(c0584v, this.f53510c + 1, decoratedRight, iMo3833i);
    }

    /* JADX INFO: renamed from: s */
    private void m78477s(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        detachAndScrapAttachedViews(c0584v);
        int iMo3837m = m78483u().mo3837m();
        int iMo3833i = m78483u().mo3833i();
        int i = this.f53510c;
        Rect rect = new Rect();
        int iM78478t = m78478t();
        View viewM3466o = c0584v.m3466o(this.f53510c);
        addView(viewM3466o, 0);
        measureChildWithMargins(viewM3466o, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM3466o);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM3466o);
        int paddingLeft = (int) (getPaddingLeft() + ((iM78478t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m78479w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewM3466o, rect.left, rect.top, rect.right, rect.bottom);
        if (m78484v().f53527a.get(i) == null) {
            m78484v().f53527a.put(i, rect);
        } else {
            m78484v().f53527a.get(i).set(rect);
        }
        this.f53509b = i;
        this.f53508a = i;
        int decoratedTop = getDecoratedTop(viewM3466o);
        int decoratedBottom = getDecoratedBottom(viewM3466o);
        m78472n(c0584v, this.f53510c - 1, decoratedTop, iMo3837m);
        m78468j(c0584v, this.f53510c + 1, decoratedBottom, iMo3833i);
    }

    /* JADX INFO: renamed from: t */
    private int m78478t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: w */
    private int m78479w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    private void m78480x() {
        C13040f c13040f = this.f53513f;
        if (c13040f != null) {
            c13040f.f53527a.clear();
        }
        int i = this.f53511d;
        if (i != -1) {
            this.f53510c = i;
        }
        int iMin = Math.min(Math.max(0, this.f53510c), getItemCount() - 1);
        this.f53510c = iMin;
        this.f53508a = iMin;
        this.f53509b = iMin;
        this.f53511d = -1;
        View view = this.f53512e;
        if (view != null) {
            view.setSelected(false);
            this.f53512e = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m78481A(InterfaceC13039e interfaceC13039e) {
        this.f53521n = interfaceC13039e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return this.f53517j == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return this.f53517j == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean checkLayoutParams(RecyclerView.C0578p c0578p) {
        return c0578p instanceof C13038d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM78466h = m78466h(i);
        PointF pointF = new PointF();
        if (iM78466h == 0) {
            return null;
        }
        if (this.f53517j == 0) {
            pointF.x = iM78466h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM78466h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m78482f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            ig3.m135964a("The attach RecycleView must not null!!");
            return;
        }
        this.f53522o = recyclerView;
        this.f53510c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f53514g.mo3857b(recyclerView);
        recyclerView.addOnScrollListener(this.f53515h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return this.f53517j == 1 ? new C13038d(-1, -2) : new C13038d(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C13038d((ViewGroup.MarginLayoutParams) layoutParams) : new C13038d(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (getItemCount() == 0) {
            m78480x();
            detachAndScrapAttachedViews(c0584v);
            return;
        }
        if (c0588z.m3490f()) {
            return;
        }
        if (c0588z.m3487c() == 0 || c0588z.m3486b()) {
            if (getChildCount() == 0 || c0588z.m3486b()) {
                m78480x();
            }
            this.f53510c = Math.min(Math.max(0, this.f53510c), getItemCount() - 1);
            detachAndScrapAttachedViews(c0584v);
            m78475q(c0584v, c0588z, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iMo3833i = ((m78483u().mo3833i() - m78483u().mo3837m()) / 2) + m78483u().mo3837m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iMo3833i));
                i2 = -iMin;
            }
        } else if (this.f53508a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iMo3833i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m78484v().f53528b = i3;
        m78469k(c0584v, c0588z, i3);
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
        int iMo3833i = ((m78483u().mo3833i() - m78483u().mo3837m()) / 2) + m78483u().mo3837m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iMo3833i));
                i2 = -iMin;
            }
        } else if (this.f53508a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iMo3833i));
            i2 = -iMin;
        }
        int i3 = -i2;
        m78484v().f53528b = i3;
        m78469k(c0584v, c0588z, i3);
        offsetChildrenVertical(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        C13035a c13035a = new C13035a(recyclerView.getContext());
        c13035a.setTargetPosition(i);
        startSmoothScroll(c13035a);
    }

    /* JADX INFO: renamed from: u */
    public AbstractC0612r m78483u() {
        if (this.f53517j == 0) {
            if (this.f53518k == null) {
                this.f53518k = AbstractC0612r.m3825a(this);
            }
            return this.f53518k;
        }
        if (this.f53519l == null) {
            this.f53519l = AbstractC0612r.m3827c(this);
        }
        return this.f53519l;
    }

    /* JADX INFO: renamed from: v */
    public C13040f m78484v() {
        if (this.f53513f == null) {
            this.f53513f = new C13040f();
        }
        return this.f53513f;
    }

    /* JADX INFO: renamed from: y */
    public void m78485y(boolean z) {
        this.f53516i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m78486z(InterfaceC13037c interfaceC13037c) {
        this.f53520m = interfaceC13037c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$d */
    public static class C13038d extends RecyclerView.C0578p {
        public C13038d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C13038d(int i, int i2) {
            super(i, i2);
        }

        public C13038d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C13038d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C13038d(context, attributeSet);
    }
}
