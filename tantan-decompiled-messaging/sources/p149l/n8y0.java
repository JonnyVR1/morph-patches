package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class n8y0 extends e9x0 {

    /* JADX INFO: renamed from: c */
    public Handler f137706c;

    /* JADX INFO: renamed from: d */
    public boolean f137707d;

    /* JADX INFO: renamed from: e */
    public final l9y0 f137708e;

    /* JADX INFO: renamed from: f */
    public final f9y0 f137709f;

    /* JADX INFO: renamed from: g */
    public final c9y0 f137710g;

    public n8y0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f137707d = true;
        this.f137708e = new l9y0(this);
        this.f137709f = new f9y0(this);
        this.f137710g = new c9y0(this);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m158509C(n8y0 n8y0Var, long j) {
        n8y0Var.mo15092h();
        n8y0Var.m158512A();
        n8y0Var.zzj().m211416E().m123937b("Activity resumed, time", Long.valueOf(j));
        if (n8y0Var.mo15085a().m192648n(q8s0.f153247P0)) {
            if (n8y0Var.mo15085a().m192639P() || n8y0Var.f137707d) {
                n8y0Var.f137709f.m120137f(j);
            }
        } else if (n8y0Var.mo15085a().m192639P() || n8y0Var.mo15088d().f175533u.m207310b()) {
            n8y0Var.f137709f.m120137f(j);
        }
        n8y0Var.f137710g.m105919a();
        l9y0 l9y0Var = n8y0Var.f137708e;
        l9y0Var.f127153a.mo15092h();
        if (l9y0Var.f127153a.f165891a.m194118k()) {
            l9y0Var.m149112b(l9y0Var.f127153a.zzb().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m158511w(n8y0 n8y0Var, long j) {
        n8y0Var.mo15092h();
        n8y0Var.m158512A();
        n8y0Var.zzj().m211416E().m123937b("Activity paused, time", Long.valueOf(j));
        n8y0Var.f137710g.m105920b(j);
        if (n8y0Var.mo15085a().m192639P()) {
            n8y0Var.f137709f.m120136e(j);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m158512A() {
        mo15092h();
        if (this.f137706c == null) {
            this.f137706c = new v4u0(Looper.getMainLooper());
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ h0s0 mo15093i() {
        return super.mo15093i();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2454c mo15094j() {
        return super.mo15094j();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ tmw0 mo15095k() {
        return super.mo15095k();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2458g mo15096l() {
        return super.mo15096l();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ m1y0 mo15097m() {
        return super.mo15097m();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ b3y0 mo15098n() {
        return super.mo15098n();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ n8y0 mo15099o() {
        return super.mo15099o();
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m158513x(boolean z) {
        mo15092h();
        this.f137707d = z;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m158514y(boolean z, boolean z2, long j) {
        return this.f137709f.m120135d(z, z2, j);
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final boolean m158515z() {
        mo15092h();
        return this.f137707d;
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
