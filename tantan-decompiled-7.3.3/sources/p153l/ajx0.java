package p153l;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2476b;
import com.google.android.gms.measurement.internal.C2483i;
import com.google.android.gms.measurement.internal.zzje;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ajx0 extends mzx0 {

    /* JADX INFO: renamed from: B */
    public static final Pair<String, Long> f71894B = new Pair<>("", 0L);

    /* JADX INFO: renamed from: A */
    public final ykx0 f71895A;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f71896c;

    /* JADX INFO: renamed from: d */
    public Object f71897d;

    /* JADX INFO: renamed from: e */
    public SharedPreferences f71898e;

    /* JADX INFO: renamed from: f */
    public ymx0 f71899f;

    /* JADX INFO: renamed from: g */
    public final zjx0 f71900g;

    /* JADX INFO: renamed from: h */
    public final zjx0 f71901h;

    /* JADX INFO: renamed from: i */
    public final bmx0 f71902i;

    /* JADX INFO: renamed from: j */
    public String f71903j;

    /* JADX INFO: renamed from: k */
    public boolean f71904k;

    /* JADX INFO: renamed from: l */
    public long f71905l;

    /* JADX INFO: renamed from: m */
    public final zjx0 f71906m;

    /* JADX INFO: renamed from: n */
    public final dhx0 f71907n;

    /* JADX INFO: renamed from: o */
    public final bmx0 f71908o;

    /* JADX INFO: renamed from: p */
    public final ykx0 f71909p;

    /* JADX INFO: renamed from: q */
    public final dhx0 f71910q;

    /* JADX INFO: renamed from: r */
    public final zjx0 f71911r;

    /* JADX INFO: renamed from: s */
    public final zjx0 f71912s;

    /* JADX INFO: renamed from: t */
    public boolean f71913t;

    /* JADX INFO: renamed from: u */
    public dhx0 f71914u;

    /* JADX INFO: renamed from: v */
    public dhx0 f71915v;

    /* JADX INFO: renamed from: w */
    public zjx0 f71916w;

    /* JADX INFO: renamed from: x */
    public final bmx0 f71917x;

    /* JADX INFO: renamed from: y */
    public final bmx0 f71918y;

    /* JADX INFO: renamed from: z */
    public final zjx0 f71919z;

    public ajx0(atx0 atx0Var) {
        super(atx0Var);
        this.f71897d = new Object();
        this.f71906m = new zjx0(this, "session_timeout", 1800000L);
        this.f71907n = new dhx0(this, "start_new_session", true);
        this.f71911r = new zjx0(this, "last_pause_time", 0L);
        this.f71912s = new zjx0(this, "session_id", 0L);
        this.f71908o = new bmx0(this, "non_personalized_ads", null);
        this.f71909p = new ykx0(this, "last_received_uri_timestamps_by_source", null);
        this.f71910q = new dhx0(this, "allow_remote_dynamite", false);
        this.f71900g = new zjx0(this, "first_open_time", 0L);
        this.f71901h = new zjx0(this, "app_install_time", 0L);
        this.f71902i = new bmx0(this, "app_instance_id", null);
        this.f71914u = new dhx0(this, "app_backgrounded", false);
        this.f71915v = new dhx0(this, "deep_link_retrieval_complete", false);
        this.f71916w = new zjx0(this, "deep_link_retrieval_attempts", 0L);
        this.f71917x = new bmx0(this, "firebase_feature_rollouts", null);
        this.f71918y = new bmx0(this, "deferred_attribution_cache", null);
        this.f71919z = new zjx0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f71895A = new ykx0(this, "default_event_parameters", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m98504A(boolean z) {
        mo15146h();
        zzj().m114562E().m153301b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final SharedPreferences m98505B() {
        mo15146h();
        m160930j();
        if (this.f71898e == null) {
            synchronized (this.f71897d) {
                try {
                    if (this.f71898e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().m114562E().m153301b("Default prefs file", str);
                        this.f71898e = zza().getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f71898e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final void m98506C(String str) {
        mo15146h();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final SharedPreferences m98507D() {
        mo15146h();
        m160930j();
        Preconditions.checkNotNull(this.f71896c);
        return this.f71896c;
    }

    /* JADX INFO: renamed from: E */
    public final SparseArray<Long> m98508E() {
        Bundle bundleM216543a = this.f71909p.m216543a();
        if (bundleM216543a == null) {
            return new SparseArray<>();
        }
        int[] intArray = bundleM216543a.getIntArray("uriSources");
        long[] longArray = bundleM216543a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().m114558A().m153300a("Trigger URI source and timestamp array lengths do not match");
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
    public final C2476b m98509F() {
        mo15146h();
        return C2476b.m15124d(m98507D().getString("dma_consent_settings", null));
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final zzje m98510G() {
        mo15146h();
        return zzje.m15389f(m98507D().getString("consent_settings", "G1"), m98507D().getInt("consent_source", 100));
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final Boolean m98511H() {
        mo15146h();
        if (m98507D().contains("use_service")) {
            return Boolean.valueOf(m98507D().getBoolean("use_service", false));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final Boolean m98512I() {
        mo15146h();
        if (m98507D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(m98507D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final Boolean m98513J() {
        mo15146h();
        if (m98507D().contains("measurement_enabled")) {
            return Boolean.valueOf(m98507D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final String m98514K() {
        mo15146h();
        String string = m98507D().getString("previous_os_version", null);
        mo15140b().m160930j();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = m98507D().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final String m98515L() {
        mo15146h();
        return m98507D().getString("admob_app_id", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final String m98516M() {
        mo15146h();
        return m98507D().getString("gmp_app_id", null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final void m98517N() {
        mo15146h();
        Boolean boolM98513J = m98513J();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolM98513J != null) {
            m98522q(boolM98513J);
        }
    }

    @Override // p153l.mzx0
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final void mo98518i() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f71896c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f71913t = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f71896c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f71899f = new ymx0(this, "health_monitor", Math.max(0L, whs0.f189253d.m220931a(null).longValue()));
    }

    @Override // p153l.mzx0
    /* JADX INFO: renamed from: n */
    public final boolean mo98519n() {
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: o */
    public final Pair<String, Boolean> m98520o(String str) {
        mo15146h();
        if (!m98510G().m15401m(zzje.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (this.f71903j != null && jElapsedRealtime < this.f71905l) {
            return new Pair<>(this.f71903j, Boolean.valueOf(this.f71904k));
        }
        this.f71905l = jElapsedRealtime + mo15139a().m98449w(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.C2093a advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f71903j = "";
            String strM12287a = advertisingIdInfo.m12287a();
            if (strM12287a != null) {
                this.f71903j = strM12287a;
            }
            this.f71904k = advertisingIdInfo.m12288b();
        } catch (Exception e) {
            zzj().m114570z().m153301b("Unable to get advertising id", e);
            this.f71903j = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f71903j, Boolean.valueOf(this.f71904k));
    }

    /* JADX INFO: renamed from: p */
    public final void m98521p(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.f71909p.m216544b(null);
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
        this.f71909p.m216544b(bundle);
    }

    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final void m98522q(Boolean bool) {
        mo15146h();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final void m98523r(boolean z) {
        mo15146h();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final boolean m98524s(int i) {
        return zzje.m15395l(i, m98507D().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: t */
    public final boolean m98525t(long j) {
        return j - this.f71906m.m219990a() > this.f71911r.m219990a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final boolean m98526u(C2476b c2476b) {
        mo15146h();
        if (!zzje.m15395l(c2476b.m15126a(), m98509F().m15126a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putString("dma_consent_settings", c2476b.m15131j());
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final boolean m98527v(zzje zzjeVar) {
        mo15146h();
        int iM15399b = zzjeVar.m15399b();
        if (!m98524s(iM15399b)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putString("consent_settings", zzjeVar.m15410x());
        editorEdit.putInt("consent_source", iM15399b);
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final boolean m98528w(C2483i c2483i) {
        mo15146h();
        String string = m98507D().getString("stored_tcf_param", "");
        String strM15290g = c2483i.m15290g();
        if (strM15290g.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putString("stored_tcf_param", strM15290g);
        editorEdit.apply();
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final boolean m98529x() {
        SharedPreferences sharedPreferences = this.f71896c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m98530y(Boolean bool) {
        mo15146h();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final void m98531z(String str) {
        mo15146h();
        SharedPreferences.Editor editorEdit = m98507D().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }
}
