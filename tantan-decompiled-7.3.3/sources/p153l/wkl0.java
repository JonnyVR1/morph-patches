package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class wkl0 {

    /* JADX INFO: renamed from: a */
    public int f189570a;

    /* JADX INFO: renamed from: b */
    public int f189571b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f189572c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f189574e;

    /* JADX INFO: renamed from: d */
    public final int f189573d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f189575f = true;

    public wkl0(Context context) {
        m206846d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m206843a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f189574e == null) {
            this.f189574e = motionEvent;
        }
        if (this.f189575f) {
            float[] fArrM206844b = m206844b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM206844b[0], fArrM206844b[1]);
        }
        this.f189572c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m206844b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.m82486a(this.f189574e)) {
            float rawX = motionEvent.getRawX() - this.f189574e.getRawX();
            float rawY = motionEvent.getRawY() - this.f189574e.getRawY();
            float x = motionEvent.getX() - this.f189574e.getX();
            float y = motionEvent.getY() - this.f189574e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m206845c() {
        this.f189572c.clear();
        this.f189574e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m206846d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f189570a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f189571b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f189572c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m206847e() {
        this.f189572c.computeCurrentVelocity(1000, this.f189571b);
        return this.f189572c.getYVelocity() >= 800.0f;
    }
}
