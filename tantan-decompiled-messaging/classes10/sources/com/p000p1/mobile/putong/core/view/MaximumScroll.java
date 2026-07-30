package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tantanapp.common.utils.NullChecker;
import l.a5m;
import l.e9c0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MaximumScroll extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f2526e;

    /* JADX INFO: renamed from: f */
    public int f2527f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f2528g;

    /* JADX INFO: renamed from: h */
    public int f2529h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3261b f2530i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.MaximumScroll$a */
    public class GestureDetectorOnGestureListenerC3260a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC3260a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ViewParent parent = MaximumScroll.this.getParent();
            while (!(parent instanceof a5m)) {
                parent = parent.getParent();
            }
            if (parent == null || !(parent instanceof a5m)) {
                return false;
            }
            ((a5m) parent).getCardView().performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.MaximumScroll$b */
    public interface InterfaceC3261b {
        /* JADX INFO: renamed from: a */
        void m4956a(int i);
    }

    public MaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2526e = -1;
        this.f2527f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.R0);
        this.f2527f = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.T0, -1);
        this.f2526e = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.S0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public final void m4955e() {
        if (this.f2528g == null) {
            this.f2528g = new GestureDetector(new GestureDetectorOnGestureListenerC3260a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f2529h != i5) {
            this.f2529h = i5;
            if (NullChecker.a(this.f2530i)) {
                this.f2530i.m4956a(this.f2529h);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int i3 = this.f2527f;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f2526e;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super/*android.view.View*/.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m4955e();
        this.f2528g.onTouchEvent(motionEvent);
        return super/*android.view.View*/.onTouchEvent(motionEvent);
    }

    public void setOnHeightChangeListener(InterfaceC3261b interfaceC3261b) {
        this.f2530i = interfaceC3261b;
    }

    public MaximumScroll(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaximumScroll(Context context) {
        this(context, null);
    }
}
