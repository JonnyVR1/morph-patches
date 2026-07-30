package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class tbl0 {

    /* JADX INFO: renamed from: a */
    public int f169274a;

    /* JADX INFO: renamed from: b */
    public int f169275b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f169276c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f169278e;

    /* JADX INFO: renamed from: d */
    public final int f169277d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f169279f = true;

    public tbl0(Context context) {
        m187881d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m187878a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f169278e == null) {
            this.f169278e = motionEvent;
        }
        if (this.f169279f) {
            float[] fArrM187879b = m187879b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM187879b[0], fArrM187879b[1]);
        }
        this.f169276c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m187879b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.m81303a(this.f169278e)) {
            float rawX = motionEvent.getRawX() - this.f169278e.getRawX();
            float rawY = motionEvent.getRawY() - this.f169278e.getRawY();
            float x = motionEvent.getX() - this.f169278e.getX();
            float y = motionEvent.getY() - this.f169278e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m187880c() {
        this.f169276c.clear();
        this.f169278e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m187881d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f169274a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f169275b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f169276c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m187882e() {
        this.f169276c.computeCurrentVelocity(1000, this.f169275b);
        return this.f169276c.getYVelocity() >= 800.0f;
    }
}
