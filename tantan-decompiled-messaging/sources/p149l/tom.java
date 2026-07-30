package p149l;

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
public class tom {

    /* JADX INFO: renamed from: a */
    private final SimpleDateFormat f171383a = new SimpleDateFormat("ddMMyyyy", Locale.US);

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f171384b;

    /* JADX INFO: renamed from: c */
    private final Context f171385c;

    /* JADX INFO: renamed from: d */
    private String f171386d;

    /* JADX INFO: renamed from: e */
    private final unm f171387e;

    /* JADX INFO: renamed from: f */
    private final zxf0 f171388f;

    /* JADX INFO: renamed from: g */
    private final tt3 f171389g;

    /* JADX INFO: renamed from: h */
    private final n95 f171390h;

    public tom(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, final String str, zxf0 zxf0Var, unm unmVar, tt3 tt3Var, n95 n95Var) {
        this.f171384b = cleverTapInstanceConfig;
        this.f171385c = context;
        this.f171386d = str;
        this.f171388f = zxf0Var;
        this.f171387e = unmVar;
        this.f171389g = tt3Var;
        this.f171390h = n95Var;
        tt3Var.m190592d().m6946g("initInAppFCManager", new Callable() { // from class: l.som
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tom.m189895c(this.f165704a, str);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Void m189893a(tom tomVar, String str, Context context) {
        tomVar.f171387e.m194467k(str);
        tomVar.m189905s(str);
        mxf0.m156894q(context, tomVar.m189908w(tomVar.m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, tomVar.f171386d)), tomVar.m189899l(tomVar.m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, tomVar.f171386d), 0) + 1);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m189895c(tom tomVar, String str) {
        tomVar.m189906t(str);
        return null;
    }

    /* JADX INFO: renamed from: g */
    private String m189896g() {
        return this.f171384b.getAccountId();
    }

    /* JADX INFO: renamed from: h */
    private Logger m189897h() {
        return this.f171384b.getLogger();
    }

    /* JADX INFO: renamed from: i */
    private int[] m189898i(String str) {
        String string = mxf0.m156888h(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, this.f171386d))).getString(str, null);
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
    private int m189899l(String str, int i) {
        boolean zIsDefaultInstance = this.f171384b.isDefaultInstance();
        Context context = this.f171385c;
        if (!zIsDefaultInstance) {
            return mxf0.m156885c(context, m189908w(str), i);
        }
        int iM156885c = mxf0.m156885c(context, m189908w(str), -1000);
        return iM156885c != -1000 ? iM156885c : mxf0.m156885c(this.f171385c, str, i);
    }

    /* JADX INFO: renamed from: m */
    private String m189900m(String str, String str2) {
        return str + ":" + str2;
    }

    /* JADX INFO: renamed from: o */
    private String m189901o(String str, String str2) {
        boolean zIsDefaultInstance = this.f171384b.isDefaultInstance();
        Context context = this.f171385c;
        if (!zIsDefaultInstance) {
            return mxf0.m156889i(context, m189908w(str), str2);
        }
        String strM156889i = mxf0.m156889i(context, m189908w(str), str2);
        return strM156889i != null ? strM156889i : mxf0.m156889i(this.f171385c, str, str2);
    }

    /* JADX INFO: renamed from: p */
    private boolean m189902p(CTInAppNotification cTInAppNotification) {
        String strM189912j = m189912j(cTInAppNotification);
        if (strM189912j == null) {
            return false;
        }
        if (m189899l(m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, this.f171386d), 0) >= m189899l(m189900m(Constants.KEY_MAX_PER_DAY, this.f171386d), 1)) {
            return true;
        }
        try {
            int totalDailyCount = cTInAppNotification.getTotalDailyCount();
            return totalDailyCount != -1 && m189898i(strM189912j)[0] >= totalDailyCount;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m189903q(CTInAppNotification cTInAppNotification) {
        String strM189912j = m189912j(cTInAppNotification);
        if (strM189912j == null || cTInAppNotification.getTotalLifetimeCount() == -1) {
            return false;
        }
        try {
            return m189898i(strM189912j)[1] >= cTInAppNotification.getTotalLifetimeCount();
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: r */
    private boolean m189904r(CTInAppNotification cTInAppNotification) {
        String strM189912j = m189912j(cTInAppNotification);
        if (strM189912j == null) {
            return false;
        }
        try {
            if (this.f171387e.m194464h(strM189912j) >= (cTInAppNotification.getMaxPerSession() >= 0 ? cTInAppNotification.getMaxPerSession() : 1000)) {
                return true;
            }
            return this.f171387e.getSessionImpressionsTotal() >= m189899l(m189900m(Constants.INAPP_MAX_PER_SESSION_KEY, this.f171386d), 1);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: s */
    private void m189905s(String str) {
        int[] iArrM189898i = m189898i(str);
        iArrM189898i[0] = iArrM189898i[0] + 1;
        iArrM189898i[1] = iArrM189898i[1] + 1;
        SharedPreferences.Editor editorEdit = mxf0.m156888h(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, this.f171386d))).edit();
        editorEdit.putString(str, iArrM189898i[0] + Constants.SEPARATOR_COMMA + iArrM189898i[1]);
        mxf0.m156892l(editorEdit);
    }

    /* JADX INFO: renamed from: t */
    private void m189906t(String str) {
        m189897h().verbose(this.f171384b.getAccountId() + ":async_deviceID", "InAppFCManager init() called");
        try {
            m189907u(str);
            String str2 = this.f171383a.format(this.f171390h.mo158532b());
            if (str2.equals(m189901o(m189900m("ict_date", str), "20140428"))) {
                return;
            }
            mxf0.m156896v(this.f171385c, m189908w(m189900m("ict_date", str)), str2);
            mxf0.m156894q(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, str)), 0);
            SharedPreferences sharedPreferencesM156888h = mxf0.m156888h(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, str)));
            SharedPreferences.Editor editorEdit = sharedPreferencesM156888h.edit();
            Map<String, ?> all = sharedPreferencesM156888h.getAll();
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
                            m189897h().verbose(m189896g(), "Failed to reset todayCount for inapp " + str3, th);
                        }
                    }
                } else {
                    editorEdit.remove(str3);
                }
            }
            mxf0.m156892l(editorEdit);
        } catch (Exception e) {
            m189897h().verbose(m189896g(), "Failed to init inapp manager " + e.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    private void m189907u(String str) {
        SharedPreferences sharedPreferencesM156888h = mxf0.m156888h(this.f171385c, Constants.KEY_COUNTS_PER_INAPP);
        SharedPreferences sharedPreferencesM156888h2 = mxf0.m156888h(this.f171385c, m189900m(Constants.KEY_COUNTS_PER_INAPP, str));
        SharedPreferences sharedPreferencesM156888h3 = mxf0.m156888h(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, str)));
        Function1 function1 = new Function1() { // from class: l.rom
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((String) obj).split(Constants.SEPARATOR_COMMA).length == 2);
            }
        };
        if (lw3.m151944n(sharedPreferencesM156888h2)) {
            Logger.m5865d("migrating shared preference countsPerInApp from V2 to V3...");
            new cwe0(sharedPreferencesM156888h2, sharedPreferencesM156888h3, String.class, function1).m109024a();
            Logger.m5865d("Finished migrating shared preference countsPerInApp from V2 to V3.");
        } else if (lw3.m151944n(sharedPreferencesM156888h)) {
            Logger.m5865d("migrating shared preference countsPerInApp from V1 to V3...");
            new cwe0(sharedPreferencesM156888h, sharedPreferencesM156888h3, String.class, function1).m109024a();
            Logger.m5865d("Finished migrating shared preference countsPerInApp from V1 to V3.");
        }
        iqm inAppStore = this.f171388f.getInAppStore();
        lar legacyInAppStore = this.f171388f.getLegacyInAppStore();
        if (inAppStore != null && legacyInAppStore != null) {
            JSONArray jSONArrayM149173b = legacyInAppStore.m149173b();
            if (jSONArrayM149173b.length() > 0) {
                Logger.m5865d("migrating in-apps from account id to device id based preference.");
                inAppStore.m137779t(Utils.m5902B(jSONArrayM149173b));
                legacyInAppStore.m149174c();
                Logger.m5865d("Finished migrating in-apps from account id to device id based preference.");
            }
        }
        if (m189901o(m189900m("ict_date", str), null) != null || m189901o("ict_date", null) == null) {
            return;
        }
        Logger.m5873v("Migrating InAppFC Prefs");
        mxf0.m156896v(this.f171385c, m189908w(m189900m("ict_date", str)), m189901o("ict_date", "20140428"));
        mxf0.m156894q(this.f171385c, m189908w(m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, str)), m189899l(m189908w(Constants.KEY_COUNTS_SHOWN_TODAY), 0));
    }

    /* JADX INFO: renamed from: w */
    private String m189908w(String str) {
        return str + ":" + m189896g();
    }

    /* JADX INFO: renamed from: d */
    public boolean m189909d(CTInAppNotification cTInAppNotification, Function2<JSONObject, String, Boolean> function2) {
        if (cTInAppNotification == null) {
            return false;
        }
        try {
            String strM189912j = m189912j(cTInAppNotification);
            if (strM189912j == null) {
                return true;
            }
            if (function2.invoke(cTInAppNotification.m6175s(), strM189912j).booleanValue()) {
                return false;
            }
            if (cTInAppNotification.getIsExcludeFromCaps()) {
                return true;
            }
            if (!m189904r(cTInAppNotification) && !m189903q(cTInAppNotification) && !m189902p(cTInAppNotification)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m189910e(String str) {
        this.f171387e.m194457a();
        this.f171386d = str;
        m189906t(str);
    }

    /* JADX INFO: renamed from: f */
    public void m189911f(final Context context, CTInAppNotification cTInAppNotification) {
        final String strM189912j = m189912j(cTInAppNotification);
        if (strM189912j == null) {
            return;
        }
        this.f171389g.m190589a().m6946g("recordInAppImpressionsAndCounts", new Callable() { // from class: l.qom
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tom.m189893a(this.f155602a, strM189912j, context);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public String m189912j(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification.getId() != null && !cTInAppNotification.getId().isEmpty()) {
            try {
                return cTInAppNotification.getId();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public JSONArray m189913k(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ?> entry : mxf0.m156888h(context, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, this.f171386d))).getAll().entrySet()) {
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
            Logger.m5876v("Failed to get in apps count", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m189914n() {
        return m189899l(m189900m(Constants.KEY_COUNTS_SHOWN_TODAY, this.f171386d), 0);
    }

    /* JADX INFO: renamed from: v */
    public void m189915v(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.has(Constants.INAPP_NOTIFS_STALE_KEY)) {
                JSONArray jSONArray = jSONObject.getJSONArray(Constants.INAPP_NOTIFS_STALE_KEY);
                SharedPreferences.Editor editorEdit = mxf0.m156888h(context, m189908w(m189900m(Constants.KEY_COUNTS_PER_INAPP, this.f171386d))).edit();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof Integer) {
                        editorEdit.remove("" + obj);
                        Logger.m5865d("Purged stale in-app - " + obj);
                    } else if (obj instanceof String) {
                        editorEdit.remove((String) obj);
                        Logger.m5865d("Purged stale in-app - " + obj);
                    }
                }
                mxf0.m156892l(editorEdit);
            }
        } catch (Throwable th) {
            Logger.m5876v("Failed to purge out stale targets", th);
        }
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m189916x(Context context, int i, int i2) {
        mxf0.m156894q(context, m189908w(m189900m(Constants.KEY_MAX_PER_DAY, this.f171386d)), i);
        mxf0.m156894q(context, m189908w(m189900m(Constants.INAPP_MAX_PER_SESSION_KEY, this.f171386d)), i2);
    }
}
