package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.C2268v3;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class out0 implements cxt0, y5u0, b3u0, zxt0, sxr0 {

    /* JADX INFO: renamed from: a */
    public final byt0 f145729a;

    /* JADX INFO: renamed from: b */
    public final kxv0 f145730b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f145731c;

    /* JADX INFO: renamed from: d */
    public final Executor f145732d;

    /* JADX INFO: renamed from: f */
    public ScheduledFuture f145734f;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f145736h;

    /* JADX INFO: renamed from: e */
    public final C2268v3 f145733e = C2268v3.m13379C();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f145735g = new AtomicBoolean();

    public out0(byt0 byt0Var, kxv0 kxv0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.f145729a = byt0Var;
        this.f145730b = kxv0Var;
        this.f145731c = scheduledExecutorService;
        this.f145732d = executor;
        this.f145736h = str;
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final void mo13669U(rxr0 rxr0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132047Qa)).booleanValue() && m166132u() && rxr0Var.f161504j && this.f145735g.compareAndSet(false, true) && this.f145730b.f125193f != 3) {
            xsu0.m210834k("Full screen 1px impression occurred");
            this.f145729a.zza();
        }
    }

    @Override // p149l.zxt0
    /* JADX INFO: renamed from: k */
    public final synchronized void mo134396k(zze zzeVar) {
        try {
            if (this.f145733e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f145734f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f145733e.mo13022f(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m166131q() {
        synchronized (this) {
            try {
                if (this.f145733e.isDone()) {
                    return;
                }
                this.f145733e.mo13021e(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m166132u() {
        return this.f145736h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // p149l.cxt0
    public final void zzc() {
        kxv0 kxv0Var = this.f145730b;
        if (kxv0Var.f125193f == 3) {
            return;
        }
        int i = kxv0Var.f125182Z;
        if (i == 0 || i == 1) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132047Qa)).booleanValue() && m166132u()) {
                return;
            }
            this.f145729a.zza();
        }
    }

    @Override // p149l.b3u0
    public final synchronized void zzj() {
        try {
            if (this.f145733e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f145734f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f145733e.mo13021e(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.y5u0
    public final void zzk() {
        if (this.f145730b.f125193f == 3) {
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132440w1)).booleanValue()) {
            kxv0 kxv0Var = this.f145730b;
            if (kxv0Var.f125182Z == 2) {
                if (kxv0Var.f125217r == 0) {
                    this.f145729a.zza();
                } else {
                    jmw0.m142245r(this.f145733e, new nut0(this), this.f145732d);
                    this.f145734f = this.f145731c.schedule(new Runnable() { // from class: l.mut0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f135845a.m166131q();
                        }
                    }, this.f145730b.f125217r, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // p149l.cxt0
    public final void zza() {
    }

    @Override // p149l.cxt0
    public final void zzb() {
    }

    @Override // p149l.cxt0
    public final void zze() {
    }

    @Override // p149l.cxt0
    public final void zzf() {
    }

    @Override // p149l.b3u0
    public final void zzi() {
    }

    @Override // p149l.y5u0
    public final void zzl() {
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(zvs0 zvs0Var, String str, String str2) {
    }
}
