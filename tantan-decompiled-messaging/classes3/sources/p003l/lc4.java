package p003l;

import android.view.MotionEvent;
import l.jgj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lc4 {

    /* JADX INFO: renamed from: a */
    public float f5255a;

    /* JADX INFO: renamed from: b */
    public float f5256b;

    /* JADX INFO: renamed from: c */
    public anx f5257c;

    public lc4(anx anxVar) {
        this.f5257c = anxVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m5999a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return true;
            }
            this.f5255a = m6000b(motionEvent);
            return true;
        }
        int iM6000b = (int) ((m6000b(motionEvent) - this.f5255a) * m6001c());
        if (iM6000b == this.f5257c.m2890e()) {
            return false;
        }
        int iM2890e = iM6000b + this.f5257c.m2890e();
        if (iM2890e >= this.f5257c.m2891f()) {
            iM2890e = this.f5257c.m2891f();
        }
        this.f5257c.m2899n(iM2890e > 0 ? iM2890e : 0);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final float m6000b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX INFO: renamed from: c */
    public final float m6001c() {
        if (this.f5256b > 0.0f || this.f5257c.m2891f() == 0) {
            return this.f5256b;
        }
        double dSqrt = Math.sqrt((jgj0.b() * jgj0.b()) + (jgj0.d() * jgj0.d())) * 4.0d;
        if (dSqrt == 0.0d) {
            return this.f5256b;
        }
        float fM2891f = (float) (((double) this.f5257c.m2891f()) / dSqrt);
        this.f5256b = fM2891f;
        return fM2891f;
    }
}
