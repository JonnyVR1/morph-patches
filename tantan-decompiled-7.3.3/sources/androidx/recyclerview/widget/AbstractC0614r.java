package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0614r {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC0579o f2912a;

    /* JADX INFO: renamed from: b */
    public int f2913b;

    /* JADX INFO: renamed from: c */
    public final Rect f2914c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$a */
    public class a extends AbstractC0614r {
        public a(RecyclerView.AbstractC0579o abstractC0579o) {
            super(abstractC0579o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: d */
        public int mo3829d(View view) {
            return this.f2912a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0580p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: e */
        public int mo3830e(View view) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: f */
        public int mo3831f(View view) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0580p).topMargin + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: g */
        public int mo3832g(View view) {
            return this.f2912a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0580p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: h */
        public int mo3833h() {
            return this.f2912a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: i */
        public int mo3834i() {
            return this.f2912a.getWidth() - this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: j */
        public int mo3835j() {
            return this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: k */
        public int mo3836k() {
            return this.f2912a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: l */
        public int mo3837l() {
            return this.f2912a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: m */
        public int mo3838m() {
            return this.f2912a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: n */
        public int mo3839n() {
            return (this.f2912a.getWidth() - this.f2912a.getPaddingLeft()) - this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: p */
        public int mo3841p(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: q */
        public int mo3842q(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: r */
        public void mo3843r(int i) {
            this.f2912a.offsetChildrenHorizontal(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$b */
    public class b extends AbstractC0614r {
        public b(RecyclerView.AbstractC0579o abstractC0579o) {
            super(abstractC0579o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: d */
        public int mo3829d(View view) {
            return this.f2912a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0580p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: e */
        public int mo3830e(View view) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0580p).topMargin + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: f */
        public int mo3831f(View view) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: g */
        public int mo3832g(View view) {
            return this.f2912a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0580p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: h */
        public int mo3833h() {
            return this.f2912a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: i */
        public int mo3834i() {
            return this.f2912a.getHeight() - this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: j */
        public int mo3835j() {
            return this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: k */
        public int mo3836k() {
            return this.f2912a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: l */
        public int mo3837l() {
            return this.f2912a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: m */
        public int mo3838m() {
            return this.f2912a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: n */
        public int mo3839n() {
            return (this.f2912a.getHeight() - this.f2912a.getPaddingTop()) - this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: p */
        public int mo3841p(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: q */
        public int mo3842q(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0614r
        /* JADX INFO: renamed from: r */
        public void mo3843r(int i) {
            this.f2912a.offsetChildrenVertical(i);
        }
    }

    public AbstractC0614r(RecyclerView.AbstractC0579o abstractC0579o) {
        this.f2913b = Integer.MIN_VALUE;
        this.f2914c = new Rect();
        this.f2912a = abstractC0579o;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0614r m3826a(RecyclerView.AbstractC0579o abstractC0579o) {
        return new a(abstractC0579o);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0614r m3827b(RecyclerView.AbstractC0579o abstractC0579o, int i) {
        if (i == 0) {
            return m3826a(abstractC0579o);
        }
        if (i == 1) {
            return m3828c(abstractC0579o);
        }
        wg3.m206174a("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0614r m3828c(RecyclerView.AbstractC0579o abstractC0579o) {
        return new b(abstractC0579o);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo3829d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo3830e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo3831f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo3832g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo3833h();

    /* JADX INFO: renamed from: i */
    public abstract int mo3834i();

    /* JADX INFO: renamed from: j */
    public abstract int mo3835j();

    /* JADX INFO: renamed from: k */
    public abstract int mo3836k();

    /* JADX INFO: renamed from: l */
    public abstract int mo3837l();

    /* JADX INFO: renamed from: m */
    public abstract int mo3838m();

    /* JADX INFO: renamed from: n */
    public abstract int mo3839n();

    /* JADX INFO: renamed from: o */
    public int m3840o() {
        if (Integer.MIN_VALUE == this.f2913b) {
            return 0;
        }
        return mo3839n() - this.f2913b;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo3841p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo3842q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo3843r(int i);

    /* JADX INFO: renamed from: s */
    public void m3844s() {
        this.f2913b = mo3839n();
    }

    public /* synthetic */ AbstractC0614r(RecyclerView.AbstractC0579o abstractC0579o, a aVar) {
        this(abstractC0579o);
    }
}
