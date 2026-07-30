package p153l;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class ppx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h4t0 f153606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnection f153607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qqx0 f153608c;

    public ppx0(qqx0 qqx0Var, h4t0 h4t0Var, ServiceConnection serviceConnection) {
        this.f153606a = h4t0Var;
        this.f153607b = serviceConnection;
        this.f153608c = qqx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qqx0 qqx0Var = this.f153608c;
        tnx0 tnx0Var = qqx0Var.f159055b;
        String str = qqx0Var.f159054a;
        h4t0 h4t0Var = this.f153606a;
        ServiceConnection serviceConnection = this.f153607b;
        Bundle bundleM191999a = tnx0Var.m191999a(str, h4t0Var);
        tnx0Var.f175337a.zzl().mo15146h();
        tnx0Var.f175337a.m100291L();
        if (bundleM191999a != null) {
            long j = bundleM191999a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                tnx0Var.f175337a.zzj().m114563F().m153300a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleM191999a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    tnx0Var.f175337a.zzj().m114558A().m153300a("No referrer defined in Install Referrer response");
                } else {
                    tnx0Var.f175337a.zzj().m114562E().m153301b("InstallReferrer API result", string);
                    boolean z = nny0.m164006a() && tnx0Var.f175337a.m100308u().m98440n(whs0.f189235V0);
                    Bundle bundleM136367w = tnx0Var.f175337a.m100286G().m136367w(Uri.parse("?".concat(string)), z);
                    if (bundleM136367w == null) {
                        tnx0Var.f175337a.zzj().m114558A().m153300a("No campaign params defined in Install Referrer result");
                    } else {
                        if (!z) {
                            String string2 = bundleM136367w.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j2 = bundleM191999a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j2 == 0) {
                                    tnx0Var.f175337a.zzj().m114558A().m153300a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    bundleM136367w.putLong("click_timestamp", j2);
                                }
                            }
                        } else if (bundleM136367w.containsKey("gclid") || bundleM136367w.containsKey("gbraid")) {
                            long j3 = bundleM191999a.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j3 > 0) {
                                bundleM136367w.putLong("click_timestamp", j3);
                            }
                        }
                        if (j == tnx0Var.f175337a.m100280A().f71901h.m219990a()) {
                            tnx0Var.f175337a.zzj().m114562E().m153300a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (tnx0Var.f175337a.m100298k()) {
                            tnx0Var.f175337a.m100280A().f71901h.m219991b(j);
                            tnx0Var.f175337a.zzj().m114562E().m153301b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleM136367w.putString("_cis", "referrer API v2");
                            tnx0Var.f175337a.m100282C().m15257Z("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM136367w, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(tnx0Var.f175337a.zza(), serviceConnection);
        }
    }
}
