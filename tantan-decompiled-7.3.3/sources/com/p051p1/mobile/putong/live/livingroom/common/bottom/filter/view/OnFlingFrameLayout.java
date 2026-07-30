package com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class OnFlingFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final int f49453c;

    /* JADX INFO: renamed from: d */
    public static final int f49454d;

    /* JADX INFO: renamed from: a */
    public GestureDetector f49455a;

    /* JADX INFO: renamed from: b */
    public InterfaceC12890b f49456b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$a */
    public class GestureDetectorOnGestureListenerC12889a implements GestureDetector.OnGestureListener {
        public GestureDetectorOnGestureListenerC12889a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (NullChecker.m82486a(OnFlingFrameLayout.this.f49456b) && Math.abs(x) > OnFlingFrameLayout.f49453c && Math.abs(f) > OnFlingFrameLayout.f49454d) {
                OnFlingFrameLayout.this.f49456b.mo73417c(x < 0.0f);
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
            if (!NullChecker.m82486a(OnFlingFrameLayout.this.f49456b)) {
                return false;
            }
            OnFlingFrameLayout.this.f49456b.mo73416a();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout$b */
    public interface InterfaceC12890b {
        /* JADX INFO: renamed from: a */
        void mo73416a();

        /* JADX INFO: renamed from: c */
        void mo73417c(boolean z);
    }

    static {
        int i = qa00.f156322i;
        f49453c = i;
        f49454d = i;
    }

    public OnFlingFrameLayout(Context context) {
        super(context);
        m73415d();
    }

    /* JADX INFO: renamed from: d */
    public final void m73415d() {
        this.f49455a = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC12889a());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49455a.onTouchEvent(motionEvent);
    }

    public void setOnFlingListener(InterfaceC12890b interfaceC12890b) {
        this.f49456b = interfaceC12890b;
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m73415d();
    }

    public OnFlingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m73415d();
    }
}
