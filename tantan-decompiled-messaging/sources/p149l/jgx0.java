package p149l;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class jgx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bvs0 f117857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnection f117858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ khx0 f117859c;

    public jgx0(khx0 khx0Var, bvs0 bvs0Var, ServiceConnection serviceConnection) {
        this.f117857a = bvs0Var;
        this.f117858b = serviceConnection;
        this.f117859c = khx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        khx0 khx0Var = this.f117859c;
        nex0 nex0Var = khx0Var.f123238b;
        String str = khx0Var.f123237a;
        bvs0 bvs0Var = this.f117857a;
        ServiceConnection serviceConnection = this.f117858b;
        Bundle bundleM159132a = nex0Var.m159132a(str, bvs0Var);
        nex0Var.f138669a.zzl().mo15092h();
        nex0Var.f138669a.m194111L();
        if (bundleM159132a != null) {
            long j = bundleM159132a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                nex0Var.f138669a.zzj().m211417F().m123936a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleM159132a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    nex0Var.f138669a.zzj().m211412A().m123936a("No referrer defined in Install Referrer response");
                } else {
                    nex0Var.f138669a.zzj().m211416E().m123937b("InstallReferrer API result", string);
                    boolean z = hey0.m130716a() && nex0Var.f138669a.m194128u().m192648n(q8s0.f153259V0);
                    Bundle bundleM101502w = nex0Var.f138669a.m194106G().m101502w(Uri.parse("?".concat(string)), z);
                    if (bundleM101502w == null) {
                        nex0Var.f138669a.zzj().m211412A().m123936a("No campaign params defined in Install Referrer result");
                    } else {
                        if (!z) {
                            String string2 = bundleM101502w.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j2 = bundleM159132a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j2 == 0) {
                                    nex0Var.f138669a.zzj().m211412A().m123936a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    bundleM101502w.putLong("click_timestamp", j2);
                                }
                            }
                        } else if (bundleM101502w.containsKey("gclid") || bundleM101502w.containsKey("gbraid")) {
                            long j3 = bundleM159132a.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j3 > 0) {
                                bundleM101502w.putLong("click_timestamp", j3);
                            }
                        }
                        if (j == nex0Var.f138669a.m194100A().f175520h.m187782a()) {
                            nex0Var.f138669a.zzj().m211416E().m123936a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (nex0Var.f138669a.m194118k()) {
                            nex0Var.f138669a.m194100A().f175520h.m187783b(j);
                            nex0Var.f138669a.zzj().m211416E().m123937b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleM101502w.putString("_cis", "referrer API v2");
                            nex0Var.f138669a.m194102C().m15203Z("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundleM101502w, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(nex0Var.f138669a.zza(), serviceConnection);
        }
    }
}
