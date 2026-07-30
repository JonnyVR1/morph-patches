package com.p000p1.mobile.putong.feed.newui.mediapicker;

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
import com.google.android.material.R;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.gbl0;
import l.ig3;
import l.ky00;
import l.qsk0;
import l.s920;
import l.ubl0;
import l.y760;
import l.z760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TopSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a */
    public float f1966a;

    /* JADX INFO: renamed from: b */
    public int f1967b;

    /* JADX INFO: renamed from: c */
    public int f1968c;

    /* JADX INFO: renamed from: d */
    public int f1969d;

    /* JADX INFO: renamed from: e */
    public boolean f1970e;

    /* JADX INFO: renamed from: f */
    public boolean f1971f;

    /* JADX INFO: renamed from: g */
    public int f1972g;

    /* JADX INFO: renamed from: h */
    public ubl0 f1973h;

    /* JADX INFO: renamed from: i */
    public boolean f1974i;

    /* JADX INFO: renamed from: j */
    public int f1975j;

    /* JADX INFO: renamed from: k */
    public boolean f1976k;

    /* JADX INFO: renamed from: l */
    public int f1977l;

    /* JADX INFO: renamed from: m */
    public WeakReference<V> f1978m;

    /* JADX INFO: renamed from: n */
    public WeakReference<View> f1979n;

    /* JADX INFO: renamed from: o */
    public AbstractC2082c f1980o;

    /* JADX INFO: renamed from: p */
    public VelocityTracker f1981p;

    /* JADX INFO: renamed from: q */
    public int f1982q;

    /* JADX INFO: renamed from: r */
    public int f1983r;

    /* JADX INFO: renamed from: s */
    public boolean f1984s;

    /* JADX INFO: renamed from: t */
    public final ubl0.c f1985t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$a */
    public class C2080a extends ubl0.c {
        public C2080a() {
        }

        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return TopSheetBehavior.m3576m(i, TopSheetBehavior.this.f1970e ? -view.getHeight() : TopSheetBehavior.this.f1968c, TopSheetBehavior.this.f1969d);
        }

        public int getViewVerticalDragRange(View view) {
            return TopSheetBehavior.this.f1970e ? view.getHeight() : TopSheetBehavior.this.f1969d - TopSheetBehavior.this.f1968c;
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                TopSheetBehavior.this.setStateInternal(1);
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            TopSheetBehavior.this.dispatchOnSlide(i2);
        }

        public void onViewReleased(View view, float f, float f2) {
            int i;
            TopSheetBehavior topSheetBehavior = TopSheetBehavior.this;
            int i2 = 3;
            if (f2 > 0.0f) {
                i = topSheetBehavior.f1969d;
            } else if (topSheetBehavior.f1970e && TopSheetBehavior.this.shouldHide(view, f2)) {
                i = -((View) TopSheetBehavior.this.f1978m.get()).getHeight();
                i2 = 5;
            } else {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    int iAbs = Math.abs(top - TopSheetBehavior.this.f1968c);
                    int iAbs2 = Math.abs(top - TopSheetBehavior.this.f1969d);
                    TopSheetBehavior topSheetBehavior2 = TopSheetBehavior.this;
                    if (iAbs > iAbs2) {
                        i = topSheetBehavior2.f1969d;
                    } else {
                        i = topSheetBehavior2.f1968c;
                    }
                } else {
                    i = TopSheetBehavior.this.f1968c;
                }
                i2 = 4;
            }
            boolean zO = TopSheetBehavior.this.f1973h.O(view.getLeft(), i);
            TopSheetBehavior topSheetBehavior3 = TopSheetBehavior.this;
            if (!zO) {
                topSheetBehavior3.setStateInternal(i2);
            } else {
                topSheetBehavior3.setStateInternal(2);
                gbl0.b0(view, new RunnableC2081b(view, i2));
            }
        }

        public boolean tryCaptureView(View view, int i) {
            if (TopSheetBehavior.this.f1972g == 1 || TopSheetBehavior.this.f1984s) {
                return false;
            }
            if (TopSheetBehavior.this.f1972g == 3 && TopSheetBehavior.this.f1982q == i) {
                View view2 = (View) TopSheetBehavior.this.f1979n.get();
                if (NullChecker.a(view2) && gbl0.d(view2, -1)) {
                    return false;
                }
            }
            return TopSheetBehavior.this.f1978m != null && TopSheetBehavior.this.f1978m.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$b */
    public class RunnableC2081b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f1987a;

        /* JADX INFO: renamed from: b */
        public final int f1988b;

        public RunnableC2081b(View view, int i) {
            this.f1987a = view;
            this.f1988b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.a(TopSheetBehavior.this.f1973h) && TopSheetBehavior.this.f1973h.n(true)) {
                gbl0.b0(this.f1987a, this);
            } else {
                TopSheetBehavior.this.setStateInternal(this.f1988b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$c */
    public static abstract class AbstractC2082c {
        /* JADX INFO: renamed from: a */
        public abstract void mo3581a(@NonNull View view, float f);

        /* JADX INFO: renamed from: b */
        public abstract void mo3582b(@NonNull View view, int i);
    }

    public TopSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1972g = 4;
        this.f1985t = new C2080a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, 0));
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1966a = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(int i) {
        V v = this.f1978m.get();
        if (NullChecker.a(v) && NullChecker.a(this.f1980o)) {
            int i2 = this.f1968c;
            AbstractC2082c abstractC2082c = this.f1980o;
            if (i < i2) {
                abstractC2082c.mo3581a(v, (i - i2) / this.f1967b);
            } else {
                abstractC2082c.mo3581a(v, (i - i2) / (this.f1969d - i2));
            }
        }
    }

    private View findScrollingChild(View view) {
        if (view instanceof s920) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (NullChecker.a(viewFindScrollingChild)) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int m3576m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: n */
    public static <V extends View> TopSheetBehavior<V> m3577n(V v) {
        CoordinatorLayout.f layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            ig3.a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.c cVarF = layoutParams.f();
        if (cVarF instanceof TopSheetBehavior) {
            return (TopSheetBehavior) cVarF;
        }
        ig3.a("The view is not associated with TopSheetBehavior");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateInternal(int i) {
        if (this.f1972g == i) {
            return;
        }
        this.f1972g = i;
        V v = this.f1978m.get();
        if (NullChecker.a(v) && NullChecker.a(this.f1980o)) {
            this.f1980o.mo3582b(v, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHide(View view, float f) {
        return view.getTop() <= this.f1968c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f1968c)) / ((float) this.f1967b) > 0.5f;
    }

    public final float getYVelocity() {
        this.f1981p.computeCurrentVelocity(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, this.f1966a);
        return qsk0.f(this.f1981p, this.f1982q);
    }

    /* JADX INFO: renamed from: o */
    public void m3578o(AbstractC2082c abstractC2082c) {
        this.f1980o = abstractC2082c;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int iC = ky00.c(motionEvent);
        if (iC == 0) {
            reset();
        }
        if (this.f1981p == null) {
            this.f1981p = VelocityTracker.obtain();
        }
        this.f1981p.addMovement(motionEvent);
        if (iC == 0) {
            int x = (int) motionEvent.getX();
            this.f1983r = (int) motionEvent.getY();
            View view = this.f1979n.get();
            if (NullChecker.a(view) && coordinatorLayout.isPointInChildBounds(view, x, this.f1983r)) {
                this.f1982q = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f1984s = true;
            }
            this.f1974i = this.f1982q == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.f1983r);
        } else if (iC == 1 || iC == 3) {
            this.f1984s = false;
            this.f1982q = -1;
            if (this.f1974i) {
                this.f1974i = false;
                return false;
            }
        }
        if (!this.f1974i && this.f1973h.P(motionEvent)) {
            return true;
        }
        View view2 = this.f1979n.get();
        return (iC != 2 || view2 == null || this.f1974i || this.f1972g == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f1983r) - motionEvent.getY()) <= ((float) this.f1973h.z())) ? false : true;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (gbl0.u(coordinatorLayout) && !gbl0.u(v)) {
            gbl0.r0(v, true);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.f1977l = coordinatorLayout.getHeight();
        int iMax = Math.max(-v.getHeight(), -(v.getHeight() - this.f1967b));
        this.f1968c = iMax;
        this.f1969d = 0;
        int i2 = this.f1972g;
        if (i2 == 3) {
            gbl0.V(v, 0);
        } else if (this.f1970e && i2 == 5) {
            gbl0.V(v, -v.getHeight());
        } else if (i2 == 4) {
            gbl0.V(v, iMax);
        } else if (i2 == 1 || i2 == 2) {
            gbl0.V(v, top - v.getTop());
        }
        if (this.f1973h == null) {
            this.f1973h = ubl0.p(coordinatorLayout, this.f1985t);
        }
        this.f1978m = new WeakReference<>(v);
        this.f1979n = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.f1979n.get()) {
            return this.f1972g != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.f1979n.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            if (!gbl0.d(view, 1)) {
                int i4 = this.f1968c;
                if (i3 >= i4 || this.f1970e) {
                    iArr[1] = i2;
                    gbl0.V(v, -i2);
                    setStateInternal(1);
                } else {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    gbl0.V(v, -i5);
                    setStateInternal(4);
                }
            }
        } else if (i2 < 0) {
            int i6 = this.f1969d;
            if (i3 < i6) {
                iArr[1] = i2;
                gbl0.V(v, -i2);
                setStateInternal(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                gbl0.V(v, -i7);
                setStateInternal(3);
            }
        }
        dispatchOnSlide(v.getTop());
        this.f1975j = i2;
        this.f1976k = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.f1972g = 4;
        } else {
            this.f1972g = i;
        }
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.f1972g);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f1975j = 0;
        this.f1976k = false;
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.f1969d) {
            setStateInternal(3);
            return;
        }
        if (view == this.f1979n.get() && this.f1976k) {
            if (this.f1975j < 0) {
                i = this.f1969d;
            } else if (this.f1970e && shouldHide(v, getYVelocity())) {
                i = -v.getHeight();
                i2 = 5;
            } else {
                if (this.f1975j == 0) {
                    int top = v.getTop();
                    if (Math.abs(top - this.f1968c) > Math.abs(top - this.f1969d)) {
                        i = this.f1969d;
                    } else {
                        i = this.f1968c;
                    }
                } else {
                    i = this.f1968c;
                }
                i2 = 4;
            }
            if (this.f1973h.Q(v, v.getLeft(), i)) {
                setStateInternal(2);
                gbl0.b0(v, new RunnableC2081b(v, i2));
            } else {
                setStateInternal(i2);
            }
            this.f1976k = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int iC = ky00.c(motionEvent);
        if (this.f1972g == 1 && iC == 0) {
            return true;
        }
        if (NullChecker.a(this.f1973h)) {
            this.f1973h.G(motionEvent);
        }
        if (iC == 0) {
            reset();
        }
        if (this.f1981p == null) {
            this.f1981p = VelocityTracker.obtain();
        }
        this.f1981p.addMovement(motionEvent);
        if (iC == 2 && !this.f1974i && Math.abs(this.f1983r - motionEvent.getY()) > this.f1973h.z()) {
            this.f1973h.c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f1974i;
    }

    public final void reset() {
        this.f1982q = -1;
        if (NullChecker.a(this.f1981p)) {
            this.f1981p.recycle();
            this.f1981p = null;
        }
    }

    public void setHideable(boolean z) {
        this.f1970e = z;
    }

    public final void setPeekHeight(int i) {
        this.f1967b = Math.max(0, i);
        if (NullChecker.a(this.f1978m) && NullChecker.a(this.f1978m.get())) {
            this.f1968c = Math.max(-this.f1978m.get().getHeight(), -(this.f1978m.get().getHeight() - this.f1967b));
        }
    }

    public void setSkipCollapsed(boolean z) {
        this.f1971f = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = y760.a(new C2079a());
        final int state;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$SavedState$a */
        public class C2079a implements z760<SavedState> {
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

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
        this.f1972g = 4;
        this.f1985t = new C2080a();
    }
}
