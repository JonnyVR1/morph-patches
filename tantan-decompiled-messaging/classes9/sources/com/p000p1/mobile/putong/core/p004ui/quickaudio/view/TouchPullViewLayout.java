package com.p000p1.mobile.putong.core.p004ui.quickaudio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TouchPullViewLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: g */
    public static final int f5304g;

    /* JADX INFO: renamed from: h */
    public static final int f5305h;

    /* JADX INFO: renamed from: d */
    public GestureDetector f5306d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0255b f5307e;

    /* JADX INFO: renamed from: f */
    public boolean f5308f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.TouchPullViewLayout$a */
    public class GestureDetectorOnGestureListenerC0254a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC0254a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float y = motionEvent2.getY() - motionEvent.getY();
            if (!NullChecker.a(TouchPullViewLayout.this.f5307e) || Math.abs(y) <= TouchPullViewLayout.f5304g || Math.abs(f) <= TouchPullViewLayout.f5305h || y >= 0.0f) {
                return false;
            }
            TouchPullViewLayout.this.f5307e.mo7966a();
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!NullChecker.a(TouchPullViewLayout.this.f5307e)) {
                return false;
            }
            TouchPullViewLayout.this.f5307e.onScroll(motionEvent, motionEvent2, f, f2);
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
    public interface InterfaceC0255b {
        /* JADX INFO: renamed from: a */
        void mo7966a();

        /* JADX INFO: renamed from: b */
        void mo7967b(MotionEvent motionEvent);

        void onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);
    }

    static {
        int i = t100.i;
        f5304g = i;
        f5305h = i;
    }

    public TouchPullViewLayout(Context context) {
        super(context);
        this.f5308f = true;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        this.f5306d = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC0254a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f5308f) {
            return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        }
        this.f5306d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && NullChecker.a(this.f5307e)) {
            this.f5307e.mo7967b(motionEvent);
        }
        super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        return true;
    }

    public void setEnable(boolean z) {
        this.f5308f = z;
    }

    public void setOnFlingListener(InterfaceC0255b interfaceC0255b) {
        this.f5307e = interfaceC0255b;
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5308f = true;
        init();
    }

    public TouchPullViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5308f = true;
        init();
    }
}
