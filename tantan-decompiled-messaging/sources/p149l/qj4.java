package p149l;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class qj4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public zw2 f154861a;

    /* JADX INFO: renamed from: d */
    public int f154864d;

    /* JADX INFO: renamed from: e */
    public Paint f154865e;

    /* JADX INFO: renamed from: f */
    public Rect f154866f;

    /* JADX INFO: renamed from: g */
    public float f154867g;

    /* JADX INFO: renamed from: h */
    public float f154868h;

    /* JADX INFO: renamed from: b */
    public boolean f154862b = false;

    /* JADX INFO: renamed from: c */
    public boolean f154863c = false;

    /* JADX INFO: renamed from: i */
    public long f154869i = 6000;

    /* JADX INFO: renamed from: j */
    public long f154870j = 100;

    /* JADX INFO: renamed from: k */
    public int f154871k = 10;

    /* JADX INFO: renamed from: l */
    public Path f154872l = new Path();

    /* JADX INFO: renamed from: m */
    public List<j760<Long, Float>> f154873m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Integer> f154874n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public long f154875o = -1;

    /* JADX INFO: renamed from: p */
    public long f154876p = -1;

    public qj4(zw2 zw2Var) {
        this.f154861a = zw2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m174968a(long j) {
        Iterator<j760<Long, Float>> it = this.f154873m.iterator();
        while (it.hasNext()) {
            if (j - it.next().f116564a.longValue() >= 8000) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m174969b() {
        this.f154865e = new Paint();
        this.f154866f = new Rect(0, 0, this.f154864d, this.f154861a.m220545n(100.0f));
        this.f154867g = this.f154864d / this.f154869i;
        this.f154868h = (this.f154861a.m220545n(100.0f) - this.f154871k) / 60.0f;
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m174970c(long j) {
        if (j - this.f154876p >= this.f154870j) {
            Iterator<Integer> it = this.f154874n.iterator();
            int i = 0;
            float fIntValue = 0.0f;
            while (it.hasNext()) {
                fIntValue += it.next().intValue();
                i++;
            }
            float f = i != 0 ? fIntValue / i : 0.0f;
            this.f154874n.clear();
            this.f154873m.add(j760.m140076a(Long.valueOf(this.f154876p), Float.valueOf(f)));
            this.f154876p = j;
            m174968a(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m174971d(int i, int i2) {
        this.f154864d = View.MeasureSpec.getSize(i);
        if (this.f154863c || !this.f154862b) {
            return;
        }
        this.f154863c = true;
        m174969b();
        if (this.f154861a.m220507B() != null) {
            this.f154861a.m220507B().invalidate();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f154876p < 0) {
            this.f154876p = jElapsedRealtime;
        }
        long j2 = this.f154875o;
        if (j2 >= 0) {
            this.f154874n.add(Integer.valueOf((int) (1000 / (jElapsedRealtime - j2))));
        }
        this.f154875o = SystemClock.elapsedRealtime();
        m174970c(jElapsedRealtime);
        zw2 zw2Var = this.f154861a;
        if (zw2Var == null || zw2Var.m220507B() == null) {
            return;
        }
        this.f154861a.m220507B().invalidate();
    }
}
