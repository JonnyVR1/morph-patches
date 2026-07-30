package p153l;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0920b;
import com.android.volley.C0921c;
import com.android.volley.InterfaceC0919a;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class b3d0 {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f74724a;

    /* JADX INFO: renamed from: b */
    private final Set<Request<?>> f74725b;

    /* JADX INFO: renamed from: c */
    private final PriorityBlockingQueue<Request<?>> f74726c;

    /* JADX INFO: renamed from: d */
    private final PriorityBlockingQueue<Request<?>> f74727d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0919a f74728e;

    /* JADX INFO: renamed from: f */
    private final lj20 f74729f;

    /* JADX INFO: renamed from: g */
    private final m5d0 f74730g;

    /* JADX INFO: renamed from: h */
    private final C0921c[] f74731h;

    /* JADX INFO: renamed from: i */
    private C0920b f74732i;

    /* JADX INFO: renamed from: j */
    private final List<InterfaceC15911b> f74733j;

    /* JADX INFO: renamed from: k */
    private final List<InterfaceC15910a> f74734k;

    /* JADX INFO: renamed from: l.b3d0$a */
    public interface InterfaceC15910a {
        /* JADX INFO: renamed from: a */
        void m102286a(Request<?> request, int i);
    }

    /* JADX INFO: renamed from: l.b3d0$b */
    @Deprecated
    public interface InterfaceC15911b<T> {
        /* JADX INFO: renamed from: a */
        void m102287a(Request<T> request);
    }

    public b3d0(InterfaceC0919a interfaceC0919a, lj20 lj20Var, int i, m5d0 m5d0Var) {
        this.f74724a = new AtomicInteger();
        this.f74725b = new HashSet();
        this.f74726c = new PriorityBlockingQueue<>();
        this.f74727d = new PriorityBlockingQueue<>();
        this.f74733j = new ArrayList();
        this.f74734k = new ArrayList();
        this.f74728e = interfaceC0919a;
        this.f74729f = lj20Var;
        this.f74731h = new C0921c[i];
        this.f74730g = m5d0Var;
    }

    /* JADX INFO: renamed from: a */
    public <T> Request<T> m102278a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.f74725b) {
            this.f74725b.add(request);
        }
        request.setSequence(m102281d());
        request.addMarker("add-to-queue");
        m102282e(request, 0);
        m102279b(request);
        return request;
    }

    /* JADX INFO: renamed from: b */
    public <T> void m102279b(Request<T> request) {
        if (request.shouldCache()) {
            this.f74726c.add(request);
        } else {
            m102283f(request);
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> void m102280c(Request<T> request) {
        synchronized (this.f74725b) {
            this.f74725b.remove(request);
        }
        synchronized (this.f74733j) {
            try {
                Iterator<InterfaceC15911b> it = this.f74733j.iterator();
                while (it.hasNext()) {
                    it.next().m102287a(request);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m102282e(request, 5);
    }

    /* JADX INFO: renamed from: d */
    public int m102281d() {
        return this.f74724a.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public void m102282e(Request<?> request, int i) {
        synchronized (this.f74734k) {
            try {
                Iterator<InterfaceC15910a> it = this.f74734k.iterator();
                while (it.hasNext()) {
                    it.next().m102286a(request, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public <T> void m102283f(Request<T> request) {
        this.f74727d.add(request);
    }

    /* JADX INFO: renamed from: g */
    public void m102284g() {
        m102285h();
        C0920b c0920b = new C0920b(this.f74726c, this.f74727d, this.f74728e, this.f74730g);
        this.f74732i = c0920b;
        c0920b.start();
        for (int i = 0; i < this.f74731h.length; i++) {
            C0921c c0921c = new C0921c(this.f74727d, this.f74729f, this.f74728e, this.f74730g);
            this.f74731h[i] = c0921c;
            c0921c.start();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m102285h() {
        C0920b c0920b = this.f74732i;
        if (c0920b != null) {
            c0920b.m5099d();
        }
        for (C0921c c0921c : this.f74731h) {
            if (c0921c != null) {
                c0921c.m5104e();
            }
        }
    }

    public b3d0(InterfaceC0919a interfaceC0919a, lj20 lj20Var, int i) {
        this(interfaceC0919a, lj20Var, i, new a7f(new Handler(Looper.getMainLooper())));
    }

    public b3d0(InterfaceC0919a interfaceC0919a, lj20 lj20Var) {
        this(interfaceC0919a, lj20Var, 4);
    }
}
