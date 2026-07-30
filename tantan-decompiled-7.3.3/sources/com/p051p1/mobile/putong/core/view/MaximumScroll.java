package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tantanapp.common.utils.NullChecker;
import p151v.VScroll;
import p153l.khc0;
import p153l.q7m;

/* JADX INFO: loaded from: classes12.dex */
public class MaximumScroll extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f39432e;

    /* JADX INFO: renamed from: f */
    public int f39433f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f39434g;

    /* JADX INFO: renamed from: h */
    public int f39435h;

    /* JADX INFO: renamed from: i */
    public InterfaceC9326b f39436i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.MaximumScroll$a */
    public class GestureDetectorOnGestureListenerC9325a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC9325a() {
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
            while (!(parent instanceof q7m)) {
                parent = parent.getParent();
            }
            if (parent == null || !(parent instanceof q7m)) {
                return false;
            }
            ((q7m) parent).getCardView().performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.MaximumScroll$b */
    public interface InterfaceC9326b {
        /* JADX INFO: renamed from: a */
        void mo60731a(int i);
    }

    public MaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39432e = -1;
        this.f39433f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126761R0);
        this.f39433f = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126767T0, -1);
        this.f39432e = typedArrayObtainStyledAttributes.getDimensionPixelSize(khc0.f126764S0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public final void m60730e() {
        if (this.f39434g == null) {
            this.f39434g = new GestureDetector(new GestureDetectorOnGestureListenerC9325a());
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f39435h != i5) {
            this.f39435h = i5;
            if (NullChecker.m82486a(this.f39436i)) {
                this.f39436i.mo60731a(this.f39435h);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f39433f;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f39432e;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m60730e();
        this.f39434g.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setOnHeightChangeListener(InterfaceC9326b interfaceC9326b) {
        this.f39436i = interfaceC9326b;
    }

    public MaximumScroll(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaximumScroll(Context context) {
        this(context, null);
    }
}
