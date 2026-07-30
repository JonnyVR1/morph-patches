package p153l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class nvv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final xvw0 f143871a;

    /* JADX INFO: renamed from: b */
    public final Context f143872b;

    public nvv0(xvw0 xvw0Var, Context context) {
        this.f143871a = xvw0Var;
        this.f143872b = context;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fvv0 m164932a() throws Exception {
        boolean zIsActiveNetworkMetered;
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.f143872b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        bxy0.m106934r();
        int i2 = -1;
        if (C2098b.m12363b0(this.f143872b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f143872b.getSystemService("connectivity");
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
        return new fvv0(networkOperator, i, bxy0.m106935s().mo109059k(this.f143872b), phoneType, zIsActiveNetworkMetered, i2);
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 39;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f143871a.mo155969R(new Callable() { // from class: l.mvv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f138957a.m164932a();
            }
        });
    }
}
