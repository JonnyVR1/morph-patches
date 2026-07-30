package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.C2291v3;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class u3u0 implements i6u0, efu0, hcu0, f7u0, y6s0 {

    /* JADX INFO: renamed from: a */
    public final h7u0 f177370a;

    /* JADX INFO: renamed from: b */
    public final q6w0 f177371b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f177372c;

    /* JADX INFO: renamed from: d */
    public final Executor f177373d;

    /* JADX INFO: renamed from: f */
    public ScheduledFuture f177375f;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f177377h;

    /* JADX INFO: renamed from: e */
    public final C2291v3 f177374e = C2291v3.m13433C();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f177376g = new AtomicBoolean();

    public u3u0(h7u0 h7u0Var, q6w0 q6w0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, @Nullable String str) {
        this.f177370a = h7u0Var;
        this.f177371b = q6w0Var;
        this.f177372c = scheduledExecutorService;
        this.f177373d = executor;
        this.f177377h = str;
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final void mo13723U(x6s0 x6s0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168118Qa)).booleanValue() && m194423u() && x6s0Var.f192630j && this.f177376g.compareAndSet(false, true) && this.f177371b.f155883f != 3) {
            d2v0.m113737k("Full screen 1px impression occurred");
            this.f177370a.zza();
        }
    }

    @Override // p153l.f7u0
    /* JADX INFO: renamed from: k */
    public final synchronized void mo124507k(zze zzeVar) {
        try {
            if (this.f177374e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f177375f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f177374e.mo13076f(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m194422q() {
        synchronized (this) {
            try {
                if (this.f177374e.isDone()) {
                    return;
                }
                this.f177374e.mo13075e(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m194423u() {
        return this.f177377h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // p153l.i6u0
    public final void zzc() {
        q6w0 q6w0Var = this.f177371b;
        if (q6w0Var.f155883f == 3) {
            return;
        }
        int i = q6w0Var.f155872Z;
        if (i == 0 || i == 1) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168118Qa)).booleanValue() && m194423u()) {
                return;
            }
            this.f177370a.zza();
        }
    }

    @Override // p153l.hcu0
    public final synchronized void zzj() {
        try {
            if (this.f177374e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f177375f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f177374e.mo13075e(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.efu0
    public final void zzk() {
        if (this.f177371b.f155883f == 3) {
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168511w1)).booleanValue()) {
            q6w0 q6w0Var = this.f177371b;
            if (q6w0Var.f155872Z == 2) {
                if (q6w0Var.f155907r == 0) {
                    this.f177370a.zza();
                } else {
                    pvw0.m173991r(this.f177374e, new t3u0(this), this.f177373d);
                    this.f177375f = this.f177372c.schedule(new Runnable() { // from class: l.s3u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f166038a.m194422q();
                        }
                    }, this.f177371b.f155907r, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // p153l.i6u0
    public final void zza() {
    }

    @Override // p153l.i6u0
    public final void zzb() {
    }

    @Override // p153l.i6u0
    public final void zze() {
    }

    @Override // p153l.i6u0
    public final void zzf() {
    }

    @Override // p153l.hcu0
    public final void zzi() {
    }

    @Override // p153l.efu0
    public final void zzl() {
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(f5t0 f5t0Var, String str, String str2) {
    }
}
