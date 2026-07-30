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
import p149l.k250;
import p149l.upk0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0577o implements C0605k.h, RecyclerView.AbstractC0587y.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C0555a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C0556b mLayoutChunkResult;
    private C0557c mLayoutState;
    int mOrientation;
    AbstractC0612r mOrientationHelper;
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
    public static class C0555a {

        /* JADX INFO: renamed from: a */
        public AbstractC0612r f2545a;

        /* JADX INFO: renamed from: b */
        public int f2546b;

        /* JADX INFO: renamed from: c */
        public int f2547c;

        /* JADX INFO: renamed from: d */
        public boolean f2548d;

        /* JADX INFO: renamed from: e */
        public boolean f2549e;

        public C0555a() {
            m3346e();
        }

        /* JADX INFO: renamed from: a */
        public void m3342a() {
            boolean z = this.f2548d;
            AbstractC0612r abstractC0612r = this.f2545a;
            this.f2547c = z ? abstractC0612r.mo3833i() : abstractC0612r.mo3837m();
        }

        /* JADX INFO: renamed from: b */
        public void m3343b(View view, int i) {
            boolean z = this.f2548d;
            AbstractC0612r abstractC0612r = this.f2545a;
            if (z) {
                this.f2547c = abstractC0612r.mo3828d(view) + this.f2545a.m3839o();
            } else {
                this.f2547c = abstractC0612r.mo3831g(view);
            }
            this.f2546b = i;
        }

        /* JADX INFO: renamed from: c */
        public void m3344c(View view, int i) {
            int iM3839o = this.f2545a.m3839o();
            if (iM3839o >= 0) {
                m3343b(view, i);
                return;
            }
            this.f2546b = i;
            boolean z = this.f2548d;
            AbstractC0612r abstractC0612r = this.f2545a;
            if (z) {
                int iMo3833i = (abstractC0612r.mo3833i() - iM3839o) - this.f2545a.mo3828d(view);
                this.f2547c = this.f2545a.mo3833i() - iMo3833i;
                if (iMo3833i > 0) {
                    int iMo3829e = this.f2547c - this.f2545a.mo3829e(view);
                    int iMo3837m = this.f2545a.mo3837m();
                    int iMin = iMo3829e - (iMo3837m + Math.min(this.f2545a.mo3831g(view) - iMo3837m, 0));
                    if (iMin < 0) {
                        this.f2547c += Math.min(iMo3833i, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo3831g = abstractC0612r.mo3831g(view);
            int iMo3837m2 = iMo3831g - this.f2545a.mo3837m();
            this.f2547c = iMo3831g;
            if (iMo3837m2 > 0) {
                int iMo3833i2 = (this.f2545a.mo3833i() - Math.min(0, (this.f2545a.mo3833i() - iM3839o) - this.f2545a.mo3828d(view))) - (iMo3831g + this.f2545a.mo3829e(view));
                if (iMo3833i2 < 0) {
                    this.f2547c -= Math.min(iMo3837m2, -iMo3833i2);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m3345d(View view, RecyclerView.C0588z c0588z) {
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            return !c0578p.m3411e() && c0578p.m3408b() >= 0 && c0578p.m3408b() < c0588z.m3487c();
        }

        /* JADX INFO: renamed from: e */
        public void m3346e() {
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
    public static class C0556b {

        /* JADX INFO: renamed from: a */
        public int f2550a;

        /* JADX INFO: renamed from: b */
        public boolean f2551b;

        /* JADX INFO: renamed from: c */
        public boolean f2552c;

        /* JADX INFO: renamed from: d */
        public boolean f2553d;

        /* JADX INFO: renamed from: a */
        public void m3347a() {
            this.f2550a = 0;
            this.f2551b = false;
            this.f2552c = false;
            this.f2553d = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0557c {

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
        public List<RecyclerView.AbstractC0566d0> f2565l = null;

        /* JADX INFO: renamed from: a */
        public void m3348a() {
            m3349b(null);
        }

        /* JADX INFO: renamed from: b */
        public void m3349b(View view) {
            View viewM3353f = m3353f(view);
            if (viewM3353f == null) {
                this.f2557d = -1;
            } else {
                this.f2557d = ((RecyclerView.C0578p) viewM3353f.getLayoutParams()).m3408b();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m3350c(RecyclerView.C0588z c0588z) {
            int i = this.f2557d;
            return i >= 0 && i < c0588z.m3487c();
        }

        /* JADX INFO: renamed from: d */
        public View m3351d(RecyclerView.C0584v c0584v) {
            if (this.f2565l != null) {
                return m3352e();
            }
            View viewM3466o = c0584v.m3466o(this.f2557d);
            this.f2557d += this.f2558e;
            return viewM3466o;
        }

        /* JADX INFO: renamed from: e */
        public final View m3352e() {
            int size = this.f2565l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f2565l.get(i).itemView;
                RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
                if (!c0578p.m3411e() && this.f2557d == c0578p.m3408b()) {
                    m3349b(view);
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public View m3353f(View view) {
            int iM3408b;
            int size = this.f2565l.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f2565l.get(i2).itemView;
                RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view3.getLayoutParams();
                if (view3 != view && !c0578p.m3411e() && (iM3408b = (c0578p.m3408b() - this.f2557d) * this.f2558e) >= 0 && iM3408b < i) {
                    if (iM3408b == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = iM3408b;
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
        this.mAnchorInfo = new C0555a();
        this.mLayoutChunkResult = new C0556b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC0577o.d properties = RecyclerView.AbstractC0577o.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f2587a);
        setReverseLayout(properties.f2589c);
        setStackFromEnd(properties.f2590d);
    }

    private int computeScrollExtent(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0615u.m3854a(c0588z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0615u.m3855b(c0588z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C0615u.m3856c(c0588z, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
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

    private int fixLayoutEndGap(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        int iMo3833i;
        int iMo3833i2 = this.mOrientationHelper.mo3833i() - i;
        if (iMo3833i2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo3833i2, c0584v, c0588z);
        int i3 = i + i2;
        if (!z || (iMo3833i = this.mOrientationHelper.mo3833i() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3842r(iMo3833i);
        return iMo3833i + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z) {
        int iMo3837m;
        int iMo3837m2 = i - this.mOrientationHelper.mo3837m();
        if (iMo3837m2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo3837m2, c0584v, c0588z);
        int i3 = i + i2;
        if (!z || (iMo3837m = i3 - this.mOrientationHelper.mo3837m()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo3842r(-iMo3837m);
        return i2 - iMo3837m;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i, int i2) {
        if (!c0588z.m3492h() || getChildCount() == 0 || c0588z.m3490f() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.AbstractC0566d0> listM3462k = c0584v.m3462k();
        int size = listM3462k.size();
        int position = getPosition(getChildAt(0));
        int iMo3829e = 0;
        int iMo3829e2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView.AbstractC0566d0 abstractC0566d0 = listM3462k.get(i3);
            if (!abstractC0566d0.isRemoved()) {
                boolean z = abstractC0566d0.getLayoutPosition() < position;
                boolean z2 = this.mShouldReverseLayout;
                AbstractC0612r abstractC0612r = this.mOrientationHelper;
                if (z != z2) {
                    iMo3829e += abstractC0612r.mo3829e(abstractC0566d0.itemView);
                } else {
                    iMo3829e2 += abstractC0612r.mo3829e(abstractC0566d0.itemView);
                }
            }
        }
        this.mLayoutState.f2565l = listM3462k;
        if (iMo3829e > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
            C0557c c0557c = this.mLayoutState;
            c0557c.f2561h = iMo3829e;
            c0557c.f2556c = 0;
            c0557c.m3348a();
            fill(c0584v, this.mLayoutState, c0588z, false);
        }
        if (iMo3829e2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
            C0557c c0557c2 = this.mLayoutState;
            c0557c2.f2561h = iMo3829e2;
            c0557c2.f2556c = 0;
            c0557c2.m3348a();
            fill(c0584v, this.mLayoutState, c0588z, false);
        }
        this.mLayoutState.f2565l = null;
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo3831g(childAt);
        }
    }

    private void recycleByLayoutState(RecyclerView.C0584v c0584v, C0557c c0557c) {
        if (!c0557c.f2554a || c0557c.f2566m) {
            return;
        }
        int i = c0557c.f2560g;
        int i2 = c0557c.f2562i;
        if (c0557c.f2559f == -1) {
            recycleViewsFromEnd(c0584v, i, i2);
        } else {
            recycleViewsFromStart(c0584v, i, i2);
        }
    }

    private void recycleChildren(RecyclerView.C0584v c0584v, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c0584v);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c0584v);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.C0584v c0584v, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iMo3832h = (this.mOrientationHelper.mo3832h() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.mo3831g(childAt) < iMo3832h || this.mOrientationHelper.mo3841q(childAt) < iMo3832h) {
                    recycleChildren(c0584v, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.mo3831g(childAt2) < iMo3832h || this.mOrientationHelper.mo3841q(childAt2) < iMo3832h) {
                recycleChildren(c0584v, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.C0584v c0584v, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.mo3828d(childAt) > i3 || this.mOrientationHelper.mo3840p(childAt) > i3) {
                    recycleChildren(c0584v, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.mo3828d(childAt2) > i3 || this.mOrientationHelper.mo3840p(childAt2) > i3) {
                recycleChildren(c0584v, i5, i6);
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

    private boolean updateAnchorFromChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, C0555a c0555a) {
        View viewFindReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c0555a.m3345d(focusedChild, c0588z)) {
            c0555a.m3344c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (viewFindReferenceChild = findReferenceChild(c0584v, c0588z, c0555a.f2548d, z3)) == null) {
            return false;
        }
        c0555a.m3343b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!c0588z.m3490f() && supportsPredictiveItemAnimations()) {
            int iMo3831g = this.mOrientationHelper.mo3831g(viewFindReferenceChild);
            int iMo3828d = this.mOrientationHelper.mo3828d(viewFindReferenceChild);
            int iMo3837m = this.mOrientationHelper.mo3837m();
            int iMo3833i = this.mOrientationHelper.mo3833i();
            boolean z4 = iMo3828d <= iMo3837m && iMo3831g < iMo3837m;
            if (iMo3831g >= iMo3833i && iMo3828d > iMo3833i) {
                z = true;
            }
            if (z4 || z) {
                if (c0555a.f2548d) {
                    iMo3837m = iMo3833i;
                }
                c0555a.f2547c = iMo3837m;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.C0588z c0588z, C0555a c0555a) {
        int i;
        if (!c0588z.m3490f() && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c0588z.m3487c()) {
                c0555a.f2546b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.m3338a()) {
                    boolean z = this.mPendingSavedState.mAnchorLayoutFromEnd;
                    c0555a.f2548d = z;
                    AbstractC0612r abstractC0612r = this.mOrientationHelper;
                    if (z) {
                        c0555a.f2547c = abstractC0612r.mo3833i() - this.mPendingSavedState.mAnchorOffset;
                    } else {
                        c0555a.f2547c = abstractC0612r.mo3837m() + this.mPendingSavedState.mAnchorOffset;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z2 = this.mShouldReverseLayout;
                    c0555a.f2548d = z2;
                    AbstractC0612r abstractC0612r2 = this.mOrientationHelper;
                    if (z2) {
                        c0555a.f2547c = abstractC0612r2.mo3833i() - this.mPendingScrollPositionOffset;
                    } else {
                        c0555a.f2547c = abstractC0612r2.mo3837m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c0555a.f2548d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c0555a.m3342a();
                } else {
                    if (this.mOrientationHelper.mo3829e(viewFindViewByPosition) > this.mOrientationHelper.mo3838n()) {
                        c0555a.m3342a();
                        return true;
                    }
                    int iMo3831g = this.mOrientationHelper.mo3831g(viewFindViewByPosition) - this.mOrientationHelper.mo3837m();
                    AbstractC0612r abstractC0612r3 = this.mOrientationHelper;
                    if (iMo3831g < 0) {
                        c0555a.f2547c = abstractC0612r3.mo3837m();
                        c0555a.f2548d = false;
                        return true;
                    }
                    if (abstractC0612r3.mo3833i() - this.mOrientationHelper.mo3828d(viewFindViewByPosition) < 0) {
                        c0555a.f2547c = this.mOrientationHelper.mo3833i();
                        c0555a.f2548d = true;
                        return true;
                    }
                    boolean z3 = c0555a.f2548d;
                    AbstractC0612r abstractC0612r4 = this.mOrientationHelper;
                    c0555a.f2547c = z3 ? abstractC0612r4.mo3828d(viewFindViewByPosition) + this.mOrientationHelper.m3839o() : abstractC0612r4.mo3831g(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, C0555a c0555a) {
        if (updateAnchorFromPendingData(c0588z, c0555a) || updateAnchorFromChildren(c0584v, c0588z, c0555a)) {
            return;
        }
        c0555a.m3342a();
        c0555a.f2546b = this.mStackFromEnd ? c0588z.m3487c() - 1 : 0;
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.C0588z c0588z) {
        int iMo3837m;
        this.mLayoutState.f2566m = resolveIsInfinite();
        this.mLayoutState.f2559f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0588z, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C0557c c0557c = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c0557c.f2561h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0557c.f2562i = iMax;
        if (z2) {
            c0557c.f2561h = i3 + this.mOrientationHelper.mo3834j();
            View childClosestToEnd = getChildClosestToEnd();
            C0557c c0557c2 = this.mLayoutState;
            c0557c2.f2558e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            C0557c c0557c3 = this.mLayoutState;
            c0557c2.f2557d = position + c0557c3.f2558e;
            c0557c3.f2555b = this.mOrientationHelper.mo3828d(childClosestToEnd);
            iMo3837m = this.mOrientationHelper.mo3828d(childClosestToEnd) - this.mOrientationHelper.mo3833i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f2561h += this.mOrientationHelper.mo3837m();
            C0557c c0557c4 = this.mLayoutState;
            c0557c4.f2558e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            C0557c c0557c5 = this.mLayoutState;
            c0557c4.f2557d = position2 + c0557c5.f2558e;
            c0557c5.f2555b = this.mOrientationHelper.mo3831g(childClosestToStart);
            iMo3837m = (-this.mOrientationHelper.mo3831g(childClosestToStart)) + this.mOrientationHelper.mo3837m();
        }
        C0557c c0557c6 = this.mLayoutState;
        c0557c6.f2556c = i2;
        if (z) {
            c0557c6.f2556c = i2 - iMo3837m;
        }
        c0557c6.f2560g = iMo3837m;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.f2556c = this.mOrientationHelper.mo3833i() - i2;
        C0557c c0557c = this.mLayoutState;
        c0557c.f2558e = this.mShouldReverseLayout ? -1 : 1;
        c0557c.f2557d = i;
        c0557c.f2559f = 1;
        c0557c.f2555b = i2;
        c0557c.f2560g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.f2556c = i2 - this.mOrientationHelper.mo3837m();
        C0557c c0557c = this.mLayoutState;
        c0557c.f2557d = i;
        c0557c.f2558e = this.mShouldReverseLayout ? 1 : -1;
        c0557c.f2559f = -1;
        c0557c.f2555b = i2;
        c0557c.f2560g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(@NonNull RecyclerView.C0588z c0588z, @NonNull int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c0588z);
        if (this.mLayoutState.f2559f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0577o.c cVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, c0588z);
        collectPrefetchPositionsForLayoutState(c0588z, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, RecyclerView.AbstractC0577o.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.m3338a()) {
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
            cVar.mo3406a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.C0588z c0588z, C0557c c0557c, RecyclerView.AbstractC0577o.c cVar) {
        int i = c0557c.f2557d;
        if (i < 0 || i >= c0588z.m3487c()) {
            return;
        }
        cVar.mo3406a(i, Math.max(0, c0557c.f2560g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.C0588z c0588z) {
        return computeScrollExtent(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.C0588z c0588z) {
        return computeScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.C0588z c0588z) {
        return computeScrollRange(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0587y.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.C0588z c0588z) {
        return computeScrollExtent(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.C0588z c0588z) {
        return computeScrollOffset(c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.C0588z c0588z) {
        return computeScrollRange(c0588z);
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

    public C0557c createLayoutState() {
        return new C0557c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.C0584v c0584v, C0557c c0557c, RecyclerView.C0588z c0588z, boolean z) {
        int i = c0557c.f2556c;
        int i2 = c0557c.f2560g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0557c.f2560g = i2 + i;
            }
            recycleByLayoutState(c0584v, c0557c);
        }
        int i3 = c0557c.f2556c + c0557c.f2561h;
        C0556b c0556b = this.mLayoutChunkResult;
        while (true) {
            if ((!c0557c.f2566m && i3 <= 0) || !c0557c.m3350c(c0588z)) {
                break;
            }
            c0556b.m3347a();
            layoutChunk(c0584v, c0588z, c0557c, c0556b);
            if (!c0556b.f2551b) {
                c0557c.f2555b += c0556b.f2550a * c0557c.f2559f;
                if (!c0556b.f2552c || c0557c.f2565l != null || !c0588z.m3490f()) {
                    int i4 = c0557c.f2556c;
                    int i5 = c0556b.f2550a;
                    c0557c.f2556c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c0557c.f2560g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c0556b.f2550a;
                    c0557c.f2560g = i7;
                    int i8 = c0557c.f2556c;
                    if (i8 < 0) {
                        c0557c.f2560g = i7 + i8;
                    }
                    recycleByLayoutState(c0584v, c0557c);
                }
                if (z && c0556b.f2553d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0557c.f2556c;
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
        if (this.mOrientationHelper.mo3831g(getChildAt(i)) < this.mOrientationHelper.mo3837m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3864a(i, i2, i3, i4) : this.mVerticalBoundCheck.m3864a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m3864a(i, i2, i3, i4) : this.mVerticalBoundCheck.m3864a(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    public View findReferenceChild(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, boolean z, boolean z2) {
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
        int iM3487c = c0588z.m3487c();
        int iMo3837m = this.mOrientationHelper.mo3837m();
        int iMo3833i = this.mOrientationHelper.mo3833i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo3831g = this.mOrientationHelper.mo3831g(childAt);
            int iMo3828d = this.mOrientationHelper.mo3828d(childAt);
            if (position >= 0 && position < iM3487c) {
                if (!((RecyclerView.C0578p) childAt.getLayoutParams()).m3411e()) {
                    boolean z3 = iMo3828d <= iMo3837m && iMo3831g < iMo3837m;
                    boolean z4 = iMo3831g >= iMo3833i && iMo3828d > iMo3833i;
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return new RecyclerView.C0578p(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.C0588z c0588z) {
        if (c0588z.m3489e()) {
            return this.mOrientationHelper.mo3838n();
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
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
    public void layoutChunk(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, C0557c c0557c, C0556b c0556b) {
        int iMo3830f;
        int i;
        int paddingLeft;
        int i2;
        int iMo3830f2;
        View viewM3351d = c0557c.m3351d(c0584v);
        if (viewM3351d == null) {
            c0556b.f2551b = true;
            return;
        }
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) viewM3351d.getLayoutParams();
        List<RecyclerView.AbstractC0566d0> list = c0557c.f2565l;
        boolean z = this.mShouldReverseLayout;
        if (list == null) {
            if (z == (c0557c.f2559f == -1)) {
                addView(viewM3351d);
            } else {
                addView(viewM3351d, 0);
            }
        } else {
            if (z == (c0557c.f2559f == -1)) {
                addDisappearingView(viewM3351d);
            } else {
                addDisappearingView(viewM3351d, 0);
            }
        }
        measureChildWithMargins(viewM3351d, 0, 0);
        c0556b.f2550a = this.mOrientationHelper.mo3829e(viewM3351d);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo3830f2 = getWidth() - getPaddingRight();
                paddingLeft = iMo3830f2 - this.mOrientationHelper.mo3830f(viewM3351d);
            } else {
                paddingLeft = getPaddingLeft();
                iMo3830f2 = this.mOrientationHelper.mo3830f(viewM3351d) + paddingLeft;
            }
            int i3 = c0557c.f2559f;
            int i4 = c0557c.f2555b;
            if (i3 == -1) {
                i2 = i4 - c0556b.f2550a;
                iMo3830f = i4;
                i = iMo3830f2;
            } else {
                i = iMo3830f2;
                iMo3830f = c0556b.f2550a + i4;
                i2 = i4;
            }
            layoutDecoratedWithMargins(viewM3351d, paddingLeft, i2, i, iMo3830f);
            if (c0578p.m3411e() || c0578p.m3410d()) {
                c0556b.f2552c = true;
            }
            c0556b.f2553d = viewM3351d.hasFocusable();
        }
        int paddingTop = getPaddingTop();
        iMo3830f = this.mOrientationHelper.mo3830f(viewM3351d) + paddingTop;
        int i5 = c0557c.f2559f;
        int i6 = c0557c.f2555b;
        if (i5 == -1) {
            i = i6;
            paddingLeft = i6 - c0556b.f2550a;
        } else {
            i = c0556b.f2550a + i6;
            paddingLeft = i6;
        }
        i2 = paddingTop;
        layoutDecoratedWithMargins(viewM3351d, paddingLeft, i2, i, iMo3830f);
        if (c0578p.m3411e()) {
            c0556b.f2552c = true;
        } else {
            c0556b.f2552c = true;
        }
        c0556b.f2553d = viewM3351d.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, C0555a c0555a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C0584v c0584v) {
        super.onDetachedFromWindow(recyclerView, c0584v);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c0584v);
            c0584v.m3454c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo3838n() * MAX_SCROLL_FACTOR), false, c0588z);
        C0557c c0557c = this.mLayoutState;
        c0557c.f2560g = Integer.MIN_VALUE;
        c0557c.f2554a = false;
        fill(c0584v, c0557c, c0588z, true);
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i;
        int i2;
        int i3;
        int i4;
        int iFixLayoutEndGap;
        int i5;
        View viewFindViewByPosition;
        int iMo3831g;
        int iMo3833i;
        int i6 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0588z.m3487c() == 0) {
            removeAndRecycleAllViews(c0584v);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.m3338a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.mAnchorPosition;
        }
        ensureLayoutState();
        this.mLayoutState.f2554a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C0555a c0555a = this.mAnchorInfo;
        if (!c0555a.f2549e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c0555a.m3346e();
            C0555a c0555a2 = this.mAnchorInfo;
            c0555a2.f2548d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c0584v, c0588z, c0555a2);
            this.mAnchorInfo.f2549e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo3831g(focusedChild) >= this.mOrientationHelper.mo3833i() || this.mOrientationHelper.mo3828d(focusedChild) <= this.mOrientationHelper.mo3837m())) {
            this.mAnchorInfo.m3344c(focusedChild, getPosition(focusedChild));
        }
        C0557c c0557c = this.mLayoutState;
        c0557c.f2559f = c0557c.f2564k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0588z, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo3837m();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo3834j();
        if (c0588z.m3490f() && (i5 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i5)) != null) {
            boolean z = this.mShouldReverseLayout;
            AbstractC0612r abstractC0612r = this.mOrientationHelper;
            if (z) {
                iMo3833i = abstractC0612r.mo3833i() - this.mOrientationHelper.mo3828d(viewFindViewByPosition);
                iMo3831g = this.mPendingScrollPositionOffset;
            } else {
                iMo3831g = abstractC0612r.mo3831g(viewFindViewByPosition) - this.mOrientationHelper.mo3837m();
                iMo3833i = this.mPendingScrollPositionOffset;
            }
            int i7 = iMo3833i - iMo3831g;
            if (i7 > 0) {
                iMax += i7;
            } else {
                iMax2 -= i7;
            }
        }
        C0555a c0555a3 = this.mAnchorInfo;
        boolean z2 = c0555a3.f2548d;
        boolean z3 = this.mShouldReverseLayout;
        if (!z2 ? !z3 : z3) {
            i6 = 1;
        }
        onAnchorReady(c0584v, c0588z, c0555a3, i6);
        detachAndScrapAttachedViews(c0584v);
        this.mLayoutState.f2566m = resolveIsInfinite();
        this.mLayoutState.f2563j = c0588z.m3490f();
        this.mLayoutState.f2562i = 0;
        C0555a c0555a4 = this.mAnchorInfo;
        if (c0555a4.f2548d) {
            updateLayoutStateToFillStart(c0555a4);
            C0557c c0557c2 = this.mLayoutState;
            c0557c2.f2561h = iMax;
            fill(c0584v, c0557c2, c0588z, false);
            C0557c c0557c3 = this.mLayoutState;
            i2 = c0557c3.f2555b;
            int i8 = c0557c3.f2557d;
            int i9 = c0557c3.f2556c;
            if (i9 > 0) {
                iMax2 += i9;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C0557c c0557c4 = this.mLayoutState;
            c0557c4.f2561h = iMax2;
            c0557c4.f2557d += c0557c4.f2558e;
            fill(c0584v, c0557c4, c0588z, false);
            C0557c c0557c5 = this.mLayoutState;
            i = c0557c5.f2555b;
            int i10 = c0557c5.f2556c;
            if (i10 > 0) {
                updateLayoutStateToFillStart(i8, i2);
                C0557c c0557c6 = this.mLayoutState;
                c0557c6.f2561h = i10;
                fill(c0584v, c0557c6, c0588z, false);
                i2 = this.mLayoutState.f2555b;
            }
        } else {
            updateLayoutStateToFillEnd(c0555a4);
            C0557c c0557c7 = this.mLayoutState;
            c0557c7.f2561h = iMax2;
            fill(c0584v, c0557c7, c0588z, false);
            C0557c c0557c8 = this.mLayoutState;
            i = c0557c8.f2555b;
            int i11 = c0557c8.f2557d;
            int i12 = c0557c8.f2556c;
            if (i12 > 0) {
                iMax += i12;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C0557c c0557c9 = this.mLayoutState;
            c0557c9.f2561h = iMax;
            c0557c9.f2557d += c0557c9.f2558e;
            fill(c0584v, c0557c9, c0588z, false);
            C0557c c0557c10 = this.mLayoutState;
            i2 = c0557c10.f2555b;
            int i13 = c0557c10.f2556c;
            if (i13 > 0) {
                updateLayoutStateToFillEnd(i11, i);
                C0557c c0557c11 = this.mLayoutState;
                c0557c11.f2561h = i13;
                fill(c0584v, c0557c11, c0588z, false);
                i = this.mLayoutState.f2555b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i, c0584v, c0588z, true);
                i3 = i2 + iFixLayoutEndGap2;
                i4 = i + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i3, c0584v, c0588z, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i2, c0584v, c0588z, true);
                i3 = i2 + iFixLayoutStartGap;
                i4 = i + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i4, c0584v, c0588z, false);
            }
            i2 = i3 + iFixLayoutEndGap;
            i = i4 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c0584v, c0588z, i2, i);
        if (c0588z.m3490f()) {
            this.mAnchorInfo.m3346e();
        } else {
            this.mOrientationHelper.m3843s();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.C0588z c0588z) {
        super.onLayoutCompleted(c0588z);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m3346e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.m3339b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.m3339b();
            return savedState;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.mAnchorLayoutFromEnd = z;
        if (z) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState.mAnchorOffset = this.mOrientationHelper.mo3833i() - this.mOrientationHelper.mo3828d(childClosestToEnd);
            savedState.mAnchorPosition = getPosition(childClosestToEnd);
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.mAnchorPosition = getPosition(childClosestToStart);
        savedState.mAnchorOffset = this.mOrientationHelper.mo3831g(childClosestToStart) - this.mOrientationHelper.mo3837m();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.C0605k.h
    public void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            AbstractC0612r abstractC0612r = this.mOrientationHelper;
            if (b == 1) {
                scrollToPositionWithOffset(position2, abstractC0612r.mo3833i() - (this.mOrientationHelper.mo3831g(view2) + this.mOrientationHelper.mo3829e(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, abstractC0612r.mo3833i() - this.mOrientationHelper.mo3828d(view2));
                return;
            }
        }
        AbstractC0612r abstractC0612r2 = this.mOrientationHelper;
        if (b == -1) {
            scrollToPositionWithOffset(position2, abstractC0612r2.mo3831g(view2));
        } else {
            scrollToPositionWithOffset(position2, abstractC0612r2.mo3828d(view2) - this.mOrientationHelper.mo3829e(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo3835k() == 0 && this.mOrientationHelper.mo3832h() == 0;
    }

    public int scrollBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f2554a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, c0588z);
        C0557c c0557c = this.mLayoutState;
        int iFill = c0557c.f2560g + fill(c0584v, c0557c, c0588z, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo3842r(-i);
        this.mLayoutState.f2564k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3339b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.m3339b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c0584v, c0588z);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            k250.m144273a("invalid orientation:", i);
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC0612r abstractC0612rM3826b = AbstractC0612r.m3826b(this, i);
            this.mOrientationHelper = abstractC0612rM3826b;
            this.mAnchorInfo.f2545a = abstractC0612rM3826b;
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C0588z c0588z, int i) {
        C0608n c0608n = new C0608n(recyclerView.getContext());
        c0608n.setTargetPosition(i);
        startSmoothScroll(c0608n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo3831g = this.mOrientationHelper.mo3831g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo3831g2 = this.mOrientationHelper.mo3831g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo3831g2 < iMo3831g);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo3831g2 > iMo3831g) {
                    logChildren();
                    upk0.m194883a("detected invalid location");
                    return;
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo3831g3 = this.mOrientationHelper.mo3831g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo3831g3 < iMo3831g);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo3831g3 < iMo3831g) {
                logChildren();
                upk0.m194883a("detected invalid location");
                return;
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0554a();
        boolean mAnchorLayoutFromEnd;
        int mAnchorOffset;
        int mAnchorPosition;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C0554a implements Parcelable.Creator<SavedState> {
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
        public boolean m3338a() {
            return this.mAnchorPosition >= 0;
        }

        /* JADX INFO: renamed from: b */
        public void m3339b() {
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

    private void updateLayoutStateToFillEnd(C0555a c0555a) {
        updateLayoutStateToFillEnd(c0555a.f2546b, c0555a.f2547c);
    }

    private void updateLayoutStateToFillStart(C0555a c0555a) {
        updateLayoutStateToFillStart(c0555a.f2546b, c0555a.f2547c);
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
        this.mAnchorInfo = new C0555a();
        this.mLayoutChunkResult = new C0556b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }
}
