package p153l;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class l6t0 extends aas0 {

    /* JADX INFO: renamed from: c */
    public final Context f130288c;

    public l6t0(Context context) {
        this.f130288c = context;
    }

    @Override // p153l.aas0
    /* JADX INFO: renamed from: a */
    public final void mo96666a() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f130288c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            dct0.m115296e("Fail to get isAdIdFakeForDebugLogging", e);
            isAdIdFakeForDebugLogging = false;
        }
        cct0.m109066j(isAdIdFakeForDebugLogging);
        dct0.m115298g("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
