package p153l;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
@MainThread
@VisibleForTesting
public final class k8y0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2481g f124425a;

    public k8y0(C2481g c2481g) {
        this.f124425a = c2481g;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m148784a(k8y0 k8y0Var, boolean z, Uri uri, String str, String str2) {
        Bundle bundleM136367w;
        k8y0Var.f124425a.mo15146h();
        try {
            hny0 hny0VarMo15143e = k8y0Var.f124425a.mo15143e();
            boolean z2 = nny0.m164006a() && k8y0Var.f124425a.mo15139a().m98440n(whs0.f189233U0);
            if (TextUtils.isEmpty(str2)) {
                bundleM136367w = null;
            } else if (str2.contains("gclid") || ((z2 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleM136367w = hny0VarMo15143e.m136367w(Uri.parse("https://google.com/search?".concat(str2)), z2);
                if (bundleM136367w != null) {
                    bundleM136367w.putString("_cis", "referrer");
                }
            } else {
                hny0VarMo15143e.zzj().m114570z().m153300a("Activity created with data 'referrer' without required params");
                bundleM136367w = null;
            }
            if (z) {
                Bundle bundleM136367w2 = k8y0Var.f124425a.mo15143e().m136367w(uri, nny0.m164006a() && k8y0Var.f124425a.mo15139a().m98440n(whs0.f189233U0));
                if (bundleM136367w2 != null) {
                    bundleM136367w2.putString("_cis", "intent");
                    if (!bundleM136367w2.containsKey("gclid") && bundleM136367w != null && bundleM136367w.containsKey("gclid")) {
                        bundleM136367w2.putString("_cer", String.format("gclid=%s", bundleM136367w.getString("gclid")));
                    }
                    k8y0Var.f124425a.m15251V0(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM136367w2);
                    k8y0Var.f124425a.f10538q.m133035b(str, bundleM136367w2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            k8y0Var.f124425a.zzj().m114570z().m153301b("Activity created with referrer", str2);
            if (k8y0Var.f124425a.mo15139a().m98440n(whs0.f189292r0)) {
                C2481g c2481g = k8y0Var.f124425a;
                if (bundleM136367w != null) {
                    c2481g.m15251V0(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM136367w);
                    k8y0Var.f124425a.f10538q.m133035b(str, bundleM136367w);
                } else {
                    c2481g.zzj().m114570z().m153301b("Referrer does not contain valid parameters", str2);
                }
                k8y0Var.f124425a.m15260c0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                k8y0Var.f124425a.zzj().m114570z().m153300a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                k8y0Var.f124425a.m15260c0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e) {
            k8y0Var.f124425a.zzj().m114558A().m153301b("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        k8y0 k8y0Var;
        try {
            try {
                this.f124425a.zzj().m114562E().m153300a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.f124425a.mo15151m().m185293z(activity, bundle);
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
                    this.f124425a.mo15151m().m185293z(activity, bundle);
                    return;
                }
                this.f124425a.mo15143e();
                String str = hny0.m136306Z(intent) ? "gs" : "auto";
                String queryParameter = uri.getQueryParameter("referrer");
                k8y0Var = this;
                try {
                    this.f124425a.zzl().m177841w(new p9y0(k8y0Var, bundle == null, uri, str, queryParameter));
                    k8y0Var.f124425a.mo15151m().m185293z(activity, bundle);
                    return;
                } catch (RuntimeException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                this.f124425a.mo15151m().m185293z(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e2) {
            e = e2;
            k8y0Var = this;
        } catch (Throwable th2) {
            th = th2;
            this.f124425a.mo15151m().m185293z(activity, bundle);
            throw th;
        }
        k8y0Var.f124425a.zzj().m114558A().m153301b("Throwable caught in onActivityCreated", e);
        k8y0Var.f124425a.mo15151m().m185293z(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f124425a.mo15151m().m185292y(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f124425a.mo15151m().m185286K(activity);
        thy0 thy0VarMo15153o = this.f124425a.mo15153o();
        thy0VarMo15153o.zzl().m177841w(new zhy0(thy0VarMo15153o, thy0VarMo15153o.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        thy0 thy0VarMo15153o = this.f124425a.mo15153o();
        thy0VarMo15153o.zzl().m177841w(new ciy0(thy0VarMo15153o, thy0VarMo15153o.zzb().elapsedRealtime()));
        this.f124425a.mo15151m().m185288M(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f124425a.mo15151m().m185287L(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
