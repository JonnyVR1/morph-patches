package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.C0773a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p149l.k9q0;
import p149l.n9q0;
import p149l.oie0;
import p149l.p9q0;
import p149l.qkq0;
import p149l.r5f;
import p149l.s9q0;
import p149l.saq0;
import p149l.tfp0;
import p149l.txv;
import p149l.wuf0;
import p149l.zei0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0779d implements r5f {

    /* JADX INFO: renamed from: l */
    public static final String f3562l = txv.m190978i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a */
    public final Context f3563a;

    /* JADX INFO: renamed from: b */
    public final zei0 f3564b;

    /* JADX INFO: renamed from: c */
    public final saq0 f3565c;

    /* JADX INFO: renamed from: d */
    public final C0773a f3566d;

    /* JADX INFO: renamed from: e */
    public final s9q0 f3567e;

    /* JADX INFO: renamed from: f */
    public final C0776a f3568f;

    /* JADX INFO: renamed from: g */
    public final List<Intent> f3569g;

    /* JADX INFO: renamed from: h */
    public Intent f3570h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public c f3571i;

    /* JADX INFO: renamed from: j */
    public wuf0 f3572j;

    /* JADX INFO: renamed from: k */
    public final n9q0 f3573k;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorMo187637c;
            d dVar;
            synchronized (C0779d.this.f3569g) {
                C0779d c0779d = C0779d.this;
                c0779d.f3570h = c0779d.f3569g.get(0);
            }
            Intent intent = C0779d.this.f3570h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0779d.this.f3570h.getIntExtra("KEY_START_ID", 0);
                txv txvVarM190976e = txv.m190976e();
                String str = C0779d.f3562l;
                txvVarM190976e.mo190979a(str, "Processing command " + C0779d.this.f3570h + ", " + intExtra);
                PowerManager.WakeLock wakeLockM188751b = tfp0.m188751b(C0779d.this.f3563a, action + " (" + intExtra + ")");
                try {
                    txv.m190976e().mo190979a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockM188751b);
                    wakeLockM188751b.acquire();
                    C0779d c0779d2 = C0779d.this;
                    c0779d2.f3568f.m4542n(c0779d2.f3570h, intExtra, c0779d2);
                    txv.m190976e().mo190979a(str, "Releasing operation wake lock (" + action + ") " + wakeLockM188751b);
                    wakeLockM188751b.release();
                    executorMo187637c = C0779d.this.f3564b.mo187637c();
                    dVar = new d(C0779d.this);
                } catch (Throwable th) {
                    try {
                        txv txvVarM190976e2 = txv.m190976e();
                        String str2 = C0779d.f3562l;
                        txvVarM190976e2.mo190982d(str2, "Unexpected error in onHandleIntent", th);
                        txv.m190976e().mo190979a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockM188751b);
                        wakeLockM188751b.release();
                        executorMo187637c = C0779d.this.f3564b.mo187637c();
                        dVar = new d(C0779d.this);
                    } catch (Throwable th2) {
                        txv.m190976e().mo190979a(C0779d.f3562l, "Releasing operation wake lock (" + action + ") " + wakeLockM188751b);
                        wakeLockM188751b.release();
                        C0779d.this.f3564b.mo187637c().execute(new d(C0779d.this));
                        throw th2;
                    }
                }
                executorMo187637c.execute(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C0779d f3575a;

        /* JADX INFO: renamed from: b */
        public final Intent f3576b;

        /* JADX INFO: renamed from: c */
        public final int f3577c;

        public b(@NonNull C0779d c0779d, @NonNull Intent intent, int i) {
            this.f3575a = c0779d;
            this.f3576b = intent;
            this.f3577c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3575a.m4553a(this.f3576b, this.f3577c);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface c {
        void onAllCommandsCompleted();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C0779d f3578a;

        public d(@NonNull C0779d c0779d) {
            this.f3578a = c0779d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3578a.m4555c();
        }
    }

    @VisibleForTesting
    public C0779d(@NonNull Context context, @Nullable C0773a c0773a, @Nullable s9q0 s9q0Var, @Nullable n9q0 n9q0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f3563a = applicationContext;
        this.f3572j = wuf0.create();
        s9q0Var = s9q0Var == null ? s9q0.m182740p(context) : s9q0Var;
        this.f3567e = s9q0Var;
        this.f3568f = new C0776a(applicationContext, s9q0Var.m182745n().getClock(), this.f3572j);
        this.f3565c = new saq0(s9q0Var.m182745n().getRunnableScheduler());
        c0773a = c0773a == null ? s9q0Var.m182747r() : c0773a;
        this.f3566d = c0773a;
        zei0 zei0VarM182752w = s9q0Var.m182752w();
        this.f3564b = zei0VarM182752w;
        this.f3573k = n9q0Var == null ? new p9q0(c0773a, zei0VarM182752w) : n9q0Var;
        c0773a.m4512e(this);
        this.f3569g = new ArrayList();
        this.f3570h = null;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public boolean m4553a(@NonNull Intent intent, int i) {
        txv txvVarM190976e = txv.m190976e();
        String str = f3562l;
        txvVarM190976e.mo190979a(str, "Adding command " + intent + " (" + i + ")");
        m4554b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            txv.m190976e().mo190986k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4561i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f3569g) {
            try {
                boolean zIsEmpty = this.f3569g.isEmpty();
                this.f3569g.add(intent);
                if (zIsEmpty) {
                    m4563k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4554b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qkq0.m175383a("Needs to be invoked on the main thread.");
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m4555c() {
        txv txvVarM190976e = txv.m190976e();
        String str = f3562l;
        txvVarM190976e.mo190979a(str, "Checking if commands are complete.");
        m4554b();
        synchronized (this.f3569g) {
            try {
                if (this.f3570h != null) {
                    txv.m190976e().mo190979a(str, "Removing command " + this.f3570h);
                    if (!this.f3569g.remove(0).equals(this.f3570h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f3570h = null;
                }
                oie0 oie0VarMo187638d = this.f3564b.mo187638d();
                if (!this.f3568f.m4541m() && this.f3569g.isEmpty() && !oie0VarMo187638d.mo164507B()) {
                    txv.m190976e().mo190979a(str, "No more commands & intents.");
                    c cVar = this.f3571i;
                    if (cVar != null) {
                        cVar.onAllCommandsCompleted();
                    }
                } else if (!this.f3569g.isEmpty()) {
                    m4563k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C0773a m4556d() {
        return this.f3566d;
    }

    /* JADX INFO: renamed from: e */
    public zei0 m4557e() {
        return this.f3564b;
    }

    /* JADX INFO: renamed from: f */
    public s9q0 m4558f() {
        return this.f3567e;
    }

    /* JADX INFO: renamed from: g */
    public saq0 m4559g() {
        return this.f3565c;
    }

    /* JADX INFO: renamed from: h */
    public n9q0 m4560h() {
        return this.f3573k;
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final boolean m4561i(@NonNull String str) {
        m4554b();
        synchronized (this.f3569g) {
            try {
                Iterator<Intent> it = this.f3569g.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4562j() {
        txv.m190976e().mo190979a(f3562l, "Destroying SystemAlarmDispatcher");
        this.f3566d.m4519m(this);
        this.f3571i = null;
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public final void m4563k() {
        m4554b();
        PowerManager.WakeLock wakeLockM188751b = tfp0.m188751b(this.f3563a, "ProcessCommand");
        try {
            wakeLockM188751b.acquire();
            this.f3567e.m182752w().m218342b(new a());
        } finally {
            wakeLockM188751b.release();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m4564l(@NonNull c cVar) {
        if (this.f3571i != null) {
            txv.m190976e().mo190981c(f3562l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f3571i = cVar;
        }
    }

    @Override // p149l.r5f
    public void onExecuted(@NonNull k9q0 k9q0Var, boolean z) {
        this.f3564b.mo187637c().execute(new b(this, C0776a.m4529c(this.f3563a, k9q0Var, z), 0));
    }

    public C0779d(@NonNull Context context) {
        this(context, null, null, null);
    }
}
