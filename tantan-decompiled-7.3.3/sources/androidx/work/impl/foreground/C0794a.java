package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.constraints.AbstractC0789a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.InterfaceC15593o;
import p153l.i1j;
import p153l.mjq0;
import p153l.piq0;
import p153l.qzv;
import p153l.sl50;
import p153l.tjq0;
import p153l.v6f;
import p153l.wg3;
import p153l.wtq0;
import p153l.xiq0;
import p153l.zni0;

/* JADX INFO: renamed from: androidx.work.impl.foreground.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0794a implements sl50, v6f {

    /* JADX INFO: renamed from: k */
    public static final String f3594k = qzv.m178831i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public Context f3595a;

    /* JADX INFO: renamed from: b */
    public xiq0 f3596b;

    /* JADX INFO: renamed from: c */
    public final zni0 f3597c;

    /* JADX INFO: renamed from: d */
    public final Object f3598d = new Object();

    /* JADX INFO: renamed from: e */
    public piq0 f3599e;

    /* JADX INFO: renamed from: f */
    public final Map<piq0, i1j> f3600f;

    /* JADX INFO: renamed from: g */
    public final Map<piq0, mjq0> f3601g;

    /* JADX INFO: renamed from: h */
    public final Map<piq0, InterfaceC15593o> f3602h;

    /* JADX INFO: renamed from: i */
    public final WorkConstraintsTracker f3603i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public b f3604j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f3605a;

        public a(String str) {
            this.f3605a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            mjq0 mjq0VarM4516g = C0794a.this.f3596b.m211160r().m4516g(this.f3605a);
            if (mjq0VarM4516g == null || !mjq0VarM4516g.m158607k()) {
                return;
            }
            synchronized (C0794a.this.f3598d) {
                C0794a.this.f3601g.put(tjq0.m191450a(mjq0VarM4516g), mjq0VarM4516g);
                C0794a c0794a = C0794a.this;
                C0794a.this.f3602h.put(tjq0.m191450a(mjq0VarM4516g), WorkConstraintsTrackerKt.m4584c(c0794a.f3603i, mjq0VarM4516g, c0794a.f3597c.mo216344a(), C0794a.this));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$b */
    public interface b {
        @MainThread
        void cancelNotification(int i);

        @MainThread
        void notify(int i, @NonNull Notification notification);

        @MainThread
        void startForeground(int i, int i2, @NonNull Notification notification);

        @MainThread
        void stop();
    }

    public C0794a(@NonNull Context context) {
        this.f3595a = context;
        xiq0 xiq0VarM211153p = xiq0.m211153p(context);
        this.f3596b = xiq0VarM211153p;
        this.f3597c = xiq0VarM211153p.m211165w();
        this.f3599e = null;
        this.f3600f = new LinkedHashMap();
        this.f3602h = new HashMap();
        this.f3601g = new HashMap();
        this.f3603i = new WorkConstraintsTracker(this.f3596b.m211162t());
        this.f3596b.m211160r().m4514e(this);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Intent m4599d(@NonNull Context context, @NonNull piq0 piq0Var, @NonNull i1j i1jVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", i1jVar.m138103c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", i1jVar.m138101a());
        intent.putExtra("KEY_NOTIFICATION", i1jVar.m138102b());
        intent.putExtra("KEY_WORKSPEC_ID", piq0Var.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", piq0Var.getGeneration());
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static Intent m4600e(@NonNull Context context, @NonNull piq0 piq0Var, @NonNull i1j i1jVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", piq0Var.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", piq0Var.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", i1jVar.m138103c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", i1jVar.m138101a());
        intent.putExtra("KEY_NOTIFICATION", i1jVar.m138102b());
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Intent m4601f(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p153l.sl50
    /* JADX INFO: renamed from: a */
    public void mo4548a(@NonNull mjq0 mjq0Var, @NonNull AbstractC0789a abstractC0789a) {
        if (abstractC0789a instanceof AbstractC0789a.b) {
            String str = mjq0Var.id;
            qzv.m178829e().mo178832a(f3594k, "Constraints unmet for WorkSpec " + str);
            this.f3596b.m211154A(tjq0.m191450a(mjq0Var), ((AbstractC0789a.b) abstractC0789a).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m4602g(@NonNull Intent intent) {
        qzv.m178829e().mo178836f(f3594k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3596b.m211155k(UUID.fromString(stringExtra));
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m4603h(@NonNull Intent intent) {
        if (this.f3604j == null) {
            wtq0.m207906a("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int iM138101a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        piq0 piq0Var = new piq0(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        qzv.m178829e().mo178832a(f3594k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            wg3.m206174a("Notification passed in the intent was null.");
            return;
        }
        i1j i1jVar = new i1j(intExtra, notification, intExtra2);
        this.f3600f.put(piq0Var, i1jVar);
        i1j i1jVar2 = this.f3600f.get(this.f3599e);
        if (i1jVar2 == null) {
            this.f3599e = piq0Var;
        } else {
            this.f3604j.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<piq0, i1j>> it = this.f3600f.entrySet().iterator();
                while (it.hasNext()) {
                    iM138101a |= it.next().getValue().m138101a();
                }
                i1jVar = new i1j(i1jVar2.m138103c(), i1jVar2.m138102b(), iM138101a);
            } else {
                i1jVar = i1jVar2;
            }
        }
        this.f3604j.startForeground(i1jVar.m138103c(), i1jVar.m138101a(), i1jVar.m138102b());
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m4604i(@NonNull Intent intent) {
        qzv.m178829e().mo178836f(f3594k, "Started foreground service " + intent);
        this.f3597c.m220600b(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public void m4605j(@NonNull Intent intent) {
        qzv.m178829e().mo178836f(f3594k, "Stopping foreground service");
        b bVar = this.f3604j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public void m4606k() {
        this.f3604j = null;
        synchronized (this.f3598d) {
            try {
                Iterator<InterfaceC15593o> it = this.f3602h.values().iterator();
                while (it.hasNext()) {
                    it.next().mo94586n(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3596b.m211160r().m4521m(this);
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public void m4607l(@NonNull Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m4604i(intent);
            m4603h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m4603h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m4602g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m4605j(intent);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public void m4608m(int i, int i2) {
        qzv.m178829e().mo178836f(f3594k, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry<piq0, i1j> entry : this.f3600f.entrySet()) {
            if (entry.getValue().m138101a() == i2) {
                this.f3596b.m211154A(entry.getKey(), -128);
            }
        }
        b bVar = this.f3604j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public void m4609n(@NonNull b bVar) {
        if (this.f3604j != null) {
            qzv.m178829e().mo178834c(f3594k, "A callback already exists.");
        } else {
            this.f3604j = bVar;
        }
    }

    @Override // p153l.v6f
    @MainThread
    public void onExecuted(@NonNull piq0 piq0Var, boolean z) {
        Map.Entry<piq0, i1j> entry;
        synchronized (this.f3598d) {
            try {
                InterfaceC15593o interfaceC15593oRemove = this.f3601g.remove(piq0Var) != null ? this.f3602h.remove(piq0Var) : null;
                if (interfaceC15593oRemove != null) {
                    interfaceC15593oRemove.mo94586n(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i1j i1jVarRemove = this.f3600f.remove(piq0Var);
        if (piq0Var.equals(this.f3599e)) {
            if (this.f3600f.size() > 0) {
                Iterator<Map.Entry<piq0, i1j>> it = this.f3600f.entrySet().iterator();
                Map.Entry<piq0, i1j> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f3599e = entry.getKey();
                if (this.f3604j != null) {
                    i1j value = entry.getValue();
                    this.f3604j.startForeground(value.m138103c(), value.m138101a(), value.m138102b());
                    this.f3604j.cancelNotification(value.m138103c());
                }
            } else {
                this.f3599e = null;
            }
        }
        b bVar = this.f3604j;
        if (i1jVarRemove == null || bVar == null) {
            return;
        }
        qzv.m178829e().mo178832a(f3594k, "Removing Notification (id: " + i1jVarRemove.m138103c() + ", workSpecId: " + piq0Var + ", notificationType: " + i1jVarRemove.m138101a());
        bVar.cancelNotification(i1jVarRemove.m138103c());
    }
}
