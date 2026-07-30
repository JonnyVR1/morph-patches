package p149l;

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
public final class mew0 {

    /* JADX INFO: renamed from: o */
    public static final Map f133503o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f133504a;

    /* JADX INFO: renamed from: b */
    public final wdw0 f133505b;

    /* JADX INFO: renamed from: g */
    public boolean f133510g;

    /* JADX INFO: renamed from: h */
    public final Intent f133511h;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ServiceConnection f133515l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public IInterface f133516m;

    /* JADX INFO: renamed from: n */
    public final jdw0 f133517n;

    /* JADX INFO: renamed from: d */
    public final List f133507d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy("attachedRemoteTasksLock")
    public final Set f133508e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f133509f = new Object();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f133513j = new IBinder.DeathRecipient() { // from class: l.ydw0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            mew0.m154323j(this.f197650a);
        }
    };

    /* JADX INFO: renamed from: k */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f133514k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f133506c = "OverlayDisplayService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f133512i = new WeakReference(null);

    public mew0(Context context, wdw0 wdw0Var, String str, Intent intent, jdw0 jdw0Var, @Nullable cew0 cew0Var) {
        this.f133504a = context;
        this.f133505b = wdw0Var;
        this.f133511h = intent;
        this.f133517n = jdw0Var;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m154323j(mew0 mew0Var) {
        mew0Var.f133505b.m202813c("reportBinderDeath", new Object[0]);
        cew0 cew0Var = (cew0) mew0Var.f133512i.get();
        wdw0 wdw0Var = mew0Var.f133505b;
        if (cew0Var != null) {
            wdw0Var.m202813c("calling onBinderDied", new Object[0]);
            cew0Var.zza();
        } else {
            wdw0Var.m202813c("%s : Binder has died.", mew0Var.f133506c);
            Iterator it = mew0Var.f133507d.iterator();
            while (it.hasNext()) {
                ((xdw0) it.next()).m208432c(mew0Var.m154337v());
            }
            mew0Var.f133507d.clear();
        }
        synchronized (mew0Var.f133509f) {
            mew0Var.m154338w();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m154327n(final mew0 mew0Var, final sei0 sei0Var) {
        mew0Var.f133508e.add(sei0Var);
        sei0Var.m183657a().addOnCompleteListener(new OnCompleteListener() { // from class: l.zdw0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f202745a.m154335t(sei0Var, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m154329p(mew0 mew0Var, xdw0 xdw0Var) {
        if (mew0Var.f133516m != null || mew0Var.f133510g) {
            if (!mew0Var.f133510g) {
                xdw0Var.run();
                return;
            } else {
                mew0Var.f133505b.m202813c("Waiting to bind to the service.", new Object[0]);
                mew0Var.f133507d.add(xdw0Var);
                return;
            }
        }
        mew0Var.f133505b.m202813c("Initiate binding to the service.", new Object[0]);
        mew0Var.f133507d.add(xdw0Var);
        lew0 lew0Var = new lew0(mew0Var, null);
        mew0Var.f133515l = lew0Var;
        mew0Var.f133510g = true;
        if (mew0Var.f133504a.bindService(mew0Var.f133511h, lew0Var, 1)) {
            return;
        }
        mew0Var.f133505b.m202813c("Failed to bind to the service.", new Object[0]);
        mew0Var.f133510g = false;
        Iterator it = mew0Var.f133507d.iterator();
        while (it.hasNext()) {
            ((xdw0) it.next()).m208432c(new zzfwf());
        }
        mew0Var.f133507d.clear();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m154330q(mew0 mew0Var) {
        mew0Var.f133505b.m202813c("linkToDeath", new Object[0]);
        try {
            mew0Var.f133516m.asBinder().linkToDeath(mew0Var.f133513j, 0);
        } catch (RemoteException e) {
            mew0Var.f133505b.m202812b(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m154331r(mew0 mew0Var) {
        mew0Var.f133505b.m202813c("unlinkToDeath", new Object[0]);
        mew0Var.f133516m.asBinder().unlinkToDeath(mew0Var.f133513j, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m154332c() {
        Handler handler;
        Map map = f133503o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f133506c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f133506c, 10);
                    handlerThread.start();
                    map.put(this.f133506c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f133506c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final IInterface m154333e() {
        return this.f133516m;
    }

    /* JADX INFO: renamed from: s */
    public final void m154334s(xdw0 xdw0Var, @Nullable sei0 sei0Var) {
        m154332c().post(new aew0(this, xdw0Var.m208431b(), sei0Var, xdw0Var));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m154335t(sei0 sei0Var, Task task) {
        synchronized (this.f133509f) {
            this.f133508e.remove(sei0Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m154336u() {
        m154332c().post(new bew0(this));
    }

    /* JADX INFO: renamed from: v */
    public final RemoteException m154337v() {
        return new RemoteException(String.valueOf(this.f133506c).concat(" : Binder has died."));
    }

    @GuardedBy("attachedRemoteTasksLock")
    /* JADX INFO: renamed from: w */
    public final void m154338w() {
        Iterator it = this.f133508e.iterator();
        while (it.hasNext()) {
            ((sei0) it.next()).m183660d(m154337v());
        }
        this.f133508e.clear();
    }
}
