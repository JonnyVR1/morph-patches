package p153l;

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
public class pk4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public ox2 f152773a;

    /* JADX INFO: renamed from: d */
    public int f152776d;

    /* JADX INFO: renamed from: e */
    public Paint f152777e;

    /* JADX INFO: renamed from: f */
    public Rect f152778f;

    /* JADX INFO: renamed from: g */
    public float f152779g;

    /* JADX INFO: renamed from: h */
    public float f152780h;

    /* JADX INFO: renamed from: b */
    public boolean f152774b = false;

    /* JADX INFO: renamed from: c */
    public boolean f152775c = false;

    /* JADX INFO: renamed from: i */
    public long f152781i = 6000;

    /* JADX INFO: renamed from: j */
    public long f152782j = 100;

    /* JADX INFO: renamed from: k */
    public int f152783k = 10;

    /* JADX INFO: renamed from: l */
    public Path f152784l = new Path();

    /* JADX INFO: renamed from: m */
    public List<pf60<Long, Float>> f152785m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Integer> f152786n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public long f152787o = -1;

    /* JADX INFO: renamed from: p */
    public long f152788p = -1;

    public pk4(ox2 ox2Var) {
        this.f152773a = ox2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m172564a(long j) {
        Iterator<pf60<Long, Float>> it = this.f152785m.iterator();
        while (it.hasNext()) {
            if (j - it.next().f152156a.longValue() >= 8000) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m172565b() {
        this.f152777e = new Paint();
        this.f152778f = new Rect(0, 0, this.f152776d, this.f152773a.m169659n(100.0f));
        this.f152779g = this.f152776d / this.f152781i;
        this.f152780h = (this.f152773a.m169659n(100.0f) - this.f152783k) / 60.0f;
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m172566c(long j) {
        if (j - this.f152788p >= this.f152782j) {
            Iterator<Integer> it = this.f152786n.iterator();
            int i = 0;
            float fIntValue = 0.0f;
            while (it.hasNext()) {
                fIntValue += it.next().intValue();
                i++;
            }
            float f = i != 0 ? fIntValue / i : 0.0f;
            this.f152786n.clear();
            this.f152785m.add(pf60.m172085a(Long.valueOf(this.f152788p), Float.valueOf(f)));
            this.f152788p = j;
            m172564a(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m172567d(int i, int i2) {
        this.f152776d = View.MeasureSpec.getSize(i);
        if (this.f152775c || !this.f152774b) {
            return;
        }
        this.f152775c = true;
        m172565b();
        if (this.f152773a.m169620B() != null) {
            this.f152773a.m169620B().invalidate();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f152788p < 0) {
            this.f152788p = jElapsedRealtime;
        }
        long j2 = this.f152787o;
        if (j2 >= 0) {
            this.f152786n.add(Integer.valueOf((int) (1000 / (jElapsedRealtime - j2))));
        }
        this.f152787o = SystemClock.elapsedRealtime();
        m172566c(jElapsedRealtime);
        ox2 ox2Var = this.f152773a;
        if (ox2Var == null || ox2Var.m169620B() == null) {
            return;
        }
        this.f152773a.m169620B().invalidate();
    }
}
