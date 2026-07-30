package com.p046p1.mobile.putong.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"AppCompatCustomView"})
public class CoreClickSpanTextView extends TextView {

    /* JADX INFO: renamed from: a */
    public static float f38543a;

    /* JADX INFO: renamed from: b */
    public static float f38544b;

    /* JADX INFO: renamed from: c */
    public static float f38545c;

    /* JADX INFO: renamed from: d */
    public static float f38546d;

    /* JADX INFO: renamed from: e */
    public static long f38547e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.view.CoreClickSpanTextView$a */
    public class ViewOnTouchListenerC9161a implements View.OnTouchListener {
        public ViewOnTouchListenerC9161a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                CoreClickSpanTextView.this.getParent().requestDisallowInterceptTouchEvent(true);
                CoreClickSpanTextView.f38543a = motionEvent.getX();
                CoreClickSpanTextView.f38544b = motionEvent.getY();
                CoreClickSpanTextView.f38545c = 0.0f;
                CoreClickSpanTextView.f38546d = 0.0f;
                CoreClickSpanTextView.f38547e = System.currentTimeMillis();
                return false;
            }
            if (action == 1) {
                if (System.currentTimeMillis() - CoreClickSpanTextView.f38547e > 200) {
                    return CoreClickSpanTextView.f38545c > 20.0f || CoreClickSpanTextView.f38546d > 10.0f;
                }
                return false;
            }
            if (action != 2) {
                return false;
            }
            CoreClickSpanTextView.f38545c += Math.abs(motionEvent.getX() - CoreClickSpanTextView.f38543a);
            CoreClickSpanTextView.f38546d += Math.abs(motionEvent.getY() - CoreClickSpanTextView.f38544b);
            CoreClickSpanTextView.f38543a = motionEvent.getX();
            CoreClickSpanTextView.f38544b = motionEvent.getY();
            return false;
        }
    }

    public CoreClickSpanTextView(Context context) {
        super(context);
        m59530k();
    }

    /* JADX INFO: renamed from: k */
    public final void m59530k() {
        setOnTouchListener(new ViewOnTouchListenerC9161a());
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m59530k();
    }

    public CoreClickSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m59530k();
    }
}
