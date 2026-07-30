package p149l;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class dr0 {

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<dr0> f87554g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public AbstractC16449c f87558d;

    /* JADX INFO: renamed from: a */
    public final hgf0<InterfaceC16448b, Long> f87555a = new hgf0<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<InterfaceC16448b> f87556b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C16447a f87557c = new C16447a();

    /* JADX INFO: renamed from: e */
    public long f87559e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f87560f = false;

    /* JADX INFO: renamed from: l.dr0$a */
    public class C16447a {
        public C16447a() {
        }

        /* JADX INFO: renamed from: a */
        public void m113261a() {
            dr0.this.f87559e = SystemClock.uptimeMillis();
            dr0 dr0Var = dr0.this;
            dr0Var.m113257c(dr0Var.f87559e);
            if (dr0.this.f87556b.size() > 0) {
                dr0.this.m113258e().mo113263a();
            }
        }
    }

    /* JADX INFO: renamed from: l.dr0$b */
    public interface InterfaceC16448b {
        /* JADX INFO: renamed from: a */
        boolean mo113262a(long j);
    }

    /* JADX INFO: renamed from: l.dr0$c */
    public static abstract class AbstractC16449c {

        /* JADX INFO: renamed from: a */
        public final C16447a f87562a;

        public AbstractC16449c(C16447a c16447a) {
            this.f87562a = c16447a;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo113263a();
    }

    /* JADX INFO: renamed from: l.dr0$d */
    @RequiresApi(16)
    public static class C16450d extends AbstractC16449c {

        /* JADX INFO: renamed from: b */
        public final Choreographer f87563b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f87564c;

        /* JADX INFO: renamed from: l.dr0$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C16450d.this.f87562a.m113261a();
            }
        }

        public C16450d(C16447a c16447a) {
            super(c16447a);
            this.f87563b = Choreographer.getInstance();
            this.f87564c = new a();
        }

        @Override // p149l.dr0.AbstractC16449c
        /* JADX INFO: renamed from: a */
        public void mo113263a() {
            this.f87563b.postFrameCallback(this.f87564c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static dr0 m113254d() {
        ThreadLocal<dr0> threadLocal = f87554g;
        if (threadLocal.get() == null) {
            threadLocal.set(new dr0());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: a */
    public void m113255a(InterfaceC16448b interfaceC16448b, long j) {
        if (this.f87556b.size() == 0) {
            m113258e().mo113263a();
        }
        if (!this.f87556b.contains(interfaceC16448b)) {
            this.f87556b.add(interfaceC16448b);
        }
        if (j > 0) {
            this.f87555a.put(interfaceC16448b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m113256b() {
        if (this.f87560f) {
            for (int size = this.f87556b.size() - 1; size >= 0; size--) {
                if (this.f87556b.get(size) == null) {
                    this.f87556b.remove(size);
                }
            }
            this.f87560f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m113257c(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f87556b.size(); i++) {
            InterfaceC16448b interfaceC16448b = this.f87556b.get(i);
            if (interfaceC16448b != null && m113259f(interfaceC16448b, jUptimeMillis)) {
                interfaceC16448b.mo113262a(j);
            }
        }
        m113256b();
    }

    /* JADX INFO: renamed from: e */
    public AbstractC16449c m113258e() {
        if (this.f87558d == null) {
            this.f87558d = new C16450d(this.f87557c);
        }
        return this.f87558d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m113259f(InterfaceC16448b interfaceC16448b, long j) {
        Long l2 = this.f87555a.get(interfaceC16448b);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j) {
            return false;
        }
        this.f87555a.remove(interfaceC16448b);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m113260g(InterfaceC16448b interfaceC16448b) {
        this.f87555a.remove(interfaceC16448b);
        int iIndexOf = this.f87556b.indexOf(interfaceC16448b);
        if (iIndexOf >= 0) {
            this.f87556b.set(iIndexOf, null);
            this.f87560f = true;
        }
    }
}
