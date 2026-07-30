package p153l;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0770h;
import androidx.work.C0763a;
import androidx.work.C0765c;
import androidx.work.C0768f;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0766d;
import androidx.work.WorkManager;
import androidx.work.impl.C0775a;
import androidx.work.impl.UnfinishedWorkListenerKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImplExtKt;
import androidx.work.impl.WorkerUpdater;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class xiq0 extends WorkManager {

    /* JADX INFO: renamed from: l */
    public static final String f194477l = qzv.m178831i("WorkManagerImpl");

    /* JADX INFO: renamed from: m */
    public static xiq0 f194478m = null;

    /* JADX INFO: renamed from: n */
    public static xiq0 f194479n = null;

    /* JADX INFO: renamed from: o */
    public static final Object f194480o = new Object();

    /* JADX INFO: renamed from: a */
    public Context f194481a;

    /* JADX INFO: renamed from: b */
    public C0763a f194482b;

    /* JADX INFO: renamed from: c */
    public WorkDatabase f194483c;

    /* JADX INFO: renamed from: d */
    public zni0 f194484d;

    /* JADX INFO: renamed from: e */
    public List<h2e0> f194485e;

    /* JADX INFO: renamed from: f */
    public C0775a f194486f;

    /* JADX INFO: renamed from: g */
    public gq80 f194487g;

    /* JADX INFO: renamed from: h */
    public boolean f194488h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f194489i;

    /* JADX INFO: renamed from: j */
    public final fgj0 f194490j;

    /* JADX INFO: renamed from: k */
    public final drb f194491k;

    /* JADX INFO: renamed from: l.xiq0$a */
    @RequiresApi(24)
    public static class C21347a {
        /* JADX INFO: renamed from: a */
        public static boolean m211169a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public xiq0(@NonNull Context context, @NonNull C0763a c0763a, @NonNull zni0 zni0Var, @NonNull WorkDatabase workDatabase, @NonNull List<h2e0> list, @NonNull C0775a c0775a, @NonNull fgj0 fgj0Var) {
        Context applicationContext = context.getApplicationContext();
        if (C21347a.m211169a(applicationContext)) {
            wtq0.m207906a("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        qzv.m178830h(new qzv.C19700a(c0763a.getMinimumLoggingLevel()));
        this.f194481a = applicationContext;
        this.f194484d = zni0Var;
        this.f194483c = workDatabase;
        this.f194486f = c0775a;
        this.f194490j = fgj0Var;
        this.f194482b = c0763a;
        this.f194485e = list;
        drb drbVarM4458f = WorkManagerImplExtKt.m4458f(zni0Var);
        this.f194491k = drbVarM4458f;
        this.f194487g = new gq80(this.f194483c);
        n2e0.m161225e(list, this.f194486f, zni0Var.mo216346d(), this.f194483c, c0763a);
        this.f194484d.m220600b(new ForceStopRunnable(applicationContext, this));
        UnfinishedWorkListenerKt.m4450c(drbVarM4458f, this.f194481a, c0763a, workDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public static void m211150i(@NonNull Context context, @NonNull C0763a c0763a) {
        synchronized (f194480o) {
            try {
                xiq0 xiq0Var = f194478m;
                if (xiq0Var != null && f194479n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (xiq0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f194479n == null) {
                        f194479n = WorkManagerImplExtKt.m4455c(applicationContext, c0763a);
                    }
                    f194478m = f194479n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Unit m211151j(xiq0 xiq0Var) {
        tph0.m192132a(xiq0Var.m211157m());
        xiq0Var.m211163u().workSpecDao().mo163458w();
        n2e0.m161226f(xiq0Var.m211158n(), xiq0Var.m211163u(), xiq0Var.m211161s());
        return Unit.INSTANCE;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    /* JADX INFO: renamed from: o */
    public static xiq0 m211152o() {
        synchronized (f194480o) {
            try {
                xiq0 xiq0Var = f194478m;
                if (xiq0Var != null) {
                    return xiq0Var;
                }
                return f194479n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    public static xiq0 m211153p(@NonNull Context context) {
        xiq0 xiq0VarM211152o;
        synchronized (f194480o) {
            try {
                xiq0VarM211152o = m211152o();
                if (xiq0VarM211152o == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof C0763a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    m211150i(applicationContext, ((C0763a.c) applicationContext).m4413a());
                    xiq0VarM211152o = m211153p(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xiq0VarM211152o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: A */
    public void m211154A(@NonNull piq0 piq0Var, int i) {
        this.f194484d.m220600b(new r5g0(this.f194486f, new e3g0(piq0Var), true, i));
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0766d mo4351a(@NonNull String str) {
        return CancelWorkRunnable.m4617h(str, this);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC0766d mo4352b(@NonNull String str) {
        return CancelWorkRunnable.m4615f(str, this);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: d */
    public InterfaceC0766d mo4354d(@NonNull List<? extends AbstractC0770h> list) {
        if (!list.isEmpty()) {
            return new aiq0(this, list).m98015b();
        }
        wg3.m206174a("enqueue needs at least one WorkRequest.");
        return null;
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: e */
    public InterfaceC0766d mo4355e(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull C0768f c0768f) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? WorkerUpdater.m4461c(this, str, c0768f) : m211156l(str, existingPeriodicWorkPolicy, c0768f).m98015b();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: g */
    public InterfaceC0766d mo4357g(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<C0765c> list) {
        return new aiq0(this, str, existingWorkPolicy, list).m98015b();
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public InterfaceC0766d m211155k(@NonNull UUID uuid) {
        return CancelWorkRunnable.m4614e(uuid, this);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public aiq0 m211156l(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull C0768f c0768f) {
        return new aiq0(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(c0768f));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public Context m211157m() {
        return this.f194481a;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C0763a m211158n() {
        return this.f194482b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    public gq80 m211159q() {
        return this.f194487g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: r */
    public C0775a m211160r() {
        return this.f194486f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: s */
    public List<h2e0> m211161s() {
        return this.f194485e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: t */
    public fgj0 m211162t() {
        return this.f194490j;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: u */
    public WorkDatabase m211163u() {
        return this.f194483c;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public drb m211164v() {
        return this.f194491k;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: w */
    public zni0 m211165w() {
        return this.f194484d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: x */
    public void m211166x() {
        synchronized (f194480o) {
            try {
                this.f194488h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f194489i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f194489i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m211167y() {
        vej0.m201067a(m211158n().getTracer(), "ReschedulingWork", new Function0() { // from class: l.wiq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return xiq0.m211151j(this.f189380a);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: z */
    public void m211168z(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f194480o) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f194489i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f194489i = pendingResult;
                if (this.f194488h) {
                    pendingResult.finish();
                    this.f194489i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
