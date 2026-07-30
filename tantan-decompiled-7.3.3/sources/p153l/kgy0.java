package p153l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2479e;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzje;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class kgy0 extends njy0 {

    /* JADX INFO: renamed from: d */
    public final Map<String, igy0> f126669d;

    /* JADX INFO: renamed from: e */
    public final zjx0 f126670e;

    /* JADX INFO: renamed from: f */
    public final zjx0 f126671f;

    /* JADX INFO: renamed from: g */
    public final zjx0 f126672g;

    /* JADX INFO: renamed from: h */
    public final zjx0 f126673h;

    /* JADX INFO: renamed from: i */
    public final zjx0 f126674i;

    /* JADX INFO: renamed from: j */
    public final zjx0 f126675j;

    public kgy0(C2484j c2484j) {
        super(c2484j);
        this.f126669d = new HashMap();
        ajx0 ajx0VarMo15142d = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d);
        this.f126670e = new zjx0(ajx0VarMo15142d, "last_delete_stale", 0L);
        ajx0 ajx0VarMo15142d2 = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d2);
        this.f126671f = new zjx0(ajx0VarMo15142d2, "last_delete_stale_batch", 0L);
        ajx0 ajx0VarMo15142d3 = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d3);
        this.f126672g = new zjx0(ajx0VarMo15142d3, "backoff", 0L);
        ajx0 ajx0VarMo15142d4 = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d4);
        this.f126673h = new zjx0(ajx0VarMo15142d4, "last_upload", 0L);
        ajx0 ajx0VarMo15142d5 = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d5);
        this.f126674i = new zjx0(ajx0VarMo15142d5, "last_upload_attempt", 0L);
        ajx0 ajx0VarMo15142d6 = mo15142d();
        Objects.requireNonNull(ajx0VarMo15142d6);
        this.f126675j = new zjx0(ajx0VarMo15142d6, "midnight_offset", 0L);
    }

    @WorkerThread
    @Deprecated
    /* JADX INFO: renamed from: s */
    private final Pair<String, Boolean> m149776s(String str) {
        igy0 igy0Var;
        AdvertisingIdClient.C2093a advertisingIdInfo;
        mo15146h();
        long jElapsedRealtime = zzb().elapsedRealtime();
        igy0 igy0Var2 = this.f126669d.get(str);
        if (igy0Var2 != null && jElapsedRealtime < igy0Var2.f114834c) {
            return new Pair<>(igy0Var2.f114832a, Boolean.valueOf(igy0Var2.f114833b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jM98449w = mo15139a().m98449w(str) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (igy0Var2 != null && jElapsedRealtime < igy0Var2.f114834c + mo15139a().m98447u(str, whs0.f189250c)) {
                    return new Pair<>(igy0Var2.f114832a, Boolean.valueOf(igy0Var2.f114833b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String strM12287a = advertisingIdInfo.m12287a();
            igy0Var = strM12287a != null ? new igy0(strM12287a, advertisingIdInfo.m12288b(), jM98449w) : new igy0("", advertisingIdInfo.m12288b(), jM98449w);
            this.f126669d.put(str, igy0Var);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair<>(igy0Var.f114832a, Boolean.valueOf(igy0Var.f114833b));
        } catch (Exception e) {
            zzj().m114570z().m153301b("Unable to get advertising id", e);
            igy0Var = new igy0("", false, jM98449w);
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

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ vmy0 mo15192i() {
        return super.mo15192i();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pwy0 mo15193j() {
        return super.mo15193j();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ opr0 mo15194k() {
        return super.mo15194k();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2479e mo15195l() {
        return super.mo15195l();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kgy0 mo15196m() {
        return super.mo15196m();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ vjy0 mo15197n() {
        return super.mo15197n();
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final Pair<String, Boolean> m149777t(String str, zzje zzjeVar) {
        return zzjeVar.m15411y() ? m149776s(str) : new Pair<>("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    /* JADX INFO: renamed from: u */
    public final String m149778u(String str, boolean z) {
        mo15146h();
        String str2 = z ? (String) m149776s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM136299P0 = hny0.m136299P0();
        if (messageDigestM136299P0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM136299P0.digest(str2.getBytes())));
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
