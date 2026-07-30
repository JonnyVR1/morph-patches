package com.p046p1.mobile.putong.feed.newui.mediapicker;

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
import com.google.android.material.C2466R;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import p149l.gbl0;
import p149l.ig3;
import p149l.ky00;
import p149l.qsk0;
import p149l.s920;
import p149l.ubl0;
import p149l.y760;
import p149l.z760;

/* JADX INFO: loaded from: classes12.dex */
public class TopSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0226c<V> {

    /* JADX INFO: renamed from: a */
    public float f40505a;

    /* JADX INFO: renamed from: b */
    public int f40506b;

    /* JADX INFO: renamed from: c */
    public int f40507c;

    /* JADX INFO: renamed from: d */
    public int f40508d;

    /* JADX INFO: renamed from: e */
    public boolean f40509e;

    /* JADX INFO: renamed from: f */
    public boolean f40510f;

    /* JADX INFO: renamed from: g */
    public int f40511g;

    /* JADX INFO: renamed from: h */
    public ubl0 f40512h;

    /* JADX INFO: renamed from: i */
    public boolean f40513i;

    /* JADX INFO: renamed from: j */
    public int f40514j;

    /* JADX INFO: renamed from: k */
    public boolean f40515k;

    /* JADX INFO: renamed from: l */
    public int f40516l;

    /* JADX INFO: renamed from: m */
    public WeakReference<V> f40517m;

    /* JADX INFO: renamed from: n */
    public WeakReference<View> f40518n;

    /* JADX INFO: renamed from: o */
    public AbstractC11238c f40519o;

    /* JADX INFO: renamed from: p */
    public VelocityTracker f40520p;

    /* JADX INFO: renamed from: q */
    public int f40521q;

    /* JADX INFO: renamed from: r */
    public int f40522r;

    /* JADX INFO: renamed from: s */
    public boolean f40523s;

    /* JADX INFO: renamed from: t */
    public final ubl0.AbstractC20403c f40524t;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$a */
    public class C11236a extends ubl0.AbstractC20403c {
        public C11236a() {
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return TopSheetBehavior.m62571m(i, TopSheetBehavior.this.f40509e ? -view.getHeight() : TopSheetBehavior.this.f40507c, TopSheetBehavior.this.f40508d);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public int getViewVerticalDragRange(View view) {
            return TopSheetBehavior.this.f40509e ? view.getHeight() : TopSheetBehavior.this.f40508d - TopSheetBehavior.this.f40507c;
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                TopSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            TopSheetBehavior.this.dispatchOnSlide(i2);
        }

        @Override // p149l.ubl0.AbstractC20403c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            TopSheetBehavior topSheetBehavior = TopSheetBehavior.this;
            int i2 = 3;
            if (f2 > 0.0f) {
                i = topSheetBehavior.f40508d;
            } else if (topSheetBehavior.f40509e && TopSheetBehavior.this.shouldHide(view, f2)) {
                i = -((View) TopSheetBehavior.this.f40517m.get()).getHeight();
                i2 = 5;
            } else {
                if (f2 == 0.0f) {
                    int top = view.getTop();
                    int iAbs = Math.abs(top - TopSheetBehavior.this.f40507c);
                    int iAbs2 = Math.abs(top - TopSheetBehavior.this.f40508d);
                    TopSheetBehavior topSheetBehavior2 = TopSheetBehavior.this;
                    if (iAbs > iAbs2) {
                        i = topSheetBehavior2.f40508d;
                    } else {
                        i = topSheetBehavior2.f40507c;
                    }
                } else {
                    i = TopSheetBehavior.this.f40507c;
                }
                i2 = 4;
            }
            boolean zM192851O = TopSheetBehavior.this.f40512h.m192851O(view.getLeft(), i);
            TopSheetBehavior topSheetBehavior3 = TopSheetBehavior.this;
            if (!zM192851O) {
                topSheetBehavior3.setStateInternal(i2);
            } else {
                topSheetBehavior3.setStateInternal(2);
                gbl0.m125185b0(view, new RunnableC11237b(view, i2));
            }
        }

        @Override // p149l.ubl0.AbstractC20403c
        public boolean tryCaptureView(View view, int i) {
            if (TopSheetBehavior.this.f40511g == 1 || TopSheetBehavior.this.f40523s) {
                return false;
            }
            if (TopSheetBehavior.this.f40511g == 3 && TopSheetBehavior.this.f40521q == i) {
                View view2 = (View) TopSheetBehavior.this.f40518n.get();
                if (NullChecker.m81303a(view2) && gbl0.m125188d(view2, -1)) {
                    return false;
                }
            }
            return TopSheetBehavior.this.f40517m != null && TopSheetBehavior.this.f40517m.get() == view;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$b */
    public class RunnableC11237b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f40526a;

        /* JADX INFO: renamed from: b */
        public final int f40527b;

        public RunnableC11237b(View view, int i) {
            this.f40526a = view;
            this.f40527b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NullChecker.m81303a(TopSheetBehavior.this.f40512h) && TopSheetBehavior.this.f40512h.m192868n(true)) {
                gbl0.m125185b0(this.f40526a, this);
            } else {
                TopSheetBehavior.this.setStateInternal(this.f40527b);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$c */
    public static abstract class AbstractC11238c {
        /* JADX INFO: renamed from: a */
        public abstract void mo62576a(@NonNull View view, float f);

        /* JADX INFO: renamed from: b */
        public abstract void mo62577b(@NonNull View view, int i);
    }

    public TopSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40511g = 4;
        this.f40524t = new C11236a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2466R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C2466R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, 0));
        setHideable(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f40505a = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(int i) {
        V v2 = this.f40517m.get();
        if (NullChecker.m81303a(v2) && NullChecker.m81303a(this.f40519o)) {
            int i2 = this.f40507c;
            AbstractC11238c abstractC11238c = this.f40519o;
            if (i < i2) {
                abstractC11238c.mo62576a(v2, (i - i2) / this.f40506b);
            } else {
                abstractC11238c.mo62576a(v2, (i - i2) / (this.f40508d - i2));
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
            if (NullChecker.m81303a(viewFindScrollingChild)) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int m62571m(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: n */
    public static <V extends View> TopSheetBehavior<V> m62572n(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C0229f)) {
            ig3.m135964a("The view is not a child of CoordinatorLayout");
            return null;
        }
        CoordinatorLayout.AbstractC0226c abstractC0226cM1181f = ((CoordinatorLayout.C0229f) layoutParams).m1181f();
        if (abstractC0226cM1181f instanceof TopSheetBehavior) {
            return (TopSheetBehavior) abstractC0226cM1181f;
        }
        ig3.m135964a("The view is not associated with TopSheetBehavior");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateInternal(int i) {
        if (this.f40511g == i) {
            return;
        }
        this.f40511g = i;
        V v2 = this.f40517m.get();
        if (NullChecker.m81303a(v2) && NullChecker.m81303a(this.f40519o)) {
            this.f40519o.mo62577b(v2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHide(View view, float f) {
        return view.getTop() <= this.f40507c && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f40507c)) / ((float) this.f40506b) > 0.5f;
    }

    public final float getYVelocity() {
        this.f40520p.computeCurrentVelocity(1000, this.f40505a);
        return qsk0.m176305f(this.f40520p, this.f40521q);
    }

    /* JADX INFO: renamed from: o */
    public void m62573o(AbstractC11238c abstractC11238c) {
        this.f40519o = abstractC11238c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int iM147817c = ky00.m147817c(motionEvent);
        if (iM147817c == 0) {
            reset();
        }
        if (this.f40520p == null) {
            this.f40520p = VelocityTracker.obtain();
        }
        this.f40520p.addMovement(motionEvent);
        if (iM147817c == 0) {
            int x = (int) motionEvent.getX();
            this.f40522r = (int) motionEvent.getY();
            View view = this.f40518n.get();
            if (NullChecker.m81303a(view) && coordinatorLayout.isPointInChildBounds(view, x, this.f40522r)) {
                this.f40521q = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f40523s = true;
            }
            this.f40513i = this.f40521q == -1 && !coordinatorLayout.isPointInChildBounds(v2, x, this.f40522r);
        } else if (iM147817c == 1 || iM147817c == 3) {
            this.f40523s = false;
            this.f40521q = -1;
            if (this.f40513i) {
                this.f40513i = false;
                return false;
            }
        }
        if (!this.f40513i && this.f40512h.m192852P(motionEvent)) {
            return true;
        }
        View view2 = this.f40518n.get();
        return (iM147817c != 2 || view2 == null || this.f40513i || this.f40511g == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f40522r) - motionEvent.getY()) <= ((float) this.f40512h.m192878z())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v2, int i) {
        if (gbl0.m125222u(coordinatorLayout) && !gbl0.m125222u(v2)) {
            gbl0.m125217r0(v2, true);
        }
        int top = v2.getTop();
        coordinatorLayout.onLayoutChild(v2, i);
        this.f40516l = coordinatorLayout.getHeight();
        int iMax = Math.max(-v2.getHeight(), -(v2.getHeight() - this.f40506b));
        this.f40507c = iMax;
        this.f40508d = 0;
        int i2 = this.f40511g;
        if (i2 == 3) {
            gbl0.m125177V(v2, 0);
        } else if (this.f40509e && i2 == 5) {
            gbl0.m125177V(v2, -v2.getHeight());
        } else if (i2 == 4) {
            gbl0.m125177V(v2, iMax);
        } else if (i2 == 1 || i2 == 2) {
            gbl0.m125177V(v2, top - v2.getTop());
        }
        if (this.f40512h == null) {
            this.f40512h = ubl0.m192836p(coordinatorLayout, this.f40524t);
        }
        this.f40517m = new WeakReference<>(v2);
        this.f40518n = new WeakReference<>(findScrollingChild(v2));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v2, View view, float f, float f2) {
        if (view == this.f40518n.get()) {
            return this.f40511g != 3 || super.onNestedPreFling(coordinatorLayout, v2, view, f, f2);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v2, View view, int i, int i2, int[] iArr) {
        if (view != this.f40518n.get()) {
            return;
        }
        int top = v2.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            if (!gbl0.m125188d(view, 1)) {
                int i4 = this.f40507c;
                if (i3 >= i4 || this.f40509e) {
                    iArr[1] = i2;
                    gbl0.m125177V(v2, -i2);
                    setStateInternal(1);
                } else {
                    int i5 = top - i4;
                    iArr[1] = i5;
                    gbl0.m125177V(v2, -i5);
                    setStateInternal(4);
                }
            }
        } else if (i2 < 0) {
            int i6 = this.f40508d;
            if (i3 < i6) {
                iArr[1] = i2;
                gbl0.m125177V(v2, -i2);
                setStateInternal(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                gbl0.m125177V(v2, -i7);
                setStateInternal(3);
            }
        }
        dispatchOnSlide(v2.getTop());
        this.f40514j = i2;
        this.f40515k = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v2, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.f40511g = 4;
        } else {
            this.f40511g = i;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v2) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v2), this.f40511g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i) {
        this.f40514j = 0;
        this.f40515k = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v2, View view) {
        int i;
        int i2 = 3;
        if (v2.getTop() == this.f40508d) {
            setStateInternal(3);
            return;
        }
        if (view == this.f40518n.get() && this.f40515k) {
            if (this.f40514j < 0) {
                i = this.f40508d;
            } else if (this.f40509e && shouldHide(v2, getYVelocity())) {
                i = -v2.getHeight();
                i2 = 5;
            } else {
                if (this.f40514j == 0) {
                    int top = v2.getTop();
                    if (Math.abs(top - this.f40507c) > Math.abs(top - this.f40508d)) {
                        i = this.f40508d;
                    } else {
                        i = this.f40507c;
                    }
                } else {
                    i = this.f40507c;
                }
                i2 = 4;
            }
            if (this.f40512h.m192853Q(v2, v2.getLeft(), i)) {
                setStateInternal(2);
                gbl0.m125185b0(v2, new RunnableC11237b(v2, i2));
            } else {
                setStateInternal(i2);
            }
            this.f40515k = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (!v2.isShown()) {
            return false;
        }
        int iM147817c = ky00.m147817c(motionEvent);
        if (this.f40511g == 1 && iM147817c == 0) {
            return true;
        }
        if (NullChecker.m81303a(this.f40512h)) {
            this.f40512h.m192843G(motionEvent);
        }
        if (iM147817c == 0) {
            reset();
        }
        if (this.f40520p == null) {
            this.f40520p = VelocityTracker.obtain();
        }
        this.f40520p.addMovement(motionEvent);
        if (iM147817c == 2 && !this.f40513i && Math.abs(this.f40522r - motionEvent.getY()) > this.f40512h.m192878z()) {
            this.f40512h.m192857c(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f40513i;
    }

    public final void reset() {
        this.f40521q = -1;
        if (NullChecker.m81303a(this.f40520p)) {
            this.f40520p.recycle();
            this.f40520p = null;
        }
    }

    public void setHideable(boolean z) {
        this.f40509e = z;
    }

    public final void setPeekHeight(int i) {
        this.f40506b = Math.max(0, i);
        if (NullChecker.m81303a(this.f40517m) && NullChecker.m81303a(this.f40517m.get())) {
            this.f40507c = Math.max(-this.f40517m.get().getHeight(), -(this.f40517m.get().getHeight() - this.f40506b));
        }
    }

    public void setSkipCollapsed(boolean z) {
        this.f40510f = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = y760.m213309a(new C11235a());
        final int state;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.TopSheetBehavior$SavedState$a */
        public class C11235a implements z760<SavedState> {
            @Override // p149l.z760
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // p149l.z760
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
        this.f40511g = 4;
        this.f40524t = new C11236a();
    }
}
