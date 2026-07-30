package p153l;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class uat0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f178232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tct0 f178233b;

    public uat0(vat0 vat0Var, Context context, tct0 tct0Var) {
        this.f178232a = context;
        this.f178233b = tct0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f178233b.m190494b(AdvertisingIdClient.getAdvertisingIdInfo(this.f178232a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f178233b.m190495c(e);
            dct0.m115296e("Exception while getting advertising Id info", e);
        }
    }
}
