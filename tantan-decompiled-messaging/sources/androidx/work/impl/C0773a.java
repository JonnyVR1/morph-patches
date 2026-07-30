package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0761a;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0773a;
import androidx.work.impl.foreground.C0792a;
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
import p149l.e16;
import p149l.gnr;
import p149l.haq0;
import p149l.k9q0;
import p149l.nyi;
import p149l.oyi;
import p149l.r5f;
import p149l.tfp0;
import p149l.txv;
import p149l.vuf0;
import p149l.zei0;

/* JADX INFO: renamed from: androidx.work.impl.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0773a implements oyi {

    /* JADX INFO: renamed from: l */
    public static final String f3517l = txv.m190978i("Processor");

    /* JADX INFO: renamed from: b */
    public Context f3519b;

    /* JADX INFO: renamed from: c */
    public C0761a f3520c;

    /* JADX INFO: renamed from: d */
    public zei0 f3521d;

    /* JADX INFO: renamed from: e */
    public WorkDatabase f3522e;

    /* JADX INFO: renamed from: g */
    public Map<String, WorkerWrapper> f3524g = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, WorkerWrapper> f3523f = new HashMap();

    /* JADX INFO: renamed from: i */
    public Set<String> f3526i = new HashSet();

    /* JADX INFO: renamed from: j */
    public final List<r5f> f3527j = new ArrayList();

    /* JADX INFO: renamed from: a */
    @Nullable
    public PowerManager.WakeLock f3518a = null;

    /* JADX INFO: renamed from: k */
    public final Object f3528k = new Object();

    /* JADX INFO: renamed from: h */
    public Map<String, Set<vuf0>> f3525h = new HashMap();

    public C0773a(@NonNull Context context, @NonNull C0761a c0761a, @NonNull zei0 zei0Var, @NonNull WorkDatabase workDatabase) {
        this.f3519b = context;
        this.f3520c = c0761a;
        this.f3521d = zei0Var;
        this.f3522e = workDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ haq0 m4507b(C0773a c0773a, ArrayList arrayList, String str) {
        arrayList.addAll(c0773a.f3522e.workTagDao().mo173772c(str));
        return c0773a.f3522e.workSpecDao().mo135190v(str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4508c(C0773a c0773a, k9q0 k9q0Var, boolean z) {
        synchronized (c0773a.f3528k) {
            try {
                Iterator<r5f> it = c0773a.f3527j.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(k9q0Var, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m4509d(C0773a c0773a, gnr gnrVar, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        c0773a.getClass();
        try {
            zBooleanValue = ((Boolean) gnrVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c0773a.m4518l(workerWrapper, zBooleanValue);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4510i(@NonNull String str, @Nullable WorkerWrapper workerWrapper, int i) {
        if (workerWrapper == null) {
            txv.m190976e().mo190979a(f3517l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.m4475o(i);
        txv.m190976e().mo190979a(f3517l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // p149l.oyi
    /* JADX INFO: renamed from: a */
    public void mo4511a(@NonNull String str, @NonNull nyi nyiVar) {
        synchronized (this.f3528k) {
            try {
                txv.m190976e().mo190983f(f3517l, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapperRemove = this.f3524g.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.f3518a == null) {
                        PowerManager.WakeLock wakeLockM188751b = tfp0.m188751b(this.f3519b, "ProcessorForegroundLck");
                        this.f3518a = wakeLockM188751b;
                        wakeLockM188751b.acquire();
                    }
                    this.f3523f.put(str, workerWrapperRemove);
                    e16.m114387o(this.f3519b, C0792a.m4598e(this.f3519b, workerWrapperRemove.m4472l(), nyiVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m4512e(@NonNull r5f r5fVar) {
        synchronized (this.f3528k) {
            this.f3527j.add(r5fVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final WorkerWrapper m4513f(@NonNull String str) {
        WorkerWrapper workerWrapperRemove = this.f3523f.remove(str);
        boolean z = workerWrapperRemove != null;
        if (!z) {
            workerWrapperRemove = this.f3524g.remove(str);
        }
        this.f3525h.remove(str);
        if (z) {
            m4524r();
        }
        return workerWrapperRemove;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public haq0 m4514g(@NonNull String str) {
        synchronized (this.f3528k) {
            try {
                WorkerWrapper workerWrapperM4515h = m4515h(str);
                if (workerWrapperM4515h == null) {
                    return null;
                }
                return workerWrapperM4515h.getWorkSpec();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final WorkerWrapper m4515h(@NonNull String str) {
        WorkerWrapper workerWrapper = this.f3523f.get(str);
        return workerWrapper == null ? this.f3524g.get(str) : workerWrapper;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4516j(@NonNull String str) {
        boolean zContains;
        synchronized (this.f3528k) {
            zContains = this.f3526i.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: renamed from: k */
    public boolean m4517k(@NonNull String str) {
        boolean z;
        synchronized (this.f3528k) {
            z = m4515h(str) != null;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public final void m4518l(@NonNull WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.f3528k) {
            try {
                k9q0 k9q0VarM4472l = workerWrapper.m4472l();
                String workSpecId = k9q0VarM4472l.getWorkSpecId();
                if (m4515h(workSpecId) == workerWrapper) {
                    m4513f(workSpecId);
                }
                txv.m190976e().mo190979a(f3517l, getClass().getSimpleName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + workSpecId + " executed; reschedule = " + z);
                Iterator<r5f> it = this.f3527j.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(k9q0VarM4472l, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m4519m(@NonNull r5f r5fVar) {
        synchronized (this.f3528k) {
            this.f3527j.remove(r5fVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4520n(@NonNull final k9q0 k9q0Var, final boolean z) {
        this.f3521d.mo187637c().execute(new Runnable() { // from class: l.qc90
            @Override // java.lang.Runnable
            public final void run() {
                C0773a.m4508c(this.f153733a, k9q0Var, z);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public boolean m4521o(@NonNull vuf0 vuf0Var) {
        return m4522p(vuf0Var, null);
    }

    /* JADX INFO: renamed from: p */
    public boolean m4522p(@NonNull vuf0 vuf0Var, @Nullable WorkerParameters.C0760a c0760a) {
        k9q0 id = vuf0Var.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        haq0 haq0Var = (haq0) this.f3522e.runInTransaction(new Callable() { // from class: l.oc90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0773a.m4507b(this.f143021a, arrayList, workSpecId);
            }
        });
        if (haq0Var == null) {
            txv.m190976e().mo190986k(f3517l, "Didn't find WorkSpec for id " + id);
            m4520n(id, false);
            return false;
        }
        synchronized (this.f3528k) {
            try {
                if (m4517k(workSpecId)) {
                    Set<vuf0> set = this.f3525h.get(workSpecId);
                    if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                        set.add(vuf0Var);
                        txv.m190976e().mo190979a(f3517l, "Work " + id + " is already enqueued for processing");
                    } else {
                        m4520n(id, false);
                    }
                    return false;
                }
                if (haq0Var.getGeneration() != id.getGeneration()) {
                    m4520n(id, false);
                    return false;
                }
                final WorkerWrapper workerWrapperM4486a = new WorkerWrapper.C0771a(this.f3519b, this.f3520c, this.f3521d, this, this.f3522e, haq0Var, arrayList).m4496k(c0760a).m4486a();
                final gnr<Boolean> gnrVarM4477q = workerWrapperM4486a.m4477q();
                gnrVarM4477q.addListener(new Runnable() { // from class: l.pc90
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0773a.m4509d(this.f148158a, gnrVarM4477q, workerWrapperM4486a);
                    }
                }, this.f3521d.mo187637c());
                this.f3524g.put(workSpecId, workerWrapperM4486a);
                HashSet hashSet = new HashSet();
                hashSet.add(vuf0Var);
                this.f3525h.put(workSpecId, hashSet);
                txv.m190976e().mo190979a(f3517l, getClass().getSimpleName() + ": processing " + id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m4523q(@NonNull String str, int i) {
        WorkerWrapper workerWrapperM4513f;
        synchronized (this.f3528k) {
            txv.m190976e().mo190979a(f3517l, "Processor cancelling " + str);
            this.f3526i.add(str);
            workerWrapperM4513f = m4513f(str);
        }
        return m4510i(str, workerWrapperM4513f, i);
    }

    /* JADX INFO: renamed from: r */
    public final void m4524r() {
        synchronized (this.f3528k) {
            try {
                if (this.f3523f.isEmpty()) {
                    try {
                        this.f3519b.startService(C0792a.m4599f(this.f3519b));
                    } catch (Throwable th) {
                        txv.m190976e().mo190982d(f3517l, "Unable to stop foreground service", th);
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
    public boolean m4525s(@NonNull vuf0 vuf0Var, int i) {
        WorkerWrapper workerWrapperM4513f;
        String workSpecId = vuf0Var.getId().getWorkSpecId();
        synchronized (this.f3528k) {
            workerWrapperM4513f = m4513f(workSpecId);
        }
        return m4510i(workSpecId, workerWrapperM4513f, i);
    }

    /* JADX INFO: renamed from: t */
    public boolean m4526t(@NonNull vuf0 vuf0Var, int i) {
        String workSpecId = vuf0Var.getId().getWorkSpecId();
        synchronized (this.f3528k) {
            try {
                if (this.f3523f.get(workSpecId) == null) {
                    Set<vuf0> set = this.f3525h.get(workSpecId);
                    if (set != null && set.contains(vuf0Var)) {
                        return m4510i(workSpecId, m4513f(workSpecId), i);
                    }
                    return false;
                }
                txv.m190976e().mo190979a(f3517l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
