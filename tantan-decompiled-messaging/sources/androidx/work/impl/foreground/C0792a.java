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
import androidx.work.impl.constraints.AbstractC0787a;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.InterfaceC15486o;
import p149l.haq0;
import p149l.ig3;
import p149l.k9q0;
import p149l.ld50;
import p149l.nyi;
import p149l.oaq0;
import p149l.qkq0;
import p149l.r5f;
import p149l.s9q0;
import p149l.txv;
import p149l.zei0;

/* JADX INFO: renamed from: androidx.work.impl.foreground.a */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C0792a implements ld50, r5f {

    /* JADX INFO: renamed from: k */
    public static final String f3594k = txv.m190978i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public Context f3595a;

    /* JADX INFO: renamed from: b */
    public s9q0 f3596b;

    /* JADX INFO: renamed from: c */
    public final zei0 f3597c;

    /* JADX INFO: renamed from: d */
    public final Object f3598d = new Object();

    /* JADX INFO: renamed from: e */
    public k9q0 f3599e;

    /* JADX INFO: renamed from: f */
    public final Map<k9q0, nyi> f3600f;

    /* JADX INFO: renamed from: g */
    public final Map<k9q0, haq0> f3601g;

    /* JADX INFO: renamed from: h */
    public final Map<k9q0, InterfaceC15486o> f3602h;

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
            haq0 haq0VarM4514g = C0792a.this.f3596b.m182747r().m4514g(this.f3605a);
            if (haq0VarM4514g == null || !haq0VarM4514g.m130165k()) {
                return;
            }
            synchronized (C0792a.this.f3598d) {
                C0792a.this.f3601g.put(oaq0.m163363a(haq0VarM4514g), haq0VarM4514g);
                C0792a c0792a = C0792a.this;
                C0792a.this.f3602h.put(oaq0.m163363a(haq0VarM4514g), WorkConstraintsTrackerKt.m4582c(c0792a.f3603i, haq0VarM4514g, c0792a.f3597c.mo187636a(), C0792a.this));
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

    public C0792a(@NonNull Context context) {
        this.f3595a = context;
        s9q0 s9q0VarM182740p = s9q0.m182740p(context);
        this.f3596b = s9q0VarM182740p;
        this.f3597c = s9q0VarM182740p.m182752w();
        this.f3599e = null;
        this.f3600f = new LinkedHashMap();
        this.f3602h = new HashMap();
        this.f3601g = new HashMap();
        this.f3603i = new WorkConstraintsTracker(this.f3596b.m182749t());
        this.f3596b.m182747r().m4512e(this);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Intent m4597d(@NonNull Context context, @NonNull k9q0 k9q0Var, @NonNull nyi nyiVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", nyiVar.m162013c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nyiVar.m162011a());
        intent.putExtra("KEY_NOTIFICATION", nyiVar.m162012b());
        intent.putExtra("KEY_WORKSPEC_ID", k9q0Var.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", k9q0Var.getGeneration());
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static Intent m4598e(@NonNull Context context, @NonNull k9q0 k9q0Var, @NonNull nyi nyiVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", k9q0Var.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", k9q0Var.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", nyiVar.m162013c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nyiVar.m162011a());
        intent.putExtra("KEY_NOTIFICATION", nyiVar.m162012b());
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static Intent m4599f(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p149l.ld50
    /* JADX INFO: renamed from: a */
    public void mo4546a(@NonNull haq0 haq0Var, @NonNull AbstractC0787a abstractC0787a) {
        if (abstractC0787a instanceof AbstractC0787a.b) {
            String str = haq0Var.id;
            txv.m190976e().mo190979a(f3594k, "Constraints unmet for WorkSpec " + str);
            this.f3596b.m182741A(oaq0.m163363a(haq0Var), ((AbstractC0787a.b) abstractC0787a).getCom.p1.mobile.putong.core.data.Reason.TYPE java.lang.String());
        }
    }

    @MainThread
    /* JADX INFO: renamed from: g */
    public final void m4600g(@NonNull Intent intent) {
        txv.m190976e().mo190983f(f3594k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3596b.m182742k(UUID.fromString(stringExtra));
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public final void m4601h(@NonNull Intent intent) {
        if (this.f3604j == null) {
            qkq0.m175383a("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int iM162011a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        k9q0 k9q0Var = new k9q0(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        txv.m190976e().mo190979a(f3594k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            ig3.m135964a("Notification passed in the intent was null.");
            return;
        }
        nyi nyiVar = new nyi(intExtra, notification, intExtra2);
        this.f3600f.put(k9q0Var, nyiVar);
        nyi nyiVar2 = this.f3600f.get(this.f3599e);
        if (nyiVar2 == null) {
            this.f3599e = k9q0Var;
        } else {
            this.f3604j.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<k9q0, nyi>> it = this.f3600f.entrySet().iterator();
                while (it.hasNext()) {
                    iM162011a |= it.next().getValue().m162011a();
                }
                nyiVar = new nyi(nyiVar2.m162013c(), nyiVar2.m162012b(), iM162011a);
            } else {
                nyiVar = nyiVar2;
            }
        }
        this.f3604j.startForeground(nyiVar.m162013c(), nyiVar.m162011a(), nyiVar.m162012b());
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public final void m4602i(@NonNull Intent intent) {
        txv.m190976e().mo190983f(f3594k, "Started foreground service " + intent);
        this.f3597c.m218342b(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public void m4603j(@NonNull Intent intent) {
        txv.m190976e().mo190983f(f3594k, "Stopping foreground service");
        b bVar = this.f3604j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: k */
    public void m4604k() {
        this.f3604j = null;
        synchronized (this.f3598d) {
            try {
                Iterator<InterfaceC15486o> it = this.f3602h.values().iterator();
                while (it.hasNext()) {
                    it.next().mo93695n(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3596b.m182747r().m4519m(this);
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public void m4605l(@NonNull Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m4602i(intent);
            m4601h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m4601h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m4600g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m4603j(intent);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public void m4606m(int i, int i2) {
        txv.m190976e().mo190983f(f3594k, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry<k9q0, nyi> entry : this.f3600f.entrySet()) {
            if (entry.getValue().m162011a() == i2) {
                this.f3596b.m182741A(entry.getKey(), -128);
            }
        }
        b bVar = this.f3604j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public void m4607n(@NonNull b bVar) {
        if (this.f3604j != null) {
            txv.m190976e().mo190981c(f3594k, "A callback already exists.");
        } else {
            this.f3604j = bVar;
        }
    }

    @Override // p149l.r5f
    @MainThread
    public void onExecuted(@NonNull k9q0 k9q0Var, boolean z) {
        Map.Entry<k9q0, nyi> entry;
        synchronized (this.f3598d) {
            try {
                InterfaceC15486o interfaceC15486oRemove = this.f3601g.remove(k9q0Var) != null ? this.f3602h.remove(k9q0Var) : null;
                if (interfaceC15486oRemove != null) {
                    interfaceC15486oRemove.mo93695n(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nyi nyiVarRemove = this.f3600f.remove(k9q0Var);
        if (k9q0Var.equals(this.f3599e)) {
            if (this.f3600f.size() > 0) {
                Iterator<Map.Entry<k9q0, nyi>> it = this.f3600f.entrySet().iterator();
                Map.Entry<k9q0, nyi> next = it.next();
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
                    nyi value = entry.getValue();
                    this.f3604j.startForeground(value.m162013c(), value.m162011a(), value.m162012b());
                    this.f3604j.cancelNotification(value.m162013c());
                }
            } else {
                this.f3599e = null;
            }
        }
        b bVar = this.f3604j;
        if (nyiVarRemove == null || bVar == null) {
            return;
        }
        txv.m190976e().mo190979a(f3594k, "Removing Notification (id: " + nyiVarRemove.m162013c() + ", workSpecId: " + k9q0Var + ", notificationType: " + nyiVarRemove.m162011a());
        bVar.cancelNotification(nyiVarRemove.m162013c());
    }
}
