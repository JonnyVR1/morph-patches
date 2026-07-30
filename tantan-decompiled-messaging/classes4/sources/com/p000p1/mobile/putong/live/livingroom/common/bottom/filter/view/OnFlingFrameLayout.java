package com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnFlingFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f4647c;

    /* JADX INFO: renamed from: d */
    public static final int f4648d;

    /* JADX INFO: renamed from: a */
    public GestureDetector f4649a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0316b f4650b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$a */
    public class GestureDetectorOnGestureListenerC0315a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC0315a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (NullChecker.a(OnFlingFrameLayout.this.f4650b) && Math.abs(x) > OnFlingFrameLayout.f4647c && Math.abs(f) > OnFlingFrameLayout.f4648d) {
                OnFlingFrameLayout.this.f4650b.mo5707c(x < 0.0f);
            }
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
            if (!NullChecker.a(OnFlingFrameLayout.this.f4650b)) {
                return false;
            }
            OnFlingFrameLayout.this.f4650b.mo5706a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$b */
    public interface InterfaceC0316b {
        /* JADX INFO: renamed from: a */
        void mo5706a();

        /* JADX INFO: renamed from: c */
        void mo5707c(boolean z);
    }

    static {
        int i = t100.i;
        f4647c = i;
        f4648d = i;
    }

    public OnFlingFrameLayout(Context context) {
        super(context);
        m5705d();
    }

    /* JADX INFO: renamed from: d */
    public final void m5705d() {
        this.f4649a = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC0315a());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4649a.onTouchEvent(motionEvent);
    }

    public void setOnFlingListener(InterfaceC0316b interfaceC0316b) {
        this.f4650b = interfaceC0316b;
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5705d();
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5705d();
    }
}
