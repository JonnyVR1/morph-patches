package p153l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class c7u0 extends kdu0 implements t6u0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f80143b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture f80144c;

    /* JADX INFO: renamed from: d */
    public boolean f80145d;

    public c7u0(b7u0 b7u0Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f80145d = false;
        this.f80143b = scheduledExecutorService;
        m149283q0(b7u0Var, executor);
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: Z */
    public final void mo102875Z(final zzdkv zzdkvVar) {
        if (this.f80145d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f80144c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m149285v0(new jdu0() { // from class: l.x6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((t6u0) obj).mo102875Z(zzdkvVar);
            }
        });
    }

    @Override // p153l.t6u0
    /* JADX INFO: renamed from: i */
    public final void mo102876i(final zze zzeVar) {
        m149285v0(new jdu0() { // from class: l.u6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((t6u0) obj).mo102876i(zzeVar);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m108335w0() {
        synchronized (this) {
            dct0.m115295d("Timeout waiting for show call succeed to be called.");
            mo102875Z(new zzdkv("Timeout for show call succeed."));
            this.f80145d = true;
        }
    }

    @Override // p153l.t6u0
    public final void zzb() {
        m149285v0(new jdu0() { // from class: l.v6u0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((t6u0) obj).zzb();
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f80144c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f80144c = this.f80143b.schedule(new Runnable() { // from class: l.w6u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187656a.m108335w0();
            }
        }, ((Integer) jas0.m144075c().m176505a(sgs0.f168355ja)).intValue(), TimeUnit.MILLISECONDS);
    }
}
