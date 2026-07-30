package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class xkl0 {

    /* JADX INFO: renamed from: a */
    public int f194793a;

    /* JADX INFO: renamed from: b */
    public int f194794b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f194795c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f194797e;

    /* JADX INFO: renamed from: d */
    public final int f194796d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f194798f = true;

    public xkl0(Context context) {
        m211406d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m211403a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f194797e == null) {
            this.f194797e = motionEvent;
        }
        if (this.f194798f) {
            float[] fArrM211404b = m211404b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM211404b[0], fArrM211404b[1]);
        }
        this.f194795c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m211404b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.m82486a(this.f194797e)) {
            float rawX = motionEvent.getRawX() - this.f194797e.getRawX();
            float rawY = motionEvent.getRawY() - this.f194797e.getRawY();
            float x = motionEvent.getX() - this.f194797e.getX();
            float y = motionEvent.getY() - this.f194797e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m211405c() {
        this.f194795c.clear();
        this.f194797e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m211406d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f194793a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f194794b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f194795c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m211407e() {
        this.f194795c.computeCurrentVelocity(1000, this.f194794b);
        return this.f194795c.getYVelocity() >= 800.0f;
    }
}
