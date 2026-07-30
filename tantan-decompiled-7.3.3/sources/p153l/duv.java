package p153l;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1199c;
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
public class duv {

    /* JADX INFO: renamed from: m */
    private static long f90862m;

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f90864b;

    /* JADX INFO: renamed from: c */
    private final Context f90865c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1199c f90866d;

    /* JADX INFO: renamed from: e */
    private final bj2 f90867e;

    /* JADX INFO: renamed from: h */
    private final uzd f90870h;

    /* JADX INFO: renamed from: k */
    private final r1b0 f90873k;

    /* JADX INFO: renamed from: l */
    private final yh20 f90874l;

    /* JADX INFO: renamed from: a */
    private final JSONObject f90863a = new JSONObject();

    /* JADX INFO: renamed from: g */
    private final String f90869g = "local_events";

    /* JADX INFO: renamed from: i */
    private final Set<String> f90871i = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: j */
    private final Map<String, String> f90872j = new HashMap();

    /* JADX INFO: renamed from: f */
    private final ExecutorService f90868f = Executors.newFixedThreadPool(1);

    /* JADX INFO: renamed from: l.duv$a */
    public class RunnableC16634a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f90875a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f90876b;

        public RunnableC16634a(Context context, String str) {
            this.f90875a = context;
            this.f90876b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strMo6005d;
            h1c h1cVarMo104583c = duv.this.f90867e.mo104583c(this.f90875a);
            synchronized (duv.this.f90863a) {
                try {
                    try {
                        JSONObject jSONObjectM133313r = h1cVarMo104583c.m133313r(this.f90876b, duv.this.f90870h.m198762E());
                        if (jSONObjectM133313r == null) {
                            return;
                        }
                        Iterator<String> itKeys = jSONObjectM133313r.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                Object obj = jSONObjectM133313r.get(next);
                                if (obj instanceof JSONObject) {
                                    duv.this.f90863a.put(next, jSONObjectM133313r.getJSONObject(next));
                                } else if (obj instanceof JSONArray) {
                                    duv.this.f90863a.put(next, jSONObjectM133313r.getJSONArray(next));
                                } else {
                                    if ((obj instanceof String) && (strMo6005d = duv.this.f90866d.mo6005d((String) obj)) != null) {
                                        obj = strMo6005d;
                                    }
                                    duv.this.f90863a.put(next, obj);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        duv.this.m118199o().verbose(duv.this.m118198n(), "Local Data Store - Inflated local profile " + duv.this.f90863a);
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.duv$b */
    public class RunnableC16635b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f90878a;

        public RunnableC16635b(String str) {
            this.f90878a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (duv.this.f90863a) {
                JSONObject jSONObject = new JSONObject();
                try {
                    Iterator<String> itKeys = duv.this.f90863a.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, duv.this.f90863a.get(next));
                    }
                } catch (JSONException e) {
                    duv.this.m118199o().verbose(duv.this.m118198n(), "Failed to copy profile fields", e);
                }
                boolean z = EncryptionLevel.fromInt(duv.this.f90864b.getEncryptionLevel()) == EncryptionLevel.MEDIUM;
                boolean z2 = false;
                for (String str : Constants.piiDBKeys) {
                    try {
                        if (jSONObject.has(str)) {
                            Object objOpt = jSONObject.opt(str);
                            if ((objOpt instanceof String) && z) {
                                String strMo6004c = duv.this.f90866d.mo6004c((String) objOpt);
                                if (strMo6004c == null) {
                                    z2 = true;
                                } else {
                                    jSONObject.put(str, strMo6004c);
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        duv.this.m118199o().verbose(duv.this.m118198n(), "Failed to encrypt pii key: " + str, e2);
                    }
                }
                if (z2) {
                    duv.this.f90866d.mo6003b(false);
                }
                long jM133298Q = duv.this.f90867e.mo104583c(duv.this.f90865c).m133298Q(this.f90878a, duv.this.f90870h.m198762E(), jSONObject);
                duv.this.m118199o().verbose(duv.this.m118198n(), "Persist Local Profile complete with status " + jM133298Q + " for id " + this.f90878a);
            }
        }
    }

    /* JADX INFO: renamed from: l.duv$c */
    public class RunnableC16636c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f90880a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Runnable f90881b;

        public RunnableC16636c(String str, Runnable runnable) {
            this.f90880a = str;
            this.f90881b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            long unused = duv.f90862m = Thread.currentThread().getId();
            try {
                duv.this.m118199o().verbose(duv.this.m118198n(), "Local Data Store Executor service: Starting task - " + this.f90880a);
                this.f90881b.run();
            } catch (Throwable th) {
                duv.this.m118199o().verbose(duv.this.m118198n(), "Executor service: Failed to complete the scheduled task", th);
            }
        }
    }

    public duv(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, InterfaceC1199c interfaceC1199c, uzd uzdVar, bj2 bj2Var, r1b0 r1b0Var, yh20 yh20Var) {
        this.f90865c = context;
        this.f90864b = cleverTapInstanceConfig;
        this.f90866d = interfaceC1199c;
        this.f90870h = uzdVar;
        this.f90867e = bj2Var;
        this.f90873k = r1b0Var;
        this.f90874l = yh20Var;
    }

    /* JADX INFO: renamed from: A */
    private void m118179A() {
        m118180C("LocalDataStore#persistLocalProfileAsync", new RunnableC16635b(this.f90864b.getAccountId()));
    }

    /* JADX INFO: renamed from: C */
    private void m118180C(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == f90862m) {
                runnable.run();
            } else {
                this.f90868f.submit(new RunnableC16636c(str, runnable));
            }
        } catch (Throwable th) {
            m118199o().verbose(m118198n(), "Failed to submit task to the executor service", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    private fek0 m118181F(String str, String str2) {
        return this.f90867e.mo104583c(this.f90865c).m133301T().mo130015a(str, str2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    private int m118182G(String str, String str2) {
        return this.f90867e.mo104583c(this.f90865c).m133301T().mo130018d(str, str2);
    }

    /* JADX INFO: renamed from: I */
    private void m118183I() {
        synchronized (this.f90863a) {
            try {
                Iterator<String> itKeys = this.f90863a.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.f90863a.remove((String) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m118214u(this.f90865c);
    }

    /* JADX INFO: renamed from: K */
    private String m118184K(String str) {
        return str + ":" + this.f90864b.getAccountId();
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    private boolean m118185L(String str, String str2) {
        boolean zMo130020f = this.f90867e.mo104583c(this.f90865c).m133301T().mo130020f(str, str2);
        m118199o().verbose("updatedEventByDeviceID = " + zMo130020f);
        return zMo130020f;
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: l */
    private i4f m118196l(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] strArrSplit = str2.split("\\|");
        return new i4f(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: m */
    private boolean m118197m(String str, String str2) {
        boolean zMo130019e = this.f90867e.mo104583c(this.f90865c).m133301T().mo130019e(str, str2);
        m118199o().verbose("eventExists = " + zMo130019e);
        return zMo130019e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public String m118198n() {
        return this.f90864b.getAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public Logger m118199o() {
        return this.f90864b.getLogger();
    }

    /* JADX INFO: renamed from: q */
    private int m118200q(String str, int i) {
        boolean zIsDefaultInstance = this.f90864b.isDefaultInstance();
        Context context = this.f90865c;
        if (!zIsDefaultInstance) {
            return v5g0.m199851c(context, m118184K(str), i);
        }
        int iM199851c = v5g0.m199851c(context, m118184K(str), -1000);
        return iM199851c != -1000 ? iM199851c : v5g0.m199851c(this.f90865c, str, i);
    }

    /* JADX INFO: renamed from: r */
    private int m118201r(int i) {
        return m118200q("local_cache_expires_in", i);
    }

    /* JADX INFO: renamed from: s */
    private String m118202s(final String str) {
        return (String) MapsKt.getOrPut((Map<String, V>) this.f90872j, str, new Function0() { // from class: l.cuv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Utils.m5972o(str);
            }
        });
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: t */
    private String m118203t(String str, String str2, String str3) {
        boolean zIsDefaultInstance = this.f90864b.isDefaultInstance();
        Context context = this.f90865c;
        if (!zIsDefaultInstance) {
            return v5g0.m199856j(context, str3, m118184K(str), str2);
        }
        String strM199856j = v5g0.m199856j(context, str3, m118184K(str), str2);
        return strM199856j != null ? strM199856j : v5g0.m199856j(this.f90865c, str3, str, str2);
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    private long m118204v(String str, String str2, String str3) {
        long jMo130017c = this.f90867e.mo104583c(this.f90865c).m133301T().mo130017c(str, str2, str3);
        m118199o().verbose("inserted rowId = " + jMo130017c);
        return jMo130017c;
    }

    /* JADX INFO: renamed from: x */
    private boolean m118205x() {
        return this.f90864b.isPersonalizationEnabled();
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public boolean m118206B(String str) {
        if (str == null) {
            return false;
        }
        Logger logger = this.f90864b.getLogger();
        String accountId = this.f90864b.getAccountId();
        try {
            logger.verbose(accountId, "UserEventLog: Persisting EventLog for event ".concat(str));
            if (m118216y(str)) {
                logger.verbose(accountId, "UserEventLog: Updating EventLog for event ".concat(str));
                return m118211M(str);
            }
            logger.verbose(accountId, "UserEventLog: Inserting EventLog for event ".concat(str));
            return m118215w(str);
        } catch (Throwable th) {
            logger.verbose(accountId, "UserEventLog: Failed to insert user event log: for event".concat(str), th);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public Map<String, lq90> m118207D(String str, Object obj, ProfileOperation profileOperation) {
        try {
            return m118208E(this.f90874l.m215941a(str, obj), profileOperation);
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public Map<String, lq90> m118208E(JSONObject jSONObject, ProfileOperation profileOperation) {
        Map<String, lq90> mapM179395a;
        synchronized (this.f90863a) {
            try {
                r1b0.C19726b c19726bM179393d = this.f90873k.m179393d(this.f90863a, jSONObject, profileOperation);
                if (profileOperation != ProfileOperation.GET) {
                    m118179A();
                }
                mapM179395a = c19726bM179393d.m179395a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return mapM179395a;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public fek0 m118209H(String str) {
        return m118181F(this.f90870h.m198762E(), m118202s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public void m118210J(JSONObject jSONObject) {
        try {
            if (!this.f90864b.isPersonalizationEnabled()) {
                jSONObject.put("dsync", false);
                return;
            }
            String string = jSONObject.getString("type");
            if (NotificationCompat.CATEGORY_EVENT.equals(string) && Constants.APP_LAUNCHED_EVENT.equals(jSONObject.getString(Constants.KEY_EVT_NAME))) {
                m118199o().verbose(m118198n(), "Local cache needs to be updated (triggered by App Launched)");
                jSONObject.put("dsync", true);
                return;
            }
            if ("profile".equals(string)) {
                jSONObject.put("dsync", true);
                m118199o().verbose(m118198n(), "Local cache needs to be updated (profile event)");
                return;
            }
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (m118200q("local_cache_last_update", iCurrentTimeMillis) + m118201r(1200) < iCurrentTimeMillis) {
                jSONObject.put("dsync", true);
                m118199o().verbose(m118198n(), "Local cache needs to be updated");
            } else {
                jSONObject.put("dsync", false);
                m118199o().verbose(m118198n(), "Local cache doesn't need to be updated");
            }
        } catch (Throwable th) {
            m118199o().verbose(m118198n(), "Failed to sync with upstream", th);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public boolean m118211M(String str) {
        return m118185L(this.f90870h.m198762E(), m118202s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: k */
    public void m118212k() {
        this.f90871i.clear();
        m118183I();
    }

    @Deprecated(since = "7.1.0")
    /* JADX INFO: renamed from: p */
    public i4f m118213p(String str) {
        String str2;
        try {
            if (!m118205x()) {
                return null;
            }
            if (this.f90864b.isDefaultInstance()) {
                str2 = "local_events";
            } else {
                str2 = "local_events:" + this.f90864b.getAccountId();
            }
            return m118196l(str, m118203t(str, null, str2));
        } catch (Throwable th) {
            m118199o().verbose(m118198n(), "Failed to retrieve local event detail", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m118214u(Context context) {
        m118180C("LocalDataStore#inflateLocalProfileAsync", new RunnableC16634a(context, this.f90864b.getAccountId()));
    }

    @WorkerThread
    /* JADX INFO: renamed from: w */
    public boolean m118215w(String str) {
        return m118204v(this.f90870h.m198762E(), str, m118202s(str)) >= 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public boolean m118216y(String str) {
        return m118197m(this.f90870h.m198762E(), m118202s(str));
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public boolean m118217z(String str) {
        String strM118202s = m118202s(str);
        if (this.f90871i.contains(strM118202s)) {
            return false;
        }
        int iM118182G = m118182G(this.f90870h.m198762E(), strM118202s);
        if (iM118182G > 1) {
            this.f90871i.add(strM118202s);
        }
        return iM118182G == 1;
    }
}
