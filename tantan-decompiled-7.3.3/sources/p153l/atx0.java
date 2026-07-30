package p153l;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.measurement.internal.C2476b;
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.LinkAction;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class atx0 implements hzx0 {

    /* JADX INFO: renamed from: I */
    public static volatile atx0 f73420I;

    /* JADX INFO: renamed from: A */
    public volatile Boolean f73421A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public Boolean f73422B;

    /* JADX INFO: renamed from: C */
    @VisibleForTesting
    public Boolean f73423C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f73424D;

    /* JADX INFO: renamed from: E */
    public int f73425E;

    /* JADX INFO: renamed from: F */
    public int f73426F;

    /* JADX INFO: renamed from: H */
    @VisibleForTesting
    public final long f73428H;

    /* JADX INFO: renamed from: a */
    public final Context f73429a;

    /* JADX INFO: renamed from: b */
    public final String f73430b;

    /* JADX INFO: renamed from: c */
    public final String f73431c;

    /* JADX INFO: renamed from: d */
    public final String f73432d;

    /* JADX INFO: renamed from: e */
    public final boolean f73433e;

    /* JADX INFO: renamed from: f */
    public final zbr0 f73434f;

    /* JADX INFO: renamed from: g */
    public final ajr0 f73435g;

    /* JADX INFO: renamed from: h */
    public final ajx0 f73436h;

    /* JADX INFO: renamed from: i */
    public final d6x0 f73437i;

    /* JADX INFO: renamed from: j */
    public final qsx0 f73438j;

    /* JADX INFO: renamed from: k */
    public final thy0 f73439k;

    /* JADX INFO: renamed from: l */
    public final hny0 f73440l;

    /* JADX INFO: renamed from: m */
    public final wxw0 f73441m;

    /* JADX INFO: renamed from: n */
    public final Clock f73442n;

    /* JADX INFO: renamed from: o */
    public final say0 f73443o;

    /* JADX INFO: renamed from: p */
    public final C2481g f73444p;

    /* JADX INFO: renamed from: q */
    public final n9s0 f73445q;

    /* JADX INFO: renamed from: r */
    public final y9y0 f73446r;

    /* JADX INFO: renamed from: s */
    public final String f73447s;

    /* JADX INFO: renamed from: t */
    public zvw0 f73448t;

    /* JADX INFO: renamed from: u */
    public hcy0 f73449u;

    /* JADX INFO: renamed from: v */
    public o7s0 f73450v;

    /* JADX INFO: renamed from: w */
    public C2477c f73451w;

    /* JADX INFO: renamed from: y */
    public Boolean f73453y;

    /* JADX INFO: renamed from: z */
    public long f73454z;

    /* JADX INFO: renamed from: x */
    public boolean f73452x = false;

    /* JADX INFO: renamed from: G */
    public AtomicInteger f73427G = new AtomicInteger(0);

    public atx0(h1y0 h1y0Var) {
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(h1y0Var);
        zbr0 zbr0Var = new zbr0(h1y0Var.f107498a);
        this.f73434f = zbr0Var;
        qrw0.f159225a = zbr0Var;
        Context context = h1y0Var.f107498a;
        this.f73429a = context;
        this.f73430b = h1y0Var.f107499b;
        this.f73431c = h1y0Var.f107500c;
        this.f73432d = h1y0Var.f107501d;
        this.f73433e = h1y0Var.f107505h;
        this.f73421A = h1y0Var.f107502e;
        this.f73447s = h1y0Var.f107507j;
        this.f73424D = true;
        zzdw zzdwVar = h1y0Var.f107504g;
        if (zzdwVar != null && (bundle = zzdwVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f73422B = (Boolean) obj;
            }
            Object obj2 = zzdwVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f73423C = (Boolean) obj2;
            }
        }
        sqx0.m187568l(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f73442n = defaultClock;
        Long l2 = h1y0Var.f107506i;
        this.f73428H = l2 != null ? l2.longValue() : defaultClock.currentTimeMillis();
        this.f73435g = new ajr0(this);
        ajx0 ajx0Var = new ajx0(this);
        ajx0Var.m160931k();
        this.f73436h = ajx0Var;
        d6x0 d6x0Var = new d6x0(this);
        d6x0Var.m160931k();
        this.f73437i = d6x0Var;
        hny0 hny0Var = new hny0(this);
        hny0Var.m160931k();
        this.f73440l = hny0Var;
        this.f73441m = new wxw0(new c1y0(h1y0Var, this));
        this.f73445q = new n9s0(this);
        say0 say0Var = new say0(this);
        say0Var.m149989q();
        this.f73443o = say0Var;
        C2481g c2481g = new C2481g(this);
        c2481g.m149989q();
        this.f73444p = c2481g;
        thy0 thy0Var = new thy0(this);
        thy0Var.m149989q();
        this.f73439k = thy0Var;
        y9y0 y9y0Var = new y9y0(this);
        y9y0Var.m160931k();
        this.f73446r = y9y0Var;
        qsx0 qsx0Var = new qsx0(this);
        qsx0Var.m160931k();
        this.f73438j = qsx0Var;
        zzdw zzdwVar2 = h1y0Var.f107504g;
        if (zzdwVar2 != null && zzdwVar2.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            m100282C().m15242P0(z2);
        } else {
            zzj().m114563F().m153300a("Application context is not an Application");
        }
        qsx0Var.m177841w(new nux0(this, h1y0Var));
    }

    /* JADX INFO: renamed from: a */
    public static atx0 m100275a(Context context, zzdw zzdwVar, Long l2) {
        Bundle bundle;
        if (zzdwVar != null && (zzdwVar.zze == null || zzdwVar.zzf == null)) {
            zzdwVar = new zzdw(zzdwVar.zza, zzdwVar.zzb, zzdwVar.zzc, zzdwVar.zzd, null, null, zzdwVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f73420I == null) {
            synchronized (atx0.class) {
                try {
                    if (f73420I == null) {
                        f73420I = new atx0(new h1y0(context, zzdwVar, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdwVar != null && (bundle = zzdwVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f73420I);
            f73420I.m100295h(zzdwVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f73420I);
        return f73420I;
    }

    /* JADX INFO: renamed from: d */
    public static void m100276d(kix0 kix0Var) {
        if (kix0Var == null) {
            wtq0.m207906a("Component not created");
        } else {
            if (kix0Var.m149991t()) {
                return;
            }
            wtq0.m207906a("Component not initialized: ".concat(String.valueOf(kix0Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m100277e(atx0 atx0Var, h1y0 h1y0Var) {
        atx0Var.zzl().mo15146h();
        o7s0 o7s0Var = new o7s0(atx0Var);
        o7s0Var.m160931k();
        atx0Var.f73450v = o7s0Var;
        C2477c c2477c = new C2477c(atx0Var, h1y0Var.f107503f);
        c2477c.m149989q();
        atx0Var.f73451w = c2477c;
        zvw0 zvw0Var = new zvw0(atx0Var);
        zvw0Var.m149989q();
        atx0Var.f73448t = zvw0Var;
        hcy0 hcy0Var = new hcy0(atx0Var);
        hcy0Var.m149989q();
        atx0Var.f73449u = hcy0Var;
        atx0Var.f73440l.m160932l();
        atx0Var.f73436h.m160932l();
        atx0Var.f73451w.m149990r();
        atx0Var.zzj().m114561D().m153301b("App measurement initialized, version", 106000L);
        atx0Var.zzj().m114561D().m153300a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strM15160z = c2477c.m15160z();
        if (TextUtils.isEmpty(atx0Var.f73430b)) {
            if (atx0Var.m100286G().m136370y0(strM15160z, atx0Var.f73435g.m98429N())) {
                atx0Var.zzj().m114561D().m153300a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                atx0Var.zzj().m114561D().m153300a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strM15160z);
            }
        }
        atx0Var.zzj().m114570z().m153300a("Debug-level message logging enabled");
        if (atx0Var.f73425E != atx0Var.f73427G.get()) {
            atx0Var.zzj().m114558A().m153302c("Not all components initialized", Integer.valueOf(atx0Var.f73425E), Integer.valueOf(atx0Var.f73427G.get()));
        }
        atx0Var.f73452x = true;
    }

    /* JADX INFO: renamed from: f */
    public static void m100278f(yyx0 yyx0Var) {
        if (yyx0Var != null) {
            return;
        }
        wtq0.m207906a("Component not created");
    }

    /* JADX INFO: renamed from: g */
    public static void m100279g(mzx0 mzx0Var) {
        if (mzx0Var == null) {
            wtq0.m207906a("Component not created");
        } else {
            if (mzx0Var.m160933m()) {
                return;
            }
            wtq0.m207906a("Component not initialized: ".concat(String.valueOf(mzx0Var.getClass())));
        }
    }

    @Pure
    /* JADX INFO: renamed from: A */
    public final ajx0 m100280A() {
        m100278f(this.f73436h);
        return this.f73436h;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: B */
    public final qsx0 m100281B() {
        return this.f73438j;
    }

    @Pure
    /* JADX INFO: renamed from: C */
    public final C2481g m100282C() {
        m100276d(this.f73444p);
        return this.f73444p;
    }

    @Pure
    /* JADX INFO: renamed from: D */
    public final say0 m100283D() {
        m100276d(this.f73443o);
        return this.f73443o;
    }

    @Pure
    /* JADX INFO: renamed from: E */
    public final hcy0 m100284E() {
        m100276d(this.f73449u);
        return this.f73449u;
    }

    @Pure
    /* JADX INFO: renamed from: F */
    public final thy0 m100285F() {
        m100276d(this.f73439k);
        return this.f73439k;
    }

    @Pure
    /* JADX INFO: renamed from: G */
    public final hny0 m100286G() {
        m100278f(this.f73440l);
        return this.f73440l;
    }

    @Pure
    /* JADX INFO: renamed from: H */
    public final String m100287H() {
        return this.f73430b;
    }

    @Pure
    /* JADX INFO: renamed from: I */
    public final String m100288I() {
        return this.f73431c;
    }

    @Pure
    /* JADX INFO: renamed from: J */
    public final String m100289J() {
        return this.f73432d;
    }

    @Pure
    /* JADX INFO: renamed from: K */
    public final String m100290K() {
        return this.f73447s;
    }

    /* JADX INFO: renamed from: L */
    public final void m100291L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: renamed from: M */
    public final void m100292M() {
        this.f73427G.incrementAndGet();
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m100293b(zzdw zzdwVar) {
        zzje zzjeVarM15388e;
        Boolean boolM15125e;
        zzl().mo15146h();
        if (spy0.m187491a() && this.f73435g.m98440n(whs0.f189211J0) && m100286G().m136346R0()) {
            hny0 hny0VarM100286G = m100286G();
            hny0VarM100286G.mo15146h();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            j26.m143198k(hny0VarM100286G.zza(), new zzp(hny0VarM100286G.f202159a), intentFilter, 2);
            hny0VarM100286G.zzj().m114570z().m153300a("Registered app receiver");
        }
        zzje zzjeVarM98510G = m100280A().m98510G();
        int iM15399b = zzjeVarM98510G.m15399b();
        zzjh zzjhVarM98448v = this.f73435g.m98448v("google_analytics_default_allow_ad_storage", false);
        zzjh zzjhVarM98448v2 = this.f73435g.m98448v("google_analytics_default_allow_analytics_storage", false);
        zzjh zzjhVar = zzjh.UNINITIALIZED;
        if (!(zzjhVarM98448v == zzjhVar && zzjhVarM98448v2 == zzjhVar) && m100280A().m98524s(-10)) {
            zzjeVarM15388e = zzje.m15388e(zzjhVarM98448v, zzjhVarM98448v2, -10);
        } else {
            if (!TextUtils.isEmpty(m100310w().m15135A()) && (iM15399b == 0 || iM15399b == 30 || iM15399b == 10 || iM15399b == 30 || iM15399b == 30 || iM15399b == 40)) {
                m100282C().m15237L(new zzje(null, null, -10), this.f73428H, false);
            } else if (TextUtils.isEmpty(m100310w().m15135A()) && zzdwVar != null && zzdwVar.zzg != null && m100280A().m98524s(30)) {
                zzjeVarM15388e = zzje.m15387c(zzdwVar.zzg, 30);
                if (!zzjeVarM15388e.m15398A()) {
                }
            }
            zzjeVarM15388e = null;
        }
        if (zzjeVarM15388e != null) {
            m100282C().m15237L(zzjeVarM15388e, this.f73428H, true);
            zzjeVarM98510G = zzjeVarM15388e;
        }
        m100282C().m15236K(zzjeVarM98510G);
        int iM15126a = m100280A().m98509F().m15126a();
        zzjh zzjhVarM98448v3 = this.f73435g.m98448v("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzjhVarM98448v3 != zzjhVar) {
            zzj().m114562E().m153301b("Default ad personalization consent from Manifest", zzjhVarM98448v3);
        }
        zzjh zzjhVarM98448v4 = this.f73435g.m98448v("google_analytics_default_allow_ad_user_data", true);
        if (zzjhVarM98448v4 != zzjhVar && zzje.m15395l(-10, iM15126a)) {
            m100282C().m15235J(C2476b.m15123c(zzjhVarM98448v4, -10), true);
        } else if (TextUtils.isEmpty(m100310w().m15135A()) || !(iM15126a == 0 || iM15126a == 30)) {
            if (TextUtils.isEmpty(m100310w().m15135A()) && zzdwVar != null && zzdwVar.zzg != null && zzje.m15395l(30, iM15126a)) {
                C2476b c2476bM15122b = C2476b.m15122b(zzdwVar.zzg, 30);
                if (c2476bM15122b.m15132k()) {
                    m100282C().m15235J(c2476bM15122b, true);
                }
            }
            if (TextUtils.isEmpty(m100310w().m15135A()) && zzdwVar != null && zzdwVar.zzg != null && m100280A().f71908o.m105276a() == null && (boolM15125e = C2476b.m15125e(zzdwVar.zzg)) != null) {
                m100282C().m15260c0(zzdwVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15125e.toString(), false);
            }
        } else {
            m100282C().m15235J(new C2476b(null, -10), true);
        }
        Boolean boolM98451y = this.f73435g.m98451y("google_analytics_tcf_data_enabled");
        if (boolM98451y == null ? true : boolM98451y.booleanValue()) {
            zzj().m114570z().m153300a("TCF client enabled.");
            m100282C().m15223C0();
            m100282C().m15219A0();
        }
        if (m100280A().f71900g.m219990a() == 0) {
            zzj().m114562E().m153301b("Persisting first open", Long.valueOf(this.f73428H));
            m100280A().f71900g.m219991b(this.f73428H);
        }
        m100282C().f10538q.m133036c();
        if (m100301n()) {
            if (!TextUtils.isEmpty(m100310w().m15135A()) || !TextUtils.isEmpty(m100310w().m15159y())) {
                m100286G();
                if (hny0.m136309g0(m100310w().m15135A(), m100280A().m98516M(), m100310w().m15159y(), m100280A().m98515L())) {
                    zzj().m114561D().m153300a("Rechecking which service to use due to a GMP App Id change");
                    m100280A().m98517N();
                    m100311x().m221818B();
                    this.f73449u.m134550U();
                    this.f73449u.m134549T();
                    m100280A().f71900g.m219991b(this.f73428H);
                    m100280A().f71902i.m105277b(null);
                }
                m100280A().m98506C(m100310w().m15135A());
                m100280A().m98531z(m100310w().m15159y());
            }
            if (!m100280A().m98510G().m15401m(zzje.zza.ANALYTICS_STORAGE)) {
                m100280A().f71902i.m105277b(null);
            }
            m100282C().m15249U0(m100280A().f71902i.m105276a());
            if (!m100286G().m136347S0() && !TextUtils.isEmpty(m100280A().f71917x.m105276a())) {
                zzj().m114563F().m153300a("Remote config removed with active feature rollouts");
                m100280A().f71917x.m105277b(null);
            }
            if (!TextUtils.isEmpty(m100310w().m15135A()) || !TextUtils.isEmpty(m100310w().m15159y())) {
                boolean zM100298k = m100298k();
                if (!m100280A().m98529x() && !this.f73435g.m98432Q()) {
                    m100280A().m98504A(!zM100298k);
                }
                if (zM100298k) {
                    m100282C().m15280w0();
                }
                m100285F().f174432e.m181622a();
                m100284E().m134533B(new AtomicReference<>());
                m100284E().m134563w(m100280A().f71895A.m216543a());
            }
        } else if (m100298k()) {
            if (!m100286G().m136372z0("android.permission.INTERNET")) {
                zzj().m114558A().m153300a("App is missing INTERNET permission");
            }
            if (!m100286G().m136372z0("android.permission.ACCESS_NETWORK_STATE")) {
                zzj().m114558A().m153300a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.f73429a).isCallerInstantApp() && !this.f73435g.m98433R()) {
                if (!hny0.m136304X(this.f73429a)) {
                    zzj().m114558A().m153300a("AppMeasurementReceiver not registered/enabled");
                }
                if (!hny0.m136305Y(this.f73429a, false)) {
                    zzj().m114558A().m153300a("AppMeasurementService not registered/enabled");
                }
            }
            zzj().m114558A().m153300a("Uploading is not possible. App measurement disabled");
        }
        if (spy0.m187491a() && this.f73435g.m98440n(whs0.f189211J0) && m100286G().m136346R0()) {
            final C2481g c2481gM100282C = m100282C();
            Objects.requireNonNull(c2481gM100282C);
            new Thread(new Runnable() { // from class: l.eux0
                @Override // java.lang.Runnable
                public final void run() {
                    c2481gM100282C.m15282y0();
                }
            }).start();
        }
        m100280A().f71910q.m115832a(true);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m100294c(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            zzj().m114563F().m153302c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        m100280A().f71915v.m115832a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().m114570z().m153300a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString(LinkAction.deeplink, "");
            if (TextUtils.isEmpty(strOptString)) {
                zzj().m114570z().m153300a("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            Bundle bundle = new Bundle();
            if (nny0.m164006a() && this.f73435g.m98440n(whs0.f189233U0)) {
                if (!m100286G().m136326F0(strOptString)) {
                    zzj().m114563F().m153303d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    bundle.putString("gbraid", strOptString3);
                }
                if (!TextUtils.isEmpty(strOptString4)) {
                    bundle.putString("gad_source", strOptString4);
                }
            } else if (!m100286G().m136326F0(strOptString)) {
                zzj().m114563F().m153302c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            if (nny0.m164006a()) {
                this.f73435g.m98440n(whs0.f189233U0);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.f73444p.m15251V0("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
            hny0 hny0VarM100286G = m100286G();
            if (TextUtils.isEmpty(strOptString) || !hny0VarM100286G.m136350c0(strOptString, dOptDouble)) {
                return;
            }
            hny0VarM100286G.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().m114558A().m153301b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public final void m100295h(boolean z) {
        this.f73421A = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: i */
    public final void m100296i() {
        this.f73425E++;
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final boolean m100297j() {
        return this.f73421A != null && this.f73421A.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final boolean m100298k() {
        return m100306s() == 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final boolean m100299l() {
        zzl().mo15146h();
        return this.f73424D;
    }

    @Pure
    /* JADX INFO: renamed from: m */
    public final boolean m100300m() {
        return TextUtils.isEmpty(this.f73430b);
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public final boolean m100301n() {
        if (!this.f73452x) {
            wtq0.m207906a("AppMeasurement is not initialized");
            return false;
        }
        zzl().mo15146h();
        Boolean bool = this.f73453y;
        if (bool == null || this.f73454z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f73442n.elapsedRealtime() - this.f73454z) > 1000)) {
            this.f73454z = this.f73442n.elapsedRealtime();
            Boolean boolValueOf = Boolean.valueOf(m100286G().m136372z0("android.permission.INTERNET") && m100286G().m136372z0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f73429a).isCallerInstantApp() || this.f73435g.m98433R() || (hny0.m136304X(this.f73429a) && hny0.m136305Y(this.f73429a, false))));
            this.f73453y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                this.f73453y = Boolean.valueOf(m100286G().m136352e0(m100310w().m15135A(), m100310w().m15159y()) || !TextUtils.isEmpty(m100310w().m15159y()));
            }
        }
        return this.f73453y.booleanValue();
    }

    @Pure
    /* JADX INFO: renamed from: o */
    public final boolean m100302o() {
        return this.f73433e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final boolean m100303p() {
        zzl().mo15146h();
        m100279g(m100304q());
        String strM15160z = m100310w().m15160z();
        if (!this.f73435g.m98430O()) {
            zzj().m114562E().m153300a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> pairM98520o = m100280A().m98520o(strM15160z);
        if (((Boolean) pairM98520o.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairM98520o.first)) {
            zzj().m114562E().m153300a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!m100304q().m214854q()) {
            zzj().m114563F().m153300a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        hcy0 hcy0VarM100284E = m100284E();
        hcy0VarM100284E.mo15146h();
        hcy0VarM100284E.m149988p();
        if (!hcy0VarM100284E.m134560e0() || hcy0VarM100284E.mo15143e().m136324C0() >= 234200) {
            zzaj zzajVarM15268k0 = m100282C().m15268k0();
            Bundle bundle = zzajVarM15268k0 != null ? zzajVarM15268k0.zza : null;
            if (bundle == null) {
                int i = this.f73426F;
                this.f73426F = i + 1;
                boolean z = i < 10;
                zzj().m114570z().m153301b("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f73426F));
                return z;
            }
            zzje zzjeVarM15387c = zzje.m15387c(bundle, 100);
            sb.append("&gcs=");
            sb.append(zzjeVarM15387c.m15409w());
            C2476b c2476bM15122b = C2476b.m15122b(bundle, 100);
            sb.append("&dma=");
            sb.append(c2476bM15122b.m15129h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(c2476bM15122b.m15130i())) {
                sb.append("&dma_cps=");
                sb.append(c2476bM15122b.m15130i());
            }
            int i2 = C2476b.m15125e(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i2);
            zzj().m114562E().m153301b("Consent query parameters to Bow", sb);
        }
        hny0 hny0VarM100286G = m100286G();
        m100310w();
        URL urlM136325E = hny0VarM100286G.m136325E(106000L, strM15160z, (String) pairM98520o.first, m100280A().f71916w.m219990a() - 1, sb.toString());
        if (urlM136325E != null) {
            y9y0 y9y0VarM100304q = m100304q();
            t9y0 t9y0Var = new t9y0() { // from class: l.aux0
                @Override // p153l.t9y0
                /* JADX INFO: renamed from: a */
                public final void mo100408a(String str, int i3, Throwable th, byte[] bArr, Map map) {
                    this.f73572a.m100294c(str, i3, th, bArr, map);
                }
            };
            y9y0VarM100304q.mo15146h();
            y9y0VarM100304q.m160930j();
            Preconditions.checkNotNull(urlM136325E);
            Preconditions.checkNotNull(t9y0Var);
            y9y0VarM100304q.zzl().m177839s(new fay0(y9y0VarM100304q, strM15160z, urlM136325E, null, null, t9y0Var));
        }
        return false;
    }

    @Pure
    /* JADX INFO: renamed from: q */
    public final y9y0 m100304q() {
        m100279g(this.f73446r);
        return this.f73446r;
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final void m100305r(boolean z) {
        zzl().mo15146h();
        this.f73424D = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final int m100306s() {
        zzl().mo15146h();
        if (this.f73435g.m98432Q()) {
            return 1;
        }
        Boolean bool = this.f73423C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!m100299l()) {
            return 8;
        }
        Boolean boolM98513J = m100280A().m98513J();
        if (boolM98513J != null) {
            return boolM98513J.booleanValue() ? 0 : 3;
        }
        Boolean boolM98451y = this.f73435g.m98451y("firebase_analytics_collection_enabled");
        if (boolM98451y != null) {
            return boolM98451y.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f73422B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f73421A == null || this.f73421A.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* JADX INFO: renamed from: t */
    public final n9s0 m100307t() {
        n9s0 n9s0Var = this.f73445q;
        if (n9s0Var != null) {
            return n9s0Var;
        }
        wtq0.m207906a("Component not created");
        return null;
    }

    @Pure
    /* JADX INFO: renamed from: u */
    public final ajr0 m100308u() {
        return this.f73435g;
    }

    @Pure
    /* JADX INFO: renamed from: v */
    public final o7s0 m100309v() {
        m100279g(this.f73450v);
        return this.f73450v;
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public final C2477c m100310w() {
        m100276d(this.f73451w);
        return this.f73451w;
    }

    @Pure
    /* JADX INFO: renamed from: x */
    public final zvw0 m100311x() {
        m100276d(this.f73448t);
        return this.f73448t;
    }

    @Pure
    /* JADX INFO: renamed from: y */
    public final wxw0 m100312y() {
        return this.f73441m;
    }

    /* JADX INFO: renamed from: z */
    public final d6x0 m100313z() {
        d6x0 d6x0Var = this.f73437i;
        if (d6x0Var == null || !d6x0Var.m160933m()) {
            return null;
        }
        return this.f73437i;
    }

    @Override // p153l.hzx0
    @Pure
    public final Context zza() {
        return this.f73429a;
    }

    @Override // p153l.hzx0
    @Pure
    public final Clock zzb() {
        return this.f73442n;
    }

    @Override // p153l.hzx0
    @Pure
    public final zbr0 zzd() {
        return this.f73434f;
    }

    @Override // p153l.hzx0
    @Pure
    public final d6x0 zzj() {
        m100279g(this.f73437i);
        return this.f73437i;
    }

    @Override // p153l.hzx0
    @Pure
    public final qsx0 zzl() {
        m100279g(this.f73438j);
        return this.f73438j;
    }
}
