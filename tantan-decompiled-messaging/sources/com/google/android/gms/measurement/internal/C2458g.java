package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.measurement.internal.zzno;
import com.google.common.util.concurrent.C3080e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Active;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import org.checkerframework.dataflow.qual.Pure;
import p149l.a0y0;
import p149l.ahy0;
import p149l.apy0;
import p149l.arx0;
import p149l.avx0;
import p149l.azx0;
import p149l.b3y0;
import p149l.bey0;
import p149l.bwx0;
import p149l.bxx0;
import p149l.e01;
import p149l.e9x0;
import p149l.eyx0;
import p149l.ezx0;
import p149l.f9y0;
import p149l.frx0;
import p149l.ftr0;
import p149l.fvx0;
import p149l.fwx0;
import p149l.gnr;
import p149l.gxx0;
import p149l.h0s0;
import p149l.ivx0;
import p149l.iyr0;
import p149l.iyx0;
import p149l.kjx0;
import p149l.kwx0;
import p149l.lxx0;
import p149l.m1y0;
import p149l.mgy0;
import p149l.mvx0;
import p149l.n8y0;
import p149l.nrx0;
import p149l.nyx0;
import p149l.pqx0;
import p149l.q1y0;
import p149l.q8s0;
import p149l.qdu0;
import p149l.qow0;
import p149l.qxx0;
import p149l.rvx0;
import p149l.ryx0;
import p149l.srx0;
import p149l.swx0;
import p149l.t2r0;
import p149l.t9y0;
import p149l.tmw0;
import p149l.u9r0;
import p149l.u9x0;
import p149l.ujx0;
import p149l.uxx0;
import p149l.vyx0;
import p149l.wux0;
import p149l.wvx0;
import p149l.xix0;
import p149l.xtx0;
import p149l.xww0;
import p149l.xwx0;
import p149l.ydy0;
import p149l.zxx0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2458g extends e9x0 {

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public ezx0 f10487c;

    /* JADX INFO: renamed from: d */
    public srx0 f10488d;

    /* JADX INFO: renamed from: e */
    public final Set<nrx0> f10489e;

    /* JADX INFO: renamed from: f */
    public boolean f10490f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<String> f10491g;

    /* JADX INFO: renamed from: h */
    public final Object f10492h;

    /* JADX INFO: renamed from: i */
    public boolean f10493i;

    /* JADX INFO: renamed from: j */
    public int f10494j;

    /* JADX INFO: renamed from: k */
    public ftr0 f10495k;

    /* JADX INFO: renamed from: l */
    public PriorityQueue<zzno> f10496l;

    /* JADX INFO: renamed from: m */
    public boolean f10497m;

    /* JADX INFO: renamed from: n */
    @GuardedBy("consentLock")
    public zzje f10498n;

    /* JADX INFO: renamed from: o */
    public final AtomicLong f10499o;

    /* JADX INFO: renamed from: p */
    public long f10500p;

    /* JADX INFO: renamed from: q */
    public final apy0 f10501q;

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public boolean f10502r;

    /* JADX INFO: renamed from: s */
    public ftr0 f10503s;

    /* JADX INFO: renamed from: t */
    public SharedPreferences.OnSharedPreferenceChangeListener f10504t;

    /* JADX INFO: renamed from: u */
    public ftr0 f10505u;

    /* JADX INFO: renamed from: v */
    public final ydy0 f10506v;

    public C2458g(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f10489e = new CopyOnWriteArraySet();
        this.f10492h = new Object();
        this.f10493i = false;
        this.f10494j = 1;
        this.f10502r = true;
        this.f10506v = new uxx0(this);
        this.f10491g = new AtomicReference<>();
        this.f10498n = zzje.f10555c;
        this.f10500p = -1L;
        this.f10499o = new AtomicLong(0L);
        this.f10501q = new apy0(ujx0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m15150J0(C2458g c2458g, int i) {
        if (c2458g.f10495k == null) {
            c2458g.f10495k = new avx0(c2458g, c2458g.f165891a);
        }
        c2458g.f10495k.m123085b(i * 1000);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m15151K0(C2458g c2458g, Bundle bundle) {
        c2458g.mo15092h();
        c2458g.m115400p();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!c2458g.f165891a.m194118k()) {
            c2458g.zzj().m211416E().m123936a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzon zzonVar = new zzon(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzbf zzbfVarM101455B = c2458g.mo15089e().m101455B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2458g.mo15098n().m100164x(new zzae(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), string2, zzonVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2458g.mo15089e().m101455B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzbfVarM101455B, bundle.getLong("time_to_live"), c2458g.mo15089e().m101455B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m15153N(C2458g c2458g, Bundle bundle) {
        c2458g.mo15092h();
        c2458g.m115400p();
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        if (!c2458g.f165891a.m194118k()) {
            c2458g.zzj().m211416E().m123936a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2458g.mo15098n().m100164x(new zzae(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), "", new zzon(strCheckNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean(Active.TYPE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2458g.mo15089e().m101455B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m15154O(C2458g c2458g, zzje zzjeVar, long j, boolean z, boolean z2) {
        c2458g.mo15092h();
        c2458g.m115400p();
        zzje zzjeVarM192695G = c2458g.mo15088d().m192695G();
        if (j <= c2458g.f10500p && zzje.m15341l(zzjeVarM192695G.m15345b(), zzjeVar.m15345b())) {
            c2458g.zzj().m211415D().m123937b("Dropped out-of-date consent setting, proposed settings", zzjeVar);
            return;
        }
        if (!c2458g.mo15088d().m192710v(zzjeVar)) {
            c2458g.zzj().m211415D().m123937b("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjeVar.m15345b()));
            return;
        }
        c2458g.zzj().m211416E().m123937b("Setting storage consent(FE)", zzjeVar);
        c2458g.f10500p = j;
        if (c2458g.mo15098n().m100159d0()) {
            c2458g.mo15098n().m100161i0(z);
        } else {
            c2458g.mo15098n().m100144O(z);
        }
        if (z2) {
            c2458g.mo15098n().m100133B(new AtomicReference<>());
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m15155P(C2458g c2458g, zzje zzjeVar, zzje zzjeVar2) {
        if (t9y0.m187687a() && c2458g.mo15085a().m192648n(q8s0.f153265Y0)) {
            return;
        }
        zzje.zza zzaVar = zzje.zza.ANALYTICS_STORAGE;
        zzje.zza zzaVar2 = zzje.zza.AD_STORAGE;
        boolean zM15348n = zzjeVar.m15348n(zzjeVar2, zzaVar, zzaVar2);
        boolean zM15351s = zzjeVar.m15351s(zzjeVar2, zzaVar, zzaVar2);
        if (zM15348n || zM15351s) {
            c2458g.mo15094j().m15083C();
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m15160w(C2458g c2458g, Throwable th) {
        String message = th.getMessage();
        c2458g.f10497m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            c2458g.f10497m = true;
        }
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public static int m15162y(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    /* JADX INFO: renamed from: A */
    public final ArrayList<Bundle> m15164A(String str, String str2) {
        if (zzl().m146299D()) {
            zzj().m211412A().m123936a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (t2r0.m187058a()) {
            zzj().m211412A().m123936a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f165891a.zzl().m146300o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get conditional user properties", new qxx0(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return bey0.m101445n0(list);
        }
        zzj().m211412A().m123937b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A0 */
    public final void m15165A0() {
        mo15092h();
        zzj().m211424z().m123936a("Handle tcf update.");
        C2460i c2460iM15231c = C2460i.m15231c(mo15088d().m192690B());
        zzj().m211416E().m123937b("Tcf preferences read", c2460iM15231c);
        if (mo15088d().m192711w(c2460iM15231c)) {
            Bundle bundleM15234b = c2460iM15231c.m15234b();
            zzj().m211416E().m123937b("Consent generated from Tcf", bundleM15234b);
            if (bundleM15234b != Bundle.EMPTY) {
                m15177H(bundleM15234b, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c2460iM15231c.m15235e());
            m15197V0("auto", "_tcf", bundle);
        }
    }

    /* JADX INFO: renamed from: B */
    public final Map<String, Object> m15166B(String str, String str2, boolean z) {
        if (zzl().m146299D()) {
            zzj().m211412A().m123936a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (t2r0.m187058a()) {
            zzj().m211412A().m123936a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f165891a.zzl().m146300o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get user properties", new lxx0(this, atomicReference, null, str, str2, z));
        List<zzon> list = (List) atomicReference.get();
        if (list == null) {
            zzj().m211412A().m123937b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        e01 e01Var = new e01(list.size());
        for (zzon zzonVar : list) {
            Object objM15359F = zzonVar.m15359F();
            if (objM15359F != null) {
                e01Var.put(zzonVar.zza, objM15359F);
            }
        }
        return e01Var;
    }

    @TargetApi(30)
    @WorkerThread
    /* JADX INFO: renamed from: B0 */
    public final void m15167B0() {
        zzno zznoVarPoll;
        MeasurementManagerFutures measurementManagerFuturesM101472N0;
        mo15092h();
        this.f10497m = false;
        if (m15224u0().isEmpty() || this.f10493i || (zznoVarPoll = m15224u0().poll()) == null || (measurementManagerFuturesM101472N0 = mo15089e().m101472N0()) == null) {
            return;
        }
        this.f10493i = true;
        zzj().m211416E().m123937b("Registering trigger URI", zznoVarPoll.zza);
        gnr<Unit> gnrVarMo3208d = measurementManagerFuturesM101472N0.mo3208d(Uri.parse(zznoVarPoll.zza));
        if (gnrVarMo3208d == null) {
            this.f10493i = false;
            m15224u0().add(zznoVarPoll);
            return;
        }
        if (!mo15085a().m192648n(q8s0.f153245O0)) {
            SparseArray<Long> sparseArrayM192693E = mo15088d().m192693E();
            sparseArrayM192693E.put(zznoVarPoll.zzc, Long.valueOf(zznoVarPoll.zzb));
            mo15088d().m192704p(sparseArrayM192693E);
        }
        C3080e.m16654a(gnrVarMo3208d, new fvx0(this, zznoVarPoll), new xtx0(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m15168C(long j) {
        m15195U0(null);
        zzl().m146305w(new swx0(this, j));
    }

    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final void m15169C0() {
        mo15092h();
        zzj().m211424z().m123936a("Register tcfPrefChangeListener.");
        if (this.f10504t == null) {
            this.f10505u = new rvx0(this, this.f165891a);
            this.f10504t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.ttx0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f172104a.m15174F(sharedPreferences, str);
                }
            };
        }
        mo15088d().m192690B().registerOnSharedPreferenceChangeListener(this.f10504t);
    }

    /* JADX INFO: renamed from: D */
    public final void m15170D(long j, boolean z) {
        mo15092h();
        m115400p();
        zzj().m211424z().m123936a("Resetting analytics data (FE)");
        n8y0 n8y0VarMo15099o = mo15099o();
        n8y0VarMo15099o.mo15092h();
        n8y0VarMo15099o.f137709f.m120134b();
        mo15094j().m15083C();
        boolean zM194118k = this.f165891a.m194118k();
        u9x0 u9x0VarMo15088d = mo15088d();
        u9x0VarMo15088d.f175519g.m187783b(j);
        if (!TextUtils.isEmpty(u9x0VarMo15088d.mo15088d().f175536x.m197913a())) {
            u9x0VarMo15088d.f175536x.m197914b(null);
        }
        u9x0VarMo15088d.f175530r.m187783b(0L);
        u9x0VarMo15088d.f175531s.m187783b(0L);
        if (!u9x0VarMo15088d.mo15085a().m192640Q()) {
            u9x0VarMo15088d.m192689A(!zM194118k);
        }
        u9x0VarMo15088d.f175537y.m197914b(null);
        u9x0VarMo15088d.f175538z.m187783b(0L);
        u9x0VarMo15088d.f175514A.m183362b(null);
        if (z) {
            mo15098n().m100153X();
        }
        mo15099o().f137708e.m149111a();
        this.f10502r = !zM194118k;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m15171D0() {
        return this.f10497m;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final void m15172E(Intent intent) {
        if (ahy0.m96761a() && mo15085a().m192648n(q8s0.f153332z0)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().m211415D().m123936a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzj().m211415D().m123936a("Preview Mode was not enabled.");
                mo15085a().m192631F(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzj().m211415D().m123937b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            mo15085a().m192631F(queryParameter2);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: E0 */
    public final void m15173E0() {
        C2458g c2458g;
        mo15092h();
        String strM197913a = mo15088d().f175527o.m197913a();
        if (strM197913a == null) {
            c2458g = this;
        } else if ("unset".equals(strM197913a)) {
            c2458g = this;
            c2458g.m15205b0("app", "_npa", null, zzb().currentTimeMillis());
        } else {
            c2458g = this;
            c2458g.m15205b0("app", "_npa", Long.valueOf("true".equals(strM197913a) ? 1L : 0L), c2458g.zzb().currentTimeMillis());
        }
        if (!c2458g.f165891a.m194118k() || !c2458g.f10502r) {
            c2458g.zzj().m211424z().m123936a("Updating Scion state (FE)");
            c2458g.mo15098n().m100155Z();
        } else {
            c2458g.zzj().m211424z().m123936a("Recording app launch after enabling measurement for the first time (FE)");
            c2458g.m15226w0();
            c2458g.mo15099o().f137708e.m149111a();
            c2458g.zzl().m146305w(new ivx0(c2458g));
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m15174F(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().m211416E().m123936a("IABTCF_TCString change picked up in listener.");
            ((ftr0) Preconditions.checkNotNull(this.f10505u)).m123085b(500L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m15175G(Bundle bundle) {
        Bundle bundleM183361a;
        if (bundle.isEmpty()) {
            bundleM183361a = bundle;
        } else {
            bundleM183361a = mo15088d().f175514A.m183361a();
            if (mo15085a().m192648n(q8s0.f153294i1)) {
                bundleM183361a = new Bundle(bundleM183361a);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    mo15089e();
                    if (bey0.m101441b0(obj)) {
                        mo15089e();
                        bey0.m101434T(this.f10506v, 27, null, null, 0);
                    }
                    zzj().m211418G().m123938c("Invalid default event parameter type. Name, value", str, obj);
                } else if (bey0.m101426D0(str)) {
                    zzj().m211418G().m123937b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleM183361a.remove(str);
                } else if (mo15089e().m101486f0("param", str, mo15085a().m192646l(null, false), obj)) {
                    mo15089e().m101463I(bundleM183361a, str, obj);
                }
            }
            mo15089e();
            if (bey0.m101440a0(bundleM183361a, mo15085a().m192653s())) {
                mo15089e();
                bey0.m101434T(this.f10506v, 26, null, null, 0);
                zzj().m211418G().m123936a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        mo15088d().f175514A.m183362b(bundleM183361a);
        if (!bundle.isEmpty() || mo15085a().m192648n(q8s0.f153288g1)) {
            mo15098n().m100163w(bundleM183361a);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: G0 */
    public final void m15176G0(long j) {
        m15170D(j, true);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H */
    public final void m15177H(Bundle bundle, int i, long j) {
        m115400p();
        String strM15340k = zzje.m15340k(bundle);
        if (strM15340k != null) {
            zzj().m211418G().m123937b("Ignoring invalid consent setting", strM15340k);
            zzj().m211418G().m123936a("Valid consent values are 'granted', 'denied'");
        }
        boolean zM146299D = zzl().m146299D();
        zzje zzjeVarM15333c = zzje.m15333c(bundle, i);
        if (zzjeVarM15333c.m15344A()) {
            m15183L(zzjeVarM15333c, j, zM146299D);
        }
        C2453b c2453bM15068b = C2453b.m15068b(bundle, i);
        if (c2453bM15068b.m15078k()) {
            m15181J(c2453bM15068b, zM146299D);
        }
        Boolean boolM15071e = C2453b.m15071e(bundle);
        if (boolM15071e != null) {
            String str = i == -30 ? "tcf" : "app";
            if (mo15085a().m192648n(q8s0.f153255T0) && zM146299D) {
                m15205b0(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15071e.toString(), j);
            } else {
                m15207d0(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15071e.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m15178H0(Bundle bundle) {
        m15180I0(bundle, zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m15179I(Bundle bundle, long j) {
        if (TextUtils.isEmpty(mo15094j().m15081A())) {
            m15177H(bundle, 0, j);
        } else {
            zzj().m211418G().m123936a("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m15180I0(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(Constants.JumpUrlConstants.URL_KEY_APPID))) {
            zzj().m211417F().m123936a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(Constants.JumpUrlConstants.URL_KEY_APPID);
        Preconditions.checkNotNull(bundle2);
        pqx0.m170938a(bundle2, Constants.JumpUrlConstants.URL_KEY_APPID, String.class, null);
        pqx0.m170938a(bundle2, "origin", String.class, null);
        pqx0.m170938a(bundle2, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null);
        pqx0.m170938a(bundle2, "value", Object.class, null);
        pqx0.m170938a(bundle2, "trigger_event_name", String.class, null);
        pqx0.m170938a(bundle2, "trigger_timeout", Long.class, 0L);
        pqx0.m170938a(bundle2, "timed_out_event_name", String.class, null);
        pqx0.m170938a(bundle2, "timed_out_event_params", Bundle.class, null);
        pqx0.m170938a(bundle2, "triggered_event_name", String.class, null);
        pqx0.m170938a(bundle2, "triggered_event_params", Bundle.class, null);
        pqx0.m170938a(bundle2, "time_to_live", Long.class, 0L);
        pqx0.m170938a(bundle2, "expired_event_name", String.class, null);
        pqx0.m170938a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        Object obj = bundle2.get("value");
        if (mo15089e().m101490l0(string) != 0) {
            zzj().m211412A().m123937b("Invalid conditional user property name", mo15087c().m175779g(string));
            return;
        }
        if (mo15089e().m101496q(string, obj) != 0) {
            zzj().m211412A().m123938c("Invalid conditional user property value", mo15087c().m175779g(string), obj);
            return;
        }
        Object objM101501u0 = mo15089e().m101501u0(string, obj);
        if (objM101501u0 == null) {
            zzj().m211412A().m123938c("Unable to normalize conditional user property value", mo15087c().m175779g(string), obj);
            return;
        }
        pqx0.m170939b(bundle2, objM101501u0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            zzj().m211412A().m123938c("Invalid conditional user property timeout", mo15087c().m175779g(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            zzj().m211412A().m123938c("Invalid conditional user property time to live", mo15087c().m175779g(string), Long.valueOf(j3));
        } else {
            zzl().m146305w(new gxx0(this, bundle2));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m15181J(C2453b c2453b, boolean z) {
        azx0 azx0Var = new azx0(this, c2453b);
        if (!z) {
            zzl().m146305w(azx0Var);
        } else {
            mo15092h();
            azx0Var.run();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m15182K(zzje zzjeVar) {
        mo15092h();
        boolean z = (zzjeVar.m15358z() && zzjeVar.m15357y()) || mo15098n().m100158c0();
        if (z != this.f165891a.m194119l()) {
            this.f165891a.m194125r(z);
            Boolean boolM192697I = mo15088d().m192697I();
            if (!z || boolM192697I == null || boolM192697I.booleanValue()) {
                m15193T(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m15183L(zzje zzjeVar, long j, boolean z) {
        zzje zzjeVar2;
        boolean z2;
        zzje zzjeVarM15350p;
        boolean zM15353u;
        boolean z3;
        m115400p();
        int iM15345b = zzjeVar.m15345b();
        if (iM15345b != -10) {
            zzjh zzjhVarM15352t = zzjeVar.m15352t();
            zzjh zzjhVar = zzjh.UNINITIALIZED;
            if (zzjhVarM15352t == zzjhVar && zzjeVar.m15354v() == zzjhVar) {
                zzj().m211418G().m123936a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f10492h) {
            try {
                zzjeVar2 = this.f10498n;
                z2 = false;
                if (zzje.m15341l(iM15345b, zzjeVar2.m15345b())) {
                    zM15353u = zzjeVar.m15353u(this.f10498n);
                    if (zzjeVar.m15358z() && !this.f10498n.m15358z()) {
                        z2 = true;
                    }
                    zzjeVarM15350p = zzjeVar.m15350p(this.f10498n);
                    this.f10498n = zzjeVarM15350p;
                    z3 = z2;
                    z2 = true;
                } else {
                    zzjeVarM15350p = zzjeVar;
                    zM15353u = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            zzj().m211415D().m123937b("Ignoring lower-priority consent settings, proposed settings", zzjeVarM15350p);
            return;
        }
        long andIncrement = this.f10499o.getAndIncrement();
        if (zM15353u) {
            m15195U0(null);
            vyx0 vyx0Var = new vyx0(this, zzjeVarM15350p, j, andIncrement, z3, zzjeVar2);
            if (!z) {
                zzl().m146298A(vyx0Var);
                return;
            } else {
                mo15092h();
                vyx0Var.run();
                return;
            }
        }
        a0y0 a0y0Var = new a0y0(this, zzjeVarM15350p, andIncrement, z3, zzjeVar2);
        if (z) {
            mo15092h();
            a0y0Var.run();
        } else if (iM15345b == 30 || iM15345b == -10) {
            zzl().m146298A(a0y0Var);
        } else {
            zzl().m146305w(a0y0Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m15184L0(String str) {
        if (mo15094j().m15084E(str)) {
            mo15094j().m15083C();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m15185M0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzl().m146305w(new fwx0(this, str, str2, j, bey0.m101453x(bundle), z, z2, z3, str3));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m15186N0(String str, String str2, Bundle bundle) {
        m15204a0(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m15187O0(nrx0 nrx0Var) {
        m115400p();
        Preconditions.checkNotNull(nrx0Var);
        if (this.f10489e.remove(nrx0Var)) {
            return;
        }
        zzj().m211417F().m123936a("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: P0 */
    public final void m15188P0(boolean z) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f10487c == null) {
                this.f10487c = new ezx0(this);
            }
            if (z) {
                application.unregisterActivityLifecycleCallbacks(this.f10487c);
                application.registerActivityLifecycleCallbacks(this.f10487c);
                zzj().m211416E().m123936a("Registered activity lifecycle callback");
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m15189Q0(long j) {
        zzl().m146305w(new wvx0(this, j));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m15190R0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzl().m146305w(new Runnable() { // from class: l.wsx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187983a.m15175G(bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m15191S(Boolean bool) {
        m115400p();
        zzl().m146305w(new nyx0(this, bool));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m15192S0(final Bundle bundle, final long j) {
        zzl().m146298A(new Runnable() { // from class: l.jtx0
            @Override // java.lang.Runnable
            public final void run() {
                this.f119690a.m15179I(bundle, j);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m15193T(Boolean bool, boolean z) {
        mo15092h();
        m115400p();
        zzj().m211424z().m123937b("Setting app measurement enabled (FE)", bool);
        mo15088d().m192705q(bool);
        if (z) {
            mo15088d().m192713y(bool);
        }
        if (this.f165891a.m194119l() || !(bool == null || bool.booleanValue())) {
            m15173E0();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m15194U(final String str, long j) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f165891a.zzj().m211417F().m123936a("User ID must be non-empty or null");
        } else {
            zzl().m146305w(new Runnable() { // from class: l.otx0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145636a.m15184L0(str);
                }
            });
            m15207d0(null, "_id", str, true, j);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m15195U0(String str) {
        this.f10491g.set(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final void m15196V(String str, String str2, long j, Bundle bundle) {
        mo15092h();
        m15198W(str, str2, j, bundle, true, this.f10488d == null || bey0.m101426D0(str2), true, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: V0 */
    public final void m15197V0(String str, String str2, Bundle bundle) {
        mo15092h();
        m15196V(str, str2, zzb().currentTimeMillis(), bundle);
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final void m15198W(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        long j2;
        long j3;
        String str4;
        int length;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        mo15092h();
        m115400p();
        if (!this.f165891a.m194118k()) {
            zzj().m211424z().m123936a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listM15082B = mo15094j().m15082B();
        if (listM15082B != null && !listM15082B.contains(str2)) {
            zzj().m211424z().m123938c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f10490f) {
            this.f10490f = true;
            try {
                try {
                    (!this.f165891a.m194122o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e) {
                    zzj().m211417F().m123937b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzj().m211415D().m123936a("Tag Manager is not found and thus will not be used");
            }
        }
        if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            m15205b0("auto", "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
        }
        C2458g c2458g = this;
        if (z && bey0.m101429G0(str2)) {
            c2458g.mo15089e().m101461H(bundle, c2458g.mo15088d().f175514A.m183361a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            bey0 bey0VarM194106G = c2458g.f165891a.m194106G();
            int i = 2;
            if (bey0VarM194106G.m101503w0(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!bey0VarM194106G.m101489j0(NotificationCompat.CATEGORY_EVENT, arx0.f71364a, arx0.f71365b, str2)) {
                    i = 13;
                } else if (bey0VarM194106G.m101484d0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                c2458g.zzj().m211413B().m123937b("Invalid public event name. Event will not be logged (FE)", c2458g.mo15087c().m175776c(str2));
                c2458g.f165891a.m194106G();
                String strM101425D = bey0.m101425D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c2458g.f165891a.m194106G();
                bey0.m101434T(c2458g.f10506v, i, "_ev", strM101425D, length);
                return;
            }
        }
        q1y0 q1y0VarM152642x = c2458g.mo15097m().m152642x(false);
        if (q1y0VarM152642x != null && !bundle.containsKey("_sc")) {
            q1y0VarM152642x.f152181d = true;
        }
        bey0.m101433S(q1y0VarM152642x, bundle, z && !z3);
        boolean zEquals = "am".equals(str5);
        boolean zM101426D0 = bey0.m101426D0(str2);
        if (z && c2458g.f10488d != null && !zM101426D0 && !zEquals) {
            c2458g.zzj().m211424z().m123938c("Passing event to registered event handler (FE)", c2458g.mo15087c().m175776c(str2), c2458g.mo15087c().m175774a(bundle));
            Preconditions.checkNotNull(c2458g.f10488d);
            c2458g.f10488d.mo15063a(str5, str2, bundle, j);
            return;
        }
        long j4 = j;
        if (c2458g.f165891a.m194121n()) {
            int iM101495p = c2458g.mo15089e().m101495p(str2);
            if (iM101495p != 0) {
                c2458g.zzj().m211413B().m123937b("Invalid event name. Event will not be logged (FE)", c2458g.mo15087c().m175776c(str2));
                c2458g.mo15089e();
                String strM101425D2 = bey0.m101425D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c2458g.f165891a.m194106G();
                bey0.m101436U(c2458g.f10506v, str3, iM101495p, "_ev", strM101425D2, length);
                return;
            }
            Bundle bundleM101506z = c2458g.mo15089e().m101506z(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleM101506z);
            if (c2458g.mo15097m().m152642x(false) == null || !"_ae".equals(str2)) {
                z4 = zEquals;
                j2 = 0;
            } else {
                f9y0 f9y0Var = c2458g.mo15099o().f137709f;
                j2 = 0;
                long jElapsedRealtime = f9y0Var.f96547d.zzb().elapsedRealtime();
                z4 = zEquals;
                long j5 = jElapsedRealtime - f9y0Var.f96545b;
                f9y0Var.f96545b = jElapsedRealtime;
                if (j5 > 0) {
                    c2458g.mo15089e().m101460G(bundleM101506z, j5);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                bey0 bey0VarMo15089e = c2458g.mo15089e();
                String string = bundleM101506z.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, bey0VarMo15089e.mo15088d().f175536x.m197913a())) {
                    bey0VarMo15089e.zzj().m211424z().m123936a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                bey0VarMo15089e.mo15088d().f175536x.m197914b(string);
            } else if ("_ae".equals(str2)) {
                String strM197913a = c2458g.mo15089e().mo15088d().f175536x.m197913a();
                if (!TextUtils.isEmpty(strM197913a)) {
                    bundleM101506z.putString("_ffr", strM197913a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM101506z);
            boolean zM158515z = c2458g.mo15085a().m192648n(q8s0.f153247P0) ? c2458g.mo15099o().m158515z() : c2458g.mo15088d().f175533u.m207310b();
            if (c2458g.mo15088d().f175530r.m187782a() > j2 && c2458g.mo15088d().m192708t(j4) && zM158515z) {
                c2458g.zzj().m211416E().m123936a("Current session is expired, remove the session number, ID, and engagement time");
                j3 = j2;
                str4 = "_ae";
                m15205b0("auto", "_sid", null, c2458g.zzb().currentTimeMillis());
                m15205b0("auto", "_sno", null, zzb().currentTimeMillis());
                m15205b0("auto", "_se", null, zzb().currentTimeMillis());
                c2458g = this;
                c2458g.mo15088d().f175531s.m187783b(j3);
            } else {
                j3 = j2;
                str4 = "_ae";
            }
            if (bundleM101506z.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
                c2458g.zzj().m211416E().m123936a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c2458g.f165891a.m194105F().f137708e.m149112b(j4, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleM101506z.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str6 = (String) obj;
                if (str6 != null) {
                    c2458g.mo15089e();
                    Bundle[] bundleArrM101447r0 = bey0.m101447r0(bundleM101506z.get(str6));
                    if (bundleArrM101447r0 != null) {
                        bundleM101506z.putParcelableArray(str6, bundleArrM101447r0);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleM101504y = (Bundle) arrayList.get(i3);
                String str7 = i3 != 0 ? "_ep" : str2;
                bundleM101504y.putString("_o", str5);
                if (z2) {
                    bundleM101504y = c2458g.mo15089e().m101504y(bundleM101504y, null);
                }
                String str8 = str5;
                Bundle bundle2 = bundleM101504y;
                c2458g.mo15098n().m100165y(new zzbf(str7, new zzbe(bundleM101504y), str8, j4), str3);
                if (!z4) {
                    Iterator<nrx0> it = c2458g.f10489e.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
                str5 = str;
                j4 = j;
            }
            if (c2458g.mo15097m().m152642x(false) == null || !str4.equals(str2)) {
                return;
            }
            c2458g.mo15099o().m158514y(true, true, c2458g.zzb().elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m15199W0(boolean z) {
        m115400p();
        zzl().m146305w(new mvx0(this, z));
    }

    /* JADX INFO: renamed from: X */
    public final void m15200X(String str, String str2, long j, Object obj) {
        zzl().m146305w(new bwx0(this, str, str2, obj, j));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m15201X0(Bundle bundle, long j) {
        m15177H(bundle, -20, j);
    }

    /* JADX INFO: renamed from: Y */
    public final void m15202Y(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().m146305w(new bxx0(this, bundle2));
    }

    /* JADX INFO: renamed from: Z */
    public final void m15203Z(String str, String str2, Bundle bundle, String str3) {
        mo15091g();
        m15185M0(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15204a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            mo15097m().m152633C(bundle2, j);
        } else {
            m15185M0(str3, str2, j, bundle2, z2, !z2 || this.f10488d == null || bey0.m101426D0(str2), z, null);
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m15205b0(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m115400p();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long lValueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    mo15088d().f175527o.m197914b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    mo15088d().f175527o.m197914b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                mo15088d().f175527o.m197914b("unset");
                str2 = "_npa";
            }
            zzj().m211416E().m123938c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.f165891a.m194118k()) {
            zzj().m211416E().m123936a("User property not set since app measurement is disabled");
        } else if (this.f165891a.m194121n()) {
            mo15098n().m100166z(new zzon(str4, j, obj2, str));
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15206c0(String str, String str2, Object obj, boolean z) {
        m15207d0(str, str2, obj, z, zzb().currentTimeMillis());
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: d0 */
    public final void m15207d0(String str, String str2, Object obj, boolean z, long j) {
        int iM101490l0;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            iM101490l0 = mo15089e().m101490l0(str2);
        } else {
            bey0 bey0VarMo15089e = mo15089e();
            if (!bey0VarMo15089e.m101503w0("user property", str2)) {
                iM101490l0 = 6;
            } else if (!bey0VarMo15089e.m101488i0("user property", frx0.f99017a, str2)) {
                iM101490l0 = 15;
            } else if (bey0VarMo15089e.m101484d0("user property", 24, str2)) {
                iM101490l0 = 0;
            } else {
                iM101490l0 = 6;
            }
        }
        if (iM101490l0 != 0) {
            mo15089e();
            String strM101425D = bey0.m101425D(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f165891a.m194106G();
            bey0.m101434T(this.f10506v, iM101490l0, "_ev", strM101425D, length);
            return;
        }
        if (obj == null) {
            m15200X(str3, str2, j, null);
            return;
        }
        int iM101496q = mo15089e().m101496q(str2, obj);
        if (iM101496q == 0) {
            Object objM101501u0 = mo15089e().m101501u0(str2, obj);
            if (objM101501u0 != null) {
                m15200X(str3, str2, j, objM101501u0);
                return;
            }
            return;
        }
        mo15089e();
        String strM101425D2 = bey0.m101425D(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f165891a.m194106G();
        bey0.m101434T(this.f10506v, iM101496q, "_ev", strM101425D2, length);
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15208e0(List list) {
        mo15092h();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayM192693E = mo15088d().m192693E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzno zznoVar = (zzno) it.next();
                if (!sparseArrayM192693E.contains(zznoVar.zzc) || sparseArrayM192693E.get(zznoVar.zzc).longValue() < zznoVar.zzb) {
                    m15224u0().add(zznoVar);
                }
            }
            m15167B0();
        }
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15209f0(AtomicReference atomicReference) {
        Bundle bundleM183361a = mo15088d().f175528p.m183361a();
        b3y0 b3y0VarMo15098n = mo15098n();
        if (bundleM183361a == null) {
            bundleM183361a = new Bundle();
        }
        b3y0VarMo15098n.m100134C(atomicReference, bundleM183361a);
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15210g0(qdu0 qdu0Var) throws RemoteException {
        zzl().m146305w(new zxx0(this, qdu0Var));
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m15211h0(nrx0 nrx0Var) {
        m115400p();
        Preconditions.checkNotNull(nrx0Var);
        if (this.f10489e.add(nrx0Var)) {
            return;
        }
        zzj().m211417F().m123936a("OnEventListener already registered");
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ h0s0 mo15093i() {
        return super.mo15093i();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m15212i0(srx0 srx0Var) {
        srx0 srx0Var2;
        mo15092h();
        m115400p();
        if (srx0Var != null && srx0Var != (srx0Var2 = this.f10488d)) {
            Preconditions.checkState(srx0Var2 == null, "EventInterceptor already set.");
        }
        this.f10488d = srx0Var;
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2454c mo15094j() {
        return super.mo15094j();
    }

    /* JADX INFO: renamed from: j0 */
    public final Application.ActivityLifecycleCallbacks m15213j0() {
        return this.f10487c;
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ tmw0 mo15095k() {
        return super.mo15095k();
    }

    @WorkerThread
    /* JADX INFO: renamed from: k0 */
    public final zzaj m15214k0() {
        mo15092h();
        return mo15098n().m100145P();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2458g mo15096l() {
        return super.mo15096l();
    }

    /* JADX INFO: renamed from: l0 */
    public final Boolean m15215l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().m146300o(atomicReference, 15000L, "boolean test flag value", new wux0(this, atomicReference));
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ m1y0 mo15097m() {
        return super.mo15097m();
    }

    /* JADX INFO: renamed from: m0 */
    public final Double m15216m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().m146300o(atomicReference, 15000L, "double test flag value", new ryx0(this, atomicReference));
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ b3y0 mo15098n() {
        return super.mo15098n();
    }

    /* JADX INFO: renamed from: n0 */
    public final Integer m15217n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().m146300o(atomicReference, 15000L, "int test flag value", new eyx0(this, atomicReference));
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ n8y0 mo15099o() {
        return super.mo15099o();
    }

    /* JADX INFO: renamed from: o0 */
    public final Long m15218o0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().m146300o(atomicReference, 15000L, "long test flag value", new iyx0(this, atomicReference));
    }

    /* JADX INFO: renamed from: p0 */
    public final String m15219p0() {
        return this.f10491g.get();
    }

    /* JADX INFO: renamed from: q0 */
    public final String m15220q0() {
        q1y0 q1y0VarM152636J = this.f165891a.m194103D().m152636J();
        if (q1y0VarM152636J != null) {
            return q1y0VarM152636J.f152179b;
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final String m15221r0() {
        q1y0 q1y0VarM152636J = this.f165891a.m194103D().m152636J();
        if (q1y0VarM152636J != null) {
            return q1y0VarM152636J.f152178a;
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final String m15222s0() {
        if (this.f165891a.m194107H() != null) {
            return this.f165891a.m194107H();
        }
        try {
            return new xix0(zza(), this.f165891a.m194110K()).m209683b("google_app_id");
        } catch (IllegalStateException e) {
            this.f165891a.zzj().m211412A().m123937b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final String m15223t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().m146300o(atomicReference, 15000L, "String test flag value", new kwx0(this, atomicReference));
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return false;
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: u0 */
    public final PriorityQueue<zzno> m15224u0() {
        if (this.f10496l == null) {
            this.f10496l = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: l.fsx0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzno) obj).zzb);
                }
            }, new Comparator() { // from class: l.tsx0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f10496l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final void m15225v0() {
        mo15092h();
        m115400p();
        if (mo15085a().m192648n(q8s0.f153282e1)) {
            b3y0 b3y0VarMo15098n = mo15098n();
            b3y0VarMo15098n.mo15092h();
            b3y0VarMo15098n.m115400p();
            if (b3y0VarMo15098n.m100160e0() && b3y0VarMo15098n.mo15089e().m101457C0() < 242600) {
                return;
            }
            mo15098n().m100147R();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: w0 */
    public final void m15226w0() {
        mo15092h();
        m115400p();
        if (this.f165891a.m194121n()) {
            Boolean boolM192659y = mo15085a().m192659y("google_analytics_deferred_deep_link_enabled");
            if (boolM192659y != null && boolM192659y.booleanValue()) {
                zzj().m211424z().m123936a("Deferred Deep Link feature enabled.");
                zzl().m146305w(new Runnable() { // from class: l.etx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f93194a.m15229z0();
                    }
                });
            }
            mo15098n().m100148S();
            this.f10502r = false;
            String strM192699K = mo15088d().m192699K();
            if (TextUtils.isEmpty(strM192699K)) {
                return;
            }
            mo15086b().m127632j();
            if (strM192699K.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strM192699K);
            m15197V0("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m15227x0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f10487c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10487c);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m15228y0() {
        if (mgy0.m154586a() && mo15085a().m192648n(q8s0.f153235J0)) {
            if (zzl().m146299D()) {
                zzj().m211412A().m123936a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (t2r0.m187058a()) {
                zzj().m211412A().m123936a("Cannot get trigger URIs from main thread");
                return;
            }
            m115400p();
            zzj().m211416E().m123936a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().m146300o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get trigger URIs", new Runnable() { // from class: l.psx0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151076a.m15209f0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().m211412A().m123936a("Timed out waiting for get trigger URIs");
            } else {
                zzl().m146305w(new Runnable() { // from class: l.atx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f71690a.m15208e0(list);
                    }
                });
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: z0 */
    public final void m15229z0() {
        mo15092h();
        if (mo15088d().f175534v.m207310b()) {
            zzj().m211424z().m123936a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jM187782a = mo15088d().f175535w.m187782a();
        mo15088d().f175535w.m187783b(1 + jM187782a);
        if (jM187782a >= 5) {
            zzj().m211417F().m123936a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            mo15088d().f175534v.m207309a(true);
        } else {
            if (this.f10503s == null) {
                this.f10503s = new xwx0(this, this.f165891a);
            }
            this.f10503s.m123085b(0L);
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
