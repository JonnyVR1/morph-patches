package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2268v3;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeml;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class c7v0 {

    /* JADX INFO: renamed from: a */
    public final Executor f79651a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f79652b;

    /* JADX INFO: renamed from: c */
    public final hqt0 f79653c;

    /* JADX INFO: renamed from: d */
    public final y7v0 f79654d;

    /* JADX INFO: renamed from: e */
    public final o5w0 f79655e;

    /* JADX INFO: renamed from: f */
    public final C2268v3 f79656f = C2268v3.m13379C();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f79657g = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    public d7v0 f79658h;

    /* JADX INFO: renamed from: i */
    public vxv0 f79659i;

    public c7v0(Executor executor, ScheduledExecutorService scheduledExecutorService, hqt0 hqt0Var, y7v0 y7v0Var, o5w0 o5w0Var) {
        this.f79651a = executor;
        this.f79652b = scheduledExecutorService;
        this.f79653c = hqt0Var;
        this.f79654d = y7v0Var;
        this.f79655e = o5w0Var;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized gnr m105642b(vxv0 vxv0Var) {
        try {
            if (!this.f79657g.getAndSet(true)) {
                if (vxv0Var.f183478b.f178772a.isEmpty()) {
                    this.f79656f.mo13022f(new zzeml(3, e8v0.m115305b(vxv0Var)));
                } else {
                    this.f79659i = vxv0Var;
                    this.f79658h = new d7v0(vxv0Var, this.f79654d, this.f79656f);
                    this.f79654d.m213333k(vxv0Var.f183478b.f178772a);
                    while (this.f79658h.m110255e()) {
                        m105644e(this.f79658h.m110251a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f79656f;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized gnr m105643d(kxv0 kxv0Var) {
        Iterator it = kxv0Var.f125183a.iterator();
        while (it.hasNext()) {
            j3v0 j3v0VarMo110632d = this.f79653c.mo110632d(kxv0Var.f125185b, (String) it.next());
            if (j3v0VarMo110632d != null && j3v0VarMo110632d.mo120127a(this.f79659i, kxv0Var)) {
                return jmw0.m142242o(j3v0VarMo110632d.mo120128b(this.f79659i, kxv0Var), kxv0Var.f125175S, TimeUnit.MILLISECONDS, this.f79652b);
            }
        }
        return jmw0.m142234g(new zzead(3));
    }

    /* JADX INFO: renamed from: e */
    public final void m105644e(@Nullable kxv0 kxv0Var) {
        if (kxv0Var == null) {
            return;
        }
        gnr gnrVarM105643d = m105643d(kxv0Var);
        this.f79654d.m213329f(this.f79659i, kxv0Var, gnrVarM105643d, this.f79655e);
        jmw0.m142245r(gnrVarM105643d, new b7v0(this, kxv0Var), this.f79651a);
    }
}
