package p149l;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0916b;
import com.android.volley.C0917c;
import com.android.volley.InterfaceC0915a;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class yuc0 {

    /* JADX INFO: renamed from: a */
    private final AtomicInteger f200062a;

    /* JADX INFO: renamed from: b */
    private final Set<Request<?>> f200063b;

    /* JADX INFO: renamed from: c */
    private final PriorityBlockingQueue<Request<?>> f200064c;

    /* JADX INFO: renamed from: d */
    private final PriorityBlockingQueue<Request<?>> f200065d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0915a f200066e;

    /* JADX INFO: renamed from: f */
    private final cb20 f200067f;

    /* JADX INFO: renamed from: g */
    private final ixc0 f200068g;

    /* JADX INFO: renamed from: h */
    private final C0917c[] f200069h;

    /* JADX INFO: renamed from: i */
    private C0916b f200070i;

    /* JADX INFO: renamed from: j */
    private final List<InterfaceC21515b> f200071j;

    /* JADX INFO: renamed from: k */
    private final List<InterfaceC21514a> f200072k;

    /* JADX INFO: renamed from: l.yuc0$a */
    public interface InterfaceC21514a {
        /* JADX INFO: renamed from: a */
        void m216107a(Request<?> request, int i);
    }

    /* JADX INFO: renamed from: l.yuc0$b */
    @Deprecated
    public interface InterfaceC21515b<T> {
        /* JADX INFO: renamed from: a */
        void m216108a(Request<T> request);
    }

    public yuc0(InterfaceC0915a interfaceC0915a, cb20 cb20Var, int i, ixc0 ixc0Var) {
        this.f200062a = new AtomicInteger();
        this.f200063b = new HashSet();
        this.f200064c = new PriorityBlockingQueue<>();
        this.f200065d = new PriorityBlockingQueue<>();
        this.f200071j = new ArrayList();
        this.f200072k = new ArrayList();
        this.f200066e = interfaceC0915a;
        this.f200067f = cb20Var;
        this.f200069h = new C0917c[i];
        this.f200068g = ixc0Var;
    }

    /* JADX INFO: renamed from: a */
    public <T> Request<T> m216099a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.f200063b) {
            this.f200063b.add(request);
        }
        request.setSequence(m216102d());
        request.addMarker("add-to-queue");
        m216103e(request, 0);
        m216100b(request);
        return request;
    }

    /* JADX INFO: renamed from: b */
    public <T> void m216100b(Request<T> request) {
        if (request.shouldCache()) {
            this.f200064c.add(request);
        } else {
            m216104f(request);
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> void m216101c(Request<T> request) {
        synchronized (this.f200063b) {
            this.f200063b.remove(request);
        }
        synchronized (this.f200071j) {
            try {
                Iterator<InterfaceC21515b> it = this.f200071j.iterator();
                while (it.hasNext()) {
                    it.next().m216108a(request);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m216103e(request, 5);
    }

    /* JADX INFO: renamed from: d */
    public int m216102d() {
        return this.f200062a.incrementAndGet();
    }

    /* JADX INFO: renamed from: e */
    public void m216103e(Request<?> request, int i) {
        synchronized (this.f200072k) {
            try {
                Iterator<InterfaceC21514a> it = this.f200072k.iterator();
                while (it.hasNext()) {
                    it.next().m216107a(request, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public <T> void m216104f(Request<T> request) {
        this.f200065d.add(request);
    }

    /* JADX INFO: renamed from: g */
    public void m216105g() {
        m216106h();
        C0916b c0916b = new C0916b(this.f200064c, this.f200065d, this.f200066e, this.f200068g);
        this.f200070i = c0916b;
        c0916b.start();
        for (int i = 0; i < this.f200069h.length; i++) {
            C0917c c0917c = new C0917c(this.f200065d, this.f200067f, this.f200066e, this.f200068g);
            this.f200069h[i] = c0917c;
            c0917c.start();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m216106h() {
        C0916b c0916b = this.f200070i;
        if (c0916b != null) {
            c0916b.m5089d();
        }
        for (C0917c c0917c : this.f200069h) {
            if (c0917c != null) {
                c0917c.m5094e();
            }
        }
    }

    public yuc0(InterfaceC0915a interfaceC0915a, cb20 cb20Var, int i) {
        this(interfaceC0915a, cb20Var, i, new u5f(new Handler(Looper.getMainLooper())));
    }

    public yuc0(InterfaceC0915a interfaceC0915a, cb20 cb20Var) {
        this(interfaceC0915a, cb20Var, 4);
    }
}
