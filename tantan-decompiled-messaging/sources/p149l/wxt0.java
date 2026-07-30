package p149l;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class wxt0 extends e4u0 implements nxt0 {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f188515b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture f188516c;

    /* JADX INFO: renamed from: d */
    public boolean f188517d;

    public wxt0(vxt0 vxt0Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f188517d = false;
        this.f188515b = scheduledExecutorService;
        m114710q0(vxt0Var, executor);
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: Z */
    public final void mo161952Z(final zzdkv zzdkvVar) {
        if (this.f188517d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f188516c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m114712v0(new d4u0() { // from class: l.rxt0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((nxt0) obj).mo161952Z(zzdkvVar);
            }
        });
    }

    @Override // p149l.nxt0
    /* JADX INFO: renamed from: i */
    public final void mo161953i(final zze zzeVar) {
        m114712v0(new d4u0() { // from class: l.oxt0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((nxt0) obj).mo161953i(zzeVar);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m206037w0() {
        synchronized (this) {
            x2t0.m206866d("Timeout waiting for show call succeed to be called.");
            mo161952Z(new zzdkv("Timeout for show call succeed."));
            this.f188517d = true;
        }
    }

    @Override // p149l.nxt0
    public final void zzb() {
        m114712v0(new d4u0() { // from class: l.pxt0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((nxt0) obj).zzb();
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f188516c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f188516c = this.f188515b.schedule(new Runnable() { // from class: l.qxt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156872a.m206037w0();
            }
        }, ((Integer) d1s0.m109677c().m144697a(m7s0.f132284ja)).intValue(), TimeUnit.MILLISECONDS);
    }
}
