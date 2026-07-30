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
import p149l.haq0;
import p149l.k9q0;
import p149l.lh0;
import p149l.r5f;
import p149l.r95;
import p149l.txv;
import p149l.vuf0;
import p149l.wuf0;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0776a implements r5f {

    /* JADX INFO: renamed from: f */
    public static final String f3535f = txv.m190978i("CommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f3536a;

    /* JADX INFO: renamed from: b */
    public final Map<k9q0, C0778c> f3537b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f3538c = new Object();

    /* JADX INFO: renamed from: d */
    public final r95 f3539d;

    /* JADX INFO: renamed from: e */
    public final wuf0 f3540e;

    public C0776a(@NonNull Context context, r95 r95Var, @NonNull wuf0 wuf0Var) {
        this.f3536a = context;
        this.f3539d = r95Var;
        this.f3540e = wuf0Var;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m4527a(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m4528b(@NonNull Context context, @NonNull k9q0 k9q0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return m4534p(intent, k9q0Var);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m4529c(@NonNull Context context, @NonNull k9q0 k9q0Var, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return m4534p(intent, k9q0Var);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m4530d(@NonNull Context context, @NonNull k9q0 k9q0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return m4534p(intent, k9q0Var);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m4531e(@NonNull Context context, @NonNull k9q0 k9q0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return m4534p(intent, k9q0Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m4532l(@Nullable Bundle bundle, @NonNull String... strArr) {
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
    public static k9q0 m4533o(@NonNull Intent intent) {
        return new k9q0(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: p */
    public static Intent m4534p(@NonNull Intent intent, @NonNull k9q0 k9q0Var) {
        intent.putExtra("KEY_WORKSPEC_ID", k9q0Var.getWorkSpecId());
        intent.putExtra("KEY_WORKSPEC_GENERATION", k9q0Var.getGeneration());
        return intent;
    }

    /* JADX INFO: renamed from: f */
    public final void m4535f(@NonNull Intent intent, int i, @NonNull C0779d c0779d) {
        txv.m190976e().mo190979a(f3535f, "Handling constraints changed " + intent);
        new C0777b(this.f3536a, this.f3539d, i, c0779d).m4543a();
    }

    /* JADX INFO: renamed from: g */
    public final void m4536g(@NonNull Intent intent, int i, @NonNull C0779d c0779d) {
        synchronized (this.f3538c) {
            try {
                k9q0 k9q0VarM4533o = m4533o(intent);
                txv txvVarM190976e = txv.m190976e();
                String str = f3535f;
                txvVarM190976e.mo190979a(str, "Handing delay met for " + k9q0VarM4533o);
                if (this.f3537b.containsKey(k9q0VarM4533o)) {
                    txv.m190976e().mo190979a(str, "WorkSpec " + k9q0VarM4533o + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    C0778c c0778c = new C0778c(this.f3536a, i, c0779d, this.f3540e.mo141292a(k9q0VarM4533o));
                    this.f3537b.put(k9q0VarM4533o, c0778c);
                    c0778c.m4549f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4537h(@NonNull Intent intent, int i) {
        k9q0 k9q0VarM4533o = m4533o(intent);
        boolean z = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        txv.m190976e().mo190979a(f3535f, "Handling onExecutionCompleted " + intent + ", " + i);
        onExecuted(k9q0VarM4533o, z);
    }

    /* JADX INFO: renamed from: i */
    public final void m4538i(@NonNull Intent intent, int i, @NonNull C0779d c0779d) {
        txv.m190976e().mo190979a(f3535f, "Handling reschedule " + intent + ", " + i);
        c0779d.m4558f().m182754y();
    }

    /* JADX INFO: renamed from: j */
    public final void m4539j(@NonNull Intent intent, int i, @NonNull C0779d c0779d) {
        k9q0 k9q0VarM4533o = m4533o(intent);
        txv txvVarM190976e = txv.m190976e();
        String str = f3535f;
        txvVarM190976e.mo190979a(str, "Handling schedule work for " + k9q0VarM4533o);
        WorkDatabase workDatabaseM182750u = c0779d.m4558f().m182750u();
        workDatabaseM182750u.beginTransaction();
        try {
            haq0 haq0VarMo135190v = workDatabaseM182750u.workSpecDao().mo135190v(k9q0VarM4533o.getWorkSpecId());
            if (haq0VarMo135190v == null) {
                txv.m190976e().mo190986k(str, "Skipping scheduling " + k9q0VarM4533o + " because it's no longer in the DB");
                return;
            }
            if (haq0VarMo135190v.state.isFinished()) {
                txv.m190976e().mo190986k(str, "Skipping scheduling " + k9q0VarM4533o + "because it is finished.");
                return;
            }
            long jM130157b = haq0VarMo135190v.m130157b();
            if (haq0VarMo135190v.m130165k()) {
                txv.m190976e().mo190979a(str, "Opportunistically setting an alarm for " + k9q0VarM4533o + "at " + jM130157b);
                lh0.m149805c(this.f3536a, workDatabaseM182750u, k9q0VarM4533o, jM130157b);
                c0779d.m4557e().mo187637c().execute(new C0779d.b(c0779d, m4527a(this.f3536a), i));
            } else {
                txv.m190976e().mo190979a(str, "Setting up Alarms for " + k9q0VarM4533o + "at " + jM130157b);
                lh0.m149805c(this.f3536a, workDatabaseM182750u, k9q0VarM4533o, jM130157b);
            }
            workDatabaseM182750u.setTransactionSuccessful();
        } finally {
            workDatabaseM182750u.endTransaction();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4540k(@NonNull Intent intent, @NonNull C0779d c0779d) {
        List<vuf0> listRemove;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i = extras.getInt("KEY_WORKSPEC_GENERATION");
            listRemove = new ArrayList<>(1);
            vuf0 vuf0VarMo141294e = this.f3540e.mo141294e(new k9q0(string, i));
            if (vuf0VarMo141294e != null) {
                listRemove.add(vuf0VarMo141294e);
            }
        } else {
            listRemove = this.f3540e.remove(string);
        }
        for (vuf0 vuf0Var : listRemove) {
            txv.m190976e().mo190979a(f3535f, "Handing stopWork work for " + string);
            c0779d.m4560h().m158560b(vuf0Var);
            lh0.m149803a(this.f3536a, c0779d.m4558f().m182750u(), vuf0Var.getId());
            c0779d.onExecuted(vuf0Var.getId(), false);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m4541m() {
        boolean z;
        synchronized (this.f3538c) {
            z = !this.f3537b.isEmpty();
        }
        return z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public void m4542n(@NonNull Intent intent, int i, @NonNull C0779d c0779d) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m4535f(intent, i, c0779d);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m4538i(intent, i, c0779d);
            return;
        }
        if (!m4532l(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            txv.m190976e().mo190981c(f3535f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m4539j(intent, i, c0779d);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            m4536g(intent, i, c0779d);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m4540k(intent, c0779d);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m4537h(intent, i);
            return;
        }
        txv.m190976e().mo190986k(f3535f, "Ignoring intent " + intent);
    }

    @Override // p149l.r5f
    public void onExecuted(@NonNull k9q0 k9q0Var, boolean z) {
        synchronized (this.f3538c) {
            try {
                C0778c c0778cRemove = this.f3537b.remove(k9q0Var);
                this.f3540e.mo141294e(k9q0Var);
                if (c0778cRemove != null) {
                    c0778cRemove.m4550g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
