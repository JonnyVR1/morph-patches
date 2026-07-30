package p153l;

import android.view.MotionEvent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes3.dex */
public class kd4 {

    /* JADX INFO: renamed from: a */
    public float f125149a;

    /* JADX INFO: renamed from: b */
    public float f125150b;

    /* JADX INFO: renamed from: c */
    public xvx f125151c;

    public kd4(xvx xvxVar) {
        this.f125151c = xvxVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m149173a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return true;
            }
            this.f125149a = m149174b(motionEvent);
            return true;
        }
        int iM149174b = (int) ((m149174b(motionEvent) - this.f125149a) * m149175c());
        if (iM149174b == this.f125151c.m213266e()) {
            return false;
        }
        int iM213266e = iM149174b + this.f125151c.m213266e();
        if (iM213266e >= this.f125151c.m213267f()) {
            iM213266e = this.f125151c.m213267f();
        }
        this.f125151c.m213275n(iM213266e > 0 ? iM213266e : 0);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final float m149174b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX INFO: renamed from: c */
    public final float m149175c() {
        if (this.f125150b > 0.0f || this.f125151c.m213267f() == 0) {
            return this.f125150b;
        }
        double dSqrt = Math.sqrt((kpj0.m150739b() * kpj0.m150739b()) + (kpj0.m150741d() * kpj0.m150741d())) * 4.0d;
        if (dSqrt == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this.f125150b;
        }
        float fM213267f = (float) (((double) this.f125151c.m213267f()) / dSqrt);
        this.f125150b = fM213267f;
        return fM213267f;
    }
}
