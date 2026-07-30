package com.p000p1.mobile.putong.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@SuppressLint({"AppCompatCustomView"})
public class CoreClickSpanTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public static float f2485a;

    /* JADX INFO: renamed from: b */
    public static float f2486b;

    /* JADX INFO: renamed from: c */
    public static float f2487c;

    /* JADX INFO: renamed from: d */
    public static float f2488d;

    /* JADX INFO: renamed from: e */
    public static long f2489e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CoreClickSpanTextView$a */
    public class ViewOnTouchListenerC3259a implements View.OnTouchListener {
        public ViewOnTouchListenerC3259a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                CoreClickSpanTextView.this.getParent().requestDisallowInterceptTouchEvent(true);
                CoreClickSpanTextView.f2485a = motionEvent.getX();
                CoreClickSpanTextView.f2486b = motionEvent.getY();
                CoreClickSpanTextView.f2487c = 0.0f;
                CoreClickSpanTextView.f2488d = 0.0f;
                CoreClickSpanTextView.f2489e = System.currentTimeMillis();
                return false;
            }
            if (action == 1) {
                if (System.currentTimeMillis() - CoreClickSpanTextView.f2489e > 200) {
                    return CoreClickSpanTextView.f2487c > 20.0f || CoreClickSpanTextView.f2488d > 10.0f;
                }
                return false;
            }
            if (action != 2) {
                return false;
            }
            CoreClickSpanTextView.f2487c += Math.abs(motionEvent.getX() - CoreClickSpanTextView.f2485a);
            CoreClickSpanTextView.f2488d += Math.abs(motionEvent.getY() - CoreClickSpanTextView.f2486b);
            CoreClickSpanTextView.f2485a = motionEvent.getX();
            CoreClickSpanTextView.f2486b = motionEvent.getY();
            return false;
        }
    }

    public CoreClickSpanTextView(Context context) {
        super(context);
        m4939k();
    }

    /* JADX INFO: renamed from: k */
    public final void m4939k() {
        setOnTouchListener(new ViewOnTouchListenerC3259a());
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4939k();
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4939k();
    }
}
