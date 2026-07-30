package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class cqm extends o85 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f82090b;

    /* JADX INFO: renamed from: c */
    private final r26 f82091c;

    /* JADX INFO: renamed from: d */
    private final boolean f82092d;

    /* JADX INFO: renamed from: e */
    private final Logger f82093e;

    /* JADX INFO: renamed from: f */
    private final zxf0 f82094f;

    /* JADX INFO: renamed from: g */
    private final chi0 f82095g;

    /* JADX INFO: renamed from: h */
    private final saj0 f82096h;

    /* JADX INFO: renamed from: i */
    private final qs9 f82097i;

    public cqm(CleverTapInstanceConfig cleverTapInstanceConfig, r26 r26Var, boolean z, zxf0 zxf0Var, saj0 saj0Var, chi0 chi0Var, qs9 qs9Var) {
        this.f82090b = cleverTapInstanceConfig;
        this.f82093e = cleverTapInstanceConfig.getLogger();
        this.f82091c = r26Var;
        this.f82092d = z;
        this.f82094f = zxf0Var;
        this.f82096h = saj0Var;
        this.f82097i = qs9Var;
        this.f82095g = chi0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m108280b(cqm cqmVar, List list) {
        cqmVar.f82091c.m177573h().m6271u(list);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m108281c(JSONArray jSONArray, vnm vnmVar, saj0 saj0Var) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            vnmVar.m199036b(strOptString);
            saj0Var.m183065e(strOptString);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m108282d(final List<JSONObject> list) {
        st3.m185849c(this.f82090b).m190593e(Constants.TAG_FEATURE_IN_APPS).m6946g("InAppResponse#processResponse", new Callable() { // from class: l.bqm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cqm.m108280b(this.f76791a, list);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m108283f(List<JSONObject> list) {
        InAppController inAppControllerM177573h = this.f82091c.m177573h();
        inAppControllerM177573h.m6266Z(list, false);
        this.f82093e.verbose(this.f82090b.getAccountId(), "InApp: scheduling " + list.size() + " delayed in-apps. Active delays: " + inAppControllerM177573h.m6256G());
    }

    @Override // p149l.n85
    /* JADX INFO: renamed from: a */
    public void mo98525a(JSONObject jSONObject, String str, Context context) {
        m108284e(jSONObject, str, context, false);
    }

    /* JADX INFO: renamed from: e */
    public void m108284e(JSONObject jSONObject, String str, Context context, boolean z) {
        try {
            if (this.f82090b.isAnalyticsOnly()) {
                this.f82093e.verbose(this.f82090b.getAccountId(), "CleverTap instance is configured to analytics only, not processing inapp messages");
                return;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                dqm dqmVar = new dqm(jSONObject, this.f82095g);
                vnm impressionStore = this.f82094f.getImpressionStore();
                iqm inAppStore = this.f82094f.getInAppStore();
                aom inAppAssetsStore = this.f82094f.getInAppAssetsStore();
                dhi filesStore = this.f82094f.getFilesStore();
                lar legacyInAppStore = this.f82094f.getLegacyInAppStore();
                if (impressionStore != null && inAppStore != null && inAppAssetsStore != null && legacyInAppStore != null && filesStore != null) {
                    this.f82093e.verbose(this.f82090b.getAccountId(), "InApp: Processing response");
                    int inAppsPerSession = dqmVar.getInAppsPerSession();
                    int inAppsPerDay = dqmVar.getInAppsPerDay();
                    if (this.f82092d || this.f82091c.m177574i() == null) {
                        this.f82093e.verbose(this.f82090b.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
                    } else {
                        Logger.m5873v("Updating InAppFC Limits");
                        this.f82091c.m177574i().m189916x(context, inAppsPerDay, inAppsPerSession);
                        this.f82091c.m177574i().m189915v(context, jSONObject);
                    }
                    Pair<Boolean, JSONArray> pairM113096n = dqmVar.m113096n();
                    if (pairM113096n.getFirst().booleanValue()) {
                        m108281c(pairM113096n.getSecond(), impressionStore, this.f82096h);
                    }
                    String inAppMode = dqmVar.getInAppMode();
                    if (!inAppMode.isEmpty()) {
                        inAppStore.m137774o(inAppMode);
                    }
                    if (z) {
                        return;
                    }
                    qee.C19471a partitionedLegacyInApps = dqmVar.getPartitionedLegacyInApps();
                    if (partitionedLegacyInApps.m174195d()) {
                        m108282d(partitionedLegacyInApps.m174193b());
                    }
                    if (partitionedLegacyInApps.m174194c()) {
                        m108283f(partitionedLegacyInApps.m174192a());
                    }
                    qee.C19472b partitionedLegacyMetaInApps = dqmVar.getPartitionedLegacyMetaInApps();
                    if (partitionedLegacyMetaInApps.m174198b()) {
                        this.f82091c.m177573h().m6268b0(partitionedLegacyMetaInApps.m174197a());
                    }
                    qee.C19471a partitionedAppLaunchServerSideInApps = dqmVar.getPartitionedAppLaunchServerSideInApps();
                    if (partitionedAppLaunchServerSideInApps.m174195d()) {
                        this.f82091c.m177573h().m6259P(partitionedAppLaunchServerSideInApps.m174193b(), this.f82097i.m176218p());
                    }
                    if (partitionedAppLaunchServerSideInApps.m174194c()) {
                        this.f82091c.m177573h().m6258O(partitionedAppLaunchServerSideInApps.m174192a(), this.f82097i.m176218p());
                    }
                    qee.C19472b partitionedAppLaunchServerSideMetaInApps = dqmVar.getPartitionedAppLaunchServerSideMetaInApps();
                    if (partitionedAppLaunchServerSideMetaInApps.m174198b()) {
                        this.f82091c.m177573h().m6260Q(partitionedAppLaunchServerSideMetaInApps.m174197a(), this.f82097i.m176218p());
                    }
                    qee.C19471a partitionedClientSideInApps = dqmVar.getPartitionedClientSideInApps();
                    if (partitionedClientSideInApps.m174195d()) {
                        inAppStore.m137776q(partitionedClientSideInApps.m174193b());
                    }
                    if (partitionedClientSideInApps.m174194c()) {
                        inAppStore.m137775p(partitionedClientSideInApps.m174192a());
                    }
                    qee.C19473c partitionedServerSideInAppsMeta = dqmVar.getPartitionedServerSideInAppsMeta();
                    if (partitionedServerSideInAppsMeta.m174202d()) {
                        inAppStore.m137780u(partitionedServerSideInAppsMeta.m174200b());
                    }
                    if (partitionedServerSideInAppsMeta.m174201c()) {
                        inAppStore.m137778s(partitionedServerSideInAppsMeta.m174199a());
                    }
                    List<Pair<String, CtCacheType>> listM113095m = dqmVar.m113095m();
                    ygi ygiVarM184083a = sgi.m184083a(context, this.f82093e, this.f82094f);
                    if (!listM113095m.isEmpty()) {
                        ygiVarM184083a.m214722n(listM113095m);
                    }
                    boolean z2 = this.f137582a;
                    Logger logger = this.f82093e;
                    if (!z2) {
                        logger.verbose(this.f82090b.getAccountId(), "Ignoring cache eviction");
                        return;
                    } else {
                        logger.verbose(this.f82090b.getAccountId(), "Handling cache eviction");
                        ygiVarM184083a.m214719i(dqmVar.m113094l());
                        return;
                    }
                }
                this.f82093e.verbose(this.f82090b.getAccountId(), "Stores are not initialised, ignoring inapps!!!!");
                return;
            }
            this.f82093e.verbose(this.f82090b.getAccountId(), "There is no inapps data to handle");
        } catch (Throwable th) {
            Logger.m5876v("InAppManager: Failed to parse response", th);
        }
    }
}
