package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tantanapp.common.utils.NullChecker;
import p147v.VScroll;
import p149l.a5m;
import p149l.e9c0;

/* JADX INFO: loaded from: classes10.dex */
public class MaximumScroll extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f38584e;

    /* JADX INFO: renamed from: f */
    public int f38585f;

    /* JADX INFO: renamed from: g */
    public GestureDetector f38586g;

    /* JADX INFO: renamed from: h */
    public int f38587h;

    /* JADX INFO: renamed from: i */
    public InterfaceC9163b f38588i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.MaximumScroll$a */
    public class GestureDetectorOnGestureListenerC9162a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC9162a() {
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
    public interface InterfaceC9163b {
        /* JADX INFO: renamed from: a */
        void mo59547a(int i);
    }

    public MaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38584e = -1;
        this.f38585f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f89991R0);
        this.f38585f = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89997T0, -1);
        this.f38584e = typedArrayObtainStyledAttributes.getDimensionPixelSize(e9c0.f89994S0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e */
    public final void m59546e() {
        if (this.f38586g == null) {
            this.f38586g = new GestureDetector(new GestureDetectorOnGestureListenerC9162a());
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        if (this.f38587h != i5) {
            this.f38587h = i5;
            if (NullChecker.m81303a(this.f38588i)) {
                this.f38588i.mo59547a(this.f38587h);
            }
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f38585f;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f38584e;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m59546e();
        this.f38586g.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setOnHeightChangeListener(InterfaceC9163b interfaceC9163b) {
        this.f38588i = interfaceC9163b;
    }

    public MaximumScroll(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaximumScroll(Context context) {
        this(context, null);
    }
}
