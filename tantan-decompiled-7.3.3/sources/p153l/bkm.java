package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes7.dex */
public class bkm {

    /* JADX INFO: renamed from: b */
    int f77090b;

    /* JADX INFO: renamed from: c */
    int f77091c;

    /* JADX INFO: renamed from: j */
    protected qej f77098j;

    /* JADX INFO: renamed from: k */
    private kt2 f77099k;

    /* JADX INFO: renamed from: n */
    private SurfaceTexture f77102n;

    /* JADX INFO: renamed from: a */
    private final String f77089a = "ImageRender";

    /* JADX INFO: renamed from: d */
    hfj f77092d = null;

    /* JADX INFO: renamed from: e */
    hfj f77093e = null;

    /* JADX INFO: renamed from: f */
    kt2 f77094f = null;

    /* JADX INFO: renamed from: g */
    kt2 f77095g = null;

    /* JADX INFO: renamed from: l */
    private List<kt2> f77100l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private int f77101m = -12345;

    /* JADX INFO: renamed from: h */
    final Queue<Runnable> f77096h = new LinkedList();

    /* JADX INFO: renamed from: i */
    final Queue<Runnable> f77097i = new LinkedList();

    /* JADX INFO: renamed from: b */
    private void m104819b(hfj hfjVar) {
        if (hfjVar != null) {
            Iterator<kt2> it = this.f77100l.iterator();
            while (it.hasNext()) {
                hfjVar.m134795C(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m104820d() {
        qej qejVar = new qej();
        this.f77098j = qejVar;
        mo104824f();
        qejVar.m176253c(this.f77090b, this.f77091c);
        hfj hfjVar = this.f77092d;
        if (hfjVar != null) {
            kt2 kt2Var = this.f77099k;
            if (kt2Var != null) {
                hfjVar.m134795C(kt2Var);
                m104819b(this.f77099k);
            } else {
                m104819b(hfjVar);
            }
            qejVar.m176252b(this.f77092d);
            qejVar.m176257h();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m104821a(kt2 kt2Var) {
        qej qejVar = this.f77098j;
        if (qejVar != null) {
            qejVar.m176251a(kt2Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m104822c() {
        m104830l(this.f77096h);
        mo104828j();
        GLES20.glFinish();
        m104830l(this.f77097i);
    }

    /* JADX INFO: renamed from: e */
    public void m104823e() {
        m104820d();
    }

    /* JADX INFO: renamed from: g */
    public void m104825g(kt2 kt2Var) {
        if (this.f77094f != null) {
            return;
        }
        this.f77094f = kt2Var;
        hfj hfjVar = this.f77092d;
        if (hfjVar != null) {
            hfjVar.m134795C(kt2Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m104826h(kt2 kt2Var) {
        if (this.f77100l.contains(kt2Var)) {
            return;
        }
        this.f77100l.add(kt2Var);
        kt2 kt2Var2 = this.f77099k;
        if (kt2Var2 != null) {
            kt2Var2.m134795C(kt2Var);
            return;
        }
        hfj hfjVar = this.f77092d;
        if (hfjVar != null) {
            hfjVar.m134795C(kt2Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo104827i() {
        try {
            SurfaceTexture surfaceTexture = this.f77102n;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable unused) {
        }
        this.f77102n = null;
        qej qejVar = this.f77098j;
        if (qejVar != null) {
            qejVar.m176254d();
            this.f77098j = null;
        }
        kt2 kt2Var = this.f77099k;
        if (kt2Var != null) {
            kt2Var.mo96080f();
            this.f77099k = null;
        }
        if (this.f77094f != null) {
            this.f77094f = null;
        }
        kt2 kt2Var2 = this.f77095g;
        if (kt2Var2 != null) {
            kt2Var2.mo96080f();
            this.f77095g = null;
        }
        hfj hfjVar = this.f77093e;
        if (hfjVar != null) {
            hfjVar.mo96080f();
            this.f77093e = null;
        }
        this.f77100l.clear();
        Queue<Runnable> queue = this.f77096h;
        if (queue != null) {
            queue.clear();
        }
        Queue<Runnable> queue2 = this.f77097i;
        if (queue2 != null) {
            queue2.clear();
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo104828j() {
        qej qejVar = this.f77098j;
        if (qejVar != null) {
            qejVar.m176255f();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m104829k(hfj hfjVar) {
        hfj hfjVar2 = this.f77092d;
        if (hfjVar2 != null) {
            hfjVar2.m134796D();
            this.f77098j.m176256g(this.f77092d);
            this.f77093e = this.f77092d;
        }
        this.f77092d = hfjVar;
        this.f77098j.m176252b(hfjVar);
        kt2 kt2Var = this.f77099k;
        if (kt2Var != null) {
            this.f77092d.m134795C(kt2Var);
            m104819b(this.f77099k);
        }
        kt2 kt2Var2 = this.f77094f;
        if (kt2Var2 != null) {
            this.f77092d.m134795C(kt2Var2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m104830l(Queue<Runnable> queue) {
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
    public void m104831m(kt2 kt2Var) {
        kt2 kt2Var2;
        if (kt2Var == null || (kt2Var2 = this.f77099k) == kt2Var) {
            return;
        }
        if (this.f77092d == null) {
            this.f77099k = kt2Var;
            return;
        }
        if (kt2Var2 != null) {
            kt2Var2.m134796D();
            this.f77098j.m176251a(this.f77099k);
        }
        this.f77099k = kt2Var;
        this.f77092d.m134796D();
        this.f77092d.m134795C(this.f77099k);
        m104819b(this.f77099k);
        kt2 kt2Var3 = this.f77094f;
        if (kt2Var3 != null) {
            this.f77092d.m134795C(kt2Var3);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m104833o(hfj hfjVar) {
        this.f77092d = hfjVar;
    }

    /* JADX INFO: renamed from: p */
    public void m104834p(long j) {
        Object obj = this.f77099k;
        if (obj instanceof ham) {
            ((ham) obj).setTimeStamp(j);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m104835q(kt2 kt2Var) {
        if (this.f77094f == kt2Var) {
            this.f77094f = null;
            hfj hfjVar = this.f77092d;
            if (hfjVar != null) {
                hfjVar.m134803M(kt2Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m104836r(kt2 kt2Var) {
        List<kt2> list = this.f77100l;
        if (list != null) {
            list.remove(kt2Var);
        }
        kt2 kt2Var2 = this.f77099k;
        if (kt2Var2 != null) {
            kt2Var2.m134803M(kt2Var);
            return;
        }
        hfj hfjVar = this.f77092d;
        if (hfjVar != null) {
            hfjVar.m134803M(kt2Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m104837s(IProcessOutput iProcessOutput) {
        if (iProcessOutput != null) {
            Object obj = this.f77099k;
            if (obj instanceof ruf) {
                ((ruf) obj).mo102835d(iProcessOutput);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo104824f() {
    }

    /* JADX INFO: renamed from: n */
    public void mo104832n(crf0 crf0Var) {
    }
}
