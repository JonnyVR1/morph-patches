package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.e3g0;
import p153l.f3g0;
import p153l.hh0;
import p153l.mjq0;
import p153l.piq0;
import p153l.qzv;
import p153l.sa5;
import p153l.v6f;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0778a implements v6f {

    /* JADX INFO: renamed from: f */
    public static final String f3535f = qzv.m178831i("CommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3536a;

    /* JADX INFO: renamed from: b */
    public final Map<piq0, C0780c> f3537b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f3538c = new Object();

    /* JADX INFO: renamed from: d */
    public final sa5 f3539d;

    /* JADX INFO: renamed from: e */
    public final f3g0 f3540e;

    public C0778a(@NonNull Context context, sa5 sa5Var, @NonNull f3g0 f3g0Var) {
        this.f3536a = context;
        this.f3539d = sa5Var;
        this.f3540e = f3g0Var;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m4529a(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m4530b(@NonNull Context context, @NonNull piq0 piq0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m4536p(intent, piq0Var);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m4531c(@NonNull Context context, @NonNull piq0 piq0Var, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return m4536p(intent, piq0Var);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m4532d(@NonNull Context context, @NonNull piq0 piq0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m4536p(intent, piq0Var);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m4533e(@NonNull Context context, @NonNull piq0 piq0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m4536p(intent, piq0Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4534l(@Nullable Bundle bundle, @NonNull String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static piq0 m4535o(@NonNull Intent intent) {
        return new piq0(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: p */
    public static Intent m4536p(@NonNull Intent intent, @NonNull piq0 piq0Var) {
        intent.putExtra("KEY_WORKSPEC_ID", piq0Var.getWorkSpecId());
        intent.putExtra("KEY_WORKSPEC_GENERATION", piq0Var.getGeneration());
        return intent;
    }

    /* JADX INFO: renamed from: f */
    public final void m4537f(@NonNull Intent intent, int i, @NonNull C0781d c0781d) {
        qzv.m178829e().mo178832a(f3535f, "Handling constraints changed " + intent);
        new C0779b(this.f3536a, this.f3539d, i, c0781d).m4545a();
    }

    /* JADX INFO: renamed from: g */
    public final void m4538g(@NonNull Intent intent, int i, @NonNull C0781d c0781d) {
        synchronized (this.f3538c) {
            try {
                piq0 piq0VarM4535o = m4535o(intent);
                qzv qzvVarM178829e = qzv.m178829e();
                String str = f3535f;
                qzvVarM178829e.mo178832a(str, "Handing delay met for " + piq0VarM4535o);
                if (this.f3537b.containsKey(piq0VarM4535o)) {
                    qzv.m178829e().mo178832a(str, "WorkSpec " + piq0VarM4535o + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    C0780c c0780c = new C0780c(this.f3536a, i, c0781d, this.f3540e.mo123733a(piq0VarM4535o));
                    this.f3537b.put(piq0VarM4535o, c0780c);
                    c0780c.m4551f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4539h(@NonNull Intent intent, int i) {
        piq0 piq0VarM4535o = m4535o(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        qzv.m178829e().mo178832a(f3535f, "Handling onExecutionCompleted " + intent + ", " + i);
        onExecuted(piq0VarM4535o, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m4540i(@NonNull Intent intent, int i, @NonNull C0781d c0781d) {
        qzv.m178829e().mo178832a(f3535f, "Handling reschedule " + intent + ", " + i);
        c0781d.m4560f().m211167y();
    }

    /* JADX INFO: renamed from: j */
    public final void m4541j(@NonNull Intent intent, int i, @NonNull C0781d c0781d) {
        piq0 piq0VarM4535o = m4535o(intent);
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f3535f;
        qzvVarM178829e.mo178832a(str, "Handling schedule work for " + piq0VarM4535o);
        WorkDatabase workDatabaseM211163u = c0781d.m4560f().m211163u();
        workDatabaseM211163u.beginTransaction();
        try {
            mjq0 mjq0VarMo163457v = workDatabaseM211163u.workSpecDao().mo163457v(piq0VarM4535o.getWorkSpecId());
            if (mjq0VarMo163457v == null) {
                qzv.m178829e().mo178839k(str, "Skipping scheduling " + piq0VarM4535o + " because it's no longer in the DB");
                return;
            }
            if (mjq0VarMo163457v.state.isFinished()) {
                qzv.m178829e().mo178839k(str, "Skipping scheduling " + piq0VarM4535o + "because it is finished.");
                return;
            }
            long jM158599b = mjq0VarMo163457v.m158599b();
            if (mjq0VarMo163457v.m158607k()) {
                qzv.m178829e().mo178832a(str, "Opportunistically setting an alarm for " + piq0VarM4535o + "at " + jM158599b);
                hh0.m135008c(this.f3536a, workDatabaseM211163u, piq0VarM4535o, jM158599b);
                c0781d.m4559e().mo216345c().execute(new C0781d.b(c0781d, m4529a(this.f3536a), i));
            } else {
                qzv.m178829e().mo178832a(str, "Setting up Alarms for " + piq0VarM4535o + "at " + jM158599b);
                hh0.m135008c(this.f3536a, workDatabaseM211163u, piq0VarM4535o, jM158599b);
            }
            workDatabaseM211163u.setTransactionSuccessful();
        } finally {
            workDatabaseM211163u.endTransaction();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4542k(@NonNull Intent intent, @NonNull C0781d c0781d) {
        List<e3g0> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            listRemove = new ArrayList<>(1);
            e3g0 e3g0VarMo123736e = this.f3540e.mo123736e(new piq0(string, i));
            if (e3g0VarMo123736e != null) {
                listRemove.add(e3g0VarMo123736e);
            }
        } else {
            listRemove = this.f3540e.remove(string);
        }
        for (e3g0 e3g0Var : listRemove) {
            qzv.m178829e().mo178832a(f3535f, "Handing stopWork work for " + string);
            c0781d.m4562h().m186031b(e3g0Var);
            hh0.m135006a(this.f3536a, c0781d.m4560f().m211163u(), e3g0Var.getId());
            c0781d.onExecuted(e3g0Var.getId(), false);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m4543m() {
        boolean z;
        synchronized (this.f3538c) {
            z = !this.f3537b.isEmpty();
        }
        return z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public void m4544n(@NonNull Intent intent, int i, @NonNull C0781d c0781d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4537f(intent, i, c0781d);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m4540i(intent, i, c0781d);
            return;
        }
        if (!m4534l(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            qzv.m178829e().mo178834c(f3535f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m4541j(intent, i, c0781d);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m4538g(intent, i, c0781d);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m4542k(intent, c0781d);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m4539h(intent, i);
            return;
        }
        qzv.m178829e().mo178839k(f3535f, "Ignoring intent " + intent);
    }

    @Override // p153l.v6f
    public void onExecuted(@NonNull piq0 piq0Var, boolean z) {
        synchronized (this.f3538c) {
            try {
                C0780c c0780cRemove = this.f3537b.remove(piq0Var);
                this.f3540e.mo123736e(piq0Var);
                if (c0780cRemove != null) {
                    c0780cRemove.m4552g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
