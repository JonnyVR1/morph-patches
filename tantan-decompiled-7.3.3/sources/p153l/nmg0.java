package p153l;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class nmg0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f142704c = Pattern.compile(".*\\\\|/([^\\\\|/|?]*)\\??");

    /* JADX INFO: renamed from: a */
    public Boolean f142705a = null;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f142706b = null;

    /* JADX INFO: renamed from: a */
    public static int m163816a(int i, boolean z, bog0 bog0Var, String str) {
        String str2 = bog0Var.f77676c;
        if (i == 412) {
            return 5;
        }
        if (!ytg0.m217312d(str2) && !ytg0.m217312d(str) && !str.equals(str2)) {
            return 4;
        }
        if (i == 201 && z) {
            return 6;
        }
        return (i == 205 && z) ? 7 : 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m163817b() throws UnknownHostException {
        if (this.f142705a == null) {
            this.f142705a = Boolean.valueOf(jwg0.m147162a().f122926h.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (this.f142705a.booleanValue()) {
            if (this.f142706b == null) {
                this.f142706b = (ConnectivityManager) jwg0.m147162a().f122926h.getApplicationContext().getSystemService("connectivity");
            }
            ConnectivityManager connectivityManager = this.f142706b;
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
    public final void m163818c(aug0 aug0Var) {
        if (this.f142705a == null) {
            this.f142705a = Boolean.valueOf(jwg0.m147162a().f122926h.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        aug0Var.getClass();
    }
}
