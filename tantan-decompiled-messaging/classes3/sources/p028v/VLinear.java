package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import l.j760;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public static C1336a f12754b = new C1336a();

    /* JADX INFO: renamed from: a */
    public boolean f12755a;

    /* JADX INFO: renamed from: v.VLinear$a */
    public static class C1336a {

        /* JADX INFO: renamed from: a */
        public boolean f12756a = false;

        /* JADX INFO: renamed from: b */
        public float f12757b = -3231232.0f;

        /* JADX INFO: renamed from: c */
        public float f12758c = -3231232.0f;

        /* JADX INFO: renamed from: d */
        public float f12759d = -3231232.0f;

        /* JADX INFO: renamed from: e */
        public boolean f12760e = false;

        /* JADX INFO: renamed from: a */
        public void m11542a(MotionEvent motionEvent) {
            if (this.f12760e && motionEvent.getAction() == 0) {
                if (motionEvent.getDeviceId() == 0 || motionEvent.getToolType(0) == 0) {
                    this.f12756a = true;
                }
                float f = this.f12757b;
                if (f == -3231232.0f && this.f12758c == -3231232.0f && this.f12759d == -3231232.0f) {
                    this.f12757b = motionEvent.getPressure();
                    this.f12758c = motionEvent.getXPrecision();
                    this.f12759d = motionEvent.getYPrecision();
                } else {
                    if ((f == motionEvent.getPressure() && this.f12759d == motionEvent.getYPrecision() && this.f12758c == motionEvent.getXPrecision()) || this.f12757b == -2.0f) {
                        return;
                    }
                    this.f12757b = -2.0f;
                    this.f12758c = -2.0f;
                    this.f12759d = -2.0f;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public j760<Boolean, Boolean> m11543b() {
            this.f12760e = false;
            boolean z = this.f12756a;
            boolean z2 = this.f12757b != -2.0f;
            this.f12756a = false;
            this.f12757b = -3231232.0f;
            this.f12758c = -3231232.0f;
            this.f12759d = -3231232.0f;
            return vwb.Y(Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        /* JADX INFO: renamed from: c */
        public void m11544c() {
            this.f12760e = true;
        }
    }

    public VLinear(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f12754b.m11542a(motionEvent);
        return this.f12755a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12755a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public VLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
