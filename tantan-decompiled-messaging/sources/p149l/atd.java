package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class atd {

    /* JADX INFO: renamed from: e */
    public static final String f71599e = txv.m190978i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a */
    public final dud0 f71600a;

    /* JADX INFO: renamed from: b */
    public final sid0 f71601b;

    /* JADX INFO: renamed from: c */
    public final r95 f71602c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Runnable> f71603d = new HashMap();

    /* JADX INFO: renamed from: l.atd$a */
    public class RunnableC15712a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ haq0 f71604a;

        public RunnableC15712a(haq0 haq0Var) {
            this.f71604a = haq0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            txv.m190976e().mo190979a(atd.f71599e, "Scheduling work " + this.f71604a.id);
            atd.this.f71600a.mo113684d(this.f71604a);
        }
    }

    public atd(@NonNull dud0 dud0Var, @NonNull sid0 sid0Var, @NonNull r95 r95Var) {
        this.f71600a = dud0Var;
        this.f71601b = sid0Var;
        this.f71602c = r95Var;
    }

    /* JADX INFO: renamed from: a */
    public void m98792a(@NonNull haq0 haq0Var, long j) {
        Runnable runnableRemove = this.f71603d.remove(haq0Var.id);
        if (runnableRemove != null) {
            this.f71601b.mo142786a(runnableRemove);
        }
        RunnableC15712a runnableC15712a = new RunnableC15712a(haq0Var);
        this.f71603d.put(haq0Var.id, runnableC15712a);
        this.f71601b.mo142787b(j - this.f71602c.currentTimeMillis(), runnableC15712a);
    }

    /* JADX INFO: renamed from: b */
    public void m98793b(@NonNull String str) {
        Runnable runnableRemove = this.f71603d.remove(str);
        if (runnableRemove != null) {
            this.f71601b.mo142786a(runnableRemove);
        }
    }
}
