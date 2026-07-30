package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p149l.ig3;
import p149l.yfq0;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0577o implements RecyclerView.AbstractC0587y.b {

    /* JADX INFO: renamed from: b */
    public C0594d[] f2637b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public AbstractC0612r f2638c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public AbstractC0612r f2639d;

    /* JADX INFO: renamed from: e */
    public int f2640e;

    /* JADX INFO: renamed from: f */
    public int f2641f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C0607m f2642g;

    /* JADX INFO: renamed from: j */
    public BitSet f2645j;

    /* JADX INFO: renamed from: o */
    public boolean f2650o;

    /* JADX INFO: renamed from: p */
    public boolean f2651p;

    /* JADX INFO: renamed from: q */
    public SavedState f2652q;

    /* JADX INFO: renamed from: r */
    public int f2653r;

    /* JADX INFO: renamed from: w */
    public int[] f2658w;

    /* JADX INFO: renamed from: a */
    public int f2636a = -1;

    /* JADX INFO: renamed from: h */
    public boolean f2643h = false;

    /* JADX INFO: renamed from: i */
    public boolean f2644i = false;

    /* JADX INFO: renamed from: k */
    public int f2646k = -1;

    /* JADX INFO: renamed from: l */
    public int f2647l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public LazySpanLookup f2648m = new LazySpanLookup();

    /* JADX INFO: renamed from: n */
    public int f2649n = 2;

    /* JADX INFO: renamed from: s */
    public final Rect f2654s = new Rect();

    /* JADX INFO: renamed from: t */
    public final C0592b f2655t = new C0592b();

    /* JADX INFO: renamed from: u */
    public boolean f2656u = false;

    /* JADX INFO: renamed from: v */
    public boolean f2657v = true;

    /* JADX INFO: renamed from: x */
    public final Runnable f2659x = new RunnableC0591a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0591a implements Runnable {
        public RunnableC0591a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m3530i();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0592b {

        /* JADX INFO: renamed from: a */
        public int f2663a;

        /* JADX INFO: renamed from: b */
        public int f2664b;

        /* JADX INFO: renamed from: c */
        public boolean f2665c;

        /* JADX INFO: renamed from: d */
        public boolean f2666d;

        /* JADX INFO: renamed from: e */
        public boolean f2667e;

        /* JADX INFO: renamed from: f */
        public int[] f2668f;

        public C0592b() {
            m3572c();
        }

        /* JADX INFO: renamed from: a */
        public void m3570a() {
            boolean z = this.f2665c;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f2664b = z ? staggeredGridLayoutManager.f2638c.mo3833i() : staggeredGridLayoutManager.f2638c.mo3837m();
        }

        /* JADX INFO: renamed from: b */
        public void m3571b(int i) {
            boolean z = this.f2665c;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            if (z) {
                this.f2664b = staggeredGridLayoutManager.f2638c.mo3833i() - i;
            } else {
                this.f2664b = staggeredGridLayoutManager.f2638c.mo3837m() + i;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3572c() {
            this.f2663a = -1;
            this.f2664b = Integer.MIN_VALUE;
            this.f2665c = false;
            this.f2666d = false;
            this.f2667e = false;
            int[] iArr = this.f2668f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3573d(C0594d[] c0594dArr) {
            int length = c0594dArr.length;
            int[] iArr = this.f2668f;
            if (iArr == null || iArr.length < length) {
                this.f2668f = new int[StaggeredGridLayoutManager.this.f2637b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2668f[i] = c0594dArr[i].m3598u(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public class C0594d {

        /* JADX INFO: renamed from: a */
        public ArrayList<View> f2672a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f2673b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f2674c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        public int f2675d = 0;

        /* JADX INFO: renamed from: e */
        public final int f2676e;

        public C0594d(int i) {
            this.f2676e = i;
        }

        /* JADX INFO: renamed from: A */
        public void m3577A(int i) {
            this.f2673b = i;
            this.f2674c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m3578a(View view) {
            C0593c c0593cM3596s = m3596s(view);
            c0593cM3596s.f2670e = this;
            this.f2672a.add(view);
            this.f2674c = Integer.MIN_VALUE;
            if (this.f2672a.size() == 1) {
                this.f2673b = Integer.MIN_VALUE;
            }
            if (c0593cM3596s.m3411e() || c0593cM3596s.m3410d()) {
                this.f2675d += StaggeredGridLayoutManager.this.f2638c.mo3829e(view);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3579b(boolean z, int i) {
            int iM3594q = z ? m3594q(Integer.MIN_VALUE) : m3598u(Integer.MIN_VALUE);
            m3582e();
            if (iM3594q == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM3594q >= StaggeredGridLayoutManager.this.f2638c.mo3833i()) {
                if (z || iM3594q <= StaggeredGridLayoutManager.this.f2638c.mo3837m()) {
                    if (i != Integer.MIN_VALUE) {
                        iM3594q += i;
                    }
                    this.f2674c = iM3594q;
                    this.f2673b = iM3594q;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3580c() {
            LazySpanLookup.FullSpanItem fullSpanItemM3553f;
            ArrayList<View> arrayList = this.f2672a;
            View view = arrayList.get(arrayList.size() - 1);
            C0593c c0593cM3596s = m3596s(view);
            this.f2674c = StaggeredGridLayoutManager.this.f2638c.mo3828d(view);
            if (c0593cM3596s.f2671f && (fullSpanItemM3553f = StaggeredGridLayoutManager.this.f2648m.m3553f(c0593cM3596s.m3408b())) != null && fullSpanItemM3553f.mGapDir == 1) {
                this.f2674c += fullSpanItemM3553f.m3563a(this.f2676e);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3581d() {
            LazySpanLookup.FullSpanItem fullSpanItemM3553f;
            View view = this.f2672a.get(0);
            C0593c c0593cM3596s = m3596s(view);
            this.f2673b = StaggeredGridLayoutManager.this.f2638c.mo3831g(view);
            if (c0593cM3596s.f2671f && (fullSpanItemM3553f = StaggeredGridLayoutManager.this.f2648m.m3553f(c0593cM3596s.m3408b())) != null && fullSpanItemM3553f.mGapDir == -1) {
                this.f2673b -= fullSpanItemM3553f.m3563a(this.f2676e);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3582e() {
            this.f2672a.clear();
            m3599v();
            this.f2675d = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m3583f() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591n(arrayList.size() - 1, -1, true) : m3591n(0, arrayList.size(), true);
        }

        /* JADX INFO: renamed from: g */
        public int m3584g() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3590m(arrayList.size() - 1, -1, true) : m3590m(0, arrayList.size(), true);
        }

        /* JADX INFO: renamed from: h */
        public int m3585h() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591n(arrayList.size() - 1, -1, false) : m3591n(0, arrayList.size(), false);
        }

        /* JADX INFO: renamed from: i */
        public int m3586i() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591n(0, arrayList.size(), true) : m3591n(arrayList.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: j */
        public int m3587j() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3590m(0, arrayList.size(), true) : m3590m(arrayList.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: k */
        public int m3588k() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591n(0, arrayList.size(), false) : m3591n(arrayList.size() - 1, -1, false);
        }

        /* JADX INFO: renamed from: l */
        public int m3589l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iMo3837m = StaggeredGridLayoutManager.this.f2638c.mo3837m();
            int iMo3833i = StaggeredGridLayoutManager.this.f2638c.mo3833i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2672a.get(i);
                int iMo3831g = StaggeredGridLayoutManager.this.f2638c.mo3831g(view);
                int iMo3828d = StaggeredGridLayoutManager.this.f2638c.mo3828d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iMo3831g >= iMo3833i : iMo3831g > iMo3833i;
                if (!z3 ? iMo3828d > iMo3837m : iMo3828d >= iMo3837m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iMo3831g >= iMo3837m && iMo3828d <= iMo3833i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iMo3831g < iMo3837m || iMo3828d > iMo3833i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: m */
        public int m3590m(int i, int i2, boolean z) {
            return m3589l(i, i2, false, false, z);
        }

        /* JADX INFO: renamed from: n */
        public int m3591n(int i, int i2, boolean z) {
            return m3589l(i, i2, z, true, false);
        }

        /* JADX INFO: renamed from: o */
        public int m3592o() {
            return this.f2675d;
        }

        /* JADX INFO: renamed from: p */
        public int m3593p() {
            int i = this.f2674c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m3580c();
            return this.f2674c;
        }

        /* JADX INFO: renamed from: q */
        public int m3594q(int i) {
            int i2 = this.f2674c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2672a.size() == 0) {
                return i;
            }
            m3580c();
            return this.f2674c;
        }

        /* JADX INFO: renamed from: r */
        public View m3595r(int i, int i2) {
            ArrayList<View> arrayList = this.f2672a;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2672a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2643h && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2643h && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = this.f2672a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f2643h && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f2643h && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: s */
        public C0593c m3596s(View view) {
            return (C0593c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: t */
        public int m3597t() {
            int i = this.f2673b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m3581d();
            return this.f2673b;
        }

        /* JADX INFO: renamed from: u */
        public int m3598u(int i) {
            int i2 = this.f2673b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2672a.size() == 0) {
                return i;
            }
            m3581d();
            return this.f2673b;
        }

        /* JADX INFO: renamed from: v */
        public void m3599v() {
            this.f2673b = Integer.MIN_VALUE;
            this.f2674c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: w */
        public void m3600w(int i) {
            int i2 = this.f2673b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2673b = i2 + i;
            }
            int i3 = this.f2674c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2674c = i3 + i;
            }
        }

        /* JADX INFO: renamed from: x */
        public void m3601x() {
            int size = this.f2672a.size();
            View viewRemove = this.f2672a.remove(size - 1);
            C0593c c0593cM3596s = m3596s(viewRemove);
            c0593cM3596s.f2670e = null;
            if (c0593cM3596s.m3411e() || c0593cM3596s.m3410d()) {
                this.f2675d -= StaggeredGridLayoutManager.this.f2638c.mo3829e(viewRemove);
            }
            if (size == 1) {
                this.f2673b = Integer.MIN_VALUE;
            }
            this.f2674c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: y */
        public void m3602y() {
            View viewRemove = this.f2672a.remove(0);
            C0593c c0593cM3596s = m3596s(viewRemove);
            c0593cM3596s.f2670e = null;
            if (this.f2672a.size() == 0) {
                this.f2674c = Integer.MIN_VALUE;
            }
            if (c0593cM3596s.m3411e() || c0593cM3596s.m3410d()) {
                this.f2675d -= StaggeredGridLayoutManager.this.f2638c.mo3829e(viewRemove);
            }
            this.f2673b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: z */
        public void m3603z(View view) {
            C0593c c0593cM3596s = m3596s(view);
            c0593cM3596s.f2670e = this;
            this.f2672a.add(0, view);
            this.f2673b = Integer.MIN_VALUE;
            if (this.f2672a.size() == 1) {
                this.f2674c = Integer.MIN_VALUE;
            }
            if (c0593cM3596s.m3411e() || c0593cM3596s.m3410d()) {
                this.f2675d += StaggeredGridLayoutManager.this.f2638c.mo3829e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0577o.d properties = RecyclerView.AbstractC0577o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2587a);
        m3515W(properties.f2588b);
        setReverseLayout(properties.f2589c);
        this.f2642g = new C0607m();
        m3534m();
    }

    /* JADX INFO: renamed from: K */
    private void m3493K(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.f2654s);
        C0593c c0593c = (C0593c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0593c).leftMargin;
        Rect rect = this.f2654s;
        int iM3526e0 = m3526e0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c0593c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0593c).topMargin;
        Rect rect2 = this.f2654s;
        int iM3526e1 = m3526e0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c0593c).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, iM3526e0, iM3526e1, c0593c) : shouldMeasureChild(view, iM3526e0, iM3526e1, c0593c)) {
            view.measure(iM3526e0, iM3526e1);
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.f2640e != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2640e != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f2640e == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f2640e == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f2640e == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f2640e == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: A */
    public int m3494A() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: B */
    public final int m3495B(int i) {
        int iM3594q = this.f2637b[0].m3594q(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3594q2 = this.f2637b[i2].m3594q(i);
            if (iM3594q2 > iM3594q) {
                iM3594q = iM3594q2;
            }
        }
        return iM3594q;
    }

    /* JADX INFO: renamed from: C */
    public final int m3496C(int i) {
        int iM3598u = this.f2637b[0].m3598u(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3598u2 = this.f2637b[i2].m3598u(i);
            if (iM3598u2 > iM3598u) {
                iM3598u = iM3598u2;
            }
        }
        return iM3598u;
    }

    /* JADX INFO: renamed from: D */
    public final int m3497D(int i) {
        int iM3594q = this.f2637b[0].m3594q(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3594q2 = this.f2637b[i2].m3594q(i);
            if (iM3594q2 < iM3594q) {
                iM3594q = iM3594q2;
            }
        }
        return iM3594q;
    }

    /* JADX INFO: renamed from: E */
    public final int m3498E(int i) {
        int iM3598u = this.f2637b[0].m3598u(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3598u2 = this.f2637b[i2].m3598u(i);
            if (iM3598u2 < iM3598u) {
                iM3598u = iM3598u2;
            }
        }
        return iM3598u;
    }

    /* JADX INFO: renamed from: F */
    public final C0594d m3499F(C0607m c0607m) {
        int i;
        int i2;
        int i3;
        boolean zM3506N = m3506N(c0607m.f2903e);
        int i4 = this.f2636a;
        if (zM3506N) {
            i2 = i4 - 1;
            i3 = -1;
            i = -1;
        } else {
            i = i4;
            i2 = 0;
            i3 = 1;
        }
        int i5 = c0607m.f2903e;
        AbstractC0612r abstractC0612r = this.f2638c;
        C0594d c0594d = null;
        if (i5 == 1) {
            int iMo3837m = abstractC0612r.mo3837m();
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i2 != i) {
                C0594d c0594d2 = this.f2637b[i2];
                int iM3594q = c0594d2.m3594q(iMo3837m);
                if (iM3594q < i6) {
                    c0594d = c0594d2;
                    i6 = iM3594q;
                }
                i2 += i3;
            }
            return c0594d;
        }
        int iMo3833i = abstractC0612r.mo3833i();
        int i7 = Integer.MIN_VALUE;
        while (i2 != i) {
            C0594d c0594d3 = this.f2637b[i2];
            int iM3598u = c0594d3.m3598u(iMo3833i);
            if (iM3598u > i7) {
                c0594d = c0594d3;
                i7 = iM3598u;
            }
            i2 += i3;
        }
        return c0594d;
    }

    /* JADX INFO: renamed from: G */
    public int m3500G() {
        return this.f2636a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public final void m3501H(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM3494A;
        int iM3494A2 = this.f2644i ? m3494A() : m3547z();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.f2648m.m3555h(i5);
            if (i3 != 1) {
                this.f2648m.m3557j(i, i2);
            } else if (i3 != 2) {
                this.f2648m.m3558k(i, i2);
            } else if (i3 == 8) {
                this.f2648m.m3558k(i, 1);
                this.f2648m.m3557j(i2, 1);
            }
            if (i4 <= iM3494A2) {
                return;
            }
            if (this.f2644i) {
                iM3494A = m3547z();
            } else {
                iM3494A = m3494A();
            }
            if (i5 <= iM3494A) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.f2648m.m3555h(i5);
        if (i3 != 1) {
            this.f2648m.m3557j(i, i2);
        } else if (i3 != 2) {
            this.f2648m.m3558k(i, i2);
        } else if (i3 == 8) {
            this.f2648m.m3558k(i, 1);
            this.f2648m.m3557j(i2, 1);
        }
        if (i4 <= iM3494A2) {
            return;
        }
        if (this.f2644i) {
            iM3494A = m3547z();
        } else {
            iM3494A = m3494A();
        }
        if (i5 <= iM3494A) {
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    public View m3502I() {
        int i;
        View childAt;
        boolean z;
        AbstractC0612r abstractC0612r;
        int iMo3831g;
        int iMo3831g2;
        boolean z2;
        boolean z3;
        int iMo3828d;
        int iMo3828d2;
        int childCount = getChildCount();
        int i2 = childCount - 1;
        BitSet bitSet = new BitSet(this.f2636a);
        bitSet.set(0, this.f2636a, true);
        byte b = (this.f2640e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f2644i) {
            childCount = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < childCount ? 1 : -1;
        while (i2 != childCount) {
            View childAt2 = getChildAt(i2);
            C0593c c0593c = (C0593c) childAt2.getLayoutParams();
            if (!bitSet.get(c0593c.f2670e.f2676e)) {
                if (!c0593c.f2671f && (i = i2 + i3) != childCount) {
                    childAt = getChildAt(i);
                    z = this.f2644i;
                    abstractC0612r = this.f2638c;
                    if (z) {
                        iMo3828d = abstractC0612r.mo3828d(childAt2);
                        iMo3828d2 = this.f2638c.mo3828d(childAt);
                        if (iMo3828d >= iMo3828d2) {
                            if (iMo3828d == iMo3828d2) {
                                if (c0593c.f2670e.f2676e - ((C0593c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo3831g = abstractC0612r.mo3831g(childAt2);
                        iMo3831g2 = this.f2638c.mo3831g(childAt);
                        if (iMo3831g <= iMo3831g2) {
                            if (iMo3831g == iMo3831g2) {
                                if (c0593c.f2670e.f2676e - ((C0593c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2 += i3;
            } else if (!m3531j(c0593c.f2670e)) {
                bitSet.clear(c0593c.f2670e.f2676e);
                if (!c0593c.f2671f) {
                    childAt = getChildAt(i);
                    z = this.f2644i;
                    abstractC0612r = this.f2638c;
                    if (z) {
                        iMo3828d = abstractC0612r.mo3828d(childAt2);
                        iMo3828d2 = this.f2638c.mo3828d(childAt);
                        if (iMo3828d >= iMo3828d2) {
                            if (iMo3828d == iMo3828d2) {
                                if (c0593c.f2670e.f2676e - ((C0593c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iMo3831g = abstractC0612r.mo3831g(childAt2);
                        iMo3831g2 = this.f2638c.mo3831g(childAt);
                        if (iMo3831g <= iMo3831g2) {
                            if (iMo3831g == iMo3831g2) {
                                if (c0593c.f2670e.f2676e - ((C0593c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (b < 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i2 += i3;
            }
            return childAt2;
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void m3503J() {
        this.f2648m.m3549b();
        requestLayout();
    }

    /* JADX INFO: renamed from: L */
    public final void m3504L(View view, C0593c c0593c, boolean z) {
        boolean z2 = c0593c.f2671f;
        int i = this.f2640e;
        if (z2) {
            if (i == 1) {
                m3493K(view, this.f2653r, RecyclerView.AbstractC0577o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0593c).height, true), z);
                return;
            } else {
                m3493K(view, RecyclerView.AbstractC0577o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0593c).width, true), this.f2653r, z);
                return;
            }
        }
        if (i == 1) {
            m3493K(view, RecyclerView.AbstractC0577o.getChildMeasureSpec(this.f2641f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) c0593c).width, false), RecyclerView.AbstractC0577o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0593c).height, true), z);
        } else {
            m3493K(view, RecyclerView.AbstractC0577o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0593c).width, true), RecyclerView.AbstractC0577o.getChildMeasureSpec(this.f2641f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c0593c).height, false), z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX INFO: renamed from: M */
    public final void m3505M(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        boolean z2;
        SavedState savedState;
        C0592b c0592b = this.f2655t;
        if (!(this.f2652q == null && this.f2646k == -1) && c0588z.m3487c() == 0) {
            removeAndRecycleAllViews(c0584v);
            c0592b.m3572c();
            return;
        }
        boolean z3 = (c0592b.f2667e && this.f2646k == -1 && this.f2652q == null) ? false : true;
        if (z3) {
            c0592b.m3572c();
            if (this.f2652q != null) {
                m3522c(c0592b);
            } else {
                resolveShouldLayoutReverse();
                c0592b.f2665c = this.f2644i;
            }
            m3520a0(c0588z, c0592b);
            c0592b.f2667e = true;
        }
        if (this.f2652q == null && this.f2646k == -1 && (c0592b.f2665c != this.f2650o || isLayoutRTL() != this.f2651p)) {
            this.f2648m.m3549b();
            c0592b.f2666d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f2652q) == null || savedState.mSpanOffsetsSize < 1)) {
            if (c0592b.f2666d) {
                for (int i = 0; i < this.f2636a; i++) {
                    this.f2637b[i].m3582e();
                    int i2 = c0592b.f2664b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f2637b[i].m3577A(i2);
                    }
                }
            } else if (z3 || this.f2655t.f2668f == null) {
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3579b(this.f2644i, c0592b.f2664b);
                }
                this.f2655t.m3573d(this.f2637b);
            } else {
                for (int i4 = 0; i4 < this.f2636a; i4++) {
                    C0594d c0594d = this.f2637b[i4];
                    c0594d.m3582e();
                    c0594d.m3577A(this.f2655t.f2668f[i4]);
                }
            }
        }
        detachAndScrapAttachedViews(c0584v);
        this.f2642g.f2899a = false;
        this.f2656u = false;
        m3523c0(this.f2639d.mo3838n());
        m3521b0(c0592b.f2663a, c0588z);
        if (c0592b.f2665c) {
            m3514V(-1);
            m3535n(c0584v, this.f2642g, c0588z);
            m3514V(1);
            C0607m c0607m = this.f2642g;
            c0607m.f2901c = c0592b.f2663a + c0607m.f2902d;
            m3535n(c0584v, c0607m, c0588z);
        } else {
            m3514V(1);
            m3535n(c0584v, this.f2642g, c0588z);
            m3514V(-1);
            C0607m c0607m2 = this.f2642g;
            c0607m2.f2901c = c0592b.f2663a + c0607m2.f2902d;
            m3535n(c0584v, c0607m2, c0588z);
        }
        m3512T();
        if (getChildCount() > 0) {
            if (this.f2644i) {
                m3545x(c0584v, c0588z, true);
                m3546y(c0584v, c0588z, false);
            } else {
                m3546y(c0584v, c0588z, true);
                m3545x(c0584v, c0588z, false);
            }
        }
        if (z && !c0588z.m3490f() && this.f2649n != 0 && getChildCount() > 0 && (this.f2656u || m3502I() != null)) {
            removeCallbacks(this.f2659x);
            z2 = m3530i();
        }
        if (c0588z.m3490f()) {
            this.f2655t.m3572c();
        }
        this.f2650o = c0592b.f2665c;
        this.f2651p = isLayoutRTL();
        if (z2) {
            this.f2655t.m3572c();
            m3505M(c0584v, c0588z, false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m3506N(int i) {
        if (this.f2640e == 0) {
            return (i == -1) != this.f2644i;
        }
        return ((i == -1) == this.f2644i) == isLayoutRTL();
    }

    /* JADX INFO: renamed from: O */
    public void m3507O(int i, RecyclerView.C0588z c0588z) {
        int iM3547z;
        int i2;
        if (i > 0) {
            iM3547z = m3494A();
            i2 = 1;
        } else {
            iM3547z = m3547z();
            i2 = -1;
        }
        this.f2642g.f2899a = true;
        m3521b0(iM3547z, c0588z);
        m3514V(i2);
        C0607m c0607m = this.f2642g;
        c0607m.f2901c = iM3547z + c0607m.f2902d;
        c0607m.f2900b = Math.abs(i);
    }

    /* JADX INFO: renamed from: P */
    public final void m3508P(View view) {
        for (int i = this.f2636a - 1; i >= 0; i--) {
            this.f2637b[i].m3603z(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3509Q(RecyclerView.C0584v c0584v, C0607m c0607m) {
        if (!c0607m.f2899a || c0607m.f2907i) {
            return;
        }
        int i = c0607m.f2900b;
        int i2 = c0607m.f2903e;
        if (i == 0) {
            if (i2 == -1) {
                m3510R(c0584v, c0607m.f2905g);
                return;
            } else {
                m3511S(c0584v, c0607m.f2904f);
                return;
            }
        }
        if (i2 != -1) {
            int iM3497D = m3497D(c0607m.f2905g) - c0607m.f2905g;
            int iMin = c0607m.f2904f;
            if (iM3497D >= 0) {
                iMin += Math.min(iM3497D, c0607m.f2900b);
            }
            m3511S(c0584v, iMin);
            return;
        }
        int i3 = c0607m.f2904f;
        int iM3496C = i3 - m3496C(i3);
        int iMin2 = c0607m.f2905g;
        if (iM3496C >= 0) {
            iMin2 -= Math.min(iM3496C, c0607m.f2900b);
        }
        m3510R(c0584v, iMin2);
    }

    /* JADX INFO: renamed from: R */
    public final void m3510R(RecyclerView.C0584v c0584v, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2638c.mo3831g(childAt) < i || this.f2638c.mo3841q(childAt) < i) {
                return;
            }
            C0593c c0593c = (C0593c) childAt.getLayoutParams();
            if (c0593c.f2671f) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    if (this.f2637b[i2].f2672a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3601x();
                }
            } else if (c0593c.f2670e.f2672a.size() == 1) {
                return;
            } else {
                c0593c.f2670e.m3601x();
            }
            removeAndRecycleView(childAt, c0584v);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3511S(RecyclerView.C0584v c0584v, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2638c.mo3828d(childAt) > i || this.f2638c.mo3840p(childAt) > i) {
                return;
            }
            C0593c c0593c = (C0593c) childAt.getLayoutParams();
            if (c0593c.f2671f) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    if (this.f2637b[i2].f2672a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3602y();
                }
            } else if (c0593c.f2670e.f2672a.size() == 1) {
                return;
            } else {
                c0593c.f2670e.m3602y();
            }
            removeAndRecycleView(childAt, c0584v);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m3512T() {
        if (this.f2639d.mo3835k() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float fMo3829e = this.f2639d.mo3829e(childAt);
            if (fMo3829e >= fMax) {
                if (((C0593c) childAt.getLayoutParams()).m3575h()) {
                    fMo3829e = (fMo3829e * 1.0f) / this.f2636a;
                }
                fMax = Math.max(fMax, fMo3829e);
            }
        }
        int i2 = this.f2641f;
        int iRound = Math.round(fMax * this.f2636a);
        if (this.f2639d.mo3835k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f2639d.mo3838n());
        }
        m3523c0(iRound);
        if (this.f2641f == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0593c c0593c = (C0593c) childAt2.getLayoutParams();
            if (!c0593c.f2671f) {
                if (isLayoutRTL() && this.f2640e == 1) {
                    int i4 = this.f2636a;
                    int i5 = c0593c.f2670e.f2676e;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f2641f) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c0593c.f2670e.f2676e;
                    int i7 = this.f2641f * i6;
                    int i8 = i6 * i2;
                    if (this.f2640e == 1) {
                        childAt2.offsetLeftAndRight(i7 - i8);
                    } else {
                        childAt2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m3513U(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f2649n) {
            return;
        }
        if (i != 0 && i != 2) {
            ig3.m135964a("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        } else {
            this.f2649n = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3514V(int i) {
        C0607m c0607m = this.f2642g;
        c0607m.f2903e = i;
        c0607m.f2902d = this.f2644i != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: W */
    public void m3515W(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f2636a) {
            m3503J();
            this.f2636a = i;
            this.f2645j = new BitSet(this.f2636a);
            this.f2637b = new C0594d[this.f2636a];
            for (int i2 = 0; i2 < this.f2636a; i2++) {
                this.f2637b[i2] = new C0594d(i2);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m3516X(int i, int i2) {
        for (int i3 = 0; i3 < this.f2636a; i3++) {
            if (!this.f2637b[i3].f2672a.isEmpty()) {
                m3524d0(this.f2637b[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m3517Y(RecyclerView.C0588z c0588z, C0592b c0592b) {
        c0592b.f2663a = this.f2650o ? m3543v(c0588z.m3487c()) : m3537p(c0588z.m3487c());
        c0592b.f2664b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m3518Z(RecyclerView.C0588z c0588z, C0592b c0592b) {
        int i;
        if (!c0588z.m3490f() && (i = this.f2646k) != -1) {
            if (i >= 0 && i < c0588z.m3487c()) {
                SavedState savedState = this.f2652q;
                if (savedState == null || savedState.mAnchorPosition == -1 || savedState.mSpanOffsetsSize < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f2646k);
                    if (viewFindViewByPosition != null) {
                        c0592b.f2663a = this.f2644i ? m3494A() : m3547z();
                        if (this.f2647l != Integer.MIN_VALUE) {
                            boolean z = c0592b.f2665c;
                            AbstractC0612r abstractC0612r = this.f2638c;
                            if (z) {
                                c0592b.f2664b = (abstractC0612r.mo3833i() - this.f2647l) - this.f2638c.mo3828d(viewFindViewByPosition);
                            } else {
                                c0592b.f2664b = (abstractC0612r.mo3837m() + this.f2647l) - this.f2638c.mo3831g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f2638c.mo3829e(viewFindViewByPosition) > this.f2638c.mo3838n()) {
                            boolean z2 = c0592b.f2665c;
                            AbstractC0612r abstractC0612r2 = this.f2638c;
                            c0592b.f2664b = z2 ? abstractC0612r2.mo3833i() : abstractC0612r2.mo3837m();
                            return true;
                        }
                        int iMo3831g = this.f2638c.mo3831g(viewFindViewByPosition) - this.f2638c.mo3837m();
                        if (iMo3831g < 0) {
                            c0592b.f2664b = -iMo3831g;
                            return true;
                        }
                        int iMo3833i = this.f2638c.mo3833i() - this.f2638c.mo3828d(viewFindViewByPosition);
                        if (iMo3833i < 0) {
                            c0592b.f2664b = iMo3833i;
                            return true;
                        }
                        c0592b.f2664b = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.f2646k;
                        c0592b.f2663a = i2;
                        int i3 = this.f2647l;
                        if (i3 == Integer.MIN_VALUE) {
                            c0592b.f2665c = m3529h(i2) == 1;
                            c0592b.m3570a();
                        } else {
                            c0592b.m3571b(i3);
                        }
                        c0592b.f2666d = true;
                    }
                } else {
                    c0592b.f2664b = Integer.MIN_VALUE;
                    c0592b.f2663a = this.f2646k;
                }
                return true;
            }
            this.f2646k = -1;
            this.f2647l = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3519a(View view) {
        for (int i = this.f2636a - 1; i >= 0; i--) {
            this.f2637b[i].m3578a(view);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3520a0(RecyclerView.C0588z c0588z, C0592b c0592b) {
        if (m3518Z(c0588z, c0592b) || m3517Y(c0588z, c0592b)) {
            return;
        }
        c0592b.m3570a();
        c0592b.f2663a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f2652q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3521b0(int i, RecyclerView.C0588z c0588z) {
        int iMo3838n;
        int iMo3838n2;
        int iM3488d;
        C0607m c0607m = this.f2642g;
        boolean z = false;
        c0607m.f2900b = 0;
        c0607m.f2901c = i;
        if (!isSmoothScrolling() || (iM3488d = c0588z.m3488d()) == -1) {
            iMo3838n = 0;
            iMo3838n2 = 0;
        } else {
            boolean z2 = this.f2644i;
            boolean z3 = iM3488d < i;
            AbstractC0612r abstractC0612r = this.f2638c;
            if (z2 == z3) {
                iMo3838n = abstractC0612r.mo3838n();
                iMo3838n2 = 0;
            } else {
                iMo3838n2 = abstractC0612r.mo3838n();
                iMo3838n = 0;
            }
        }
        boolean clipToPadding = getClipToPadding();
        C0607m c0607m2 = this.f2642g;
        if (clipToPadding) {
            c0607m2.f2904f = this.f2638c.mo3837m() - iMo3838n2;
            this.f2642g.f2905g = this.f2638c.mo3833i() + iMo3838n;
        } else {
            c0607m2.f2905g = this.f2638c.mo3832h() + iMo3838n;
            this.f2642g.f2904f = -iMo3838n2;
        }
        C0607m c0607m3 = this.f2642g;
        c0607m3.f2906h = false;
        c0607m3.f2899a = true;
        if (this.f2638c.mo3835k() == 0 && this.f2638c.mo3832h() == 0) {
            z = true;
        }
        c0607m3.f2907i = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m3522c(C0592b c0592b) {
        SavedState savedState = this.f2652q;
        int i = savedState.mSpanOffsetsSize;
        if (i > 0) {
            if (i == this.f2636a) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    this.f2637b[i2].m3582e();
                    SavedState savedState2 = this.f2652q;
                    int iMo3833i = savedState2.mSpanOffsets[i2];
                    if (iMo3833i != Integer.MIN_VALUE) {
                        boolean z = savedState2.mAnchorLayoutFromEnd;
                        AbstractC0612r abstractC0612r = this.f2638c;
                        iMo3833i += z ? abstractC0612r.mo3833i() : abstractC0612r.mo3837m();
                    }
                    this.f2637b[i2].m3577A(iMo3833i);
                }
            } else {
                savedState.m3567b();
                SavedState savedState3 = this.f2652q;
                savedState3.mAnchorPosition = savedState3.mVisibleAnchorPosition;
            }
        }
        SavedState savedState4 = this.f2652q;
        this.f2651p = savedState4.mLastLayoutRTL;
        setReverseLayout(savedState4.mReverseLayout);
        resolveShouldLayoutReverse();
        SavedState savedState5 = this.f2652q;
        int i3 = savedState5.mAnchorPosition;
        if (i3 != -1) {
            this.f2646k = i3;
            c0592b.f2665c = savedState5.mAnchorLayoutFromEnd;
        } else {
            c0592b.f2665c = this.f2644i;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.f2648m;
            lazySpanLookup.f2660a = savedState5.mSpanLookup;
            lazySpanLookup.f2661b = savedState5.mFullSpanItems;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m3523c0(int i) {
        this.f2641f = i / this.f2636a;
        this.f2653r = View.MeasureSpec.makeMeasureSpec(i, this.f2639d.mo3835k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return this.f2640e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return this.f2640e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean checkLayoutParams(RecyclerView.C0578p c0578p) {
        return c0578p instanceof C0593c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0577o.c cVar) {
        int iM3594q;
        int iM3598u;
        if (this.f2640e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m3507O(i, c0588z);
        int[] iArr = this.f2658w;
        if (iArr == null || iArr.length < this.f2636a) {
            this.f2658w = new int[this.f2636a];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2636a; i4++) {
            C0607m c0607m = this.f2642g;
            if (c0607m.f2902d == -1) {
                iM3594q = c0607m.f2904f;
                iM3598u = this.f2637b[i4].m3598u(iM3594q);
            } else {
                iM3594q = this.f2637b[i4].m3594q(c0607m.f2905g);
                iM3598u = this.f2642g.f2905g;
            }
            int i5 = iM3594q - iM3598u;
            if (i5 >= 0) {
                this.f2658w[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f2658w, 0, i3);
        for (int i6 = 0; i6 < i3 && this.f2642g.m3808a(c0588z); i6++) {
            cVar.mo3406a(this.f2642g.f2901c, this.f2658w[i6]);
            C0607m c0607m2 = this.f2642g;
            c0607m2.f2901c += c0607m2.f2902d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeHorizontalScrollExtent(RecyclerView.C0588z c0588z) {
        return computeScrollExtent(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeHorizontalScrollOffset(RecyclerView.C0588z c0588z) {
        return computeScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeHorizontalScrollRange(RecyclerView.C0588z c0588z) {
        return computeScrollRange(c0588z);
    }

    public final int computeScrollExtent(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0615u.m3854a(c0588z, this.f2638c, m3539r(!this.f2657v), m3538q(!this.f2657v), this, this.f2657v);
    }

    public final int computeScrollOffset(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0615u.m3855b(c0588z, this.f2638c, m3539r(!this.f2657v), m3538q(!this.f2657v), this, this.f2657v, this.f2644i);
    }

    public final int computeScrollRange(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0615u.m3856c(c0588z, this.f2638c, m3539r(!this.f2657v), m3538q(!this.f2657v), this, this.f2657v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM3529h = m3529h(i);
        PointF pointF = new PointF();
        if (iM3529h == 0) {
            return null;
        }
        if (this.f2640e == 0) {
            pointF.x = iM3529h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM3529h;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollExtent(RecyclerView.C0588z c0588z) {
        return computeScrollExtent(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollOffset(RecyclerView.C0588z c0588z) {
        return computeScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollRange(RecyclerView.C0588z c0588z) {
        return computeScrollRange(c0588z);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3524d0(C0594d c0594d, int i, int i2) {
        int iM3592o = c0594d.m3592o();
        if (i == -1) {
            if (c0594d.m3597t() + iM3592o <= i2) {
                this.f2645j.set(c0594d.f2676e, false);
            }
        } else if (c0594d.m3593p() - iM3592o >= i2) {
            this.f2645j.set(c0594d.f2676e, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m3525e() {
        int iM3594q = this.f2637b[0].m3594q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2636a; i++) {
            if (this.f2637b[i].m3594q(Integer.MIN_VALUE) != iM3594q) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m3526e0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3527f() {
        int iM3598u = this.f2637b[0].m3598u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2636a; i++) {
            if (this.f2637b[i].m3598u(Integer.MIN_VALUE) != iM3598u) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3528g(View view, C0593c c0593c, C0607m c0607m) {
        if (c0607m.f2903e == 1) {
            if (c0593c.f2671f) {
                m3519a(view);
                return;
            } else {
                c0593c.f2670e.m3578a(view);
                return;
            }
        }
        if (c0593c.f2671f) {
            m3508P(view);
        } else {
            c0593c.f2670e.m3603z(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return this.f2640e == 0 ? new C0593c(-2, -1) : new C0593c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0593c((ViewGroup.MarginLayoutParams) layoutParams) : new C0593c(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public final int m3529h(int i) {
        if (getChildCount() == 0) {
            return this.f2644i ? 1 : -1;
        }
        return (i < m3547z()) != this.f2644i ? -1 : 1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3530i() {
        int iM3547z;
        int iM3494A;
        if (getChildCount() == 0 || this.f2649n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f2644i) {
            iM3547z = m3494A();
            iM3494A = m3547z();
        } else {
            iM3547z = m3547z();
            iM3494A = m3494A();
        }
        if (iM3547z == 0 && m3502I() != null) {
            this.f2648m.m3549b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f2656u) {
            return false;
        }
        int i = this.f2644i ? -1 : 1;
        int i2 = iM3494A + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM3552e = this.f2648m.m3552e(iM3547z, i2, i, true);
        if (fullSpanItemM3552e == null) {
            this.f2656u = false;
            this.f2648m.m3551d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM3552e2 = this.f2648m.m3552e(iM3547z, fullSpanItemM3552e.mPosition, i * (-1), true);
        LazySpanLookup lazySpanLookup = this.f2648m;
        if (fullSpanItemM3552e2 == null) {
            lazySpanLookup.m3551d(fullSpanItemM3552e.mPosition);
        } else {
            lazySpanLookup.m3551d(fullSpanItemM3552e2.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean isAutoMeasureEnabled() {
        return this.f2649n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3531j(C0594d c0594d) {
        boolean z;
        if (!this.f2644i) {
            if (c0594d.m3597t() > this.f2638c.mo3837m()) {
                z = c0594d.m3596s(c0594d.f2672a.get(0)).f2671f;
                return !z;
            }
            return false;
        }
        if (c0594d.m3593p() < this.f2638c.mo3833i()) {
            ArrayList<View> arrayList = c0594d.f2672a;
            z = c0594d.m3596s(arrayList.get(arrayList.size() - 1)).f2671f;
            return !z;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final LazySpanLookup.FullSpanItem m3532k(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f2636a];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            fullSpanItem.mGapPerSpan[i2] = i - this.f2637b[i2].m3594q(i);
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: l */
    public final LazySpanLookup.FullSpanItem m3533l(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f2636a];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            fullSpanItem.mGapPerSpan[i2] = this.f2637b[i2].m3598u(i) - i;
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: m */
    public final void m3534m() {
        this.f2638c = AbstractC0612r.m3826b(this, this.f2640e);
        this.f2639d = AbstractC0612r.m3826b(this, 1 - this.f2640e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: n */
    public final int m3535n(RecyclerView.C0584v c0584v, C0607m c0607m, RecyclerView.C0588z c0588z) {
        int i;
        int iM3495B;
        C0594d c0594dM3499F;
        int iM3498E;
        int iMo3829e;
        int iMo3837m;
        int iMo3829e2;
        ?? r0;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.f2645j.set(0, staggeredGridLayoutManager.f2636a, true);
        if (staggeredGridLayoutManager.f2642g.f2907i) {
            i = c0607m.f2903e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            i = c0607m.f2903e == 1 ? c0607m.f2905g + c0607m.f2900b : c0607m.f2904f - c0607m.f2900b;
        }
        int i2 = i;
        staggeredGridLayoutManager.m3516X(c0607m.f2903e, i2);
        boolean z = staggeredGridLayoutManager.f2644i;
        AbstractC0612r abstractC0612r = staggeredGridLayoutManager.f2638c;
        int iMo3833i = z ? abstractC0612r.mo3833i() : abstractC0612r.mo3837m();
        boolean z2 = false;
        ?? r1 = staggeredGridLayoutManager;
        while (c0607m.m3808a(c0588z) && (r1.f2642g.f2907i || !r1.f2645j.isEmpty())) {
            View viewM3809b = c0607m.m3809b(c0584v);
            C0593c c0593c = (C0593c) viewM3809b.getLayoutParams();
            int iM3408b = c0593c.m3408b();
            int iM3554g = r1.f2648m.m3554g(iM3408b);
            ?? r5 = iM3554g == -1 ? 1 : r8;
            if (r5 != 0) {
                c0594dM3499F = c0593c.f2671f ? r1.f2637b[r8] : r1.m3499F(c0607m);
                r1.f2648m.m3561n(iM3408b, c0594dM3499F);
            } else {
                c0594dM3499F = r1.f2637b[iM3554g];
            }
            C0594d c0594d = c0594dM3499F;
            c0593c.f2670e = c0594d;
            if (c0607m.f2903e == 1) {
                r1.addView(viewM3809b);
            } else {
                r1.addView(viewM3809b, r8);
            }
            r1.m3504L(viewM3809b, c0593c, r8);
            int i3 = c0607m.f2903e;
            boolean z3 = c0593c.f2671f;
            if (i3 == 1) {
                iMo3829e = z3 ? r1.m3495B(iMo3833i) : c0594d.m3594q(iMo3833i);
                iM3498E = r1.f2638c.mo3829e(viewM3809b) + iMo3829e;
                if (r5 != 0 && c0593c.f2671f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3532k = r1.m3532k(iMo3829e);
                    fullSpanItemM3532k.mGapDir = -1;
                    fullSpanItemM3532k.mPosition = iM3408b;
                    r1.f2648m.m3548a(fullSpanItemM3532k);
                }
            } else {
                iM3498E = z3 ? r1.m3498E(iMo3833i) : c0594d.m3598u(iMo3833i);
                iMo3829e = iM3498E - r1.f2638c.mo3829e(viewM3809b);
                if (r5 != 0 && c0593c.f2671f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3533l = r1.m3533l(iM3498E);
                    fullSpanItemM3533l.mGapDir = 1;
                    fullSpanItemM3533l.mPosition = iM3408b;
                    r1.f2648m.m3548a(fullSpanItemM3533l);
                }
            }
            if (c0593c.f2671f && c0607m.f2902d == -1) {
                if (r5 != 0) {
                    r1.f2656u = true;
                } else {
                    if (!(c0607m.f2903e == 1 ? r1.m3525e() : r1.m3527f())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM3553f = r1.f2648m.m3553f(iM3408b);
                        if (fullSpanItemM3553f != null) {
                            fullSpanItemM3553f.mHasUnwantedGapAfter = true;
                        }
                        r1.f2656u = true;
                    }
                }
            }
            r1.m3528g(viewM3809b, c0593c, c0607m);
            if (r1.isLayoutRTL() && r1.f2640e == 1) {
                boolean z4 = c0593c.f2671f;
                AbstractC0612r abstractC0612r2 = r1.f2639d;
                iMo3829e2 = z4 ? abstractC0612r2.mo3833i() : abstractC0612r2.mo3833i() - (((r1.f2636a - 1) - c0594d.f2676e) * r1.f2641f);
                iMo3837m = iMo3829e2 - r1.f2639d.mo3829e(viewM3809b);
            } else {
                iMo3837m = c0593c.f2671f ? r1.f2639d.mo3837m() : (c0594d.f2676e * r1.f2641f) + r1.f2639d.mo3837m();
                iMo3829e2 = r1.f2639d.mo3829e(viewM3809b) + iMo3837m;
            }
            int i4 = iMo3829e2;
            int i5 = iMo3837m;
            if (r1.f2640e == 1) {
                r1.layoutDecoratedWithMargins(viewM3809b, i5, iMo3829e, i4, iM3498E);
                r0 = this;
            } else {
                r1.layoutDecoratedWithMargins(viewM3809b, iMo3829e, i5, iM3498E, i4);
                r0 = r1;
            }
            boolean z5 = c0593c.f2671f;
            C0607m c0607m2 = r0.f2642g;
            if (z5) {
                r0.m3516X(c0607m2.f2903e, i2);
            } else {
                r0.m3524d0(c0594d, c0607m2.f2903e, i2);
            }
            r0.m3509Q(c0584v, r0.f2642g);
            if (r0.f2642g.f2906h && viewM3809b.hasFocusable()) {
                boolean z6 = c0593c.f2671f;
                BitSet bitSet = r0.f2645j;
                if (z6) {
                    bitSet.clear();
                } else {
                    bitSet.set(c0594d.f2676e, false);
                }
            }
            z2 = true;
            r8 = 0;
            r1 = r0;
        }
        if (!z2) {
            r1.m3509Q(c0584v, r1.f2642g);
        }
        int i6 = r1.f2642g.f2903e;
        AbstractC0612r abstractC0612r3 = r1.f2638c;
        if (i6 == -1) {
            iM3495B = r1.f2638c.mo3837m() - r1.m3498E(abstractC0612r3.mo3837m());
        } else {
            iM3495B = r1.m3495B(abstractC0612r3.mo3833i()) - r1.f2638c.mo3833i();
        }
        if (iM3495B > 0) {
            return Math.min(c0607m.f2900b, iM3495B);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int[] m3536o(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            yfq0.m214580a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3583f();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            this.f2637b[i2].m3600w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            this.f2637b[i2].m3600w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f2648m.m3549b();
        for (int i = 0; i < this.f2636a; i++) {
            this.f2637b[i].m3582e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0584v c0584v) {
        super.onDetachedFromWindow(recyclerView, c0584v);
        removeCallbacks(this.f2659x);
        for (int i = 0; i < this.f2636a; i++) {
            this.f2637b[i].m3582e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        View viewFindContainingItemView;
        View viewM3595r;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C0593c c0593c = (C0593c) viewFindContainingItemView.getLayoutParams();
        boolean z = c0593c.f2671f;
        C0594d c0594d = c0593c.f2670e;
        int iM3494A = iConvertFocusDirectionToLayoutDirection == 1 ? m3494A() : m3547z();
        m3521b0(iM3494A, c0588z);
        m3514V(iConvertFocusDirectionToLayoutDirection);
        C0607m c0607m = this.f2642g;
        c0607m.f2901c = c0607m.f2902d + iM3494A;
        c0607m.f2900b = (int) (this.f2638c.mo3838n() * 0.33333334f);
        C0607m c0607m2 = this.f2642g;
        c0607m2.f2906h = true;
        c0607m2.f2899a = false;
        m3535n(c0584v, c0607m2, c0588z);
        this.f2650o = this.f2644i;
        if (!z && (viewM3595r = c0594d.m3595r(iM3494A, iConvertFocusDirectionToLayoutDirection)) != null && viewM3595r != viewFindContainingItemView) {
            return viewM3595r;
        }
        if (m3506N(iConvertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.f2636a - 1; i2 >= 0; i2--) {
                View viewM3595r2 = this.f2637b[i2].m3595r(iM3494A, iConvertFocusDirectionToLayoutDirection);
                if (viewM3595r2 != null && viewM3595r2 != viewFindContainingItemView) {
                    return viewM3595r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2636a; i3++) {
                View viewM3595r3 = this.f2637b[i3].m3595r(iM3494A, iConvertFocusDirectionToLayoutDirection);
                if (viewM3595r3 != null && viewM3595r3 != viewFindContainingItemView) {
                    return viewM3595r3;
                }
            }
        }
        boolean z2 = (this.f2643h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? c0594d.m3584g() : c0594d.m3587j());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (m3506N(iConvertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.f2636a - 1; i4 >= 0; i4--) {
                if (i4 != c0594d.f2676e) {
                    C0594d[] c0594dArr = this.f2637b;
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? c0594dArr[i4].m3584g() : c0594dArr[i4].m3587j());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2636a; i5++) {
                C0594d[] c0594dArr2 = this.f2637b;
                View viewFindViewByPosition3 = findViewByPosition(z2 ? c0594dArr2[i5].m3584g() : c0594dArr2[i5].m3587j());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM3539r = m3539r(false);
            View viewM3538q = m3538q(false);
            if (viewM3539r == null || viewM3538q == null) {
                return;
            }
            int position = getPosition(viewM3539r);
            int position2 = getPosition(viewM3538q);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m3501H(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2648m.m3549b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m3501H(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m3501H(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3501H(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        m3505M(c0584v, c0588z, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutCompleted(RecyclerView.C0588z c0588z) {
        super.onLayoutCompleted(c0588z);
        this.f2646k = -1;
        this.f2647l = Integer.MIN_VALUE;
        this.f2652q = null;
        this.f2655t.m3572c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f2652q = savedState;
            if (this.f2646k != -1) {
                savedState.m3566a();
                this.f2652q.m3567b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public Parcelable onSaveInstanceState() {
        int iM3598u;
        int iMo3837m;
        int[] iArr;
        if (this.f2652q != null) {
            return new SavedState(this.f2652q);
        }
        SavedState savedState = new SavedState();
        savedState.mReverseLayout = this.f2643h;
        savedState.mAnchorLayoutFromEnd = this.f2650o;
        savedState.mLastLayoutRTL = this.f2651p;
        LazySpanLookup lazySpanLookup = this.f2648m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f2660a) == null) {
            savedState.mSpanLookupSize = 0;
        } else {
            savedState.mSpanLookup = iArr;
            savedState.mSpanLookupSize = iArr.length;
            savedState.mFullSpanItems = lazySpanLookup.f2661b;
        }
        if (getChildCount() <= 0) {
            savedState.mAnchorPosition = -1;
            savedState.mVisibleAnchorPosition = -1;
            savedState.mSpanOffsetsSize = 0;
            return savedState;
        }
        savedState.mAnchorPosition = this.f2650o ? m3494A() : m3547z();
        savedState.mVisibleAnchorPosition = m3540s();
        int i = this.f2636a;
        savedState.mSpanOffsetsSize = i;
        savedState.mSpanOffsets = new int[i];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            boolean z = this.f2650o;
            C0594d[] c0594dArr = this.f2637b;
            if (z) {
                iM3598u = c0594dArr[i2].m3594q(Integer.MIN_VALUE);
                if (iM3598u != Integer.MIN_VALUE) {
                    iMo3837m = this.f2638c.mo3833i();
                    iM3598u -= iMo3837m;
                }
            } else {
                iM3598u = c0594dArr[i2].m3598u(Integer.MIN_VALUE);
                if (iM3598u != Integer.MIN_VALUE) {
                    iMo3837m = this.f2638c.mo3837m();
                    iM3598u -= iMo3837m;
                }
            }
            savedState.mSpanOffsets[i2] = iM3598u;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            m3530i();
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m3537p(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            int position = getPosition(getChildAt(i2));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public View m3538q(boolean z) {
        int iMo3837m = this.f2638c.mo3837m();
        int iMo3833i = this.f2638c.mo3833i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo3831g = this.f2638c.mo3831g(childAt);
            int iMo3828d = this.f2638c.mo3828d(childAt);
            if (iMo3828d > iMo3837m && iMo3831g < iMo3833i) {
                if (iMo3828d <= iMo3833i || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: r */
    public View m3539r(boolean z) {
        int iMo3837m = this.f2638c.mo3837m();
        int iMo3833i = this.f2638c.mo3833i();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo3831g = this.f2638c.mo3831g(childAt);
            if (this.f2638c.mo3828d(childAt) > iMo3837m && iMo3831g < iMo3833i) {
                if (iMo3831g >= iMo3837m || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f2640e == 1 || !isLayoutRTL()) {
            this.f2644i = this.f2643h;
        } else {
            this.f2644i = !this.f2643h;
        }
    }

    /* JADX INFO: renamed from: s */
    public int m3540s() {
        View viewM3538q = this.f2644i ? m3538q(true) : m3539r(true);
        if (viewM3538q == null) {
            return -1;
        }
        return getPosition(viewM3538q);
    }

    public int scrollBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m3507O(i, c0588z);
        int iM3535n = m3535n(c0584v, this.f2642g, c0588z);
        if (this.f2642g.f2900b >= iM3535n) {
            i = i < 0 ? -iM3535n : iM3535n;
        }
        this.f2638c.mo3842r(-i);
        this.f2650o = this.f2644i;
        C0607m c0607m = this.f2642g;
        c0607m.f2900b = 0;
        m3509Q(c0584v, c0607m);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        return scrollBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void scrollToPosition(int i) {
        SavedState savedState = this.f2652q;
        if (savedState != null && savedState.mAnchorPosition != i) {
            savedState.m3566a();
        }
        this.f2646k = i;
        this.f2647l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        return scrollBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2640e == 1) {
            iChooseSize2 = RecyclerView.AbstractC0577o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC0577o.chooseSize(i, (this.f2641f * this.f2636a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0577o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC0577o.chooseSize(i2, (this.f2641f * this.f2636a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            ig3.m135964a("invalid orientation.");
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f2640e) {
            return;
        }
        this.f2640e = i;
        AbstractC0612r abstractC0612r = this.f2638c;
        this.f2638c = this.f2639d;
        this.f2639d = abstractC0612r;
        requestLayout();
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f2652q;
        if (savedState != null && savedState.mReverseLayout != z) {
            savedState.mReverseLayout = z;
        }
        this.f2643h = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        C0608n c0608n = new C0608n(recyclerView.getContext());
        c0608n.setTargetPosition(i);
        startSmoothScroll(c0608n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean supportsPredictiveItemAnimations() {
        return this.f2652q == null;
    }

    /* JADX INFO: renamed from: t */
    public int[] m3541t(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            yfq0.m214580a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3585h();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: u */
    public int[] m3542u(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            yfq0.m214580a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3586i();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: v */
    public final int m3543v(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public int[] m3544w(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            yfq0.m214580a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3588k();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x */
    public final void m3545x(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        int iMo3833i;
        int iM3495B = m3495B(Integer.MIN_VALUE);
        if (iM3495B != Integer.MIN_VALUE && (iMo3833i = this.f2638c.mo3833i() - iM3495B) > 0) {
            int i = iMo3833i - (-scrollBy(-iMo3833i, c0584v, c0588z));
            if (!z || i <= 0) {
                return;
            }
            this.f2638c.mo3842r(i);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3546y(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        int iMo3837m;
        int iM3498E = m3498E(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iM3498E != Integer.MAX_VALUE && (iMo3837m = iM3498E - this.f2638c.mo3837m()) > 0) {
            int iScrollBy = iMo3837m - scrollBy(iMo3837m, c0584v, c0588z);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f2638c.mo3842r(-iScrollBy);
        }
    }

    /* JADX INFO: renamed from: z */
    public int m3547z() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0593c extends RecyclerView.C0578p {

        /* JADX INFO: renamed from: e */
        public C0594d f2670e;

        /* JADX INFO: renamed from: f */
        public boolean f2671f;

        public C0593c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: g */
        public final int m3574g() {
            C0594d c0594d = this.f2670e;
            if (c0594d == null) {
                return -1;
            }
            return c0594d.f2676e;
        }

        /* JADX INFO: renamed from: h */
        public boolean m3575h() {
            return this.f2671f;
        }

        /* JADX INFO: renamed from: i */
        public void m3576i(boolean z) {
            this.f2671f = z;
        }

        public C0593c(int i, int i2) {
            super(i, i2);
        }

        public C0593c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0593c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0593c(context, attributeSet);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a */
        public int[] f2660a;

        /* JADX INFO: renamed from: b */
        public List<FullSpanItem> f2661b;

        /* JADX INFO: renamed from: a */
        public void m3548a(FullSpanItem fullSpanItem) {
            if (this.f2661b == null) {
                this.f2661b = new ArrayList();
            }
            int size = this.f2661b.size();
            int i = 0;
            while (true) {
                List<FullSpanItem> list = this.f2661b;
                if (i >= size) {
                    list.add(fullSpanItem);
                    return;
                }
                FullSpanItem fullSpanItem2 = list.get(i);
                if (fullSpanItem2.mPosition == fullSpanItem.mPosition) {
                    this.f2661b.remove(i);
                }
                if (fullSpanItem2.mPosition >= fullSpanItem.mPosition) {
                    this.f2661b.add(i, fullSpanItem);
                    return;
                }
                i++;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3549b() {
            int[] iArr = this.f2660a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2661b = null;
        }

        /* JADX INFO: renamed from: c */
        public void m3550c(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f2660a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m3562o(i)];
                this.f2660a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2660a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        public int m3551d(int i) {
            List<FullSpanItem> list = this.f2661b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2661b.get(size).mPosition >= i) {
                        this.f2661b.remove(size);
                    }
                }
            }
            return m3555h(i);
        }

        /* JADX INFO: renamed from: e */
        public FullSpanItem m3552e(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f2661b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f2661b.get(i4);
                int i5 = fullSpanItem.mPosition;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.mGapDir == i3 || (z && fullSpanItem.mHasUnwantedGapAfter))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public FullSpanItem m3553f(int i) {
            List<FullSpanItem> list = this.f2661b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2661b.get(size);
                if (fullSpanItem.mPosition == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public int m3554g(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* JADX INFO: renamed from: h */
        public int m3555h(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iM3556i = m3556i(i);
            int[] iArr2 = this.f2660a;
            if (iM3556i == -1) {
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2660a.length;
            }
            int iMin = Math.min(iM3556i + 1, iArr2.length);
            Arrays.fill(this.f2660a, i, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: i */
        public final int m3556i(int i) {
            if (this.f2661b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM3553f = m3553f(i);
            if (fullSpanItemM3553f != null) {
                this.f2661b.remove(fullSpanItemM3553f);
            }
            int size = this.f2661b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.f2661b.get(i2).mPosition >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f2661b.get(i2);
            this.f2661b.remove(i2);
            return fullSpanItem.mPosition;
        }

        /* JADX INFO: renamed from: j */
        public void m3557j(int i, int i2) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m3550c(i3);
            int[] iArr2 = this.f2660a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2660a, i, i3, -1);
            m3559l(i, i2);
        }

        /* JADX INFO: renamed from: k */
        public void m3558k(int i, int i2) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m3550c(i3);
            int[] iArr2 = this.f2660a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2660a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m3560m(i, i2);
        }

        /* JADX INFO: renamed from: l */
        public final void m3559l(int i, int i2) {
            List<FullSpanItem> list = this.f2661b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2661b.get(size);
                int i3 = fullSpanItem.mPosition;
                if (i3 >= i) {
                    fullSpanItem.mPosition = i3 + i2;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m3560m(int i, int i2) {
            List<FullSpanItem> list = this.f2661b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f2661b.get(size);
                int i4 = fullSpanItem.mPosition;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f2661b.remove(size);
                    } else {
                        fullSpanItem.mPosition = i4 - i2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m3561n(int i, C0594d c0594d) {
            m3550c(i);
            this.f2660a[i] = c0594d.f2676e;
        }

        /* JADX INFO: renamed from: o */
        public int m3562o(int i) {
            int length = this.f2660a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0589a();
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C0589a implements Parcelable.Creator<FullSpanItem> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.mPosition = parcel.readInt();
                this.mGapDir = parcel.readInt();
                this.mHasUnwantedGapAfter = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.mGapPerSpan = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* JADX INFO: renamed from: a */
            public int m3563a(int i) {
                int[] iArr = this.mGapPerSpan;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.mPosition);
                parcel.writeInt(this.mGapDir);
                parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
                int[] iArr = this.mGapPerSpan;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.mGapPerSpan);
                }
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f2640e = i2;
        m3515W(i);
        this.f2642g = new C0607m();
        m3534m();
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0590a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorPosition;
        List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        boolean mLastLayoutRTL;
        boolean mReverseLayout;
        int[] mSpanLookup;
        int mSpanLookupSize;
        int[] mSpanOffsets;
        int mSpanOffsetsSize;
        int mVisibleAnchorPosition;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C0590a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int i = parcel.readInt();
            this.mSpanOffsetsSize = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.mSpanLookupSize = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        /* JADX INFO: renamed from: a */
        public void m3566a() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        /* JADX INFO: renamed from: b */
        public void m3567b() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        public SavedState() {
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }
}
