package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import p153l.C15967bc;
import p153l.C16495dc;
import p153l.C16932fb;
import p153l.bi20;
import p153l.di20;
import p153l.fi20;
import p153l.kkl0;
import p153l.m8c0;
import p153l.mee0;
import p153l.mke;
import p153l.q2e;
import p153l.r2e;
import p153l.u610;
import p153l.wtq0;
import p153l.zh20;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements di20, zh20, mee0 {

    /* JADX INFO: renamed from: C */
    public static final float f1473C = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: D */
    public static final C0260a f1474D = new C0260a();

    /* JADX INFO: renamed from: E */
    public static final int[] f1475E = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    @VisibleForTesting
    public final C0262c f1476A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public q2e f1477B;

    /* JADX INFO: renamed from: a */
    public final float f1478a;

    /* JADX INFO: renamed from: b */
    public long f1479b;

    /* JADX INFO: renamed from: c */
    public final Rect f1480c;

    /* JADX INFO: renamed from: d */
    public OverScroller f1481d;

    /* JADX INFO: renamed from: e */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect f1482e;

    /* JADX INFO: renamed from: f */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect f1483f;

    /* JADX INFO: renamed from: g */
    public int f1484g;

    /* JADX INFO: renamed from: h */
    public boolean f1485h;

    /* JADX INFO: renamed from: i */
    public boolean f1486i;

    /* JADX INFO: renamed from: j */
    public View f1487j;

    /* JADX INFO: renamed from: k */
    public boolean f1488k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f1489l;

    /* JADX INFO: renamed from: m */
    public boolean f1490m;

    /* JADX INFO: renamed from: n */
    public boolean f1491n;

    /* JADX INFO: renamed from: o */
    public int f1492o;

    /* JADX INFO: renamed from: p */
    public int f1493p;

    /* JADX INFO: renamed from: q */
    public int f1494q;

    /* JADX INFO: renamed from: r */
    public int f1495r;

    /* JADX INFO: renamed from: s */
    public final int[] f1496s;

    /* JADX INFO: renamed from: t */
    public final int[] f1497t;

    /* JADX INFO: renamed from: u */
    public int f1498u;

    /* JADX INFO: renamed from: v */
    public int f1499v;

    /* JADX INFO: renamed from: w */
    public SavedState f1500w;

    /* JADX INFO: renamed from: x */
    public final fi20 f1501x;

    /* JADX INFO: renamed from: y */
    public final bi20 f1502y;

    /* JADX INFO: renamed from: z */
    public float f1503z;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0260a extends C16932fb {
        @Override // p153l.C16932fb
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C16495dc.m115179a(accessibilityEvent, nestedScrollView.getScrollX());
            C16495dc.m115180b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p153l.C16932fb
        public void onInitializeAccessibilityNodeInfo(View view, C15967bc c15967bc) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, c15967bc);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c15967bc.m103431o0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c15967bc.m103382K0(true);
            if (nestedScrollView.getScrollY() > 0) {
                c15967bc.m103407b(C15967bc.a.f76069r);
                c15967bc.m103407b(C15967bc.a.f76036C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c15967bc.m103407b(C15967bc.a.f76068q);
                c15967bc.m103407b(C15967bc.a.f76038E);
            }
        }

        @Override // p153l.C16932fb
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1357Q(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1357Q(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    @RequiresApi(21)
    public static class C0261b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m1385a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public class C0262c implements r2e {
        public C0262c() {
        }

        @Override // p153l.r2e
        /* JADX INFO: renamed from: a */
        public float mo1386a() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p153l.r2e
        /* JADX INFO: renamed from: b */
        public boolean mo1387b(float f) {
            if (f == 0.0f) {
                return false;
            }
            mo1388c();
            NestedScrollView.this.m1373p((int) f);
            return true;
        }

        @Override // p153l.r2e
        /* JADX INFO: renamed from: c */
        public void mo1388c() {
            NestedScrollView.this.f1481d.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$d */
    public interface InterfaceC0263d {
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1480c = new Rect();
        this.f1485h = true;
        this.f1486i = false;
        this.f1487j = null;
        this.f1488k = false;
        this.f1491n = true;
        this.f1495r = -1;
        this.f1496s = new int[2];
        this.f1497t = new int[2];
        C0262c c0262c = new C0262c();
        this.f1476A = c0262c;
        this.f1477B = new q2e(getContext(), c0262c);
        this.f1482e = mke.m158755a(context, attributeSet);
        this.f1483f = mke.m158755a(context, attributeSet);
        this.f1478a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m1379v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1475E, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1501x = new fi20(this);
        this.f1502y = new bi20(this);
        setNestedScrollingEnabled(true);
        kkl0.m150164j0(this, f1474D);
    }

    /* JADX INFO: renamed from: f */
    private static int m1339f(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1340z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1340z((View) parent, view2);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1341A(View view, int i, int i2) {
        view.getDrawingRect(this.f1480c);
        offsetDescendantRectToMyCoords(view, this.f1480c);
        return this.f1480c.bottom + i >= getScrollY() && this.f1480c.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: B */
    public final void m1342B(int i, int i2, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1502y.m104395e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: C */
    public final void m1343C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1495r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1484g = (int) motionEvent.getY(i);
            this.f1495r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1489l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public boolean m1344D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int i9;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i10 = i3 + i;
        int i11 = !z6 ? 0 : i7;
        int i12 = i4 + i2;
        int i13 = !z7 ? 0 : i8;
        int i14 = -i11;
        int i15 = i11 + i5;
        int i16 = -i13;
        int i17 = i13 + i6;
        if (i10 > i15) {
            i10 = i15;
            z2 = true;
        } else if (i10 < i14) {
            z2 = true;
            i10 = i14;
        } else {
            z2 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z3 = true;
        } else if (i12 < i16) {
            z3 = true;
            i12 = i16;
        } else {
            z3 = false;
        }
        if (!z3 || m1376s(1)) {
            i9 = i10;
        } else {
            int i18 = i10;
            this.f1481d.springBack(i18, i12, 0, 0, 0, getScrollRange());
            i9 = i18;
        }
        onOverScrolled(i9, i12, z2, z3);
        return z2 || z3;
    }

    /* JADX INFO: renamed from: E */
    public boolean m1345E(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1480c;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f1480c;
                if (rect2.top + height > bottom) {
                    rect2.top = bottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            Rect rect3 = this.f1480c;
            if (rect3.top < 0) {
                rect3.top = 0;
            }
        }
        Rect rect4 = this.f1480c;
        int i2 = rect4.top;
        int i3 = height + i2;
        rect4.bottom = i3;
        return m1349I(i, i2, i3);
    }

    /* JADX INFO: renamed from: F */
    public final void m1346F() {
        VelocityTracker velocityTracker = this.f1489l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1489l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX INFO: renamed from: G */
    public final int m1347G(int i, float f) {
        float fM158758h;
        int iRound;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (mke.m158756c(this.f1482e) == 0.0f) {
            if (mke.m158756c(this.f1483f) != 0.0f) {
                fM158758h = mke.m158758h(this.f1483f, height, 1.0f - width);
                if (mke.m158756c(this.f1483f) == 0.0f) {
                    this.f1483f.onRelease();
                }
            }
            iRound = Math.round(f2 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fM158758h = -mke.m158758h(this.f1482e, -height, width);
        if (mke.m158756c(this.f1482e) == 0.0f) {
            this.f1482e.onRelease();
        }
        f2 = fM158758h;
        iRound = Math.round(f2 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    /* JADX INFO: renamed from: H */
    public final void m1348H(boolean z) {
        if (z) {
            m1358R(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f1499v = getScrollY();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m1349I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewM1372o = m1372o(z2, i2, i3);
        if (viewM1372o == null) {
            viewM1372o = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1350J(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (viewM1372o != findFocus()) {
            viewM1372o.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: J */
    public final int m1350J(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m1358R(2, i3);
        }
        boolean z2 = false;
        if (m1366i(0, i, this.f1497t, this.f1496s, i3)) {
            int i6 = i - this.f1497t[1];
            i5 = this.f1496s[1];
            i4 = i6;
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = m1362d() && !z;
        int i7 = i4;
        boolean z4 = m1344D(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !m1376s(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f1497t;
        iArr[1] = 0;
        m1367j(0, scrollY2, 0, i7 - scrollY2, this.f1496s, i3, iArr);
        int i8 = i5 + this.f1496s[1];
        int i9 = i7 - this.f1497t[1];
        int i10 = scrollY + i9;
        if (i10 < 0) {
            if (z3) {
                mke.m158758h(this.f1482e, (-i9) / getHeight(), i2 / getWidth());
                if (!this.f1483f.isFinished()) {
                    this.f1483f.onRelease();
                }
            }
        } else if (i10 > scrollRange && z3) {
            mke.m158758h(this.f1483f, i9 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.f1482e.isFinished()) {
                this.f1482e.onRelease();
            }
        }
        if (this.f1482e.isFinished() && this.f1483f.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f1489l) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            stopNestedScroll(i3);
            this.f1482e.onRelease();
            this.f1483f.onRelease();
        }
        return i8;
    }

    /* JADX INFO: renamed from: K */
    public final void m1351K(View view) {
        view.getDrawingRect(this.f1480c);
        offsetDescendantRectToMyCoords(view, this.f1480c);
        int iM1364g = m1364g(this.f1480c);
        if (iM1364g != 0) {
            scrollBy(0, iM1364g);
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m1352L(Rect rect, boolean z) {
        int iM1364g = m1364g(rect);
        boolean z2 = iM1364g != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM1364g);
                return z2;
            }
            m1354N(0, iM1364g);
        }
        return z2;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m1353M(@NonNull EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return m1375r(-i) < mke.m158756c(edgeEffect) * ((float) getHeight());
    }

    /* JADX INFO: renamed from: N */
    public final void m1354N(int i, int i2) {
        m1355O(i, i2, 250, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m1355O(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1479b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1481d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m1348H(z);
        } else {
            if (!this.f1481d.isFinished()) {
                m1360a();
            }
            scrollBy(i, i2);
        }
        this.f1479b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: P */
    public void m1356P(int i, int i2, int i3, boolean z) {
        m1355O(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* JADX INFO: renamed from: Q */
    public void m1357Q(int i, int i2, boolean z) {
        m1356P(i, i2, 250, z);
    }

    /* JADX INFO: renamed from: R */
    public boolean m1358R(int i, int i2) {
        return this.f1502y.m104407q(i, i2);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m1359S(MotionEvent motionEvent) {
        boolean z;
        if (mke.m158756c(this.f1482e) != 0.0f) {
            mke.m158758h(this.f1482e, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (mke.m158756c(this.f1483f) == 0.0f) {
            return z;
        }
        mke.m158758h(this.f1483f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m1360a() {
        this.f1481d.abortAnimation();
        stopNestedScroll(1);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            wtq0.m207906a("ScrollView can host only one direct child");
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m1361c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m1341A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1350J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f1480c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f1480c);
            m1350J(m1364g(this.f1480c), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m1382y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f1481d.isFinished()) {
            return;
        }
        this.f1481d.computeScrollOffset();
        int currY = this.f1481d.getCurrY();
        int iM1365h = m1365h(currY - this.f1499v);
        this.f1499v = currY;
        int[] iArr = this.f1497t;
        iArr[1] = 0;
        m1366i(0, iM1365h, iArr, null, 1);
        int i = iM1365h - this.f1497t[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            m1344D(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.f1497t;
            iArr2[1] = 0;
            m1367j(0, scrollY2, 0, i2, this.f1496s, 1, iArr2);
            i = i2 - this.f1497t[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i < 0) {
                    if (this.f1482e.isFinished()) {
                        this.f1482e.onAbsorb((int) this.f1481d.getCurrVelocity());
                    }
                } else if (this.f1483f.isFinished()) {
                    this.f1483f.onAbsorb((int) this.f1481d.getCurrVelocity());
                }
            }
            m1360a();
        }
        if (this.f1481d.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1362d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1371n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1502y.m104391a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1502y.m104392b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return m1366i(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return this.f1502y.m104396f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f1482e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C0261b.m1385a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C0261b.m1385a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f1482e.setSize(width, height);
            if (this.f1482e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f1483f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C0261b.m1385a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (C0261b.m1385a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1483f.setSize(width2, height2);
        if (this.f1483f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1363e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public int m1364g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1501x.m125663a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @VisibleForTesting
    public float getVerticalScrollFactorCompat() {
        if (this.f1503z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                wtq0.m207906a("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.f1503z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1503z;
    }

    /* JADX INFO: renamed from: h */
    public int m1365h(int i) {
        int height = getHeight();
        if (i > 0 && mke.m158756c(this.f1482e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * mke.m158758h(this.f1482e, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.f1482e.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || mke.m158756c(this.f1483f) == 0.0f) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / 4.0f) * mke.m158758h(this.f1483f, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            this.f1483f.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1376s(0);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1366i(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        return this.f1502y.m104394d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f1502y.m104403m();
    }

    /* JADX INFO: renamed from: j */
    public void m1367j(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @NonNull int[] iArr2) {
        this.f1502y.m104395e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: k */
    public final void m1368k(int i) {
        if (i != 0) {
            if (this.f1491n) {
                m1354N(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1369l(int i) {
        if (mke.m158756c(this.f1482e) != 0.0f) {
            if (m1353M(this.f1482e, i)) {
                this.f1482e.onAbsorb(i);
                return true;
            }
            m1373p(-i);
            return true;
        }
        if (mke.m158756c(this.f1483f) == 0.0f) {
            return false;
        }
        int i2 = -i;
        if (m1353M(this.f1483f, i2)) {
            this.f1483f.onAbsorb(i2);
            return true;
        }
        m1373p(i2);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m1370m() {
        this.f1495r = -1;
        this.f1488k = false;
        m1346F();
        stopNestedScroll(0);
        this.f1482e.onRelease();
        this.f1483f.onRelease();
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    public boolean m1371n(@NonNull KeyEvent keyEvent) {
        this.f1480c.setEmpty();
        if (!m1363e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? m1374q(33) : m1361c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? m1374q(130) : m1361c(130);
            }
            if (keyCode == 62) {
                m1345E(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return m1374q(33);
            }
            if (keyCode == 93) {
                return m1374q(130);
            }
            if (keyCode == 122) {
                m1345E(33);
                return false;
            }
            if (keyCode == 123) {
                m1345E(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX INFO: renamed from: o */
    public final View m1372o(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1486i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f1488k) {
            if (u610.m194647g(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (u610.m194647g(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m1350J(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, u610.m194647g(motionEvent, 8194));
                if (i != 0) {
                    this.f1477B.m175023g(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f1488k) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            if (m1377t((int) motionEvent.getX(), y)) {
                this.f1484g = y;
                this.f1495r = motionEvent.getPointerId(0);
                m1378u();
                this.f1489l.addMovement(motionEvent);
                this.f1481d.computeScrollOffset();
                if (!m1359S(motionEvent) && this.f1481d.isFinished()) {
                    z = false;
                }
                this.f1488k = z;
                m1358R(2, 0);
            } else {
                if (!m1359S(motionEvent) && this.f1481d.isFinished()) {
                    z = false;
                }
                this.f1488k = z;
                m1346F();
            }
        } else if (i == 1) {
            this.f1488k = false;
            this.f1495r = -1;
            m1346F();
            if (this.f1481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i == 2) {
            int i2 = this.f1495r;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f1484g) > this.f1492o && (2 & getNestedScrollAxes()) == 0) {
                        this.f1488k = true;
                        this.f1484g = y2;
                        m1380w();
                        this.f1489l.addMovement(motionEvent);
                        this.f1498u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f1488k = false;
            this.f1495r = -1;
            m1346F();
            if (this.f1481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i == 6) {
            m1343C(motionEvent);
        }
        return this.f1488k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f1485h = false;
        View view = this.f1487j;
        if (view != null && m1340z(view, this)) {
            m1351K(this.f1487j);
        }
        this.f1487j = null;
        if (!this.f1486i) {
            if (this.f1500w != null) {
                scrollTo(getScrollX(), this.f1500w.scrollPosition);
                this.f1500w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM1339f = m1339f(scrollY, paddingTop, measuredHeight);
            if (iM1339f != scrollY) {
                scrollTo(getScrollX(), iM1339f);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1486i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1490m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m1373p((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
        m1342B(i4, 0, null);
    }

    @Override // p153l.ci20
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f1501x.m125665c(view, view2, i, i2);
        m1358R(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || m1382y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1500w = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m1341A(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f1480c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f1480c);
        m1368k(m1364g(this.f1480c));
    }

    @Override // p153l.ci20
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p153l.ci20
    public void onStopNestedScroll(@NonNull View view, int i) {
        this.f1501x.m125667e(view, i);
        stopNestedScroll(i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        m1380w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1498u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f1498u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1489l;
                velocityTracker.computeCurrentVelocity(1000, this.f1494q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1495r);
                if (Math.abs(yVelocity) >= this.f1493p) {
                    if (!m1369l(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            m1373p(i);
                        }
                    }
                } else if (this.f1481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m1370m();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1495r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1495r + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f1484g - y;
                    int iM1347G = i2 - m1347G(i2, motionEvent.getX(iFindPointerIndex));
                    if (!this.f1488k && Math.abs(iM1347G) > this.f1492o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1488k = true;
                        int i3 = this.f1492o;
                        iM1347G = iM1347G > 0 ? iM1347G - i3 : iM1347G + i3;
                    }
                    if (this.f1488k) {
                        int iM1350J = m1350J(iM1347G, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1484g = y - iM1350J;
                        this.f1498u += iM1350J;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1488k && getChildCount() > 0 && this.f1481d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m1370m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1484g = (int) motionEvent.getY(actionIndex);
                this.f1495r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m1343C(motionEvent);
                this.f1484g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1495r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1488k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1481d.isFinished()) {
                m1360a();
            }
            m1381x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f1489l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m1373p(int i) {
        if (getChildCount() > 0) {
            this.f1481d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            m1348H(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m1374q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1480c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1480c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1480c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1480c;
        return m1349I(i, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: r */
    public final float m1375r(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.f1478a * 0.015f));
        float f = f1473C;
        return (float) (((double) (this.f1478a * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1485h) {
            this.f1487j = view2;
        } else {
            m1351K(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1352L(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1346F();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1485h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public boolean m1376s(int i) {
        return this.f1502y.m104402l(i);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM1339f = m1339f(i, width, width2);
            int iM1339f2 = m1339f(i2, height, height2);
            if (iM1339f == getScrollX() && iM1339f2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM1339f, iM1339f2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1490m) {
            this.f1490m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f1502y.m104404n(z);
    }

    public void setOnScrollChangeListener(@Nullable InterfaceC0263d interfaceC0263d) {
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1491n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m1358R(i, 0);
    }

    @Override // p153l.zh20
    public void stopNestedScroll(int i) {
        this.f1502y.m104409s(i);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1377t(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final void m1378u() {
        VelocityTracker velocityTracker = this.f1489l;
        if (velocityTracker == null) {
            this.f1489l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1379v() {
        this.f1481d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1492o = viewConfiguration.getScaledTouchSlop();
        this.f1493p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1494q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: w */
    public final void m1380w() {
        if (this.f1489l == null) {
            this.f1489l = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1381x(int i, int i2) {
        this.f1484g = i;
        this.f1495r = i2;
        m1358R(2, 0);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1382y(View view) {
        return !m1341A(view, 0, getHeight());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // p153l.ci20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        m1342B(i4, i5, null);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // p153l.di20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        m1342B(i4, i5, iArr);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0259a();
        public int scrollPosition;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C0259a implements Parcelable.Creator<SavedState> {
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
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }

        @NonNull
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.scrollPosition + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // p153l.ci20
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        m1366i(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            wtq0.m207906a("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            wtq0.m207906a("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            wtq0.m207906a("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, m8c0.f135172c);
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }
}
