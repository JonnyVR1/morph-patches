package p149l;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class ptu0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f151214a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f151215b;

    /* JADX INFO: renamed from: c */
    public final cvu0 f151216c;

    /* JADX INFO: renamed from: d */
    public final egx0 f151217d;

    public ptu0(rmw0 rmw0Var, rmw0 rmw0Var2, cvu0 cvu0Var, egx0 egx0Var) {
        this.f151214a = rmw0Var;
        this.f151215b = rmw0Var2;
        this.f151216c = cvu0Var;
        this.f151217d = egx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m171383a(zzbze zzbzeVar, int i, zzecf zzecfVar) throws Exception {
        return ((oyu0) this.f151217d.zzb()).m166703p8(zzbzeVar, i);
    }

    /* JADX INFO: renamed from: b */
    public final gnr m171384b(final zzbze zzbzeVar) {
        gnr gnrVarM142233f;
        String str = zzbzeVar.zzd;
        vny0.m199080r();
        if (C2075b.m12308b(str)) {
            gnrVarM142233f = jmw0.m142234g(new zzecf(1));
        } else {
            gnrVarM142233f = jmw0.m142233f(this.f151214a.mo122102R(new Callable() { // from class: l.mtu0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f135696a.m171385c(zzbzeVar);
                }
            }), ExecutionException.class, new rlw0() { // from class: l.ntu0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return jmw0.m142234g(((ExecutionException) obj).getCause());
                }
            }, this.f151215b);
        }
        final int callingUid = Binder.getCallingUid();
        return jmw0.m142233f(gnrVarM142233f, zzecf.class, new rlw0() { // from class: l.otu0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f145626a.m171383a(zzbzeVar, callingUid, (zzecf) obj);
            }
        }, this.f151215b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InputStream m171385c(zzbze zzbzeVar) throws Exception {
        n3t0 n3t0Var;
        final cvu0 cvu0Var = this.f151216c;
        synchronized (cvu0Var.f93385b) {
            try {
                if (cvu0Var.f93386c) {
                    n3t0Var = cvu0Var.f93384a;
                } else {
                    cvu0Var.f93386c = true;
                    cvu0Var.f93388e = zzbzeVar;
                    cvu0Var.f93389f.checkAvailabilityAndConnect();
                    cvu0Var.f93384a.addListener(new Runnable() { // from class: l.bvu0
                        @Override // java.lang.Runnable
                        public final void run() {
                            cvu0Var.m118321a();
                        }
                    }, i3t0.f111377f);
                    n3t0Var = cvu0Var.f93384a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (InputStream) n3t0Var.get(((Integer) d1s0.m109677c().m144697a(m7s0.f132456x5)).intValue(), TimeUnit.SECONDS);
    }
}
