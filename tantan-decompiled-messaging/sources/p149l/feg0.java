package p149l;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class feg0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f97129c = Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");

    /* JADX INFO: renamed from: a */
    public Boolean f97130a = null;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f97131b = null;

    /* JADX INFO: renamed from: a */
    public static int m121038a(int i, boolean z, tfg0 tfg0Var, String str) {
        String str2 = tfg0Var.f169977c;
        if (i == 412) {
            return 5;
        }
        if (!qlg0.m175481d(str2) && !qlg0.m175481d(str) && !str.equals(str2)) {
            return 4;
        }
        if (i == 201 && z) {
            return 6;
        }
        return (i == 205 && z) ? 7 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m121039b() throws UnknownHostException {
        if (this.f97130a == null) {
            this.f97130a = Boolean.valueOf(bog0.m102944a().f76522h.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (this.f97130a.booleanValue()) {
            if (this.f97131b == null) {
                this.f97131b = (ConnectivityManager) bog0.m102944a().f76522h.getApplicationContext().getSystemService("connectivity");
            }
            ConnectivityManager connectivityManager = this.f97131b;
            if (connectivityManager == null) {
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                throw new UnknownHostException("network is not available!");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m121040c(slg0 slg0Var) {
        if (this.f97130a == null) {
            this.f97130a = Boolean.valueOf(bog0.m102944a().f76522h.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        slg0Var.getClass();
    }
}
