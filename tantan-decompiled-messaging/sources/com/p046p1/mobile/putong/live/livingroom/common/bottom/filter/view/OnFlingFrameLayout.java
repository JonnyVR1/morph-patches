package com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class OnFlingFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f48605c;

    /* JADX INFO: renamed from: d */
    public static final int f48606d;

    /* JADX INFO: renamed from: a */
    public GestureDetector f48607a;

    /* JADX INFO: renamed from: b */
    public InterfaceC12727b f48608b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$a */
    public class GestureDetectorOnGestureListenerC12726a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC12726a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (NullChecker.m81303a(OnFlingFrameLayout.this.f48608b) && Math.abs(x) > OnFlingFrameLayout.f48605c && Math.abs(f) > OnFlingFrameLayout.f48606d) {
                OnFlingFrameLayout.this.f48608b.mo72234c(x < 0.0f);
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
            if (!NullChecker.m81303a(OnFlingFrameLayout.this.f48608b)) {
                return false;
            }
            OnFlingFrameLayout.this.f48608b.mo72233a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$b */
    public interface InterfaceC12727b {
        /* JADX INFO: renamed from: a */
        void mo72233a();

        /* JADX INFO: renamed from: c */
        void mo72234c(boolean z);
    }

    static {
        int i = t100.f167260i;
        f48605c = i;
        f48606d = i;
    }

    public OnFlingFrameLayout(Context context) {
        super(context);
        m72232d();
    }

    /* JADX INFO: renamed from: d */
    public final void m72232d() {
        this.f48607a = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC12726a());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f48607a.onTouchEvent(motionEvent);
    }

    public void setOnFlingListener(InterfaceC12727b interfaceC12727b) {
        this.f48608b = interfaceC12727b;
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m72232d();
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72232d();
    }
}
