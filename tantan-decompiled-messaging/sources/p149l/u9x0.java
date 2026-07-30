package p149l;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2453b;
import com.google.android.gms.measurement.internal.C2460i;
import com.google.android.gms.measurement.internal.zzje;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u9x0 extends gqx0 {

    /* JADX INFO: renamed from: B */
    public static final Pair<String, Long> f175513B = new Pair<>("", 0L);

    /* JADX INFO: renamed from: A */
    public final sbx0 f175514A;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f175515c;

    /* JADX INFO: renamed from: d */
    public Object f175516d;

    /* JADX INFO: renamed from: e */
    public SharedPreferences f175517e;

    /* JADX INFO: renamed from: f */
    public sdx0 f175518f;

    /* JADX INFO: renamed from: g */
    public final tax0 f175519g;

    /* JADX INFO: renamed from: h */
    public final tax0 f175520h;

    /* JADX INFO: renamed from: i */
    public final vcx0 f175521i;

    /* JADX INFO: renamed from: j */
    public String f175522j;

    /* JADX INFO: renamed from: k */
    public boolean f175523k;

    /* JADX INFO: renamed from: l */
    public long f175524l;

    /* JADX INFO: renamed from: m */
    public final tax0 f175525m;

    /* JADX INFO: renamed from: n */
    public final x7x0 f175526n;

    /* JADX INFO: renamed from: o */
    public final vcx0 f175527o;

    /* JADX INFO: renamed from: p */
    public final sbx0 f175528p;

    /* JADX INFO: renamed from: q */
    public final x7x0 f175529q;

    /* JADX INFO: renamed from: r */
    public final tax0 f175530r;

    /* JADX INFO: renamed from: s */
    public final tax0 f175531s;

    /* JADX INFO: renamed from: t */
    public boolean f175532t;

    /* JADX INFO: renamed from: u */
    public x7x0 f175533u;

    /* JADX INFO: renamed from: v */
    public x7x0 f175534v;

    /* JADX INFO: renamed from: w */
    public tax0 f175535w;

    /* JADX INFO: renamed from: x */
    public final vcx0 f175536x;

    /* JADX INFO: renamed from: y */
    public final vcx0 f175537y;

    /* JADX INFO: renamed from: z */
    public final tax0 f175538z;

    public u9x0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f175516d = new Object();
        this.f175525m = new tax0(this, "session_timeout", 1800000L);
        this.f175526n = new x7x0(this, "start_new_session", true);
        this.f175530r = new tax0(this, "last_pause_time", 0L);
        this.f175531s = new tax0(this, "session_id", 0L);
        this.f175527o = new vcx0(this, "non_personalized_ads", null);
        this.f175528p = new sbx0(this, "last_received_uri_timestamps_by_source", null);
        this.f175529q = new x7x0(this, "allow_remote_dynamite", false);
        this.f175519g = new tax0(this, "first_open_time", 0L);
        this.f175520h = new tax0(this, "app_install_time", 0L);
        this.f175521i = new vcx0(this, "app_instance_id", null);
        this.f175533u = new x7x0(this, "app_backgrounded", false);
        this.f175534v = new x7x0(this, "deep_link_retrieval_complete", false);
        this.f175535w = new tax0(this, "deep_link_retrieval_attempts", 0L);
        this.f175536x = new vcx0(this, "firebase_feature_rollouts", null);
        this.f175537y = new vcx0(this, "deferred_attribution_cache", null);
        this.f175538z = new tax0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f175514A = new sbx0(this, "default_event_parameters", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m192689A(boolean z) {
        mo15092h();
        zzj().m211416E().m123937b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final SharedPreferences m192690B() {
        mo15092h();
        m127632j();
        if (this.f175517e == null) {
            synchronized (this.f175516d) {
                try {
                    if (this.f175517e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().m211416E().m123937b("Default prefs file", str);
                        this.f175517e = zza().getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f175517e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m192691C(String str) {
        mo15092h();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final SharedPreferences m192692D() {
        mo15092h();
        m127632j();
        Preconditions.checkNotNull(this.f175515c);
        return this.f175515c;
    }

    /* JADX INFO: renamed from: E */
    public final SparseArray<Long> m192693E() {
        Bundle bundleM183361a = this.f175528p.m183361a();
        if (bundleM183361a == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleM183361a.getIntArray("uriSources");
        long[] longArray = bundleM183361a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().m211412A().m123936a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final C2453b m192694F() {
        mo15092h();
        return C2453b.m15070d(m192692D().getString("dma_consent_settings", null));
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final zzje m192695G() {
        mo15092h();
        return zzje.m15335f(m192692D().getString("consent_settings", "G1"), m192692D().getInt("consent_source", 100));
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final Boolean m192696H() {
        mo15092h();
        if (m192692D().contains("use_service")) {
            return Boolean.valueOf(m192692D().getBoolean("use_service", false));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final Boolean m192697I() {
        mo15092h();
        if (m192692D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(m192692D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final Boolean m192698J() {
        mo15092h();
        if (m192692D().contains("measurement_enabled")) {
            return Boolean.valueOf(m192692D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final String m192699K() {
        mo15092h();
        String string = m192692D().getString("previous_os_version", null);
        mo15086b().m127632j();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = m192692D().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final String m192700L() {
        mo15092h();
        return m192692D().getString("admob_app_id", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final String m192701M() {
        mo15092h();
        return m192692D().getString("gmp_app_id", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final void m192702N() {
        mo15092h();
        Boolean boolM192698J = m192698J();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolM192698J != null) {
            m192705q(boolM192698J);
        }
    }

    @Override // p149l.gqx0
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final void mo101487i() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f175515c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f175532t = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f175515c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f175518f = new sdx0(this, "health_monitor", Math.max(0L, q8s0.f153277d.m188827a(null).longValue()));
    }

    @Override // p149l.gqx0
    /* JADX INFO: renamed from: n */
    public final boolean mo101492n() {
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: o */
    public final Pair<String, Boolean> m192703o(String str) {
        mo15092h();
        if (!m192695G().m15347m(zzje.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (this.f175522j != null && jElapsedRealtime < this.f175524l) {
            return new Pair<>(this.f175522j, Boolean.valueOf(this.f175523k));
        }
        this.f175524l = jElapsedRealtime + mo15085a().m192657w(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.C2070a advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f175522j = "";
            String strM12233a = advertisingIdInfo.m12233a();
            if (strM12233a != null) {
                this.f175522j = strM12233a;
            }
            this.f175523k = advertisingIdInfo.m12234b();
        } catch (Exception e) {
            zzj().m211424z().m123937b("Unable to get advertising id", e);
            this.f175522j = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f175522j, Boolean.valueOf(this.f175523k));
    }

    /* JADX INFO: renamed from: p */
    public final void m192704p(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.f175528p.m183362b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f175528p.m183362b(bundle);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final void m192705q(Boolean bool) {
        mo15092h();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final void m192706r(boolean z) {
        mo15092h();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final boolean m192707s(int i) {
        return zzje.m15341l(i, m192692D().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m192708t(long j) {
        return j - this.f175525m.m187782a() > this.f175530r.m187782a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final boolean m192709u(C2453b c2453b) {
        mo15092h();
        if (!zzje.m15341l(c2453b.m15072a(), m192694F().m15072a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putString("dma_consent_settings", c2453b.m15077j());
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final boolean m192710v(zzje zzjeVar) {
        mo15092h();
        int iM15345b = zzjeVar.m15345b();
        if (!m192707s(iM15345b)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putString("consent_settings", zzjeVar.m15356x());
        editorEdit.putInt("consent_source", iM15345b);
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final boolean m192711w(C2460i c2460i) {
        mo15092h();
        String string = m192692D().getString("stored_tcf_param", "");
        String strM15236g = c2460i.m15236g();
        if (strM15236g.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putString("stored_tcf_param", strM15236g);
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final boolean m192712x() {
        SharedPreferences sharedPreferences = this.f175515c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m192713y(Boolean bool) {
        mo15092h();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m192714z(String str) {
        mo15092h();
        SharedPreferences.Editor editorEdit = m192692D().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }
}
