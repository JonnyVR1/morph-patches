package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class sbl0 {

    /* JADX INFO: renamed from: a */
    public int f163559a;

    /* JADX INFO: renamed from: b */
    public int f163560b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f163561c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f163563e;

    /* JADX INFO: renamed from: d */
    public final int f163562d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f163564f = true;

    public sbl0(Context context) {
        m183231d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m183228a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f163563e == null) {
            this.f163563e = motionEvent;
        }
        if (this.f163564f) {
            float[] fArrM183229b = m183229b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM183229b[0], fArrM183229b[1]);
        }
        this.f163561c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m183229b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.m81303a(this.f163563e)) {
            float rawX = motionEvent.getRawX() - this.f163563e.getRawX();
            float rawY = motionEvent.getRawY() - this.f163563e.getRawY();
            float x = motionEvent.getX() - this.f163563e.getX();
            float y = motionEvent.getY() - this.f163563e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m183230c() {
        this.f163561c.clear();
        this.f163563e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m183231d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f163559a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f163560b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f163561c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m183232e() {
        this.f163561c.computeCurrentVelocity(1000, this.f163560b);
        return this.f163561c.getYVelocity() >= 800.0f;
    }
}
