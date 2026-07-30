package p153l;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class hr0 {

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<hr0> f111204g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    public AbstractC17545c f111208d;

    /* JADX INFO: renamed from: a */
    public final oof0<InterfaceC17544b, Long> f111205a = new oof0<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<InterfaceC17544b> f111206b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final C17543a f111207c = new C17543a();

    /* JADX INFO: renamed from: e */
    public long f111209e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f111210f = false;

    /* JADX INFO: renamed from: l.hr0$a */
    public class C17543a {
        public C17543a() {
        }

        /* JADX INFO: renamed from: a */
        public void m136733a() {
            hr0.this.f111209e = SystemClock.uptimeMillis();
            hr0 hr0Var = hr0.this;
            hr0Var.m136729c(hr0Var.f111209e);
            if (hr0.this.f111206b.size() > 0) {
                hr0.this.m136730e().mo136734a();
            }
        }
    }

    /* JADX INFO: renamed from: l.hr0$b */
    public interface InterfaceC17544b {
        /* JADX INFO: renamed from: a */
        boolean mo104119a(long j);
    }

    /* JADX INFO: renamed from: l.hr0$c */
    public static abstract class AbstractC17545c {

        /* JADX INFO: renamed from: a */
        public final C17543a f111212a;

        public AbstractC17545c(C17543a c17543a) {
            this.f111212a = c17543a;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo136734a();
    }

    /* JADX INFO: renamed from: l.hr0$d */
    @RequiresApi(16)
    public static class C17546d extends AbstractC17545c {

        /* JADX INFO: renamed from: b */
        public final Choreographer f111213b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f111214c;

        /* JADX INFO: renamed from: l.hr0$d$a */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                C17546d.this.f111212a.m136733a();
            }
        }

        public C17546d(C17543a c17543a) {
            super(c17543a);
            this.f111213b = Choreographer.getInstance();
            this.f111214c = new a();
        }

        @Override // p153l.hr0.AbstractC17545c
        /* JADX INFO: renamed from: a */
        public void mo136734a() {
            this.f111213b.postFrameCallback(this.f111214c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static hr0 m136726d() {
        ThreadLocal<hr0> threadLocal = f111204g;
        if (threadLocal.get() == null) {
            threadLocal.set(new hr0());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: a */
    public void m136727a(InterfaceC17544b interfaceC17544b, long j) {
        if (this.f111206b.size() == 0) {
            m136730e().mo136734a();
        }
        if (!this.f111206b.contains(interfaceC17544b)) {
            this.f111206b.add(interfaceC17544b);
        }
        if (j > 0) {
            this.f111205a.put(interfaceC17544b, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m136728b() {
        if (this.f111210f) {
            for (int size = this.f111206b.size() - 1; size >= 0; size--) {
                if (this.f111206b.get(size) == null) {
                    this.f111206b.remove(size);
                }
            }
            this.f111210f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m136729c(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f111206b.size(); i++) {
            InterfaceC17544b interfaceC17544b = this.f111206b.get(i);
            if (interfaceC17544b != null && m136731f(interfaceC17544b, jUptimeMillis)) {
                interfaceC17544b.mo104119a(j);
            }
        }
        m136728b();
    }

    /* JADX INFO: renamed from: e */
    public AbstractC17545c m136730e() {
        if (this.f111208d == null) {
            this.f111208d = new C17546d(this.f111207c);
        }
        return this.f111208d;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m136731f(InterfaceC17544b interfaceC17544b, long j) {
        Long l2 = this.f111205a.get(interfaceC17544b);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j) {
            return false;
        }
        this.f111205a.remove(interfaceC17544b);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public void m136732g(InterfaceC17544b interfaceC17544b) {
        this.f111205a.remove(interfaceC17544b);
        int iIndexOf = this.f111206b.indexOf(interfaceC17544b);
        if (iIndexOf >= 0) {
            this.f111206b.set(iIndexOf, null);
            this.f111210f = true;
        }
    }
}
