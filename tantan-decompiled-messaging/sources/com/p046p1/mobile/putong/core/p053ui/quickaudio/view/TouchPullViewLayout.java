package com.p046p1.mobile.putong.core.p053ui.quickaudio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class TouchPullViewLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: g */
    public static final int f35523g;

    /* JADX INFO: renamed from: h */
    public static final int f35524h;

    /* JADX INFO: renamed from: d */
    public GestureDetector f35525d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8819b f35526e;

    /* JADX INFO: renamed from: f */
    public boolean f35527f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.TouchPullViewLayout$a */
    public class GestureDetectorOnGestureListenerC8818a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC8818a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (!NullChecker.m81303a(TouchPullViewLayout.this.f35526e) || Math.abs(y) <= TouchPullViewLayout.f35523g || Math.abs(f) <= TouchPullViewLayout.f35524h || y >= 0.0f) {
                return false;
            }
            TouchPullViewLayout.this.f35526e.mo54616a();
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!NullChecker.m81303a(TouchPullViewLayout.this.f35526e)) {
                return false;
            }
            TouchPullViewLayout.this.f35526e.onScroll(motionEvent, motionEvent2, f, f2);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.TouchPullViewLayout$b */
    public interface InterfaceC8819b {
        /* JADX INFO: renamed from: a */
        void mo54616a();

        /* JADX INFO: renamed from: b */
        void mo54617b(MotionEvent motionEvent);

        void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);
    }

    static {
        int i = t100.f167260i;
        f35523g = i;
        f35524h = i;
    }

    public TouchPullViewLayout(Context context) {
        super(context);
        this.f35527f = true;
        init();
    }

    private void init() {
        this.f35525d = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC8818a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f35527f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f35525d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && NullChecker.m81303a(this.f35526e)) {
            this.f35526e.mo54617b(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setEnable(boolean z) {
        this.f35527f = z;
    }

    public void setOnFlingListener(InterfaceC8819b interfaceC8819b) {
        this.f35526e = interfaceC8819b;
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35527f = true;
        init();
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35527f = true;
        init();
    }
}
