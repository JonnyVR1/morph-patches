package p003l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import l.ky00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rsd0 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public final float f7058a;

    /* JADX INFO: renamed from: b */
    public final float f7059b;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f7060c;

    /* JADX INFO: renamed from: d */
    public final hf50 f7061d;

    /* JADX INFO: renamed from: e */
    public VelocityTracker f7062e;

    /* JADX INFO: renamed from: f */
    public boolean f7063f;

    /* JADX INFO: renamed from: g */
    public float f7064g;

    /* JADX INFO: renamed from: h */
    public float f7065h;

    /* JADX INFO: renamed from: i */
    public int f7066i = -1;

    /* JADX INFO: renamed from: j */
    public int f7067j = 0;

    public rsd0(Context context, hf50 hf50Var) {
        this.f7060c = new ScaleGestureDetector(context, this);
        this.f7061d = hf50Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7059b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7058a = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public final float m7366a(MotionEvent motionEvent) {
        try {
            return ky00.e(motionEvent, this.f7067j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m7367b(MotionEvent motionEvent) {
        try {
            return ky00.f(motionEvent, this.f7067j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m7368c() {
        return this.f7063f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m7369d() {
        return this.f7060c.isInProgress();
    }

    /* JADX INFO: renamed from: e */
    public final void m7370e(int i, MotionEvent motionEvent) {
        if (i != 0) {
            if (i == 1 || i == 3) {
                this.f7066i = -1;
            } else if (i == 6) {
                int iB = ky00.b(motionEvent);
                if (ky00.d(motionEvent, iB) == this.f7066i) {
                    int i2 = iB != 0 ? 0 : 1;
                    this.f7066i = ky00.d(motionEvent, i2);
                    this.f7064g = ky00.e(motionEvent, i2);
                    this.f7065h = ky00.f(motionEvent, i2);
                }
            }
        } else {
            this.f7066i = motionEvent.getPointerId(0);
        }
        int i3 = this.f7066i;
        this.f7067j = ky00.a(motionEvent, i3 != -1 ? i3 : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m7371f(int i, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (i == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f7062e = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f7064g = m7366a(motionEvent);
            this.f7065h = m7367b(motionEvent);
            this.f7063f = false;
            return;
        }
        if (i == 1) {
            if (this.f7063f && this.f7062e != null) {
                this.f7064g = m7366a(motionEvent);
                this.f7065h = m7367b(motionEvent);
                this.f7062e.addMovement(motionEvent);
                this.f7062e.computeCurrentVelocity(1000);
                float xVelocity = this.f7062e.getXVelocity();
                float yVelocity = this.f7062e.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f7059b) {
                    this.f7061d.mo4956b(this.f7064g, this.f7065h, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f7062e;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f7062e = null;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (velocityTracker = this.f7062e) != null) {
                velocityTracker.recycle();
                this.f7062e = null;
                return;
            }
            return;
        }
        float fM7366a = m7366a(motionEvent);
        float fM7367b = m7367b(motionEvent);
        float f = fM7366a - this.f7064g;
        float f2 = fM7367b - this.f7065h;
        if (!this.f7063f) {
            this.f7063f = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f7058a);
        }
        if (this.f7063f) {
            this.f7061d.mo4957c(f, f2);
            this.f7064g = fM7366a;
            this.f7065h = fM7367b;
            VelocityTracker velocityTracker3 = this.f7062e;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m7372g(MotionEvent motionEvent) {
        this.f7060c.onTouchEvent(motionEvent);
        int iC = ky00.c(motionEvent);
        m7370e(iC, motionEvent);
        m7371f(iC, motionEvent);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f7061d.mo4959f(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f7061d.mo4958d();
    }
}
