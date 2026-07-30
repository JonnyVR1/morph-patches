package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class snw0 {

    /* JADX INFO: renamed from: o */
    public static final Map f169774o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f169775a;

    /* JADX INFO: renamed from: b */
    public final cnw0 f169776b;

    /* JADX INFO: renamed from: g */
    public boolean f169781g;

    /* JADX INFO: renamed from: h */
    public final Intent f169782h;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ServiceConnection f169786l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public IInterface f169787m;

    /* JADX INFO: renamed from: n */
    public final pmw0 f169788n;

    /* JADX INFO: renamed from: d */
    public final List f169778d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy("attachedRemoteTasksLock")
    public final Set f169779e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f169780f = new Object();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f169784j = new IBinder.DeathRecipient() { // from class: l.enw0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            snw0.m187012j(this.f94837a);
        }
    };

    /* JADX INFO: renamed from: k */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f169785k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f169777c = "OverlayDisplayService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f169783i = new WeakReference(null);

    public snw0(Context context, cnw0 cnw0Var, String str, Intent intent, pmw0 pmw0Var, @Nullable inw0 inw0Var) {
        this.f169775a = context;
        this.f169776b = cnw0Var;
        this.f169782h = intent;
        this.f169788n = pmw0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m187012j(snw0 snw0Var) {
        snw0Var.f169776b.m111556c("reportBinderDeath", new Object[0]);
        inw0 inw0Var = (inw0) snw0Var.f169783i.get();
        cnw0 cnw0Var = snw0Var.f169776b;
        if (inw0Var != null) {
            cnw0Var.m111556c("calling onBinderDied", new Object[0]);
            inw0Var.zza();
        } else {
            cnw0Var.m111556c("%s : Binder has died.", snw0Var.f169777c);
            Iterator it = snw0Var.f169778d.iterator();
            while (it.hasNext()) {
                ((dnw0) it.next()).m117087c(snw0Var.m187026v());
            }
            snw0Var.f169778d.clear();
        }
        synchronized (snw0Var.f169780f) {
            snw0Var.m187027w();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m187016n(final snw0 snw0Var, final sni0 sni0Var) {
        snw0Var.f169779e.add(sni0Var);
        sni0Var.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: l.fnw0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f99980a.m187024t(sni0Var, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m187018p(snw0 snw0Var, dnw0 dnw0Var) {
        if (snw0Var.f169787m != null || snw0Var.f169781g) {
            if (!snw0Var.f169781g) {
                dnw0Var.run();
                return;
            } else {
                snw0Var.f169776b.m111556c("Waiting to bind to the service.", new Object[0]);
                snw0Var.f169778d.add(dnw0Var);
                return;
            }
        }
        snw0Var.f169776b.m111556c("Initiate binding to the service.", new Object[0]);
        snw0Var.f169778d.add(dnw0Var);
        rnw0 rnw0Var = new rnw0(snw0Var, null);
        snw0Var.f169786l = rnw0Var;
        snw0Var.f169781g = true;
        if (snw0Var.f169775a.bindService(snw0Var.f169782h, rnw0Var, 1)) {
            return;
        }
        snw0Var.f169776b.m111556c("Failed to bind to the service.", new Object[0]);
        snw0Var.f169781g = false;
        Iterator it = snw0Var.f169778d.iterator();
        while (it.hasNext()) {
            ((dnw0) it.next()).m117087c(new zzfwf());
        }
        snw0Var.f169778d.clear();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m187019q(snw0 snw0Var) {
        snw0Var.f169776b.m111556c("linkToDeath", new Object[0]);
        try {
            snw0Var.f169787m.asBinder().linkToDeath(snw0Var.f169784j, 0);
        } catch (RemoteException e) {
            snw0Var.f169776b.m111555b(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m187020r(snw0 snw0Var) {
        snw0Var.f169776b.m111556c("unlinkToDeath", new Object[0]);
        snw0Var.f169787m.asBinder().unlinkToDeath(snw0Var.f169784j, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m187021c() {
        Handler handler;
        Map map = f169774o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f169777c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f169777c, 10);
                    handlerThread.start();
                    map.put(this.f169777c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f169777c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final IInterface m187022e() {
        return this.f169787m;
    }

    /* JADX INFO: renamed from: s */
    public final void m187023s(dnw0 dnw0Var, @Nullable sni0 sni0Var) {
        m187021c().post(new gnw0(this, dnw0Var.m117086b(), sni0Var, dnw0Var));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m187024t(sni0 sni0Var, Task task) {
        synchronized (this.f169780f) {
            this.f169779e.remove(sni0Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m187025u() {
        m187021c().post(new hnw0(this));
    }

    /* JADX INFO: renamed from: v */
    public final RemoteException m187026v() {
        return new RemoteException(String.valueOf(this.f169777c).concat(" : Binder has died."));
    }

    @GuardedBy("attachedRemoteTasksLock")
    /* JADX INFO: renamed from: w */
    public final void m187027w() {
        Iterator it = this.f169779e.iterator();
        while (it.hasNext()) {
            ((sni0) it.next()).m186942d(m187026v());
        }
        this.f169779e.clear();
    }
}
