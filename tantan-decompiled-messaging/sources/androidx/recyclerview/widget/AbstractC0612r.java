package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p149l.ig3;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0612r {

    /* JADX INFO: renamed from: a */
    public final RecyclerView.AbstractC0577o f2912a;

    /* JADX INFO: renamed from: b */
    public int f2913b;

    /* JADX INFO: renamed from: c */
    public final Rect f2914c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$a */
    public class a extends AbstractC0612r {
        public a(RecyclerView.AbstractC0577o abstractC0577o) {
            super(abstractC0577o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: d */
        public int mo3828d(View view) {
            return this.f2912a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0578p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: e */
        public int mo3829e(View view) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0578p).leftMargin + ((ViewGroup.MarginLayoutParams) c0578p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: f */
        public int mo3830f(View view) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0578p).topMargin + ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: g */
        public int mo3831g(View view) {
            return this.f2912a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0578p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: h */
        public int mo3832h() {
            return this.f2912a.getWidth();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: i */
        public int mo3833i() {
            return this.f2912a.getWidth() - this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: j */
        public int mo3834j() {
            return this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: k */
        public int mo3835k() {
            return this.f2912a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: l */
        public int mo3836l() {
            return this.f2912a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: m */
        public int mo3837m() {
            return this.f2912a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: n */
        public int mo3838n() {
            return (this.f2912a.getWidth() - this.f2912a.getPaddingLeft()) - this.f2912a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: p */
        public int mo3840p(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: q */
        public int mo3841q(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: r */
        public void mo3842r(int i) {
            this.f2912a.offsetChildrenHorizontal(i);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.r$b */
    public class b extends AbstractC0612r {
        public b(RecyclerView.AbstractC0577o abstractC0577o) {
            super(abstractC0577o, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: d */
        public int mo3828d(View view) {
            return this.f2912a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0578p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: e */
        public int mo3829e(View view) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0578p).topMargin + ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: f */
        public int mo3830f(View view) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            return this.f2912a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0578p).leftMargin + ((ViewGroup.MarginLayoutParams) c0578p).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: g */
        public int mo3831g(View view) {
            return this.f2912a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0578p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: h */
        public int mo3832h() {
            return this.f2912a.getHeight();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: i */
        public int mo3833i() {
            return this.f2912a.getHeight() - this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: j */
        public int mo3834j() {
            return this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: k */
        public int mo3835k() {
            return this.f2912a.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: l */
        public int mo3836l() {
            return this.f2912a.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: m */
        public int mo3837m() {
            return this.f2912a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: n */
        public int mo3838n() {
            return (this.f2912a.getHeight() - this.f2912a.getPaddingTop()) - this.f2912a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: p */
        public int mo3840p(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: q */
        public int mo3841q(View view) {
            this.f2912a.getTransformedBoundingBox(view, true, this.f2914c);
            return this.f2914c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0612r
        /* JADX INFO: renamed from: r */
        public void mo3842r(int i) {
            this.f2912a.offsetChildrenVertical(i);
        }
    }

    public AbstractC0612r(RecyclerView.AbstractC0577o abstractC0577o) {
        this.f2913b = Integer.MIN_VALUE;
        this.f2914c = new Rect();
        this.f2912a = abstractC0577o;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0612r m3825a(RecyclerView.AbstractC0577o abstractC0577o) {
        return new a(abstractC0577o);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0612r m3826b(RecyclerView.AbstractC0577o abstractC0577o, int i) {
        if (i == 0) {
            return m3825a(abstractC0577o);
        }
        if (i == 1) {
            return m3827c(abstractC0577o);
        }
        ig3.m135964a("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0612r m3827c(RecyclerView.AbstractC0577o abstractC0577o) {
        return new b(abstractC0577o);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo3828d(View view);

    /* JADX INFO: renamed from: e */
    public abstract int mo3829e(View view);

    /* JADX INFO: renamed from: f */
    public abstract int mo3830f(View view);

    /* JADX INFO: renamed from: g */
    public abstract int mo3831g(View view);

    /* JADX INFO: renamed from: h */
    public abstract int mo3832h();

    /* JADX INFO: renamed from: i */
    public abstract int mo3833i();

    /* JADX INFO: renamed from: j */
    public abstract int mo3834j();

    /* JADX INFO: renamed from: k */
    public abstract int mo3835k();

    /* JADX INFO: renamed from: l */
    public abstract int mo3836l();

    /* JADX INFO: renamed from: m */
    public abstract int mo3837m();

    /* JADX INFO: renamed from: n */
    public abstract int mo3838n();

    /* JADX INFO: renamed from: o */
    public int m3839o() {
        if (Integer.MIN_VALUE == this.f2913b) {
            return 0;
        }
        return mo3838n() - this.f2913b;
    }

    /* JADX INFO: renamed from: p */
    public abstract int mo3840p(View view);

    /* JADX INFO: renamed from: q */
    public abstract int mo3841q(View view);

    /* JADX INFO: renamed from: r */
    public abstract void mo3842r(int i);

    /* JADX INFO: renamed from: s */
    public void m3843s() {
        this.f2913b = mo3838n();
    }

    public /* synthetic */ AbstractC0612r(RecyclerView.AbstractC0577o abstractC0577o, a aVar) {
        this(abstractC0577o);
    }
}
