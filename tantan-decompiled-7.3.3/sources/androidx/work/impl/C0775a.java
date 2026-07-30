package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0763a;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0775a;
import androidx.work.impl.foreground.C0794a;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p153l.e3g0;
import p153l.hpr;
import p153l.i1j;
import p153l.j1j;
import p153l.j26;
import p153l.mjq0;
import p153l.piq0;
import p153l.qzv;
import p153l.v6f;
import p153l.xop0;
import p153l.zni0;

/* JADX INFO: renamed from: androidx.work.impl.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0775a implements j1j {

    /* JADX INFO: renamed from: l */
    public static final String f3517l = qzv.m178831i("Processor");

    /* JADX INFO: renamed from: b */
    public Context f3519b;

    /* JADX INFO: renamed from: c */
    public C0763a f3520c;

    /* JADX INFO: renamed from: d */
    public zni0 f3521d;

    /* JADX INFO: renamed from: e */
    public WorkDatabase f3522e;

    /* JADX INFO: renamed from: g */
    public Map<String, WorkerWrapper> f3524g = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, WorkerWrapper> f3523f = new HashMap();

    /* JADX INFO: renamed from: i */
    public Set<String> f3526i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final List<v6f> f3527j = new ArrayList();

    /* JADX INFO: renamed from: a */
    @Nullable
    public PowerManager.WakeLock f3518a = null;

    /* JADX INFO: renamed from: k */
    public final Object f3528k = new Object();

    /* JADX INFO: renamed from: h */
    public Map<String, Set<e3g0>> f3525h = new HashMap();

    public C0775a(@NonNull Context context, @NonNull C0763a c0763a, @NonNull zni0 zni0Var, @NonNull WorkDatabase workDatabase) {
        this.f3519b = context;
        this.f3520c = c0763a;
        this.f3521d = zni0Var;
        this.f3522e = workDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ mjq0 m4509b(C0775a c0775a, ArrayList arrayList, String str) {
        arrayList.addAll(c0775a.f3522e.workTagDao().mo201549c(str));
        return c0775a.f3522e.workSpecDao().mo163457v(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4510c(C0775a c0775a, piq0 piq0Var, boolean z) {
        synchronized (c0775a.f3528k) {
            try {
                Iterator<v6f> it = c0775a.f3527j.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(piq0Var, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4511d(C0775a c0775a, hpr hprVar, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        c0775a.getClass();
        try {
            zBooleanValue = ((Boolean) hprVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c0775a.m4520l(workerWrapper, zBooleanValue);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4512i(@NonNull String str, @Nullable WorkerWrapper workerWrapper, int i) {
        if (workerWrapper == null) {
            qzv.m178829e().mo178832a(f3517l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.m4477o(i);
        qzv.m178829e().mo178832a(f3517l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // p153l.j1j
    /* JADX INFO: renamed from: a */
    public void mo4513a(@NonNull String str, @NonNull i1j i1jVar) {
        synchronized (this.f3528k) {
            try {
                qzv.m178829e().mo178836f(f3517l, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapperRemove = this.f3524g.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.f3518a == null) {
                        PowerManager.WakeLock wakeLockM212478b = xop0.m212478b(this.f3519b, "ProcessorForegroundLck");
                        this.f3518a = wakeLockM212478b;
                        wakeLockM212478b.acquire();
                    }
                    this.f3523f.put(str, workerWrapperRemove);
                    j26.m143202o(this.f3519b, C0794a.m4600e(this.f3519b, workerWrapperRemove.m4474l(), i1jVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4514e(@NonNull v6f v6fVar) {
        synchronized (this.f3528k) {
            this.f3527j.add(v6fVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final WorkerWrapper m4515f(@NonNull String str) {
        WorkerWrapper workerWrapperRemove = this.f3523f.remove(str);
        boolean z = workerWrapperRemove != null;
        if (!z) {
            workerWrapperRemove = this.f3524g.remove(str);
        }
        this.f3525h.remove(str);
        if (z) {
            m4526r();
        }
        return workerWrapperRemove;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public mjq0 m4516g(@NonNull String str) {
        synchronized (this.f3528k) {
            try {
                WorkerWrapper workerWrapperM4517h = m4517h(str);
                if (workerWrapperM4517h == null) {
                    return null;
                }
                return workerWrapperM4517h.getWorkSpec();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final WorkerWrapper m4517h(@NonNull String str) {
        WorkerWrapper workerWrapper = this.f3523f.get(str);
        return workerWrapper == null ? this.f3524g.get(str) : workerWrapper;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4518j(@NonNull String str) {
        boolean zContains;
        synchronized (this.f3528k) {
            zContains = this.f3526i.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: k */
    public boolean m4519k(@NonNull String str) {
        boolean z;
        synchronized (this.f3528k) {
            z = m4517h(str) != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final void m4520l(@NonNull WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.f3528k) {
            try {
                piq0 piq0VarM4474l = workerWrapper.m4474l();
                String workSpecId = piq0VarM4474l.getWorkSpecId();
                if (m4517h(workSpecId) == workerWrapper) {
                    m4515f(workSpecId);
                }
                qzv.m178829e().mo178832a(f3517l, getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + workSpecId + " executed; reschedule = " + z);
                Iterator<v6f> it = this.f3527j.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(piq0VarM4474l, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4521m(@NonNull v6f v6fVar) {
        synchronized (this.f3528k) {
            this.f3527j.remove(v6fVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4522n(@NonNull final piq0 piq0Var, final boolean z) {
        this.f3521d.mo216345c().execute(new Runnable() { // from class: l.uk90
            @Override // java.lang.Runnable
            public final void run() {
                C0775a.m4510c(this.f179375a, piq0Var, z);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public boolean m4523o(@NonNull e3g0 e3g0Var) {
        return m4524p(e3g0Var, null);
    }

    /* JADX INFO: renamed from: p */
    public boolean m4524p(@NonNull e3g0 e3g0Var, @Nullable WorkerParameters.C0762a c0762a) {
        piq0 id = e3g0Var.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        mjq0 mjq0Var = (mjq0) this.f3522e.runInTransaction(new Callable() { // from class: l.sk90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0775a.m4509b(this.f169241a, arrayList, workSpecId);
            }
        });
        if (mjq0Var == null) {
            qzv.m178829e().mo178839k(f3517l, "Didn't find WorkSpec for id " + id);
            m4522n(id, false);
            return false;
        }
        synchronized (this.f3528k) {
            try {
                if (m4519k(workSpecId)) {
                    Set<e3g0> set = this.f3525h.get(workSpecId);
                    if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                        set.add(e3g0Var);
                        qzv.m178829e().mo178832a(f3517l, "Work " + id + " is already enqueued for processing");
                    } else {
                        m4522n(id, false);
                    }
                    return false;
                }
                if (mjq0Var.getGeneration() != id.getGeneration()) {
                    m4522n(id, false);
                    return false;
                }
                final WorkerWrapper workerWrapperM4488a = new WorkerWrapper.C0773a(this.f3519b, this.f3520c, this.f3521d, this, this.f3522e, mjq0Var, arrayList).m4498k(c0762a).m4488a();
                final hpr<Boolean> hprVarM4479q = workerWrapperM4488a.m4479q();
                hprVarM4479q.addListener(new Runnable() { // from class: l.tk90
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0775a.m4511d(this.f174696a, hprVarM4479q, workerWrapperM4488a);
                    }
                }, this.f3521d.mo216345c());
                this.f3524g.put(workSpecId, workerWrapperM4488a);
                HashSet hashSet = new HashSet();
                hashSet.add(e3g0Var);
                this.f3525h.put(workSpecId, hashSet);
                qzv.m178829e().mo178832a(f3517l, getClass().getSimpleName() + ": processing " + id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m4525q(@NonNull String str, int i) {
        WorkerWrapper workerWrapperM4515f;
        synchronized (this.f3528k) {
            qzv.m178829e().mo178832a(f3517l, "Processor cancelling " + str);
            this.f3526i.add(str);
            workerWrapperM4515f = m4515f(str);
        }
        return m4512i(str, workerWrapperM4515f, i);
    }

    /* JADX INFO: renamed from: r */
    public final void m4526r() {
        synchronized (this.f3528k) {
            try {
                if (this.f3523f.isEmpty()) {
                    try {
                        this.f3519b.startService(C0794a.m4601f(this.f3519b));
                    } catch (Throwable th) {
                        qzv.m178829e().mo178835d(f3517l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f3518a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f3518a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m4527s(@NonNull e3g0 e3g0Var, int i) {
        WorkerWrapper workerWrapperM4515f;
        String workSpecId = e3g0Var.getId().getWorkSpecId();
        synchronized (this.f3528k) {
            workerWrapperM4515f = m4515f(workSpecId);
        }
        return m4512i(workSpecId, workerWrapperM4515f, i);
    }

    /* JADX INFO: renamed from: t */
    public boolean m4528t(@NonNull e3g0 e3g0Var, int i) {
        String workSpecId = e3g0Var.getId().getWorkSpecId();
        synchronized (this.f3528k) {
            try {
                if (this.f3523f.get(workSpecId) == null) {
                    Set<e3g0> set = this.f3525h.get(workSpecId);
                    if (set != null && set.contains(e3g0Var)) {
                        return m4512i(workSpecId, m4515f(workSpecId), i);
                    }
                    return false;
                }
                qzv.m178829e().mo178832a(f3517l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
