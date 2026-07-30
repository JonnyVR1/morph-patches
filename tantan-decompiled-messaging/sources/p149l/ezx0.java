package p149l;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.measurement.internal.C2458g;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
@MainThread
@VisibleForTesting
public final class ezx0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2458g f93944a;

    public ezx0(C2458g c2458g) {
        this.f93944a = c2458g;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m119027a(ezx0 ezx0Var, boolean z, Uri uri, String str, String str2) {
        Bundle bundleM101502w;
        ezx0Var.f93944a.mo15092h();
        try {
            bey0 bey0VarMo15089e = ezx0Var.f93944a.mo15089e();
            boolean z2 = hey0.m130716a() && ezx0Var.f93944a.mo15085a().m192648n(q8s0.f153257U0);
            if (TextUtils.isEmpty(str2)) {
                bundleM101502w = null;
            } else if (str2.contains("gclid") || ((z2 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleM101502w = bey0VarMo15089e.m101502w(Uri.parse("https://google.com/search?".concat(str2)), z2);
                if (bundleM101502w != null) {
                    bundleM101502w.putString("_cis", "referrer");
                }
            } else {
                bey0VarMo15089e.zzj().m211424z().m123936a("Activity created with data 'referrer' without required params");
                bundleM101502w = null;
            }
            if (z) {
                Bundle bundleM101502w2 = ezx0Var.f93944a.mo15089e().m101502w(uri, hey0.m130716a() && ezx0Var.f93944a.mo15085a().m192648n(q8s0.f153257U0));
                if (bundleM101502w2 != null) {
                    bundleM101502w2.putString("_cis", "intent");
                    if (!bundleM101502w2.containsKey("gclid") && bundleM101502w != null && bundleM101502w.containsKey("gclid")) {
                        bundleM101502w2.putString("_cer", String.format("gclid=%s", bundleM101502w.getString("gclid")));
                    }
                    ezx0Var.f93944a.m15197V0(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM101502w2);
                    ezx0Var.f93944a.f10501q.m98201b(str, bundleM101502w2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            ezx0Var.f93944a.zzj().m211424z().m123937b("Activity created with referrer", str2);
            if (ezx0Var.f93944a.mo15085a().m192648n(q8s0.f153316r0)) {
                C2458g c2458g = ezx0Var.f93944a;
                if (bundleM101502w != null) {
                    c2458g.m15197V0(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM101502w);
                    ezx0Var.f93944a.f10501q.m98201b(str, bundleM101502w);
                } else {
                    c2458g.zzj().m211424z().m123937b("Referrer does not contain valid parameters", str2);
                }
                ezx0Var.f93944a.m15206c0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                ezx0Var.f93944a.zzj().m211424z().m123936a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                ezx0Var.f93944a.m15206c0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            ezx0Var.f93944a.zzj().m211412A().m123937b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        ezx0 ezx0Var;
        try {
            try {
                this.f93944a.zzj().m211416E().m123936a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.f93944a.mo15097m().m152644z(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (TextUtils.isEmpty(string)) {
                            data = null;
                        } else {
                            data = Uri.parse(string);
                        }
                    } else {
                        data = null;
                    }
                }
                Uri uri = data;
                if (uri == null || !uri.isHierarchical()) {
                    this.f93944a.mo15097m().m152644z(activity, bundle);
                    return;
                }
                this.f93944a.mo15089e();
                String str = bey0.m101439Z(intent) ? "gs" : "auto";
                String queryParameter = uri.getQueryParameter("referrer");
                ezx0Var = this;
                try {
                    this.f93944a.zzl().m146305w(new j0y0(ezx0Var, bundle == null, uri, str, queryParameter));
                    ezx0Var.f93944a.mo15097m().m152644z(activity, bundle);
                    return;
                } catch (RuntimeException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                this.f93944a.mo15097m().m152644z(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            ezx0Var = this;
        } catch (Throwable th2) {
            th = th2;
            this.f93944a.mo15097m().m152644z(activity, bundle);
            throw th;
        }
        ezx0Var.f93944a.zzj().m211412A().m123937b("Throwable caught in onActivityCreated", e);
        ezx0Var.f93944a.mo15097m().m152644z(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f93944a.mo15097m().m152643y(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f93944a.mo15097m().m152637K(activity);
        n8y0 n8y0VarMo15099o = this.f93944a.mo15099o();
        n8y0VarMo15099o.zzl().m146305w(new t8y0(n8y0VarMo15099o, n8y0VarMo15099o.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        n8y0 n8y0VarMo15099o = this.f93944a.mo15099o();
        n8y0VarMo15099o.zzl().m146305w(new w8y0(n8y0VarMo15099o, n8y0VarMo15099o.zzb().elapsedRealtime()));
        this.f93944a.mo15097m().m152639M(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f93944a.mo15097m().m152638L(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
