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
import com.google.common.util.concurrent.C3103e;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Active;
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
import p153l.a7y0;
import p153l.ajr0;
import p153l.ajx0;
import p153l.atx0;
import p153l.b8y0;
import p153l.c4y0;
import p153l.c5y0;
import p153l.d3y0;
import p153l.d6x0;
import p153l.d6y0;
import p153l.dsx0;
import p153l.eny0;
import p153l.f7y0;
import p153l.g0y0;
import p153l.g4y0;
import p153l.g8y0;
import p153l.g9y0;
import p153l.gqy0;
import p153l.gyy0;
import p153l.h5y0;
import p153l.h6y0;
import p153l.hcy0;
import p153l.hny0;
import p153l.hpr;
import p153l.k7y0;
import p153l.k8y0;
import p153l.kix0;
import p153l.l01;
import p153l.l0y0;
import p153l.l2s0;
import p153l.l4y0;
import p153l.l5y0;
import p153l.liy0;
import p153l.m6y0;
import p153l.n9s0;
import p153l.o4y0;
import p153l.o7s0;
import p153l.o7y0;
import p153l.q5y0;
import p153l.qsx0;
import p153l.r6y0;
import p153l.s4y0;
import p153l.say0;
import p153l.spy0;
import p153l.t0y0;
import p153l.t7y0;
import p153l.thy0;
import p153l.vzx0;
import p153l.w6y0;
import p153l.way0;
import p153l.whs0;
import p153l.wmu0;
import p153l.wxw0;
import p153l.x4y0;
import p153l.x7y0;
import p153l.y0y0;
import p153l.y5y0;
import p153l.zbr0;
import p153l.ziy0;
import p153l.zvw0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2481g extends kix0 {

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public k8y0 f10524c;

    /* JADX INFO: renamed from: d */
    public y0y0 f10525d;

    /* JADX INFO: renamed from: e */
    public final Set<t0y0> f10526e;

    /* JADX INFO: renamed from: f */
    public boolean f10527f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference<String> f10528g;

    /* JADX INFO: renamed from: h */
    public final Object f10529h;

    /* JADX INFO: renamed from: i */
    public boolean f10530i;

    /* JADX INFO: renamed from: j */
    public int f10531j;

    /* JADX INFO: renamed from: k */
    public l2s0 f10532k;

    /* JADX INFO: renamed from: l */
    public PriorityQueue<zzno> f10533l;

    /* JADX INFO: renamed from: m */
    public boolean f10534m;

    /* JADX INFO: renamed from: n */
    @GuardedBy("consentLock")
    public zzje f10535n;

    /* JADX INFO: renamed from: o */
    public final AtomicLong f10536o;

    /* JADX INFO: renamed from: p */
    public long f10537p;

    /* JADX INFO: renamed from: q */
    public final gyy0 f10538q;

    /* JADX INFO: renamed from: r */
    @VisibleForTesting
    public boolean f10539r;

    /* JADX INFO: renamed from: s */
    public l2s0 f10540s;

    /* JADX INFO: renamed from: t */
    public SharedPreferences.OnSharedPreferenceChangeListener f10541t;

    /* JADX INFO: renamed from: u */
    public l2s0 f10542u;

    /* JADX INFO: renamed from: v */
    public final eny0 f10543v;

    public C2481g(atx0 atx0Var) {
        super(atx0Var);
        this.f10526e = new CopyOnWriteArraySet();
        this.f10529h = new Object();
        this.f10530i = false;
        this.f10531j = 1;
        this.f10539r = true;
        this.f10543v = new a7y0(this);
        this.f10528g = new AtomicReference<>();
        this.f10535n = zzje.f10592c;
        this.f10537p = -1L;
        this.f10536o = new AtomicLong(0L);
        this.f10538q = new gyy0(atx0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m15204J0(C2481g c2481g, int i) {
        if (c2481g.f10532k == null) {
            c2481g.f10532k = new g4y0(c2481g, c2481g.f202159a);
        }
        c2481g.f10532k.m152633b(i * 1000);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m15205K0(C2481g c2481g, Bundle bundle) {
        c2481g.mo15146h();
        c2481g.m149988p();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!c2481g.f202159a.m100298k()) {
            c2481g.zzj().m114562E().m153300a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzon zzonVar = new zzon(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzbf zzbfVarM136322B = c2481g.mo15143e().m136322B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2481g.mo15152n().m134564x(new zzae(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), string2, zzonVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2481g.mo15143e().m136322B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzbfVarM136322B, bundle.getLong("time_to_live"), c2481g.mo15143e().m136322B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m15207N(C2481g c2481g, Bundle bundle) {
        c2481g.mo15146h();
        c2481g.m149988p();
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        if (!c2481g.f202159a.m100298k()) {
            c2481g.zzj().m114562E().m153300a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2481g.mo15152n().m134564x(new zzae(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), "", new zzon(strCheckNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean(Active.TYPE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2481g.mo15143e().m136322B(bundle.getString(Constants.JumpUrlConstants.URL_KEY_APPID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m15208O(C2481g c2481g, zzje zzjeVar, long j, boolean z, boolean z2) {
        c2481g.mo15146h();
        c2481g.m149988p();
        zzje zzjeVarM98510G = c2481g.mo15142d().m98510G();
        if (j <= c2481g.f10537p && zzje.m15395l(zzjeVarM98510G.m15399b(), zzjeVar.m15399b())) {
            c2481g.zzj().m114561D().m153301b("Dropped out-of-date consent setting, proposed settings", zzjeVar);
            return;
        }
        if (!c2481g.mo15142d().m98527v(zzjeVar)) {
            c2481g.zzj().m114561D().m153301b("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjeVar.m15399b()));
            return;
        }
        c2481g.zzj().m114562E().m153301b("Setting storage consent(FE)", zzjeVar);
        c2481g.f10537p = j;
        if (c2481g.mo15152n().m134559d0()) {
            c2481g.mo15152n().m134561i0(z);
        } else {
            c2481g.mo15152n().m134544O(z);
        }
        if (z2) {
            c2481g.mo15152n().m134533B(new AtomicReference<>());
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m15209P(C2481g c2481g, zzje zzjeVar, zzje zzjeVar2) {
        if (ziy0.m219953a() && c2481g.mo15139a().m98440n(whs0.f189241Y0)) {
            return;
        }
        zzje.zza zzaVar = zzje.zza.ANALYTICS_STORAGE;
        zzje.zza zzaVar2 = zzje.zza.AD_STORAGE;
        boolean zM15402n = zzjeVar.m15402n(zzjeVar2, zzaVar, zzaVar2);
        boolean zM15405s = zzjeVar.m15405s(zzjeVar2, zzaVar, zzaVar2);
        if (zM15402n || zM15405s) {
            c2481g.mo15148j().m15137C();
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m15214w(C2481g c2481g, Throwable th) {
        String message = th.getMessage();
        c2481g.f10534m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            c2481g.f10534m = true;
        }
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public static int m15216y(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    /* JADX INFO: renamed from: A */
    public final ArrayList<Bundle> m15218A(String str, String str2) {
        if (zzl().m177835D()) {
            zzj().m114558A().m153300a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zbr0.m219217a()) {
            zzj().m114558A().m153300a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f202159a.zzl().m177836o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get conditional user properties", new w6y0(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return hny0.m136312n0(list);
        }
        zzj().m114558A().m153301b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A0 */
    public final void m15219A0() {
        mo15146h();
        zzj().m114570z().m153300a("Handle tcf update.");
        C2483i c2483iM15285c = C2483i.m15285c(mo15142d().m98505B());
        zzj().m114562E().m153301b("Tcf preferences read", c2483iM15285c);
        if (mo15142d().m98528w(c2483iM15285c)) {
            Bundle bundleM15288b = c2483iM15285c.m15288b();
            zzj().m114562E().m153301b("Consent generated from Tcf", bundleM15288b);
            if (bundleM15288b != Bundle.EMPTY) {
                m15231H(bundleM15288b, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c2483iM15285c.m15289e());
            m15251V0("auto", "_tcf", bundle);
        }
    }

    /* JADX INFO: renamed from: B */
    public final Map<String, Object> m15220B(String str, String str2, boolean z) {
        if (zzl().m177835D()) {
            zzj().m114558A().m153300a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (zbr0.m219217a()) {
            zzj().m114558A().m153300a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f202159a.zzl().m177836o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get user properties", new r6y0(this, atomicReference, null, str, str2, z));
        List<zzon> list = (List) atomicReference.get();
        if (list == null) {
            zzj().m114558A().m153301b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        l01 l01Var = new l01(list.size());
        for (zzon zzonVar : list) {
            Object objM15413F = zzonVar.m15413F();
            if (objM15413F != null) {
                l01Var.put(zzonVar.zza, objM15413F);
            }
        }
        return l01Var;
    }

    @TargetApi(30)
    @WorkerThread
    /* JADX INFO: renamed from: B0 */
    public final void m15221B0() {
        zzno zznoVarPoll;
        MeasurementManagerFutures measurementManagerFuturesM136339N0;
        mo15146h();
        this.f10534m = false;
        if (m15278u0().isEmpty() || this.f10530i || (zznoVarPoll = m15278u0().poll()) == null || (measurementManagerFuturesM136339N0 = mo15143e().m136339N0()) == null) {
            return;
        }
        this.f10530i = true;
        zzj().m114562E().m153301b("Registering trigger URI", zznoVarPoll.zza);
        hpr<Unit> hprVarMo3209d = measurementManagerFuturesM136339N0.mo3209d(Uri.parse(zznoVarPoll.zza));
        if (hprVarMo3209d == null) {
            this.f10530i = false;
            m15278u0().add(zznoVarPoll);
            return;
        }
        if (!mo15139a().m98440n(whs0.f189221O0)) {
            SparseArray<Long> sparseArrayM98508E = mo15142d().m98508E();
            sparseArrayM98508E.put(zznoVarPoll.zzc, Long.valueOf(zznoVarPoll.zzb));
            mo15142d().m98521p(sparseArrayM98508E);
        }
        C3103e.m16709a(hprVarMo3209d, new l4y0(this, zznoVarPoll), new d3y0(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m15222C(long j) {
        m15249U0(null);
        zzl().m177841w(new y5y0(this, j));
    }

    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final void m15223C0() {
        mo15146h();
        zzj().m114570z().m153300a("Register tcfPrefChangeListener.");
        if (this.f10541t == null) {
            this.f10542u = new x4y0(this, this.f202159a);
            this.f10541t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.z2y0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f202770a.m15228F(sharedPreferences, str);
                }
            };
        }
        mo15142d().m98505B().registerOnSharedPreferenceChangeListener(this.f10541t);
    }

    /* JADX INFO: renamed from: D */
    public final void m15224D(long j, boolean z) {
        mo15146h();
        m149988p();
        zzj().m114570z().m153300a("Resetting analytics data (FE)");
        thy0 thy0VarMo15153o = mo15153o();
        thy0VarMo15153o.mo15146h();
        thy0VarMo15153o.f174433f.m154433b();
        mo15148j().m15137C();
        boolean zM100298k = this.f202159a.m100298k();
        ajx0 ajx0VarMo15142d = mo15142d();
        ajx0VarMo15142d.f71900g.m219991b(j);
        if (!TextUtils.isEmpty(ajx0VarMo15142d.mo15142d().f71917x.m105276a())) {
            ajx0VarMo15142d.f71917x.m105277b(null);
        }
        ajx0VarMo15142d.f71911r.m219991b(0L);
        ajx0VarMo15142d.f71912s.m219991b(0L);
        if (!ajx0VarMo15142d.mo15139a().m98432Q()) {
            ajx0VarMo15142d.m98504A(!zM100298k);
        }
        ajx0VarMo15142d.f71918y.m105277b(null);
        ajx0VarMo15142d.f71919z.m219991b(0L);
        ajx0VarMo15142d.f71895A.m216544b(null);
        if (z) {
            mo15152n().m134553X();
        }
        mo15153o().f174432e.m181622a();
        this.f10539r = !zM100298k;
    }

    /* JADX INFO: renamed from: D0 */
    public final boolean m15225D0() {
        return this.f10534m;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final void m15226E(Intent intent) {
        if (gqy0.m131505a() && mo15139a().m98440n(whs0.f189308z0)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().m114561D().m153300a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                zzj().m114561D().m153300a("Preview Mode was not enabled.");
                mo15139a().m98423F(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzj().m114561D().m153301b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            mo15139a().m98423F(queryParameter2);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: E0 */
    public final void m15227E0() {
        C2481g c2481g;
        mo15146h();
        String strM105276a = mo15142d().f71908o.m105276a();
        if (strM105276a == null) {
            c2481g = this;
        } else if ("unset".equals(strM105276a)) {
            c2481g = this;
            c2481g.m15259b0("app", "_npa", null, zzb().currentTimeMillis());
        } else {
            c2481g = this;
            c2481g.m15259b0("app", "_npa", Long.valueOf("true".equals(strM105276a) ? 1L : 0L), c2481g.zzb().currentTimeMillis());
        }
        if (!c2481g.f202159a.m100298k() || !c2481g.f10539r) {
            c2481g.zzj().m114570z().m153300a("Updating Scion state (FE)");
            c2481g.mo15152n().m134555Z();
        } else {
            c2481g.zzj().m114570z().m153300a("Recording app launch after enabling measurement for the first time (FE)");
            c2481g.m15280w0();
            c2481g.mo15153o().f174432e.m181622a();
            c2481g.zzl().m177841w(new o4y0(c2481g));
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m15228F(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            zzj().m114562E().m153300a("IABTCF_TCString change picked up in listener.");
            ((l2s0) Preconditions.checkNotNull(this.f10542u)).m152633b(500L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m15229G(Bundle bundle) {
        Bundle bundleM216543a;
        if (bundle.isEmpty()) {
            bundleM216543a = bundle;
        } else {
            bundleM216543a = mo15142d().f71895A.m216543a();
            if (mo15139a().m98440n(whs0.f189270i1)) {
                bundleM216543a = new Bundle(bundleM216543a);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    mo15143e();
                    if (hny0.m136308b0(obj)) {
                        mo15143e();
                        hny0.m136301T(this.f10543v, 27, null, null, 0);
                    }
                    zzj().m114564G().m153302c("Invalid default event parameter type. Name, value", str, obj);
                } else if (hny0.m136293D0(str)) {
                    zzj().m114564G().m153301b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleM216543a.remove(str);
                } else if (mo15143e().m136353f0("param", str, mo15139a().m98438l(null, false), obj)) {
                    mo15143e().m136330I(bundleM216543a, str, obj);
                }
            }
            mo15143e();
            if (hny0.m136307a0(bundleM216543a, mo15139a().m98445s())) {
                mo15143e();
                hny0.m136301T(this.f10543v, 26, null, null, 0);
                zzj().m114564G().m153300a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        mo15142d().f71895A.m216544b(bundleM216543a);
        if (!bundle.isEmpty() || mo15139a().m98440n(whs0.f189264g1)) {
            mo15152n().m134563w(bundleM216543a);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: G0 */
    public final void m15230G0(long j) {
        m15224D(j, true);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: H */
    public final void m15231H(Bundle bundle, int i, long j) {
        m149988p();
        String strM15394k = zzje.m15394k(bundle);
        if (strM15394k != null) {
            zzj().m114564G().m153301b("Ignoring invalid consent setting", strM15394k);
            zzj().m114564G().m153300a("Valid consent values are 'granted', 'denied'");
        }
        boolean zM177835D = zzl().m177835D();
        zzje zzjeVarM15387c = zzje.m15387c(bundle, i);
        if (zzjeVarM15387c.m15398A()) {
            m15237L(zzjeVarM15387c, j, zM177835D);
        }
        C2476b c2476bM15122b = C2476b.m15122b(bundle, i);
        if (c2476bM15122b.m15132k()) {
            m15235J(c2476bM15122b, zM177835D);
        }
        Boolean boolM15125e = C2476b.m15125e(bundle);
        if (boolM15125e != null) {
            String str = i == -30 ? "tcf" : "app";
            if (mo15139a().m98440n(whs0.f189231T0) && zM177835D) {
                m15259b0(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15125e.toString(), j);
            } else {
                m15261d0(str, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolM15125e.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m15232H0(Bundle bundle) {
        m15234I0(bundle, zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m15233I(Bundle bundle, long j) {
        if (TextUtils.isEmpty(mo15148j().m15135A())) {
            m15231H(bundle, 0, j);
        } else {
            zzj().m114564G().m153300a("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m15234I0(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString(Constants.JumpUrlConstants.URL_KEY_APPID))) {
            zzj().m114563F().m153300a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(Constants.JumpUrlConstants.URL_KEY_APPID);
        Preconditions.checkNotNull(bundle2);
        vzx0.m204129a(bundle2, Constants.JumpUrlConstants.URL_KEY_APPID, String.class, null);
        vzx0.m204129a(bundle2, "origin", String.class, null);
        vzx0.m204129a(bundle2, AuthenticationTokenClaims.JSON_KEY_NAME, String.class, null);
        vzx0.m204129a(bundle2, "value", Object.class, null);
        vzx0.m204129a(bundle2, "trigger_event_name", String.class, null);
        vzx0.m204129a(bundle2, "trigger_timeout", Long.class, 0L);
        vzx0.m204129a(bundle2, "timed_out_event_name", String.class, null);
        vzx0.m204129a(bundle2, "timed_out_event_params", Bundle.class, null);
        vzx0.m204129a(bundle2, "triggered_event_name", String.class, null);
        vzx0.m204129a(bundle2, "triggered_event_params", Bundle.class, null);
        vzx0.m204129a(bundle2, "time_to_live", Long.class, 0L);
        vzx0.m204129a(bundle2, "expired_event_name", String.class, null);
        vzx0.m204129a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
        Object obj = bundle2.get("value");
        if (mo15143e().m136356l0(string) != 0) {
            zzj().m114558A().m153301b("Invalid conditional user property name", mo15141c().m208452g(string));
            return;
        }
        if (mo15143e().m136361q(string, obj) != 0) {
            zzj().m114558A().m153302c("Invalid conditional user property value", mo15141c().m208452g(string), obj);
            return;
        }
        Object objM136366u0 = mo15143e().m136366u0(string, obj);
        if (objM136366u0 == null) {
            zzj().m114558A().m153302c("Unable to normalize conditional user property value", mo15141c().m208452g(string), obj);
            return;
        }
        vzx0.m204130b(bundle2, objM136366u0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            zzj().m114558A().m153302c("Invalid conditional user property timeout", mo15141c().m208452g(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            zzj().m114558A().m153302c("Invalid conditional user property time to live", mo15141c().m208452g(string), Long.valueOf(j3));
        } else {
            zzl().m177841w(new m6y0(this, bundle2));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m15235J(C2476b c2476b, boolean z) {
        g8y0 g8y0Var = new g8y0(this, c2476b);
        if (!z) {
            zzl().m177841w(g8y0Var);
        } else {
            mo15146h();
            g8y0Var.run();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m15236K(zzje zzjeVar) {
        mo15146h();
        boolean z = (zzjeVar.m15412z() && zzjeVar.m15411y()) || mo15152n().m134558c0();
        if (z != this.f202159a.m100299l()) {
            this.f202159a.m100305r(z);
            Boolean boolM98512I = mo15142d().m98512I();
            if (!z || boolM98512I == null || boolM98512I.booleanValue()) {
                m15247T(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m15237L(zzje zzjeVar, long j, boolean z) {
        zzje zzjeVar2;
        boolean z2;
        zzje zzjeVarM15404p;
        boolean zM15407u;
        boolean z3;
        m149988p();
        int iM15399b = zzjeVar.m15399b();
        if (iM15399b != -10) {
            zzjh zzjhVarM15406t = zzjeVar.m15406t();
            zzjh zzjhVar = zzjh.UNINITIALIZED;
            if (zzjhVarM15406t == zzjhVar && zzjeVar.m15408v() == zzjhVar) {
                zzj().m114564G().m153300a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f10529h) {
            try {
                zzjeVar2 = this.f10535n;
                z2 = false;
                if (zzje.m15395l(iM15399b, zzjeVar2.m15399b())) {
                    zM15407u = zzjeVar.m15407u(this.f10535n);
                    if (zzjeVar.m15412z() && !this.f10535n.m15412z()) {
                        z2 = true;
                    }
                    zzjeVarM15404p = zzjeVar.m15404p(this.f10535n);
                    this.f10535n = zzjeVarM15404p;
                    z3 = z2;
                    z2 = true;
                } else {
                    zzjeVarM15404p = zzjeVar;
                    zM15407u = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            zzj().m114561D().m153301b("Ignoring lower-priority consent settings, proposed settings", zzjeVarM15404p);
            return;
        }
        long andIncrement = this.f10536o.getAndIncrement();
        if (zM15407u) {
            m15249U0(null);
            b8y0 b8y0Var = new b8y0(this, zzjeVarM15404p, j, andIncrement, z3, zzjeVar2);
            if (!z) {
                zzl().m177834A(b8y0Var);
                return;
            } else {
                mo15146h();
                b8y0Var.run();
                return;
            }
        }
        g9y0 g9y0Var = new g9y0(this, zzjeVarM15404p, andIncrement, z3, zzjeVar2);
        if (z) {
            mo15146h();
            g9y0Var.run();
        } else if (iM15399b == 30 || iM15399b == -10) {
            zzl().m177834A(g9y0Var);
        } else {
            zzl().m177841w(g9y0Var);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m15238L0(String str) {
        if (mo15148j().m15138E(str)) {
            mo15148j().m15137C();
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m15239M0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzl().m177841w(new l5y0(this, str, str2, j, hny0.m136320x(bundle), z, z2, z3, str3));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m15240N0(String str, String str2, Bundle bundle) {
        m15258a0(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m15241O0(t0y0 t0y0Var) {
        m149988p();
        Preconditions.checkNotNull(t0y0Var);
        if (this.f10526e.remove(t0y0Var)) {
            return;
        }
        zzj().m114563F().m153300a("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: P0 */
    public final void m15242P0(boolean z) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.f10524c == null) {
                this.f10524c = new k8y0(this);
            }
            if (z) {
                application.unregisterActivityLifecycleCallbacks(this.f10524c);
                application.registerActivityLifecycleCallbacks(this.f10524c);
                zzj().m114562E().m153300a("Registered activity lifecycle callback");
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m15243Q0(long j) {
        zzl().m177841w(new c5y0(this, j));
    }

    /* JADX INFO: renamed from: R0 */
    public final void m15244R0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzl().m177841w(new Runnable() { // from class: l.c2y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79530a.m15229G(bundle2);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m15245S(Boolean bool) {
        m149988p();
        zzl().m177841w(new t7y0(this, bool));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m15246S0(final Bundle bundle, final long j) {
        zzl().m177834A(new Runnable() { // from class: l.p2y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f150343a.m15233I(bundle, j);
            }
        });
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m15247T(Boolean bool, boolean z) {
        mo15146h();
        m149988p();
        zzj().m114570z().m153301b("Setting app measurement enabled (FE)", bool);
        mo15142d().m98522q(bool);
        if (z) {
            mo15142d().m98530y(bool);
        }
        if (this.f202159a.m100299l() || !(bool == null || bool.booleanValue())) {
            m15227E0();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m15248U(final String str, long j) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f202159a.zzj().m114563F().m153300a("User ID must be non-empty or null");
        } else {
            zzl().m177841w(new Runnable() { // from class: l.u2y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177267a.m15238L0(str);
                }
            });
            m15261d0(null, "_id", str, true, j);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m15249U0(String str) {
        this.f10528g.set(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final void m15250V(String str, String str2, long j, Bundle bundle) {
        mo15146h();
        m15252W(str, str2, j, bundle, true, this.f10525d == null || hny0.m136293D0(str2), true, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: V0 */
    public final void m15251V0(String str, String str2, Bundle bundle) {
        mo15146h();
        m15250V(str, str2, zzb().currentTimeMillis(), bundle);
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final void m15252W(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        long j2;
        long j3;
        String str4;
        int length;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        mo15146h();
        m149988p();
        if (!this.f202159a.m100298k()) {
            zzj().m114570z().m153300a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listM15136B = mo15148j().m15136B();
        if (listM15136B != null && !listM15136B.contains(str2)) {
            zzj().m114570z().m153302c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f10527f) {
            this.f10527f = true;
            try {
                try {
                    (!this.f202159a.m100302o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e) {
                    zzj().m114563F().m153301b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzj().m114561D().m153300a("Tag Manager is not found and thus will not be used");
            }
        }
        if (com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            m15259b0("auto", "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
        }
        C2481g c2481g = this;
        if (z && hny0.m136296G0(str2)) {
            c2481g.mo15143e().m136328H(bundle, c2481g.mo15142d().f71895A.m216543a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            hny0 hny0VarM100286G = c2481g.f202159a.m100286G();
            int i = 2;
            if (hny0VarM100286G.m136368w0(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!hny0VarM100286G.m136355j0(NotificationCompat.CATEGORY_EVENT, g0y0.f101692a, g0y0.f101693b, str2)) {
                    i = 13;
                } else if (hny0VarM100286G.m136351d0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                c2481g.zzj().m114559B().m153301b("Invalid public event name. Event will not be logged (FE)", c2481g.mo15141c().m208449c(str2));
                c2481g.f202159a.m100286G();
                String strM136292D = hny0.m136292D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c2481g.f202159a.m100286G();
                hny0.m136301T(c2481g.f10543v, i, "_ev", strM136292D, length);
                return;
            }
        }
        way0 way0VarM185291x = c2481g.mo15151m().m185291x(false);
        if (way0VarM185291x != null && !bundle.containsKey("_sc")) {
            way0VarM185291x.f188181d = true;
        }
        hny0.m136300S(way0VarM185291x, bundle, z && !z3);
        boolean zEquals = "am".equals(str5);
        boolean zM136293D0 = hny0.m136293D0(str2);
        if (z && c2481g.f10525d != null && !zM136293D0 && !zEquals) {
            c2481g.zzj().m114570z().m153302c("Passing event to registered event handler (FE)", c2481g.mo15141c().m208449c(str2), c2481g.mo15141c().m208447a(bundle));
            Preconditions.checkNotNull(c2481g.f10525d);
            c2481g.f10525d.mo15117a(str5, str2, bundle, j);
            return;
        }
        long j4 = j;
        if (c2481g.f202159a.m100301n()) {
            int iM136360p = c2481g.mo15143e().m136360p(str2);
            if (iM136360p != 0) {
                c2481g.zzj().m114559B().m153301b("Invalid event name. Event will not be logged (FE)", c2481g.mo15141c().m208449c(str2));
                c2481g.mo15143e();
                String strM136292D2 = hny0.m136292D(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                c2481g.f202159a.m100286G();
                hny0.m136303U(c2481g.f10543v, str3, iM136360p, "_ev", strM136292D2, length);
                return;
            }
            Bundle bundleM136371z = c2481g.mo15143e().m136371z(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleM136371z);
            if (c2481g.mo15151m().m185291x(false) == null || !"_ae".equals(str2)) {
                z4 = zEquals;
                j2 = 0;
            } else {
                liy0 liy0Var = c2481g.mo15153o().f174433f;
                j2 = 0;
                long jElapsedRealtime = liy0Var.f132276d.zzb().elapsedRealtime();
                z4 = zEquals;
                long j5 = jElapsedRealtime - liy0Var.f132274b;
                liy0Var.f132274b = jElapsedRealtime;
                if (j5 > 0) {
                    c2481g.mo15143e().m136327G(bundleM136371z, j5);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                hny0 hny0VarMo15143e = c2481g.mo15143e();
                String string = bundleM136371z.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, hny0VarMo15143e.mo15142d().f71917x.m105276a())) {
                    hny0VarMo15143e.zzj().m114570z().m153300a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                hny0VarMo15143e.mo15142d().f71917x.m105277b(string);
            } else if ("_ae".equals(str2)) {
                String strM105276a = c2481g.mo15143e().mo15142d().f71917x.m105276a();
                if (!TextUtils.isEmpty(strM105276a)) {
                    bundleM136371z.putString("_ffr", strM105276a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM136371z);
            boolean zM191308z = c2481g.mo15139a().m98440n(whs0.f189223P0) ? c2481g.mo15153o().m191308z() : c2481g.mo15142d().f71914u.m115833b();
            if (c2481g.mo15142d().f71911r.m219990a() > j2 && c2481g.mo15142d().m98525t(j4) && zM191308z) {
                c2481g.zzj().m114562E().m153300a("Current session is expired, remove the session number, ID, and engagement time");
                j3 = j2;
                str4 = "_ae";
                m15259b0("auto", "_sid", null, c2481g.zzb().currentTimeMillis());
                m15259b0("auto", "_sno", null, zzb().currentTimeMillis());
                m15259b0("auto", "_se", null, zzb().currentTimeMillis());
                c2481g = this;
                c2481g.mo15142d().f71912s.m219991b(j3);
            } else {
                j3 = j2;
                str4 = "_ae";
            }
            if (bundleM136371z.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j3) == 1) {
                c2481g.zzj().m114562E().m153300a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c2481g.f202159a.m100285F().f174432e.m181623b(j4, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleM136371z.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str6 = (String) obj;
                if (str6 != null) {
                    c2481g.mo15143e();
                    Bundle[] bundleArrM136314r0 = hny0.m136314r0(bundleM136371z.get(str6));
                    if (bundleArrM136314r0 != null) {
                        bundleM136371z.putParcelableArray(str6, bundleArrM136314r0);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleM136369y = (Bundle) arrayList.get(i3);
                String str7 = i3 != 0 ? "_ep" : str2;
                bundleM136369y.putString("_o", str5);
                if (z2) {
                    bundleM136369y = c2481g.mo15143e().m136369y(bundleM136369y, null);
                }
                String str8 = str5;
                Bundle bundle2 = bundleM136369y;
                c2481g.mo15152n().m134565y(new zzbf(str7, new zzbe(bundleM136369y), str8, j4), str3);
                if (!z4) {
                    Iterator<t0y0> it = c2481g.f10526e.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
                str5 = str;
                j4 = j;
            }
            if (c2481g.mo15151m().m185291x(false) == null || !str4.equals(str2)) {
                return;
            }
            c2481g.mo15153o().m191307y(true, true, c2481g.zzb().elapsedRealtime());
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m15253W0(boolean z) {
        m149988p();
        zzl().m177841w(new s4y0(this, z));
    }

    /* JADX INFO: renamed from: X */
    public final void m15254X(String str, String str2, long j, Object obj) {
        zzl().m177841w(new h5y0(this, str, str2, obj, j));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m15255X0(Bundle bundle, long j) {
        m15231H(bundle, -20, j);
    }

    /* JADX INFO: renamed from: Y */
    public final void m15256Y(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(AuthenticationTokenClaims.JSON_KEY_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().m177841w(new h6y0(this, bundle2));
    }

    /* JADX INFO: renamed from: Z */
    public final void m15257Z(String str, String str2, Bundle bundle, String str3) {
        mo15145g();
        m15239M0(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15258a0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            mo15151m().m185282C(bundle2, j);
        } else {
            m15239M0(str3, str2, j, bundle2, z2, !z2 || this.f10525d == null || hny0.m136293D0(str2), z, null);
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m15259b0(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m149988p();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long lValueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    mo15142d().f71908o.m105277b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    mo15142d().f71908o.m105277b("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                mo15142d().f71908o.m105277b("unset");
                str2 = "_npa";
            }
            zzj().m114562E().m153302c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.f202159a.m100298k()) {
            zzj().m114562E().m153300a("User property not set since app measurement is disabled");
        } else if (this.f202159a.m100301n()) {
            mo15152n().m134566z(new zzon(str4, j, obj2, str));
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15260c0(String str, String str2, Object obj, boolean z) {
        m15261d0(str, str2, obj, z, zzb().currentTimeMillis());
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    /* JADX INFO: renamed from: d0 */
    public final void m15261d0(String str, String str2, Object obj, boolean z, long j) {
        int iM136356l0;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            iM136356l0 = mo15143e().m136356l0(str2);
        } else {
            hny0 hny0VarMo15143e = mo15143e();
            if (!hny0VarMo15143e.m136368w0("user property", str2)) {
                iM136356l0 = 6;
            } else if (!hny0VarMo15143e.m136354i0("user property", l0y0.f129627a, str2)) {
                iM136356l0 = 15;
            } else if (hny0VarMo15143e.m136351d0("user property", 24, str2)) {
                iM136356l0 = 0;
            } else {
                iM136356l0 = 6;
            }
        }
        if (iM136356l0 != 0) {
            mo15143e();
            String strM136292D = hny0.m136292D(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f202159a.m100286G();
            hny0.m136301T(this.f10543v, iM136356l0, "_ev", strM136292D, length);
            return;
        }
        if (obj == null) {
            m15254X(str3, str2, j, null);
            return;
        }
        int iM136361q = mo15143e().m136361q(str2, obj);
        if (iM136361q == 0) {
            Object objM136366u0 = mo15143e().m136366u0(str2, obj);
            if (objM136366u0 != null) {
                m15254X(str3, str2, j, objM136366u0);
                return;
            }
            return;
        }
        mo15143e();
        String strM136292D2 = hny0.m136292D(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f202159a.m100286G();
        hny0.m136301T(this.f10543v, iM136361q, "_ev", strM136292D2, length);
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15262e0(List list) {
        mo15146h();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayM98508E = mo15142d().m98508E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzno zznoVar = (zzno) it.next();
                if (!sparseArrayM98508E.contains(zznoVar.zzc) || sparseArrayM98508E.get(zznoVar.zzc).longValue() < zznoVar.zzb) {
                    m15278u0().add(zznoVar);
                }
            }
            m15221B0();
        }
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15263f0(AtomicReference atomicReference) {
        Bundle bundleM216543a = mo15142d().f71909p.m216543a();
        hcy0 hcy0VarMo15152n = mo15152n();
        if (bundleM216543a == null) {
            bundleM216543a = new Bundle();
        }
        hcy0VarMo15152n.m134534C(atomicReference, bundleM216543a);
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15264g0(wmu0 wmu0Var) throws RemoteException {
        zzl().m177841w(new f7y0(this, wmu0Var));
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m15265h0(t0y0 t0y0Var) {
        m149988p();
        Preconditions.checkNotNull(t0y0Var);
        if (this.f10526e.add(t0y0Var)) {
            return;
        }
        zzj().m114563F().m153300a("OnEventListener already registered");
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ n9s0 mo15147i() {
        return super.mo15147i();
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m15266i0(y0y0 y0y0Var) {
        y0y0 y0y0Var2;
        mo15146h();
        m149988p();
        if (y0y0Var != null && y0y0Var != (y0y0Var2 = this.f10525d)) {
            Preconditions.checkState(y0y0Var2 == null, "EventInterceptor already set.");
        }
        this.f10525d = y0y0Var;
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2477c mo15148j() {
        return super.mo15148j();
    }

    /* JADX INFO: renamed from: j0 */
    public final Application.ActivityLifecycleCallbacks m15267j0() {
        return this.f10524c;
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ zvw0 mo15149k() {
        return super.mo15149k();
    }

    @WorkerThread
    /* JADX INFO: renamed from: k0 */
    public final zzaj m15268k0() {
        mo15146h();
        return mo15152n().m134545P();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2481g mo15150l() {
        return super.mo15150l();
    }

    /* JADX INFO: renamed from: l0 */
    public final Boolean m15269l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().m177836o(atomicReference, 15000L, "boolean test flag value", new c4y0(this, atomicReference));
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ say0 mo15151m() {
        return super.mo15151m();
    }

    /* JADX INFO: renamed from: m0 */
    public final Double m15270m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().m177836o(atomicReference, 15000L, "double test flag value", new x7y0(this, atomicReference));
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ hcy0 mo15152n() {
        return super.mo15152n();
    }

    /* JADX INFO: renamed from: n0 */
    public final Integer m15271n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().m177836o(atomicReference, 15000L, "int test flag value", new k7y0(this, atomicReference));
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ thy0 mo15153o() {
        return super.mo15153o();
    }

    /* JADX INFO: renamed from: o0 */
    public final Long m15272o0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().m177836o(atomicReference, 15000L, "long test flag value", new o7y0(this, atomicReference));
    }

    /* JADX INFO: renamed from: p0 */
    public final String m15273p0() {
        return this.f10528g.get();
    }

    /* JADX INFO: renamed from: q0 */
    public final String m15274q0() {
        way0 way0VarM185285J = this.f202159a.m100283D().m185285J();
        if (way0VarM185285J != null) {
            return way0VarM185285J.f188179b;
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public final String m15275r0() {
        way0 way0VarM185285J = this.f202159a.m100283D().m185285J();
        if (way0VarM185285J != null) {
            return way0VarM185285J.f188178a;
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public final String m15276s0() {
        if (this.f202159a.m100287H() != null) {
            return this.f202159a.m100287H();
        }
        try {
            return new dsx0(zza(), this.f202159a.m100290K()).m117785b("google_app_id");
        } catch (IllegalStateException e) {
            this.f202159a.zzj().m114558A().m153301b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final String m15277t0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().m177836o(atomicReference, 15000L, "String test flag value", new q5y0(this, atomicReference));
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
        return false;
    }

    @TargetApi(30)
    /* JADX INFO: renamed from: u0 */
    public final PriorityQueue<zzno> m15278u0() {
        if (this.f10533l == null) {
            this.f10533l = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: l.l1y0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzno) obj).zzb);
                }
            }, new Comparator() { // from class: l.z1y0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f10533l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final void m15279v0() {
        mo15146h();
        m149988p();
        if (mo15139a().m98440n(whs0.f189258e1)) {
            hcy0 hcy0VarMo15152n = mo15152n();
            hcy0VarMo15152n.mo15146h();
            hcy0VarMo15152n.m149988p();
            if (hcy0VarMo15152n.m134560e0() && hcy0VarMo15152n.mo15143e().m136324C0() < 242600) {
                return;
            }
            mo15152n().m134547R();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: w0 */
    public final void m15280w0() {
        mo15146h();
        m149988p();
        if (this.f202159a.m100301n()) {
            Boolean boolM98451y = mo15139a().m98451y("google_analytics_deferred_deep_link_enabled");
            if (boolM98451y != null && boolM98451y.booleanValue()) {
                zzj().m114570z().m153300a("Deferred Deep Link feature enabled.");
                zzl().m177841w(new Runnable() { // from class: l.k2y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123672a.m15283z0();
                    }
                });
            }
            mo15152n().m134548S();
            this.f10539r = false;
            String strM98514K = mo15142d().m98514K();
            if (TextUtils.isEmpty(strM98514K)) {
                return;
            }
            mo15140b().m160930j();
            if (strM98514K.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strM98514K);
            m15251V0("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m15281x0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f10524c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f10524c);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m15282y0() {
        if (spy0.m187491a() && mo15139a().m98440n(whs0.f189211J0)) {
            if (zzl().m177835D()) {
                zzj().m114558A().m153300a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zbr0.m219217a()) {
                zzj().m114558A().m153300a("Cannot get trigger URIs from main thread");
                return;
            }
            m149988p();
            zzj().m114562E().m153300a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().m177836o(atomicReference, com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS, "get trigger URIs", new Runnable() { // from class: l.v1y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182033a.m15263f0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().m114558A().m153300a("Timed out waiting for get trigger URIs");
            } else {
                zzl().m177841w(new Runnable() { // from class: l.g2y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f101902a.m15262e0(list);
                    }
                });
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: z0 */
    public final void m15283z0() {
        mo15146h();
        if (mo15142d().f71915v.m115833b()) {
            zzj().m114570z().m153300a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jM219990a = mo15142d().f71916w.m219990a();
        mo15142d().f71916w.m219991b(1 + jM219990a);
        if (jM219990a >= 5) {
            zzj().m114563F().m153300a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            mo15142d().f71915v.m115832a(true);
        } else {
            if (this.f10540s == null) {
                this.f10540s = new d6y0(this, this.f202159a);
            }
            this.f10540s.m152633b(0L);
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
