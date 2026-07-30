package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class oud {

    /* JADX INFO: renamed from: e */
    public static final String f149113e = qzv.m178831i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    public final h2e0 f149114a;

    /* JADX INFO: renamed from: b */
    public final vqd0 f149115b;

    /* JADX INFO: renamed from: c */
    public final sa5 f149116c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Runnable> f149117d = new HashMap();

    /* JADX INFO: renamed from: l.oud$a */
    public class RunnableC19216a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ mjq0 f149118a;

        public RunnableC19216a(mjq0 mjq0Var) {
            this.f149118a = mjq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            qzv.m178829e().mo178832a(oud.f149113e, "Scheduling work " + this.f149118a.id);
            oud.this.f149114a.mo133388d(this.f149118a);
        }
    }

    public oud(@NonNull h2e0 h2e0Var, @NonNull vqd0 vqd0Var, @NonNull sa5 sa5Var) {
        this.f149114a = h2e0Var;
        this.f149115b = vqd0Var;
        this.f149116c = sa5Var;
    }

    /* JADX INFO: renamed from: a */
    public void m169285a(@NonNull mjq0 mjq0Var, long j) {
        Runnable runnableRemove = this.f149117d.remove(mjq0Var.id);
        if (runnableRemove != null) {
            this.f149115b.mo202376a(runnableRemove);
        }
        RunnableC19216a runnableC19216a = new RunnableC19216a(mjq0Var);
        this.f149117d.put(mjq0Var.id, runnableC19216a);
        this.f149115b.mo202377b(j - this.f149116c.currentTimeMillis(), runnableC19216a);
    }

    /* JADX INFO: renamed from: b */
    public void m169286b(@NonNull String str) {
        Runnable runnableRemove = this.f149117d.remove(str);
        if (runnableRemove != null) {
            this.f149115b.mo202376a(runnableRemove);
        }
    }
}
