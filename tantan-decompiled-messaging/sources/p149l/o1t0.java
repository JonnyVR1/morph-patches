package p149l;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class o1t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f141475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n3t0 f141476b;

    public o1t0(p1t0 p1t0Var, Context context, n3t0 n3t0Var) {
        this.f141475a = context;
        this.f141476b = n3t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f141476b.m157774b(AdvertisingIdClient.getAdvertisingIdInfo(this.f141475a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f141476b.m157775c(e);
            x2t0.m206867e("Exception while getting advertising Id info", e);
        }
    }
}
