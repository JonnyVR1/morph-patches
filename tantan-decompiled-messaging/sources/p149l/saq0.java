package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class saq0 {

    /* JADX INFO: renamed from: e */
    public static final String f163429e = txv.m190978i("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final sid0 f163430a;

    /* JADX INFO: renamed from: b */
    public final Map<k9q0, RunnableC19895b> f163431b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<k9q0, InterfaceC19894a> f163432c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Object f163433d = new Object();

    /* JADX INFO: renamed from: l.saq0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface InterfaceC19894a {
        /* JADX INFO: renamed from: b */
        void mo4547b(@NonNull k9q0 k9q0Var);
    }

    /* JADX INFO: renamed from: l.saq0$b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class RunnableC19895b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final saq0 f163434a;

        /* JADX INFO: renamed from: b */
        public final k9q0 f163435b;

        public RunnableC19895b(@NonNull saq0 saq0Var, @NonNull k9q0 k9q0Var) {
            this.f163434a = saq0Var;
            this.f163435b = k9q0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f163434a.f163433d) {
                try {
                    if (this.f163434a.f163431b.remove(this.f163435b) != null) {
                        InterfaceC19894a interfaceC19894aRemove = this.f163434a.f163432c.remove(this.f163435b);
                        if (interfaceC19894aRemove != null) {
                            interfaceC19894aRemove.mo4547b(this.f163435b);
                        }
                    } else {
                        txv.m190976e().mo190979a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f163435b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public saq0(@NonNull sid0 sid0Var) {
        this.f163430a = sid0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m183089a(@NonNull k9q0 k9q0Var, long j, @NonNull InterfaceC19894a interfaceC19894a) {
        synchronized (this.f163433d) {
            txv.m190976e().mo190979a(f163429e, "Starting timer for " + k9q0Var);
            m183090b(k9q0Var);
            RunnableC19895b runnableC19895b = new RunnableC19895b(this, k9q0Var);
            this.f163431b.put(k9q0Var, runnableC19895b);
            this.f163432c.put(k9q0Var, interfaceC19894a);
            this.f163430a.mo142787b(j, runnableC19895b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m183090b(@NonNull k9q0 k9q0Var) {
        synchronized (this.f163433d) {
            try {
                if (this.f163431b.remove(k9q0Var) != null) {
                    txv.m190976e().mo190979a(f163429e, "Stopping timer for " + k9q0Var);
                    this.f163432c.remove(k9q0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
