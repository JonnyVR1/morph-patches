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
import androidx.work.impl.C0775a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p153l.f3g0;
import p153l.piq0;
import p153l.qzv;
import p153l.siq0;
import p153l.tqe0;
import p153l.uiq0;
import p153l.v6f;
import p153l.wtq0;
import p153l.xiq0;
import p153l.xjq0;
import p153l.xop0;
import p153l.zni0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0781d implements v6f {

    /* JADX INFO: renamed from: l */
    public static final String f3562l = qzv.m178831i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a */
    public final Context f3563a;

    /* JADX INFO: renamed from: b */
    public final zni0 f3564b;

    /* JADX INFO: renamed from: c */
    public final xjq0 f3565c;

    /* JADX INFO: renamed from: d */
    public final C0775a f3566d;

    /* JADX INFO: renamed from: e */
    public final xiq0 f3567e;

    /* JADX INFO: renamed from: f */
    public final C0778a f3568f;

    /* JADX INFO: renamed from: g */
    public final List<Intent> f3569g;

    /* JADX INFO: renamed from: h */
    public Intent f3570h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public c f3571i;

    /* JADX INFO: renamed from: j */
    public f3g0 f3572j;

    /* JADX INFO: renamed from: k */
    public final siq0 f3573k;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorMo216345c;
            d dVar;
            synchronized (C0781d.this.f3569g) {
                C0781d c0781d = C0781d.this;
                c0781d.f3570h = c0781d.f3569g.get(0);
            }
            Intent intent = C0781d.this.f3570h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0781d.this.f3570h.getIntExtra("KEY_START_ID", 0);
                qzv qzvVarM178829e = qzv.m178829e();
                String str = C0781d.f3562l;
                qzvVarM178829e.mo178832a(str, "Processing command " + C0781d.this.f3570h + ", " + intExtra);
                PowerManager.WakeLock wakeLockM212478b = xop0.m212478b(C0781d.this.f3563a, action + " (" + intExtra + ")");
                try {
                    qzv.m178829e().mo178832a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockM212478b);
                    wakeLockM212478b.acquire();
                    C0781d c0781d2 = C0781d.this;
                    c0781d2.f3568f.m4544n(c0781d2.f3570h, intExtra, c0781d2);
                    qzv.m178829e().mo178832a(str, "Releasing operation wake lock (" + action + ") " + wakeLockM212478b);
                    wakeLockM212478b.release();
                    executorMo216345c = C0781d.this.f3564b.mo216345c();
                    dVar = new d(C0781d.this);
                } catch (Throwable th) {
                    try {
                        qzv qzvVarM178829e2 = qzv.m178829e();
                        String str2 = C0781d.f3562l;
                        qzvVarM178829e2.mo178835d(str2, "Unexpected error in onHandleIntent", th);
                        qzv.m178829e().mo178832a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockM212478b);
                        wakeLockM212478b.release();
                        executorMo216345c = C0781d.this.f3564b.mo216345c();
                        dVar = new d(C0781d.this);
                    } catch (Throwable th2) {
                        qzv.m178829e().mo178832a(C0781d.f3562l, "Releasing operation wake lock (" + action + ") " + wakeLockM212478b);
                        wakeLockM212478b.release();
                        C0781d.this.f3564b.mo216345c().execute(new d(C0781d.this));
                        throw th2;
                    }
                }
                executorMo216345c.execute(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C0781d f3575a;

        /* JADX INFO: renamed from: b */
        public final Intent f3576b;

        /* JADX INFO: renamed from: c */
        public final int f3577c;

        public b(@NonNull C0781d c0781d, @NonNull Intent intent, int i) {
            this.f3575a = c0781d;
            this.f3576b = intent;
            this.f3577c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3575a.m4555a(this.f3576b, this.f3577c);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$c */
    public interface c {
        void onAllCommandsCompleted();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C0781d f3578a;

        public d(@NonNull C0781d c0781d) {
            this.f3578a = c0781d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3578a.m4557c();
        }
    }

    @VisibleForTesting
    public C0781d(@NonNull Context context, @Nullable C0775a c0775a, @Nullable xiq0 xiq0Var, @Nullable siq0 siq0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f3563a = applicationContext;
        this.f3572j = f3g0.create();
        xiq0Var = xiq0Var == null ? xiq0.m211153p(context) : xiq0Var;
        this.f3567e = xiq0Var;
        this.f3568f = new C0778a(applicationContext, xiq0Var.m211158n().getClock(), this.f3572j);
        this.f3565c = new xjq0(xiq0Var.m211158n().getRunnableScheduler());
        c0775a = c0775a == null ? xiq0Var.m211160r() : c0775a;
        this.f3566d = c0775a;
        zni0 zni0VarM211165w = xiq0Var.m211165w();
        this.f3564b = zni0VarM211165w;
        this.f3573k = siq0Var == null ? new uiq0(c0775a, zni0VarM211165w) : siq0Var;
        c0775a.m4514e(this);
        this.f3569g = new ArrayList();
        this.f3570h = null;
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public boolean m4555a(@NonNull Intent intent, int i) {
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f3562l;
        qzvVarM178829e.mo178832a(str, "Adding command " + intent + " (" + i + ")");
        m4556b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            qzv.m178829e().mo178839k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m4563i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f3569g) {
            try {
                boolean zIsEmpty = this.f3569g.isEmpty();
                this.f3569g.add(intent);
                if (zIsEmpty) {
                    m4565k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m4556b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        wtq0.m207906a("Needs to be invoked on the main thread.");
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public void m4557c() {
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f3562l;
        qzvVarM178829e.mo178832a(str, "Checking if commands are complete.");
        m4556b();
        synchronized (this.f3569g) {
            try {
                if (this.f3570h != null) {
                    qzv.m178829e().mo178832a(str, "Removing command " + this.f3570h);
                    if (!this.f3569g.remove(0).equals(this.f3570h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f3570h = null;
                }
                tqe0 tqe0VarMo216346d = this.f3564b.mo216346d();
                if (!this.f3568f.m4543m() && this.f3569g.isEmpty() && !tqe0VarMo216346d.mo192279B()) {
                    qzv.m178829e().mo178832a(str, "No more commands & intents.");
                    c cVar = this.f3571i;
                    if (cVar != null) {
                        cVar.onAllCommandsCompleted();
                    }
                } else if (!this.f3569g.isEmpty()) {
                    m4565k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public C0775a m4558d() {
        return this.f3566d;
    }

    /* JADX INFO: renamed from: e */
    public zni0 m4559e() {
        return this.f3564b;
    }

    /* JADX INFO: renamed from: f */
    public xiq0 m4560f() {
        return this.f3567e;
    }

    /* JADX INFO: renamed from: g */
    public xjq0 m4561g() {
        return this.f3565c;
    }

    /* JADX INFO: renamed from: h */
    public siq0 m4562h() {
        return this.f3573k;
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final boolean m4563i(@NonNull String str) {
        m4556b();
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
    public void m4564j() {
        qzv.m178829e().mo178832a(f3562l, "Destroying SystemAlarmDispatcher");
        this.f3566d.m4521m(this);
        this.f3571i = null;
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public final void m4565k() {
        m4556b();
        PowerManager.WakeLock wakeLockM212478b = xop0.m212478b(this.f3563a, "ProcessCommand");
        try {
            wakeLockM212478b.acquire();
            this.f3567e.m211165w().m220600b(new a());
        } finally {
            wakeLockM212478b.release();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m4566l(@NonNull c cVar) {
        if (this.f3571i != null) {
            qzv.m178829e().mo178834c(f3562l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.f3571i = cVar;
        }
    }

    @Override // p153l.v6f
    public void onExecuted(@NonNull piq0 piq0Var, boolean z) {
        this.f3564b.mo216345c().execute(new b(this, C0778a.m4531c(this.f3563a, piq0Var, z), 0));
    }

    public C0781d(@NonNull Context context) {
        this(context, null, null, null);
    }
}
