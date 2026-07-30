package p149l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzje;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class e7y0 extends hay0 {

    /* JADX INFO: renamed from: d */
    public final Map<String, c7y0> f89770d;

    /* JADX INFO: renamed from: e */
    public final tax0 f89771e;

    /* JADX INFO: renamed from: f */
    public final tax0 f89772f;

    /* JADX INFO: renamed from: g */
    public final tax0 f89773g;

    /* JADX INFO: renamed from: h */
    public final tax0 f89774h;

    /* JADX INFO: renamed from: i */
    public final tax0 f89775i;

    /* JADX INFO: renamed from: j */
    public final tax0 f89776j;

    public e7y0(C2461j c2461j) {
        super(c2461j);
        this.f89770d = new HashMap();
        u9x0 u9x0VarMo15088d = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d);
        this.f89771e = new tax0(u9x0VarMo15088d, "last_delete_stale", 0L);
        u9x0 u9x0VarMo15088d2 = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d2);
        this.f89772f = new tax0(u9x0VarMo15088d2, "last_delete_stale_batch", 0L);
        u9x0 u9x0VarMo15088d3 = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d3);
        this.f89773g = new tax0(u9x0VarMo15088d3, "backoff", 0L);
        u9x0 u9x0VarMo15088d4 = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d4);
        this.f89774h = new tax0(u9x0VarMo15088d4, "last_upload", 0L);
        u9x0 u9x0VarMo15088d5 = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d5);
        this.f89775i = new tax0(u9x0VarMo15088d5, "last_upload_attempt", 0L);
        u9x0 u9x0VarMo15088d6 = mo15088d();
        Objects.requireNonNull(u9x0VarMo15088d6);
        this.f89776j = new tax0(u9x0VarMo15088d6, "midnight_offset", 0L);
    }

    @WorkerThread
    @Deprecated
    /* JADX INFO: renamed from: s */
    private final Pair<String, Boolean> m115228s(String str) {
        c7y0 c7y0Var;
        AdvertisingIdClient.C2070a advertisingIdInfo;
        mo15092h();
        long jElapsedRealtime = zzb().elapsedRealtime();
        c7y0 c7y0Var2 = this.f89770d.get(str);
        if (c7y0Var2 != null && jElapsedRealtime < c7y0Var2.f79668c) {
            return new Pair<>(c7y0Var2.f79666a, Boolean.valueOf(c7y0Var2.f79667b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jM192657w = mo15085a().m192657w(str) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (c7y0Var2 != null && jElapsedRealtime < c7y0Var2.f79668c + mo15085a().m192655u(str, q8s0.f153274c)) {
                    return new Pair<>(c7y0Var2.f79666a, Boolean.valueOf(c7y0Var2.f79667b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strM12233a = advertisingIdInfo.m12233a();
            c7y0Var = strM12233a != null ? new c7y0(strM12233a, advertisingIdInfo.m12234b(), jM192657w) : new c7y0("", advertisingIdInfo.m12234b(), jM192657w);
            this.f89770d.put(str, c7y0Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair<>(c7y0Var.f79666a, Boolean.valueOf(c7y0Var.f79667b));
        } catch (Exception e) {
            zzj().m211424z().m123937b("Unable to get advertising id", e);
            c7y0Var = new c7y0("", false, jM192657w);
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

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final Pair<String, Boolean> m115229t(String str, zzje zzjeVar) {
        return zzjeVar.m15357y() ? m115228s(str) : new Pair<>("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    /* JADX INFO: renamed from: u */
    public final String m115230u(String str, boolean z) {
        mo15092h();
        String str2 = z ? (String) m115228s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM101432P0 = bey0.m101432P0();
        if (messageDigestM101432P0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM101432P0.digest(str2.getBytes())));
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
