package p149l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class h0s0 extends psu0 {

    /* JADX INFO: renamed from: b */
    public final Map<String, Long> f105241b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f105242c;

    /* JADX INFO: renamed from: d */
    public long f105243d;

    public h0s0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f105242c = new e01();
        this.f105241b = new e01();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m128967u(h0s0 h0s0Var, String str, long j) {
        h0s0Var.mo15092h();
        Preconditions.checkNotEmpty(str);
        if (h0s0Var.f105242c.isEmpty()) {
            h0s0Var.f105243d = j;
        }
        Integer num = h0s0Var.f105242c.get(str);
        Map<String, Integer> map = h0s0Var.f105242c;
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            h0s0Var.zzj().m211417F().m123936a("Too many ads visible");
        } else {
            h0s0Var.f105242c.put(str, 1);
            h0s0Var.f105241b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final void m128968v(long j) {
        Iterator<String> it = this.f105241b.keySet().iterator();
        while (it.hasNext()) {
            this.f105241b.put(it.next(), Long.valueOf(j));
        }
        if (this.f105241b.isEmpty()) {
            return;
        }
        this.f105243d = j;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m128969x(h0s0 h0s0Var, String str, long j) {
        h0s0Var.mo15092h();
        Preconditions.checkNotEmpty(str);
        Integer num = h0s0Var.f105242c.get(str);
        if (num == null) {
            h0s0Var.zzj().m211412A().m123937b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        q1y0 q1y0VarM152642x = h0s0Var.mo15097m().m152642x(false);
        int iIntValue = num.intValue() - 1;
        Map<String, Integer> map = h0s0Var.f105242c;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Long l2 = h0s0Var.f105241b.get(str);
        if (l2 == null) {
            h0s0Var.zzj().m211412A().m123936a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l2.longValue();
            h0s0Var.f105241b.remove(str);
            h0s0Var.m128973s(str, jLongValue, q1y0VarM152642x);
        }
        if (h0s0Var.f105242c.isEmpty()) {
            long j2 = h0s0Var.f105243d;
            if (j2 == 0) {
                h0s0Var.zzj().m211412A().m123936a("First ad exposure time was never set");
            } else {
                h0s0Var.m128971q(j - j2, q1y0VarM152642x);
                h0s0Var.f105243d = 0L;
            }
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

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final void m128970p(long j) {
        q1y0 q1y0VarM152642x = mo15097m().m152642x(false);
        for (String str : this.f105241b.keySet()) {
            m128973s(str, j - this.f105241b.get(str).longValue(), q1y0VarM152642x);
        }
        if (!this.f105241b.isEmpty()) {
            m128971q(j - this.f105243d, q1y0VarM152642x);
        }
        m128968v(j);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final void m128971q(long j, q1y0 q1y0Var) {
        if (q1y0Var == null) {
            zzj().m211416E().m123936a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().m211416E().m123937b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        bey0.m101433S(q1y0Var, bundle, true);
        mo15096l().m15197V0("am", "_xa", bundle);
    }

    /* JADX INFO: renamed from: r */
    public final void m128972r(String str, long j) {
        if (str == null || str.length() == 0) {
            zzj().m211412A().m123936a("Ad unit id must be a non-empty string");
        } else {
            zzl().m146305w(new s0r0(this, str, j));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void m128973s(String str, long j, q1y0 q1y0Var) {
        if (q1y0Var == null) {
            zzj().m211416E().m123936a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().m211416E().m123937b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        bey0.m101433S(q1y0Var, bundle, true);
        mo15096l().m15197V0("am", "_xu", bundle);
    }

    /* JADX INFO: renamed from: w */
    public final void m128974w(String str, long j) {
        if (str == null || str.length() == 0) {
            zzj().m211412A().m123936a("Ad unit id must be a non-empty string");
        } else {
            zzl().m146305w(new jvt0(this, str, j));
        }
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
