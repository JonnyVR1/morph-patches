package p149l;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC0768h;
import androidx.work.C0761a;
import androidx.work.C0763c;
import androidx.work.C0766f;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.InterfaceC0764d;
import androidx.work.WorkManager;
import androidx.work.impl.C0773a;
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
public class s9q0 extends WorkManager {

    /* JADX INFO: renamed from: l */
    public static final String f163211l = txv.m190978i("WorkManagerImpl");

    /* JADX INFO: renamed from: m */
    public static s9q0 f163212m = null;

    /* JADX INFO: renamed from: n */
    public static s9q0 f163213n = null;

    /* JADX INFO: renamed from: o */
    public static final Object f163214o = new Object();

    /* JADX INFO: renamed from: a */
    public Context f163215a;

    /* JADX INFO: renamed from: b */
    public C0761a f163216b;

    /* JADX INFO: renamed from: c */
    public WorkDatabase f163217c;

    /* JADX INFO: renamed from: d */
    public zei0 f163218d;

    /* JADX INFO: renamed from: e */
    public List<dud0> f163219e;

    /* JADX INFO: renamed from: f */
    public C0773a f163220f;

    /* JADX INFO: renamed from: g */
    public bi80 f163221g;

    /* JADX INFO: renamed from: h */
    public boolean f163222h = false;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f163223i;

    /* JADX INFO: renamed from: j */
    public final b7j0 f163224j;

    /* JADX INFO: renamed from: k */
    public final ppb f163225k;

    /* JADX INFO: renamed from: l.s9q0$a */
    @RequiresApi(24)
    public static class C19874a {
        /* JADX INFO: renamed from: a */
        public static boolean m182756a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public s9q0(@NonNull Context context, @NonNull C0761a c0761a, @NonNull zei0 zei0Var, @NonNull WorkDatabase workDatabase, @NonNull List<dud0> list, @NonNull C0773a c0773a, @NonNull b7j0 b7j0Var) {
        Context applicationContext = context.getApplicationContext();
        if (C19874a.m182756a(applicationContext)) {
            qkq0.m175383a("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        txv.m190977h(new txv.C20308a(c0761a.getMinimumLoggingLevel()));
        this.f163215a = applicationContext;
        this.f163218d = zei0Var;
        this.f163217c = workDatabase;
        this.f163220f = c0773a;
        this.f163224j = b7j0Var;
        this.f163216b = c0761a;
        this.f163219e = list;
        ppb ppbVarM4456f = WorkManagerImplExtKt.m4456f(zei0Var);
        this.f163225k = ppbVarM4456f;
        this.f163221g = new bi80(this.f163217c);
        jud0.m143287e(list, this.f163220f, zei0Var.mo187638d(), this.f163217c, c0761a);
        this.f163218d.m218342b(new ForceStopRunnable(applicationContext, this));
        UnfinishedWorkListenerKt.m4448c(ppbVarM4456f, this.f163215a, c0761a, workDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: i */
    public static void m182737i(@NonNull Context context, @NonNull C0761a c0761a) {
        synchronized (f163214o) {
            try {
                s9q0 s9q0Var = f163212m;
                if (s9q0Var != null && f163213n != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (s9q0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f163213n == null) {
                        f163213n = WorkManagerImplExtKt.m4453c(applicationContext, c0761a);
                    }
                    f163212m = f163213n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Unit m182738j(s9q0 s9q0Var) {
        mhh0.m154622a(s9q0Var.m182744m());
        s9q0Var.m182750u().workSpecDao().mo135191w();
        jud0.m143288f(s9q0Var.m182745n(), s9q0Var.m182750u(), s9q0Var.m182748s());
        return Unit.INSTANCE;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Deprecated
    /* JADX INFO: renamed from: o */
    public static s9q0 m182739o() {
        synchronized (f163214o) {
            try {
                s9q0 s9q0Var = f163212m;
                if (s9q0Var != null) {
                    return s9q0Var;
                }
                return f163213n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: p */
    public static s9q0 m182740p(@NonNull Context context) {
        s9q0 s9q0VarM182739o;
        synchronized (f163214o) {
            try {
                s9q0VarM182739o = m182739o();
                if (s9q0VarM182739o == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof C0761a.c)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    m182737i(applicationContext, ((C0761a.c) applicationContext).m4411a());
                    s9q0VarM182739o = m182740p(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s9q0VarM182739o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: A */
    public void m182741A(@NonNull k9q0 k9q0Var, int i) {
        this.f163218d.m218342b(new hxf0(this.f163220f, new vuf0(k9q0Var), true, i));
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC0764d mo4349a(@NonNull String str) {
        return CancelWorkRunnable.m4615h(str, this);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: b */
    public InterfaceC0764d mo4350b(@NonNull String str) {
        return CancelWorkRunnable.m4613f(str, this);
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: d */
    public InterfaceC0764d mo4352d(@NonNull List<? extends AbstractC0768h> list) {
        if (!list.isEmpty()) {
            return new v8q0(this, list).m197483b();
        }
        ig3.m135964a("enqueue needs at least one WorkRequest.");
        return null;
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: e */
    public InterfaceC0764d mo4353e(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull C0766f c0766f) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? WorkerUpdater.m4459c(this, str, c0766f) : m182743l(str, existingPeriodicWorkPolicy, c0766f).m197483b();
    }

    @Override // androidx.work.WorkManager
    @NonNull
    /* JADX INFO: renamed from: g */
    public InterfaceC0764d mo4355g(@NonNull String str, @NonNull ExistingWorkPolicy existingWorkPolicy, @NonNull List<C0763c> list) {
        return new v8q0(this, str, existingWorkPolicy, list).m197483b();
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public InterfaceC0764d m182742k(@NonNull UUID uuid) {
        return CancelWorkRunnable.m4612e(uuid, this);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public v8q0 m182743l(@NonNull String str, @NonNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NonNull C0766f c0766f) {
        return new v8q0(this, str, existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.KEEP ? ExistingWorkPolicy.KEEP : ExistingWorkPolicy.REPLACE, Collections.singletonList(c0766f));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: m */
    public Context m182744m() {
        return this.f163215a;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C0761a m182745n() {
        return this.f163216b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    public bi80 m182746q() {
        return this.f163221g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: r */
    public C0773a m182747r() {
        return this.f163220f;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: s */
    public List<dud0> m182748s() {
        return this.f163219e;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: t */
    public b7j0 m182749t() {
        return this.f163224j;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: u */
    public WorkDatabase m182750u() {
        return this.f163217c;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public ppb m182751v() {
        return this.f163225k;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: w */
    public zei0 m182752w() {
        return this.f163218d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: x */
    public void m182753x() {
        synchronized (f163214o) {
            try {
                this.f163222h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f163223i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f163223i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m182754y() {
        r5j0.m177945a(m182745n().getTracer(), "ReschedulingWork", new Function0() { // from class: l.r9q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s9q0.m182738j(this.f158427a);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: z */
    public void m182755z(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f163214o) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f163223i;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f163223i = pendingResult;
                if (this.f163222h) {
                    pendingResult.finish();
                    this.f163223i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
