package p153l;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.C2484j;

/* JADX INFO: loaded from: classes6.dex */
public final class tnx0 {

    /* JADX INFO: renamed from: a */
    public final atx0 f175337a;

    public tnx0(C2484j c2484j) {
        this.f175337a = c2484j.m15353o0();
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final Bundle m191999a(String str, h4t0 h4t0Var) {
        this.f175337a.zzl().mo15146h();
        if (h4t0Var == null) {
            this.f175337a.zzj().m114563F().m153300a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle bundleZza = h4t0Var.zza(bundle);
            if (bundleZza != null) {
                return bundleZza;
            }
            this.f175337a.zzj().m114558A().m153300a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f175337a.zzj().m114558A().m153301b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final boolean m192000b() {
        try {
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(this.f175337a.zza());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f175337a.zzj().m114562E().m153300a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.f175337a.zzj().m114562E().m153301b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
