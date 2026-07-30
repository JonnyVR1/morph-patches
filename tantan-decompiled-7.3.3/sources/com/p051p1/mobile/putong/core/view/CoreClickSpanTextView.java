package com.p051p1.mobile.putong.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"AppCompatCustomView"})
public class CoreClickSpanTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public static float f39391a;

    /* JADX INFO: renamed from: b */
    public static float f39392b;

    /* JADX INFO: renamed from: c */
    public static float f39393c;

    /* JADX INFO: renamed from: d */
    public static float f39394d;

    /* JADX INFO: renamed from: e */
    public static long f39395e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CoreClickSpanTextView$a */
    public class ViewOnTouchListenerC9324a implements View.OnTouchListener {
        public ViewOnTouchListenerC9324a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                CoreClickSpanTextView.this.getParent().requestDisallowInterceptTouchEvent(true);
                CoreClickSpanTextView.f39391a = motionEvent.getX();
                CoreClickSpanTextView.f39392b = motionEvent.getY();
                CoreClickSpanTextView.f39393c = 0.0f;
                CoreClickSpanTextView.f39394d = 0.0f;
                CoreClickSpanTextView.f39395e = System.currentTimeMillis();
                return false;
            }
            if (action == 1) {
                if (System.currentTimeMillis() - CoreClickSpanTextView.f39395e > 200) {
                    return CoreClickSpanTextView.f39393c > 20.0f || CoreClickSpanTextView.f39394d > 10.0f;
                }
                return false;
            }
            if (action != 2) {
                return false;
            }
            CoreClickSpanTextView.f39393c += Math.abs(motionEvent.getX() - CoreClickSpanTextView.f39391a);
            CoreClickSpanTextView.f39394d += Math.abs(motionEvent.getY() - CoreClickSpanTextView.f39392b);
            CoreClickSpanTextView.f39391a = motionEvent.getX();
            CoreClickSpanTextView.f39392b = motionEvent.getY();
            return false;
        }
    }

    public CoreClickSpanTextView(Context context) {
        super(context);
        m60714k();
    }

    /* JADX INFO: renamed from: k */
    public final void m60714k() {
        setOnTouchListener(new ViewOnTouchListenerC9324a());
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m60714k();
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m60714k();
    }
}
