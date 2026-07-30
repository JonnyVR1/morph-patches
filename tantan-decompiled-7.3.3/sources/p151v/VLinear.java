package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import p153l.jyb;
import p153l.pf60;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public static C22658a f210051b = new C22658a();

    /* JADX INFO: renamed from: a */
    public boolean f210052a;

    /* JADX INFO: renamed from: v.VLinear$a */
    public static class C22658a {

        /* JADX INFO: renamed from: a */
        public boolean f210053a = false;

        /* JADX INFO: renamed from: b */
        public float f210054b = -3231232.0f;

        /* JADX INFO: renamed from: c */
        public float f210055c = -3231232.0f;

        /* JADX INFO: renamed from: d */
        public float f210056d = -3231232.0f;

        /* JADX INFO: renamed from: e */
        public boolean f210057e = false;

        /* JADX INFO: renamed from: a */
        public void m224308a(MotionEvent motionEvent) {
            if (this.f210057e && motionEvent.getAction() == 0) {
                if (motionEvent.getDeviceId() == 0 || motionEvent.getToolType(0) == 0) {
                    this.f210053a = true;
                }
                float f = this.f210054b;
                if (f == -3231232.0f && this.f210055c == -3231232.0f && this.f210056d == -3231232.0f) {
                    this.f210054b = motionEvent.getPressure();
                    this.f210055c = motionEvent.getXPrecision();
                    this.f210056d = motionEvent.getYPrecision();
                } else {
                    if ((f == motionEvent.getPressure() && this.f210056d == motionEvent.getYPrecision() && this.f210055c == motionEvent.getXPrecision()) || this.f210054b == -2.0f) {
                        return;
                    }
                    this.f210054b = -2.0f;
                    this.f210055c = -2.0f;
                    this.f210056d = -2.0f;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public pf60<Boolean, Boolean> m224309b() {
            this.f210057e = false;
            boolean z = this.f210053a;
            boolean z2 = this.f210054b != -2.0f;
            this.f210053a = false;
            this.f210054b = -3231232.0f;
            this.f210055c = -3231232.0f;
            this.f210056d = -3231232.0f;
            return jyb.m147494Y(Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        /* JADX INFO: renamed from: c */
        public void m224310c() {
            this.f210057e = true;
        }
    }

    public VLinear(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f210051b.m224308a(motionEvent);
        return this.f210052a;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f210052a = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    public VLinear(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VLinear(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
