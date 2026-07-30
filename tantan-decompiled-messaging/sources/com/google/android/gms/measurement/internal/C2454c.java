package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;
import p149l.b3y0;
import p149l.bey0;
import p149l.bpv0;
import p149l.e9x0;
import p149l.h0s0;
import p149l.ihy0;
import p149l.iyr0;
import p149l.kjx0;
import p149l.m1y0;
import p149l.mgy0;
import p149l.n8y0;
import p149l.q8s0;
import p149l.qow0;
import p149l.t2r0;
import p149l.t9y0;
import p149l.tmw0;
import p149l.u9r0;
import p149l.u9x0;
import p149l.ujx0;
import p149l.xix0;
import p149l.xww0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2454c extends e9x0 {

    /* JADX INFO: renamed from: c */
    public String f10456c;

    /* JADX INFO: renamed from: d */
    public String f10457d;

    /* JADX INFO: renamed from: e */
    public int f10458e;

    /* JADX INFO: renamed from: f */
    public String f10459f;

    /* JADX INFO: renamed from: g */
    public long f10460g;

    /* JADX INFO: renamed from: h */
    public long f10461h;

    /* JADX INFO: renamed from: i */
    public List<String> f10462i;

    /* JADX INFO: renamed from: j */
    public String f10463j;

    /* JADX INFO: renamed from: k */
    public int f10464k;

    /* JADX INFO: renamed from: l */
    public String f10465l;

    /* JADX INFO: renamed from: m */
    public String f10466m;

    /* JADX INFO: renamed from: n */
    public String f10467n;

    /* JADX INFO: renamed from: o */
    public long f10468o;

    /* JADX INFO: renamed from: p */
    public String f10469p;

    public C2454c(ujx0 ujx0Var, long j) {
        super(ujx0Var);
        this.f10468o = 0L;
        this.f10469p = null;
        this.f10461h = j;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: D */
    private final String m15080D() {
        if (ihy0.m136327a() && mo15085a().m192648n(q8s0.f153318s0)) {
            zzj().m211416E().m123936a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> clsLoadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                } catch (Exception unused) {
                    zzj().m211418G().m123936a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().m211419H().m123936a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final String m15081A() {
        mo15092h();
        m115400p();
        Preconditions.checkNotNull(this.f10465l);
        return this.f10465l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final List<String> m15082B() {
        return this.f10462i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m15083C() {
        String str;
        mo15092h();
        if (mo15088d().m192695G().m15347m(zzje.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            mo15089e().m101477Q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().m211424z().m123936a("Analytics Storage consent is not granted");
            str = null;
        }
        zzj().m211424z().m123936a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f10467n = str;
        this.f10468o = zzb().currentTimeMillis();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m15084E(String str) {
        String str2 = this.f10469p;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.f10469p = str;
        return z;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.e9x0
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void mo15100s() {
        String str;
        String packageName = zza().getPackageName();
        PackageManager packageManager = zza().getPackageManager();
        String str2 = "";
        String installerPackageName = "unknown";
        String str3 = "Unknown";
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzj().m211412A().m123937b("PackageManager is null, app identity information might be inaccurate. appId", xww0.m211405p(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzj().m211412A().m123937b("Error retrieving app installer package name. appId", xww0.m211405p(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(zza().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str3 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str3;
                        str3 = string;
                        zzj().m211412A().m123938c("Error retrieving package info. appId, appName", xww0.m211405p(packageName), str3);
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f10456c = packageName;
        this.f10459f = installerPackageName;
        this.f10457d = str3;
        this.f10458e = i;
        this.f10460g = 0L;
        Object[] objArr = !TextUtils.isEmpty(this.f165891a.m194107H()) && "am".equals(this.f165891a.m194108I());
        int iM194126s = this.f165891a.m194126s();
        switch (iM194126s) {
            case 0:
                zzj().m211416E().m123936a("App measurement collection enabled");
                break;
            case 1:
                zzj().m211415D().m123936a("App measurement deactivated via the manifest");
                break;
            case 2:
                zzj().m211416E().m123936a("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzj().m211415D().m123936a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzj().m211415D().m123936a("App measurement disabled via the manifest");
                break;
            case 5:
                zzj().m211416E().m123936a("App measurement disabled via the init parameters");
                break;
            case 6:
                zzj().m211418G().m123936a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzj().m211415D().m123936a("App measurement disabled via the global data collection setting");
                break;
            case 8:
                zzj().m211415D().m123936a("App measurement disabled due to denied storage consent");
                break;
            default:
                zzj().m211415D().m123936a("App measurement disabled");
                zzj().m211414C().m123936a("Invalid scion state in identity");
                break;
        }
        boolean z = iM194126s == 0;
        this.f10465l = "";
        this.f10466m = "";
        if (objArr != false) {
            this.f10466m = this.f165891a.m194107H();
        }
        try {
            String strM209683b = new xix0(zza(), this.f165891a.m194110K()).m209683b("google_app_id");
            if (!TextUtils.isEmpty(strM209683b)) {
                str2 = strM209683b;
            }
            this.f10465l = str2;
            if (!TextUtils.isEmpty(strM209683b)) {
                this.f10466m = new xix0(zza(), this.f165891a.m194110K()).m209683b("admob_app_id");
            }
            if (z) {
                zzj().m211416E().m123938c("App measurement enabled for app package, google app id", this.f10456c, TextUtils.isEmpty(this.f10465l) ? this.f10466m : this.f10465l);
            }
        } catch (IllegalStateException e) {
            zzj().m211412A().m123938c("Fetching Google App Id failed with exception. appId", xww0.m211405p(packageName), e);
        }
        this.f10462i = null;
        List<String> listM192630D = mo15085a().m192630D("analytics.safelisted_events");
        if (listM192630D == null) {
            this.f10462i = listM192630D;
        } else if (listM192630D.isEmpty()) {
            zzj().m211418G().m123936a("Safelisted event list is empty. Ignoring");
        } else {
            Iterator<String> it = listM192630D.iterator();
            do {
                if (!it.hasNext()) {
                    this.f10462i = listM192630D;
                }
            } while (mo15089e().m101497q0("safelisted event", it.next()));
        }
        if (packageManager != null) {
            this.f10464k = InstantApps.isInstantApp(zza()) ? 1 : 0;
        } else {
            this.f10464k = 0;
        }
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x016f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x019f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d7  */
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final zzo m15102v(String str) {
        String str2;
        String str3;
        Boolean boolM192659y;
        boolean zBooleanValue;
        int iM15345b;
        int i;
        int iM101449s0;
        int i2;
        mo15092h();
        String strM15106z = m15106z();
        String strM15081A = m15081A();
        m115400p();
        String str4 = this.f10457d;
        long jM15104x = m15104x();
        m115400p();
        Preconditions.checkNotNull(this.f10459f);
        String str5 = this.f10459f;
        m115400p();
        mo15092h();
        if (this.f10460g == 0) {
            this.f10460g = this.f165891a.m194106G().m101499t(zza(), zza().getPackageName());
        }
        long j = this.f10460g;
        boolean zM194118k = this.f165891a.m194118k();
        boolean z = !mo15088d().f175532t;
        mo15092h();
        String str6 = null;
        String strM15080D = !this.f165891a.m194118k() ? null : m15080D();
        ujx0 ujx0Var = this.f165891a;
        String str7 = strM15080D;
        long jM187782a = ujx0Var.m194100A().f175519g.m187782a();
        long jMin = ujx0Var.f176848H;
        if (jM187782a != 0) {
            jMin = Math.min(jMin, jM187782a);
        }
        int iM15103w = m15103w();
        boolean zM192638O = mo15085a().m192638O();
        u9x0 u9x0VarMo15088d = mo15088d();
        u9x0VarMo15088d.mo15092h();
        boolean z2 = u9x0VarMo15088d.m192692D().getBoolean("deferred_analytics_collection", false);
        long jM101467K0 = 0;
        long j2 = jMin;
        String strM15105y = m15105y();
        Boolean boolM192659y2 = mo15085a().m192659y("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolM192659y2 == null ? null : Boolean.valueOf(!boolM192659y2.booleanValue());
        long j3 = this.f10461h;
        Boolean bool = boolValueOf;
        List<String> list = this.f10462i;
        String strM15356x = mo15088d().m192695G().m15356x();
        if (this.f10463j == null) {
            this.f10463j = mo15089e().m101474O0();
        }
        String str8 = this.f10463j;
        if (t9y0.m187687a()) {
            str2 = str8;
            str3 = strM15081A;
            if (!mo15085a().m192648n(q8s0.f153265Y0) || mo15088d().m192695G().m15347m(zzje.zza.ANALYTICS_STORAGE)) {
            }
            boolM192659y = mo15085a().m192659y("google_analytics_sgtm_upload_enabled");
            if (boolM192659y == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = boolM192659y.booleanValue();
            }
            long jM101500t0 = mo15089e().m101500t0(m15106z());
            iM15345b = mo15088d().m192695G().m15345b();
            String strM15077j = mo15088d().m192694F().m15077j();
            if (mgy0.m154586a()) {
                i = iM15345b;
                if (mo15085a().m192648n(q8s0.f153235J0)) {
                    mo15089e();
                    iM101449s0 = bey0.m101449s0();
                }
                if (mgy0.m154586a()) {
                    i2 = iM101449s0;
                    if (mo15085a().m192648n(q8s0.f153235J0)) {
                        jM101467K0 = mo15089e().m101467K0();
                    }
                } else {
                    i2 = iM101449s0;
                }
                return new zzo(strM15106z, str3, str4, jM15104x, str5, 106000L, j, str, zM194118k, z, str7, 0L, j2, iM15103w, zM192638O, z2, strM15105y, bool, j3, list, (String) null, strM15356x, str2, str6, zBooleanValue, jM101500t0, i, strM15077j, i2, jM101467K0, mo15085a().m192637N(), new bpv0(mo15085a().m192656v("google_analytics_default_allow_ad_personalization_signals", true)).m103096c());
            }
            i = iM15345b;
            iM101449s0 = 0;
            if (mgy0.m154586a()) {
                i2 = iM101449s0;
                if (mo15085a().m192648n(q8s0.f153235J0)) {
                    jM101467K0 = mo15089e().m101467K0();
                }
            } else {
                i2 = iM101449s0;
            }
            return new zzo(strM15106z, str3, str4, jM15104x, str5, 106000L, j, str, zM194118k, z, str7, 0L, j2, iM15103w, zM192638O, z2, strM15105y, bool, j3, list, (String) null, strM15356x, str2, str6, zBooleanValue, jM101500t0, i, strM15077j, i2, jM101467K0, mo15085a().m192637N(), new bpv0(mo15085a().m192656v("google_analytics_default_allow_ad_personalization_signals", true)).m103096c());
        }
        str2 = str8;
        str3 = strM15081A;
        mo15092h();
        if (this.f10468o != 0) {
            long jCurrentTimeMillis = zzb().currentTimeMillis() - this.f10468o;
            if (this.f10467n != null && jCurrentTimeMillis > 86400000 && this.f10469p == null) {
                m15083C();
            }
        }
        if (this.f10467n == null) {
            m15083C();
        }
        str6 = this.f10467n;
        boolM192659y = mo15085a().m192659y("google_analytics_sgtm_upload_enabled");
        if (boolM192659y == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM192659y.booleanValue();
        }
        long jM101500t1 = mo15089e().m101500t0(m15106z());
        iM15345b = mo15088d().m192695G().m15345b();
        String strM15077j2 = mo15088d().m192694F().m15077j();
        if (mgy0.m154586a()) {
            i = iM15345b;
            if (mo15085a().m192648n(q8s0.f153235J0)) {
                mo15089e();
                iM101449s0 = bey0.m101449s0();
            }
            if (mgy0.m154586a()) {
                i2 = iM101449s0;
                if (mo15085a().m192648n(q8s0.f153235J0)) {
                    jM101467K0 = mo15089e().m101467K0();
                }
            } else {
                i2 = iM101449s0;
            }
            return new zzo(strM15106z, str3, str4, jM15104x, str5, 106000L, j, str, zM194118k, z, str7, 0L, j2, iM15103w, zM192638O, z2, strM15105y, bool, j3, list, (String) null, strM15356x, str2, str6, zBooleanValue, jM101500t1, i, strM15077j2, i2, jM101467K0, mo15085a().m192637N(), new bpv0(mo15085a().m192656v("google_analytics_default_allow_ad_personalization_signals", true)).m103096c());
        }
        i = iM15345b;
        iM101449s0 = 0;
        if (mgy0.m154586a()) {
            i2 = iM101449s0;
            if (mo15085a().m192648n(q8s0.f153235J0)) {
                jM101467K0 = mo15089e().m101467K0();
            }
        } else {
            i2 = iM101449s0;
        }
        return new zzo(strM15106z, str3, str4, jM15104x, str5, 106000L, j, str, zM194118k, z, str7, 0L, j2, iM15103w, zM192638O, z2, strM15105y, bool, j3, list, (String) null, strM15356x, str2, str6, zBooleanValue, jM101500t1, i, strM15077j2, i2, jM101467K0, mo15085a().m192637N(), new bpv0(mo15085a().m192656v("google_analytics_default_allow_ad_personalization_signals", true)).m103096c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final int m15103w() {
        m115400p();
        return this.f10464k;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final int m15104x() {
        m115400p();
        return this.f10458e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final String m15105y() {
        m115400p();
        return this.f10466m;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final String m15106z() {
        m115400p();
        Preconditions.checkNotNull(this.f10456c);
        return this.f10456c;
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
