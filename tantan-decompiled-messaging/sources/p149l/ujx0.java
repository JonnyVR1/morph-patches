package p149l;

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
import com.google.android.gms.measurement.internal.C2453b;
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.LinkAction;
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
public class ujx0 implements bqx0 {

    /* JADX INFO: renamed from: I */
    public static volatile ujx0 f176840I;

    /* JADX INFO: renamed from: A */
    public volatile Boolean f176841A;

    /* JADX INFO: renamed from: B */
    @VisibleForTesting
    public Boolean f176842B;

    /* JADX INFO: renamed from: C */
    @VisibleForTesting
    public Boolean f176843C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f176844D;

    /* JADX INFO: renamed from: E */
    public int f176845E;

    /* JADX INFO: renamed from: F */
    public int f176846F;

    /* JADX INFO: renamed from: H */
    @VisibleForTesting
    public final long f176848H;

    /* JADX INFO: renamed from: a */
    public final Context f176849a;

    /* JADX INFO: renamed from: b */
    public final String f176850b;

    /* JADX INFO: renamed from: c */
    public final String f176851c;

    /* JADX INFO: renamed from: d */
    public final String f176852d;

    /* JADX INFO: renamed from: e */
    public final boolean f176853e;

    /* JADX INFO: renamed from: f */
    public final t2r0 f176854f;

    /* JADX INFO: renamed from: g */
    public final u9r0 f176855g;

    /* JADX INFO: renamed from: h */
    public final u9x0 f176856h;

    /* JADX INFO: renamed from: i */
    public final xww0 f176857i;

    /* JADX INFO: renamed from: j */
    public final kjx0 f176858j;

    /* JADX INFO: renamed from: k */
    public final n8y0 f176859k;

    /* JADX INFO: renamed from: l */
    public final bey0 f176860l;

    /* JADX INFO: renamed from: m */
    public final qow0 f176861m;

    /* JADX INFO: renamed from: n */
    public final Clock f176862n;

    /* JADX INFO: renamed from: o */
    public final m1y0 f176863o;

    /* JADX INFO: renamed from: p */
    public final C2458g f176864p;

    /* JADX INFO: renamed from: q */
    public final h0s0 f176865q;

    /* JADX INFO: renamed from: r */
    public final s0y0 f176866r;

    /* JADX INFO: renamed from: s */
    public final String f176867s;

    /* JADX INFO: renamed from: t */
    public tmw0 f176868t;

    /* JADX INFO: renamed from: u */
    public b3y0 f176869u;

    /* JADX INFO: renamed from: v */
    public iyr0 f176870v;

    /* JADX INFO: renamed from: w */
    public C2454c f176871w;

    /* JADX INFO: renamed from: y */
    public Boolean f176873y;

    /* JADX INFO: renamed from: z */
    public long f176874z;

    /* JADX INFO: renamed from: x */
    public boolean f176872x = false;

    /* JADX INFO: renamed from: G */
    public AtomicInteger f176847G = new AtomicInteger(0);

    public ujx0(bsx0 bsx0Var) {
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(bsx0Var);
        t2r0 t2r0Var = new t2r0(bsx0Var.f77135a);
        this.f176854f = t2r0Var;
        kiw0.f123416a = t2r0Var;
        Context context = bsx0Var.f77135a;
        this.f176849a = context;
        this.f176850b = bsx0Var.f77136b;
        this.f176851c = bsx0Var.f77137c;
        this.f176852d = bsx0Var.f77138d;
        this.f176853e = bsx0Var.f77142h;
        this.f176841A = bsx0Var.f77139e;
        this.f176867s = bsx0Var.f77144j;
        this.f176844D = true;
        zzdw zzdwVar = bsx0Var.f77141g;
        if (zzdwVar != null && (bundle = zzdwVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f176842B = (Boolean) obj;
            }
            Object obj2 = zzdwVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f176843C = (Boolean) obj2;
            }
        }
        mhx0.m154648l(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f176862n = defaultClock;
        Long l2 = bsx0Var.f77143i;
        this.f176848H = l2 != null ? l2.longValue() : defaultClock.currentTimeMillis();
        this.f176855g = new u9r0(this);
        u9x0 u9x0Var = new u9x0(this);
        u9x0Var.m127633k();
        this.f176856h = u9x0Var;
        xww0 xww0Var = new xww0(this);
        xww0Var.m127633k();
        this.f176857i = xww0Var;
        bey0 bey0Var = new bey0(this);
        bey0Var.m127633k();
        this.f176860l = bey0Var;
        this.f176861m = new qow0(new wrx0(bsx0Var, this));
        this.f176865q = new h0s0(this);
        m1y0 m1y0Var = new m1y0(this);
        m1y0Var.m115401q();
        this.f176863o = m1y0Var;
        C2458g c2458g = new C2458g(this);
        c2458g.m115401q();
        this.f176864p = c2458g;
        n8y0 n8y0Var = new n8y0(this);
        n8y0Var.m115401q();
        this.f176859k = n8y0Var;
        s0y0 s0y0Var = new s0y0(this);
        s0y0Var.m127633k();
        this.f176866r = s0y0Var;
        kjx0 kjx0Var = new kjx0(this);
        kjx0Var.m127633k();
        this.f176858j = kjx0Var;
        zzdw zzdwVar2 = bsx0Var.f77141g;
        if (zzdwVar2 != null && zzdwVar2.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            m194102C().m15188P0(z2);
        } else {
            zzj().m211417F().m123936a("Application context is not an Application");
        }
        kjx0Var.m146305w(new hlx0(this, bsx0Var));
    }

    /* JADX INFO: renamed from: a */
    public static ujx0 m194095a(Context context, zzdw zzdwVar, Long l2) {
        Bundle bundle;
        if (zzdwVar != null && (zzdwVar.zze == null || zzdwVar.zzf == null)) {
            zzdwVar = new zzdw(zzdwVar.zza, zzdwVar.zzb, zzdwVar.zzc, zzdwVar.zzd, null, null, zzdwVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f176840I == null) {
            synchronized (ujx0.class) {
                try {
                    if (f176840I == null) {
                        f176840I = new ujx0(new bsx0(context, zzdwVar, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzdwVar != null && (bundle = zzdwVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f176840I);
            f176840I.m194115h(zzdwVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f176840I);
        return f176840I;
    }

    /* JADX INFO: renamed from: d */
    public static void m194096d(e9x0 e9x0Var) {
        if (e9x0Var == null) {
            qkq0.m175383a("Component not created");
        } else {
            if (e9x0Var.m115403t()) {
                return;
            }
            qkq0.m175383a("Component not initialized: ".concat(String.valueOf(e9x0Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m194097e(ujx0 ujx0Var, bsx0 bsx0Var) {
        ujx0Var.zzl().mo15092h();
        iyr0 iyr0Var = new iyr0(ujx0Var);
        iyr0Var.m127633k();
        ujx0Var.f176870v = iyr0Var;
        C2454c c2454c = new C2454c(ujx0Var, bsx0Var.f77140f);
        c2454c.m115401q();
        ujx0Var.f176871w = c2454c;
        tmw0 tmw0Var = new tmw0(ujx0Var);
        tmw0Var.m115401q();
        ujx0Var.f176868t = tmw0Var;
        b3y0 b3y0Var = new b3y0(ujx0Var);
        b3y0Var.m115401q();
        ujx0Var.f176869u = b3y0Var;
        ujx0Var.f176860l.m127634l();
        ujx0Var.f176856h.m127634l();
        ujx0Var.f176871w.m115402r();
        ujx0Var.zzj().m211415D().m123937b("App measurement initialized, version", 106000L);
        ujx0Var.zzj().m211415D().m123936a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strM15106z = c2454c.m15106z();
        if (TextUtils.isEmpty(ujx0Var.f176850b)) {
            if (ujx0Var.m194106G().m101505y0(strM15106z, ujx0Var.f176855g.m192637N())) {
                ujx0Var.zzj().m211415D().m123936a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                ujx0Var.zzj().m211415D().m123936a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strM15106z);
            }
        }
        ujx0Var.zzj().m211424z().m123936a("Debug-level message logging enabled");
        if (ujx0Var.f176845E != ujx0Var.f176847G.get()) {
            ujx0Var.zzj().m211412A().m123938c("Not all components initialized", Integer.valueOf(ujx0Var.f176845E), Integer.valueOf(ujx0Var.f176847G.get()));
        }
        ujx0Var.f176872x = true;
    }

    /* JADX INFO: renamed from: f */
    public static void m194098f(spx0 spx0Var) {
        if (spx0Var != null) {
            return;
        }
        qkq0.m175383a("Component not created");
    }

    /* JADX INFO: renamed from: g */
    public static void m194099g(gqx0 gqx0Var) {
        if (gqx0Var == null) {
            qkq0.m175383a("Component not created");
        } else {
            if (gqx0Var.m127635m()) {
                return;
            }
            qkq0.m175383a("Component not initialized: ".concat(String.valueOf(gqx0Var.getClass())));
        }
    }

    @Pure
    /* JADX INFO: renamed from: A */
    public final u9x0 m194100A() {
        m194098f(this.f176856h);
        return this.f176856h;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: B */
    public final kjx0 m194101B() {
        return this.f176858j;
    }

    @Pure
    /* JADX INFO: renamed from: C */
    public final C2458g m194102C() {
        m194096d(this.f176864p);
        return this.f176864p;
    }

    @Pure
    /* JADX INFO: renamed from: D */
    public final m1y0 m194103D() {
        m194096d(this.f176863o);
        return this.f176863o;
    }

    @Pure
    /* JADX INFO: renamed from: E */
    public final b3y0 m194104E() {
        m194096d(this.f176869u);
        return this.f176869u;
    }

    @Pure
    /* JADX INFO: renamed from: F */
    public final n8y0 m194105F() {
        m194096d(this.f176859k);
        return this.f176859k;
    }

    @Pure
    /* JADX INFO: renamed from: G */
    public final bey0 m194106G() {
        m194098f(this.f176860l);
        return this.f176860l;
    }

    @Pure
    /* JADX INFO: renamed from: H */
    public final String m194107H() {
        return this.f176850b;
    }

    @Pure
    /* JADX INFO: renamed from: I */
    public final String m194108I() {
        return this.f176851c;
    }

    @Pure
    /* JADX INFO: renamed from: J */
    public final String m194109J() {
        return this.f176852d;
    }

    @Pure
    /* JADX INFO: renamed from: K */
    public final String m194110K() {
        return this.f176867s;
    }

    /* JADX INFO: renamed from: L */
    public final void m194111L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: renamed from: M */
    public final void m194112M() {
        this.f176847G.incrementAndGet();
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m194113b(zzdw zzdwVar) {
        zzje zzjeVarM15334e;
        Boolean boolM15071e;
        zzl().mo15092h();
        if (mgy0.m154586a() && this.f176855g.m192648n(q8s0.f153235J0) && m194106G().m101479R0()) {
            bey0 bey0VarM194106G = m194106G();
            bey0VarM194106G.mo15092h();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            e16.m114383k(bey0VarM194106G.zza(), new zzp(bey0VarM194106G.f165891a), intentFilter, 2);
            bey0VarM194106G.zzj().m211424z().m123936a("Registered app receiver");
        }
        zzje zzjeVarM192695G = m194100A().m192695G();
        int iM15345b = zzjeVarM192695G.m15345b();
        zzjh zzjhVarM192656v = this.f176855g.m192656v("google_analytics_default_allow_ad_storage", false);
        zzjh zzjhVarM192656v2 = this.f176855g.m192656v("google_analytics_default_allow_analytics_storage", false);
        zzjh zzjhVar = zzjh.UNINITIALIZED;
        if (!(zzjhVarM192656v == zzjhVar && zzjhVarM192656v2 == zzjhVar) && m194100A().m192707s(-10)) {
            zzjeVarM15334e = zzje.m15334e(zzjhVarM192656v, zzjhVarM192656v2, -10);
        } else {
            if (!TextUtils.isEmpty(m194130w().m15081A()) && (iM15345b == 0 || iM15345b == 30 || iM15345b == 10 || iM15345b == 30 || iM15345b == 30 || iM15345b == 40)) {
                m194102C().m15183L(new zzje(null, null, -10), this.f176848H, false);
            } else if (TextUtils.isEmpty(m194130w().m15081A()) && zzdwVar != null && zzdwVar.zzg != null && m194100A().m192707s(30)) {
                zzjeVarM15334e = zzje.m15333c(zzdwVar.zzg, 30);
                if (!zzjeVarM15334e.m15344A()) {
                }
            }
            zzjeVarM15334e = null;
        }
        if (zzjeVarM15334e != null) {
            m194102C().m15183L(zzjeVarM15334e, this.f176848H, true);
            zzjeVarM192695G = zzjeVarM15334e;
        }
        m194102C().m15182K(zzjeVarM192695G);
        int iM15072a = m194100A().m192694F().m15072a();
        zzjh zzjhVarM192656v3 = this.f176855g.m192656v("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzjhVarM192656v3 != zzjhVar) {
            zzj().m211416E().m123937b("Default ad personalization consent from Manifest", zzjhVarM192656v3);
        }
        zzjh zzjhVarM192656v4 = this.f176855g.m192656v("google_analytics_default_allow_ad_user_data", true);
        if (zzjhVarM192656v4 != zzjhVar && zzje.m15341l(-10, iM15072a)) {
            m194102C().m15181J(C2453b.m15069c(zzjhVarM192656v4, -10), true);
        } else if (TextUtils.isEmpty(m194130w().m15081A()) || !(iM15072a == 0 || iM15072a == 30)) {
            if (TextUtils.isEmpty(m194130w().m15081A()) && zzdwVar != null && zzdwVar.zzg != null && zzje.m15341l(30, iM15072a)) {
                C2453b c2453bM15068b = C2453b.m15068b(zzdwVar.zzg, 30);
                if (c2453bM15068b.m15078k()) {
                    m194102C().m15181J(c2453bM15068b, true);
                }
            }
            if (TextUtils.isEmpty(m194130w().m15081A()) && zzdwVar != null && zzdwVar.zzg != null && m194100A().f175527o.m197913a() == null && (boolM15071e = C2453b.m15071e(zzdwVar.zzg)) != null) {
                m194102C().m15206c0(zzdwVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15071e.toString(), false);
            }
        } else {
            m194102C().m15181J(new C2453b(null, -10), true);
        }
        Boolean boolM192659y = this.f176855g.m192659y("google_analytics_tcf_data_enabled");
        if (boolM192659y == null ? true : boolM192659y.booleanValue()) {
            zzj().m211424z().m123936a("TCF client enabled.");
            m194102C().m15169C0();
            m194102C().m15165A0();
        }
        if (m194100A().f175519g.m187782a() == 0) {
            zzj().m211416E().m123937b("Persisting first open", Long.valueOf(this.f176848H));
            m194100A().f175519g.m187783b(this.f176848H);
        }
        m194102C().f10501q.m98202c();
        if (m194121n()) {
            if (!TextUtils.isEmpty(m194130w().m15081A()) || !TextUtils.isEmpty(m194130w().m15105y())) {
                m194106G();
                if (bey0.m101442g0(m194130w().m15081A(), m194100A().m192701M(), m194130w().m15105y(), m194100A().m192700L())) {
                    zzj().m211415D().m123936a("Rechecking which service to use due to a GMP App Id change");
                    m194100A().m192702N();
                    m194131x().m189725B();
                    this.f176869u.m100150U();
                    this.f176869u.m100149T();
                    m194100A().f175519g.m187783b(this.f176848H);
                    m194100A().f175521i.m197914b(null);
                }
                m194100A().m192691C(m194130w().m15081A());
                m194100A().m192714z(m194130w().m15105y());
            }
            if (!m194100A().m192695G().m15347m(zzje.zza.ANALYTICS_STORAGE)) {
                m194100A().f175521i.m197914b(null);
            }
            m194102C().m15195U0(m194100A().f175521i.m197913a());
            if (!m194106G().m101480S0() && !TextUtils.isEmpty(m194100A().f175536x.m197913a())) {
                zzj().m211417F().m123936a("Remote config removed with active feature rollouts");
                m194100A().f175536x.m197914b(null);
            }
            if (!TextUtils.isEmpty(m194130w().m15081A()) || !TextUtils.isEmpty(m194130w().m15105y())) {
                boolean zM194118k = m194118k();
                if (!m194100A().m192712x() && !this.f176855g.m192640Q()) {
                    m194100A().m192689A(!zM194118k);
                }
                if (zM194118k) {
                    m194102C().m15226w0();
                }
                m194105F().f137708e.m149111a();
                m194104E().m100133B(new AtomicReference<>());
                m194104E().m100163w(m194100A().f175514A.m183361a());
            }
        } else if (m194118k()) {
            if (!m194106G().m101507z0("android.permission.INTERNET")) {
                zzj().m211412A().m123936a("App is missing INTERNET permission");
            }
            if (!m194106G().m101507z0("android.permission.ACCESS_NETWORK_STATE")) {
                zzj().m211412A().m123936a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.f176849a).isCallerInstantApp() && !this.f176855g.m192641R()) {
                if (!bey0.m101437X(this.f176849a)) {
                    zzj().m211412A().m123936a("AppMeasurementReceiver not registered/enabled");
                }
                if (!bey0.m101438Y(this.f176849a, false)) {
                    zzj().m211412A().m123936a("AppMeasurementService not registered/enabled");
                }
            }
            zzj().m211412A().m123936a("Uploading is not possible. App measurement disabled");
        }
        if (mgy0.m154586a() && this.f176855g.m192648n(q8s0.f153235J0) && m194106G().m101479R0()) {
            final C2458g c2458gM194102C = m194102C();
            Objects.requireNonNull(c2458gM194102C);
            new Thread(new Runnable() { // from class: l.ykx0
                @Override // java.lang.Runnable
                public final void run() {
                    c2458gM194102C.m15228y0();
                }
            }).start();
        }
        m194100A().f175529q.m207309a(true);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m194114c(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            zzj().m211417F().m123938c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        m194100A().f175534v.m207309a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().m211424z().m123936a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString(LinkAction.deeplink, "");
            if (TextUtils.isEmpty(strOptString)) {
                zzj().m211424z().m123936a("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            Bundle bundle = new Bundle();
            if (hey0.m130716a() && this.f176855g.m192648n(q8s0.f153257U0)) {
                if (!m194106G().m101459F0(strOptString)) {
                    zzj().m211417F().m123939d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    bundle.putString("gbraid", strOptString3);
                }
                if (!TextUtils.isEmpty(strOptString4)) {
                    bundle.putString("gad_source", strOptString4);
                }
            } else if (!m194106G().m101459F0(strOptString)) {
                zzj().m211417F().m123938c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            if (hey0.m130716a()) {
                this.f176855g.m192648n(q8s0.f153257U0);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.f176864p.m15197V0("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
            bey0 bey0VarM194106G = m194106G();
            if (TextUtils.isEmpty(strOptString) || !bey0VarM194106G.m101483c0(strOptString, dOptDouble)) {
                return;
            }
            bey0VarM194106G.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().m211412A().m123937b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public final void m194115h(boolean z) {
        this.f176841A = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: i */
    public final void m194116i() {
        this.f176845E++;
    }

    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final boolean m194117j() {
        return this.f176841A != null && this.f176841A.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final boolean m194118k() {
        return m194126s() == 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final boolean m194119l() {
        zzl().mo15092h();
        return this.f176844D;
    }

    @Pure
    /* JADX INFO: renamed from: m */
    public final boolean m194120m() {
        return TextUtils.isEmpty(this.f176850b);
    }

    @WorkerThread
    /* JADX INFO: renamed from: n */
    public final boolean m194121n() {
        if (!this.f176872x) {
            qkq0.m175383a("AppMeasurement is not initialized");
            return false;
        }
        zzl().mo15092h();
        Boolean bool = this.f176873y;
        if (bool == null || this.f176874z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f176862n.elapsedRealtime() - this.f176874z) > 1000)) {
            this.f176874z = this.f176862n.elapsedRealtime();
            Boolean boolValueOf = Boolean.valueOf(m194106G().m101507z0("android.permission.INTERNET") && m194106G().m101507z0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f176849a).isCallerInstantApp() || this.f176855g.m192641R() || (bey0.m101437X(this.f176849a) && bey0.m101438Y(this.f176849a, false))));
            this.f176873y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                this.f176873y = Boolean.valueOf(m194106G().m101485e0(m194130w().m15081A(), m194130w().m15105y()) || !TextUtils.isEmpty(m194130w().m15105y()));
            }
        }
        return this.f176873y.booleanValue();
    }

    @Pure
    /* JADX INFO: renamed from: o */
    public final boolean m194122o() {
        return this.f176853e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final boolean m194123p() {
        zzl().mo15092h();
        m194099g(m194124q());
        String strM15106z = m194130w().m15106z();
        if (!this.f176855g.m192638O()) {
            zzj().m211416E().m123936a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> pairM192703o = m194100A().m192703o(strM15106z);
        if (((Boolean) pairM192703o.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairM192703o.first)) {
            zzj().m211416E().m123936a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!m194124q().m181894q()) {
            zzj().m211417F().m123936a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        b3y0 b3y0VarM194104E = m194104E();
        b3y0VarM194104E.mo15092h();
        b3y0VarM194104E.m115400p();
        if (!b3y0VarM194104E.m100160e0() || b3y0VarM194104E.mo15089e().m101457C0() >= 234200) {
            zzaj zzajVarM15214k0 = m194102C().m15214k0();
            Bundle bundle = zzajVarM15214k0 != null ? zzajVarM15214k0.zza : null;
            if (bundle == null) {
                int i = this.f176846F;
                this.f176846F = i + 1;
                boolean z = i < 10;
                zzj().m211424z().m123937b("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f176846F));
                return z;
            }
            zzje zzjeVarM15333c = zzje.m15333c(bundle, 100);
            sb.append("&gcs=");
            sb.append(zzjeVarM15333c.m15355w());
            C2453b c2453bM15068b = C2453b.m15068b(bundle, 100);
            sb.append("&dma=");
            sb.append(c2453bM15068b.m15075h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(c2453bM15068b.m15076i())) {
                sb.append("&dma_cps=");
                sb.append(c2453bM15068b.m15076i());
            }
            int i2 = C2453b.m15071e(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i2);
            zzj().m211416E().m123937b("Consent query parameters to Bow", sb);
        }
        bey0 bey0VarM194106G = m194106G();
        m194130w();
        URL urlM101458E = bey0VarM194106G.m101458E(106000L, strM15106z, (String) pairM192703o.first, m194100A().f175535w.m187782a() - 1, sb.toString());
        if (urlM101458E != null) {
            s0y0 s0y0VarM194124q = m194124q();
            n0y0 n0y0Var = new n0y0() { // from class: l.ukx0
                @Override // p149l.n0y0
                /* JADX INFO: renamed from: a */
                public final void mo157302a(String str, int i3, Throwable th, byte[] bArr, Map map) {
                    this.f177000a.m194114c(str, i3, th, bArr, map);
                }
            };
            s0y0VarM194124q.mo15092h();
            s0y0VarM194124q.m127632j();
            Preconditions.checkNotNull(urlM101458E);
            Preconditions.checkNotNull(n0y0Var);
            s0y0VarM194124q.zzl().m146303s(new z0y0(s0y0VarM194124q, strM15106z, urlM101458E, null, null, n0y0Var));
        }
        return false;
    }

    @Pure
    /* JADX INFO: renamed from: q */
    public final s0y0 m194124q() {
        m194099g(this.f176866r);
        return this.f176866r;
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final void m194125r(boolean z) {
        zzl().mo15092h();
        this.f176844D = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final int m194126s() {
        zzl().mo15092h();
        if (this.f176855g.m192640Q()) {
            return 1;
        }
        Boolean bool = this.f176843C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!m194119l()) {
            return 8;
        }
        Boolean boolM192698J = m194100A().m192698J();
        if (boolM192698J != null) {
            return boolM192698J.booleanValue() ? 0 : 3;
        }
        Boolean boolM192659y = this.f176855g.m192659y("firebase_analytics_collection_enabled");
        if (boolM192659y != null) {
            return boolM192659y.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f176842B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f176841A == null || this.f176841A.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* JADX INFO: renamed from: t */
    public final h0s0 m194127t() {
        h0s0 h0s0Var = this.f176865q;
        if (h0s0Var != null) {
            return h0s0Var;
        }
        qkq0.m175383a("Component not created");
        return null;
    }

    @Pure
    /* JADX INFO: renamed from: u */
    public final u9r0 m194128u() {
        return this.f176855g;
    }

    @Pure
    /* JADX INFO: renamed from: v */
    public final iyr0 m194129v() {
        m194099g(this.f176870v);
        return this.f176870v;
    }

    @Pure
    /* JADX INFO: renamed from: w */
    public final C2454c m194130w() {
        m194096d(this.f176871w);
        return this.f176871w;
    }

    @Pure
    /* JADX INFO: renamed from: x */
    public final tmw0 m194131x() {
        m194096d(this.f176868t);
        return this.f176868t;
    }

    @Pure
    /* JADX INFO: renamed from: y */
    public final qow0 m194132y() {
        return this.f176861m;
    }

    /* JADX INFO: renamed from: z */
    public final xww0 m194133z() {
        xww0 xww0Var = this.f176857i;
        if (xww0Var == null || !xww0Var.m127635m()) {
            return null;
        }
        return this.f176857i;
    }

    @Override // p149l.bqx0
    @Pure
    public final Context zza() {
        return this.f176849a;
    }

    @Override // p149l.bqx0
    @Pure
    public final Clock zzb() {
        return this.f176862n;
    }

    @Override // p149l.bqx0
    @Pure
    public final t2r0 zzd() {
        return this.f176854f;
    }

    @Override // p149l.bqx0
    @Pure
    public final xww0 zzj() {
        m194099g(this.f176857i);
        return this.f176857i;
    }

    @Override // p149l.bqx0
    @Pure
    public final kjx0 zzl() {
        m194099g(this.f176858j);
        return this.f176858j;
    }
}
