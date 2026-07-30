package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class thy0 extends kix0 {

    /* JADX INFO: renamed from: c */
    public Handler f174430c;

    /* JADX INFO: renamed from: d */
    public boolean f174431d;

    /* JADX INFO: renamed from: e */
    public final riy0 f174432e;

    /* JADX INFO: renamed from: f */
    public final liy0 f174433f;

    /* JADX INFO: renamed from: g */
    public final iiy0 f174434g;

    public thy0(atx0 atx0Var) {
        super(atx0Var);
        this.f174431d = true;
        this.f174432e = new riy0(this);
        this.f174433f = new liy0(this);
        this.f174434g = new iiy0(this);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m191302C(thy0 thy0Var, long j) {
        thy0Var.mo15146h();
        thy0Var.m191305A();
        thy0Var.zzj().m114562E().m153301b("Activity resumed, time", Long.valueOf(j));
        if (thy0Var.mo15139a().m98440n(whs0.f189223P0)) {
            if (thy0Var.mo15139a().m98431P() || thy0Var.f174431d) {
                thy0Var.f174433f.m154436f(j);
            }
        } else if (thy0Var.mo15139a().m98431P() || thy0Var.mo15142d().f71914u.m115833b()) {
            thy0Var.f174433f.m154436f(j);
        }
        thy0Var.f174434g.m140171a();
        riy0 riy0Var = thy0Var.f174432e;
        riy0Var.f163403a.mo15146h();
        if (riy0Var.f163403a.f202159a.m100298k()) {
            riy0Var.m181623b(riy0Var.f163403a.zzb().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m191304w(thy0 thy0Var, long j) {
        thy0Var.mo15146h();
        thy0Var.m191305A();
        thy0Var.zzj().m114562E().m153301b("Activity paused, time", Long.valueOf(j));
        thy0Var.f174434g.m140172b(j);
        if (thy0Var.mo15139a().m98431P()) {
            thy0Var.f174433f.m154435e(j);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m191305A() {
        mo15146h();
        if (this.f174430c == null) {
            this.f174430c = new beu0(Looper.getMainLooper());
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ n9s0 mo15147i() {
        return super.mo15147i();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2477c mo15148j() {
        return super.mo15148j();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ zvw0 mo15149k() {
        return super.mo15149k();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2481g mo15150l() {
        return super.mo15150l();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ say0 mo15151m() {
        return super.mo15151m();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ hcy0 mo15152n() {
        return super.mo15152n();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ thy0 mo15153o() {
        return super.mo15153o();
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m191306x(boolean z) {
        mo15146h();
        this.f174431d = z;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m191307y(boolean z, boolean z2, long j) {
        return this.f174433f.m154434d(z, z2, j);
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final boolean m191308z() {
        mo15146h();
        return this.f174431d;
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
