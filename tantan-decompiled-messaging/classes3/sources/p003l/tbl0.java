package p003l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tbl0 {

    /* JADX INFO: renamed from: a */
    public int f7433a;

    /* JADX INFO: renamed from: b */
    public int f7434b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f7435c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f7437e;

    /* JADX INFO: renamed from: d */
    public final int f7436d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f7438f = true;

    public tbl0(Context context) {
        m7734d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m7731a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f7437e == null) {
            this.f7437e = motionEvent;
        }
        if (this.f7438f) {
            float[] fArrM7732b = m7732b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM7732b[0], fArrM7732b[1]);
        }
        this.f7435c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m7732b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.a(this.f7437e)) {
            float rawX = motionEvent.getRawX() - this.f7437e.getRawX();
            float rawY = motionEvent.getRawY() - this.f7437e.getRawY();
            float x = motionEvent.getX() - this.f7437e.getX();
            float y = motionEvent.getY() - this.f7437e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m7733c() {
        this.f7435c.clear();
        this.f7437e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m7734d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7433a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7434b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f7435c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m7735e() {
        this.f7435c.computeCurrentVelocity(1000, this.f7434b);
        return this.f7435c.getYVelocity() >= 800.0f;
    }
}
