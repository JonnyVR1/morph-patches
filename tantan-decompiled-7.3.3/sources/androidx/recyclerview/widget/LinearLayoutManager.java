package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import java.util.List;
import p153l.azk0;
import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0579o implements C0607k.h, RecyclerView.AbstractC0590z.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0556a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0557b mLayoutChunkResult;
    private C0558c mLayoutState;
    int mOrientation;
    AbstractC0614r mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0556a {

        /* JADX INFO: renamed from: a */
        public AbstractC0614r f2545a;

        /* JADX INFO: renamed from: b */
        public int f2546b;

        /* JADX INFO: renamed from: c */
        public int f2547c;

        /* JADX INFO: renamed from: d */
        public boolean f2548d;

        /* JADX INFO: renamed from: e */
        public boolean f2549e;

        public C0556a() {
            m3347e();
        }

        /* JADX INFO: renamed from: a */
        public void m3343a() {
            boolean z = this.f2548d;
            AbstractC0614r abstractC0614r = this.f2545a;
            this.f2547c = z ? abstractC0614r.mo3834i() : abstractC0614r.mo3838m();
        }

        /* JADX INFO: renamed from: b */
        public void m3344b(View view, int i) {
            boolean z = this.f2548d;
            AbstractC0614r abstractC0614r = this.f2545a;
            if (z) {
                this.f2547c = abstractC0614r.mo3829d(view) + this.f2545a.m3840o();
            } else {
                this.f2547c = abstractC0614r.mo3832g(view);
            }
            this.f2546b = i;
        }

        /* JADX INFO: renamed from: c */
        public void m3345c(View view, int i) {
            int iM3840o = this.f2545a.m3840o();
            if (iM3840o >= 0) {
                m3344b(view, i);
                return;
            }
            this.f2546b = i;
            boolean z = this.f2548d;
            AbstractC0614r abstractC0614r = this.f2545a;
            if (z) {
                int iMo3834i = (abstractC0614r.mo3834i() - iM3840o) - this.f2545a.mo3829d(view);
                this.f2547c = this.f2545a.mo3834i() - iMo3834i;
                if (iMo3834i > 0) {
                    int iMo3830e = this.f2547c - this.f2545a.mo3830e(view);
                    int iMo3838m = this.f2545a.mo3838m();
                    int iMin = iMo3830e - (iMo3838m + Math.min(this.f2545a.mo3832g(view) - iMo3838m, 0));
                    if (iMin < 0) {
                        this.f2547c += Math.min(iMo3834i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo3832g = abstractC0614r.mo3832g(view);
            int iMo3838m2 = iMo3832g - this.f2545a.mo3838m();
            this.f2547c = iMo3832g;
            if (iMo3838m2 > 0) {
                int iMo3834i2 = (this.f2545a.mo3834i() - Math.min(0, (this.f2545a.mo3834i() - iM3840o) - this.f2545a.mo3829d(view))) - (iMo3832g + this.f2545a.mo3830e(view));
                if (iMo3834i2 < 0) {
                    this.f2547c -= Math.min(iMo3838m2, -iMo3834i2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m3346d(View view, RecyclerView.C0561a0 c0561a0) {
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            return !c0580p.m3420e() && c0580p.m3417b() >= 0 && c0580p.m3417b() < c0561a0.m3361c();
        }

        /* JADX INFO: renamed from: e */
        public void m3347e() {
            this.f2546b = -1;
            this.f2547c = Integer.MIN_VALUE;
            this.f2548d = false;
            this.f2549e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2546b + ", mCoordinate=" + this.f2547c + ", mLayoutFromEnd=" + this.f2548d + ", mValid=" + this.f2549e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0557b {

        /* JADX INFO: renamed from: a */
        public int f2550a;

        /* JADX INFO: renamed from: b */
        public boolean f2551b;

        /* JADX INFO: renamed from: c */
        public boolean f2552c;

        /* JADX INFO: renamed from: d */
        public boolean f2553d;

        /* JADX INFO: renamed from: a */
        public void m3348a() {
            this.f2550a = 0;
            this.f2551b = false;
            this.f2552c = false;
            this.f2553d = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0558c {

        /* JADX INFO: renamed from: b */
        public int f2555b;

        /* JADX INFO: renamed from: c */
        public int f2556c;

        /* JADX INFO: renamed from: d */
        public int f2557d;

        /* JADX INFO: renamed from: e */
        public int f2558e;

        /* JADX INFO: renamed from: f */
        public int f2559f;

        /* JADX INFO: renamed from: g */
        public int f2560g;

        /* JADX INFO: renamed from: k */
        public int f2564k;

        /* JADX INFO: renamed from: m */
        public boolean f2566m;

        /* JADX INFO: renamed from: a */
        public boolean f2554a = true;

        /* JADX INFO: renamed from: h */
        public int f2561h = 0;

        /* JADX INFO: renamed from: i */
        public int f2562i = 0;

        /* JADX INFO: renamed from: j */
        public boolean f2563j = false;

        /* JADX INFO: renamed from: l */
        public List<RecyclerView.AbstractC0569e0> f2565l = null;

        /* JADX INFO: renamed from: a */
        public void m3349a() {
            m3350b(null);
        }

        /* JADX INFO: renamed from: b */
        public void m3350b(View view) {
            View viewM3354f = m3354f(view);
            if (viewM3354f == null) {
                this.f2557d = -1;
            } else {
                this.f2557d = ((RecyclerView.C0580p) viewM3354f.getLayoutParams()).m3417b();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m3351c(RecyclerView.C0561a0 c0561a0) {
            int i = this.f2557d;
            return i >= 0 && i < c0561a0.m3361c();
        }

        /* JADX INFO: renamed from: d */
        public View m3352d(RecyclerView.C0586v c0586v) {
            if (this.f2565l != null) {
                return m3353e();
            }
            View viewM3475o = c0586v.m3475o(this.f2557d);
            this.f2557d += this.f2558e;
            return viewM3475o;
        }

        /* JADX INFO: renamed from: e */
        public final View m3353e() {
            int size = this.f2565l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2565l.get(i).itemView;
                RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
                if (!c0580p.m3420e() && this.f2557d == c0580p.m3417b()) {
                    m3350b(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public View m3354f(View view) {
            int iM3417b;
            int size = this.f2565l.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2565l.get(i2).itemView;
                RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view3.getLayoutParams();
                if (view3 != view && !c0580p.m3420e() && (iM3417b = (c0580p.m3417b() - this.f2557d) * this.f2558e) >= 0 && iM3417b < i) {
                    if (iM3417b == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = iM3417b;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0556a();
        this.mLayoutChunkResult = new C0557b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC0579o.d properties = RecyclerView.AbstractC0579o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2604a);
        setReverseLayout(properties.f2606c);
        setStackFromEnd(properties.f2607d);
    }

    private int computeScrollExtent(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0617u.m3855a(c0561a0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0617u.m3856b(c0561a0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0617u.m3857c(c0561a0, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        int iMo3834i;
        int iMo3834i2 = this.mOrientationHelper.mo3834i() - i;
        if (iMo3834i2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo3834i2, c0586v, c0561a0);
        int i3 = i + i2;
        if (!z || (iMo3834i = this.mOrientationHelper.mo3834i() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3843r(iMo3834i);
        return iMo3834i + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z) {
        int iMo3838m;
        int iMo3838m2 = i - this.mOrientationHelper.mo3838m();
        if (iMo3838m2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo3838m2, c0586v, c0561a0);
        int i3 = i + i2;
        if (!z || (iMo3838m = i3 - this.mOrientationHelper.mo3838m()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3843r(-iMo3838m);
        return i2 - iMo3838m;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i, int i2) {
        if (!c0561a0.m3366h() || getChildCount() == 0 || c0561a0.m3364f() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC0569e0> listM3471k = c0586v.m3471k();
        int size = listM3471k.size();
        int position = getPosition(getChildAt(0));
        int iMo3830e = 0;
        int iMo3830e2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.AbstractC0569e0 abstractC0569e0 = listM3471k.get(i3);
            if (!abstractC0569e0.isRemoved()) {
                boolean z = abstractC0569e0.getLayoutPosition() < position;
                boolean z2 = this.mShouldReverseLayout;
                AbstractC0614r abstractC0614r = this.mOrientationHelper;
                if (z != z2) {
                    iMo3830e += abstractC0614r.mo3830e(abstractC0569e0.itemView);
                } else {
                    iMo3830e2 += abstractC0614r.mo3830e(abstractC0569e0.itemView);
                }
            }
        }
        this.mLayoutState.f2565l = listM3471k;
        if (iMo3830e > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            C0558c c0558c = this.mLayoutState;
            c0558c.f2561h = iMo3830e;
            c0558c.f2556c = 0;
            c0558c.m3349a();
            fill(c0586v, this.mLayoutState, c0561a0, false);
        }
        if (iMo3830e2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            C0558c c0558c2 = this.mLayoutState;
            c0558c2.f2561h = iMo3830e2;
            c0558c2.f2556c = 0;
            c0558c2.m3349a();
            fill(c0586v, this.mLayoutState, c0561a0, false);
        }
        this.mLayoutState.f2565l = null;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo3832g(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.C0586v c0586v, C0558c c0558c) {
        if (!c0558c.f2554a || c0558c.f2566m) {
            return;
        }
        int i = c0558c.f2560g;
        int i2 = c0558c.f2562i;
        if (c0558c.f2559f == -1) {
            recycleViewsFromEnd(c0586v, i, i2);
        } else {
            recycleViewsFromStart(c0586v, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.C0586v c0586v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c0586v);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c0586v);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C0586v c0586v, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo3833h = (this.mOrientationHelper.mo3833h() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo3832g(childAt) < iMo3833h || this.mOrientationHelper.mo3842q(childAt) < iMo3833h) {
                    recycleChildren(c0586v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo3832g(childAt2) < iMo3833h || this.mOrientationHelper.mo3842q(childAt2) < iMo3833h) {
                recycleChildren(c0586v, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C0586v c0586v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo3829d(childAt) > i3 || this.mOrientationHelper.mo3841p(childAt) > i3) {
                    recycleChildren(c0586v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo3829d(childAt2) > i3 || this.mOrientationHelper.mo3841p(childAt2) > i3) {
                recycleChildren(c0586v, i5, i6);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, C0556a c0556a) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c0556a.m3346d(focusedChild, c0561a0)) {
            c0556a.m3345c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (viewFindReferenceChild = findReferenceChild(c0586v, c0561a0, c0556a.f2548d, z3)) == null) {
            return false;
        }
        c0556a.m3344b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!c0561a0.m3364f() && supportsPredictiveItemAnimations()) {
            int iMo3832g = this.mOrientationHelper.mo3832g(viewFindReferenceChild);
            int iMo3829d = this.mOrientationHelper.mo3829d(viewFindReferenceChild);
            int iMo3838m = this.mOrientationHelper.mo3838m();
            int iMo3834i = this.mOrientationHelper.mo3834i();
            boolean z4 = iMo3829d <= iMo3838m && iMo3832g < iMo3838m;
            if (iMo3832g >= iMo3834i && iMo3829d > iMo3834i) {
                z = true;
            }
            if (z4 || z) {
                if (c0556a.f2548d) {
                    iMo3838m = iMo3834i;
                }
                c0556a.f2547c = iMo3838m;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C0561a0 c0561a0, C0556a c0556a) {
        int i;
        if (!c0561a0.m3364f() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c0561a0.m3361c()) {
                c0556a.f2546b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.m3339a()) {
                    boolean z = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    c0556a.f2548d = z;
                    AbstractC0614r abstractC0614r = this.mOrientationHelper;
                    if (z) {
                        c0556a.f2547c = abstractC0614r.mo3834i() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        c0556a.f2547c = abstractC0614r.mo3838m() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    c0556a.f2548d = z2;
                    AbstractC0614r abstractC0614r2 = this.mOrientationHelper;
                    if (z2) {
                        c0556a.f2547c = abstractC0614r2.mo3834i() - this.mPendingScrollPositionOffset;
                    } else {
                        c0556a.f2547c = abstractC0614r2.mo3838m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c0556a.f2548d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c0556a.m3343a();
                } else {
                    if (this.mOrientationHelper.mo3830e(viewFindViewByPosition) > this.mOrientationHelper.mo3839n()) {
                        c0556a.m3343a();
                        return true;
                    }
                    int iMo3832g = this.mOrientationHelper.mo3832g(viewFindViewByPosition) - this.mOrientationHelper.mo3838m();
                    AbstractC0614r abstractC0614r3 = this.mOrientationHelper;
                    if (iMo3832g < 0) {
                        c0556a.f2547c = abstractC0614r3.mo3838m();
                        c0556a.f2548d = false;
                        return true;
                    }
                    if (abstractC0614r3.mo3834i() - this.mOrientationHelper.mo3829d(viewFindViewByPosition) < 0) {
                        c0556a.f2547c = this.mOrientationHelper.mo3834i();
                        c0556a.f2548d = true;
                        return true;
                    }
                    boolean z3 = c0556a.f2548d;
                    AbstractC0614r abstractC0614r4 = this.mOrientationHelper;
                    c0556a.f2547c = z3 ? abstractC0614r4.mo3829d(viewFindViewByPosition) + this.mOrientationHelper.m3840o() : abstractC0614r4.mo3832g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, C0556a c0556a) {
        if (updateAnchorFromPendingData(c0561a0, c0556a) || updateAnchorFromChildren(c0586v, c0561a0, c0556a)) {
            return;
        }
        c0556a.m3343a();
        c0556a.f2546b = this.mStackFromEnd ? c0561a0.m3361c() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.C0561a0 c0561a0) {
        int iMo3838m;
        this.mLayoutState.f2566m = resolveIsInfinite();
        this.mLayoutState.f2559f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0561a0, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C0558c c0558c = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c0558c.f2561h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0558c.f2562i = iMax;
        if (z2) {
            c0558c.f2561h = i3 + this.mOrientationHelper.mo3835j();
            View childClosestToEnd = getChildClosestToEnd();
            C0558c c0558c2 = this.mLayoutState;
            c0558c2.f2558e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C0558c c0558c3 = this.mLayoutState;
            c0558c2.f2557d = position + c0558c3.f2558e;
            c0558c3.f2555b = this.mOrientationHelper.mo3829d(childClosestToEnd);
            iMo3838m = this.mOrientationHelper.mo3829d(childClosestToEnd) - this.mOrientationHelper.mo3834i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f2561h += this.mOrientationHelper.mo3838m();
            C0558c c0558c4 = this.mLayoutState;
            c0558c4.f2558e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C0558c c0558c5 = this.mLayoutState;
            c0558c4.f2557d = position2 + c0558c5.f2558e;
            c0558c5.f2555b = this.mOrientationHelper.mo3832g(childClosestToStart);
            iMo3838m = (-this.mOrientationHelper.mo3832g(childClosestToStart)) + this.mOrientationHelper.mo3838m();
        }
        C0558c c0558c6 = this.mLayoutState;
        c0558c6.f2556c = i2;
        if (z) {
            c0558c6.f2556c = i2 - iMo3838m;
        }
        c0558c6.f2560g = iMo3838m;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f2556c = this.mOrientationHelper.mo3834i() - i2;
        C0558c c0558c = this.mLayoutState;
        c0558c.f2558e = this.mShouldReverseLayout ? -1 : 1;
        c0558c.f2557d = i;
        c0558c.f2559f = 1;
        c0558c.f2555b = i2;
        c0558c.f2560g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f2556c = i2 - this.mOrientationHelper.mo3838m();
        C0558c c0558c = this.mLayoutState;
        c0558c.f2557d = i;
        c0558c.f2558e = this.mShouldReverseLayout ? 1 : -1;
        c0558c.f2559f = -1;
        c0558c.f2555b = i2;
        c0558c.f2560g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.C0561a0 c0561a0, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c0561a0);
        if (this.mLayoutState.f2559f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0579o.c cVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, c0561a0);
        collectPrefetchPositionsForLayoutState(c0561a0, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.AbstractC0579o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.m3339a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.mAnchorLayoutFromEnd;
            i2 = savedState2.mAnchorPosition;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            cVar.mo3415a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C0561a0 c0561a0, C0558c c0558c, RecyclerView.AbstractC0579o.c cVar) {
        int i = c0558c.f2557d;
        if (i < 0 || i >= c0561a0.m3361c()) {
            return;
        }
        cVar.mo3415a(i, Math.max(0, c0558c.f2560g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.C0561a0 c0561a0) {
        return computeScrollExtent(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return computeScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return computeScrollRange(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0590z.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.C0561a0 c0561a0) {
        return computeScrollExtent(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.C0561a0 c0561a0) {
        return computeScrollOffset(c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.C0561a0 c0561a0) {
        return computeScrollRange(c0561a0);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i == 17) {
            return this.mOrientation == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.mOrientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.mOrientation == 0 ? 1 : Integer.MIN_VALUE;
    }

    public C0558c createLayoutState() {
        return new C0558c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.C0586v c0586v, C0558c c0558c, RecyclerView.C0561a0 c0561a0, boolean z) {
        int i = c0558c.f2556c;
        int i2 = c0558c.f2560g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0558c.f2560g = i2 + i;
            }
            recycleByLayoutState(c0586v, c0558c);
        }
        int i3 = c0558c.f2556c + c0558c.f2561h;
        C0557b c0557b = this.mLayoutChunkResult;
        while (true) {
            if ((!c0558c.f2566m && i3 <= 0) || !c0558c.m3351c(c0561a0)) {
                break;
            }
            c0557b.m3348a();
            layoutChunk(c0586v, c0561a0, c0558c, c0557b);
            if (!c0557b.f2551b) {
                c0558c.f2555b += c0557b.f2550a * c0558c.f2559f;
                if (!c0557b.f2552c || c0558c.f2565l != null || !c0561a0.m3364f()) {
                    int i4 = c0558c.f2556c;
                    int i5 = c0557b.f2550a;
                    c0558c.f2556c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c0558c.f2560g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c0557b.f2550a;
                    c0558c.f2560g = i7;
                    int i8 = c0558c.f2556c;
                    if (i8 < 0) {
                        c0558c.f2560g = i7 + i8;
                    }
                    recycleByLayoutState(c0586v, c0558c);
                }
                if (z && c0557b.f2553d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0558c.f2556c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo3832g(getChildAt(i)) < this.mOrientationHelper.mo3838m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3865a(i, i2, i3, i4) : this.mVerticalBoundCheck.m3865a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3865a(i, i2, i3, i4) : this.mVerticalBoundCheck.m3865a(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iM3361c = c0561a0.m3361c();
        int iMo3838m = this.mOrientationHelper.mo3838m();
        int iMo3834i = this.mOrientationHelper.mo3834i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo3832g = this.mOrientationHelper.mo3832g(childAt);
            int iMo3829d = this.mOrientationHelper.mo3829d(childAt);
            if (position >= 0 && position < iM3361c) {
                if (!((RecyclerView.C0580p) childAt.getLayoutParams()).m3420e()) {
                    boolean z3 = iMo3829d <= iMo3838m && iMo3832g < iMo3838m;
                    boolean z4 = iMo3832g >= iMo3834i && iMo3829d > iMo3834i;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (z3) {
                        view2 = childAt;
                    } else if (view == null) {
                        view = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return new RecyclerView.C0580p(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C0561a0 c0561a0) {
        if (c0561a0.m3363e()) {
            return this.mOrientationHelper.mo3839n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    public void layoutChunk(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, C0558c c0558c, C0557b c0557b) {
        int iMo3831f;
        int i;
        int paddingLeft;
        int i2;
        int iMo3831f2;
        View viewM3352d = c0558c.m3352d(c0586v);
        if (viewM3352d == null) {
            c0557b.f2551b = true;
            return;
        }
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) viewM3352d.getLayoutParams();
        List<RecyclerView.AbstractC0569e0> list = c0558c.f2565l;
        boolean z = this.mShouldReverseLayout;
        if (list == null) {
            if (z == (c0558c.f2559f == -1)) {
                addView(viewM3352d);
            } else {
                addView(viewM3352d, 0);
            }
        } else {
            if (z == (c0558c.f2559f == -1)) {
                addDisappearingView(viewM3352d);
            } else {
                addDisappearingView(viewM3352d, 0);
            }
        }
        measureChildWithMargins(viewM3352d, 0, 0);
        c0557b.f2550a = this.mOrientationHelper.mo3830e(viewM3352d);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo3831f2 = getWidth() - getPaddingRight();
                paddingLeft = iMo3831f2 - this.mOrientationHelper.mo3831f(viewM3352d);
            } else {
                paddingLeft = getPaddingLeft();
                iMo3831f2 = this.mOrientationHelper.mo3831f(viewM3352d) + paddingLeft;
            }
            int i3 = c0558c.f2559f;
            int i4 = c0558c.f2555b;
            if (i3 == -1) {
                i2 = i4 - c0557b.f2550a;
                iMo3831f = i4;
                i = iMo3831f2;
            } else {
                i = iMo3831f2;
                iMo3831f = c0557b.f2550a + i4;
                i2 = i4;
            }
            layoutDecoratedWithMargins(viewM3352d, paddingLeft, i2, i, iMo3831f);
            if (c0580p.m3420e() || c0580p.m3419d()) {
                c0557b.f2552c = true;
            }
            c0557b.f2553d = viewM3352d.hasFocusable();
        }
        int paddingTop = getPaddingTop();
        iMo3831f = this.mOrientationHelper.mo3831f(viewM3352d) + paddingTop;
        int i5 = c0558c.f2559f;
        int i6 = c0558c.f2555b;
        if (i5 == -1) {
            i = i6;
            paddingLeft = i6 - c0557b.f2550a;
        } else {
            i = c0557b.f2550a + i6;
            paddingLeft = i6;
        }
        i2 = paddingTop;
        layoutDecoratedWithMargins(viewM3352d, paddingLeft, i2, i, iMo3831f);
        if (c0580p.m3420e()) {
            c0557b.f2552c = true;
        } else {
            c0557b.f2552c = true;
        }
        c0557b.f2553d = viewM3352d.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, C0556a c0556a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0586v c0586v) {
        super.onDetachedFromWindow(recyclerView, c0586v);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0586v);
            c0586v.m3463c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo3839n() * MAX_SCROLL_FACTOR), false, c0561a0);
        C0558c c0558c = this.mLayoutState;
        c0558c.f2560g = Integer.MIN_VALUE;
        c0558c.f2554a = false;
        fill(c0586v, c0558c, c0561a0, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iMo3832g;
        int iMo3834i;
        int i6 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0561a0.m3361c() == 0) {
            removeAndRecycleAllViews(c0586v);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.m3339a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.f2554a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0556a c0556a = this.mAnchorInfo;
        if (!c0556a.f2549e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c0556a.m3347e();
            C0556a c0556a2 = this.mAnchorInfo;
            c0556a2.f2548d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c0586v, c0561a0, c0556a2);
            this.mAnchorInfo.f2549e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo3832g(focusedChild) >= this.mOrientationHelper.mo3834i() || this.mOrientationHelper.mo3829d(focusedChild) <= this.mOrientationHelper.mo3838m())) {
            this.mAnchorInfo.m3345c(focusedChild, getPosition(focusedChild));
        }
        C0558c c0558c = this.mLayoutState;
        c0558c.f2559f = c0558c.f2564k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0561a0, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo3838m();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo3835j();
        if (c0561a0.m3364f() && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            boolean z = this.mShouldReverseLayout;
            AbstractC0614r abstractC0614r = this.mOrientationHelper;
            if (z) {
                iMo3834i = abstractC0614r.mo3834i() - this.mOrientationHelper.mo3829d(viewFindViewByPosition);
                iMo3832g = this.mPendingScrollPositionOffset;
            } else {
                iMo3832g = abstractC0614r.mo3832g(viewFindViewByPosition) - this.mOrientationHelper.mo3838m();
                iMo3834i = this.mPendingScrollPositionOffset;
            }
            int i7 = iMo3834i - iMo3832g;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        C0556a c0556a3 = this.mAnchorInfo;
        boolean z2 = c0556a3.f2548d;
        boolean z3 = this.mShouldReverseLayout;
        if (!z2 ? !z3 : z3) {
            i6 = 1;
        }
        onAnchorReady(c0586v, c0561a0, c0556a3, i6);
        detachAndScrapAttachedViews(c0586v);
        this.mLayoutState.f2566m = resolveIsInfinite();
        this.mLayoutState.f2563j = c0561a0.m3364f();
        this.mLayoutState.f2562i = 0;
        C0556a c0556a4 = this.mAnchorInfo;
        if (c0556a4.f2548d) {
            updateLayoutStateToFillStart(c0556a4);
            C0558c c0558c2 = this.mLayoutState;
            c0558c2.f2561h = iMax;
            fill(c0586v, c0558c2, c0561a0, false);
            C0558c c0558c3 = this.mLayoutState;
            i2 = c0558c3.f2555b;
            int i8 = c0558c3.f2557d;
            int i9 = c0558c3.f2556c;
            if (i9 > 0) {
                iMax2 += i9;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0558c c0558c4 = this.mLayoutState;
            c0558c4.f2561h = iMax2;
            c0558c4.f2557d += c0558c4.f2558e;
            fill(c0586v, c0558c4, c0561a0, false);
            C0558c c0558c5 = this.mLayoutState;
            i = c0558c5.f2555b;
            int i10 = c0558c5.f2556c;
            if (i10 > 0) {
                updateLayoutStateToFillStart(i8, i2);
                C0558c c0558c6 = this.mLayoutState;
                c0558c6.f2561h = i10;
                fill(c0586v, c0558c6, c0561a0, false);
                i2 = this.mLayoutState.f2555b;
            }
        } else {
            updateLayoutStateToFillEnd(c0556a4);
            C0558c c0558c7 = this.mLayoutState;
            c0558c7.f2561h = iMax2;
            fill(c0586v, c0558c7, c0561a0, false);
            C0558c c0558c8 = this.mLayoutState;
            i = c0558c8.f2555b;
            int i11 = c0558c8.f2557d;
            int i12 = c0558c8.f2556c;
            if (i12 > 0) {
                iMax += i12;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0558c c0558c9 = this.mLayoutState;
            c0558c9.f2561h = iMax;
            c0558c9.f2557d += c0558c9.f2558e;
            fill(c0586v, c0558c9, c0561a0, false);
            C0558c c0558c10 = this.mLayoutState;
            i2 = c0558c10.f2555b;
            int i13 = c0558c10.f2556c;
            if (i13 > 0) {
                updateLayoutStateToFillEnd(i11, i);
                C0558c c0558c11 = this.mLayoutState;
                c0558c11.f2561h = i13;
                fill(c0586v, c0558c11, c0561a0, false);
                i = this.mLayoutState.f2555b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, c0586v, c0561a0, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, c0586v, c0561a0, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, c0586v, c0561a0, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, c0586v, c0561a0, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c0586v, c0561a0, i2, i);
        if (c0561a0.m3364f()) {
            this.mAnchorInfo.m3347e();
        } else {
            this.mOrientationHelper.m3844s();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.C0561a0 c0561a0) {
        super.onLayoutCompleted(c0561a0);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m3347e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.m3340b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.m3340b();
            return savedState;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.mAnchorLayoutFromEnd = z;
        if (z) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState.mAnchorOffset = this.mOrientationHelper.mo3834i() - this.mOrientationHelper.mo3829d(childClosestToEnd);
            savedState.mAnchorPosition = getPosition(childClosestToEnd);
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.mo3832g(childClosestToStart) - this.mOrientationHelper.mo3838m();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.C0607k.h
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            AbstractC0614r abstractC0614r = this.mOrientationHelper;
            if (b == 1) {
                scrollToPositionWithOffset(position2, abstractC0614r.mo3834i() - (this.mOrientationHelper.mo3832g(view2) + this.mOrientationHelper.mo3830e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, abstractC0614r.mo3834i() - this.mOrientationHelper.mo3829d(view2));
                return;
            }
        }
        AbstractC0614r abstractC0614r2 = this.mOrientationHelper;
        if (b == -1) {
            scrollToPositionWithOffset(position2, abstractC0614r2.mo3832g(view2));
        } else {
            scrollToPositionWithOffset(position2, abstractC0614r2.mo3829d(view2) - this.mOrientationHelper.mo3830e(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo3836k() == 0 && this.mOrientationHelper.mo3833h() == 0;
    }

    public int scrollBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2554a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, c0561a0);
        C0558c c0558c = this.mLayoutState;
        int iFill = c0558c.f2560g + fill(c0586v, c0558c, c0561a0, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo3843r(-i);
        this.mLayoutState.f2564k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c0586v, c0561a0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3340b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3340b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c0586v, c0561a0);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            za50.m219101a("invalid orientation:", i);
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC0614r abstractC0614rM3827b = AbstractC0614r.m3827b(this, i);
            this.mOrientationHelper = abstractC0614rM3827b;
            this.mAnchorInfo.f2545a = abstractC0614rM3827b;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0, int i) {
        C0610n c0610n = new C0610n(recyclerView.getContext());
        c0610n.setTargetPosition(i);
        startSmoothScroll(c0610n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo3832g = this.mOrientationHelper.mo3832g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo3832g2 = this.mOrientationHelper.mo3832g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo3832g2 < iMo3832g);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo3832g2 > iMo3832g) {
                    logChildren();
                    azk0.m101074a("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo3832g3 = this.mOrientationHelper.mo3832g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo3832g3 < iMo3832g);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo3832g3 < iMo3832g) {
                logChildren();
                azk0.m101074a("detected invalid location");
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0555a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C0555a implements Parcelable.Creator<SavedState> {
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
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3339a() {
            return this.mAnchorPosition >= 0;
        }

        /* JADX INFO: renamed from: b */
        public void m3340b() {
            this.mAnchorPosition = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        public SavedState() {
        }

        @SuppressLint({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    private void updateLayoutStateToFillEnd(C0556a c0556a) {
        updateLayoutStateToFillEnd(c0556a.f2546b, c0556a.f2547c);
    }

    private void updateLayoutStateToFillStart(C0556a c0556a) {
        updateLayoutStateToFillStart(c0556a.f2546b, c0556a.f2547c);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C0556a();
        this.mLayoutChunkResult = new C0557b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }
}
