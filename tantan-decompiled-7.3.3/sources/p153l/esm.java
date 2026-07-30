package p153l;

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
public class esm extends p95 {

    /* JADX INFO: renamed from: b */
    private final CleverTapInstanceConfig f95635b;

    /* JADX INFO: renamed from: c */
    private final w36 f95636c;

    /* JADX INFO: renamed from: d */
    private final boolean f95637d;

    /* JADX INFO: renamed from: e */
    private final Logger f95638e;

    /* JADX INFO: renamed from: f */
    private final h6g0 f95639f;

    /* JADX INFO: renamed from: g */
    private final cqi0 f95640g;

    /* JADX INFO: renamed from: h */
    private final wjj0 f95641h;

    /* JADX INFO: renamed from: i */
    private final bu9 f95642i;

    public esm(CleverTapInstanceConfig cleverTapInstanceConfig, w36 w36Var, boolean z, h6g0 h6g0Var, wjj0 wjj0Var, cqi0 cqi0Var, bu9 bu9Var) {
        this.f95635b = cleverTapInstanceConfig;
        this.f95638e = cleverTapInstanceConfig.getLogger();
        this.f95636c = w36Var;
        this.f95637d = z;
        this.f95639f = h6g0Var;
        this.f95641h = wjj0Var;
        this.f95642i = bu9Var;
        this.f95640g = cqi0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m122382b(esm esmVar, List list) {
        esmVar.f95636c.m204745h().m6325u(list);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private void m122383c(JSONArray jSONArray, xpm xpmVar, wjj0 wjj0Var) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            xpmVar.m212661b(strOptString);
            wjj0Var.m206689e(strOptString);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m122384d(final List<JSONObject> list) {
        ru3.m183186c(this.f95635b).m187991e(Constants.TAG_FEATURE_IN_APPS).m7000g("InAppResponse#processResponse", new Callable() { // from class: l.dsm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return esm.m122382b(this.f90496a, list);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    private void m122385f(List<JSONObject> list) {
        InAppController inAppControllerM204745h = this.f95636c.m204745h();
        inAppControllerM204745h.m6320Z(list, false);
        this.f95638e.verbose(this.f95635b.getAccountId(), "InApp: scheduling " + list.size() + " delayed in-apps. Active delays: " + inAppControllerM204745h.m6310G());
    }

    @Override // p153l.o95
    /* JADX INFO: renamed from: a */
    public void mo98656a(JSONObject jSONObject, String str, Context context) {
        m122386e(jSONObject, str, context, false);
    }

    /* JADX INFO: renamed from: e */
    public void m122386e(JSONObject jSONObject, String str, Context context, boolean z) {
        try {
            if (this.f95635b.isAnalyticsOnly()) {
                this.f95638e.verbose(this.f95635b.getAccountId(), "CleverTap instance is configured to analytics only, not processing inapp messages");
                return;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                fsm fsmVar = new fsm(jSONObject, this.f95640g);
                xpm impressionStore = this.f95639f.getImpressionStore();
                ksm inAppStore = this.f95639f.getInAppStore();
                cqm inAppAssetsStore = this.f95639f.getInAppAssetsStore();
                aki filesStore = this.f95639f.getFilesStore();
                ncr legacyInAppStore = this.f95639f.getLegacyInAppStore();
                if (impressionStore != null && inAppStore != null && inAppAssetsStore != null && legacyInAppStore != null && filesStore != null) {
                    this.f95638e.verbose(this.f95635b.getAccountId(), "InApp: Processing response");
                    int inAppsPerSession = fsmVar.getInAppsPerSession();
                    int inAppsPerDay = fsmVar.getInAppsPerDay();
                    if (this.f95637d || this.f95636c.m204746i() == null) {
                        this.f95638e.verbose(this.f95635b.getAccountId(), "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
                    } else {
                        Logger.m5927v("Updating InAppFC Limits");
                        this.f95636c.m204746i().m202408x(context, inAppsPerDay, inAppsPerSession);
                        this.f95636c.m204746i().m202407v(context, jSONObject);
                    }
                    Pair<Boolean, JSONArray> pairM127223n = fsmVar.m127223n();
                    if (pairM127223n.getFirst().booleanValue()) {
                        m122383c(pairM127223n.getSecond(), impressionStore, this.f95641h);
                    }
                    String inAppMode = fsmVar.getInAppMode();
                    if (!inAppMode.isEmpty()) {
                        inAppStore.m151264o(inAppMode);
                    }
                    if (z) {
                        return;
                    }
                    ufe.C20557a partitionedLegacyInApps = fsmVar.getPartitionedLegacyInApps();
                    if (partitionedLegacyInApps.m195831d()) {
                        m122384d(partitionedLegacyInApps.m195829b());
                    }
                    if (partitionedLegacyInApps.m195830c()) {
                        m122385f(partitionedLegacyInApps.m195828a());
                    }
                    ufe.C20558b partitionedLegacyMetaInApps = fsmVar.getPartitionedLegacyMetaInApps();
                    if (partitionedLegacyMetaInApps.m195834b()) {
                        this.f95636c.m204745h().m6322b0(partitionedLegacyMetaInApps.m195833a());
                    }
                    ufe.C20557a partitionedAppLaunchServerSideInApps = fsmVar.getPartitionedAppLaunchServerSideInApps();
                    if (partitionedAppLaunchServerSideInApps.m195831d()) {
                        this.f95636c.m204745h().m6313P(partitionedAppLaunchServerSideInApps.m195829b(), this.f95642i.m106485p());
                    }
                    if (partitionedAppLaunchServerSideInApps.m195830c()) {
                        this.f95636c.m204745h().m6312O(partitionedAppLaunchServerSideInApps.m195828a(), this.f95642i.m106485p());
                    }
                    ufe.C20558b partitionedAppLaunchServerSideMetaInApps = fsmVar.getPartitionedAppLaunchServerSideMetaInApps();
                    if (partitionedAppLaunchServerSideMetaInApps.m195834b()) {
                        this.f95636c.m204745h().m6314Q(partitionedAppLaunchServerSideMetaInApps.m195833a(), this.f95642i.m106485p());
                    }
                    ufe.C20557a partitionedClientSideInApps = fsmVar.getPartitionedClientSideInApps();
                    if (partitionedClientSideInApps.m195831d()) {
                        inAppStore.m151266q(partitionedClientSideInApps.m195829b());
                    }
                    if (partitionedClientSideInApps.m195830c()) {
                        inAppStore.m151265p(partitionedClientSideInApps.m195828a());
                    }
                    ufe.C20559c partitionedServerSideInAppsMeta = fsmVar.getPartitionedServerSideInAppsMeta();
                    if (partitionedServerSideInAppsMeta.m195838d()) {
                        inAppStore.m151270u(partitionedServerSideInAppsMeta.m195836b());
                    }
                    if (partitionedServerSideInAppsMeta.m195837c()) {
                        inAppStore.m151268s(partitionedServerSideInAppsMeta.m195835a());
                    }
                    List<Pair<String, CtCacheType>> listM127222m = fsmVar.m127222m();
                    vji vjiVarM172492a = pji.m172492a(context, this.f95638e, this.f95639f);
                    if (!listM127222m.isEmpty()) {
                        vjiVarM172492a.m201519n(listM127222m);
                    }
                    boolean z2 = this.f145495a;
                    Logger logger = this.f95638e;
                    if (!z2) {
                        logger.verbose(this.f95635b.getAccountId(), "Ignoring cache eviction");
                        return;
                    } else {
                        logger.verbose(this.f95635b.getAccountId(), "Handling cache eviction");
                        vjiVarM172492a.m201516i(fsmVar.m127221l());
                        return;
                    }
                }
                this.f95638e.verbose(this.f95635b.getAccountId(), "Stores are not initialised, ignoring inapps!!!!");
                return;
            }
            this.f95638e.verbose(this.f95635b.getAccountId(), "There is no inapps data to handle");
        } catch (Throwable th) {
            Logger.m5930v("InAppManager: Failed to parse response", th);
        }
    }
}
