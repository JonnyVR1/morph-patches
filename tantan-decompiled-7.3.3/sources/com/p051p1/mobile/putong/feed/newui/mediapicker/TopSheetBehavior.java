package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C2489R;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p153l.ai20;
import p153l.dg60;
import p153l.eg60;
import p153l.kkl0;
import p153l.u610;
import p153l.w1l0;
import p153l.wg3;
import p153l.ykl0;

/* JADX INFO: loaded from: classes13.dex */
public class TopSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0227c<V> {

    /* JADX INFO: renamed from: a */
    public float f41353a;

    /* JADX INFO: renamed from: b */
    public int f41354b;

    /* JADX INFO: renamed from: c */
    public int f41355c;

    /* JADX INFO: renamed from: d */
    public int f41356d;

    /* JADX INFO: renamed from: e */
    public boolean f41357e;

    /* JADX INFO: renamed from: f */
    public boolean f41358f;

    /* JADX INFO: renamed from: g */
    public int f41359g;

    /* JADX INFO: renamed from: h */
    public ykl0 f41360h;

    /* JADX INFO: renamed from: i */
    public boolean f41361i;

    /* JADX INFO: renamed from: j */
    public int f41362j;

    /* JADX INFO: renamed from: k */
    public boolean f41363k;

    /* JADX INFO: renamed from: l */
    public int f41364l;

    /* JADX INFO: renamed from: m */
    public WeakReference<V> f41365m;

    /* JADX INFO: renamed from: n */
    public WeakReference<View> f41366n;

    /* JADX INFO: renamed from: o */
    public AbstractC11401c f41367o;

    /* JADX INFO: renamed from: p */
    public VelocityTracker f41368p;

    /* JADX INFO: renamed from: q */
    public int f41369q;

    /* JADX INFO: renamed from: r */
    public int f41370r;

    /* JADX INFO: renamed from: s */
    public boolean f41371s;

    /* JADX INFO: renamed from: t */
    public final ykl0.AbstractC21619c f41372t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$a */
    public class C11399a extends ykl0.AbstractC21619c {
        public C11399a() {
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return TopSheetBehavior.m63754m(i, TopSheetBehavior.this.f41357e ? -view.getHeight() : TopSheetBehavior.this.f41355c, TopSheetBehavior.this.f41356d);
        }

        @Override // p153l.ykl0.AbstractC21619c
        public int getViewVerticalDragRange(View view) {
            return TopSheetBehavior.this.f41357e ? view.getHeight() : TopSheetBehavior.this.f41356d - TopSheetBehavior.this.f41355c;
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                TopSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            TopSheetBehavior.this.dispatchOnSlide(i2);
        }

        @Override // p153l.ykl0.AbstractC21619c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            TopSheetBehavior topSheetBehavior = TopSheetBehavior.this;
            int i2 = 3;
            if (f2 > 0.0f) {
                i = topSheetBehavior.f41356d;
            } else if (topSheetBehavior.f41357e && TopSheetBehavior.this.shouldHide(view, f2)) {
                i = -((View) TopSheetBehavior.this.f41365m.get()).getHeight();
                i2 = 5;
            } else {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    int iAbs = Math.abs(top - TopSheetBehavior.this.f41355c);
                    int iAbs2 = Math.abs(top - TopSheetBehavior.this.f41356d);
                    TopSheetBehavior topSheetBehavior2 = TopSheetBehavior.this;
                    if (iAbs > iAbs2) {
                        i = topSheetBehavior2.f41356d;
                    } else {
                        i = topSheetBehavior2.f41355c;
                    }
                } else {
                    i = TopSheetBehavior.this.f41355c;
                }
                i2 = 4;
            }
            boolean zM216499O = TopSheetBehavior.this.f41360h.m216499O(view.getLeft(), i);
            TopSheetBehavior topSheetBehavior3 = TopSheetBehavior.this;
            if (!zM216499O) {
                topSheetBehavior3.setStateInternal(i2);
            } else {
                topSheetBehavior3.setStateInternal(2);
                kkl0.m150148b0(view, new RunnableC11400b(view, i2));
            }
        }

        @Override // p153l.ykl0.AbstractC21619c
        public boolean tryCaptureView(View view, int i) {
            if (TopSheetBehavior.this.f41359g == 1 || TopSheetBehavior.this.f41371s) {
                return false;
            }
            if (TopSheetBehavior.this.f41359g == 3 && TopSheetBehavior.this.f41369q == i) {
                View view2 = (View) TopSheetBehavior.this.f41366n.get();
                if (NullChecker.m82486a(view2) && kkl0.m150151d(view2, -1)) {
                    return false;
                }
            }
            return TopSheetBehavior.this.f41365m != null && TopSheetBehavior.this.f41365m.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$b */
    public class RunnableC11400b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f41374a;

        /* JADX INFO: renamed from: b */
        public final int f41375b;

        public RunnableC11400b(View view, int i) {
            this.f41374a = view;
            this.f41375b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m82486a(TopSheetBehavior.this.f41360h) && TopSheetBehavior.this.f41360h.m216516n(true)) {
                kkl0.m150148b0(this.f41374a, this);
            } else {
                TopSheetBehavior.this.setStateInternal(this.f41375b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$c */
    public static abstract class AbstractC11401c {
        /* JADX INFO: renamed from: a */
        public abstract void mo63759a(@NonNull View view, float f);

        /* JADX INFO: renamed from: b */
        public abstract void mo63760b(@NonNull View view, int i);
    }

    public TopSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41359g = 4;
        this.f41372t = new C11399a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2489R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C2489R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, 0));
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C2489R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C2489R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f41353a = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(int i) {
        V v2 = this.f41365m.get();
        if (NullChecker.m82486a(v2) && NullChecker.m82486a(this.f41367o)) {
            int i2 = this.f41355c;
            AbstractC11401c abstractC11401c = this.f41367o;
            if (i < i2) {
                abstractC11401c.mo63759a(v2, (i - i2) / this.f41354b);
            } else {
                abstractC11401c.mo63759a(v2, (i - i2) / (this.f41356d - i2));
            }
        }
    }

    private View findScrollingChild(View view) {
        if (view instanceof ai20) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (NullChecker.m82486a(viewFindScrollingChild)) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int m63754m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: n */
    public static <V extends View> TopSheetBehavior<V> m63755n(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0230f)) {
            wg3.m206174a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.AbstractC0227c abstractC0227cM1182f = ((CoordinatorLayout.C0230f) layoutParams).m1182f();
        if (abstractC0227cM1182f instanceof TopSheetBehavior) {
            return (TopSheetBehavior) abstractC0227cM1182f;
        }
        wg3.m206174a("The view is not associated with TopSheetBehavior");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateInternal(int i) {
        if (this.f41359g == i) {
            return;
        }
        this.f41359g = i;
        V v2 = this.f41365m.get();
        if (NullChecker.m82486a(v2) && NullChecker.m82486a(this.f41367o)) {
            this.f41367o.mo63760b(v2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHide(View view, float f) {
        return view.getTop() <= this.f41355c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f41355c)) / ((float) this.f41354b) > 0.5f;
    }

    public final float getYVelocity() {
        this.f41368p.computeCurrentVelocity(1000, this.f41353a);
        return w1l0.m204449f(this.f41368p, this.f41369q);
    }

    /* JADX INFO: renamed from: o */
    public void m63756o(AbstractC11401c abstractC11401c) {
        this.f41367o = abstractC11401c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int iM194643c = u610.m194643c(motionEvent);
        if (iM194643c == 0) {
            reset();
        }
        if (this.f41368p == null) {
            this.f41368p = VelocityTracker.obtain();
        }
        this.f41368p.addMovement(motionEvent);
        if (iM194643c == 0) {
            int x = (int) motionEvent.getX();
            this.f41370r = (int) motionEvent.getY();
            View view = this.f41366n.get();
            if (NullChecker.m82486a(view) && coordinatorLayout.isPointInChildBounds(view, x, this.f41370r)) {
                this.f41369q = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f41371s = true;
            }
            this.f41361i = this.f41369q == -1 && !coordinatorLayout.isPointInChildBounds(v2, x, this.f41370r);
        } else if (iM194643c == 1 || iM194643c == 3) {
            this.f41371s = false;
            this.f41369q = -1;
            if (this.f41361i) {
                this.f41361i = false;
                return false;
            }
        }
        if (!this.f41361i && this.f41360h.m216500P(motionEvent)) {
            return true;
        }
        View view2 = this.f41366n.get();
        return (iM194643c != 2 || view2 == null || this.f41361i || this.f41359g == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f41370r) - motionEvent.getY()) <= ((float) this.f41360h.m216526z())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i) {
        if (kkl0.m150185u(coordinatorLayout) && !kkl0.m150185u(v2)) {
            kkl0.m150180r0(v2, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i);
        this.f41364l = coordinatorLayout.getHeight();
        int iMax = Math.max(-v2.getHeight(), -(v2.getHeight() - this.f41354b));
        this.f41355c = iMax;
        this.f41356d = 0;
        int i2 = this.f41359g;
        if (i2 == 3) {
            kkl0.m150140V(v2, 0);
        } else if (this.f41357e && i2 == 5) {
            kkl0.m150140V(v2, -v2.getHeight());
        } else if (i2 == 4) {
            kkl0.m150140V(v2, iMax);
        } else if (i2 == 1 || i2 == 2) {
            kkl0.m150140V(v2, top - v2.getTop());
        }
        if (this.f41360h == null) {
            this.f41360h = ykl0.m216484p(coordinatorLayout, this.f41372t);
        }
        this.f41365m = new WeakReference<>(v2);
        this.f41366n = new WeakReference<>(findScrollingChild(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f, float f2) {
        if (view == this.f41366n.get()) {
            return this.f41359g != 3 || super.onNestedPreFling(coordinatorLayout, v2, view, f, f2);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i, int i2, int[] iArr) {
        if (view != this.f41366n.get()) {
            return;
        }
        int top = v2.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            if (!kkl0.m150151d(view, 1)) {
                int i4 = this.f41355c;
                if (i3 >= i4 || this.f41357e) {
                    iArr[1] = i2;
                    kkl0.m150140V(v2, -i2);
                    setStateInternal(1);
                } else {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    kkl0.m150140V(v2, -i5);
                    setStateInternal(4);
                }
            }
        } else if (i2 < 0) {
            int i6 = this.f41356d;
            if (i3 < i6) {
                iArr[1] = i2;
                kkl0.m150140V(v2, -i2);
                setStateInternal(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                kkl0.m150140V(v2, -i7);
                setStateInternal(3);
            }
        }
        dispatchOnSlide(v2.getTop());
        this.f41362j = i2;
        this.f41363k = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v2, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.f41359g = 4;
        } else {
            this.f41359g = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.f41359g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i) {
        this.f41362j = 0;
        this.f41363k = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i;
        int i2 = 3;
        if (v2.getTop() == this.f41356d) {
            setStateInternal(3);
            return;
        }
        if (view == this.f41366n.get() && this.f41363k) {
            if (this.f41362j < 0) {
                i = this.f41356d;
            } else if (this.f41357e && shouldHide(v2, getYVelocity())) {
                i = -v2.getHeight();
                i2 = 5;
            } else {
                if (this.f41362j == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f41355c) > Math.abs(top - this.f41356d)) {
                        i = this.f41356d;
                    } else {
                        i = this.f41355c;
                    }
                } else {
                    i = this.f41355c;
                }
                i2 = 4;
            }
            if (this.f41360h.m216501Q(v2, v2.getLeft(), i)) {
                setStateInternal(2);
                kkl0.m150148b0(v2, new RunnableC11400b(v2, i2));
            } else {
                setStateInternal(i2);
            }
            this.f41363k = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int iM194643c = u610.m194643c(motionEvent);
        if (this.f41359g == 1 && iM194643c == 0) {
            return true;
        }
        if (NullChecker.m82486a(this.f41360h)) {
            this.f41360h.m216491G(motionEvent);
        }
        if (iM194643c == 0) {
            reset();
        }
        if (this.f41368p == null) {
            this.f41368p = VelocityTracker.obtain();
        }
        this.f41368p.addMovement(motionEvent);
        if (iM194643c == 2 && !this.f41361i && Math.abs(this.f41370r - motionEvent.getY()) > this.f41360h.m216526z()) {
            this.f41360h.m216505c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f41361i;
    }

    public final void reset() {
        this.f41369q = -1;
        if (NullChecker.m82486a(this.f41368p)) {
            this.f41368p.recycle();
            this.f41368p = null;
        }
    }

    public void setHideable(boolean z) {
        this.f41357e = z;
    }

    public final void setPeekHeight(int i) {
        this.f41354b = Math.max(0, i);
        if (NullChecker.m82486a(this.f41365m) && NullChecker.m82486a(this.f41365m.get())) {
            this.f41355c = Math.max(-this.f41365m.get().getHeight(), -(this.f41365m.get().getHeight() - this.f41354b));
        }
    }

    public void setSkipCollapsed(boolean z) {
        this.f41358f = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = dg60.m115630a(new C11398a());
        final int state;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$SavedState$a */
        public class C11398a implements eg60<SavedState> {
            @Override // p153l.eg60
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // p153l.eg60
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    public TopSheetBehavior() {
        this.f41359g = 4;
        this.f41372t = new C11399a();
    }
}
