package p007l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class sbl0 {

    /* JADX INFO: renamed from: a */
    public int f12875a;

    /* JADX INFO: renamed from: b */
    public int f12876b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f12877c;

    /* JADX INFO: renamed from: e */
    public MotionEvent f12879e;

    /* JADX INFO: renamed from: d */
    public final int f12878d = 800;

    /* JADX INFO: renamed from: f */
    public boolean f12880f = true;

    public sbl0(Context context) {
        m14121d(context);
    }

    /* JADX INFO: renamed from: a */
    public void m14118a(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (this.f12879e == null) {
            this.f12879e = motionEvent;
        }
        if (this.f12880f) {
            float[] fArrM14119b = m14119b(motionEventObtain);
            motionEventObtain.offsetLocation(fArrM14119b[0], fArrM14119b[1]);
        }
        this.f12877c.addMovement(motionEventObtain);
    }

    /* JADX INFO: renamed from: b */
    public float[] m14119b(MotionEvent motionEvent) {
        float[] fArr = new float[2];
        if (NullChecker.a(this.f12879e)) {
            float rawX = motionEvent.getRawX() - this.f12879e.getRawX();
            float rawY = motionEvent.getRawY() - this.f12879e.getRawY();
            float x = motionEvent.getX() - this.f12879e.getX();
            float y = motionEvent.getY() - this.f12879e.getY();
            fArr[0] = rawX - x;
            fArr[1] = rawY - y;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public void m14120c() {
        this.f12877c.clear();
        this.f12879e = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m14121d(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f12875a = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12876b = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f12877c = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: e */
    public boolean m14122e() {
        this.f12877c.computeCurrentVelocity(MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO, this.f12876b);
        return this.f12877c.getYVelocity() >= 800.0f;
    }
}
