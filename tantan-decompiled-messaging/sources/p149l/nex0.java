package p149l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.C2461j;

/* JADX INFO: loaded from: classes6.dex */
public final class nex0 {

    /* JADX INFO: renamed from: a */
    public final ujx0 f138669a;

    public nex0(C2461j c2461j) {
        this.f138669a = c2461j.m15299o0();
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final Bundle m159132a(String str, bvs0 bvs0Var) {
        this.f138669a.zzl().mo15092h();
        if (bvs0Var == null) {
            this.f138669a.zzj().m211417F().m123936a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleZza = bvs0Var.zza(bundle);
            if (bundleZza != null) {
                return bundleZza;
            }
            this.f138669a.zzj().m211412A().m123936a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f138669a.zzj().m211412A().m123937b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final boolean m159133b() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.f138669a.zza());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f138669a.zzj().m211416E().m123936a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f138669a.zzj().m211416E().m123937b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
