package p153l;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class n9s0 extends v1v0 {

    /* JADX INFO: renamed from: b */
    public final Map<String, Long> f140939b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Integer> f140940c;

    /* JADX INFO: renamed from: d */
    public long f140941d;

    public n9s0(atx0 atx0Var) {
        super(atx0Var);
        this.f140940c = new l01();
        this.f140939b = new l01();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m162036u(n9s0 n9s0Var, String str, long j) {
        n9s0Var.mo15146h();
        Preconditions.checkNotEmpty(str);
        if (n9s0Var.f140940c.isEmpty()) {
            n9s0Var.f140941d = j;
        }
        Integer num = n9s0Var.f140940c.get(str);
        Map<String, Integer> map = n9s0Var.f140940c;
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            n9s0Var.zzj().m114563F().m153300a("Too many ads visible");
        } else {
            n9s0Var.f140940c.put(str, 1);
            n9s0Var.f140939b.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final void m162037v(long j) {
        Iterator<String> it = this.f140939b.keySet().iterator();
        while (it.hasNext()) {
            this.f140939b.put(it.next(), Long.valueOf(j));
        }
        if (this.f140939b.isEmpty()) {
            return;
        }
        this.f140941d = j;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m162038x(n9s0 n9s0Var, String str, long j) {
        n9s0Var.mo15146h();
        Preconditions.checkNotEmpty(str);
        Integer num = n9s0Var.f140940c.get(str);
        if (num == null) {
            n9s0Var.zzj().m114558A().m153301b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        way0 way0VarM185291x = n9s0Var.mo15151m().m185291x(false);
        int iIntValue = num.intValue() - 1;
        Map<String, Integer> map = n9s0Var.f140940c;
        if (iIntValue != 0) {
            map.put(str, Integer.valueOf(iIntValue));
            return;
        }
        map.remove(str);
        Long l2 = n9s0Var.f140939b.get(str);
        if (l2 == null) {
            n9s0Var.zzj().m114558A().m153300a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l2.longValue();
            n9s0Var.f140939b.remove(str);
            n9s0Var.m162042s(str, jLongValue, way0VarM185291x);
        }
        if (n9s0Var.f140940c.isEmpty()) {
            long j2 = n9s0Var.f140941d;
            if (j2 == 0) {
                n9s0Var.zzj().m114558A().m153300a("First ad exposure time was never set");
            } else {
                n9s0Var.m162040q(j - j2, way0VarM185291x);
                n9s0Var.f140941d = 0L;
            }
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

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final void m162039p(long j) {
        way0 way0VarM185291x = mo15151m().m185291x(false);
        for (String str : this.f140939b.keySet()) {
            m162042s(str, j - this.f140939b.get(str).longValue(), way0VarM185291x);
        }
        if (!this.f140939b.isEmpty()) {
            m162040q(j - this.f140941d, way0VarM185291x);
        }
        m162037v(j);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final void m162040q(long j, way0 way0Var) {
        if (way0Var == null) {
            zzj().m114562E().m153300a("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().m114562E().m153301b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        hny0.m136300S(way0Var, bundle, true);
        mo15150l().m15251V0("am", "_xa", bundle);
    }

    /* JADX INFO: renamed from: r */
    public final void m162041r(String str, long j) {
        if (str == null || str.length() == 0) {
            zzj().m114558A().m153300a("Ad unit id must be a non-empty string");
        } else {
            zzl().m177841w(new y9r0(this, str, j));
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void m162042s(String str, long j, way0 way0Var) {
        if (way0Var == null) {
            zzj().m114562E().m153300a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzj().m114562E().m153301b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        hny0.m136300S(way0Var, bundle, true);
        mo15150l().m15251V0("am", "_xu", bundle);
    }

    /* JADX INFO: renamed from: w */
    public final void m162043w(String str, long j) {
        if (str == null || str.length() == 0) {
            zzj().m114558A().m153300a("Ad unit id must be a non-empty string");
        } else {
            zzl().m177841w(new p4u0(this, str, j));
        }
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
