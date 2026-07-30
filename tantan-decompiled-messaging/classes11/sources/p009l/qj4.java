package p009l;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qj4 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public zw2 f19324a;

    /* JADX INFO: renamed from: d */
    public int f19327d;

    /* JADX INFO: renamed from: e */
    public Paint f19328e;

    /* JADX INFO: renamed from: f */
    public Rect f19329f;

    /* JADX INFO: renamed from: g */
    public float f19330g;

    /* JADX INFO: renamed from: h */
    public float f19331h;

    /* JADX INFO: renamed from: b */
    public boolean f19325b = false;

    /* JADX INFO: renamed from: c */
    public boolean f19326c = false;

    /* JADX INFO: renamed from: i */
    public long f19332i = 6000;

    /* JADX INFO: renamed from: j */
    public long f19333j = 100;

    /* JADX INFO: renamed from: k */
    public int f19334k = 10;

    /* JADX INFO: renamed from: l */
    public Path f19335l = new Path();

    /* JADX INFO: renamed from: m */
    public List<j760<Long, Float>> f19336m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Integer> f19337n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public long f19338o = -1;

    /* JADX INFO: renamed from: p */
    public long f19339p = -1;

    public qj4(zw2 zw2Var) {
        this.f19324a = zw2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m21064a(long j) {
        Iterator<j760<Long, Float>> it = this.f19336m.iterator();
        while (it.hasNext()) {
            if (j - ((Long) it.next().a).longValue() >= 8000) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21065b() {
        this.f19328e = new Paint();
        this.f19329f = new Rect(0, 0, this.f19327d, this.f19324a.m26027n(100.0f));
        this.f19330g = this.f19327d / this.f19332i;
        this.f19331h = (this.f19324a.m26027n(100.0f) - this.f19334k) / 60.0f;
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m21066c(long j) {
        if (j - this.f19339p >= this.f19333j) {
            Iterator<Integer> it = this.f19337n.iterator();
            int i = 0;
            float fIntValue = 0.0f;
            while (it.hasNext()) {
                fIntValue += it.next().intValue();
                i++;
            }
            float f = i != 0 ? fIntValue / i : 0.0f;
            this.f19337n.clear();
            this.f19336m.add(j760.a(Long.valueOf(this.f19339p), Float.valueOf(f)));
            this.f19339p = j;
            m21064a(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21067d(int i, int i2) {
        this.f19327d = View.MeasureSpec.getSize(i);
        if (this.f19326c || !this.f19325b) {
            return;
        }
        this.f19326c = true;
        m21065b();
        if (this.f19324a.m25989B() != null) {
            this.f19324a.m25989B().invalidate();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f19339p < 0) {
            this.f19339p = jElapsedRealtime;
        }
        long j2 = this.f19338o;
        if (j2 >= 0) {
            this.f19337n.add(Integer.valueOf((int) (1000 / (jElapsedRealtime - j2))));
        }
        this.f19338o = SystemClock.elapsedRealtime();
        m21066c(jElapsedRealtime);
        zw2 zw2Var = this.f19324a;
        if (zw2Var == null || zw2Var.m25989B() == null) {
            return;
        }
        this.f19324a.m25989B().invalidate();
    }
}
