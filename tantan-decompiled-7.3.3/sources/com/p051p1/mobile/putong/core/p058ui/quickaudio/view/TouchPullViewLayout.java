package com.p051p1.mobile.putong.core.p058ui.quickaudio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class TouchPullViewLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: g */
    public static final int f36371g;

    /* JADX INFO: renamed from: h */
    public static final int f36372h;

    /* JADX INFO: renamed from: d */
    public GestureDetector f36373d;

    /* JADX INFO: renamed from: e */
    public InterfaceC8982b f36374e;

    /* JADX INFO: renamed from: f */
    public boolean f36375f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.TouchPullViewLayout$a */
    public class GestureDetectorOnGestureListenerC8981a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC8981a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (!NullChecker.m82486a(TouchPullViewLayout.this.f36374e) || Math.abs(y) <= TouchPullViewLayout.f36371g || Math.abs(f) <= TouchPullViewLayout.f36372h || y >= 0.0f) {
                return false;
            }
            TouchPullViewLayout.this.f36374e.mo55799a();
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!NullChecker.m82486a(TouchPullViewLayout.this.f36374e)) {
                return false;
            }
            TouchPullViewLayout.this.f36374e.onScroll(motionEvent, motionEvent2, f, f2);
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
    public interface InterfaceC8982b {
        /* JADX INFO: renamed from: a */
        void mo55799a();

        /* JADX INFO: renamed from: b */
        void mo55800b(MotionEvent motionEvent);

        void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);
    }

    static {
        int i = qa00.f156322i;
        f36371g = i;
        f36372h = i;
    }

    public TouchPullViewLayout(Context context) {
        super(context);
        this.f36375f = true;
        init();
    }

    private void init() {
        this.f36373d = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC8981a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f36375f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f36373d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && NullChecker.m82486a(this.f36374e)) {
            this.f36374e.mo55800b(motionEvent);
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setEnable(boolean z) {
        this.f36375f = z;
    }

    public void setOnFlingListener(InterfaceC8982b interfaceC8982b) {
        this.f36374e = interfaceC8982b;
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36375f = true;
        init();
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36375f = true;
        init();
    }
}
