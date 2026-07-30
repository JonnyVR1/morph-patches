package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class vqm {

    /* JADX INFO: renamed from: a */
    private final SimpleDateFormat f185365a = new SimpleDateFormat("ddMMyyyy", Locale.US);

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f185366b;

    /* JADX INFO: renamed from: c */
    private final Context f185367c;

    /* JADX INFO: renamed from: d */
    private String f185368d;

    /* JADX INFO: renamed from: e */
    private final wpm f185369e;

    /* JADX INFO: renamed from: f */
    private final h6g0 f185370f;

    /* JADX INFO: renamed from: g */
    private final su3 f185371g;

    /* JADX INFO: renamed from: h */
    private final oa5 f185372h;

    public vqm(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, final String str, h6g0 h6g0Var, wpm wpmVar, su3 su3Var, oa5 oa5Var) {
        this.f185366b = cleverTapInstanceConfig;
        this.f185367c = context;
        this.f185368d = str;
        this.f185370f = h6g0Var;
        this.f185369e = wpmVar;
        this.f185371g = su3Var;
        this.f185372h = oa5Var;
        su3Var.m187990d().m7000g("initInAppFCManager", new Callable() { // from class: l.uqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vqm.m202387c(this.f180489a, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m202385a(vqm vqmVar, String str, Context context) {
        vqmVar.f185369e.m207476k(str);
        vqmVar.m202397s(str);
        v5g0.m199860q(context, vqmVar.m202400w(vqmVar.m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, vqmVar.f185368d)), vqmVar.m202391l(vqmVar.m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, vqmVar.f185368d), 0) + 1);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m202387c(vqm vqmVar, String str) {
        vqmVar.m202398t(str);
        return null;
    }

    /* JADX INFO: renamed from: g */
    private String m202388g() {
        return this.f185366b.getAccountId();
    }

    /* JADX INFO: renamed from: h */
    private Logger m202389h() {
        return this.f185366b.getLogger();
    }

    /* JADX INFO: renamed from: i */
    private int[] m202390i(String str) {
        String string = v5g0.m199854h(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, this.f185368d))).getString(str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] strArrSplit = string.split(Constants.SEPARATOR_COMMA);
            return strArrSplit.length != 2 ? new int[]{0, 0} : new int[]{Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    /* JADX INFO: renamed from: l */
    private int m202391l(String str, int i) {
        boolean zIsDefaultInstance = this.f185366b.isDefaultInstance();
        Context context = this.f185367c;
        if (!zIsDefaultInstance) {
            return v5g0.m199851c(context, m202400w(str), i);
        }
        int iM199851c = v5g0.m199851c(context, m202400w(str), -1000);
        return iM199851c != -1000 ? iM199851c : v5g0.m199851c(this.f185367c, str, i);
    }

    /* JADX INFO: renamed from: m */
    private String m202392m(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: o */
    private String m202393o(String str, String str2) {
        boolean zIsDefaultInstance = this.f185366b.isDefaultInstance();
        Context context = this.f185367c;
        if (!zIsDefaultInstance) {
            return v5g0.m199855i(context, m202400w(str), str2);
        }
        String strM199855i = v5g0.m199855i(context, m202400w(str), str2);
        return strM199855i != null ? strM199855i : v5g0.m199855i(this.f185367c, str, str2);
    }

    /* JADX INFO: renamed from: p */
    private boolean m202394p(CTInAppNotification cTInAppNotification) {
        String strM202404j = m202404j(cTInAppNotification);
        if (strM202404j == null) {
            return false;
        }
        if (m202391l(m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, this.f185368d), 0) >= m202391l(m202392m(Constants.KEY_MAX_PER_DAY, this.f185368d), 1)) {
            return true;
        }
        try {
            int totalDailyCount = cTInAppNotification.getTotalDailyCount();
            return totalDailyCount != -1 && m202390i(strM202404j)[0] >= totalDailyCount;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m202395q(CTInAppNotification cTInAppNotification) {
        String strM202404j = m202404j(cTInAppNotification);
        if (strM202404j == null || cTInAppNotification.getTotalLifetimeCount() == -1) {
            return false;
        }
        try {
            return m202390i(strM202404j)[1] >= cTInAppNotification.getTotalLifetimeCount();
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m202396r(CTInAppNotification cTInAppNotification) {
        String strM202404j = m202404j(cTInAppNotification);
        if (strM202404j == null) {
            return false;
        }
        try {
            if (this.f185369e.m207473h(strM202404j) >= (cTInAppNotification.getMaxPerSession() >= 0 ? cTInAppNotification.getMaxPerSession() : 1000)) {
                return true;
            }
            return this.f185369e.getSessionImpressionsTotal() >= m202391l(m202392m(Constants.INAPP_MAX_PER_SESSION_KEY, this.f185368d), 1);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m202397s(String str) {
        int[] iArrM202390i = m202390i(str);
        iArrM202390i[0] = iArrM202390i[0] + 1;
        iArrM202390i[1] = iArrM202390i[1] + 1;
        SharedPreferences.Editor editorEdit = v5g0.m199854h(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, this.f185368d))).edit();
        editorEdit.putString(str, iArrM202390i[0] + Constants.SEPARATOR_COMMA + iArrM202390i[1]);
        v5g0.m199858l(editorEdit);
    }

    /* JADX INFO: renamed from: t */
    private void m202398t(String str) {
        m202389h().verbose(this.f185366b.getAccountId() + ":async_deviceID", "InAppFCManager init() called");
        try {
            m202399u(str);
            String str2 = this.f185365a.format(this.f185372h.mo166826b());
            if (str2.equals(m202393o(m202392m("ict_date", str), "20140428"))) {
                return;
            }
            v5g0.m199862v(this.f185367c, m202400w(m202392m("ict_date", str)), str2);
            v5g0.m199860q(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, str)), 0);
            SharedPreferences sharedPreferencesM199854h = v5g0.m199854h(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, str)));
            SharedPreferences.Editor editorEdit = sharedPreferencesM199854h.edit();
            Map<String, ?> all = sharedPreferencesM199854h.getAll();
            for (String str3 : all.keySet()) {
                Object obj = all.get(str3);
                if (obj instanceof String) {
                    String[] strArrSplit = ((String) obj).split(Constants.SEPARATOR_COMMA);
                    if (strArrSplit.length != 2) {
                        editorEdit.remove(str3);
                    } else {
                        try {
                            editorEdit.putString(str3, "0," + strArrSplit[1]);
                        } catch (Throwable th) {
                            m202389h().verbose(m202388g(), "Failed to reset todayCount for inapp " + str3, th);
                        }
                    }
                } else {
                    editorEdit.remove(str3);
                }
            }
            v5g0.m199858l(editorEdit);
        } catch (Exception e) {
            m202389h().verbose(m202388g(), "Failed to init inapp manager " + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    private void m202399u(String str) {
        SharedPreferences sharedPreferencesM199854h = v5g0.m199854h(this.f185367c, Constants.KEY_COUNTS_PER_INAPP);
        SharedPreferences sharedPreferencesM199854h2 = v5g0.m199854h(this.f185367c, m202392m(Constants.KEY_COUNTS_PER_INAPP, str));
        SharedPreferences sharedPreferencesM199854h3 = v5g0.m199854h(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, str)));
        Function1 function1 = new Function1() { // from class: l.tqm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((String) obj).split(Constants.SEPARATOR_COMMA).length == 2);
            }
        };
        if (kx3.m151793n(sharedPreferencesM199854h2)) {
            Logger.m5919d("migrating shared preference countsPerInApp from V2 to V3...");
            new j4f0(sharedPreferencesM199854h2, sharedPreferencesM199854h3, String.class, function1).m143413a();
            Logger.m5919d("Finished migrating shared preference countsPerInApp from V2 to V3.");
        } else if (kx3.m151793n(sharedPreferencesM199854h)) {
            Logger.m5919d("migrating shared preference countsPerInApp from V1 to V3...");
            new j4f0(sharedPreferencesM199854h, sharedPreferencesM199854h3, String.class, function1).m143413a();
            Logger.m5919d("Finished migrating shared preference countsPerInApp from V1 to V3.");
        }
        ksm inAppStore = this.f185370f.getInAppStore();
        ncr legacyInAppStore = this.f185370f.getLegacyInAppStore();
        if (inAppStore != null && legacyInAppStore != null) {
            JSONArray jSONArrayM162591b = legacyInAppStore.m162591b();
            if (jSONArrayM162591b.length() > 0) {
                Logger.m5919d("migrating in-apps from account id to device id based preference.");
                inAppStore.m151269t(Utils.m5956B(jSONArrayM162591b));
                legacyInAppStore.m162592c();
                Logger.m5919d("Finished migrating in-apps from account id to device id based preference.");
            }
        }
        if (m202393o(m202392m("ict_date", str), null) != null || m202393o("ict_date", null) == null) {
            return;
        }
        Logger.m5927v("Migrating InAppFC Prefs");
        v5g0.m199862v(this.f185367c, m202400w(m202392m("ict_date", str)), m202393o("ict_date", "20140428"));
        v5g0.m199860q(this.f185367c, m202400w(m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, str)), m202391l(m202400w(Constants.KEY_COUNTS_SHOWN_TODAY), 0));
    }

    /* JADX INFO: renamed from: w */
    private String m202400w(String str) {
        return str + ":" + m202388g();
    }

    /* JADX INFO: renamed from: d */
    public boolean m202401d(CTInAppNotification cTInAppNotification, Function2<JSONObject, String, Boolean> function2) {
        if (cTInAppNotification == null) {
            return false;
        }
        try {
            String strM202404j = m202404j(cTInAppNotification);
            if (strM202404j == null) {
                return true;
            }
            if (function2.invoke(cTInAppNotification.m6229s(), strM202404j).booleanValue()) {
                return false;
            }
            if (cTInAppNotification.getIsExcludeFromCaps()) {
                return true;
            }
            if (!m202396r(cTInAppNotification) && !m202395q(cTInAppNotification) && !m202394p(cTInAppNotification)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m202402e(String str) {
        this.f185369e.m207466a();
        this.f185368d = str;
        m202398t(str);
    }

    /* JADX INFO: renamed from: f */
    public void m202403f(final Context context, CTInAppNotification cTInAppNotification) {
        final String strM202404j = m202404j(cTInAppNotification);
        if (strM202404j == null) {
            return;
        }
        this.f185371g.m187987a().m7000g("recordInAppImpressionsAndCounts", new Callable() { // from class: l.sqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vqm.m202385a(this.f170183a, strM202404j, context);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public String m202404j(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification.getId() != null && !cTInAppNotification.getId().isEmpty()) {
            try {
                return cTInAppNotification.getId();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public JSONArray m202405k(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ?> entry : v5g0.m199854h(context, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, this.f185368d))).getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    String[] strArrSplit = ((String) entry.getValue()).split(Constants.SEPARATOR_COMMA);
                    if (strArrSplit.length == 2) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0, entry.getKey());
                        jSONArray2.put(1, Integer.parseInt(strArrSplit[0]));
                        jSONArray2.put(2, Integer.parseInt(strArrSplit[1]));
                        jSONArray.put(jSONArray2);
                    } else {
                        continue;
                    }
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            Logger.m5930v("Failed to get in apps count", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m202406n() {
        return m202391l(m202392m(Constants.KEY_COUNTS_SHOWN_TODAY, this.f185368d), 0);
    }

    /* JADX INFO: renamed from: v */
    public void m202407v(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.INAPP_NOTIFS_STALE_KEY)) {
                JSONArray jSONArray = jSONObject.getJSONArray(Constants.INAPP_NOTIFS_STALE_KEY);
                SharedPreferences.Editor editorEdit = v5g0.m199854h(context, m202400w(m202392m(Constants.KEY_COUNTS_PER_INAPP, this.f185368d))).edit();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof Integer) {
                        editorEdit.remove("" + obj);
                        Logger.m5919d("Purged stale in-app - " + obj);
                    } else if (obj instanceof String) {
                        editorEdit.remove((String) obj);
                        Logger.m5919d("Purged stale in-app - " + obj);
                    }
                }
                v5g0.m199858l(editorEdit);
            }
        } catch (Throwable th) {
            Logger.m5930v("Failed to purge out stale targets", th);
        }
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m202408x(Context context, int i, int i2) {
        v5g0.m199860q(context, m202400w(m202392m(Constants.KEY_MAX_PER_DAY, this.f185368d)), i);
        v5g0.m199860q(context, m202400w(m202392m(Constants.INAPP_MAX_PER_SESSION_KEY, this.f185368d)), i2);
    }
}
