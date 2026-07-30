package p149l;

import android.view.MotionEvent;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes3.dex */
public class lc4 {

    /* JADX INFO: renamed from: a */
    public float f127372a;

    /* JADX INFO: renamed from: b */
    public float f127373b;

    /* JADX INFO: renamed from: c */
    public anx f127374c;

    public lc4(anx anxVar) {
        this.f127374c = anxVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m149279a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 2) {
            if (action != 5) {
                return true;
            }
            this.f127372a = m149280b(motionEvent);
            return true;
        }
        int iM149280b = (int) ((m149280b(motionEvent) - this.f127372a) * m149281c());
        if (iM149280b == this.f127374c.m97821e()) {
            return false;
        }
        int iM97821e = iM149280b + this.f127374c.m97821e();
        if (iM97821e >= this.f127374c.m97822f()) {
            iM97821e = this.f127374c.m97822f();
        }
        this.f127374c.m97830n(iM97821e > 0 ? iM97821e : 0);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final float m149280b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX INFO: renamed from: c */
    public final float m149281c() {
        if (this.f127373b > 0.0f || this.f127374c.m97822f() == 0) {
            return this.f127373b;
        }
        double dSqrt = Math.sqrt((jgj0.m141298b() * jgj0.m141298b()) + (jgj0.m141300d() * jgj0.m141300d())) * 4.0d;
        if (dSqrt == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return this.f127373b;
        }
        float fM97822f = (float) (((double) this.f127374c.m97822f()) / dSqrt);
        this.f127373b = fM97822f;
        return fM97822f;
    }
}
