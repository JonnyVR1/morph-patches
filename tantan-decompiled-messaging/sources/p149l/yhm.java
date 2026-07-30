package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class yhm {

    /* JADX INFO: renamed from: b */
    int f198358b;

    /* JADX INFO: renamed from: c */
    int f198359c;

    /* JADX INFO: renamed from: j */
    protected wbj f198366j;

    /* JADX INFO: renamed from: k */
    private us2 f198367k;

    /* JADX INFO: renamed from: n */
    private SurfaceTexture f198370n;

    /* JADX INFO: renamed from: a */
    private final String f198357a = "ImageRender";

    /* JADX INFO: renamed from: d */
    ncj f198360d = null;

    /* JADX INFO: renamed from: e */
    ncj f198361e = null;

    /* JADX INFO: renamed from: f */
    us2 f198362f = null;

    /* JADX INFO: renamed from: g */
    us2 f198363g = null;

    /* JADX INFO: renamed from: l */
    private List<us2> f198368l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private int f198369m = -12345;

    /* JADX INFO: renamed from: h */
    final Queue<Runnable> f198364h = new LinkedList();

    /* JADX INFO: renamed from: i */
    final Queue<Runnable> f198365i = new LinkedList();

    /* JADX INFO: renamed from: b */
    private void m214826b(ncj ncjVar) {
        if (ncjVar != null) {
            Iterator<us2> it = this.f198368l.iterator();
            while (it.hasNext()) {
                ncjVar.m158945C(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m214827d() {
        wbj wbjVar = new wbj();
        this.f198366j = wbjVar;
        mo177602f();
        wbjVar.m202539c(this.f198358b, this.f198359c);
        ncj ncjVar = this.f198360d;
        if (ncjVar != null) {
            us2 us2Var = this.f198367k;
            if (us2Var != null) {
                ncjVar.m158945C(us2Var);
                m214826b(this.f198367k);
            } else {
                m214826b(ncjVar);
            }
            wbjVar.m202538b(this.f198360d);
            wbjVar.m202543h();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m214828a(us2 us2Var) {
        wbj wbjVar = this.f198366j;
        if (wbjVar != null) {
            wbjVar.m202537a(us2Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m214829c() {
        m214834l(this.f198364h);
        mo177604j();
        GLES20.glFinish();
        m214834l(this.f198365i);
    }

    /* JADX INFO: renamed from: e */
    public void m214830e() {
        m214827d();
    }

    /* JADX INFO: renamed from: g */
    public void m214831g(us2 us2Var) {
        if (this.f198362f != null) {
            return;
        }
        this.f198362f = us2Var;
        ncj ncjVar = this.f198360d;
        if (ncjVar != null) {
            ncjVar.m158945C(us2Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m214832h(us2 us2Var) {
        if (this.f198368l.contains(us2Var)) {
            return;
        }
        this.f198368l.add(us2Var);
        us2 us2Var2 = this.f198367k;
        if (us2Var2 != null) {
            us2Var2.m158945C(us2Var);
            return;
        }
        ncj ncjVar = this.f198360d;
        if (ncjVar != null) {
            ncjVar.m158945C(us2Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo177603i() {
        try {
            SurfaceTexture surfaceTexture = this.f198370n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable unused) {
        }
        this.f198370n = null;
        wbj wbjVar = this.f198366j;
        if (wbjVar != null) {
            wbjVar.m202540d();
            this.f198366j = null;
        }
        us2 us2Var = this.f198367k;
        if (us2Var != null) {
            us2Var.mo102038f();
            this.f198367k = null;
        }
        if (this.f198362f != null) {
            this.f198362f = null;
        }
        us2 us2Var2 = this.f198363g;
        if (us2Var2 != null) {
            us2Var2.mo102038f();
            this.f198363g = null;
        }
        ncj ncjVar = this.f198361e;
        if (ncjVar != null) {
            ncjVar.mo102038f();
            this.f198361e = null;
        }
        this.f198368l.clear();
        Queue<Runnable> queue = this.f198364h;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f198365i;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo177604j() {
        wbj wbjVar = this.f198366j;
        if (wbjVar != null) {
            wbjVar.m202541f();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m214833k(ncj ncjVar) {
        ncj ncjVar2 = this.f198360d;
        if (ncjVar2 != null) {
            ncjVar2.m158946D();
            this.f198366j.m202542g(this.f198360d);
            this.f198361e = this.f198360d;
        }
        this.f198360d = ncjVar;
        this.f198366j.m202538b(ncjVar);
        us2 us2Var = this.f198367k;
        if (us2Var != null) {
            this.f198360d.m158945C(us2Var);
            m214826b(this.f198367k);
        }
        us2 us2Var2 = this.f198362f;
        if (us2Var2 != null) {
            this.f198360d.m158945C(us2Var2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m214834l(Queue<Runnable> queue) {
        synchronized (queue) {
            while (!queue.isEmpty()) {
                try {
                    queue.poll().run();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m214835m(us2 us2Var) {
        us2 us2Var2;
        if (us2Var == null || (us2Var2 = this.f198367k) == us2Var) {
            return;
        }
        if (this.f198360d == null) {
            this.f198367k = us2Var;
            return;
        }
        if (us2Var2 != null) {
            us2Var2.m158946D();
            this.f198366j.m202537a(this.f198367k);
        }
        this.f198367k = us2Var;
        this.f198360d.m158946D();
        this.f198360d.m158945C(this.f198367k);
        m214826b(this.f198367k);
        us2 us2Var3 = this.f198362f;
        if (us2Var3 != null) {
            this.f198360d.m158945C(us2Var3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m214836o(ncj ncjVar) {
        this.f198360d = ncjVar;
    }

    /* JADX INFO: renamed from: p */
    public void m214837p(long j) {
        kcj kcjVar = this.f198367k;
        if (kcjVar instanceof r7m) {
            ((r7m) kcjVar).setTimeStamp(j);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m214838q(us2 us2Var) {
        if (this.f198362f == us2Var) {
            this.f198362f = null;
            ncj ncjVar = this.f198360d;
            if (ncjVar != null) {
                ncjVar.m158951M(us2Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m214839r(us2 us2Var) {
        List<us2> list = this.f198368l;
        if (list != null) {
            list.remove(us2Var);
        }
        us2 us2Var2 = this.f198367k;
        if (us2Var2 != null) {
            us2Var2.m158951M(us2Var);
            return;
        }
        ncj ncjVar = this.f198360d;
        if (ncjVar != null) {
            ncjVar.m158951M(us2Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m214840s(IProcessOutput iProcessOutput) {
        if (iProcessOutput != null) {
            kcj kcjVar = this.f198367k;
            if (kcjVar instanceof dtf) {
                ((dtf) kcjVar).mo104314d(iProcessOutput);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo177602f() {
    }

    /* JADX INFO: renamed from: n */
    public void mo177605n(tif0 tif0Var) {
    }
}
