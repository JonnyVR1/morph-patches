package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class xjq0 {

    /* JADX INFO: renamed from: e */
    public static final String f194636e = qzv.m178831i("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final vqd0 f194637a;

    /* JADX INFO: renamed from: b */
    public final Map<piq0, RunnableC21355b> f194638b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<piq0, InterfaceC21354a> f194639c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f194640d = new Object();

    /* JADX INFO: renamed from: l.xjq0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface InterfaceC21354a {
        /* JADX INFO: renamed from: b */
        void mo4549b(@NonNull piq0 piq0Var);
    }

    /* JADX INFO: renamed from: l.xjq0$b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class RunnableC21355b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final xjq0 f194641a;

        /* JADX INFO: renamed from: b */
        public final piq0 f194642b;

        public RunnableC21355b(@NonNull xjq0 xjq0Var, @NonNull piq0 piq0Var) {
            this.f194641a = xjq0Var;
            this.f194642b = piq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f194641a.f194640d) {
                try {
                    if (this.f194641a.f194638b.remove(this.f194642b) != null) {
                        InterfaceC21354a interfaceC21354aRemove = this.f194641a.f194639c.remove(this.f194642b);
                        if (interfaceC21354aRemove != null) {
                            interfaceC21354aRemove.mo4549b(this.f194642b);
                        }
                    } else {
                        qzv.m178829e().mo178832a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f194642b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public xjq0(@NonNull vqd0 vqd0Var) {
        this.f194637a = vqd0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m211261a(@NonNull piq0 piq0Var, long j, @NonNull InterfaceC21354a interfaceC21354a) {
        synchronized (this.f194640d) {
            qzv.m178829e().mo178832a(f194636e, "Starting timer for " + piq0Var);
            m211262b(piq0Var);
            RunnableC21355b runnableC21355b = new RunnableC21355b(this, piq0Var);
            this.f194638b.put(piq0Var, runnableC21355b);
            this.f194639c.put(piq0Var, interfaceC21354a);
            this.f194637a.mo202377b(j, runnableC21355b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m211262b(@NonNull piq0 piq0Var) {
        synchronized (this.f194640d) {
            try {
                if (this.f194638b.remove(piq0Var) != null) {
                    qzv.m178829e().mo178832a(f194636e, "Stopping timer for " + piq0Var);
                    this.f194639c.remove(piq0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
