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
import p153l.dpq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0579o implements RecyclerView.AbstractC0590z.b {

    /* JADX INFO: renamed from: b */
    public C0596d[] f2637b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public AbstractC0614r f2638c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public AbstractC0614r f2639d;

    /* JADX INFO: renamed from: e */
    public int f2640e;

    /* JADX INFO: renamed from: f */
    public int f2641f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final C0609m f2642g;

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
    public final C0594b f2655t = new C0594b();

    /* JADX INFO: renamed from: u */
    public boolean f2656u = false;

    /* JADX INFO: renamed from: v */
    public boolean f2657v = true;

    /* JADX INFO: renamed from: x */
    public final Runnable f2659x = new RunnableC0593a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0593a implements Runnable {
        public RunnableC0593a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m3531i();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0594b {

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

        public C0594b() {
            m3573c();
        }

        /* JADX INFO: renamed from: a */
        public void m3571a() {
            boolean z = this.f2665c;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            this.f2664b = z ? staggeredGridLayoutManager.f2638c.mo3834i() : staggeredGridLayoutManager.f2638c.mo3838m();
        }

        /* JADX INFO: renamed from: b */
        public void m3572b(int i) {
            boolean z = this.f2665c;
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            if (z) {
                this.f2664b = staggeredGridLayoutManager.f2638c.mo3834i() - i;
            } else {
                this.f2664b = staggeredGridLayoutManager.f2638c.mo3838m() + i;
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3573c() {
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
        public void m3574d(C0596d[] c0596dArr) {
            int length = c0596dArr.length;
            int[] iArr = this.f2668f;
            if (iArr == null || iArr.length < length) {
                this.f2668f = new int[StaggeredGridLayoutManager.this.f2637b.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2668f[i] = c0596dArr[i].m3599u(Integer.MIN_VALUE);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public class C0596d {

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

        public C0596d(int i) {
            this.f2676e = i;
        }

        /* JADX INFO: renamed from: A */
        public void m3578A(int i) {
            this.f2673b = i;
            this.f2674c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m3579a(View view) {
            C0595c c0595cM3597s = m3597s(view);
            c0595cM3597s.f2670e = this;
            this.f2672a.add(view);
            this.f2674c = Integer.MIN_VALUE;
            if (this.f2672a.size() == 1) {
                this.f2673b = Integer.MIN_VALUE;
            }
            if (c0595cM3597s.m3420e() || c0595cM3597s.m3419d()) {
                this.f2675d += StaggeredGridLayoutManager.this.f2638c.mo3830e(view);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3580b(boolean z, int i) {
            int iM3595q = z ? m3595q(Integer.MIN_VALUE) : m3599u(Integer.MIN_VALUE);
            m3583e();
            if (iM3595q == Integer.MIN_VALUE) {
                return;
            }
            if (!z || iM3595q >= StaggeredGridLayoutManager.this.f2638c.mo3834i()) {
                if (z || iM3595q <= StaggeredGridLayoutManager.this.f2638c.mo3838m()) {
                    if (i != Integer.MIN_VALUE) {
                        iM3595q += i;
                    }
                    this.f2674c = iM3595q;
                    this.f2673b = iM3595q;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m3581c() {
            LazySpanLookup.FullSpanItem fullSpanItemM3554f;
            ArrayList<View> arrayList = this.f2672a;
            View view = arrayList.get(arrayList.size() - 1);
            C0595c c0595cM3597s = m3597s(view);
            this.f2674c = StaggeredGridLayoutManager.this.f2638c.mo3829d(view);
            if (c0595cM3597s.f2671f && (fullSpanItemM3554f = StaggeredGridLayoutManager.this.f2648m.m3554f(c0595cM3597s.m3417b())) != null && fullSpanItemM3554f.mGapDir == 1) {
                this.f2674c += fullSpanItemM3554f.m3564a(this.f2676e);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3582d() {
            LazySpanLookup.FullSpanItem fullSpanItemM3554f;
            View view = this.f2672a.get(0);
            C0595c c0595cM3597s = m3597s(view);
            this.f2673b = StaggeredGridLayoutManager.this.f2638c.mo3832g(view);
            if (c0595cM3597s.f2671f && (fullSpanItemM3554f = StaggeredGridLayoutManager.this.f2648m.m3554f(c0595cM3597s.m3417b())) != null && fullSpanItemM3554f.mGapDir == -1) {
                this.f2673b -= fullSpanItemM3554f.m3564a(this.f2676e);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m3583e() {
            this.f2672a.clear();
            m3600v();
            this.f2675d = 0;
        }

        /* JADX INFO: renamed from: f */
        public int m3584f() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3592n(arrayList.size() - 1, -1, true) : m3592n(0, arrayList.size(), true);
        }

        /* JADX INFO: renamed from: g */
        public int m3585g() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591m(arrayList.size() - 1, -1, true) : m3591m(0, arrayList.size(), true);
        }

        /* JADX INFO: renamed from: h */
        public int m3586h() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3592n(arrayList.size() - 1, -1, false) : m3592n(0, arrayList.size(), false);
        }

        /* JADX INFO: renamed from: i */
        public int m3587i() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3592n(0, arrayList.size(), true) : m3592n(arrayList.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: j */
        public int m3588j() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3591m(0, arrayList.size(), true) : m3591m(arrayList.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: k */
        public int m3589k() {
            boolean z = StaggeredGridLayoutManager.this.f2643h;
            ArrayList<View> arrayList = this.f2672a;
            return z ? m3592n(0, arrayList.size(), false) : m3592n(arrayList.size() - 1, -1, false);
        }

        /* JADX INFO: renamed from: l */
        public int m3590l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int iMo3838m = StaggeredGridLayoutManager.this.f2638c.mo3838m();
            int iMo3834i = StaggeredGridLayoutManager.this.f2638c.mo3834i();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2672a.get(i);
                int iMo3832g = StaggeredGridLayoutManager.this.f2638c.mo3832g(view);
                int iMo3829d = StaggeredGridLayoutManager.this.f2638c.mo3829d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? iMo3832g >= iMo3834i : iMo3832g > iMo3834i;
                if (!z3 ? iMo3829d > iMo3838m : iMo3829d >= iMo3838m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (iMo3832g >= iMo3838m && iMo3829d <= iMo3834i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (iMo3832g < iMo3838m || iMo3829d > iMo3834i) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: m */
        public int m3591m(int i, int i2, boolean z) {
            return m3590l(i, i2, false, false, z);
        }

        /* JADX INFO: renamed from: n */
        public int m3592n(int i, int i2, boolean z) {
            return m3590l(i, i2, z, true, false);
        }

        /* JADX INFO: renamed from: o */
        public int m3593o() {
            return this.f2675d;
        }

        /* JADX INFO: renamed from: p */
        public int m3594p() {
            int i = this.f2674c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m3581c();
            return this.f2674c;
        }

        /* JADX INFO: renamed from: q */
        public int m3595q(int i) {
            int i2 = this.f2674c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2672a.size() == 0) {
                return i;
            }
            m3581c();
            return this.f2674c;
        }

        /* JADX INFO: renamed from: r */
        public View m3596r(int i, int i2) {
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
        public C0595c m3597s(View view) {
            return (C0595c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: t */
        public int m3598t() {
            int i = this.f2673b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m3582d();
            return this.f2673b;
        }

        /* JADX INFO: renamed from: u */
        public int m3599u(int i) {
            int i2 = this.f2673b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2672a.size() == 0) {
                return i;
            }
            m3582d();
            return this.f2673b;
        }

        /* JADX INFO: renamed from: v */
        public void m3600v() {
            this.f2673b = Integer.MIN_VALUE;
            this.f2674c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: w */
        public void m3601w(int i) {
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
        public void m3602x() {
            int size = this.f2672a.size();
            View viewRemove = this.f2672a.remove(size - 1);
            C0595c c0595cM3597s = m3597s(viewRemove);
            c0595cM3597s.f2670e = null;
            if (c0595cM3597s.m3420e() || c0595cM3597s.m3419d()) {
                this.f2675d -= StaggeredGridLayoutManager.this.f2638c.mo3830e(viewRemove);
            }
            if (size == 1) {
                this.f2673b = Integer.MIN_VALUE;
            }
            this.f2674c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: y */
        public void m3603y() {
            View viewRemove = this.f2672a.remove(0);
            C0595c c0595cM3597s = m3597s(viewRemove);
            c0595cM3597s.f2670e = null;
            if (this.f2672a.size() == 0) {
                this.f2674c = Integer.MIN_VALUE;
            }
            if (c0595cM3597s.m3420e() || c0595cM3597s.m3419d()) {
                this.f2675d -= StaggeredGridLayoutManager.this.f2638c.mo3830e(viewRemove);
            }
            this.f2673b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: z */
        public void m3604z(View view) {
            C0595c c0595cM3597s = m3597s(view);
            c0595cM3597s.f2670e = this;
            this.f2672a.add(0, view);
            this.f2673b = Integer.MIN_VALUE;
            if (this.f2672a.size() == 1) {
                this.f2674c = Integer.MIN_VALUE;
            }
            if (c0595cM3597s.m3420e() || c0595cM3597s.m3419d()) {
                this.f2675d += StaggeredGridLayoutManager.this.f2638c.mo3830e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0579o.d properties = RecyclerView.AbstractC0579o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2604a);
        m3516W(properties.f2605b);
        setReverseLayout(properties.f2606c);
        this.f2642g = new C0609m();
        m3535m();
    }

    /* JADX INFO: renamed from: K */
    private void m3494K(View view, int i, int i2, boolean z) {
        calculateItemDecorationsForChild(view, this.f2654s);
        C0595c c0595c = (C0595c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0595c).leftMargin;
        Rect rect = this.f2654s;
        int iM3527e0 = m3527e0(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c0595c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0595c).topMargin;
        Rect rect2 = this.f2654s;
        int iM3527e1 = m3527e0(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c0595c).bottomMargin + rect2.bottom);
        if (z ? shouldReMeasureChild(view, iM3527e0, iM3527e1, c0595c) : shouldMeasureChild(view, iM3527e0, iM3527e1, c0595c)) {
            view.measure(iM3527e0, iM3527e1);
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
    public int m3495A() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: B */
    public final int m3496B(int i) {
        int iM3595q = this.f2637b[0].m3595q(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3595q2 = this.f2637b[i2].m3595q(i);
            if (iM3595q2 > iM3595q) {
                iM3595q = iM3595q2;
            }
        }
        return iM3595q;
    }

    /* JADX INFO: renamed from: C */
    public final int m3497C(int i) {
        int iM3599u = this.f2637b[0].m3599u(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3599u2 = this.f2637b[i2].m3599u(i);
            if (iM3599u2 > iM3599u) {
                iM3599u = iM3599u2;
            }
        }
        return iM3599u;
    }

    /* JADX INFO: renamed from: D */
    public final int m3498D(int i) {
        int iM3595q = this.f2637b[0].m3595q(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3595q2 = this.f2637b[i2].m3595q(i);
            if (iM3595q2 < iM3595q) {
                iM3595q = iM3595q2;
            }
        }
        return iM3595q;
    }

    /* JADX INFO: renamed from: E */
    public final int m3499E(int i) {
        int iM3599u = this.f2637b[0].m3599u(i);
        for (int i2 = 1; i2 < this.f2636a; i2++) {
            int iM3599u2 = this.f2637b[i2].m3599u(i);
            if (iM3599u2 < iM3599u) {
                iM3599u = iM3599u2;
            }
        }
        return iM3599u;
    }

    /* JADX INFO: renamed from: F */
    public final C0596d m3500F(C0609m c0609m) {
        int i;
        int i2;
        int i3;
        boolean zM3507N = m3507N(c0609m.f2903e);
        int i4 = this.f2636a;
        if (zM3507N) {
            i2 = i4 - 1;
            i3 = -1;
            i = -1;
        } else {
            i = i4;
            i2 = 0;
            i3 = 1;
        }
        int i5 = c0609m.f2903e;
        AbstractC0614r abstractC0614r = this.f2638c;
        C0596d c0596d = null;
        if (i5 == 1) {
            int iMo3838m = abstractC0614r.mo3838m();
            int i6 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i2 != i) {
                C0596d c0596d2 = this.f2637b[i2];
                int iM3595q = c0596d2.m3595q(iMo3838m);
                if (iM3595q < i6) {
                    c0596d = c0596d2;
                    i6 = iM3595q;
                }
                i2 += i3;
            }
            return c0596d;
        }
        int iMo3834i = abstractC0614r.mo3834i();
        int i7 = Integer.MIN_VALUE;
        while (i2 != i) {
            C0596d c0596d3 = this.f2637b[i2];
            int iM3599u = c0596d3.m3599u(iMo3834i);
            if (iM3599u > i7) {
                c0596d = c0596d3;
                i7 = iM3599u;
            }
            i2 += i3;
        }
        return c0596d;
    }

    /* JADX INFO: renamed from: G */
    public int m3501G() {
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
    public final void m3502H(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM3495A;
        int iM3495A2 = this.f2644i ? m3495A() : m3548z();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.f2648m.m3556h(i5);
            if (i3 != 1) {
                this.f2648m.m3558j(i, i2);
            } else if (i3 != 2) {
                this.f2648m.m3559k(i, i2);
            } else if (i3 == 8) {
                this.f2648m.m3559k(i, 1);
                this.f2648m.m3558j(i2, 1);
            }
            if (i4 <= iM3495A2) {
                return;
            }
            if (this.f2644i) {
                iM3495A = m3548z();
            } else {
                iM3495A = m3495A();
            }
            if (i5 <= iM3495A) {
                requestLayout();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.f2648m.m3556h(i5);
        if (i3 != 1) {
            this.f2648m.m3558j(i, i2);
        } else if (i3 != 2) {
            this.f2648m.m3559k(i, i2);
        } else if (i3 == 8) {
            this.f2648m.m3559k(i, 1);
            this.f2648m.m3558j(i2, 1);
        }
        if (i4 <= iM3495A2) {
            return;
        }
        if (this.f2644i) {
            iM3495A = m3548z();
        } else {
            iM3495A = m3495A();
        }
        if (i5 <= iM3495A) {
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
    public View m3503I() {
        int i;
        View childAt;
        boolean z;
        AbstractC0614r abstractC0614r;
        int iMo3832g;
        int iMo3832g2;
        boolean z2;
        boolean z3;
        int iMo3829d;
        int iMo3829d2;
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
            C0595c c0595c = (C0595c) childAt2.getLayoutParams();
            if (!bitSet.get(c0595c.f2670e.f2676e)) {
                if (!c0595c.f2671f && (i = i2 + i3) != childCount) {
                    childAt = getChildAt(i);
                    z = this.f2644i;
                    abstractC0614r = this.f2638c;
                    if (z) {
                        iMo3829d = abstractC0614r.mo3829d(childAt2);
                        iMo3829d2 = this.f2638c.mo3829d(childAt);
                        if (iMo3829d >= iMo3829d2) {
                            if (iMo3829d == iMo3829d2) {
                                if (c0595c.f2670e.f2676e - ((C0595c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
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
                        iMo3832g = abstractC0614r.mo3832g(childAt2);
                        iMo3832g2 = this.f2638c.mo3832g(childAt);
                        if (iMo3832g <= iMo3832g2) {
                            if (iMo3832g == iMo3832g2) {
                                if (c0595c.f2670e.f2676e - ((C0595c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
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
            } else if (!m3532j(c0595c.f2670e)) {
                bitSet.clear(c0595c.f2670e.f2676e);
                if (!c0595c.f2671f) {
                    childAt = getChildAt(i);
                    z = this.f2644i;
                    abstractC0614r = this.f2638c;
                    if (z) {
                        iMo3829d = abstractC0614r.mo3829d(childAt2);
                        iMo3829d2 = this.f2638c.mo3829d(childAt);
                        if (iMo3829d >= iMo3829d2) {
                            if (iMo3829d == iMo3829d2) {
                                if (c0595c.f2670e.f2676e - ((C0595c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
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
                        iMo3832g = abstractC0614r.mo3832g(childAt2);
                        iMo3832g2 = this.f2638c.mo3832g(childAt);
                        if (iMo3832g <= iMo3832g2) {
                            if (iMo3832g == iMo3832g2) {
                                if (c0595c.f2670e.f2676e - ((C0595c) childAt.getLayoutParams()).f2670e.f2676e < 0) {
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
    public void m3504J() {
        this.f2648m.m3550b();
        requestLayout();
    }

    /* JADX INFO: renamed from: L */
    public final void m3505L(View view, C0595c c0595c, boolean z) {
        boolean z2 = c0595c.f2671f;
        int i = this.f2640e;
        if (z2) {
            if (i == 1) {
                m3494K(view, this.f2653r, RecyclerView.AbstractC0579o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0595c).height, true), z);
                return;
            } else {
                m3494K(view, RecyclerView.AbstractC0579o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0595c).width, true), this.f2653r, z);
                return;
            }
        }
        if (i == 1) {
            m3494K(view, RecyclerView.AbstractC0579o.getChildMeasureSpec(this.f2641f, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) c0595c).width, false), RecyclerView.AbstractC0579o.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c0595c).height, true), z);
        } else {
            m3494K(view, RecyclerView.AbstractC0579o.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c0595c).width, true), RecyclerView.AbstractC0579o.getChildMeasureSpec(this.f2641f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c0595c).height, false), z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0155  */
    /* JADX INFO: renamed from: M */
    public final void m3506M(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        boolean z2;
        SavedState savedState;
        C0594b c0594b = this.f2655t;
        if (!(this.f2652q == null && this.f2646k == -1) && c0561a0.m3361c() == 0) {
            removeAndRecycleAllViews(c0586v);
            c0594b.m3573c();
            return;
        }
        boolean z3 = (c0594b.f2667e && this.f2646k == -1 && this.f2652q == null) ? false : true;
        if (z3) {
            c0594b.m3573c();
            if (this.f2652q != null) {
                m3523c(c0594b);
            } else {
                resolveShouldLayoutReverse();
                c0594b.f2665c = this.f2644i;
            }
            m3521a0(c0561a0, c0594b);
            c0594b.f2667e = true;
        }
        if (this.f2652q == null && this.f2646k == -1 && (c0594b.f2665c != this.f2650o || isLayoutRTL() != this.f2651p)) {
            this.f2648m.m3550b();
            c0594b.f2666d = true;
        }
        if (getChildCount() > 0 && ((savedState = this.f2652q) == null || savedState.mSpanOffsetsSize < 1)) {
            if (c0594b.f2666d) {
                for (int i = 0; i < this.f2636a; i++) {
                    this.f2637b[i].m3583e();
                    int i2 = c0594b.f2664b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.f2637b[i].m3578A(i2);
                    }
                }
            } else if (z3 || this.f2655t.f2668f == null) {
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3580b(this.f2644i, c0594b.f2664b);
                }
                this.f2655t.m3574d(this.f2637b);
            } else {
                for (int i4 = 0; i4 < this.f2636a; i4++) {
                    C0596d c0596d = this.f2637b[i4];
                    c0596d.m3583e();
                    c0596d.m3578A(this.f2655t.f2668f[i4]);
                }
            }
        }
        detachAndScrapAttachedViews(c0586v);
        this.f2642g.f2899a = false;
        this.f2656u = false;
        m3524c0(this.f2639d.mo3839n());
        m3522b0(c0594b.f2663a, c0561a0);
        if (c0594b.f2665c) {
            m3515V(-1);
            m3536n(c0586v, this.f2642g, c0561a0);
            m3515V(1);
            C0609m c0609m = this.f2642g;
            c0609m.f2901c = c0594b.f2663a + c0609m.f2902d;
            m3536n(c0586v, c0609m, c0561a0);
        } else {
            m3515V(1);
            m3536n(c0586v, this.f2642g, c0561a0);
            m3515V(-1);
            C0609m c0609m2 = this.f2642g;
            c0609m2.f2901c = c0594b.f2663a + c0609m2.f2902d;
            m3536n(c0586v, c0609m2, c0561a0);
        }
        m3513T();
        if (getChildCount() > 0) {
            if (this.f2644i) {
                m3546x(c0586v, c0561a0, true);
                m3547y(c0586v, c0561a0, false);
            } else {
                m3547y(c0586v, c0561a0, true);
                m3546x(c0586v, c0561a0, false);
            }
        }
        if (z && !c0561a0.m3364f() && this.f2649n != 0 && getChildCount() > 0 && (this.f2656u || m3503I() != null)) {
            removeCallbacks(this.f2659x);
            z2 = m3531i();
        }
        if (c0561a0.m3364f()) {
            this.f2655t.m3573c();
        }
        this.f2650o = c0594b.f2665c;
        this.f2651p = isLayoutRTL();
        if (z2) {
            this.f2655t.m3573c();
            m3506M(c0586v, c0561a0, false);
        }
    }

    /* JADX INFO: renamed from: N */
    public final boolean m3507N(int i) {
        if (this.f2640e == 0) {
            return (i == -1) != this.f2644i;
        }
        return ((i == -1) == this.f2644i) == isLayoutRTL();
    }

    /* JADX INFO: renamed from: O */
    public void m3508O(int i, RecyclerView.C0561a0 c0561a0) {
        int iM3548z;
        int i2;
        if (i > 0) {
            iM3548z = m3495A();
            i2 = 1;
        } else {
            iM3548z = m3548z();
            i2 = -1;
        }
        this.f2642g.f2899a = true;
        m3522b0(iM3548z, c0561a0);
        m3515V(i2);
        C0609m c0609m = this.f2642g;
        c0609m.f2901c = iM3548z + c0609m.f2902d;
        c0609m.f2900b = Math.abs(i);
    }

    /* JADX INFO: renamed from: P */
    public final void m3509P(View view) {
        for (int i = this.f2636a - 1; i >= 0; i--) {
            this.f2637b[i].m3604z(view);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3510Q(RecyclerView.C0586v c0586v, C0609m c0609m) {
        if (!c0609m.f2899a || c0609m.f2907i) {
            return;
        }
        int i = c0609m.f2900b;
        int i2 = c0609m.f2903e;
        if (i == 0) {
            if (i2 == -1) {
                m3511R(c0586v, c0609m.f2905g);
                return;
            } else {
                m3512S(c0586v, c0609m.f2904f);
                return;
            }
        }
        if (i2 != -1) {
            int iM3498D = m3498D(c0609m.f2905g) - c0609m.f2905g;
            int iMin = c0609m.f2904f;
            if (iM3498D >= 0) {
                iMin += Math.min(iM3498D, c0609m.f2900b);
            }
            m3512S(c0586v, iMin);
            return;
        }
        int i3 = c0609m.f2904f;
        int iM3497C = i3 - m3497C(i3);
        int iMin2 = c0609m.f2905g;
        if (iM3497C >= 0) {
            iMin2 -= Math.min(iM3497C, c0609m.f2900b);
        }
        m3511R(c0586v, iMin2);
    }

    /* JADX INFO: renamed from: R */
    public final void m3511R(RecyclerView.C0586v c0586v, int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f2638c.mo3832g(childAt) < i || this.f2638c.mo3842q(childAt) < i) {
                return;
            }
            C0595c c0595c = (C0595c) childAt.getLayoutParams();
            if (c0595c.f2671f) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    if (this.f2637b[i2].f2672a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3602x();
                }
            } else if (c0595c.f2670e.f2672a.size() == 1) {
                return;
            } else {
                c0595c.f2670e.m3602x();
            }
            removeAndRecycleView(childAt, c0586v);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3512S(RecyclerView.C0586v c0586v, int i) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f2638c.mo3829d(childAt) > i || this.f2638c.mo3841p(childAt) > i) {
                return;
            }
            C0595c c0595c = (C0595c) childAt.getLayoutParams();
            if (c0595c.f2671f) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    if (this.f2637b[i2].f2672a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2636a; i3++) {
                    this.f2637b[i3].m3603y();
                }
            } else if (c0595c.f2670e.f2672a.size() == 1) {
                return;
            } else {
                c0595c.f2670e.m3603y();
            }
            removeAndRecycleView(childAt, c0586v);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m3513T() {
        if (this.f2639d.mo3836k() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            float fMo3830e = this.f2639d.mo3830e(childAt);
            if (fMo3830e >= fMax) {
                if (((C0595c) childAt.getLayoutParams()).m3576h()) {
                    fMo3830e = (fMo3830e * 1.0f) / this.f2636a;
                }
                fMax = Math.max(fMax, fMo3830e);
            }
        }
        int i2 = this.f2641f;
        int iRound = Math.round(fMax * this.f2636a);
        if (this.f2639d.mo3836k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f2639d.mo3839n());
        }
        m3524c0(iRound);
        if (this.f2641f == i2) {
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0595c c0595c = (C0595c) childAt2.getLayoutParams();
            if (!c0595c.f2671f) {
                if (isLayoutRTL() && this.f2640e == 1) {
                    int i4 = this.f2636a;
                    int i5 = c0595c.f2670e.f2676e;
                    childAt2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f2641f) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c0595c.f2670e.f2676e;
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
    public void m3514U(int i) {
        assertNotInLayoutOrScroll(null);
        if (i == this.f2649n) {
            return;
        }
        if (i != 0 && i != 2) {
            wg3.m206174a("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        } else {
            this.f2649n = i;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3515V(int i) {
        C0609m c0609m = this.f2642g;
        c0609m.f2903e = i;
        c0609m.f2902d = this.f2644i != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: W */
    public void m3516W(int i) {
        assertNotInLayoutOrScroll(null);
        if (i != this.f2636a) {
            m3504J();
            this.f2636a = i;
            this.f2645j = new BitSet(this.f2636a);
            this.f2637b = new C0596d[this.f2636a];
            for (int i2 = 0; i2 < this.f2636a; i2++) {
                this.f2637b[i2] = new C0596d(i2);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m3517X(int i, int i2) {
        for (int i3 = 0; i3 < this.f2636a; i3++) {
            if (!this.f2637b[i3].f2672a.isEmpty()) {
                m3525d0(this.f2637b[i3], i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m3518Y(RecyclerView.C0561a0 c0561a0, C0594b c0594b) {
        c0594b.f2663a = this.f2650o ? m3544v(c0561a0.m3361c()) : m3538p(c0561a0.m3361c());
        c0594b.f2664b = Integer.MIN_VALUE;
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m3519Z(RecyclerView.C0561a0 c0561a0, C0594b c0594b) {
        int i;
        if (!c0561a0.m3364f() && (i = this.f2646k) != -1) {
            if (i >= 0 && i < c0561a0.m3361c()) {
                SavedState savedState = this.f2652q;
                if (savedState == null || savedState.mAnchorPosition == -1 || savedState.mSpanOffsetsSize < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f2646k);
                    if (viewFindViewByPosition != null) {
                        c0594b.f2663a = this.f2644i ? m3495A() : m3548z();
                        if (this.f2647l != Integer.MIN_VALUE) {
                            boolean z = c0594b.f2665c;
                            AbstractC0614r abstractC0614r = this.f2638c;
                            if (z) {
                                c0594b.f2664b = (abstractC0614r.mo3834i() - this.f2647l) - this.f2638c.mo3829d(viewFindViewByPosition);
                            } else {
                                c0594b.f2664b = (abstractC0614r.mo3838m() + this.f2647l) - this.f2638c.mo3832g(viewFindViewByPosition);
                            }
                            return true;
                        }
                        if (this.f2638c.mo3830e(viewFindViewByPosition) > this.f2638c.mo3839n()) {
                            boolean z2 = c0594b.f2665c;
                            AbstractC0614r abstractC0614r2 = this.f2638c;
                            c0594b.f2664b = z2 ? abstractC0614r2.mo3834i() : abstractC0614r2.mo3838m();
                            return true;
                        }
                        int iMo3832g = this.f2638c.mo3832g(viewFindViewByPosition) - this.f2638c.mo3838m();
                        if (iMo3832g < 0) {
                            c0594b.f2664b = -iMo3832g;
                            return true;
                        }
                        int iMo3834i = this.f2638c.mo3834i() - this.f2638c.mo3829d(viewFindViewByPosition);
                        if (iMo3834i < 0) {
                            c0594b.f2664b = iMo3834i;
                            return true;
                        }
                        c0594b.f2664b = Integer.MIN_VALUE;
                    } else {
                        int i2 = this.f2646k;
                        c0594b.f2663a = i2;
                        int i3 = this.f2647l;
                        if (i3 == Integer.MIN_VALUE) {
                            c0594b.f2665c = m3530h(i2) == 1;
                            c0594b.m3571a();
                        } else {
                            c0594b.m3572b(i3);
                        }
                        c0594b.f2666d = true;
                    }
                } else {
                    c0594b.f2664b = Integer.MIN_VALUE;
                    c0594b.f2663a = this.f2646k;
                }
                return true;
            }
            this.f2646k = -1;
            this.f2647l = Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3520a(View view) {
        for (int i = this.f2636a - 1; i >= 0; i--) {
            this.f2637b[i].m3579a(view);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3521a0(RecyclerView.C0561a0 c0561a0, C0594b c0594b) {
        if (m3519Z(c0561a0, c0594b) || m3518Y(c0561a0, c0594b)) {
            return;
        }
        c0594b.m3571a();
        c0594b.f2663a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f2652q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3522b0(int i, RecyclerView.C0561a0 c0561a0) {
        int iMo3839n;
        int iMo3839n2;
        int iM3362d;
        C0609m c0609m = this.f2642g;
        boolean z = false;
        c0609m.f2900b = 0;
        c0609m.f2901c = i;
        if (!isSmoothScrolling() || (iM3362d = c0561a0.m3362d()) == -1) {
            iMo3839n = 0;
            iMo3839n2 = 0;
        } else {
            boolean z2 = this.f2644i;
            boolean z3 = iM3362d < i;
            AbstractC0614r abstractC0614r = this.f2638c;
            if (z2 == z3) {
                iMo3839n = abstractC0614r.mo3839n();
                iMo3839n2 = 0;
            } else {
                iMo3839n2 = abstractC0614r.mo3839n();
                iMo3839n = 0;
            }
        }
        boolean clipToPadding = getClipToPadding();
        C0609m c0609m2 = this.f2642g;
        if (clipToPadding) {
            c0609m2.f2904f = this.f2638c.mo3838m() - iMo3839n2;
            this.f2642g.f2905g = this.f2638c.mo3834i() + iMo3839n;
        } else {
            c0609m2.f2905g = this.f2638c.mo3833h() + iMo3839n;
            this.f2642g.f2904f = -iMo3839n2;
        }
        C0609m c0609m3 = this.f2642g;
        c0609m3.f2906h = false;
        c0609m3.f2899a = true;
        if (this.f2638c.mo3836k() == 0 && this.f2638c.mo3833h() == 0) {
            z = true;
        }
        c0609m3.f2907i = z;
    }

    /* JADX INFO: renamed from: c */
    public final void m3523c(C0594b c0594b) {
        SavedState savedState = this.f2652q;
        int i = savedState.mSpanOffsetsSize;
        if (i > 0) {
            if (i == this.f2636a) {
                for (int i2 = 0; i2 < this.f2636a; i2++) {
                    this.f2637b[i2].m3583e();
                    SavedState savedState2 = this.f2652q;
                    int iMo3834i = savedState2.mSpanOffsets[i2];
                    if (iMo3834i != Integer.MIN_VALUE) {
                        boolean z = savedState2.mAnchorLayoutFromEnd;
                        AbstractC0614r abstractC0614r = this.f2638c;
                        iMo3834i += z ? abstractC0614r.mo3834i() : abstractC0614r.mo3838m();
                    }
                    this.f2637b[i2].m3578A(iMo3834i);
                }
            } else {
                savedState.m3568b();
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
            c0594b.f2665c = savedState5.mAnchorLayoutFromEnd;
        } else {
            c0594b.f2665c = this.f2644i;
        }
        if (savedState5.mSpanLookupSize > 1) {
            LazySpanLookup lazySpanLookup = this.f2648m;
            lazySpanLookup.f2660a = savedState5.mSpanLookup;
            lazySpanLookup.f2661b = savedState5.mFullSpanItems;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m3524c0(int i) {
        this.f2641f = i / this.f2636a;
        this.f2653r = View.MeasureSpec.makeMeasureSpec(i, this.f2639d.mo3836k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return this.f2640e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return this.f2640e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean checkLayoutParams(RecyclerView.C0580p c0580p) {
        return c0580p instanceof C0595c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0579o.c cVar) {
        int iM3595q;
        int iM3599u;
        if (this.f2640e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m3508O(i, c0561a0);
        int[] iArr = this.f2658w;
        if (iArr == null || iArr.length < this.f2636a) {
            this.f2658w = new int[this.f2636a];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2636a; i4++) {
            C0609m c0609m = this.f2642g;
            if (c0609m.f2902d == -1) {
                iM3595q = c0609m.f2904f;
                iM3599u = this.f2637b[i4].m3599u(iM3595q);
            } else {
                iM3595q = this.f2637b[i4].m3595q(c0609m.f2905g);
                iM3599u = this.f2642g.f2905g;
            }
            int i5 = iM3595q - iM3599u;
            if (i5 >= 0) {
                this.f2658w[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f2658w, 0, i3);
        for (int i6 = 0; i6 < i3 && this.f2642g.m3809a(c0561a0); i6++) {
            cVar.mo3415a(this.f2642g.f2901c, this.f2658w[i6]);
            C0609m c0609m2 = this.f2642g;
            c0609m2.f2901c += c0609m2.f2902d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeHorizontalScrollExtent(RecyclerView.C0561a0 c0561a0) {
        return computeScrollExtent(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeHorizontalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return computeScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeHorizontalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return computeScrollRange(c0561a0);
    }

    public final int computeScrollExtent(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0617u.m3855a(c0561a0, this.f2638c, m3540r(!this.f2657v), m3539q(!this.f2657v), this, this.f2657v);
    }

    public final int computeScrollOffset(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0617u.m3856b(c0561a0, this.f2638c, m3540r(!this.f2657v), m3539q(!this.f2657v), this, this.f2657v, this.f2644i);
    }

    public final int computeScrollRange(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C0617u.m3857c(c0561a0, this.f2638c, m3540r(!this.f2657v), m3539q(!this.f2657v), this, this.f2657v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z.b
    public PointF computeScrollVectorForPosition(int i) {
        int iM3530h = m3530h(i);
        PointF pointF = new PointF();
        if (iM3530h == 0) {
            return null;
        }
        if (this.f2640e == 0) {
            pointF.x = iM3530h;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iM3530h;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeVerticalScrollExtent(RecyclerView.C0561a0 c0561a0) {
        return computeScrollExtent(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeVerticalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return computeScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeVerticalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return computeScrollRange(c0561a0);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3525d0(C0596d c0596d, int i, int i2) {
        int iM3593o = c0596d.m3593o();
        if (i == -1) {
            if (c0596d.m3598t() + iM3593o <= i2) {
                this.f2645j.set(c0596d.f2676e, false);
            }
        } else if (c0596d.m3594p() - iM3593o >= i2) {
            this.f2645j.set(c0596d.f2676e, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m3526e() {
        int iM3595q = this.f2637b[0].m3595q(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2636a; i++) {
            if (this.f2637b[i].m3595q(Integer.MIN_VALUE) != iM3595q) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m3527e0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3528f() {
        int iM3599u = this.f2637b[0].m3599u(Integer.MIN_VALUE);
        for (int i = 1; i < this.f2636a; i++) {
            if (this.f2637b[i].m3599u(Integer.MIN_VALUE) != iM3599u) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m3529g(View view, C0595c c0595c, C0609m c0609m) {
        if (c0609m.f2903e == 1) {
            if (c0595c.f2671f) {
                m3520a(view);
                return;
            } else {
                c0595c.f2670e.m3579a(view);
                return;
            }
        }
        if (c0595c.f2671f) {
            m3509P(view);
        } else {
            c0595c.f2670e.m3604z(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return this.f2640e == 0 ? new C0595c(-2, -1) : new C0595c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0595c((ViewGroup.MarginLayoutParams) layoutParams) : new C0595c(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public final int m3530h(int i) {
        if (getChildCount() == 0) {
            return this.f2644i ? 1 : -1;
        }
        return (i < m3548z()) != this.f2644i ? -1 : 1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3531i() {
        int iM3548z;
        int iM3495A;
        if (getChildCount() == 0 || this.f2649n == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f2644i) {
            iM3548z = m3495A();
            iM3495A = m3548z();
        } else {
            iM3548z = m3548z();
            iM3495A = m3495A();
        }
        if (iM3548z == 0 && m3503I() != null) {
            this.f2648m.m3550b();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f2656u) {
            return false;
        }
        int i = this.f2644i ? -1 : 1;
        int i2 = iM3495A + 1;
        LazySpanLookup.FullSpanItem fullSpanItemM3553e = this.f2648m.m3553e(iM3548z, i2, i, true);
        if (fullSpanItemM3553e == null) {
            this.f2656u = false;
            this.f2648m.m3552d(i2);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemM3553e2 = this.f2648m.m3553e(iM3548z, fullSpanItemM3553e.mPosition, i * (-1), true);
        LazySpanLookup lazySpanLookup = this.f2648m;
        if (fullSpanItemM3553e2 == null) {
            lazySpanLookup.m3552d(fullSpanItemM3553e.mPosition);
        } else {
            lazySpanLookup.m3552d(fullSpanItemM3553e2.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean isAutoMeasureEnabled() {
        return this.f2649n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3532j(C0596d c0596d) {
        boolean z;
        if (!this.f2644i) {
            if (c0596d.m3598t() > this.f2638c.mo3838m()) {
                z = c0596d.m3597s(c0596d.f2672a.get(0)).f2671f;
                return !z;
            }
            return false;
        }
        if (c0596d.m3594p() < this.f2638c.mo3834i()) {
            ArrayList<View> arrayList = c0596d.f2672a;
            z = c0596d.m3597s(arrayList.get(arrayList.size() - 1)).f2671f;
            return !z;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final LazySpanLookup.FullSpanItem m3533k(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f2636a];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            fullSpanItem.mGapPerSpan[i2] = i - this.f2637b[i2].m3595q(i);
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: l */
    public final LazySpanLookup.FullSpanItem m3534l(int i) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.mGapPerSpan = new int[this.f2636a];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            fullSpanItem.mGapPerSpan[i2] = this.f2637b[i2].m3599u(i) - i;
        }
        return fullSpanItem;
    }

    /* JADX INFO: renamed from: m */
    public final void m3535m() {
        this.f2638c = AbstractC0614r.m3827b(this, this.f2640e);
        this.f2639d = AbstractC0614r.m3827b(this, 1 - this.f2640e);
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
    public final int m3536n(RecyclerView.C0586v c0586v, C0609m c0609m, RecyclerView.C0561a0 c0561a0) {
        int i;
        int iM3496B;
        C0596d c0596dM3500F;
        int iM3499E;
        int iMo3830e;
        int iMo3838m;
        int iMo3830e2;
        ?? r0;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r8 = 0;
        staggeredGridLayoutManager.f2645j.set(0, staggeredGridLayoutManager.f2636a, true);
        if (staggeredGridLayoutManager.f2642g.f2907i) {
            i = c0609m.f2903e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE;
        } else {
            i = c0609m.f2903e == 1 ? c0609m.f2905g + c0609m.f2900b : c0609m.f2904f - c0609m.f2900b;
        }
        int i2 = i;
        staggeredGridLayoutManager.m3517X(c0609m.f2903e, i2);
        boolean z = staggeredGridLayoutManager.f2644i;
        AbstractC0614r abstractC0614r = staggeredGridLayoutManager.f2638c;
        int iMo3834i = z ? abstractC0614r.mo3834i() : abstractC0614r.mo3838m();
        boolean z2 = false;
        ?? r1 = staggeredGridLayoutManager;
        while (c0609m.m3809a(c0561a0) && (r1.f2642g.f2907i || !r1.f2645j.isEmpty())) {
            View viewM3810b = c0609m.m3810b(c0586v);
            C0595c c0595c = (C0595c) viewM3810b.getLayoutParams();
            int iM3417b = c0595c.m3417b();
            int iM3555g = r1.f2648m.m3555g(iM3417b);
            ?? r5 = iM3555g == -1 ? 1 : r8;
            if (r5 != 0) {
                c0596dM3500F = c0595c.f2671f ? r1.f2637b[r8] : r1.m3500F(c0609m);
                r1.f2648m.m3562n(iM3417b, c0596dM3500F);
            } else {
                c0596dM3500F = r1.f2637b[iM3555g];
            }
            C0596d c0596d = c0596dM3500F;
            c0595c.f2670e = c0596d;
            if (c0609m.f2903e == 1) {
                r1.addView(viewM3810b);
            } else {
                r1.addView(viewM3810b, r8);
            }
            r1.m3505L(viewM3810b, c0595c, r8);
            int i3 = c0609m.f2903e;
            boolean z3 = c0595c.f2671f;
            if (i3 == 1) {
                iMo3830e = z3 ? r1.m3496B(iMo3834i) : c0596d.m3595q(iMo3834i);
                iM3499E = r1.f2638c.mo3830e(viewM3810b) + iMo3830e;
                if (r5 != 0 && c0595c.f2671f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3533k = r1.m3533k(iMo3830e);
                    fullSpanItemM3533k.mGapDir = -1;
                    fullSpanItemM3533k.mPosition = iM3417b;
                    r1.f2648m.m3549a(fullSpanItemM3533k);
                }
            } else {
                iM3499E = z3 ? r1.m3499E(iMo3834i) : c0596d.m3599u(iMo3834i);
                iMo3830e = iM3499E - r1.f2638c.mo3830e(viewM3810b);
                if (r5 != 0 && c0595c.f2671f) {
                    LazySpanLookup.FullSpanItem fullSpanItemM3534l = r1.m3534l(iM3499E);
                    fullSpanItemM3534l.mGapDir = 1;
                    fullSpanItemM3534l.mPosition = iM3417b;
                    r1.f2648m.m3549a(fullSpanItemM3534l);
                }
            }
            if (c0595c.f2671f && c0609m.f2902d == -1) {
                if (r5 != 0) {
                    r1.f2656u = true;
                } else {
                    if (!(c0609m.f2903e == 1 ? r1.m3526e() : r1.m3528f())) {
                        LazySpanLookup.FullSpanItem fullSpanItemM3554f = r1.f2648m.m3554f(iM3417b);
                        if (fullSpanItemM3554f != null) {
                            fullSpanItemM3554f.mHasUnwantedGapAfter = true;
                        }
                        r1.f2656u = true;
                    }
                }
            }
            r1.m3529g(viewM3810b, c0595c, c0609m);
            if (r1.isLayoutRTL() && r1.f2640e == 1) {
                boolean z4 = c0595c.f2671f;
                AbstractC0614r abstractC0614r2 = r1.f2639d;
                iMo3830e2 = z4 ? abstractC0614r2.mo3834i() : abstractC0614r2.mo3834i() - (((r1.f2636a - 1) - c0596d.f2676e) * r1.f2641f);
                iMo3838m = iMo3830e2 - r1.f2639d.mo3830e(viewM3810b);
            } else {
                iMo3838m = c0595c.f2671f ? r1.f2639d.mo3838m() : (c0596d.f2676e * r1.f2641f) + r1.f2639d.mo3838m();
                iMo3830e2 = r1.f2639d.mo3830e(viewM3810b) + iMo3838m;
            }
            int i4 = iMo3830e2;
            int i5 = iMo3838m;
            if (r1.f2640e == 1) {
                r1.layoutDecoratedWithMargins(viewM3810b, i5, iMo3830e, i4, iM3499E);
                r0 = this;
            } else {
                r1.layoutDecoratedWithMargins(viewM3810b, iMo3830e, i5, iM3499E, i4);
                r0 = r1;
            }
            boolean z5 = c0595c.f2671f;
            C0609m c0609m2 = r0.f2642g;
            if (z5) {
                r0.m3517X(c0609m2.f2903e, i2);
            } else {
                r0.m3525d0(c0596d, c0609m2.f2903e, i2);
            }
            r0.m3510Q(c0586v, r0.f2642g);
            if (r0.f2642g.f2906h && viewM3810b.hasFocusable()) {
                boolean z6 = c0595c.f2671f;
                BitSet bitSet = r0.f2645j;
                if (z6) {
                    bitSet.clear();
                } else {
                    bitSet.set(c0596d.f2676e, false);
                }
            }
            z2 = true;
            r8 = 0;
            r1 = r0;
        }
        if (!z2) {
            r1.m3510Q(c0586v, r1.f2642g);
        }
        int i6 = r1.f2642g.f2903e;
        AbstractC0614r abstractC0614r3 = r1.f2638c;
        if (i6 == -1) {
            iM3496B = r1.f2638c.mo3838m() - r1.m3499E(abstractC0614r3.mo3838m());
        } else {
            iM3496B = r1.m3496B(abstractC0614r3.mo3834i()) - r1.f2638c.mo3834i();
        }
        if (iM3496B > 0) {
            return Math.min(c0609m.f2900b, iM3496B);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int[] m3537o(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            dpq0.m117417a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3584f();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            this.f2637b[i2].m3601w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            this.f2637b[i2].m3601w(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onAdapterChanged(@Nullable RecyclerView.Adapter adapter, @Nullable RecyclerView.Adapter adapter2) {
        this.f2648m.m3550b();
        for (int i = 0; i < this.f2636a; i++) {
            this.f2637b[i].m3583e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0586v c0586v) {
        super.onDetachedFromWindow(recyclerView, c0586v);
        removeCallbacks(this.f2659x);
        for (int i = 0; i < this.f2636a; i++) {
            this.f2637b[i].m3583e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        View viewFindContainingItemView;
        View viewM3596r;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        resolveShouldLayoutReverse();
        int iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i);
        if (iConvertFocusDirectionToLayoutDirection == Integer.MIN_VALUE) {
            return null;
        }
        C0595c c0595c = (C0595c) viewFindContainingItemView.getLayoutParams();
        boolean z = c0595c.f2671f;
        C0596d c0596d = c0595c.f2670e;
        int iM3495A = iConvertFocusDirectionToLayoutDirection == 1 ? m3495A() : m3548z();
        m3522b0(iM3495A, c0561a0);
        m3515V(iConvertFocusDirectionToLayoutDirection);
        C0609m c0609m = this.f2642g;
        c0609m.f2901c = c0609m.f2902d + iM3495A;
        c0609m.f2900b = (int) (this.f2638c.mo3839n() * 0.33333334f);
        C0609m c0609m2 = this.f2642g;
        c0609m2.f2906h = true;
        c0609m2.f2899a = false;
        m3536n(c0586v, c0609m2, c0561a0);
        this.f2650o = this.f2644i;
        if (!z && (viewM3596r = c0596d.m3596r(iM3495A, iConvertFocusDirectionToLayoutDirection)) != null && viewM3596r != viewFindContainingItemView) {
            return viewM3596r;
        }
        if (m3507N(iConvertFocusDirectionToLayoutDirection)) {
            for (int i2 = this.f2636a - 1; i2 >= 0; i2--) {
                View viewM3596r2 = this.f2637b[i2].m3596r(iM3495A, iConvertFocusDirectionToLayoutDirection);
                if (viewM3596r2 != null && viewM3596r2 != viewFindContainingItemView) {
                    return viewM3596r2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2636a; i3++) {
                View viewM3596r3 = this.f2637b[i3].m3596r(iM3495A, iConvertFocusDirectionToLayoutDirection);
                if (viewM3596r3 != null && viewM3596r3 != viewFindContainingItemView) {
                    return viewM3596r3;
                }
            }
        }
        boolean z2 = (this.f2643h ^ true) == (iConvertFocusDirectionToLayoutDirection == -1);
        if (!z) {
            View viewFindViewByPosition = findViewByPosition(z2 ? c0596d.m3585g() : c0596d.m3588j());
            if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
                return viewFindViewByPosition;
            }
        }
        if (m3507N(iConvertFocusDirectionToLayoutDirection)) {
            for (int i4 = this.f2636a - 1; i4 >= 0; i4--) {
                if (i4 != c0596d.f2676e) {
                    C0596d[] c0596dArr = this.f2637b;
                    View viewFindViewByPosition2 = findViewByPosition(z2 ? c0596dArr[i4].m3585g() : c0596dArr[i4].m3588j());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2636a; i5++) {
                C0596d[] c0596dArr2 = this.f2637b;
                View viewFindViewByPosition3 = findViewByPosition(z2 ? c0596dArr2[i5].m3585g() : c0596dArr2[i5].m3588j());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM3540r = m3540r(false);
            View viewM3539q = m3539q(false);
            if (viewM3540r == null || viewM3539q == null) {
                return;
            }
            int position = getPosition(viewM3540r);
            int position2 = getPosition(viewM3539q);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m3502H(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2648m.m3550b();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m3502H(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m3502H(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3502H(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        m3506M(c0586v, c0561a0, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutCompleted(RecyclerView.C0561a0 c0561a0) {
        super.onLayoutCompleted(c0561a0);
        this.f2646k = -1;
        this.f2647l = Integer.MIN_VALUE;
        this.f2652q = null;
        this.f2655t.m3573c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f2652q = savedState;
            if (this.f2646k != -1) {
                savedState.m3567a();
                this.f2652q.m3568b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public Parcelable onSaveInstanceState() {
        int iM3599u;
        int iMo3838m;
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
        savedState.mAnchorPosition = this.f2650o ? m3495A() : m3548z();
        savedState.mVisibleAnchorPosition = m3541s();
        int i = this.f2636a;
        savedState.mSpanOffsetsSize = i;
        savedState.mSpanOffsets = new int[i];
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            boolean z = this.f2650o;
            C0596d[] c0596dArr = this.f2637b;
            if (z) {
                iM3599u = c0596dArr[i2].m3595q(Integer.MIN_VALUE);
                if (iM3599u != Integer.MIN_VALUE) {
                    iMo3838m = this.f2638c.mo3834i();
                    iM3599u -= iMo3838m;
                }
            } else {
                iM3599u = c0596dArr[i2].m3599u(Integer.MIN_VALUE);
                if (iM3599u != Integer.MIN_VALUE) {
                    iMo3838m = this.f2638c.mo3838m();
                    iM3599u -= iMo3838m;
                }
            }
            savedState.mSpanOffsets[i2] = iM3599u;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onScrollStateChanged(int i) {
        if (i == 0) {
            m3531i();
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m3538p(int i) {
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
    public View m3539q(boolean z) {
        int iMo3838m = this.f2638c.mo3838m();
        int iMo3834i = this.f2638c.mo3834i();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo3832g = this.f2638c.mo3832g(childAt);
            int iMo3829d = this.f2638c.mo3829d(childAt);
            if (iMo3829d > iMo3838m && iMo3832g < iMo3834i) {
                if (iMo3829d <= iMo3834i || !z) {
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
    public View m3540r(boolean z) {
        int iMo3838m = this.f2638c.mo3838m();
        int iMo3834i = this.f2638c.mo3834i();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo3832g = this.f2638c.mo3832g(childAt);
            if (this.f2638c.mo3829d(childAt) > iMo3838m && iMo3832g < iMo3834i) {
                if (iMo3832g >= iMo3838m || !z) {
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
    public int m3541s() {
        View viewM3539q = this.f2644i ? m3539q(true) : m3540r(true);
        if (viewM3539q == null) {
            return -1;
        }
        return getPosition(viewM3539q);
    }

    public int scrollBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m3508O(i, c0561a0);
        int iM3536n = m3536n(c0586v, this.f2642g, c0561a0);
        if (this.f2642g.f2900b >= iM3536n) {
            i = i < 0 ? -iM3536n : iM3536n;
        }
        this.f2638c.mo3843r(-i);
        this.f2650o = this.f2644i;
        C0609m c0609m = this.f2642g;
        c0609m.f2900b = 0;
        m3510Q(c0586v, c0609m);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        return scrollBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void scrollToPosition(int i) {
        SavedState savedState = this.f2652q;
        if (savedState != null && savedState.mAnchorPosition != i) {
            savedState.m3567a();
        }
        this.f2646k = i;
        this.f2647l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        return scrollBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f2640e == 1) {
            iChooseSize2 = RecyclerView.AbstractC0579o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            iChooseSize = RecyclerView.AbstractC0579o.chooseSize(i, (this.f2641f * this.f2636a) + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0579o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            iChooseSize2 = RecyclerView.AbstractC0579o.chooseSize(i2, (this.f2641f * this.f2636a) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            wg3.m206174a("invalid orientation.");
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i == this.f2640e) {
            return;
        }
        this.f2640e = i;
        AbstractC0614r abstractC0614r = this.f2638c;
        this.f2638c = this.f2639d;
        this.f2639d = abstractC0614r;
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        C0610n c0610n = new C0610n(recyclerView.getContext());
        c0610n.setTargetPosition(i);
        startSmoothScroll(c0610n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean supportsPredictiveItemAnimations() {
        return this.f2652q == null;
    }

    /* JADX INFO: renamed from: t */
    public int[] m3542t(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            dpq0.m117417a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3586h();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: u */
    public int[] m3543u(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            dpq0.m117417a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3587i();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: v */
    public final int m3544v(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i) {
                return position;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public int[] m3545w(int[] iArr) {
        int i = this.f2636a;
        if (iArr == null) {
            iArr = new int[i];
        } else if (iArr.length < i) {
            dpq0.m117417a("Provided int[]'s size must be more than or equal to span count. Expected:", this.f2636a, ", array size:", iArr.length);
            return null;
        }
        for (int i2 = 0; i2 < this.f2636a; i2++) {
            iArr[i2] = this.f2637b[i2].m3589k();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: x */
    public final void m3546x(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        int iMo3834i;
        int iM3496B = m3496B(Integer.MIN_VALUE);
        if (iM3496B != Integer.MIN_VALUE && (iMo3834i = this.f2638c.mo3834i() - iM3496B) > 0) {
            int i = iMo3834i - (-scrollBy(-iMo3834i, c0586v, c0561a0));
            if (!z || i <= 0) {
                return;
            }
            this.f2638c.mo3843r(i);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3547y(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        int iMo3838m;
        int iM3499E = m3499E(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iM3499E != Integer.MAX_VALUE && (iMo3838m = iM3499E - this.f2638c.mo3838m()) > 0) {
            int iScrollBy = iMo3838m - scrollBy(iMo3838m, c0586v, c0561a0);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f2638c.mo3843r(-iScrollBy);
        }
    }

    /* JADX INFO: renamed from: z */
    public int m3548z() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0595c extends RecyclerView.C0580p {

        /* JADX INFO: renamed from: e */
        public C0596d f2670e;

        /* JADX INFO: renamed from: f */
        public boolean f2671f;

        public C0595c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: renamed from: g */
        public final int m3575g() {
            C0596d c0596d = this.f2670e;
            if (c0596d == null) {
                return -1;
            }
            return c0596d.f2676e;
        }

        /* JADX INFO: renamed from: h */
        public boolean m3576h() {
            return this.f2671f;
        }

        /* JADX INFO: renamed from: i */
        public void m3577i(boolean z) {
            this.f2671f = z;
        }

        public C0595c(int i, int i2) {
            super(i, i2);
        }

        public C0595c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0595c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0595c(context, attributeSet);
    }

    public static class LazySpanLookup {

        /* JADX INFO: renamed from: a */
        public int[] f2660a;

        /* JADX INFO: renamed from: b */
        public List<FullSpanItem> f2661b;

        /* JADX INFO: renamed from: a */
        public void m3549a(FullSpanItem fullSpanItem) {
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
        public void m3550b() {
            int[] iArr = this.f2660a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2661b = null;
        }

        /* JADX INFO: renamed from: c */
        public void m3551c(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f2660a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m3563o(i)];
                this.f2660a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2660a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: d */
        public int m3552d(int i) {
            List<FullSpanItem> list = this.f2661b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2661b.get(size).mPosition >= i) {
                        this.f2661b.remove(size);
                    }
                }
            }
            return m3556h(i);
        }

        /* JADX INFO: renamed from: e */
        public FullSpanItem m3553e(int i, int i2, int i3, boolean z) {
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
        public FullSpanItem m3554f(int i) {
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
        public int m3555g(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* JADX INFO: renamed from: h */
        public int m3556h(int i) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int iM3557i = m3557i(i);
            int[] iArr2 = this.f2660a;
            if (iM3557i == -1) {
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2660a.length;
            }
            int iMin = Math.min(iM3557i + 1, iArr2.length);
            Arrays.fill(this.f2660a, i, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: i */
        public final int m3557i(int i) {
            if (this.f2661b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemM3554f = m3554f(i);
            if (fullSpanItemM3554f != null) {
                this.f2661b.remove(fullSpanItemM3554f);
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
        public void m3558j(int i, int i2) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m3551c(i3);
            int[] iArr2 = this.f2660a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f2660a, i, i3, -1);
            m3560l(i, i2);
        }

        /* JADX INFO: renamed from: k */
        public void m3559k(int i, int i2) {
            int[] iArr = this.f2660a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m3551c(i3);
            int[] iArr2 = this.f2660a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f2660a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m3561m(i, i2);
        }

        /* JADX INFO: renamed from: l */
        public final void m3560l(int i, int i2) {
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
        public final void m3561m(int i, int i2) {
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
        public void m3562n(int i, C0596d c0596d) {
            m3551c(i);
            this.f2660a[i] = c0596d.f2676e;
        }

        /* JADX INFO: renamed from: o */
        public int m3563o(int i) {
            int length = this.f2660a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C0591a();
            int mGapDir;
            int[] mGapPerSpan;
            boolean mHasUnwantedGapAfter;
            int mPosition;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C0591a implements Parcelable.Creator<FullSpanItem> {
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
            public int m3564a(int i) {
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
        m3516W(i);
        this.f2642g = new C0609m();
        m3535m();
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0592a();
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
        public class C0592a implements Parcelable.Creator<SavedState> {
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
        public void m3567a() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        /* JADX INFO: renamed from: b */
        public void m3568b() {
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
