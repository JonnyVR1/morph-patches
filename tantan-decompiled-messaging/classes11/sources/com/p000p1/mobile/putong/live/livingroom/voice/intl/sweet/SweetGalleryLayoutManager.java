package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SweetGalleryLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: e */
    public View f7118e;

    /* JADX INFO: renamed from: f */
    public C0442f f7119f;

    /* JADX INFO: renamed from: j */
    public int f7123j;

    /* JADX INFO: renamed from: k */
    public r f7124k;

    /* JADX INFO: renamed from: l */
    public r f7125l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0439c f7126m;

    /* JADX INFO: renamed from: n */
    public InterfaceC0441e f7127n;

    /* JADX INFO: renamed from: o */
    public RecyclerView f7128o;

    /* JADX INFO: renamed from: a */
    public int f7114a = 0;

    /* JADX INFO: renamed from: b */
    public int f7115b = 0;

    /* JADX INFO: renamed from: c */
    public int f7116c = 0;

    /* JADX INFO: renamed from: d */
    public int f7117d = -1;

    /* JADX INFO: renamed from: g */
    public o f7120g = new o();

    /* JADX INFO: renamed from: h */
    public C0438b f7121h = new C0438b();

    /* JADX INFO: renamed from: i */
    public boolean f7122i = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$a */
    public class C0437a extends n {
        public C0437a(Context context) {
            super(context);
        }

        /* JADX INFO: renamed from: a */
        public int m8696a(View view) {
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
        public int m8697b(View view) {
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
            int iM8696a = m8696a(view);
            int iM8697b = m8697b(view);
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((iM8696a * iM8696a) + (iM8697b * iM8697b)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(-iM8696a, -iM8697b, iCalculateTimeForDeceleration, ((n) this).mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$b */
    public class C0438b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public int f7130a;

        /* JADX INFO: renamed from: b */
        public boolean f7131b;

        public C0438b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View viewH;
            super.onScrollStateChanged(recyclerView, i);
            this.f7130a = i;
            if (i != 0 || (viewH = SweetGalleryLayoutManager.this.f7120g.h(recyclerView.getLayoutManager())) == null) {
                return;
            }
            int position = recyclerView.getLayoutManager().getPosition(viewH);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
            if (position == sweetGalleryLayoutManager.f7117d) {
                if (sweetGalleryLayoutManager.f7122i || SweetGalleryLayoutManager.this.f7127n == null || !this.f7131b) {
                    return;
                }
                this.f7131b = false;
                SweetGalleryLayoutManager.this.f7127n.mo8699a(recyclerView, viewH, SweetGalleryLayoutManager.this.f7117d);
                return;
            }
            View view = sweetGalleryLayoutManager.f7118e;
            if (view != null) {
                view.setSelected(false);
            }
            SweetGalleryLayoutManager.this.f7118e = viewH;
            viewH.setSelected(true);
            SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
            sweetGalleryLayoutManager2.f7117d = position;
            if (sweetGalleryLayoutManager2.f7127n != null) {
                SweetGalleryLayoutManager.this.f7127n.mo8699a(recyclerView, viewH, SweetGalleryLayoutManager.this.f7117d);
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View viewH = SweetGalleryLayoutManager.this.f7120g.h(recyclerView.getLayoutManager());
            if (viewH != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewH);
                SweetGalleryLayoutManager sweetGalleryLayoutManager = SweetGalleryLayoutManager.this;
                if (position != sweetGalleryLayoutManager.f7117d) {
                    View view = sweetGalleryLayoutManager.f7118e;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    SweetGalleryLayoutManager.this.f7118e = viewH;
                    viewH.setSelected(true);
                    SweetGalleryLayoutManager sweetGalleryLayoutManager2 = SweetGalleryLayoutManager.this;
                    sweetGalleryLayoutManager2.f7117d = position;
                    if (!sweetGalleryLayoutManager2.f7122i && this.f7130a != 0) {
                        this.f7131b = true;
                    } else if (SweetGalleryLayoutManager.this.f7127n != null) {
                        SweetGalleryLayoutManager.this.f7127n.mo8699a(recyclerView, viewH, SweetGalleryLayoutManager.this.f7117d);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$c */
    public interface InterfaceC0439c {
        /* JADX INFO: renamed from: a */
        void mo8698a(SweetGalleryLayoutManager sweetGalleryLayoutManager, View view, float f);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$e */
    public interface InterfaceC0441e {
        /* JADX INFO: renamed from: a */
        void mo8699a(RecyclerView recyclerView, View view, int i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$f */
    public class C0442f {

        /* JADX INFO: renamed from: a */
        public SparseArray<Rect> f7133a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public int f7134b = 0;

        public C0442f() {
        }
    }

    public SweetGalleryLayoutManager(int i) {
        this.f7123j = i;
    }

    /* JADX INFO: renamed from: g */
    private int m8674g(View view, float f) {
        float height;
        int top;
        r rVarM8692u = m8692u();
        int i = ((rVarM8692u.i() - rVarM8692u.m()) / 2) + rVarM8692u.m();
        if (this.f7123j == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        return (int) ((height + top) - i);
    }

    /* JADX INFO: renamed from: h */
    private int m8675h(int i) {
        return (getChildCount() != 0 && i >= this.f7114a) ? 1 : -1;
    }

    /* JADX INFO: renamed from: i */
    private float m8676i(View view, float f) {
        return Math.max(-1.0f, Math.min(1.0f, (m8674g(view, f) * 1.0f) / (this.f7123j == 0 ? view.getWidth() : view.getHeight())));
    }

    /* JADX INFO: renamed from: j */
    private void m8677j(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM8687t = m8687t();
        while (i < this.getItemCount() && i2 < i3) {
            View viewO = vVar.o(i);
            this.addView(viewO);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM8687t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            sweetGalleryLayoutManager.f7115b = i;
            if (sweetGalleryLayoutManager.m8693v().f7133a.get(i) == null) {
                sweetGalleryLayoutManager.m8693v().f7133a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m8693v().f7133a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m8678k(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (this.f7123j == 0) {
            m8682o(vVar, zVar, i);
        } else {
            m8683p(vVar, zVar, i);
        }
        if (this.f7126m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f7126m.mo8698a(this, childAt, m8676i(childAt, i));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m8679l(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM8688w = m8688w();
        while (i >= 0 && i2 > i3) {
            View viewO = vVar.o(i);
            this.addView(viewO, 0);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (this.getPaddingTop() + ((iM8688w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2 - decoratedMeasuredWidth, paddingTop, i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            sweetGalleryLayoutManager.f7114a = i;
            if (sweetGalleryLayoutManager.m8693v().f7133a.get(i) == null) {
                sweetGalleryLayoutManager.m8693v().f7133a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m8693v().f7133a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: m */
    private void m8680m(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM8688w = m8688w();
        while (i < this.getItemCount() && i2 < i3) {
            View viewO = vVar.o(i);
            this.addView(viewO);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingTop = (int) (this.getPaddingTop() + ((iM8688w - decoratedMeasuredHeight) / 2.0f));
            rect.set(i2, paddingTop, decoratedMeasuredWidth + i2, decoratedMeasuredHeight + paddingTop);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            sweetGalleryLayoutManager.f7115b = i;
            if (sweetGalleryLayoutManager.m8693v().f7133a.get(i) == null) {
                sweetGalleryLayoutManager.m8693v().f7133a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m8693v().f7133a.get(i).set(rect);
            }
            i++;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: n */
    private void m8681n(RecyclerView.v vVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int iM8687t = m8687t();
        while (i >= 0 && i2 > i3) {
            View viewO = vVar.o(i);
            this.addView(viewO, 0);
            this.measureChildWithMargins(viewO, 0, 0);
            int decoratedMeasuredWidth = this.getDecoratedMeasuredWidth(viewO);
            int decoratedMeasuredHeight = this.getDecoratedMeasuredHeight(viewO);
            int paddingLeft = (int) (this.getPaddingLeft() + ((iM8687t - decoratedMeasuredWidth) / 2.0f));
            rect.set(paddingLeft, i2 - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, i2);
            SweetGalleryLayoutManager sweetGalleryLayoutManager = this;
            sweetGalleryLayoutManager.layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            sweetGalleryLayoutManager.f7114a = i;
            if (sweetGalleryLayoutManager.m8693v().f7133a.get(i) == null) {
                sweetGalleryLayoutManager.m8693v().f7133a.put(i, rect);
            } else {
                sweetGalleryLayoutManager.m8693v().f7133a.get(i).set(rect);
            }
            i--;
            this = sweetGalleryLayoutManager;
        }
    }

    /* JADX INFO: renamed from: o */
    private void m8682o(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedRight;
        int iM = m8692u().m();
        int i3 = m8692u().i();
        if (getChildCount() > 0) {
            if (i >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5 + i4);
                    if (getDecoratedRight(childAt) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt, vVar);
                    this.f7114a++;
                    i4--;
                }
            } else {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt2 = getChildAt(childCount);
                    if (getDecoratedLeft(childAt2) - i > i3) {
                        removeAndRecycleView(childAt2, vVar);
                        this.f7115b--;
                    }
                }
            }
        }
        int i6 = this.f7114a;
        int iM8688w = m8688w();
        int decoratedLeft = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedLeft = getDecoratedLeft(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedLeft > iM + i; i7--) {
                Rect rect = m8693v().f7133a.get(i7);
                View viewO = vVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    m8693v().f7133a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingTop = (int) (getPaddingTop() + ((iM8688w - decoratedMeasuredHeight) / 2.0f));
                rect2.set(decoratedLeft - decoratedMeasuredWidth, paddingTop, decoratedLeft, decoratedMeasuredHeight + paddingTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.f7114a = i7;
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
            Rect rect3 = m8693v().f7133a.get(i8);
            View viewO2 = vVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                m8693v().f7133a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingTop2 = (int) (getPaddingTop() + ((iM8688w - decoratedMeasuredHeight2) / 2.0f));
            if (decoratedRight == -1 && i2 == 0) {
                int paddingLeft = (int) (getPaddingLeft() + ((m8687t() - decoratedMeasuredWidth2) / 2.0f));
                rect4.set(paddingLeft, paddingTop2, decoratedMeasuredWidth2 + paddingLeft, decoratedMeasuredHeight2 + paddingTop2);
            } else {
                rect4.set(decoratedRight, paddingTop2, decoratedMeasuredWidth2 + decoratedRight, decoratedMeasuredHeight2 + paddingTop2);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedRight = rect4.right;
            this.f7115b = i8;
        }
    }

    /* JADX INFO: renamed from: p */
    private void m8683p(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int i2;
        int decoratedBottom;
        int iM = m8692u().m();
        int i3 = m8692u().i();
        if (getChildCount() > 0) {
            if (i < 0) {
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = getChildAt(childCount);
                    if (getDecoratedTop(childAt) - i <= i3) {
                        break;
                    }
                    removeAndRecycleView(childAt, vVar);
                    this.f7115b--;
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt2 = getChildAt(i5 + i4);
                    if (getDecoratedBottom(childAt2) - i >= iM) {
                        break;
                    }
                    removeAndRecycleView(childAt2, vVar);
                    this.f7114a++;
                    i4--;
                }
            }
        }
        int i6 = this.f7114a;
        int iM8687t = m8687t();
        int decoratedTop = -1;
        if (i < 0) {
            if (getChildCount() > 0) {
                View childAt3 = getChildAt(0);
                int position = getPosition(childAt3) - 1;
                decoratedTop = getDecoratedTop(childAt3);
                i6 = position;
            }
            for (int i7 = i6; i7 >= 0 && decoratedTop > iM + i; i7--) {
                Rect rect = m8693v().f7133a.get(i7);
                View viewO = vVar.o(i7);
                addView(viewO, 0);
                if (rect == null) {
                    rect = new Rect();
                    m8693v().f7133a.put(i7, rect);
                }
                Rect rect2 = rect;
                measureChildWithMargins(viewO, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
                int paddingLeft = (int) (getPaddingLeft() + ((iM8687t - decoratedMeasuredWidth) / 2.0f));
                rect2.set(paddingLeft, decoratedTop - decoratedMeasuredHeight, decoratedMeasuredWidth + paddingLeft, decoratedTop);
                layoutDecorated(viewO, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedTop = rect2.top;
                this.f7114a = i7;
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
            Rect rect3 = m8693v().f7133a.get(i8);
            View viewO2 = vVar.o(i8);
            addView(viewO2);
            if (rect3 == null) {
                rect3 = new Rect();
                m8693v().f7133a.put(i8, rect3);
            }
            Rect rect4 = rect3;
            measureChildWithMargins(viewO2, 0, 0);
            int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewO2);
            int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewO2);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iM8687t - decoratedMeasuredWidth2) / 2.0f));
            if (decoratedBottom == -1 && i2 == 0) {
                int paddingTop = (int) (getPaddingTop() + ((m8688w() - decoratedMeasuredHeight2) / 2.0f));
                rect4.set(paddingLeft2, paddingTop, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop);
            } else {
                rect4.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
            }
            layoutDecorated(viewO2, rect4.left, rect4.top, rect4.right, rect4.bottom);
            decoratedBottom = rect4.bottom;
            this.f7115b = i8;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m8684q(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        if (this.f7123j == 0) {
            m8685r(vVar, zVar);
        } else {
            m8686s(vVar, zVar);
        }
        if (this.f7126m != null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                this.f7126m.mo8698a(this, childAt, m8676i(childAt, i));
            }
        }
        this.f7121h.onScrolled(this.f7128o, 0, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m8685r(RecyclerView.v vVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(vVar);
        int iM = m8692u().m();
        int i = m8692u().i();
        int i2 = this.f7116c;
        Rect rect = new Rect();
        int iM8688w = m8688w();
        View viewO = vVar.o(this.f7116c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingTop = (int) (getPaddingTop() + ((iM8688w - decoratedMeasuredHeight) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((m8687t() - decoratedMeasuredWidth) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (m8693v().f7133a.get(i2) == null) {
            m8693v().f7133a.put(i2, rect);
        } else {
            m8693v().f7133a.get(i2).set(rect);
        }
        this.f7115b = i2;
        this.f7114a = i2;
        int decoratedLeft = getDecoratedLeft(viewO);
        int decoratedRight = getDecoratedRight(viewO);
        m8679l(vVar, this.f7116c - 1, decoratedLeft, iM);
        m8680m(vVar, this.f7116c + 1, decoratedRight, i);
    }

    /* JADX INFO: renamed from: s */
    private void m8686s(RecyclerView.v vVar, RecyclerView.z zVar) {
        detachAndScrapAttachedViews(vVar);
        int iM = m8692u().m();
        int i = m8692u().i();
        int i2 = this.f7116c;
        Rect rect = new Rect();
        int iM8687t = m8687t();
        View viewO = vVar.o(this.f7116c);
        addView(viewO, 0);
        measureChildWithMargins(viewO, 0, 0);
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewO);
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewO);
        int paddingLeft = (int) (getPaddingLeft() + ((iM8687t - decoratedMeasuredWidth) / 2.0f));
        int paddingTop = (int) (getPaddingTop() + ((m8688w() - decoratedMeasuredHeight) / 2.0f));
        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
        layoutDecorated(viewO, rect.left, rect.top, rect.right, rect.bottom);
        if (m8693v().f7133a.get(i2) == null) {
            m8693v().f7133a.put(i2, rect);
        } else {
            m8693v().f7133a.get(i2).set(rect);
        }
        this.f7115b = i2;
        this.f7114a = i2;
        int decoratedTop = getDecoratedTop(viewO);
        int decoratedBottom = getDecoratedBottom(viewO);
        m8681n(vVar, this.f7116c - 1, decoratedTop, iM);
        m8677j(vVar, this.f7116c + 1, decoratedBottom, i);
    }

    /* JADX INFO: renamed from: t */
    private int m8687t() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* JADX INFO: renamed from: w */
    private int m8688w() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX INFO: renamed from: x */
    private void m8689x() {
        C0442f c0442f = this.f7119f;
        if (c0442f != null) {
            c0442f.f7133a.clear();
        }
        int i = this.f7117d;
        if (i != -1) {
            this.f7116c = i;
        }
        int iMin = Math.min(Math.max(0, this.f7116c), getItemCount() - 1);
        this.f7116c = iMin;
        this.f7114a = iMin;
        this.f7115b = iMin;
        this.f7117d = -1;
        View view = this.f7118e;
        if (view != null) {
            view.setSelected(false);
            this.f7118e = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public void m8690A(InterfaceC0441e interfaceC0441e) {
        this.f7127n = interfaceC0441e;
    }

    public boolean canScrollHorizontally() {
        return this.f7123j == 0;
    }

    public boolean canScrollVertically() {
        return this.f7123j == 1;
    }

    public boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof C0440d;
    }

    public PointF computeScrollVectorForPosition(int i) {
        int iM8675h = m8675h(i);
        PointF pointF = new PointF();
        if (iM8675h == 0) {
            return null;
        }
        if (this.f7123j == 0) {
            pointF.x = iM8675h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM8675h;
        return pointF;
    }

    /* JADX INFO: renamed from: f */
    public void m8691f(RecyclerView recyclerView, int i) {
        if (recyclerView == null) {
            ig3.a("The attach RecycleView must not null!!");
            return;
        }
        this.f7128o = recyclerView;
        this.f7116c = Math.max(0, i);
        recyclerView.setLayoutManager(this);
        this.f7120g.b(recyclerView);
        recyclerView.addOnScrollListener(this.f7121h);
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return this.f7123j == 1 ? new C0440d(-1, -2) : new C0440d(-2, -1);
    }

    public RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0440d((ViewGroup.MarginLayoutParams) layoutParams) : new C0440d(layoutParams);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (getItemCount() == 0) {
            m8689x();
            detachAndScrapAttachedViews(vVar);
            return;
        }
        if (zVar.f()) {
            return;
        }
        if (zVar.c() == 0 || zVar.b()) {
            if (getChildCount() == 0 || zVar.b()) {
                m8689x();
            }
            this.f7116c = Math.min(Math.max(0, this.f7116c), getItemCount() - 1);
            detachAndScrapAttachedViews(vVar);
            m8684q(vVar, zVar, 0);
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((m8692u().i() - m8692u().m()) / 2) + m8692u().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - i3));
                i2 = -iMin;
            }
        } else if (this.f7114a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        m8693v().f7134b = i4;
        m8678k(vVar, zVar, i4);
        offsetChildrenHorizontal(i2);
        return i4;
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int i3 = ((m8692u().i() - m8692u().m()) / 2) + m8692u().m();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - i3));
                i2 = -iMin;
            }
        } else if (this.f7114a == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - i3));
            i2 = -iMin;
        }
        int i4 = -i2;
        m8693v().f7134b = i4;
        m8678k(vVar, zVar, i4);
        offsetChildrenVertical(i2);
        return i4;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        C0437a c0437a = new C0437a(recyclerView.getContext());
        c0437a.setTargetPosition(i);
        startSmoothScroll(c0437a);
    }

    /* JADX INFO: renamed from: u */
    public r m8692u() {
        if (this.f7123j == 0) {
            if (this.f7124k == null) {
                this.f7124k = r.a(this);
            }
            return this.f7124k;
        }
        if (this.f7125l == null) {
            this.f7125l = r.c(this);
        }
        return this.f7125l;
    }

    /* JADX INFO: renamed from: v */
    public C0442f m8693v() {
        if (this.f7119f == null) {
            this.f7119f = new C0442f();
        }
        return this.f7119f;
    }

    /* JADX INFO: renamed from: y */
    public void m8694y(boolean z) {
        this.f7122i = z;
    }

    /* JADX INFO: renamed from: z */
    public void m8695z(InterfaceC0439c interfaceC0439c) {
        this.f7126m = interfaceC0439c;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.sweet.SweetGalleryLayoutManager$d */
    public static class C0440d extends RecyclerView.p {
        public C0440d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0440d(int i, int i2) {
            super(i, i2);
        }

        public C0440d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0440d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0440d(context, attributeSet);
    }
}
