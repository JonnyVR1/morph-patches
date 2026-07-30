package p149l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class rsd0 implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: a */
    public final float f160833a;

    /* JADX INFO: renamed from: b */
    public final float f160834b;

    /* JADX INFO: renamed from: c */
    public final ScaleGestureDetector f160835c;

    /* JADX INFO: renamed from: d */
    public final hf50 f160836d;

    /* JADX INFO: renamed from: e */
    public VelocityTracker f160837e;

    /* JADX INFO: renamed from: f */
    public boolean f160838f;

    /* JADX INFO: renamed from: g */
    public float f160839g;

    /* JADX INFO: renamed from: h */
    public float f160840h;

    /* JADX INFO: renamed from: i */
    public int f160841i = -1;

    /* JADX INFO: renamed from: j */
    public int f160842j = 0;

    public rsd0(Context context, hf50 hf50Var) {
        this.f160835c = new ScaleGestureDetector(context, this);
        this.f160836d = hf50Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f160834b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f160833a = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX INFO: renamed from: a */
    public final float m180651a(MotionEvent motionEvent) {
        try {
            return ky00.m147819e(motionEvent, this.f160842j);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m180652b(MotionEvent motionEvent) {
        try {
            return ky00.m147820f(motionEvent, this.f160842j);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m180653c() {
        return this.f160838f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m180654d() {
        return this.f160835c.isInProgress();
    }

    /* JADX INFO: renamed from: e */
    public final void m180655e(int i, MotionEvent motionEvent) {
        if (i != 0) {
            if (i == 1 || i == 3) {
                this.f160841i = -1;
            } else if (i == 6) {
                int iM147816b = ky00.m147816b(motionEvent);
                if (ky00.m147818d(motionEvent, iM147816b) == this.f160841i) {
                    int i2 = iM147816b != 0 ? 0 : 1;
                    this.f160841i = ky00.m147818d(motionEvent, i2);
                    this.f160839g = ky00.m147819e(motionEvent, i2);
                    this.f160840h = ky00.m147820f(motionEvent, i2);
                }
            }
        } else {
            this.f160841i = motionEvent.getPointerId(0);
        }
        int i3 = this.f160841i;
        this.f160842j = ky00.m147815a(motionEvent, i3 != -1 ? i3 : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m180656f(int i, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (i == 0) {
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f160837e = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f160839g = m180651a(motionEvent);
            this.f160840h = m180652b(motionEvent);
            this.f160838f = false;
            return;
        }
        if (i == 1) {
            if (this.f160838f && this.f160837e != null) {
                this.f160839g = m180651a(motionEvent);
                this.f160840h = m180652b(motionEvent);
                this.f160837e.addMovement(motionEvent);
                this.f160837e.computeCurrentVelocity(1000);
                float xVelocity = this.f160837e.getXVelocity();
                float yVelocity = this.f160837e.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f160834b) {
                    this.f160836d.mo130749b(this.f160839g, this.f160840h, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker2 = this.f160837e;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f160837e = null;
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (velocityTracker = this.f160837e) != null) {
                velocityTracker.recycle();
                this.f160837e = null;
                return;
            }
            return;
        }
        float fM180651a = m180651a(motionEvent);
        float fM180652b = m180652b(motionEvent);
        float f = fM180651a - this.f160839g;
        float f2 = fM180652b - this.f160840h;
        if (!this.f160838f) {
            this.f160838f = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f160833a);
        }
        if (this.f160838f) {
            this.f160836d.mo130750c(f, f2);
            this.f160839g = fM180651a;
            this.f160840h = fM180652b;
            VelocityTracker velocityTracker3 = this.f160837e;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m180657g(MotionEvent motionEvent) {
        this.f160835c.onTouchEvent(motionEvent);
        int iM147817c = ky00.m147817c(motionEvent);
        m180655e(iM147817c, motionEvent);
        m180656f(iM147817c, motionEvent);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f160836d.mo130752f(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f160836d.mo130751d();
    }
}
