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
import p149l.C17055gc;
import p149l.k250;
import p149l.qq3;

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
    public AbstractC0553c f2540g;

    /* JADX INFO: renamed from: h */
    public final Rect f2541h;

    /* JADX INFO: renamed from: i */
    public boolean f2542i;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0551a extends AbstractC0553c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: e */
        public int mo3328e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0553c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        /* JADX INFO: renamed from: a */
        public static int m3332a(SparseIntArray sparseIntArray, int i) {
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
        public int m3333b(int i, int i2) {
            if (!this.mCacheSpanGroupIndices) {
                return m3335d(i, i2);
            }
            int i3 = this.mSpanGroupIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iM3335d = m3335d(i, i2);
            this.mSpanGroupIndexCache.put(i, iM3335d);
            return iM3335d;
        }

        /* JADX INFO: renamed from: c */
        public int m3334c(int i, int i2) {
            if (!this.mCacheSpanIndices) {
                return mo3328e(i, i2);
            }
            int i3 = this.mSpanIndexCache.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iMo3328e = mo3328e(i, i2);
            this.mSpanIndexCache.put(i, iMo3328e);
            return iMo3328e;
        }

        /* JADX INFO: renamed from: d */
        public int m3335d(int i, int i2) {
            int i3;
            int i4;
            int iM3334c;
            int iM3332a;
            if (!this.mCacheSpanGroupIndices || (iM3332a = m3332a(this.mSpanGroupIndexCache, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iM3334c = 0;
            } else {
                i3 = this.mSpanGroupIndexCache.get(iM3332a);
                i4 = iM3332a + 1;
                iM3334c = m3334c(iM3332a, i2) + mo3329f(iM3332a);
                if (iM3334c == i2) {
                    i3++;
                    iM3334c = 0;
                }
            }
            int iMo3329f = mo3329f(i);
            while (i4 < i) {
                int iMo3329f2 = mo3329f(i4);
                iM3334c += iMo3329f2;
                if (iM3334c == i2) {
                    i3++;
                    iM3334c = 0;
                } else if (iM3334c > i2) {
                    i3++;
                    iM3334c = iMo3329f2;
                }
                i4++;
            }
            return iM3334c + iMo3329f > i2 ? i3 + 1 : i3;
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
        public int mo3328e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo3329f(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = m3332a(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.mo3329f(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.mo3329f(r2)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c.mo3328e(int, int):int");
        }

        /* JADX INFO: renamed from: f */
        public abstract int mo3329f(int i);

        /* JADX INFO: renamed from: g */
        public void m3336g() {
            this.mSpanGroupIndexCache.clear();
        }

        /* JADX INFO: renamed from: h */
        public void m3337h() {
            this.mSpanIndexCache.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0551a();
        this.f2541h = new Rect();
        m3325u(RecyclerView.AbstractC0577o.getProperties(context, attributeSet, i, i2).f2588b);
    }

    /* JADX INFO: renamed from: f */
    public static int[] m3307f(int[] iArr, int i, int i2) {
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
    public final void m3308a(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i, boolean z) {
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
            C0552b c0552b = (C0552b) view.getLayoutParams();
            int iM3320p = m3320p(c0584v, c0588z, getPosition(view));
            c0552b.f2544f = iM3320p;
            c0552b.f2543e = i5;
            i5 += iM3320p;
            i2 += i4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3309c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0552b c0552b = (C0552b) getChildAt(i).getLayoutParams();
            int iM3408b = c0552b.m3408b();
            this.f2538e.put(iM3408b, c0552b.m3331h());
            this.f2539f.put(iM3408b, c0552b.m3330g());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean checkLayoutParams(RecyclerView.C0578p c0578p) {
        return c0578p instanceof C0552b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.C0588z c0588z, LinearLayoutManager.C0557c c0557c, RecyclerView.AbstractC0577o.c cVar) {
        int iMo3329f = this.f2535b;
        for (int i = 0; i < this.f2535b && c0557c.m3350c(c0588z) && iMo3329f > 0; i++) {
            int i2 = c0557c.f2557d;
            cVar.mo3406a(i2, Math.max(0, c0557c.f2560g));
            iMo3329f -= this.f2540g.mo3329f(i2);
            c0557c.f2557d += c0557c.f2558e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeHorizontalScrollOffset(RecyclerView.C0588z c0588z) {
        return this.f2542i ? m3312h(c0588z) : super.computeHorizontalScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeHorizontalScrollRange(RecyclerView.C0588z c0588z) {
        return this.f2542i ? m3313i(c0588z) : super.computeHorizontalScrollRange(c0588z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollOffset(RecyclerView.C0588z c0588z) {
        return this.f2542i ? m3312h(c0588z) : super.computeVerticalScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int computeVerticalScrollRange(RecyclerView.C0588z c0588z) {
        return this.f2542i ? m3313i(c0588z) : super.computeVerticalScrollRange(c0588z);
    }

    /* JADX INFO: renamed from: e */
    public final void m3310e(int i) {
        this.f2536c = m3307f(this.f2536c, this.f2535b, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z, boolean z2) {
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
        int iM3487c = c0588z.m3487c();
        ensureLayoutState();
        int iMo3837m = this.mOrientationHelper.mo3837m();
        int iMo3833i = this.mOrientationHelper.mo3833i();
        View view = null;
        View view2 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iM3487c && m3319o(c0584v, c0588z, position) == 0) {
                if (((RecyclerView.C0578p) childAt.getLayoutParams()).m3411e()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.mo3831g(childAt) < iMo3833i && this.mOrientationHelper.mo3828d(childAt) >= iMo3837m) {
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
    public final void m3311g() {
        this.f2538e.clear();
        this.f2539f.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C0552b(-2, -1) : new C0552b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0552b((ViewGroup.MarginLayoutParams) layoutParams) : new C0552b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int getColumnCountForAccessibility(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (this.mOrientation == 1) {
            return this.f2535b;
        }
        if (c0588z.m3487c() < 1) {
            return 0;
        }
        return m3318n(c0584v, c0588z, c0588z.m3487c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int getRowCountForAccessibility(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (this.mOrientation == 0) {
            return this.f2535b;
        }
        if (c0588z.m3487c() < 1) {
            return 0;
        }
        return m3318n(c0584v, c0588z, c0588z.m3487c() - 1) + 1;
    }

    /* JADX INFO: renamed from: h */
    public final int m3312h(RecyclerView.C0588z c0588z) {
        if (getChildCount() != 0 && c0588z.m3487c() != 0) {
            ensureLayoutState();
            boolean zIsSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!zIsSmoothScrollbarEnabled, true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!zIsSmoothScrollbarEnabled, true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                int iM3333b = this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b);
                int iM3333b2 = this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b);
                int iMax = this.mShouldReverseLayout ? Math.max(0, ((this.f2540g.m3333b(c0588z.m3487c() - 1, this.f2535b) + 1) - Math.max(iM3333b, iM3333b2)) - 1) : Math.max(0, Math.min(iM3333b, iM3333b2));
                if (zIsSmoothScrollbarEnabled) {
                    return Math.round((iMax * (Math.abs(this.mOrientationHelper.mo3828d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3831g(viewFindFirstVisibleChildClosestToStart)) / ((this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b) - this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b)) + 1))) + (this.mOrientationHelper.mo3837m() - this.mOrientationHelper.mo3831g(viewFindFirstVisibleChildClosestToStart)));
                }
                return iMax;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final int m3313i(RecyclerView.C0588z c0588z) {
        if (getChildCount() != 0 && c0588z.m3487c() != 0) {
            ensureLayoutState();
            View viewFindFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View viewFindFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (viewFindFirstVisibleChildClosestToStart != null && viewFindFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f2540g.m3333b(c0588z.m3487c() - 1, this.f2535b) + 1;
                }
                return (int) (((this.mOrientationHelper.mo3828d(viewFindFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo3831g(viewFindFirstVisibleChildClosestToStart)) / ((this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToEnd), this.f2535b) - this.f2540g.m3333b(getPosition(viewFindFirstVisibleChildClosestToStart), this.f2535b)) + 1)) * (this.f2540g.m3333b(c0588z.m3487c() - 1, this.f2535b) + 1));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m3314j(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, LinearLayoutManager.C0555a c0555a, int i) {
        boolean z = i == 1;
        int iM3319o = m3319o(c0584v, c0588z, c0555a.f2546b);
        if (z) {
            while (iM3319o > 0) {
                int i2 = c0555a.f2546b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                c0555a.f2546b = i3;
                iM3319o = m3319o(c0584v, c0588z, i3);
            }
            return;
        }
        int iM3487c = c0588z.m3487c() - 1;
        int i4 = c0555a.f2546b;
        while (i4 < iM3487c) {
            int i5 = i4 + 1;
            int iM3319o2 = m3319o(c0584v, c0588z, i5);
            if (iM3319o2 <= iM3319o) {
                break;
            }
            i4 = i5;
            iM3319o = iM3319o2;
        }
        c0555a.f2546b = i4;
    }

    /* JADX INFO: renamed from: k */
    public final void m3315k() {
        View[] viewArr = this.f2537d;
        if (viewArr == null || viewArr.length != this.f2535b) {
            this.f2537d = new View[this.f2535b];
        }
    }

    /* JADX INFO: renamed from: l */
    public int m3316l(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f2536c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f2536c;
        int i3 = this.f2535b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void layoutChunk(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, LinearLayoutManager.C0557c c0557c, LinearLayoutManager.C0556b c0556b) {
        int i;
        int i2;
        int paddingTop;
        int iMo3830f;
        int childMeasureSpec;
        int childMeasureSpec2;
        View viewM3351d;
        GridLayoutManager gridLayoutManager = this;
        int iMo3836l = gridLayoutManager.mOrientationHelper.mo3836l();
        int paddingLeft = 0;
        boolean z = iMo3836l != 1073741824;
        int i3 = gridLayoutManager.getChildCount() > 0 ? gridLayoutManager.f2536c[gridLayoutManager.f2535b] : 0;
        if (z) {
            gridLayoutManager.m3327w();
        }
        boolean z2 = c0557c.f2558e == 1;
        int iM3319o = gridLayoutManager.f2535b;
        if (!z2) {
            iM3319o = gridLayoutManager.m3319o(c0584v, c0588z, c0557c.f2557d) + gridLayoutManager.m3320p(c0584v, c0588z, c0557c.f2557d);
        }
        int i4 = 0;
        while (i4 < gridLayoutManager.f2535b && c0557c.m3350c(c0588z) && iM3319o > 0) {
            int i5 = c0557c.f2557d;
            int iM3320p = gridLayoutManager.m3320p(c0584v, c0588z, i5);
            if (iM3320p > gridLayoutManager.f2535b) {
                throw new IllegalArgumentException("Item at position " + i5 + " requires " + iM3320p + " spans but GridLayoutManager has only " + gridLayoutManager.f2535b + " spans.");
            }
            iM3319o -= iM3320p;
            if (iM3319o < 0 || (viewM3351d = c0557c.m3351d(c0584v)) == null) {
                break;
            }
            gridLayoutManager.f2537d[i4] = viewM3351d;
            i4++;
        }
        if (i4 == 0) {
            c0556b.f2551b = true;
            return;
        }
        gridLayoutManager.m3308a(c0584v, c0588z, i4, z2);
        float f = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            View view = gridLayoutManager.f2537d[i7];
            if (c0557c.f2565l == null) {
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
            gridLayoutManager.m3323s(view, iMo3836l, false);
            int iMo3829e = gridLayoutManager.mOrientationHelper.mo3829e(view);
            if (iMo3829e > i6) {
                i6 = iMo3829e;
            }
            float fMo3830f = (gridLayoutManager.mOrientationHelper.mo3830f(view) * 1.0f) / ((C0552b) view.getLayoutParams()).f2544f;
            if (fMo3830f > f) {
                f = fMo3830f;
            }
        }
        if (z) {
            gridLayoutManager.m3322r(f, i3);
            i6 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                View view2 = gridLayoutManager.f2537d[i8];
                gridLayoutManager.m3323s(view2, 1073741824, true);
                int iMo3829e2 = gridLayoutManager.mOrientationHelper.mo3829e(view2);
                if (iMo3829e2 > i6) {
                    i6 = iMo3829e2;
                }
            }
        }
        for (int i9 = 0; i9 < i4; i9++) {
            View view3 = gridLayoutManager.f2537d[i9];
            if (gridLayoutManager.mOrientationHelper.mo3829e(view3) != i6) {
                C0552b c0552b = (C0552b) view3.getLayoutParams();
                Rect rect = c0552b.f2592b;
                int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0552b).topMargin + ((ViewGroup.MarginLayoutParams) c0552b).bottomMargin;
                int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0552b).leftMargin + ((ViewGroup.MarginLayoutParams) c0552b).rightMargin;
                int iM3316l = gridLayoutManager.m3316l(c0552b.f2543e, c0552b.f2544f);
                if (gridLayoutManager.mOrientation == 1) {
                    childMeasureSpec2 = RecyclerView.AbstractC0577o.getChildMeasureSpec(iM3316l, 1073741824, i11, ((ViewGroup.MarginLayoutParams) c0552b).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - i10, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - i11, 1073741824);
                    childMeasureSpec = RecyclerView.AbstractC0577o.getChildMeasureSpec(iM3316l, 1073741824, i10, ((ViewGroup.MarginLayoutParams) c0552b).height, false);
                    childMeasureSpec2 = iMakeMeasureSpec;
                }
                gridLayoutManager.m3324t(view3, childMeasureSpec2, childMeasureSpec, true);
            }
        }
        c0556b.f2550a = i6;
        int i12 = gridLayoutManager.mOrientation;
        int i13 = c0557c.f2559f;
        if (i12 == 1) {
            i2 = c0557c.f2555b;
            if (i13 == -1) {
                paddingTop = i2 - i6;
            } else {
                paddingTop = i2;
                i2 = i6 + i2;
            }
            i = paddingLeft;
        } else {
            int i14 = c0557c.f2555b;
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
        int iMo3830f2 = i;
        int i15 = 0;
        while (true) {
            View[] viewArr = gridLayoutManager.f2537d;
            if (i15 >= i4) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            int i16 = i2;
            View view4 = viewArr[i15];
            C0552b c0552b2 = (C0552b) view4.getLayoutParams();
            if (gridLayoutManager.mOrientation == 1) {
                if (gridLayoutManager.isLayoutRTL()) {
                    iMo3830f2 = gridLayoutManager.f2536c[gridLayoutManager.f2535b - c0552b2.f2543e] + gridLayoutManager.getPaddingLeft();
                    paddingLeft = iMo3830f2 - gridLayoutManager.mOrientationHelper.mo3830f(view4);
                } else {
                    paddingLeft = gridLayoutManager.getPaddingLeft() + gridLayoutManager.f2536c[c0552b2.f2543e];
                    iMo3830f2 = gridLayoutManager.mOrientationHelper.mo3830f(view4) + paddingLeft;
                }
                iMo3830f = i16;
            } else {
                paddingTop = gridLayoutManager.getPaddingTop() + gridLayoutManager.f2536c[c0552b2.f2543e];
                iMo3830f = gridLayoutManager.mOrientationHelper.mo3830f(view4) + paddingTop;
            }
            gridLayoutManager.layoutDecoratedWithMargins(view4, paddingLeft, paddingTop, iMo3830f2, iMo3830f);
            i2 = iMo3830f;
            if (c0552b2.m3411e() || c0552b2.m3410d()) {
                c0556b.f2552c = true;
            }
            c0556b.f2553d = view4.hasFocusable() | c0556b.f2553d;
            i15++;
            gridLayoutManager = this;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m3317m() {
        return this.f2535b;
    }

    /* JADX INFO: renamed from: n */
    public final int m3318n(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (!c0588z.m3490f()) {
            return this.f2540g.m3333b(i, this.f2535b);
        }
        int iM3457f = c0584v.m3457f(i);
        if (iM3457f == -1) {
            return 0;
        }
        return this.f2540g.m3333b(iM3457f, this.f2535b);
    }

    /* JADX INFO: renamed from: o */
    public final int m3319o(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (!c0588z.m3490f()) {
            return this.f2540g.m3334c(i, this.f2535b);
        }
        int i2 = this.f2539f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM3457f = c0584v.m3457f(i);
        if (iM3457f == -1) {
            return 0;
        }
        return this.f2540g.m3334c(iM3457f, this.f2535b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, LinearLayoutManager.C0555a c0555a, int i) {
        super.onAnchorReady(c0584v, c0588z, c0555a, i);
        m3327w();
        if (c0588z.m3487c() > 0 && !c0588z.m3490f()) {
            m3314j(c0584v, c0588z, c0555a, i);
        }
        m3315k();
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0584v r26, androidx.recyclerview.widget.RecyclerView.C0588z r27) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.C0584v c0584v, @NonNull RecyclerView.C0588z c0588z, @NonNull C17055gc c17055gc) {
        super.onInitializeAccessibilityNodeInfo(c0584v, c0588z, c17055gc);
        c17055gc.m125427o0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, View view, C17055gc c17055gc) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0552b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, c17055gc);
            return;
        }
        C0552b c0552b = (C0552b) layoutParams;
        int iM3318n = m3318n(c0584v, c0588z, c0552b.m3408b());
        if (this.mOrientation == 0) {
            c17055gc.m125432r0(C17055gc.f.m125463a(c0552b.m3330g(), c0552b.m3331h(), iM3318n, 1, false, false));
        } else {
            c17055gc.m125432r0(C17055gc.f.m125463a(iM3318n, 1, c0552b.m3330g(), c0552b.m3331h(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f2540g.m3337h();
        this.f2540g.m3336g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f2540g.m3337h();
        this.f2540g.m3336g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f2540g.m3337h();
        this.f2540g.m3336g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f2540g.m3337h();
        this.f2540g.m3336g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f2540g.m3337h();
        this.f2540g.m3336g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (c0588z.m3490f()) {
            m3309c();
        }
        super.onLayoutChildren(c0584v, c0588z);
        m3311g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutCompleted(RecyclerView.C0588z c0588z) {
        super.onLayoutCompleted(c0588z);
        this.f2534a = false;
    }

    /* JADX INFO: renamed from: p */
    public final int m3320p(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        if (!c0588z.m3490f()) {
            return this.f2540g.mo3329f(i);
        }
        int i2 = this.f2538e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM3457f = c0584v.m3457f(i);
        if (iM3457f == -1) {
            return 1;
        }
        return this.f2540g.mo3329f(iM3457f);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0553c m3321q() {
        return this.f2540g;
    }

    /* JADX INFO: renamed from: r */
    public final void m3322r(float f, int i) {
        m3310e(Math.max(Math.round(f * this.f2535b), i));
    }

    /* JADX INFO: renamed from: s */
    public final void m3323s(View view, int i, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        C0552b c0552b = (C0552b) view.getLayoutParams();
        Rect rect = c0552b.f2592b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0552b).topMargin + ((ViewGroup.MarginLayoutParams) c0552b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0552b).leftMargin + ((ViewGroup.MarginLayoutParams) c0552b).rightMargin;
        int iM3316l = m3316l(c0552b.f2543e, c0552b.f2544f);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.AbstractC0577o.getChildMeasureSpec(iM3316l, i, i3, ((ViewGroup.MarginLayoutParams) c0552b).width, false);
            childMeasureSpec = RecyclerView.AbstractC0577o.getChildMeasureSpec(this.mOrientationHelper.mo3838n(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c0552b).height, true);
        } else {
            int childMeasureSpec3 = RecyclerView.AbstractC0577o.getChildMeasureSpec(iM3316l, i, i2, ((ViewGroup.MarginLayoutParams) c0552b).height, false);
            int childMeasureSpec4 = RecyclerView.AbstractC0577o.getChildMeasureSpec(this.mOrientationHelper.mo3838n(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c0552b).width, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        m3324t(view, childMeasureSpec2, childMeasureSpec, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        m3327w();
        m3315k();
        return super.scrollHorizontallyBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        m3327w();
        m3315k();
        return super.scrollVerticallyBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.f2536c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.AbstractC0577o.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f2536c;
            iChooseSize = RecyclerView.AbstractC0577o.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.AbstractC0577o.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f2536c;
            iChooseSize2 = RecyclerView.AbstractC0577o.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (z) {
            qq3.m175877a("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.setStackFromEnd(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f2534a;
    }

    /* JADX INFO: renamed from: t */
    public final void m3324t(View view, int i, int i2, boolean z) {
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        if (z ? shouldReMeasureChild(view, i, i2, c0578p) : shouldMeasureChild(view, i, i2, c0578p)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3325u(int i) {
        if (i == this.f2535b) {
            return;
        }
        this.f2534a = true;
        if (i < 1) {
            k250.m144273a("Span count should be at least 1. Provided ", i);
            return;
        }
        this.f2535b = i;
        this.f2540g.m3337h();
        requestLayout();
    }

    /* JADX INFO: renamed from: v */
    public void m3326v(AbstractC0553c abstractC0553c) {
        this.f2540g = abstractC0553c;
    }

    /* JADX INFO: renamed from: w */
    public final void m3327w() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m3310e(height - paddingTop);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0552b extends RecyclerView.C0578p {

        /* JADX INFO: renamed from: e */
        public int f2543e;

        /* JADX INFO: renamed from: f */
        public int f2544f;

        public C0552b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        /* JADX INFO: renamed from: g */
        public int m3330g() {
            return this.f2543e;
        }

        /* JADX INFO: renamed from: h */
        public int m3331h() {
            return this.f2544f;
        }

        public C0552b(int i, int i2) {
            super(i, i2);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        public C0552b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2543e = -1;
            this.f2544f = 0;
        }

        public C0552b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2543e = -1;
            this.f2544f = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0552b(context, attributeSet);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0551a();
        this.f2541h = new Rect();
        m3325u(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f2534a = false;
        this.f2535b = -1;
        this.f2538e = new SparseIntArray();
        this.f2539f = new SparseIntArray();
        this.f2540g = new C0551a();
        this.f2541h = new Rect();
        m3325u(i);
    }
}
