package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.ArrayList;
import p000B.Sudif;

/* JADX INFO: loaded from: classes.dex */
public final class bhg0 {

    /* JADX INFO: renamed from: f */
    public static final bhg0 f75610f = new bhg0();

    /* JADX INFO: renamed from: b */
    public Context f75612b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f75611a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final fbg0 f75613c = new fbg0(this);

    /* JADX INFO: renamed from: d */
    public boolean f75614d = false;

    /* JADX INFO: renamed from: e */
    public final Sudif f75615e = new Sudif(this);

    /* JADX INFO: renamed from: a */
    public static int m101834a(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return 1;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return 2;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m101835b(Context context) {
        if (this.f75614d) {
            return;
        }
        this.f75612b = context;
        try {
            ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).registerDefaultNetworkCallback(this.f75613c);
            this.f75614d = true;
        } catch (Exception unused) {
        }
    }
}
