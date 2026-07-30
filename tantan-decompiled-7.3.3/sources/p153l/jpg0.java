package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.ArrayList;
import p001B.Sudif;

/* JADX INFO: loaded from: classes.dex */
public final class jpg0 {

    /* JADX INFO: renamed from: f */
    public static final jpg0 f122099f = new jpg0();

    /* JADX INFO: renamed from: b */
    public Context f122101b;

    /* JADX INFO: renamed from: a */
    public final ArrayList f122100a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final njg0 f122102c = new njg0(this);

    /* JADX INFO: renamed from: d */
    public boolean f122103d = false;

    /* JADX INFO: renamed from: e */
    public final Sudif f122104e = new Sudif(this);

    /* JADX INFO: renamed from: a */
    public static int m146497a(Context context) {
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
    public final void m146498b(Context context) {
        if (this.f122103d) {
            return;
        }
        this.f122101b = context;
        try {
            ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).registerDefaultNetworkCallback(this.f122102c);
            this.f122103d = true;
        } catch (Exception unused) {
        }
    }
}
