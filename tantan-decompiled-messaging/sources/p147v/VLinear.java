package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import p149l.j760;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public static C22543a f209129b = new C22543a();

    /* JADX INFO: renamed from: a */
    public boolean f209130a;

    /* JADX INFO: renamed from: v.VLinear$a */
    public static class C22543a {

        /* JADX INFO: renamed from: a */
        public boolean f209131a = false;

        /* JADX INFO: renamed from: b */
        public float f209132b = -3231232.0f;

        /* JADX INFO: renamed from: c */
        public float f209133c = -3231232.0f;

        /* JADX INFO: renamed from: d */
        public float f209134d = -3231232.0f;

        /* JADX INFO: renamed from: e */
        public boolean f209135e = false;

        /* JADX INFO: renamed from: a */
        public void m223062a(MotionEvent motionEvent) {
            if (this.f209135e && motionEvent.getAction() == 0) {
                if (motionEvent.getDeviceId() == 0 || motionEvent.getToolType(0) == 0) {
                    this.f209131a = true;
                }
                float f = this.f209132b;
                if (f == -3231232.0f && this.f209133c == -3231232.0f && this.f209134d == -3231232.0f) {
                    this.f209132b = motionEvent.getPressure();
                    this.f209133c = motionEvent.getXPrecision();
                    this.f209134d = motionEvent.getYPrecision();
                } else {
                    if ((f == motionEvent.getPressure() && this.f209134d == motionEvent.getYPrecision() && this.f209133c == motionEvent.getXPrecision()) || this.f209132b == -2.0f) {
                        return;
                    }
                    this.f209132b = -2.0f;
                    this.f209133c = -2.0f;
                    this.f209134d = -2.0f;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public j760<Boolean, Boolean> m223063b() {
            this.f209135e = false;
            boolean z = this.f209131a;
            boolean z2 = this.f209132b != -2.0f;
            this.f209131a = false;
            this.f209132b = -3231232.0f;
            this.f209133c = -3231232.0f;
            this.f209134d = -3231232.0f;
            return vwb.m200311Y(Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        /* JADX INFO: renamed from: c */
        public void m223064c() {
            this.f209135e = true;
        }
    }

    public VLinear(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f209129b.m223062a(motionEvent);
        return this.f209130a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f209130a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public VLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
