package p153l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class t0e0 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public final float f171490a;

    /* JADX INFO: renamed from: b */
    public final float f171491b;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f171492c;

    /* JADX INFO: renamed from: d */
    public final nn50 f171493d;

    /* JADX INFO: renamed from: e */
    public VelocityTracker f171494e;

    /* JADX INFO: renamed from: f */
    public boolean f171495f;

    /* JADX INFO: renamed from: g */
    public float f171496g;

    /* JADX INFO: renamed from: h */
    public float f171497h;

    /* JADX INFO: renamed from: i */
    public int f171498i = -1;

    /* JADX INFO: renamed from: j */
    public int f171499j = 0;

    public t0e0(Context context, nn50 nn50Var) {
        this.f171492c = new ScaleGestureDetector(context, this);
        this.f171493d = nn50Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f171491b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f171490a = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public final float m188718a(MotionEvent motionEvent) {
        try {
            return u610.m194645e(motionEvent, this.f171499j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m188719b(MotionEvent motionEvent) {
        try {
            return u610.m194646f(motionEvent, this.f171499j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m188720c() {
        return this.f171495f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m188721d() {
        return this.f171492c.isInProgress();
    }

    /* JADX INFO: renamed from: e */
    public final void m188722e(int i, MotionEvent motionEvent) {
        if (i != 0) {
            if (i == 1 || i == 3) {
                this.f171498i = -1;
            } else if (i == 6) {
                int iM194642b = u610.m194642b(motionEvent);
                if (u610.m194644d(motionEvent, iM194642b) == this.f171498i) {
                    int i2 = iM194642b != 0 ? 0 : 1;
                    this.f171498i = u610.m194644d(motionEvent, i2);
                    this.f171496g = u610.m194645e(motionEvent, i2);
                    this.f171497h = u610.m194646f(motionEvent, i2);
                }
            }
        } else {
            this.f171498i = motionEvent.getPointerId(0);
        }
        int i3 = this.f171498i;
        this.f171499j = u610.m194641a(motionEvent, i3 != -1 ? i3 : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m188723f(int i, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (i == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f171494e = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f171496g = m188718a(motionEvent);
            this.f171497h = m188719b(motionEvent);
            this.f171495f = false;
            return;
        }
        if (i == 1) {
            if (this.f171495f && this.f171494e != null) {
                this.f171496g = m188718a(motionEvent);
                this.f171497h = m188719b(motionEvent);
                this.f171494e.addMovement(motionEvent);
                this.f171494e.computeCurrentVelocity(1000);
                float xVelocity = this.f171494e.getXVelocity();
                float yVelocity = this.f171494e.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f171491b) {
                    this.f171493d.mo163856b(this.f171496g, this.f171497h, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f171494e;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f171494e = null;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (velocityTracker = this.f171494e) != null) {
                velocityTracker.recycle();
                this.f171494e = null;
                return;
            }
            return;
        }
        float fM188718a = m188718a(motionEvent);
        float fM188719b = m188719b(motionEvent);
        float f = fM188718a - this.f171496g;
        float f2 = fM188719b - this.f171497h;
        if (!this.f171495f) {
            this.f171495f = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f171490a);
        }
        if (this.f171495f) {
            this.f171493d.mo163857c(f, f2);
            this.f171496g = fM188718a;
            this.f171497h = fM188719b;
            VelocityTracker velocityTracker3 = this.f171494e;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m188724g(MotionEvent motionEvent) {
        this.f171492c.onTouchEvent(motionEvent);
        int iM194643c = u610.m194643c(motionEvent);
        m188722e(iM194643c, motionEvent);
        m188723f(iM194643c, motionEvent);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f171493d.mo163859f(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f171493d.mo163858d();
    }
}
