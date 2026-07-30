package p149l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import com.clevertap.android.sdk.profile.traversal.ProfileOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class csv {

    /* JADX INFO: renamed from: m */
    private static long f82383m;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f82385b;

    /* JADX INFO: renamed from: c */
    private final Context f82386c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1176c f82387d;

    /* JADX INFO: renamed from: e */
    private final ui2 f82388e;

    /* JADX INFO: renamed from: h */
    private final hyd f82391h;

    /* JADX INFO: renamed from: k */
    private final nta0 f82394k;

    /* JADX INFO: renamed from: l */
    private final q920 f82395l;

    /* JADX INFO: renamed from: a */
    private final JSONObject f82384a = new JSONObject();

    /* JADX INFO: renamed from: g */
    private final String f82390g = "local_events";

    /* JADX INFO: renamed from: i */
    private final Set<String> f82392i = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: j */
    private final Map<String, String> f82393j = new HashMap();

    /* JADX INFO: renamed from: f */
    private final ExecutorService f82389f = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: l.csv$a */
    public class RunnableC16235a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f82396a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f82397b;

        public RunnableC16235a(Context context, String str) {
            this.f82396a = context;
            this.f82397b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strMo5951d;
            tzb tzbVarMo94410c = csv.this.f82388e.mo94410c(this.f82396a);
            synchronized (csv.this.f82384a) {
                try {
                    try {
                        JSONObject jSONObjectM191181r = tzbVarMo94410c.m191181r(this.f82397b, csv.this.f82391h.m133539E());
                        if (jSONObjectM191181r == null) {
                            return;
                        }
                        Iterator<String> itKeys = jSONObjectM191181r.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                Object obj = jSONObjectM191181r.get(next);
                                if (obj instanceof JSONObject) {
                                    csv.this.f82384a.put(next, jSONObjectM191181r.getJSONObject(next));
                                } else if (obj instanceof JSONArray) {
                                    csv.this.f82384a.put(next, jSONObjectM191181r.getJSONArray(next));
                                } else {
                                    if ((obj instanceof String) && (strMo5951d = csv.this.f82387d.mo5951d((String) obj)) != null) {
                                        obj = strMo5951d;
                                    }
                                    csv.this.f82384a.put(next, obj);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        csv.this.m108583o().verbose(csv.this.m108582n(), "Local Data Store - Inflated local profile " + csv.this.f82384a);
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.csv$b */
    public class RunnableC16236b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f82399a;

        public RunnableC16236b(String str) {
            this.f82399a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (csv.this.f82384a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    Iterator<String> itKeys = csv.this.f82384a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, csv.this.f82384a.get(next));
                    }
                } catch (JSONException e) {
                    csv.this.m108583o().verbose(csv.this.m108582n(), "Failed to copy profile fields", e);
                }
                boolean z = EncryptionLevel.fromInt(csv.this.f82385b.getEncryptionLevel()) == EncryptionLevel.MEDIUM;
                boolean z2 = false;
                for (String str : Constants.piiDBKeys) {
                    try {
                        if (jSONObject.has(str)) {
                            Object objOpt = jSONObject.opt(str);
                            if ((objOpt instanceof String) && z) {
                                String strMo5950c = csv.this.f82387d.mo5950c((String) objOpt);
                                if (strMo5950c == null) {
                                    z2 = true;
                                } else {
                                    jSONObject.put(str, strMo5950c);
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        csv.this.m108583o().verbose(csv.this.m108582n(), "Failed to encrypt pii key: " + str, e2);
                    }
                }
                if (z2) {
                    csv.this.f82387d.mo5949b(false);
                }
                long jM191166Q = csv.this.f82388e.mo94410c(csv.this.f82386c).m191166Q(this.f82399a, csv.this.f82391h.m133539E(), jSONObject);
                csv.this.m108583o().verbose(csv.this.m108582n(), "Persist Local Profile complete with status " + jM191166Q + " for id " + this.f82399a);
            }
        }
    }

    /* JADX INFO: renamed from: l.csv$c */
    public class RunnableC16237c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f82401a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f82402b;

        public RunnableC16237c(String str, Runnable runnable) {
            this.f82401a = str;
            this.f82402b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            long unused = csv.f82383m = Thread.currentThread().getId();
            try {
                csv.this.m108583o().verbose(csv.this.m108582n(), "Local Data Store Executor service: Starting task - " + this.f82401a);
                this.f82402b.run();
            } catch (Throwable th) {
                csv.this.m108583o().verbose(csv.this.m108582n(), "Executor service: Failed to complete the scheduled task", th);
            }
        }
    }

    public csv(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InterfaceC1176c interfaceC1176c, hyd hydVar, ui2 ui2Var, nta0 nta0Var, q920 q920Var) {
        this.f82386c = context;
        this.f82385b = cleverTapInstanceConfig;
        this.f82387d = interfaceC1176c;
        this.f82391h = hydVar;
        this.f82388e = ui2Var;
        this.f82394k = nta0Var;
        this.f82395l = q920Var;
    }

    /* JADX INFO: renamed from: A */
    private void m108563A() {
        m108564C("LocalDataStore#persistLocalProfileAsync", new RunnableC16236b(this.f82385b.getAccountId()));
    }

    /* JADX INFO: renamed from: C */
    private void m108564C(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == f82383m) {
                runnable.run();
            } else {
                this.f82389f.submit(new RunnableC16237c(str, runnable));
            }
        } catch (Throwable th) {
            m108583o().verbose(m108582n(), "Failed to submit task to the executor service", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    private z4k0 m108565F(String str, String str2) {
        return this.f82388e.mo94410c(this.f82386c).m191169T().mo95047a(str, str2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    private int m108566G(String str, String str2) {
        return this.f82388e.mo94410c(this.f82386c).m191169T().mo95050d(str, str2);
    }

    /* JADX INFO: renamed from: I */
    private void m108567I() {
        synchronized (this.f82384a) {
            try {
                Iterator<String> itKeys = this.f82384a.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f82384a.remove((String) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m108598u(this.f82386c);
    }

    /* JADX INFO: renamed from: K */
    private String m108568K(String str) {
        return str + ":" + this.f82385b.getAccountId();
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    private boolean m108569L(String str, String str2) {
        boolean zMo95052f = this.f82388e.mo94410c(this.f82386c).m191169T().mo95052f(str, str2);
        m108583o().verbose("updatedEventByDeviceID = " + zMo95052f);
        return zMo95052f;
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: l */
    private d3f m108580l(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\|");
        return new d3f(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    private boolean m108581m(String str, String str2) {
        boolean zMo95051e = this.f82388e.mo94410c(this.f82386c).m191169T().mo95051e(str, str2);
        m108583o().verbose("eventExists = " + zMo95051e);
        return zMo95051e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public String m108582n() {
        return this.f82385b.getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public Logger m108583o() {
        return this.f82385b.getLogger();
    }

    /* JADX INFO: renamed from: q */
    private int m108584q(String str, int i) {
        boolean zIsDefaultInstance = this.f82385b.isDefaultInstance();
        Context context = this.f82386c;
        if (!zIsDefaultInstance) {
            return mxf0.m156885c(context, m108568K(str), i);
        }
        int iM156885c = mxf0.m156885c(context, m108568K(str), -1000);
        return iM156885c != -1000 ? iM156885c : mxf0.m156885c(this.f82386c, str, i);
    }

    /* JADX INFO: renamed from: r */
    private int m108585r(int i) {
        return m108584q("local_cache_expires_in", i);
    }

    /* JADX INFO: renamed from: s */
    private String m108586s(final String str) {
        return (String) MapsKt.getOrPut((Map<String, V>) this.f82393j, str, new Function0() { // from class: l.bsv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.m5918o(str);
            }
        });
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: t */
    private String m108587t(String str, String str2, String str3) {
        boolean zIsDefaultInstance = this.f82385b.isDefaultInstance();
        Context context = this.f82386c;
        if (!zIsDefaultInstance) {
            return mxf0.m156890j(context, str3, m108568K(str), str2);
        }
        String strM156890j = mxf0.m156890j(context, str3, m108568K(str), str2);
        return strM156890j != null ? strM156890j : mxf0.m156890j(this.f82386c, str3, str, str2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    private long m108588v(String str, String str2, String str3) {
        long jMo95049c = this.f82388e.mo94410c(this.f82386c).m191169T().mo95049c(str, str2, str3);
        m108583o().verbose("inserted rowId = " + jMo95049c);
        return jMo95049c;
    }

    /* JADX INFO: renamed from: x */
    private boolean m108589x() {
        return this.f82385b.isPersonalizationEnabled();
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public boolean m108590B(String str) {
        if (str == null) {
            return false;
        }
        Logger logger = this.f82385b.getLogger();
        String accountId = this.f82385b.getAccountId();
        try {
            logger.verbose(accountId, "UserEventLog: Persisting EventLog for event ".concat(str));
            if (m108600y(str)) {
                logger.verbose(accountId, "UserEventLog: Updating EventLog for event ".concat(str));
                return m108595M(str);
            }
            logger.verbose(accountId, "UserEventLog: Inserting EventLog for event ".concat(str));
            return m108599w(str);
        } catch (Throwable th) {
            logger.verbose(accountId, "UserEventLog: Failed to insert user event log: for event".concat(str), th);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public Map<String, hi90> m108591D(String str, Object obj, ProfileOperation profileOperation) {
        try {
            return m108592E(this.f82395l.m173587a(str, obj), profileOperation);
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public Map<String, hi90> m108592E(JSONObject jSONObject, ProfileOperation profileOperation) {
        Map<String, hi90> mapM161368a;
        synchronized (this.f82384a) {
            try {
                nta0.C18772b c18772bM161366d = this.f82394k.m161366d(this.f82384a, jSONObject, profileOperation);
                if (profileOperation != ProfileOperation.GET) {
                    m108563A();
                }
                mapM161368a = c18772bM161366d.m161368a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapM161368a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public z4k0 m108593H(String str) {
        return m108565F(this.f82391h.m133539E(), m108586s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public void m108594J(JSONObject jSONObject) {
        try {
            if (!this.f82385b.isPersonalizationEnabled()) {
                jSONObject.put("dsync", false);
                return;
            }
            String string = jSONObject.getString("type");
            if (NotificationCompat.CATEGORY_EVENT.equals(string) && Constants.APP_LAUNCHED_EVENT.equals(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                m108583o().verbose(m108582n(), "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put("dsync", true);
                return;
            }
            if ("profile".equals(string)) {
                jSONObject.put("dsync", true);
                m108583o().verbose(m108582n(), "Local cache needs to be updated (profile event)");
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (m108584q("local_cache_last_update", iCurrentTimeMillis) + m108585r(1200) < iCurrentTimeMillis) {
                jSONObject.put("dsync", true);
                m108583o().verbose(m108582n(), "Local cache needs to be updated");
            } else {
                jSONObject.put("dsync", false);
                m108583o().verbose(m108582n(), "Local cache doesn't need to be updated");
            }
        } catch (Throwable th) {
            m108583o().verbose(m108582n(), "Failed to sync with upstream", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public boolean m108595M(String str) {
        return m108569L(this.f82391h.m133539E(), m108586s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public void m108596k() {
        this.f82392i.clear();
        m108567I();
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: p */
    public d3f m108597p(String str) {
        String str2;
        try {
            if (!m108589x()) {
                return null;
            }
            if (this.f82385b.isDefaultInstance()) {
                str2 = "local_events";
            } else {
                str2 = "local_events:" + this.f82385b.getAccountId();
            }
            return m108580l(str, m108587t(str, null, str2));
        } catch (Throwable th) {
            m108583o().verbose(m108582n(), "Failed to retrieve local event detail", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m108598u(Context context) {
        m108564C("LocalDataStore#inflateLocalProfileAsync", new RunnableC16235a(context, this.f82385b.getAccountId()));
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public boolean m108599w(String str) {
        return m108588v(this.f82391h.m133539E(), str, m108586s(str)) >= 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public boolean m108600y(String str) {
        return m108581m(this.f82391h.m133539E(), m108586s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public boolean m108601z(String str) {
        String strM108586s = m108586s(str);
        if (this.f82392i.contains(strM108586s)) {
            return false;
        }
        int iM108566G = m108566G(this.f82391h.m133539E(), strM108586s);
        if (iM108566G > 1) {
            this.f82392i.add(strM108586s);
        }
        return iM108566G == 1;
    }
}
