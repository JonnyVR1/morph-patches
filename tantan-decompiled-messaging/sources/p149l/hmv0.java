package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class hmv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final rmw0 f108480a;

    /* JADX INFO: renamed from: b */
    public final Context f108481b;

    public hmv0(rmw0 rmw0Var, Context context) {
        this.f108480a = rmw0Var;
        this.f108481b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zlv0 m131759a() throws Exception {
        boolean zIsActiveNetworkMetered;
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.f108481b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        vny0.m199080r();
        int i2 = -1;
        if (C2075b.m12309b0(this.f108481b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f108481b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = iOrdinal;
            } else {
                i = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i = -2;
        }
        return new zlv0(networkOperator, i, vny0.m199081s().mo109120k(this.f108481b), phoneType, zIsActiveNetworkMetered, i2);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 39;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f108480a.mo122102R(new Callable() { // from class: l.gmv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f103522a.m131759a();
            }
        });
    }
}
