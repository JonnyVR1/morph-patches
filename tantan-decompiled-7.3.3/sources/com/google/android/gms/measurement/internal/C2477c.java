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
import p153l.ajr0;
import p153l.ajx0;
import p153l.atx0;
import p153l.d6x0;
import p153l.dsx0;
import p153l.hcy0;
import p153l.hny0;
import p153l.hyv0;
import p153l.kix0;
import p153l.n9s0;
import p153l.o7s0;
import p153l.oqy0;
import p153l.qsx0;
import p153l.say0;
import p153l.spy0;
import p153l.thy0;
import p153l.whs0;
import p153l.wxw0;
import p153l.zbr0;
import p153l.ziy0;
import p153l.zvw0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2477c extends kix0 {

    /* JADX INFO: renamed from: c */
    public String f10493c;

    /* JADX INFO: renamed from: d */
    public String f10494d;

    /* JADX INFO: renamed from: e */
    public int f10495e;

    /* JADX INFO: renamed from: f */
    public String f10496f;

    /* JADX INFO: renamed from: g */
    public long f10497g;

    /* JADX INFO: renamed from: h */
    public long f10498h;

    /* JADX INFO: renamed from: i */
    public List<String> f10499i;

    /* JADX INFO: renamed from: j */
    public String f10500j;

    /* JADX INFO: renamed from: k */
    public int f10501k;

    /* JADX INFO: renamed from: l */
    public String f10502l;

    /* JADX INFO: renamed from: m */
    public String f10503m;

    /* JADX INFO: renamed from: n */
    public String f10504n;

    /* JADX INFO: renamed from: o */
    public long f10505o;

    /* JADX INFO: renamed from: p */
    public String f10506p;

    public C2477c(atx0 atx0Var, long j) {
        super(atx0Var);
        this.f10505o = 0L;
        this.f10506p = null;
        this.f10498h = j;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: D */
    private final String m15134D() {
        if (oqy0.m168850a() && mo15139a().m98440n(whs0.f189294s0)) {
            zzj().m114562E().m153300a("Disabled IID for tests.");
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
                    zzj().m114564G().m153300a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().m114565H().m153300a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final String m15135A() {
        mo15146h();
        m149988p();
        Preconditions.checkNotNull(this.f10502l);
        return this.f10502l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final List<String> m15136B() {
        return this.f10499i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m15137C() {
        String str;
        mo15146h();
        if (mo15142d().m98510G().m15401m(zzje.zza.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            mo15143e().m136344Q0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().m114570z().m153300a("Analytics Storage consent is not granted");
            str = null;
        }
        zzj().m114570z().m153300a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f10504n = str;
        this.f10505o = zzb().currentTimeMillis();
    }

    /* JADX INFO: renamed from: E */
    public final boolean m15138E(String str) {
        String str2 = this.f10506p;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.f10506p = str;
        return z;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.kix0
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void mo15154s() {
        String str;
        String packageName = zza().getPackageName();
        PackageManager packageManager = zza().getPackageManager();
        String str2 = "";
        String installerPackageName = "unknown";
        String str3 = "Unknown";
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzj().m114558A().m153301b("PackageManager is null, app identity information might be inaccurate. appId", d6x0.m114551p(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzj().m114558A().m153301b("Error retrieving app installer package name. appId", d6x0.m114551p(packageName));
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
                        zzj().m114558A().m153302c("Error retrieving package info. appId, appName", d6x0.m114551p(packageName), str3);
                        str3 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f10493c = packageName;
        this.f10496f = installerPackageName;
        this.f10494d = str3;
        this.f10495e = i;
        this.f10497g = 0L;
        Object[] objArr = !TextUtils.isEmpty(this.f202159a.m100287H()) && "am".equals(this.f202159a.m100288I());
        int iM100306s = this.f202159a.m100306s();
        switch (iM100306s) {
            case 0:
                zzj().m114562E().m153300a("App measurement collection enabled");
                break;
            case 1:
                zzj().m114561D().m153300a("App measurement deactivated via the manifest");
                break;
            case 2:
                zzj().m114562E().m153300a("App measurement deactivated via the init parameters");
                break;
            case 3:
                zzj().m114561D().m153300a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            case 4:
                zzj().m114561D().m153300a("App measurement disabled via the manifest");
                break;
            case 5:
                zzj().m114562E().m153300a("App measurement disabled via the init parameters");
                break;
            case 6:
                zzj().m114564G().m153300a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            case 7:
                zzj().m114561D().m153300a("App measurement disabled via the global data collection setting");
                break;
            case 8:
                zzj().m114561D().m153300a("App measurement disabled due to denied storage consent");
                break;
            default:
                zzj().m114561D().m153300a("App measurement disabled");
                zzj().m114560C().m153300a("Invalid scion state in identity");
                break;
        }
        boolean z = iM100306s == 0;
        this.f10502l = "";
        this.f10503m = "";
        if (objArr != false) {
            this.f10503m = this.f202159a.m100287H();
        }
        try {
            String strM117785b = new dsx0(zza(), this.f202159a.m100290K()).m117785b("google_app_id");
            if (!TextUtils.isEmpty(strM117785b)) {
                str2 = strM117785b;
            }
            this.f10502l = str2;
            if (!TextUtils.isEmpty(strM117785b)) {
                this.f10503m = new dsx0(zza(), this.f202159a.m100290K()).m117785b("admob_app_id");
            }
            if (z) {
                zzj().m114562E().m153302c("App measurement enabled for app package, google app id", this.f10493c, TextUtils.isEmpty(this.f10502l) ? this.f10503m : this.f10502l);
            }
        } catch (IllegalStateException e) {
            zzj().m114558A().m153302c("Fetching Google App Id failed with exception. appId", d6x0.m114551p(packageName), e);
        }
        this.f10499i = null;
        List<String> listM98422D = mo15139a().m98422D("analytics.safelisted_events");
        if (listM98422D == null) {
            this.f10499i = listM98422D;
        } else if (listM98422D.isEmpty()) {
            zzj().m114564G().m153300a("Safelisted event list is empty. Ignoring");
        } else {
            Iterator<String> it = listM98422D.iterator();
            do {
                if (!it.hasNext()) {
                    this.f10499i = listM98422D;
                }
            } while (mo15143e().m136362q0("safelisted event", it.next()));
        }
        if (packageManager != null) {
            this.f10501k = InstantApps.isInstantApp(zza()) ? 1 : 0;
        } else {
            this.f10501k = 0;
        }
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
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
    public final zzo m15156v(String str) {
        String str2;
        String str3;
        Boolean boolM98451y;
        boolean zBooleanValue;
        int iM15399b;
        int i;
        int iM136316s0;
        int i2;
        mo15146h();
        String strM15160z = m15160z();
        String strM15135A = m15135A();
        m149988p();
        String str4 = this.f10494d;
        long jM15158x = m15158x();
        m149988p();
        Preconditions.checkNotNull(this.f10496f);
        String str5 = this.f10496f;
        m149988p();
        mo15146h();
        if (this.f10497g == 0) {
            this.f10497g = this.f202159a.m100286G().m136364t(zza(), zza().getPackageName());
        }
        long j = this.f10497g;
        boolean zM100298k = this.f202159a.m100298k();
        boolean z = !mo15142d().f71913t;
        mo15146h();
        String str6 = null;
        String strM15134D = !this.f202159a.m100298k() ? null : m15134D();
        atx0 atx0Var = this.f202159a;
        String str7 = strM15134D;
        long jM219990a = atx0Var.m100280A().f71900g.m219990a();
        long jMin = atx0Var.f73428H;
        if (jM219990a != 0) {
            jMin = Math.min(jMin, jM219990a);
        }
        int iM15157w = m15157w();
        boolean zM98430O = mo15139a().m98430O();
        ajx0 ajx0VarMo15142d = mo15142d();
        ajx0VarMo15142d.mo15146h();
        boolean z2 = ajx0VarMo15142d.m98507D().getBoolean("deferred_analytics_collection", false);
        long jM136334K0 = 0;
        long j2 = jMin;
        String strM15159y = m15159y();
        Boolean boolM98451y2 = mo15139a().m98451y("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolM98451y2 == null ? null : Boolean.valueOf(!boolM98451y2.booleanValue());
        long j3 = this.f10498h;
        Boolean bool = boolValueOf;
        List<String> list = this.f10499i;
        String strM15410x = mo15142d().m98510G().m15410x();
        if (this.f10500j == null) {
            this.f10500j = mo15143e().m136341O0();
        }
        String str8 = this.f10500j;
        if (ziy0.m219953a()) {
            str2 = str8;
            str3 = strM15135A;
            if (!mo15139a().m98440n(whs0.f189241Y0) || mo15142d().m98510G().m15401m(zzje.zza.ANALYTICS_STORAGE)) {
            }
            boolM98451y = mo15139a().m98451y("google_analytics_sgtm_upload_enabled");
            if (boolM98451y == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = boolM98451y.booleanValue();
            }
            long jM136365t0 = mo15143e().m136365t0(m15160z());
            iM15399b = mo15142d().m98510G().m15399b();
            String strM15131j = mo15142d().m98509F().m15131j();
            if (spy0.m187491a()) {
                i = iM15399b;
                if (mo15139a().m98440n(whs0.f189211J0)) {
                    mo15143e();
                    iM136316s0 = hny0.m136316s0();
                }
                if (spy0.m187491a()) {
                    i2 = iM136316s0;
                    if (mo15139a().m98440n(whs0.f189211J0)) {
                        jM136334K0 = mo15143e().m136334K0();
                    }
                } else {
                    i2 = iM136316s0;
                }
                return new zzo(strM15160z, str3, str4, jM15158x, str5, 106000L, j, str, zM100298k, z, str7, 0L, j2, iM15157w, zM98430O, z2, strM15159y, bool, j3, list, (String) null, strM15410x, str2, str6, zBooleanValue, jM136365t0, i, strM15131j, i2, jM136334K0, mo15139a().m98429N(), new hyv0(mo15139a().m98448v("google_analytics_default_allow_ad_personalization_signals", true)).m137783c());
            }
            i = iM15399b;
            iM136316s0 = 0;
            if (spy0.m187491a()) {
                i2 = iM136316s0;
                if (mo15139a().m98440n(whs0.f189211J0)) {
                    jM136334K0 = mo15143e().m136334K0();
                }
            } else {
                i2 = iM136316s0;
            }
            return new zzo(strM15160z, str3, str4, jM15158x, str5, 106000L, j, str, zM100298k, z, str7, 0L, j2, iM15157w, zM98430O, z2, strM15159y, bool, j3, list, (String) null, strM15410x, str2, str6, zBooleanValue, jM136365t0, i, strM15131j, i2, jM136334K0, mo15139a().m98429N(), new hyv0(mo15139a().m98448v("google_analytics_default_allow_ad_personalization_signals", true)).m137783c());
        }
        str2 = str8;
        str3 = strM15135A;
        mo15146h();
        if (this.f10505o != 0) {
            long jCurrentTimeMillis = zzb().currentTimeMillis() - this.f10505o;
            if (this.f10504n != null && jCurrentTimeMillis > 86400000 && this.f10506p == null) {
                m15137C();
            }
        }
        if (this.f10504n == null) {
            m15137C();
        }
        str6 = this.f10504n;
        boolM98451y = mo15139a().m98451y("google_analytics_sgtm_upload_enabled");
        if (boolM98451y == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM98451y.booleanValue();
        }
        long jM136365t1 = mo15143e().m136365t0(m15160z());
        iM15399b = mo15142d().m98510G().m15399b();
        String strM15131j2 = mo15142d().m98509F().m15131j();
        if (spy0.m187491a()) {
            i = iM15399b;
            if (mo15139a().m98440n(whs0.f189211J0)) {
                mo15143e();
                iM136316s0 = hny0.m136316s0();
            }
            if (spy0.m187491a()) {
                i2 = iM136316s0;
                if (mo15139a().m98440n(whs0.f189211J0)) {
                    jM136334K0 = mo15143e().m136334K0();
                }
            } else {
                i2 = iM136316s0;
            }
            return new zzo(strM15160z, str3, str4, jM15158x, str5, 106000L, j, str, zM100298k, z, str7, 0L, j2, iM15157w, zM98430O, z2, strM15159y, bool, j3, list, (String) null, strM15410x, str2, str6, zBooleanValue, jM136365t1, i, strM15131j2, i2, jM136334K0, mo15139a().m98429N(), new hyv0(mo15139a().m98448v("google_analytics_default_allow_ad_personalization_signals", true)).m137783c());
        }
        i = iM15399b;
        iM136316s0 = 0;
        if (spy0.m187491a()) {
            i2 = iM136316s0;
            if (mo15139a().m98440n(whs0.f189211J0)) {
                jM136334K0 = mo15143e().m136334K0();
            }
        } else {
            i2 = iM136316s0;
        }
        return new zzo(strM15160z, str3, str4, jM15158x, str5, 106000L, j, str, zM100298k, z, str7, 0L, j2, iM15157w, zM98430O, z2, strM15159y, bool, j3, list, (String) null, strM15410x, str2, str6, zBooleanValue, jM136365t1, i, strM15131j2, i2, jM136334K0, mo15139a().m98429N(), new hyv0(mo15139a().m98448v("google_analytics_default_allow_ad_personalization_signals", true)).m137783c());
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final int m15157w() {
        m149988p();
        return this.f10501k;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final int m15158x() {
        m149988p();
        return this.f10495e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final String m15159y() {
        m149988p();
        return this.f10503m;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final String m15160z() {
        m149988p();
        Preconditions.checkNotNull(this.f10493c);
        return this.f10493c;
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
