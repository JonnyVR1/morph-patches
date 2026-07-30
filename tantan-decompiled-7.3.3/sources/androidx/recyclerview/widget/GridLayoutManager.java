package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;
import p153l.C15967bc;
import p153l.pr3;
import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    public boolean f2534a;

    /* JADX INFO: renamed from: b */
    public int f2535b;

    /* JADX INFO: renamed from: c */
    public int[] f2536c;

    /* JADX INFO: renamed from: d */
    public View[] f2537d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f2538e;

    /* JADX INFO: renamed from: f */
    public final SparseIntArray f2539f;

    /* JADX INFO: renamed from: g */
    public AbstractC0554c f2540g;

    /* JADX INFO: renamed from: h */
    public final Rect f2541h;

    /* JADX INFO: renamed from: i */
    public boolean f2542i;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0552a extends AbstractC0554c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: e */
        public int mo3329e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0554c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        /* JADX INFO: renamed from: a */
        public static int m3333a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX INFO: renamed from: b */
        public int m3334b(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return m3336d(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iM3336d = m3336d(i, i2);
            this.mSpanGroupIndexCache.put(i, iM3336d);
            return iM3336d;
        }

        /* JADX INFO: renamed from: c */
        public int m3335c(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return mo3329e(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iMo3329e = mo3329e(i, i2);
            this.mSpanIndexCache.put(i, iMo3329e);
            return iMo3329e;
        }

        /* JADX INFO: renamed from: d */
        public int m3336d(int i, int i2) {
            int i3;
            int i4;
            int iM3335c;
            int iM3333a;
            if (!this.mCacheSpanGroupIndices || (iM3333a = m3333a(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iM3335c = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(iM3333a);
                i4 = iM3333a + 1;
                iM3335c = m3335c(iM3333a, i2) + mo3330f(iM3333a);
                if (iM3335c == i2) {
                    i3++;
                    iM3335c = 0;
                }
            }
            int iMo3330f = mo3330f(i);
            while (i4 < i) {
                int iMo3330f2 = mo3330f(i4);
                iM3335c += iMo3330f2;
                if (iM3335c == i2) {
                    i3++;
                    iM3335c = 0;
                } else if (iM3335c > i2) {
                    i3++;
                    iM3335c = iMo3330f2;
                }
                i4++;
            }
            return iM3335c + iMo3330f > i2 ? i3 + 1 : i3;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0024  */
        /* JADX WARN: Code duplicated, block: B:14:0x002b  */
        /* JADX WARN: Code duplicated, block: B:15:0x002d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX INFO: renamed from: e */
        public int mo3329e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3330f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = m3333a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.mo3330f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.mo3330f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c.mo3329e(int, int):int");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo3330f(int i);

        /* JADX INFO: renamed from: g */
        public void m3337g() {
            this.mSpanGroupIndexCache.clear();
        }

        /* JADX INFO: renamed from: h */
        public void m3338h() {
            this.mSpanIndexCache.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0552a();
        this.f2541h = new Rect();
        m3326u(RecyclerView.AbstractC0579o.getProperties(context, attributeSet, i, i2).f2605b);
    }

    /* JADX INFO: renamed from: f */
    public static int[] m3308f(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m3309a(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f2537d[i2];
            C0553b c0553b = (C0553b) view.getLayoutParams();
            int iM3321p = m3321p(c0586v, c0561a0, getPosition(view));
            c0553b.f2544f = iM3321p;
            c0553b.f2543e = i5;
            i5 += iM3321p;
            i2 += i4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3310c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0553b c0553b = (C0553b) getChildAt(i).getLayoutParams();
            int iM3417b = c0553b.m3417b();
            this.f2538e.put(iM3417b, c0553b.m3332h());
            this.f2539f.put(iM3417b, c0553b.m3331g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean checkLayoutParams(RecyclerView.C0580p c0580p) {
        return c0580p instanceof C0553b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.C0561a0 c0561a0, LinearLayoutManager.C0558c c0558c, RecyclerView.AbstractC0579o.c cVar) {
        int iMo3330f = this.f2535b;
        for (int i = 0; i < this.f2535b && c0558c.m3351c(c0561a0) && iMo3330f > 0; i++) {
            int i2 = c0558c.f2557d;
            cVar.mo3415a(i2, Math.max(0, c0558c.f2560g));
            iMo3330f -= this.f2540g.mo3330f(i2);
            c0558c.f2557d += c0558c.f2558e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeHorizontalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return this.f2542i ? m3313h(c0561a0) : super.computeHorizontalScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeHorizontalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return this.f2542i ? m3314i(c0561a0) : super.computeHorizontalScrollRange(c0561a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeVerticalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return this.f2542i ? m3313h(c0561a0) : super.computeVerticalScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int computeVerticalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return this.f2542i ? m3314i(c0561a0) : super.computeVerticalScrollRange(c0561a0);
    }

    /* JADX INFO: renamed from: e */
    public final void m3311e(int i) {
        this.f2536c = m3308f(this.f2536c, this.f2535b, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z, boolean z2) {
        int i;
        int childCount;
        int childCount2 = getChildCount();
        int i2 = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
        }
        int iM3361c = c0561a0.m3361c();
        ensureLayoutState();
        int iMo3838m = this.mOrientationHelper.mo3838m();
        int iMo3834i = this.mOrientationHelper.mo3834i();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM3361c && m3320o(c0586v, c0561a0, position) == 0) {
                if (((RecyclerView.C0580p) childAt.getLayoutParams()).m3420e()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo3832g(childAt) < iMo3834i && this.mOrientationHelper.mo3829d(childAt) >= iMo3838m) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: g */
    public final void m3312g() {
        this.f2538e.clear();
        this.f2539f.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C0553b(-2, -1) : new C0553b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0553b((ViewGroup.MarginLayoutParams) layoutParams) : new C0553b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int getColumnCountForAccessibility(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (this.mOrientation == 1) {
            return this.f2535b;
        }
        if (c0561a0.m3361c() < 1) {
            return 0;
        }
        return m3319n(c0586v, c0561a0, c0561a0.m3361c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int getRowCountForAccessibility(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (this.mOrientation == 0) {
            return this.f2535b;
        }
        if (c0561a0.m3361c() < 1) {
            return 0;
        }
        return m3319n(c0586v, c0561a0, c0561a0.m3361c() - 1) + 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m3313h(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() != 0 && c0561a0.m3361c() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iM3334b = this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b);
                int iM3334b2 = this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f2540g.m3334b(c0561a0.m3361c() - 1, this.f2535b) + 1) - Math.max(iM3334b, iM3334b2)) - 1) : Math.max(0, Math.min(iM3334b, iM3334b2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo3829d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3832g(viewFindFirstVisibleChildClosestToStart)) / ((this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b) - this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b)) + 1))) + (this.mOrientationHelper.mo3838m() - this.mOrientationHelper.mo3832g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m3314i(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() != 0 && c0561a0.m3361c() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f2540g.m3334b(c0561a0.m3361c() - 1, this.f2535b) + 1;
                }
                return (int) (((this.mOrientationHelper.mo3829d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3832g(viewFindFirstVisibleChildClosestToStart)) / ((this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b) - this.f2540g.m3334b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b)) + 1)) * (this.f2540g.m3334b(c0561a0.m3361c() - 1, this.f2535b) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m3315j(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, LinearLayoutManager.C0556a c0556a, int i) {
        boolean z = i == 1;
        int iM3320o = m3320o(c0586v, c0561a0, c0556a.f2546b);
        if (z) {
            while (iM3320o > 0) {
                int i2 = c0556a.f2546b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c0556a.f2546b = i3;
                iM3320o = m3320o(c0586v, c0561a0, i3);
            }
            return;
        }
        int iM3361c = c0561a0.m3361c() - 1;
        int i4 = c0556a.f2546b;
        while (i4 < iM3361c) {
            int i5 = i4 + 1;
            int iM3320o2 = m3320o(c0586v, c0561a0, i5);
            if (iM3320o2 <= iM3320o) {
                break;
            }
            i4 = i5;
            iM3320o = iM3320o2;
        }
        c0556a.f2546b = i4;
    }

    /* JADX INFO: renamed from: k */
    public final void m3316k() {
        View[] viewArr = this.f2537d;
        if (viewArr == null || viewArr.length != this.f2535b) {
            this.f2537d = new View[this.f2535b];
        }
    }

    /* JADX INFO: renamed from: l */
    public int m3317l(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f2536c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2536c;
        int i3 = this.f2535b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, LinearLayoutManager.C0558c c0558c, LinearLayoutManager.C0557b c0557b) {
        int i;
        int i2;
        int paddingTop;
        int iMo3831f;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewM3352d;
        GridLayoutManager gridLayoutManager = this;
        int iMo3837l = gridLayoutManager.mOrientationHelper.mo3837l();
        int paddingLeft = 0;
        boolean z = iMo3837l != 1073741824;
        int i3 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.f2536c[gridLayoutManager.f2535b] : 0;
        if (z) {
            gridLayoutManager.m3328w();
        }
        boolean z2 = c0558c.f2558e == 1;
        int iM3320o = gridLayoutManager.f2535b;
        if (!z2) {
            iM3320o = gridLayoutManager.m3320o(c0586v, c0561a0, c0558c.f2557d) + gridLayoutManager.m3321p(c0586v, c0561a0, c0558c.f2557d);
        }
        int i4 = 0;
        while (i4 < gridLayoutManager.f2535b && c0558c.m3351c(c0561a0) && iM3320o > 0) {
            int i5 = c0558c.f2557d;
            int iM3321p = gridLayoutManager.m3321p(c0586v, c0561a0, i5);
            if (iM3321p > gridLayoutManager.f2535b) {
                throw new IllegalArgumentException("Item at position " + i5 + " requires " + iM3321p + " spans but GridLayoutManager has only " + gridLayoutManager.f2535b + " spans.");
            }
            iM3320o -= iM3321p;
            if (iM3320o < 0 || (viewM3352d = c0558c.m3352d(c0586v)) == null) {
                break;
            }
            gridLayoutManager.f2537d[i4] = viewM3352d;
            i4++;
        }
        if (i4 == 0) {
            c0557b.f2551b = true;
            return;
        }
        gridLayoutManager.m3309a(c0586v, c0561a0, i4, z2);
        float f = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            View view = gridLayoutManager.f2537d[i7];
            if (c0558c.f2565l == null) {
                if (z2) {
                    gridLayoutManager.addView(view);
                } else {
                    gridLayoutManager.addView(view, 0);
                }
            } else if (z2) {
                gridLayoutManager.addDisappearingView(view);
            } else {
                gridLayoutManager.addDisappearingView(view, 0);
            }
            gridLayoutManager.calculateItemDecorationsForChild(view, gridLayoutManager.f2541h);
            gridLayoutManager.m3324s(view, iMo3837l, false);
            int iMo3830e = gridLayoutManager.mOrientationHelper.mo3830e(view);
            if (iMo3830e > i6) {
                i6 = iMo3830e;
            }
            float fMo3831f = (gridLayoutManager.mOrientationHelper.mo3831f(view) * 1.0f) / ((C0553b) view.getLayoutParams()).f2544f;
            if (fMo3831f > f) {
                f = fMo3831f;
            }
        }
        if (z) {
            gridLayoutManager.m3323r(f, i3);
            i6 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                View view2 = gridLayoutManager.f2537d[i8];
                gridLayoutManager.m3324s(view2, 1073741824, true);
                int iMo3830e2 = gridLayoutManager.mOrientationHelper.mo3830e(view2);
                if (iMo3830e2 > i6) {
                    i6 = iMo3830e2;
                }
            }
        }
        for (int i9 = 0; i9 < i4; i9++) {
            View view3 = gridLayoutManager.f2537d[i9];
            if (gridLayoutManager.mOrientationHelper.mo3830e(view3) != i6) {
                C0553b c0553b = (C0553b) view3.getLayoutParams();
                Rect rect = c0553b.f2609b;
                int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0553b).topMargin + ((ViewGroup.MarginLayoutParams) c0553b).bottomMargin;
                int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0553b).leftMargin + ((ViewGroup.MarginLayoutParams) c0553b).rightMargin;
                int iM3317l = gridLayoutManager.m3317l(c0553b.f2543e, c0553b.f2544f);
                if (gridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.AbstractC0579o.getChildMeasureSpec(iM3317l, 1073741824, i11, ((ViewGroup.MarginLayoutParams) c0553b).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - i10, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - i11, 1073741824);
                    childMeasureSpec = RecyclerView.AbstractC0579o.getChildMeasureSpec(iM3317l, 1073741824, i10, ((ViewGroup.MarginLayoutParams) c0553b).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                gridLayoutManager.m3325t(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        c0557b.f2550a = i6;
        int i12 = gridLayoutManager.mOrientation;
        int i13 = c0558c.f2559f;
        if (i12 == 1) {
            i2 = c0558c.f2555b;
            if (i13 == -1) {
                paddingTop = i2 - i6;
            } else {
                paddingTop = i2;
                i2 = i6 + i2;
            }
            i = paddingLeft;
        } else {
            int i14 = c0558c.f2555b;
            if (i13 == -1) {
                paddingLeft = i14 - i6;
                i = i14;
            } else {
                i = i6 + i14;
                paddingLeft = i14;
            }
            i2 = 0;
            paddingTop = 0;
        }
        int iMo3831f2 = i;
        int i15 = 0;
        while (true) {
            View[] viewArr = gridLayoutManager.f2537d;
            if (i15 >= i4) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int i16 = i2;
            View view4 = viewArr[i15];
            C0553b c0553b2 = (C0553b) view4.getLayoutParams();
            if (gridLayoutManager.mOrientation == 1) {
                if (gridLayoutManager.isLayoutRTL()) {
                    iMo3831f2 = gridLayoutManager.f2536c[gridLayoutManager.f2535b - c0553b2.f2543e] + gridLayoutManager.getPaddingLeft();
                    paddingLeft = iMo3831f2 - gridLayoutManager.mOrientationHelper.mo3831f(view4);
                } else {
                    paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.f2536c[c0553b2.f2543e];
                    iMo3831f2 = gridLayoutManager.mOrientationHelper.mo3831f(view4) + paddingLeft;
                }
                iMo3831f = i16;
            } else {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.f2536c[c0553b2.f2543e];
                iMo3831f = gridLayoutManager.mOrientationHelper.mo3831f(view4) + paddingTop;
            }
            gridLayoutManager.layoutDecoratedWithMargins(view4, paddingLeft, paddingTop, iMo3831f2, iMo3831f);
            i2 = iMo3831f;
            if (c0553b2.m3420e() || c0553b2.m3419d()) {
                c0557b.f2552c = true;
            }
            c0557b.f2553d = view4.hasFocusable() | c0557b.f2553d;
            i15++;
            gridLayoutManager = this;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m3318m() {
        return this.f2535b;
    }

    /* JADX INFO: renamed from: n */
    public final int m3319n(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (!c0561a0.m3364f()) {
            return this.f2540g.m3334b(i, this.f2535b);
        }
        int iM3466f = c0586v.m3466f(i);
        if (iM3466f == -1) {
            return 0;
        }
        return this.f2540g.m3334b(iM3466f, this.f2535b);
    }

    /* JADX INFO: renamed from: o */
    public final int m3320o(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (!c0561a0.m3364f()) {
            return this.f2540g.m3335c(i, this.f2535b);
        }
        int i2 = this.f2539f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM3466f = c0586v.m3466f(i);
        if (iM3466f == -1) {
            return 0;
        }
        return this.f2540g.m3335c(iM3466f, this.f2535b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, LinearLayoutManager.C0556a c0556a, int i) {
        super.onAnchorReady(c0586v, c0561a0, c0556a, i);
        m3328w();
        if (c0561a0.m3361c() > 0 && !c0561a0.m3364f()) {
            m3315j(c0586v, c0561a0, c0556a, i);
        }
        m3316k();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onFocusSearchFailed(View view, int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int childCount;
        int i2;
        int childCount2;
        View view2;
        View view3;
        View view4;
        int i3;
        int i4;
        int i5;
        boolean zHasFocusable;
        int i6;
        RecyclerView.C0586v c0586v2 = c0586v;
        RecyclerView.C0561a0 c0561a1 = c0561a0;
        View viewFindContainingItemView = findContainingItemView(view);
        View view5 = null;
        if (viewFindContainingItemView == null) {
            return null;
        }
        C0553b c0553b = (C0553b) viewFindContainingItemView.getLayoutParams();
        int i7 = c0553b.f2543e;
        int i8 = c0553b.f2544f + i7;
        if (super.onFocusSearchFailed(view, i, c0586v, c0561a0) == null) {
            return null;
        }
        if ((convertFocusDirectionToLayoutDirection(i) == 1) != this.mShouldReverseLayout) {
            childCount2 = getChildCount() - 1;
            childCount = -1;
            i2 = -1;
        } else {
            childCount = getChildCount();
            i2 = 1;
            childCount2 = 0;
        }
        boolean z = this.mOrientation == 1 && isLayoutRTL();
        int iM3319n = m3319n(c0586v2, c0561a1, childCount2);
        int i9 = -1;
        int i10 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i11 = childCount2;
        View view6 = null;
        while (i11 != childCount) {
            int iM3319n2 = m3319n(c0586v2, c0561a1, i11);
            View childAt = getChildAt(i11);
            if (childAt == viewFindContainingItemView) {
                break;
            }
            if (!childAt.hasFocusable() || iM3319n2 == iM3319n) {
                C0553b c0553b2 = (C0553b) childAt.getLayoutParams();
                int i12 = c0553b2.f2543e;
                view2 = viewFindContainingItemView;
                int i13 = c0553b2.f2544f + i12;
                if (childAt.hasFocusable() && i12 == i7 && i13 == i8) {
                    return childAt;
                }
                if (!(childAt.hasFocusable() && view5 == null) && (childAt.hasFocusable() || view6 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i8) - Math.max(i12, i7);
                    if (!childAt.hasFocusable()) {
                        if (view3 == null) {
                            view4 = view6;
                            i3 = iMin;
                            if (isViewPartiallyVisible(childAt, false, true)) {
                                i4 = iMin2;
                                if (iMin3 > i4) {
                                    i5 = i10;
                                } else if (iMin3 == i4) {
                                    i5 = i10;
                                    if (z == (i12 > i5)) {
                                    }
                                    iMin = i3;
                                    view5 = view3;
                                    i11 += i2;
                                    c0586v2 = c0586v;
                                    c0561a1 = c0561a0;
                                    viewFindContainingItemView = view2;
                                } else {
                                    i5 = i10;
                                }
                                zHasFocusable = childAt.hasFocusable();
                                i6 = c0553b2.f2543e;
                                if (zHasFocusable) {
                                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                                    i10 = i5;
                                    iMin2 = i4;
                                    i9 = i6;
                                    view6 = view4;
                                    view5 = childAt;
                                } else {
                                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                                    view6 = childAt;
                                    i10 = i6;
                                    iMin = i3;
                                    view5 = view3;
                                }
                                i11 += i2;
                                c0586v2 = c0586v;
                                c0561a1 = c0561a0;
                                viewFindContainingItemView = view2;
                            }
                            i10 = i5;
                            iMin2 = i4;
                            view6 = view4;
                            iMin = i3;
                            view5 = view3;
                            i11 += i2;
                            c0586v2 = c0586v;
                            c0561a1 = c0561a0;
                            viewFindContainingItemView = view2;
                        }
                        i5 = i10;
                        i4 = iMin2;
                        i10 = i5;
                        iMin2 = i4;
                        view6 = view4;
                        iMin = i3;
                        view5 = view3;
                        i11 += i2;
                        c0586v2 = c0586v;
                        c0561a1 = c0561a0;
                        viewFindContainingItemView = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                view4 = view6;
                i3 = iMin;
                i5 = i10;
                i4 = iMin2;
                zHasFocusable = childAt.hasFocusable();
                i6 = c0553b2.f2543e;
                if (zHasFocusable) {
                    iMin = Math.min(i13, i8) - Math.max(i12, i7);
                    i10 = i5;
                    iMin2 = i4;
                    i9 = i6;
                    view6 = view4;
                    view5 = childAt;
                } else {
                    iMin2 = Math.min(i13, i8) - Math.max(i12, i7);
                    view6 = childAt;
                    i10 = i6;
                    iMin = i3;
                    view5 = view3;
                }
                i11 += i2;
                c0586v2 = c0586v;
                c0561a1 = c0561a0;
                viewFindContainingItemView = view2;
            } else {
                if (view5 != null) {
                    break;
                }
                view2 = viewFindContainingItemView;
                view3 = view5;
            }
            view4 = view6;
            i3 = iMin;
            i5 = i10;
            i4 = iMin2;
            i10 = i5;
            iMin2 = i4;
            view6 = view4;
            iMin = i3;
            view5 = view3;
            i11 += i2;
            c0586v2 = c0586v;
            c0561a1 = c0561a0;
            viewFindContainingItemView = view2;
        }
        View view7 = view5;
        return view7 != null ? view7 : view6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.C0586v c0586v, @NonNull RecyclerView.C0561a0 c0561a0, @NonNull C15967bc c15967bc) {
        super.onInitializeAccessibilityNodeInfo(c0586v, c0561a0, c15967bc);
        c15967bc.m103431o0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, View view, C15967bc c15967bc) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0553b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c15967bc);
            return;
        }
        C0553b c0553b = (C0553b) layoutParams;
        int iM3319n = m3319n(c0586v, c0561a0, c0553b.m3417b());
        if (this.mOrientation == 0) {
            c15967bc.m103436r0(C15967bc.f.m103467a(c0553b.m3331g(), c0553b.m3332h(), iM3319n, 1, false, false));
        } else {
            c15967bc.m103436r0(C15967bc.f.m103467a(iM3319n, 1, c0553b.m3331g(), c0553b.m3332h(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f2540g.m3338h();
        this.f2540g.m3337g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2540g.m3338h();
        this.f2540g.m3337g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2540g.m3338h();
        this.f2540g.m3337g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f2540g.m3338h();
        this.f2540g.m3337g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2540g.m3338h();
        this.f2540g.m3337g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (c0561a0.m3364f()) {
            m3310c();
        }
        super.onLayoutChildren(c0586v, c0561a0);
        m3312g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutCompleted(RecyclerView.C0561a0 c0561a0) {
        super.onLayoutCompleted(c0561a0);
        this.f2534a = false;
    }

    /* JADX INFO: renamed from: p */
    public final int m3321p(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        if (!c0561a0.m3364f()) {
            return this.f2540g.mo3330f(i);
        }
        int i2 = this.f2538e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM3466f = c0586v.m3466f(i);
        if (iM3466f == -1) {
            return 1;
        }
        return this.f2540g.mo3330f(iM3466f);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0554c m3322q() {
        return this.f2540g;
    }

    /* JADX INFO: renamed from: r */
    public final void m3323r(float f, int i) {
        m3311e(Math.max(Math.round(f * this.f2535b), i));
    }

    /* JADX INFO: renamed from: s */
    public final void m3324s(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C0553b c0553b = (C0553b) view.getLayoutParams();
        Rect rect = c0553b.f2609b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0553b).topMargin + ((ViewGroup.MarginLayoutParams) c0553b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0553b).leftMargin + ((ViewGroup.MarginLayoutParams) c0553b).rightMargin;
        int iM3317l = m3317l(c0553b.f2543e, c0553b.f2544f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC0579o.getChildMeasureSpec(iM3317l, i, i3, ((ViewGroup.MarginLayoutParams) c0553b).width, false);
            childMeasureSpec = RecyclerView.AbstractC0579o.getChildMeasureSpec(this.mOrientationHelper.mo3839n(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c0553b).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC0579o.getChildMeasureSpec(iM3317l, i, i2, ((ViewGroup.MarginLayoutParams) c0553b).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC0579o.getChildMeasureSpec(this.mOrientationHelper.mo3839n(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c0553b).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        m3325t(view, childMeasureSpec2, childMeasureSpec, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        m3328w();
        m3316k();
        return super.scrollHorizontallyBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        m3328w();
        m3316k();
        return super.scrollVerticallyBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f2536c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC0579o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f2536c;
            iChooseSize = RecyclerView.AbstractC0579o.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0579o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f2536c;
            iChooseSize2 = RecyclerView.AbstractC0579o.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            pr3.m173429a("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2534a;
    }

    /* JADX INFO: renamed from: t */
    public final void m3325t(View view, int i, int i2, boolean z) {
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, c0580p) : shouldMeasureChild(view, i, i2, c0580p)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3326u(int i) {
        if (i == this.f2535b) {
            return;
        }
        this.f2534a = true;
        if (i < 1) {
            za50.m219101a("Span count should be at least 1. Provided ", i);
            return;
        }
        this.f2535b = i;
        this.f2540g.m3338h();
        requestLayout();
    }

    /* JADX INFO: renamed from: v */
    public void m3327v(AbstractC0554c abstractC0554c) {
        this.f2540g = abstractC0554c;
    }

    /* JADX INFO: renamed from: w */
    public final void m3328w() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m3311e(height - paddingTop);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0553b extends RecyclerView.C0580p {

        /* JADX INFO: renamed from: e */
        public int f2543e;

        /* JADX INFO: renamed from: f */
        public int f2544f;

        public C0553b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        /* JADX INFO: renamed from: g */
        public int m3331g() {
            return this.f2543e;
        }

        /* JADX INFO: renamed from: h */
        public int m3332h() {
            return this.f2544f;
        }

        public C0553b(int i, int i2) {
            super(i, i2);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        public C0553b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        public C0553b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2543e = -1;
            this.f2544f = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0553b(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0552a();
        this.f2541h = new Rect();
        m3326u(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0552a();
        this.f2541h = new Rect();
        m3326u(i);
    }
}
